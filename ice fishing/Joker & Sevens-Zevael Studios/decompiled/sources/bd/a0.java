package bd;

import m0.z1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a0 extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1076g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f1077h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i10, int i11, fc.d dVar) {
        super(i10, dVar);
        this.f1076g = i11;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f1076g) {
            case 0:
                a0 a0Var = new a0(2, 0, dVar);
                a0Var.f1077h = obj;
                return a0Var;
            default:
                a0 a0Var2 = new a0(2, 1, dVar);
                a0Var2.f1077h = obj;
                return a0Var2;
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1076g) {
            case 0:
                return ((a0) create((w) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
            default:
                return ((a0) create((z1) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
        }
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1076g) {
            case 0:
                v6.a.W(obj);
                return Boolean.valueOf(((w) this.f1077h) != w.f1159g);
            default:
                v6.a.W(obj);
                return Boolean.valueOf(((z1) this.f1077h) == z1.f4846g);
        }
    }
}
