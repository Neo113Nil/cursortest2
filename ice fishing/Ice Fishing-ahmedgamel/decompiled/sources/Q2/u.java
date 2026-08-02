package Q2;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class u extends t8.g {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2610a;

    public u(v vVar) {
        this.f2610a = new WeakReference(vVar);
    }

    @Override // t8.g
    public final void q() {
        v vVar = (v) this.f2610a.get();
        if (vVar == null) {
            return;
        }
        v.c(vVar);
    }
}
