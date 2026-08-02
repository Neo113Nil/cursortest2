package io.appmetrica.analytics.networktasks.impl;

import android.text.TextUtils;
import defpackage.evu0;
import defpackage.jl40;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.network.internal.NetworkClientBuilder;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkapi.Request;
import io.appmetrica.analytics.networkapi.Response;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes9.dex */
public final class h implements Runnable {
    public final NetworkTask a;
    public final InterruptionSafeThread b;
    public final f c;

    public h(NetworkTask networkTask, InterruptionSafeThread interruptionSafeThread, f fVar) {
        this.a = networkTask;
        this.b = interruptionSafeThread;
        this.c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        byte[] postData;
        ExponentialBackoffPolicy exponentialBackoffPolicy = this.a.getExponentialBackoffPolicy();
        boolean canBeExecuted = this.a.getConnectionExecutionPolicy().canBeExecuted();
        boolean canBeExecuted2 = this.a.getExponentialBackoffPolicy().canBeExecuted(this.a.getRetryPolicyConfig());
        if (!this.b.isRunning() || !canBeExecuted || !canBeExecuted2) {
            this.a.onShouldNotExecute();
            return;
        }
        boolean onCreateNetworkTask = this.a.onCreateNetworkTask();
        Boolean bool = null;
        while (this.b.isRunning() && onCreateNetworkTask && exponentialBackoffPolicy.canBeExecuted(this.a.getRetryPolicyConfig())) {
            f fVar = this.c;
            NetworkTask networkTask = this.a;
            fVar.getClass();
            boolean z2 = false;
            if (networkTask.onPerformRequest()) {
                String url = networkTask.getUrl();
                if (url == null || TextUtils.isEmpty(evu0.k0(url).toString())) {
                    StringBuilder sb = new StringBuilder("Task ");
                    sb.append(networkTask.description());
                    sb.append(" url is `");
                    sb.append(url);
                    sb.append("`. All hosts = ");
                    List<String> allHosts = networkTask.getUnderlyingTask().getFullUrlFormer().getAllHosts();
                    sb.append(allHosts != null ? allHosts.toString() : null);
                    networkTask.onRequestError(new IllegalArgumentException(sb.toString()));
                } else {
                    Request.Builder addHeader = new Request.Builder(url).addHeader(GlideBitmapDownloader.ACCEPT_HEADER, "application/json").addHeader(ExtFunctionsKt.HEADER_USER_AGENT, networkTask.getUserAgent());
                    RequestDataHolder requestDataHolder = networkTask.getRequestDataHolder();
                    Iterator<T> it = requestDataHolder.getHeaders().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        addHeader.addHeader((String) entry.getKey(), kotlin.collections.a.X((Iterable) entry.getValue(), ",", null, null, null, 62));
                    }
                    if (NetworkTask.Method.POST == requestDataHolder.getMethod() && (postData = requestDataHolder.getPostData()) != null) {
                        if (!(postData.length == 0)) {
                            addHeader.withMethod(Request.Method.POST);
                            addHeader.withBody(postData);
                            Long sendTimestamp = requestDataHolder.getSendTimestamp();
                            if (sendTimestamp != null) {
                                addHeader.addHeader("Send-Timestamp", String.valueOf(sendTimestamp.longValue() / 1000));
                            }
                            Integer sendTimezoneSec = requestDataHolder.getSendTimezoneSec();
                            if (sendTimezoneSec != null) {
                                addHeader.addHeader("Send-Timezone", String.valueOf(sendTimezoneSec.intValue()));
                            }
                        }
                    }
                    NetworkClientBuilder networkClientBuilder = new NetworkClientBuilder();
                    NetworkClientSettings.Builder builder = new NetworkClientSettings.Builder();
                    int i = b.a;
                    Response execute = networkClientBuilder.withSettings(builder.withConnectTimeout(i).withReadTimeout(i).withSslSocketFactory(networkTask.getSslSocketFactory()).build()).build().newCall(addHeader.build()).execute();
                    int code = execute.getCode();
                    ResponseDataHolder responseDataHolder = networkTask.getResponseDataHolder();
                    responseDataHolder.setResponseCode(code);
                    responseDataHolder.setResponseHeaders(CollectionUtils.convertMapKeysToLowerCase(execute.getHeaders()));
                    if (responseDataHolder.isValidResponse()) {
                        responseDataHolder.setResponseData(execute.getResponseData());
                    }
                    if (execute.getIsCompleted()) {
                        z = networkTask.onRequestComplete();
                        bool = Boolean.valueOf(z);
                        if (!z && this.a.shouldTryNextHost()) {
                            z2 = true;
                        }
                        exponentialBackoffPolicy.onHostAttemptFinished(z);
                        onCreateNetworkTask = z2;
                    } else {
                        networkTask.onRequestError(execute.getIo.appmetrica.analytics.rtm.internal.Constants.KEY_EXCEPTION java.lang.String());
                    }
                }
            } else {
                networkTask.onRequestError(null);
            }
            z = false;
            bool = Boolean.valueOf(z);
            if (!z) {
                z2 = true;
            }
            exponentialBackoffPolicy.onHostAttemptFinished(z);
            onCreateNetworkTask = z2;
        }
        exponentialBackoffPolicy.onAllHostsAttemptsFinished(jl40.l(bool, Boolean.TRUE));
    }
}
