package io.appmetrica.analytics.networktasks.impl;

import android.text.TextUtils;
import i1.AbstractC0252i;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
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
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkTask f7463a;

    /* renamed from: b, reason: collision with root package name */
    public final InterruptionSafeThread f7464b;

    /* renamed from: c, reason: collision with root package name */
    public final f f7465c;

    public h(NetworkTask networkTask, InterruptionSafeThread interruptionSafeThread, f fVar) {
        this.f7463a = networkTask;
        this.f7464b = interruptionSafeThread;
        this.f7465c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        byte[] postData;
        ExponentialBackoffPolicy exponentialBackoffPolicy = this.f7463a.getExponentialBackoffPolicy();
        boolean canBeExecuted = this.f7463a.getConnectionExecutionPolicy().canBeExecuted();
        boolean canBeExecuted2 = this.f7463a.getExponentialBackoffPolicy().canBeExecuted(this.f7463a.getRetryPolicyConfig());
        if (!this.f7464b.isRunning() || !canBeExecuted || !canBeExecuted2) {
            this.f7463a.onShouldNotExecute();
            return;
        }
        boolean onCreateNetworkTask = this.f7463a.onCreateNetworkTask();
        Boolean bool = null;
        while (this.f7464b.isRunning() && onCreateNetworkTask && exponentialBackoffPolicy.canBeExecuted(this.f7463a.getRetryPolicyConfig())) {
            f fVar = this.f7465c;
            NetworkTask networkTask = this.f7463a;
            fVar.getClass();
            boolean z3 = false;
            if (networkTask.onPerformRequest()) {
                String url = networkTask.getUrl();
                if (url == null || TextUtils.isEmpty(z1.g.k0(url).toString())) {
                    StringBuilder sb = new StringBuilder("Task ");
                    sb.append(networkTask.description());
                    sb.append(" url is `");
                    sb.append(url);
                    sb.append("`. All hosts = ");
                    List<String> allHosts = networkTask.getUnderlyingTask().getFullUrlFormer().getAllHosts();
                    sb.append(allHosts != null ? allHosts.toString() : null);
                    networkTask.onRequestError(new IllegalArgumentException(sb.toString()));
                } else {
                    Request.Builder addHeader = new Request.Builder(url).addHeader("Accept", "application/json").addHeader("User-Agent", networkTask.getUserAgent());
                    RequestDataHolder requestDataHolder = networkTask.getRequestDataHolder();
                    Iterator<T> it = requestDataHolder.getHeaders().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        addHeader.addHeader((String) entry.getKey(), AbstractC0252i.K((Iterable) entry.getValue(), StringUtils.COMMA, null, null, null, 62));
                    }
                    if (NetworkTask.Method.POST == requestDataHolder.getMethod() && (postData = requestDataHolder.getPostData()) != null) {
                        if (!(postData.length == 0)) {
                            addHeader.withMethod(Request.Method.POST);
                            addHeader.withBody(postData);
                            Long sendTimestamp = requestDataHolder.getSendTimestamp();
                            if (sendTimestamp != null) {
                                addHeader.addHeader("Send-Timestamp", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(sendTimestamp.longValue())));
                            }
                            Integer sendTimezoneSec = requestDataHolder.getSendTimezoneSec();
                            if (sendTimezoneSec != null) {
                                addHeader.addHeader("Send-Timezone", String.valueOf(sendTimezoneSec.intValue()));
                            }
                        }
                    }
                    NetworkClientBuilder networkClientBuilder = new NetworkClientBuilder();
                    NetworkClientSettings.Builder builder = new NetworkClientSettings.Builder();
                    int i2 = b.f7459a;
                    Response execute = networkClientBuilder.withSettings(builder.withConnectTimeout(i2).withReadTimeout(i2).withSslSocketFactory(networkTask.getSslSocketFactory()).build()).build().newCall(addHeader.build()).execute();
                    int code = execute.getCode();
                    ResponseDataHolder responseDataHolder = networkTask.getResponseDataHolder();
                    responseDataHolder.setResponseCode(code);
                    responseDataHolder.setResponseHeaders(CollectionUtils.convertMapKeysToLowerCase(execute.getHeaders()));
                    if (responseDataHolder.isValidResponse()) {
                        responseDataHolder.setResponseData(execute.getResponseData());
                    }
                    if (execute.isCompleted()) {
                        z2 = networkTask.onRequestComplete();
                        bool = Boolean.valueOf(z2);
                        if (!z2 && this.f7463a.shouldTryNextHost()) {
                            z3 = true;
                        }
                        exponentialBackoffPolicy.onHostAttemptFinished(z2);
                        onCreateNetworkTask = z3;
                    } else {
                        networkTask.onRequestError(execute.getException());
                    }
                }
            } else {
                networkTask.onRequestError(null);
            }
            z2 = false;
            bool = Boolean.valueOf(z2);
            if (!z2) {
                z3 = true;
            }
            exponentialBackoffPolicy.onHostAttemptFinished(z2);
            onCreateNetworkTask = z3;
        }
        exponentialBackoffPolicy.onAllHostsAttemptsFinished(i.a(bool, Boolean.TRUE));
    }
}
