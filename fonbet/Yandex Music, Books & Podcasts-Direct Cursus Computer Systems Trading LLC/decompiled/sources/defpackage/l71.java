package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class l71 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ o3k l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l71(o3k o3kVar, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.j = i2;
        this.l = o3kVar;
        this.m = i;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new l71(this.l, this.m, continuation, 0);
            case 1:
                return new l71(this.l, this.m, continuation, 1);
            case 2:
                return new l71(this.l, this.m, continuation, 2);
            case 3:
                return new l71(this.l, this.m, continuation, 3);
            case 4:
                return new l71(this.l, this.m, continuation, 4);
            case 5:
                return new l71(this.l, this.m, continuation, 5);
            case 6:
                return new l71(this.l, this.m, continuation, 6);
            default:
                return new l71(this.l, this.m, continuation, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((l71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((l71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((l71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((l71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((l71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((l71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((l71) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((l71) create((rwo) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (o3k.g(this.l, this.m, null, this, 6) == nm6Var) {
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
                    this.k = 1;
                    if (o3k.g(this.l, this.m, null, this, 6) == nm6Var2) {
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
                    this.k = 1;
                    if (o3k.g(this.l, this.m, null, this, 6) == nm6Var3) {
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
                    this.k = 1;
                    if (o3k.g(this.l, this.m, null, this, 6) == nm6Var4) {
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
                    this.k = 1;
                    if (o3k.g(this.l, this.m, null, this, 6) == nm6Var5) {
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
                    int i7 = this.m + 1;
                    o3k o3kVar = this.l;
                    int n = i7 % o3kVar.n();
                    act S = weo.S(500, 0, null, 6);
                    this.k = 1;
                    if (o3k.g(o3kVar, n, S, this, 2) == nm6Var6) {
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
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    int i9 = this.m;
                    o3k o3kVar2 = this.l;
                    int n2 = ((o3kVar2.n() + i9) - 1) % o3kVar2.n();
                    act S2 = weo.S(500, 0, null, 6);
                    this.k = 1;
                    if (o3k.g(o3kVar2, n2, S2, this, 2) == nm6Var7) {
                    }
                } else if (i8 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var8 = nm6.a;
                int i10 = this.k;
                o3k o3kVar3 = this.l;
                if (i10 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object e = o3kVar3.y.e(this);
                    if (e != nm6Var8) {
                        e = Unit.a;
                    }
                    if (e == nm6Var8) {
                    }
                } else if (i10 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                double d = 0.0f;
                if (-0.5d > d || d > 0.5d) {
                    vme.a("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5");
                }
                o3kVar3.w(0.0f, o3kVar3.i(this.m), true);
                break;
        }
        return Unit.a;
    }
}
