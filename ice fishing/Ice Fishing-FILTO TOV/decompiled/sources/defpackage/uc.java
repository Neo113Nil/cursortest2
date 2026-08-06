package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class uc {
    public static final /* synthetic */ AtomicIntegerFieldUpdater Yi7zF1RB1 = AtomicIntegerFieldUpdater.newUpdater(uc.class, "_handled$volatile");
    public final Throwable GWasM1elztuh;
    private volatile /* synthetic */ int _handled$volatile;

    public uc(Throwable th, boolean z) {
        this.GWasM1elztuh = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.GWasM1elztuh + ']';
    }
}
