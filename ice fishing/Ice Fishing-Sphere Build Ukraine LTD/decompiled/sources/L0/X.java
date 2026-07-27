package L0;

import t0.C0252g;

/* loaded from: classes.dex */
public final class X extends V {

    /* renamed from: i, reason: collision with root package name */
    public final a0 f633i;

    /* renamed from: j, reason: collision with root package name */
    public final Y f634j;

    /* renamed from: k, reason: collision with root package name */
    public final C0052j f635k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f636l;

    public X(a0 a0Var, Y y2, C0052j c0052j, Object obj) {
        this.f633i = a0Var;
        this.f634j = y2;
        this.f635k = c0052j;
        this.f636l = obj;
    }

    @Override // D0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        o((Throwable) obj);
        return C0252g.f2994a;
    }

    @Override // L0.V
    public final void o(Throwable th) {
        C0052j c0052j = this.f635k;
        a0 a0Var = this.f633i;
        a0Var.getClass();
        C0052j M2 = a0.M(c0052j);
        Y y2 = this.f634j;
        Object obj = this.f636l;
        if (M2 != null) {
            while (AbstractC0064w.e(M2.f661i, false, new X(a0Var, y2, M2, obj), 1) == c0.f651e) {
                M2 = a0.M(M2);
                if (M2 == null) {
                }
            }
            return;
        }
        a0Var.q(a0Var.z(y2, obj));
    }
}
