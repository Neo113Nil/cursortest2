package defpackage;

import com.yandex.passport.internal.entities.a0;
import com.yandex.plus.home.graphql.configuration.j;
import com.yandex.plus.home.internal.di.l;
import com.yandex.plus.home.t;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hk4 extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ boolean k;
    public /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk4(t tVar, Continuation continuation) {
        super(3, continuation);
        this.j = 13;
        this.l = tVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.j) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                hk4 hk4Var = new hk4(3, 0, (Continuation) obj3);
                hk4Var.k = booleanValue;
                hk4Var.l = (List) obj2;
                return hk4Var.invokeSuspend(Unit.a);
            case 1:
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                hk4 hk4Var2 = new hk4(3, 1, (Continuation) obj3);
                hk4Var2.l = (jf5) obj;
                hk4Var2.k = booleanValue2;
                return hk4Var2.invokeSuspend(Unit.a);
            case 2:
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                hk4 hk4Var3 = new hk4(3, 2, (Continuation) obj3);
                hk4Var3.l = (t3h) obj;
                hk4Var3.k = booleanValue3;
                return hk4Var3.invokeSuspend(Unit.a);
            case 3:
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                hk4 hk4Var4 = new hk4(3, 3, (Continuation) obj3);
                hk4Var4.l = (yyb) obj;
                hk4Var4.k = booleanValue4;
                return hk4Var4.invokeSuspend(Unit.a);
            case 4:
                boolean booleanValue5 = ((Boolean) obj).booleanValue();
                hk4 hk4Var5 = new hk4(3, 4, (Continuation) obj3);
                hk4Var5.k = booleanValue5;
                hk4Var5.l = (Unit) obj2;
                return hk4Var5.invokeSuspend(Unit.a);
            case 5:
                boolean booleanValue6 = ((Boolean) obj).booleanValue();
                hk4 hk4Var6 = new hk4(3, 5, (Continuation) obj3);
                hk4Var6.k = booleanValue6;
                hk4Var6.l = (ymk) obj2;
                return hk4Var6.invokeSuspend(Unit.a);
            case 6:
                boolean booleanValue7 = ((Boolean) obj).booleanValue();
                hk4 hk4Var7 = new hk4(3, 6, (Continuation) obj3);
                hk4Var7.k = booleanValue7;
                hk4Var7.l = (wlp) obj2;
                return hk4Var7.invokeSuspend(Unit.a);
            case 7:
                boolean booleanValue8 = ((Boolean) obj2).booleanValue();
                hk4 hk4Var8 = new hk4(3, 7, (Continuation) obj3);
                hk4Var8.l = (xxq) obj;
                hk4Var8.k = booleanValue8;
                return hk4Var8.invokeSuspend(Unit.a);
            case 8:
                boolean booleanValue9 = ((Boolean) obj2).booleanValue();
                hk4 hk4Var9 = new hk4(3, 8, (Continuation) obj3);
                hk4Var9.l = (q84) obj;
                hk4Var9.k = booleanValue9;
                return hk4Var9.invokeSuspend(Unit.a);
            case 9:
                boolean booleanValue10 = ((Boolean) obj).booleanValue();
                hk4 hk4Var10 = new hk4(3, 9, (Continuation) obj3);
                hk4Var10.k = booleanValue10;
                hk4Var10.l = (slv) obj2;
                return hk4Var10.invokeSuspend(Unit.a);
            case 10:
                boolean booleanValue11 = ((Boolean) obj).booleanValue();
                hk4 hk4Var11 = new hk4(3, 10, (Continuation) obj3);
                hk4Var11.k = booleanValue11;
                hk4Var11.l = (e6l) obj2;
                return hk4Var11.invokeSuspend(Unit.a);
            case 11:
                boolean booleanValue12 = ((Boolean) obj2).booleanValue();
                hk4 hk4Var12 = new hk4(3, 11, (Continuation) obj3);
                hk4Var12.l = (a0) obj;
                hk4Var12.k = booleanValue12;
                return hk4Var12.invokeSuspend(Unit.a);
            case 12:
                boolean booleanValue13 = ((Boolean) obj2).booleanValue();
                hk4 hk4Var13 = new hk4(3, 12, (Continuation) obj3);
                hk4Var13.l = (Pair) obj;
                hk4Var13.k = booleanValue13;
                return hk4Var13.invokeSuspend(Unit.a);
            default:
                boolean booleanValue14 = ((Boolean) obj2).booleanValue();
                hk4 hk4Var14 = new hk4((t) this.l, (Continuation) obj3);
                hk4Var14.k = booleanValue14;
                return hk4Var14.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        boolean z = false;
        switch (this.j) {
            case 0:
                boolean z2 = this.k;
                List list = (List) this.l;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return z2 ? list : c5b.a;
            case 1:
                jf5 jf5Var = (jf5) this.l;
                boolean z3 = this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return !jf5Var.a ? frs.c : !jf5Var.b ? frs.b : !z3 ? frs.a : frs.d;
            case 2:
                t3h t3hVar = (t3h) this.l;
                boolean z4 = this.k;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                if (!Intrinsics.d(t3hVar, q3h.a) && !(t3hVar instanceof r3h)) {
                    if (!(t3hVar instanceof s3h)) {
                        b6e.s();
                        return null;
                    }
                    if (((s3h) t3hVar).b == a3h.a && !z4) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 3:
                yyb yybVar = (yyb) this.l;
                boolean z5 = this.k;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                return z5 ? yyb.d : yybVar;
            case 4:
                boolean z6 = this.k;
                Unit unit = (Unit) this.l;
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                if (z6) {
                    return unit;
                }
                return null;
            case 5:
                boolean z7 = this.k;
                ymk ymkVar = (ymk) this.l;
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                if (z7) {
                    return new d85(ymkVar.a);
                }
                return null;
            case 6:
                boolean z8 = this.k;
                wlp wlpVar = (wlp) this.l;
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                if (z8) {
                    return tgh.b;
                }
                if (wlpVar == null) {
                    return tgh.c;
                }
                if (wlpVar.equals(vlp.a)) {
                    return tgh.a;
                }
                if (wlpVar instanceof ulp) {
                    return new sgh(((ulp) wlpVar).a);
                }
                b6e.s();
                return null;
            case 7:
                xxq xxqVar = (xxq) this.l;
                boolean z9 = this.k;
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                if (z9) {
                    return xxqVar;
                }
                return null;
            case 8:
                q84 q84Var = (q84) this.l;
                boolean z10 = this.k;
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                if (z10) {
                    return q84Var;
                }
                return null;
            case 9:
                boolean z11 = this.k;
                slv slvVar = (slv) this.l;
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                if (z11) {
                    return new rlv(slvVar.b, slvVar.f);
                }
                return slvVar;
            case 10:
                boolean z12 = this.k;
                e6l e6lVar = (e6l) this.l;
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                if (Intrinsics.d(e6lVar, b6l.a)) {
                    z = z12;
                } else {
                    if (!(e6lVar instanceof c6l)) {
                        if (!(e6lVar instanceof d6l)) {
                            b6e.s();
                            return null;
                        }
                        int ordinal = ((d6l) e6lVar).c.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1 && ordinal != 2) {
                                if (ordinal != 3) {
                                    b6e.s();
                                    return null;
                                }
                            }
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                a0 a0Var = (a0) this.l;
                boolean z13 = this.k;
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                return new Pair(a0Var, Boolean.valueOf(z13));
            case 12:
                Pair pair = (Pair) this.l;
                boolean z14 = this.k;
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                a0 a0Var2 = (a0) pair.a;
                Boolean bool = (Boolean) pair.b;
                bool.getClass();
                return new vat(a0Var2, bool, Boolean.valueOf(z14));
            default:
                l lVar = ((t) this.l).f;
                boolean z15 = this.k;
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                if (!z15) {
                    ((j) lVar.u.getValue()).c();
                    lVar.a().f();
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hk4(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }
}
