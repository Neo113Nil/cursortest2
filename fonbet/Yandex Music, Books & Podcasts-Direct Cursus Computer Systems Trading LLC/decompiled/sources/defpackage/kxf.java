package defpackage;

import io.appmetrica.analytics.FeaturesResult;
import io.appmetrica.analytics.IParamsCallback;

/* loaded from: classes3.dex */
public final class kxf implements IParamsCallback {
    public final /* synthetic */ lxf a;

    public kxf(lxf lxfVar) {
        this.a = lxfVar;
    }

    @Override // io.appmetrica.analytics.IParamsCallback
    public final void onReceive(IParamsCallback.Result result) {
        FeaturesResult features;
        Boolean libSslEnabled;
        if (result == null || (features = result.getFeatures()) == null || (libSslEnabled = features.getLibSslEnabled()) == null) {
            return;
        }
        ((xpi) this.a.b.getValue()).a(libSslEnabled);
    }

    @Override // io.appmetrica.analytics.IParamsCallback
    public final void onRequestError(IParamsCallback.Reason reason, IParamsCallback.Result result) {
        ssg.a(3, "LibSslStartupParamsFetcher", "requestStartupParams error: " + reason, null);
    }
}
