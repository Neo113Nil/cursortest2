package Z;

import h.AbstractActivityC0168i;

/* renamed from: Z.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0072u implements N.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1625b;

    public /* synthetic */ C0072u(int i, Object obj) {
        this.f1624a = i;
        this.f1625b = obj;
    }

    @Override // N.a
    public final void accept(Object obj) {
        switch (this.f1624a) {
            case 0:
                ((AbstractActivityC0168i) this.f1625b).f3211r.B();
                break;
            case 1:
                ((AbstractActivityC0168i) this.f1625b).f3211r.B();
                break;
            default:
                androidx.window.layout.z zVar = (androidx.window.layout.z) obj;
                D1.i.d(zVar, "info");
                ((N1.k) this.f1625b).s(zVar);
                break;
        }
    }
}
