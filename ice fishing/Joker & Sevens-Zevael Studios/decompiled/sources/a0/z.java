package a0;

import com.onesignal.inAppMessages.internal.display.impl.a;
import m0.i1;
import v.o0;
import x.i0;
import x1.g0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f150g;

    /* renamed from: h, reason: collision with root package name */
    public int f151h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0 f152i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b0 b0Var, int i10, fc.d dVar) {
        super(2, dVar);
        this.f150g = 0;
        this.f152i = b0Var;
        this.f151h = i10;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f150g) {
            case 0:
                return new z(this.f152i, this.f151h, dVar);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new z(this.f152i, dVar, 1);
            default:
                return new z(this.f152i, dVar, 2);
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f150g) {
            case 0:
                z zVar = (z) create((i0) obj, (fc.d) obj2);
                ac.o oVar = ac.o.f277a;
                zVar.invokeSuspend(oVar);
                break;
        }
        return ((z) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f150g) {
            case 0:
                v6.a.W(obj);
                int i10 = this.f151h;
                b0 b0Var = this.f152i;
                u uVar = b0Var.f19d;
                if (((i1) uVar.f136b).g() != i10 || ((i1) uVar.f137c).g() != 0) {
                    b0Var.f28m.c();
                }
                uVar.h(i10, 0);
                uVar.f138d = null;
                g0 g0Var = b0Var.f25j;
                if (g0Var != null) {
                    g0Var.k();
                }
                return ac.o.f277a;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                int i11 = this.f151h;
                if (i11 == 0) {
                    v6.a.W(obj);
                    v.i iVar = this.f152i.f37v;
                    Float f10 = new Float(0.0f);
                    o0 i12 = v.d.i(0.0f, 400.0f, new Float(0.5f), 1);
                    this.f151h = 1;
                    Object d10 = v.d.d(iVar, f10, i12, this);
                    gc.a aVar = gc.a.f2559g;
                    if (d10 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
            default:
                int i13 = this.f151h;
                if (i13 == 0) {
                    v6.a.W(obj);
                    v.i iVar2 = this.f152i.f37v;
                    Float f11 = new Float(0.0f);
                    o0 i14 = v.d.i(0.0f, 400.0f, new Float(0.5f), 1);
                    this.f151h = 1;
                    Object d11 = v.d.d(iVar2, f11, i14, this);
                    gc.a aVar2 = gc.a.f2559g;
                    if (d11 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(b0 b0Var, fc.d dVar, int i10) {
        super(2, dVar);
        this.f150g = i10;
        this.f152i = b0Var;
    }
}
