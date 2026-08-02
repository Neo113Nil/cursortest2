package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseParser;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import javax.net.ssl.SSLSocketFactory;
import ru.yandex.common.network.Request;

/* loaded from: classes9.dex */
public final class R8 implements UnderlyingNetworkTask {
    public final ConfigProvider a;
    public final K6 b;
    public final C0545mo c;
    public final SystemTimeProvider d = new SystemTimeProvider();
    public final GZIPCompressor e = new GZIPCompressor();
    public final String f = R8.class.getName() + "@" + Integer.toHexString(hashCode());
    public final as g;
    public final FullUrlFormer h;
    public final RequestDataHolder i;
    public final ResponseDataHolder j;
    public final NetworkResponseHandler k;

    public R8(ConfigProvider<U8> configProvider, K6 k6, C0545mo c0545mo, as asVar, NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, FullUrlFormer<U8> fullUrlFormer) {
        this.a = configProvider;
        this.b = k6;
        this.c = c0545mo;
        this.g = asVar;
        this.i = requestDataHolder;
        this.j = responseDataHolder;
        this.k = networkResponseHandler;
        this.h = fullUrlFormer;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return this.f;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.h;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.i;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.j;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        return Jb.I.z().getSslSocketFactory();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        byte[] bArr;
        U8 u8 = (U8) this.a.getConfig();
        boolean isIdentifiersValid = u8.isIdentifiersValid();
        boolean a = Or.a((Collection) u8.d);
        if (!isIdentifiersValid || a) {
            return false;
        }
        this.h.setHosts(u8.d);
        K6 k6 = this.b;
        C0545mo c0545mo = this.c;
        as asVar = this.g;
        C0663qq c0663qq = new C0663qq(1024, "diagnostic event name", PublicLogger.getAnonymousInstance());
        C0663qq c0663qq2 = new C0663qq(204800, "diagnostic event value", PublicLogger.getAnonymousInstance());
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        C0878ya c0878ya = new C0878ya();
        C0791va c0791va = new C0791va();
        c0878ya.a = new C0791va[]{c0791va};
        if (c0545mo.a == null) {
            c0545mo.a = Long.valueOf(c0545mo.c.currentTimeSeconds());
        }
        long longValue = c0545mo.a.longValue();
        long longValue2 = c0545mo.a.longValue();
        int i = c0545mo.b;
        c0545mo.b = i + 1;
        c0791va.a = longValue;
        C0762ua c0762ua = new C0762ua();
        c0791va.b = c0762ua;
        c0762ua.c = 2;
        c0762ua.a = new C0849xa();
        C0849xa c0849xa = c0791va.b.a;
        c0849xa.a = longValue2;
        c0849xa.b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(1000 * longValue2) / 1000;
        c0791va.b.b = u8.getLocale();
        C0733ta c0733ta = new C0733ta();
        c0791va.c = new C0733ta[]{c0733ta};
        c0733ta.a = i;
        c0733ta.o = asVar.a(k6.e);
        c0733ta.b = systemTimeProvider.currentTimeSeconds() - longValue2;
        c0733ta.c = k6.e;
        if (!TextUtils.isEmpty(k6.getName())) {
            c0733ta.d = c0663qq.a(k6.getName());
        }
        if (!TextUtils.isEmpty(k6.getValue())) {
            String value = k6.getValue();
            String a2 = c0663qq2.a(value);
            if (!TextUtils.isEmpty(a2)) {
                c0733ta.e = a2.getBytes();
            }
            int length = value.getBytes().length;
            byte[] bArr2 = c0733ta.e;
            c0733ta.i = length - (bArr2 == null ? 0 : bArr2.length);
        }
        byte[] byteArray = MessageNano.toByteArray(c0878ya);
        try {
            bArr = this.e.compress(byteArray);
        } catch (Throwable unused) {
            bArr = null;
        }
        if (!Or.a(bArr)) {
            this.i.setHeader("Content-Encoding", Request.PARAM_GZIP);
            byteArray = bArr;
        }
        this.i.setPostData(byteArray);
        return true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.i.applySendTime(this.d.currentTimeMillis());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z) {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.k.handle(this.j);
        return response != null && "accepted".equals(response.mStatus);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th) {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }
}
