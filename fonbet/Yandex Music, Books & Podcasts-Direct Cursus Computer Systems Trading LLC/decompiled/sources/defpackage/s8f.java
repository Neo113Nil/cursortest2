package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class s8f extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ z8f l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s8f(z8f z8fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = z8fVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new s8f(this.l, continuation, 0);
            case 1:
                return new s8f(this.l, continuation, 1);
            case 2:
                return new s8f(this.l, continuation, 2);
            default:
                return new s8f(this.l, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((s8f) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = 7;
        boolean z = true;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                z8f z8fVar = this.l;
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    brs brsVar = (brs) z8fVar.d;
                    Object obj2 = z8fVar.a;
                    Object obj3 = z8fVar.b;
                    brsVar.getClass();
                    mqs mqsVar = (mqs) obj2;
                    zus zusVar = (zus) obj3;
                    mqsVar.getClass();
                    zusVar.getClass();
                    pjc e = brsVar.e(mqsVar);
                    pjc d = brsVar.d(mqsVar);
                    pjc f = brsVar.f(mqsVar, zusVar);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(uaa.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    h7a H0 = zsd.H0(lg3.K(e, d, f, new pf5(((e6q) ((uaa) qdcVar.C(I))).e, mqsVar, 7), brsVar.n().w(mqsVar), new xqs(brsVar, mqsVar, zusVar, null)), 1);
                    dq7 dq7Var = ca8.a;
                    pjc k0 = zsd.k0(H0, mn7.d);
                    otd otdVar = new otd(8, z8fVar);
                    this.k = 1;
                    if (k0.collect(otdVar, this) == nm6Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(50L, this) == nm6Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                ((x8f) ((oxa) this.l.k).b).dismissAllowingStateLoss();
                break;
            case 2:
                z8f z8fVar2 = this.l;
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    rjq rjqVar = (rjq) z8fVar2.g;
                    rjqVar.g();
                    x97.y(hld.s(rjqVar, dm6.b()), null, null, new z11(z, z8fVar2, continuation, i), 3);
                    this.k = 1;
                    if (z8fVar2.c(this) == nm6Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                rjq rjqVar2 = (rjq) z8fVar2.g;
                rjqVar2.g();
                x97.y(hld.s(rjqVar2, dm6.b()), null, null, new z11(false, (Object) z8fVar2, continuation, i), 3);
                break;
            default:
                nm6 nm6Var4 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    z8f z8fVar3 = this.l;
                    this.k = 1;
                    if (z8fVar3.b(this) == nm6Var4) {
                        break;
                    }
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
