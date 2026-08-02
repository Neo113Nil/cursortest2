package androidx.biometric;

import android.os.CancellationSignal;

/* loaded from: classes3.dex */
public abstract class CancellationSignalProvider$Api16Impl {
    public static void cancel(CancellationSignal cancellationSignal) {
        cancellationSignal.cancel();
    }

    public static CancellationSignal create() {
        return new CancellationSignal();
    }
}
