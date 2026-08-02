package defpackage;

import android.os.CancellationSignal;

/* loaded from: classes10.dex */
public abstract class v18 {
    public static void a(CancellationSignal cancellationSignal) {
        cancellationSignal.cancel();
    }

    public static CancellationSignal b() {
        return new CancellationSignal();
    }
}
