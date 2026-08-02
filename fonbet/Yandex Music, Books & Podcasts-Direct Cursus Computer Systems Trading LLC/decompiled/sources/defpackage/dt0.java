package defpackage;

import com.appsflyer.AppsFlyerLib;
import com.yandex.passport.common.core.a;
import com.yandex.passport.common.core.b;
import com.yandex.passport.internal.flags.experiments.FetchExperimentsService;
import com.yandex.passport.internal.ui.sloth.menu.host.d;
import com.yandex.passport.internal.usecase.vpn.e;
import java.io.Serializable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class dt0 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt0(Continuation continuation) {
        super(2, continuation);
        this.j = 23;
        a aVar = b.b;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        int i = 2;
        switch (this.j) {
            case 0:
                return new dt0(i, 0, continuation);
            case 1:
                return new dt0(i, 1, continuation);
            case 2:
                return new dt0(i, i, continuation);
            case 3:
                return new dt0(i, 3, continuation);
            case 4:
                dt0 dt0Var = new dt0(i, 4, continuation);
                dt0Var.k = ((Number) obj).intValue();
                return dt0Var;
            case 5:
                return new dt0(i, 5, continuation);
            case 6:
                return new dt0(i, 6, continuation);
            case 7:
                return new dt0(i, 7, continuation);
            case 8:
                return new dt0(i, 8, continuation);
            case 9:
                return new dt0(i, 9, continuation);
            case 10:
                dt0 dt0Var2 = new dt0(i, 10, continuation);
                dt0Var2.k = ((Number) obj).intValue();
                return dt0Var2;
            case 11:
                return new dt0(i, 11, continuation);
            case 12:
                dt0 dt0Var3 = new dt0(i, 12, continuation);
                dt0Var3.k = ((Number) obj).intValue();
                return dt0Var3;
            case 13:
                dt0 dt0Var4 = new dt0(i, 13, continuation);
                dt0Var4.k = ((Number) obj).intValue();
                return dt0Var4;
            case 14:
                return new dt0(i, 14, continuation);
            case 15:
                return new dt0(i, 15, continuation);
            case 16:
                return new dt0(null, continuation);
            case 17:
                dt0 dt0Var5 = new dt0(i, 17, continuation);
                dt0Var5.k = ((Number) obj).intValue();
                return dt0Var5;
            case 18:
                dt0 dt0Var6 = new dt0(i, 18, continuation);
                dt0Var6.k = ((Number) obj).intValue();
                return dt0Var6;
            case 19:
                dt0 dt0Var7 = new dt0(i, 19, continuation);
                dt0Var7.k = ((Number) obj).intValue();
                return dt0Var7;
            case 20:
                return new dt0(i, 20, continuation);
            case 21:
                return new dt0(i, 21, continuation);
            case 22:
                return new dt0(i, 22, continuation);
            case 23:
                a aVar = b.b;
                return new dt0(continuation);
            case 24:
                return new dt0(i, 24, continuation);
            default:
                return new dt0(i, 25, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 2:
                ((dt0) create((rwo) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
            case 4:
                break;
            case 10:
                break;
            case 12:
                break;
            case 13:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return ((dt0) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0113, code lost:
    
        if (r8.c(r7) == r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f7, code lost:
    
        if (r8 == r0) goto L69;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        int i = 2;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                l18 l18Var = l18.b;
                bdt I = hag.I(frt.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                frt frtVar = (frt) qdcVar.C(I);
                this.k = 1;
                Object k = frtVar.k(this);
                return k == nm6Var ? nm6Var : k;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    jyr jyrVar = px2.a;
                    this.k = 1;
                    Object b = px2.a().b(this);
                    if (b != nm6Var2) {
                        b = Unit.a;
                    }
                    if (b == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                this.k = 1;
                y2x.m(this);
                return nm6Var3;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i5 = this.k;
                if (i5 != 0) {
                    if (i5 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
                appsFlyerLib.getClass();
                this.k = 1;
                Serializable E = sj2.E(appsFlyerLib, this);
                return E == nm6Var4 ? nm6Var4 : E;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(this.k > 0);
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(5000L, this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i7 = this.k;
                if (i7 != 0) {
                    if (i7 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(y1d.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                y1d y1dVar = (y1d) qdcVar2.C(I2);
                this.k = 1;
                Object a2 = y1dVar.a(this);
                return a2 == nm6Var7 ? nm6Var7 : a2;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    jyr jyrVar2 = px2.a;
                    this.k = 1;
                    Object c = px2.a().c(this);
                    if (c != nm6Var8) {
                        c = Unit.a;
                    }
                    if (c == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i9 = this.k;
                if (i9 != 0) {
                    if (i9 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                fzk fzkVar = fzk.a;
                kvh L = y1g.L((f7l) fzk.c.getValue());
                this.k = 1;
                Object g0 = zsd.g0(L, this);
                return g0 == nm6Var9 ? nm6Var9 : g0;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    dt0 dt0Var = new dt0(i, 8, continuation);
                    this.k = 1;
                    if (tyf.L(20000L, dt0Var, this) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xdr xdrVar = fzk.d;
                Boolean bool = Boolean.FALSE;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                return Unit.a;
            case 10:
                int i11 = this.k;
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(i11 > 0);
            case 11:
                Object obj2 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object V = x97.V(dm6.b, new db(i, 22, continuation), this);
                    if (V != obj2) {
                        V = Unit.a;
                    }
                    if (V == obj2) {
                        return obj2;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                int i13 = this.k;
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(i13 >= 0);
            case 13:
                int i14 = this.k;
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(i14 == 0);
            case 14:
                nm6 nm6Var14 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    l18 l18Var3 = l18.b;
                    bdt I3 = hag.I(frt.class);
                    qdc qdcVar3 = l18Var3.a;
                    qdcVar3.getClass();
                    frt frtVar2 = (frt) qdcVar3.C(I3);
                    this.k = 1;
                    obj = frtVar2.k(this);
                    if (obj == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                yxc yxcVar = (yxc) obj;
                if (yxcVar != null) {
                    return yxcVar.e;
                }
                return null;
            case 15:
                nm6 nm6Var15 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (lg3.m0(this) == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 16:
                nm6 nm6Var16 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    throw null;
                }
                if (i17 == 1) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                int i18 = this.k;
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(i18 > 0);
            case 18:
                int i19 = this.k;
                nm6 nm6Var18 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(i19 > 0);
            case 19:
                int i20 = this.k;
                nm6 nm6Var19 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(i20 > 0);
            case 20:
                nm6 nm6Var20 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    msa msaVar = nsa.b;
                    long M = yd5.M(4, ssa.SECONDS);
                    this.k = 1;
                    if (y2x.p(M, this) == nm6Var20) {
                        return nm6Var20;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 21:
                nm6 nm6Var21 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (lbr.a.get() == gcr.c) {
                        a = Unit.a;
                    } else {
                        cno cnoVar = new cno(qxe.b(this));
                        ReentrantLock reentrantLock = lbr.e;
                        reentrantLock.lock();
                        try {
                            lbr.g.add(cnoVar);
                            reentrantLock.unlock();
                            lbr.b();
                            a = cnoVar.a();
                            if (a != nm6Var21) {
                                a = Unit.a;
                            }
                        } catch (Throwable th) {
                            reentrantLock.unlock();
                            throw th;
                        }
                    }
                    if (a != nm6Var21) {
                        a = Unit.a;
                        break;
                    }
                } else {
                    if (i22 != 1) {
                        if (i22 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                l18 l18Var4 = l18.b;
                bdt I4 = hag.I(k68.class);
                qdc qdcVar4 = l18Var4.a;
                qdcVar4.getClass();
                k68 k68Var = (k68) qdcVar4.C(I4);
                this.k = 2;
                break;
            case 22:
                nm6 nm6Var22 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(100L, this) == nm6Var22) {
                        return nm6Var22;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 23:
                nm6 nm6Var23 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    int i25 = FetchExperimentsService.i;
                    b bVar = b.c;
                    this.k = 1;
                    Object a3 = com.yandex.passport.internal.di.a.a().getExperimentsFetcher().a(bVar, this);
                    if (a3 != nm6Var23) {
                        a3 = Unit.a;
                    }
                    if (a3 == nm6Var23) {
                        return nm6Var23;
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 24:
                nm6 nm6Var24 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    e checkVpnStatusUseCase = com.yandex.passport.internal.di.a.a().getCheckVpnStatusUseCase();
                    this.k = 1;
                    if (checkVpnStatusUseCase.c(this) == nm6Var24) {
                        return nm6Var24;
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var25 = nm6.a;
                int i27 = this.k;
                if (i27 != 0) {
                    if (i27 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                gm5 gm5Var = d.a;
                this.k = 1;
                Object s = gm5Var.s(this);
                return s == nm6Var25 ? nm6Var25 : s;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt0(qu2 qu2Var, Continuation continuation) {
        super(2, continuation);
        this.j = 16;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dt0(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }
}
