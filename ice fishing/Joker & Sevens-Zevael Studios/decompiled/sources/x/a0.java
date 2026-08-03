package x;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a0 extends hc.j implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7740g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i10, int i11, fc.d dVar) {
        super(i10, dVar);
        this.f7740g = i11;
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f7740g) {
            case 0:
                long j3 = ((e1.b) obj2).f1929a;
                a0 a0Var = new a0(3, 0, (fc.d) obj3);
                ac.o oVar = ac.o.f277a;
                a0Var.invokeSuspend(oVar);
                return oVar;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((Number) obj2).floatValue();
                a0 a0Var2 = new a0(3, 1, (fc.d) obj3);
                ac.o oVar2 = ac.o.f277a;
                a0Var2.invokeSuspend(oVar2);
                return oVar2;
            default:
                long j6 = ((e1.b) obj2).f1929a;
                a0 a0Var3 = new a0(3, 2, (fc.d) obj3);
                ac.o oVar3 = ac.o.f277a;
                a0Var3.invokeSuspend(oVar3);
                return oVar3;
        }
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f7740g;
        ac.o oVar = ac.o.f277a;
        switch (i10) {
            case 0:
                v6.a.W(obj);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                v6.a.W(obj);
                break;
            default:
                v6.a.W(obj);
                break;
        }
        return oVar;
    }
}
