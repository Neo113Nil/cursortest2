package N2;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class u extends U2.a {

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f2109e;

    public u(v vVar) {
        this.f2109e = new WeakReference(vVar);
    }

    @Override // U2.a
    public final void q() {
        v vVar = (v) this.f2109e.get();
        if (vVar == null) {
            return;
        }
        v.c(vVar);
    }
}
