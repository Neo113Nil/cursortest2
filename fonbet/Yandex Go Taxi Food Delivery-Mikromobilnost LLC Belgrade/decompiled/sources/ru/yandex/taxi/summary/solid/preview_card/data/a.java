package ru.yandex.taxi.summary.solid.preview_card.data;

import com.yandex.go.zone.dto.objects.SummaryCardPromo;
import defpackage.fev0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.hev0;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.r8s0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class a {
    public final fev0 a;
    public final tt2 b;
    public SummaryCardPromo d;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final kotlinx.coroutines.sync.a e = gtq0.a();

    public a(fev0 fev0Var, tt2 tt2Var) {
        this.a = fev0Var;
        this.b = tt2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:11:0x004a, B:12:0x0056, B:14:0x005c, B:17:0x006b, B:19:0x006f, B:21:0x0073, B:22:0x0079, B:24:0x007d, B:26:0x0081, B:27:0x0085), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        SummaryCardPromoStateAppearanceRepository$getStateAppearanceByTariffName$1 summaryCardPromoStateAppearanceRepository$getStateAppearanceByTariffName$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        Iterator it;
        Object obj;
        SummaryCardPromo.ShowPolicy showPolicy;
        SummaryCardPromo.ShowPolicy showPolicy2;
        try {
            if (continuationImpl instanceof SummaryCardPromoStateAppearanceRepository$getStateAppearanceByTariffName$1) {
                summaryCardPromoStateAppearanceRepository$getStateAppearanceByTariffName$1 = (SummaryCardPromoStateAppearanceRepository$getStateAppearanceByTariffName$1) continuationImpl;
                int i2 = summaryCardPromoStateAppearanceRepository$getStateAppearanceByTariffName$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    summaryCardPromoStateAppearanceRepository$getStateAppearanceByTariffName$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = summaryCardPromoStateAppearanceRepository$getStateAppearanceByTariffName$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = summaryCardPromoStateAppearanceRepository$getStateAppearanceByTariffName$1.label;
                    if (i != 0) {
                        b.b(obj2);
                        summaryCardPromoStateAppearanceRepository$getStateAppearanceByTariffName$1.L$0 = str;
                        aVar = this.e;
                        summaryCardPromoStateAppearanceRepository$getStateAppearanceByTariffName$1.L$1 = aVar;
                        summaryCardPromoStateAppearanceRepository$getStateAppearanceByTariffName$1.label = 1;
                        if (aVar.a(summaryCardPromoStateAppearanceRepository$getStateAppearanceByTariffName$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) summaryCardPromoStateAppearanceRepository$getStateAppearanceByTariffName$1.L$1;
                        String str2 = (String) summaryCardPromoStateAppearanceRepository$getStateAppearanceByTariffName$1.L$0;
                        b.b(obj2);
                        aVar = r6;
                        str = str2;
                    }
                    it = this.c.values().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        hev0 hev0Var = (hev0) obj;
                        if (jl40.l(hev0Var.b, str)) {
                            SummaryCardPromo summaryCardPromo = hev0Var.d;
                            String str3 = (summaryCardPromo == null || (showPolicy2 = summaryCardPromo.g) == null) ? null : showPolicy2.a;
                            SummaryCardPromo summaryCardPromo2 = this.d;
                            if (jl40.l(str3, (summaryCardPromo2 == null || (showPolicy = summaryCardPromo2.g) == null) ? null : showPolicy.a)) {
                                break;
                            }
                        }
                    }
                    aVar.d(null);
                    return obj;
                }
            }
            it = this.c.values().iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            aVar.d(null);
            return obj;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        summaryCardPromoStateAppearanceRepository$getStateAppearanceByTariffName$1 = new SummaryCardPromoStateAppearanceRepository$getStateAppearanceByTariffName$1(this, continuationImpl);
        Object obj22 = summaryCardPromoStateAppearanceRepository$getStateAppearanceByTariffName$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryCardPromoStateAppearanceRepository$getStateAppearanceByTariffName$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
    
        if (r2 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(hev0 hev0Var, SummaryCardPromo summaryCardPromo, ContinuationImpl continuationImpl) {
        SummaryCardPromoStateAppearanceRepository$syncWithDataSource$1 summaryCardPromoStateAppearanceRepository$syncWithDataSource$1;
        Object obj;
        int i;
        SummaryCardPromo.ShowPolicy showPolicy;
        String str;
        Object k0;
        int i2;
        Object c;
        if (continuationImpl instanceof SummaryCardPromoStateAppearanceRepository$syncWithDataSource$1) {
            summaryCardPromoStateAppearanceRepository$syncWithDataSource$1 = (SummaryCardPromoStateAppearanceRepository$syncWithDataSource$1) continuationImpl;
            int i3 = summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.label;
                if (i != 0) {
                    b.b(obj2);
                    this.d = summaryCardPromo;
                    SummaryCardPromo summaryCardPromo2 = hev0Var.d;
                    if (summaryCardPromo2 == null || (showPolicy = summaryCardPromo2.g) == null || (str = showPolicy.a) == null) {
                        return zy11.a;
                    }
                    summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.L$0 = hev0Var;
                    summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.L$1 = summaryCardPromo;
                    summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.L$2 = str;
                    summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.label = 1;
                    fev0 fev0Var = this.a;
                    fev0Var.a.getClass();
                    sjh sjhVar = uyj.a;
                    k0 = tje.k0(mdh.b, new SummaryCardPromoShowPolicyDataSource$getShowPolicy$2(fev0Var, str, null), summaryCardPromoStateAppearanceRepository$syncWithDataSource$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                        b.b(obj2);
                        return obj2;
                    }
                    String str2 = (String) summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.L$2;
                    summaryCardPromo = (SummaryCardPromo) summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.L$1;
                    hev0 hev0Var2 = (hev0) summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.L$0;
                    b.b(obj2);
                    str = str2;
                    hev0Var = hev0Var2;
                    k0 = obj2;
                }
                r8s0 r8s0Var = (r8s0) k0;
                i2 = r8s0Var.b;
                if (i2 == 0 || r8s0Var.c != 0) {
                    hev0 a = hev0.a(hev0Var, i2, summaryCardPromo, 3);
                    summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.L$0 = null;
                    summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.L$1 = null;
                    summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.L$2 = null;
                    summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.L$3 = null;
                    summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.L$4 = null;
                    summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.label = 3;
                    c = c(str, a, summaryCardPromoStateAppearanceRepository$syncWithDataSource$1);
                    if (c != obj) {
                        return c;
                    }
                } else {
                    summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.L$0 = null;
                    summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.L$1 = null;
                    summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.L$2 = null;
                    summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.L$3 = null;
                    summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.label = 2;
                    Object c2 = c(str, hev0Var, summaryCardPromoStateAppearanceRepository$syncWithDataSource$1);
                    if (c2 != obj) {
                        return c2;
                    }
                }
                return obj;
            }
        }
        summaryCardPromoStateAppearanceRepository$syncWithDataSource$1 = new SummaryCardPromoStateAppearanceRepository$syncWithDataSource$1(this, continuationImpl);
        Object obj22 = summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.label;
        if (i != 0) {
        }
        r8s0 r8s0Var2 = (r8s0) k0;
        i2 = r8s0Var2.b;
        if (i2 == 0) {
        }
        hev0 a2 = hev0.a(hev0Var, i2, summaryCardPromo, 3);
        summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.L$0 = null;
        summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.L$1 = null;
        summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.L$2 = null;
        summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.L$3 = null;
        summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.L$4 = null;
        summaryCardPromoStateAppearanceRepository$syncWithDataSource$1.label = 3;
        c = c(str, a2, summaryCardPromoStateAppearanceRepository$syncWithDataSource$1);
        if (c != obj) {
            return obj;
        }
    }

    public final Object c(String str, hev0 hev0Var, ContinuationImpl continuationImpl) {
        this.b.getClass();
        Object k0 = tje.k0(uyj.a, new SummaryCardPromoStateAppearanceRepository$update$2(hev0Var, this, str, null), continuationImpl);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
