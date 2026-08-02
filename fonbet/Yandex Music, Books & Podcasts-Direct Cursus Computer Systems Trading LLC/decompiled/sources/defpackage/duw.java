package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class duw extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ fuw l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ duw(fuw fuwVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = fuwVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new duw(this.l, continuation, 0);
            case 1:
                return new duw(this.l, continuation, 1);
            case 2:
                return new duw(this.l, continuation, 2);
            case 3:
                return new duw(this.l, continuation, 3);
            case 4:
                return new duw(this.l, continuation, 4);
            case 5:
                return new duw(this.l, continuation, 5);
            case 6:
                return new duw(this.l, continuation, 6);
            default:
                return new duw(this.l, continuation, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((duw) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    fk0 fk0Var = this.l.d;
                    Float f = new Float(1.0f);
                    this.k = 1;
                    if (fk0.c(fk0Var, f, null, null, this, 14) == nm6Var) {
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
                    fk0 fk0Var2 = this.l.d;
                    Float f2 = new Float(1.0f);
                    b9r Q = weo.Q(0.0f, 0.0f, null, 7);
                    this.k = 1;
                    if (fk0.c(fk0Var2, f2, Q, null, this, 12) == nm6Var2) {
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
                    fk0 fk0Var3 = this.l.e;
                    Float f3 = new Float(0.0f);
                    b9r Q2 = weo.Q(0.0f, 0.0f, null, 7);
                    this.k = 1;
                    if (fk0.c(fk0Var3, f3, Q2, null, this, 12) == nm6Var3) {
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
                    fk0 fk0Var4 = this.l.e;
                    Float f4 = new Float(0.0f);
                    b9r Q3 = weo.Q(0.0f, 0.0f, null, 7);
                    this.k = 1;
                    if (fk0.c(fk0Var4, f4, Q3, null, this, 12) == nm6Var4) {
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
                    fk0 fk0Var5 = this.l.f;
                    Float f5 = new Float(0.0f);
                    b9r Q4 = weo.Q(0.0f, 0.0f, null, 7);
                    this.k = 1;
                    if (fk0.c(fk0Var5, f5, Q4, null, this, 12) == nm6Var5) {
                    }
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    fk0 fk0Var6 = this.l.f;
                    Float f6 = new Float(0.0f);
                    b9r Q5 = weo.Q(0.0f, 0.0f, null, 7);
                    this.k = 1;
                    if (fk0.c(fk0Var6, f6, Q5, null, this, 12) == nm6Var6) {
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
                    this.k = 1;
                    if (gld.Q(new euw(this.l, null, 1), this) == nm6Var7) {
                    }
                } else if (i7 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                Object obj2 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    fuw fuwVar = this.l;
                    fuwVar.getClass();
                    Object Q6 = gld.Q(new euw(fuwVar, null, 0), this);
                    if (Q6 != obj2) {
                        Q6 = Unit.a;
                    }
                    if (Q6 == obj2) {
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
