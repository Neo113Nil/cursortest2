package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class v41 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ fk0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v41(int i, fk0 fk0Var, Continuation continuation) {
        super(2, continuation);
        this.j = i;
        this.l = fk0Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new v41(0, this.l, continuation);
            case 1:
                return new v41(1, this.l, continuation);
            case 2:
                return new v41(2, this.l, continuation);
            case 3:
                return new v41(3, this.l, continuation);
            case 4:
                return new v41(4, this.l, continuation);
            case 5:
                return new v41(5, this.l, continuation);
            case 6:
                return new v41(6, this.l, continuation);
            default:
                return new v41(7, this.l, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((v41) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    Float f = new Float(1.0f);
                    act S = weo.S(300, 0, null, 6);
                    this.k = 1;
                    if (fk0.c(this.l, f, S, null, this, 12) == nm6Var) {
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
                    Float f2 = new Float(0.0f);
                    this.k = 1;
                    if (fk0.c(this.l, f2, null, null, this, 14) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    Float f3 = new Float(0.0f);
                    this.k = 1;
                    if (fk0.c(this.l, f3, null, null, this, 14) == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    Float f4 = new Float(1.0f);
                    act S2 = weo.S(150, 0, null, 6);
                    this.k = 1;
                    if (fk0.c(this.l, f4, S2, null, this, 12) == nm6Var4) {
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    Float f5 = new Float(0.95f);
                    b9r Q = weo.Q(0.0f, 0.0f, null, 7);
                    this.k = 1;
                    if (fk0.c(this.l, f5, Q, null, this, 12) == nm6Var5) {
                    }
                } else if (i5 == 1) {
                    qgg.h0(obj);
                } else if (i5 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                Float f6 = new Float(1.0f);
                b9r Q2 = weo.Q(0.0f, 0.0f, null, 7);
                this.k = 2;
                if (fk0.c(this.l, f6, Q2, null, this, 12) == nm6Var5) {
                }
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    Float f7 = new Float(1.3f);
                    act S3 = weo.S(200, 0, null, 6);
                    this.k = 1;
                    if (fk0.c(this.l, f7, S3, null, this, 12) == nm6Var6) {
                    }
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    Float f8 = new Float(0.0f);
                    act S4 = weo.S(200, 0, null, 6);
                    this.k = 1;
                    if (fk0.c(this.l, f8, S4, null, this, 12) == nm6Var7) {
                    }
                } else if (i7 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var8 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    enj enjVar = new enj(0L);
                    act S5 = weo.S(300, 0, lya.c, 2);
                    this.k = 1;
                    if (fk0.c(this.l, enjVar, S5, null, this, 12) == nm6Var8) {
                    }
                } else if (i8 != 1) {
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
