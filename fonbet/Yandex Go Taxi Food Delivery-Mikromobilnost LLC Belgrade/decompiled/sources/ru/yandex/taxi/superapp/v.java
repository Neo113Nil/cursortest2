package ru.yandex.taxi.superapp;

import defpackage.as51;
import defpackage.bhb;
import defpackage.c8w0;
import defpackage.ck7;
import defpackage.gcn;
import defpackage.iw51;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jw51;
import defpackage.kw51;
import defpackage.lse;
import defpackage.lw51;
import defpackage.mdh;
import defpackage.mv51;
import defpackage.mw51;
import defpackage.noh;
import defpackage.nw51;
import defpackage.ny61;
import defpackage.os51;
import defpackage.pzt0;
import defpackage.qoh;
import defpackage.ru8;
import defpackage.rx51;
import defpackage.s2p;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.unr0;
import defpackage.uyj;
import defpackage.vgb;
import defpackage.w511;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.eatskit.dto.CheckPaymentResponse$Result;
import ru.yandex.taxi.eatskit.dto.YbStateResponse$YbState;

/* loaded from: classes6.dex */
public final class v {
    public final com.yandex.go.yb.domain.o a;
    public final com.yandex.go.yb.data.u b;
    public final tt2 c;
    public final as51 d;
    public final c8w0 e;
    public final tse f;
    public final s2p g;
    public final ru8 h = new ru8(lse.a, 8);
    public volatile pzt0 i;

    public v(com.yandex.go.yb.domain.o oVar, com.yandex.go.yb.data.u uVar, tt2 tt2Var, as51 as51Var, c8w0 c8w0Var, tse tseVar, s2p s2pVar) {
        this.a = oVar;
        this.b = uVar;
        this.c = tt2Var;
        this.d = as51Var;
        this.e = c8w0Var;
        this.f = tseVar;
        this.g = s2pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(v vVar, tse tseVar, ContinuationImpl continuationImpl) {
        SuperAppYbSdkDelegate$updateAndGetActiveBankState$1 superAppYbSdkDelegate$updateAndGetActiveBankState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        noh nohVar;
        mv51 mv51Var;
        mv51 mv51Var2;
        nw51 nw51Var;
        YbStateResponse$YbState ybStateResponse$YbState;
        ArrayList arrayList;
        c8w0 c8w0Var = vVar.e;
        if (continuationImpl instanceof SuperAppYbSdkDelegate$updateAndGetActiveBankState$1) {
            superAppYbSdkDelegate$updateAndGetActiveBankState$1 = (SuperAppYbSdkDelegate$updateAndGetActiveBankState$1) continuationImpl;
            int i2 = superAppYbSdkDelegate$updateAndGetActiveBankState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppYbSdkDelegate$updateAndGetActiveBankState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppYbSdkDelegate$updateAndGetActiveBankState$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppYbSdkDelegate$updateAndGetActiveBankState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    qoh h = tje.h(tseVar, null, null, new SuperAppYbSdkDelegate$updateAndGetActiveBankState$updatePaymentMethods$1(vVar, null), 3);
                    qoh h2 = tje.h(tseVar, null, null, new SuperAppYbSdkDelegate$updateAndGetActiveBankState$updateBalance$1(vVar, null), 3);
                    superAppYbSdkDelegate$updateAndGetActiveBankState$1.L$0 = null;
                    superAppYbSdkDelegate$updateAndGetActiveBankState$1.L$1 = h;
                    superAppYbSdkDelegate$updateAndGetActiveBankState$1.L$2 = null;
                    superAppYbSdkDelegate$updateAndGetActiveBankState$1.label = 1;
                    Object s = h2.s(superAppYbSdkDelegate$updateAndGetActiveBankState$1);
                    if (s != coroutineSingletons) {
                        obj = s;
                        nohVar = h;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        mv51Var = (mv51) superAppYbSdkDelegate$updateAndGetActiveBankState$1.L$3;
                        kotlin.b.b(obj);
                        r0 r0Var = vVar.b.c().t;
                        superAppYbSdkDelegate$updateAndGetActiveBankState$1.L$0 = null;
                        superAppYbSdkDelegate$updateAndGetActiveBankState$1.L$1 = null;
                        superAppYbSdkDelegate$updateAndGetActiveBankState$1.L$2 = null;
                        superAppYbSdkDelegate$updateAndGetActiveBankState$1.L$3 = mv51Var;
                        superAppYbSdkDelegate$updateAndGetActiveBankState$1.label = 3;
                        obj = kotlinx.coroutines.flow.e.y(r0Var, superAppYbSdkDelegate$updateAndGetActiveBankState$1);
                        if (obj != coroutineSingletons) {
                            mv51Var2 = mv51Var;
                            nw51Var = (nw51) obj;
                            if (!jl40.l(nw51Var, mw51.a)) {
                            }
                            if (nw51Var instanceof jw51) {
                            }
                            return new rx51(ybStateResponse$YbState, mv51Var2 != null ? new os51(mv51Var2.a.toPlainString(), mv51Var2.b) : null, arrayList);
                        }
                        return coroutineSingletons;
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mv51Var2 = (mv51) superAppYbSdkDelegate$updateAndGetActiveBankState$1.L$3;
                    kotlin.b.b(obj);
                    nw51Var = (nw51) obj;
                    if (!jl40.l(nw51Var, mw51.a)) {
                        ybStateResponse$YbState = YbStateResponse$YbState.UNAVAILABLE;
                    } else if (jl40.l(nw51Var, kw51.a)) {
                        ybStateResponse$YbState = YbStateResponse$YbState.RESTRICTED;
                    } else if (jl40.l(nw51Var, iw51.a)) {
                        ybStateResponse$YbState = YbStateResponse$YbState.NO_BANK_ACCOUNT;
                    } else if (jl40.l(nw51Var, lw51.a)) {
                        ybStateResponse$YbState = YbStateResponse$YbState.UNAUTHENTICATED;
                    } else if (jl40.l(nw51Var, kw51.b)) {
                        ybStateResponse$YbState = YbStateResponse$YbState.UNAUTHORIZED;
                    } else {
                        if (!(nw51Var instanceof jw51)) {
                            w511.b();
                            return null;
                        }
                        ybStateResponse$YbState = YbStateResponse$YbState.NORMAL;
                    }
                    if (nw51Var instanceof jw51) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList2 = ((jw51) nw51Var).b;
                        arrayList = new ArrayList(tcc.n(arrayList2, 10));
                        Iterator it = arrayList2.iterator();
                        if (it.hasNext()) {
                            throw unr0.i(it);
                        }
                    }
                    return new rx51(ybStateResponse$YbState, mv51Var2 != null ? new os51(mv51Var2.a.toPlainString(), mv51Var2.b) : null, arrayList);
                }
                nohVar = (noh) superAppYbSdkDelegate$updateAndGetActiveBankState$1.L$1;
                kotlin.b.b(obj);
                mv51 mv51Var3 = (mv51) obj;
                superAppYbSdkDelegate$updateAndGetActiveBankState$1.L$0 = null;
                superAppYbSdkDelegate$updateAndGetActiveBankState$1.L$1 = null;
                superAppYbSdkDelegate$updateAndGetActiveBankState$1.L$2 = null;
                superAppYbSdkDelegate$updateAndGetActiveBankState$1.L$3 = mv51Var3;
                superAppYbSdkDelegate$updateAndGetActiveBankState$1.label = 2;
                if (nohVar.k(superAppYbSdkDelegate$updateAndGetActiveBankState$1) != coroutineSingletons) {
                    mv51Var = mv51Var3;
                    r0 r0Var2 = vVar.b.c().t;
                    superAppYbSdkDelegate$updateAndGetActiveBankState$1.L$0 = null;
                    superAppYbSdkDelegate$updateAndGetActiveBankState$1.L$1 = null;
                    superAppYbSdkDelegate$updateAndGetActiveBankState$1.L$2 = null;
                    superAppYbSdkDelegate$updateAndGetActiveBankState$1.L$3 = mv51Var;
                    superAppYbSdkDelegate$updateAndGetActiveBankState$1.label = 3;
                    obj = kotlinx.coroutines.flow.e.y(r0Var2, superAppYbSdkDelegate$updateAndGetActiveBankState$1);
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        superAppYbSdkDelegate$updateAndGetActiveBankState$1 = new SuperAppYbSdkDelegate$updateAndGetActiveBankState$1(vVar, continuationImpl);
        Object obj2 = superAppYbSdkDelegate$updateAndGetActiveBankState$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppYbSdkDelegate$updateAndGetActiveBankState$1.label;
        if (i != 0) {
        }
        mv51 mv51Var32 = (mv51) obj2;
        superAppYbSdkDelegate$updateAndGetActiveBankState$1.L$0 = null;
        superAppYbSdkDelegate$updateAndGetActiveBankState$1.L$1 = null;
        superAppYbSdkDelegate$updateAndGetActiveBankState$1.L$2 = null;
        superAppYbSdkDelegate$updateAndGetActiveBankState$1.L$3 = mv51Var32;
        superAppYbSdkDelegate$updateAndGetActiveBankState$1.label = 2;
        if (nohVar.k(superAppYbSdkDelegate$updateAndGetActiveBankState$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final void b(vgb vgbVar, gcn gcnVar) {
        BigDecimal bigDecimal;
        String str = vgbVar.a;
        os51 os51Var = vgbVar.b;
        String str2 = os51Var != null ? os51Var.a : null;
        if (str2 != null) {
            try {
                bigDecimal = new BigDecimal(str2);
            } catch (NumberFormatException e) {
                jst.e.k(e, "Wrong formatted bank money amount from web");
            }
            if (str != null || os51Var == null || bigDecimal == null) {
                gcnVar.a(new ck7(new bhb(CheckPaymentResponse$Result.DENIED, null), null));
            }
            this.c.getClass();
            sjh sjhVar = uyj.a;
            tje.N(this.f, mdh.b.plus(this.h), null, new SuperAppYbSdkDelegate$checkPayment$1(this, str, bigDecimal, os51Var, gcnVar, null), 2);
            return;
        }
        bigDecimal = null;
        if (str != null) {
        }
        gcnVar.a(new ck7(new bhb(CheckPaymentResponse$Result.DENIED, null), null));
    }

    public final void c(gcn gcnVar) {
        pzt0 pzt0Var = this.i;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        tse tseVar = this.f;
        this.c.getClass();
        sjh sjhVar = uyj.a;
        this.i = tje.N(tseVar, mdh.b.plus(this.h), null, new SuperAppYbSdkDelegate$getYbState$1(this, gcnVar, null), 2);
    }
}
