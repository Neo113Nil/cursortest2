package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class aq5 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ fvf l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aq5(fvf fvfVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = fvfVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new aq5(this.l, continuation, 0);
            case 1:
                return new aq5(this.l, continuation, 1);
            case 2:
                return new aq5(this.l, continuation, 2);
            case 3:
                return new aq5(this.l, continuation, 3);
            case 4:
                return new aq5(this.l, continuation, 4);
            case 5:
                return new aq5(this.l, continuation, 5);
            case 6:
                return new aq5(this.l, continuation, 6);
            default:
                return new aq5(this.l, continuation, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((aq5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        int i2 = 2;
        fvf fvfVar = this.l;
        Continuation continuation = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    hqi hqiVar = hqi.c;
                    dt0 dt0Var = new dt0(i2, i2, continuation);
                    this.k = 1;
                    if (fvfVar.a(hqiVar, dt0Var, this) == nm6Var) {
                        break;
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    hqi hqiVar2 = hqi.c;
                    db dbVar = new db(i2, 5, continuation);
                    this.k = 1;
                    if (fvfVar.a(hqiVar2, dbVar, this) == nm6Var2) {
                        break;
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    db dbVar2 = new db(i2, 9, continuation);
                    this.k = 1;
                    if (fvfVar.a(hqi.a, dbVar2, this) == nm6Var3) {
                        break;
                    }
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    apo apoVar = fvf.w;
                    if (fvfVar.m(0, 0, this) == nm6Var4) {
                        break;
                    }
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    apo apoVar2 = fvf.w;
                    if (fvfVar.m(0, 0, this) == nm6Var5) {
                        break;
                    }
                } else if (i7 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    int h = fvfVar.h();
                    this.k = 1;
                    if (fvfVar.f(h, 0, this) == nm6Var6) {
                        break;
                    }
                } else if (i8 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    int h2 = fvfVar.h() + 1;
                    this.k = 1;
                    if (fvfVar.f(h2, 0, this) == nm6Var7) {
                        break;
                    }
                } else if (i9 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var8 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    apo apoVar3 = fvf.w;
                    if (fvfVar.m(0, 0, this) == nm6Var8) {
                        break;
                    }
                } else if (i10 != 1) {
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
