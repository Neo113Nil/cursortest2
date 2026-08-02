package defpackage;

import io.appmetrica.analytics.IParamsCallback;

/* loaded from: classes2.dex */
public final class uaj implements IParamsCallback {
    public final /* synthetic */ kol0 a;

    public uaj(kol0 kol0Var) {
        this.a = kol0Var;
    }

    @Override // io.appmetrica.analytics.IParamsCallback
    public final void onReceive(IParamsCallback.Result result) {
        this.a.resumeWith(result != null ? result.getDeviceId() : null);
    }

    @Override // io.appmetrica.analytics.IParamsCallback
    public final void onRequestError(IParamsCallback.Reason reason, IParamsCallback.Result result) {
        x4c.g("An error occurred while getting the deviceID", null, "Reason = " + reason, null, 10);
        this.a.resumeWith(null);
    }
}
