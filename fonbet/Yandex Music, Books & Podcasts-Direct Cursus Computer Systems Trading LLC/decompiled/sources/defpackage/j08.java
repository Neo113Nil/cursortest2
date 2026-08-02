package defpackage;

import io.appmetrica.analytics.IParamsCallback;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class j08 implements IParamsCallback {
    @Override // io.appmetrica.analytics.IParamsCallback
    public final void onReceive(IParamsCallback.Result result) {
        String deviceId;
        if (result == null || (deviceId = result.getDeviceId()) == null || k08.a != null) {
            return;
        }
        k08.a(deviceId);
    }

    @Override // io.appmetrica.analytics.IParamsCallback
    public final void onRequestError(IParamsCallback.Reason reason, IParamsCallback.Result result) {
        String deviceId;
        reason.getClass();
        Timber.INSTANCE.v("Request error. Reason: \n" + reason, new Object[0]);
        if (result == null || (deviceId = result.getDeviceId()) == null || k08.a != null) {
            return;
        }
        k08.a(deviceId);
    }
}
