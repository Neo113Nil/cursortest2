package defpackage;

import io.appmetrica.analytics.IParamsCallback;

/* loaded from: classes3.dex */
public final class u3i implements IParamsCallback {
    public final /* synthetic */ v3i a;

    public u3i(v3i v3iVar) {
        this.a = v3iVar;
    }

    public final void a(IParamsCallback.Result result) {
        if (result == null) {
            return;
        }
        String deviceId = result.getDeviceId();
        if (deviceId != null) {
            xdr xdrVar = this.a.b;
            xdrVar.getClass();
            xdrVar.m(null, deviceId);
        }
        v3w.l("readResult, deviceId = ", deviceId, 3, "MetricaDeviceIdProviderInternal", null);
        if (deviceId != null) {
            bow.z("deviceId", deviceId);
        }
    }

    @Override // io.appmetrica.analytics.IParamsCallback
    public final void onReceive(IParamsCallback.Result result) {
        ssg.a(3, "MetricaDeviceIdProviderInternal", "onReceive result = " + result, null);
        a(result);
    }

    @Override // io.appmetrica.analytics.IParamsCallback
    public final void onRequestError(IParamsCallback.Reason reason, IParamsCallback.Result result) {
        ssg.a(3, "MetricaDeviceIdProviderInternal", "onRequestError, reason = " + reason + ", result = " + result, null);
        a(result);
    }
}
