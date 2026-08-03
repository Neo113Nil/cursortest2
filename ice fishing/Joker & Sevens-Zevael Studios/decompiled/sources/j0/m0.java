package j0;

import android.view.Choreographer;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m0 extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3408g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i10, int i11, fc.d dVar) {
        super(i10, dVar);
        this.f3408g = i11;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f3408g) {
            case 0:
                return new m0(2, 0, dVar);
            default:
                return new m0(2, 1, dVar);
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3408g) {
            case 0:
                m0 m0Var = (m0) create((r1.r) obj, (fc.d) obj2);
                ac.o oVar = ac.o.f277a;
                m0Var.invokeSuspend(oVar);
                return oVar;
            default:
                return ((m0) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
        }
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3408g) {
            case 0:
                v6.a.W(obj);
                return ac.o.f277a;
            default:
                v6.a.W(obj);
                return Choreographer.getInstance();
        }
    }
}
