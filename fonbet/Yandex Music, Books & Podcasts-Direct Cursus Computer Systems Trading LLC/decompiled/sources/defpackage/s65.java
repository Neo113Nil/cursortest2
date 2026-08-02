package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class s65 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ u65 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s65(u65 u65Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = u65Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new s65(this.l, continuation, 0);
            case 1:
                return new s65(this.l, continuation, 1);
            default:
                return new s65(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((s65) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    r65 r65Var = new r65(this.l, null, 0);
                    mn7 mn7Var = dm6.b;
                    this.k = 1;
                    if (x97.V(mn7Var, r65Var, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    r65 r65Var2 = new r65(this.l, null, 1);
                    mn7 mn7Var2 = dm6.b;
                    this.k = 1;
                    if (x97.V(mn7Var2, r65Var2, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                u65 u65Var = this.l;
                if (i3 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar = u65Var.p;
                    Boolean bool = Boolean.TRUE;
                    xdrVar.getClass();
                    xdrVar.m(null, bool);
                    pjc g = u65Var.k.g();
                    this.k = 1;
                    obj = zsd.g0(g, this);
                    if (obj == nm6Var3) {
                    }
                } else if (i3 == 1) {
                    qgg.h0(obj);
                } else if (i3 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                String str = ((xxq) obj).a;
                str.getClass();
                jrk jrkVar = u65Var.n;
                this.k = 2;
                if (((ork) jrkVar).a(str, this) == nm6Var3) {
                }
                break;
        }
        return Unit.a;
    }
}
