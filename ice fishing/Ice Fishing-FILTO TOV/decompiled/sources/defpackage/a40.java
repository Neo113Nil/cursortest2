package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class a40 extends i40 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater XnEVoBF0td1l = AtomicIntegerFieldUpdater.newUpdater(a40.class, "_invoked$volatile");
    public final OOA6hdeuvCS E7jCp8Ls;
    private volatile /* synthetic */ int _invoked$volatile = 0;

    public a40(OOA6hdeuvCS oOA6hdeuvCS) {
        this.E7jCp8Ls = oOA6hdeuvCS;
    }

    @Override // defpackage.i40
    public final boolean Mjvvu5DE() {
        return true;
    }

    @Override // defpackage.i40
    public final void mE4lRynR(Throwable th) {
        if (XnEVoBF0td1l.compareAndSet(this, 0, 1)) {
            this.E7jCp8Ls.mOu10nynGul(th);
        }
    }
}
