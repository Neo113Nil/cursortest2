package ru.yandex.taxi.masstransit.stop.interactor;

import android.content.Context;
import defpackage.a60;
import defpackage.ah00;
import defpackage.b140;
import defpackage.c140;
import defpackage.co40;
import defpackage.d140;
import defpackage.d6z;
import defpackage.dz00;
import defpackage.e140;
import defpackage.f140;
import defpackage.fu30;
import defpackage.gh00;
import defpackage.i040;
import defpackage.i240;
import defpackage.igu0;
import defpackage.is30;
import defpackage.j040;
import defpackage.jl40;
import defpackage.js30;
import defpackage.jst;
import defpackage.k040;
import defpackage.k110;
import defpackage.ks30;
import defpackage.l040;
import defpackage.ls30;
import defpackage.lyy0;
import defpackage.m040;
import defpackage.m540;
import defpackage.n040;
import defpackage.ny61;
import defpackage.o040;
import defpackage.oe61;
import defpackage.oyy0;
import defpackage.p040;
import defpackage.pt30;
import defpackage.q040;
import defpackage.qn5;
import defpackage.qt30;
import defpackage.qu;
import defpackage.r040;
import defpackage.rt30;
import defpackage.s040;
import defpackage.st30;
import defpackage.t040;
import defpackage.t130;
import defpackage.tcc;
import defpackage.thu0;
import defpackage.tj60;
import defpackage.tt30;
import defpackage.u040;
import defpackage.ut30;
import defpackage.v040;
import defpackage.v770;
import defpackage.vt30;
import defpackage.w140;
import defpackage.w211;
import defpackage.w511;
import defpackage.x140;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.masstransit.StopModalDto;
import ru.yandex.taxi.masstransit.analytic.CloseReason;
import ru.yandex.taxi.masstransit.analytic.MasstransitPurchaseAnalytics$PurchaseScenariosSource;
import ru.yandex.taxi.masstransit.stop.ui.MtErrorNotification;
import ru.yandex.taxi.masstransit.utils.RefreshState;

/* loaded from: classes6.dex */
public final class a {
    public final g a;
    public final b b;
    public final Context c;
    public final b140 d;
    public final oe61 e;
    public final dz00 f;
    public final tj60 g;
    public final i240 h;
    public final ah00 i;
    public final ls30 j;

    public a(g gVar, b bVar, Context context, b140 b140Var, oe61 oe61Var, dz00 dz00Var, tj60 tj60Var, i240 i240Var, ah00 ah00Var, ls30 ls30Var) {
        this.a = gVar;
        this.b = bVar;
        this.c = context;
        this.d = b140Var;
        this.e = oe61Var;
        this.f = dz00Var;
        this.g = tj60Var;
        this.h = i240Var;
        this.i = ah00Var;
        this.j = ls30Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        MtStopActionInteractor$showAddressResolvingError$1 mtStopActionInteractor$showAddressResolvingError$1;
        int i;
        k110 k110Var;
        boolean z;
        StopModalDto stopModalDto;
        String str;
        String str2;
        aVar.getClass();
        if (continuationImpl instanceof MtStopActionInteractor$showAddressResolvingError$1) {
            mtStopActionInteractor$showAddressResolvingError$1 = (MtStopActionInteractor$showAddressResolvingError$1) continuationImpl;
            int i2 = mtStopActionInteractor$showAddressResolvingError$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtStopActionInteractor$showAddressResolvingError$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtStopActionInteractor$showAddressResolvingError$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtStopActionInteractor$showAddressResolvingError$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dz00 dz00Var = aVar.f;
                    mtStopActionInteractor$showAddressResolvingError$1.label = 1;
                    obj = dz00Var.a.b(mtStopActionInteractor$showAddressResolvingError$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                k110Var = (k110) obj;
                z = k110Var.b;
                zy11 zy11Var = zy11.a;
                if (z && (stopModalDto = k110Var.k) != null) {
                    str = stopModalDto.b;
                    if (str == null) {
                        str = "";
                    }
                    String Y = d6z.Y(k110Var, str);
                    str2 = Y.length() != 0 ? Y : null;
                    if (str2 != null) {
                        tj60 tj60Var = aVar.g;
                        MtErrorNotification mtErrorNotification = new MtErrorNotification(aVar.c, null, 0, 6, null);
                        mtErrorNotification.setTitle(str2);
                        mtErrorNotification.setExpiresListener(new qn5(8, tj60Var, mtErrorNotification));
                        tj60Var.d(mtErrorNotification);
                    }
                }
                return zy11Var;
            }
        }
        mtStopActionInteractor$showAddressResolvingError$1 = new MtStopActionInteractor$showAddressResolvingError$1(aVar, continuationImpl);
        Object obj2 = mtStopActionInteractor$showAddressResolvingError$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtStopActionInteractor$showAddressResolvingError$1.label;
        if (i != 0) {
        }
        k110Var = (k110) obj2;
        z = k110Var.b;
        zy11 zy11Var2 = zy11.a;
        if (z) {
            str = stopModalDto.b;
            if (str == null) {
            }
            String Y2 = d6z.Y(k110Var, str);
            if (Y2.length() != 0) {
            }
            if (str2 != null) {
            }
        }
        return zy11Var2;
    }

    public final Object b(v040 v040Var, w140 w140Var, igu0 igu0Var, Continuation continuation) {
        String str;
        v770 v770Var = v770.c;
        zy11 zy11Var = zy11.a;
        if (jl40.l(v040Var, r040.a)) {
            co40 co40Var = this.d.a;
            String analyticsName = igu0Var.d.getAnalyticsName();
            String str2 = igu0Var.a;
            co40Var.getClass();
            HashMap hashMap = new HashMap();
            if (analyticsName != null) {
                hashMap.put("open_reason", analyticsName);
            }
            if (str2 != null) {
                hashMap.put("stop_id", str2);
            }
            co40Var.a.a("StopCard.Shown", hashMap, 1, new HashMap());
            return zy11Var;
        }
        int i = 9;
        if (jl40.l(v040Var, j040.a)) {
            co40.d(this.d.a, "close", igu0Var.d.getAnalyticsName(), null, igu0Var.a, 25);
            this.d.a(CloseReason.BACK_BUTTON, igu0Var);
            ((x140) w140Var).a.r(new qu(i));
            return zy11Var;
        }
        if (jl40.l(v040Var, n040.a)) {
            this.d.c = false;
            this.d.a(CloseReason.ROLL_OFF, igu0Var);
            return zy11Var;
        }
        if (jl40.l(v040Var, s040.a)) {
            this.d.a(CloseReason.SYSTEM_BACK, igu0Var);
            ((x140) w140Var).a.r(new qu(i));
            return zy11Var;
        }
        if (jl40.l(v040Var, m040.a)) {
            this.d.a.c("up", igu0Var.d.getAnalyticsName(), igu0Var.a);
            return zy11Var;
        }
        if (jl40.l(v040Var, l040.a)) {
            this.d.a.c("down", igu0Var.d.getAnalyticsName(), igu0Var.a);
            return zy11Var;
        }
        if (jl40.l(v040Var, p040.a)) {
            this.d.c = false;
            return zy11Var;
        }
        if (jl40.l(v040Var, q040.a)) {
            b140 b140Var = this.d;
            if (!b140Var.c) {
                b140Var.c = true;
                co40 co40Var2 = b140Var.a;
                String analyticsName2 = igu0Var.d.getAnalyticsName();
                String str3 = igu0Var.a;
                co40Var2.getClass();
                HashMap hashMap2 = new HashMap();
                if (analyticsName2 != null) {
                    hashMap2.put("open_reason", analyticsName2);
                }
                if (str3 != null) {
                    hashMap2.put("stop_id", str3);
                }
                co40Var2.a.a("StopCard.Opened", hashMap2, 1, new HashMap());
                return zy11Var;
            }
        } else {
            if (jl40.l(v040Var, k040.a)) {
                ((gh00) this.i).w();
                return zy11Var;
            }
            if (v040Var instanceof i040) {
                f140 f140Var = ((i040) v040Var).a;
                g gVar = this.a;
                c140 c140Var = c140.a;
                if (f140Var != null) {
                    b140 b140Var2 = this.d;
                    if (f140Var instanceof d140) {
                        str = "route_from";
                    } else if (f140Var.equals(e140.a)) {
                        str = "route_to";
                    } else {
                        if (!f140Var.equals(c140Var)) {
                            w511.b();
                            return null;
                        }
                        str = "refresh";
                    }
                    co40 co40Var3 = b140Var2.a;
                    co40Var3.getClass();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("button_type", str);
                    co40Var3.a.a("StopCard.Button.Tapped", hashMap3, 1, new HashMap());
                }
                if (f140Var instanceof d140) {
                    d140 d140Var = (d140) f140Var;
                    return gVar.b(d140Var, new MtStopActionInteractor$handleRouteFromAction$2(this, d140Var, w140Var, null), (ContinuationImpl) continuation);
                }
                if (f140Var instanceof e140) {
                    return gVar.b((e140) f140Var, new MtStopActionInteractor$handleRouteToAction$2(this, igu0Var, w140Var, null), (ContinuationImpl) continuation);
                }
                if (jl40.l(f140Var, c140Var)) {
                    this.h.a.g(RefreshState.ERROR_LOADING);
                    return zy11Var;
                }
                if (f140Var != null) {
                    w511.b();
                    return null;
                }
            } else {
                if (v040Var instanceof t040) {
                    this.e.a(((t040) v040Var).a);
                    return zy11Var;
                }
                if (v040Var instanceof o040) {
                    oyy0 oyy0Var = ((o040) v040Var).a;
                    if (oyy0Var instanceof lyy0) {
                        m540 m540Var = ((lyy0) oyy0Var).i;
                        thu0 thu0Var = m540Var instanceof thu0 ? (thu0) m540Var : null;
                        b140 b140Var3 = this.d;
                        if (thu0Var != null) {
                            w211 w211Var = thu0Var.b;
                            co40.d(b140Var3.a, "select_route", igu0Var.d.getAnalyticsName(), w211Var.a, igu0Var.a, 17);
                            b140Var3.a(CloseReason.SELECT_ROUTE, igu0Var);
                            ((x140) w140Var).a.r(new t130(8, thu0Var.a, w211Var));
                            return zy11Var;
                        }
                        if (thu0Var != null) {
                            w511.b();
                            return null;
                        }
                    }
                } else {
                    if (!(v040Var instanceof u040)) {
                        w511.b();
                        return null;
                    }
                    vt30 vt30Var = ((u040) v040Var).a;
                    ls30 ls30Var = this.j;
                    if (vt30Var instanceof tt30) {
                        ks30 ks30Var = ((tt30) vt30Var).a;
                        if (ks30Var instanceof is30) {
                            ((a60) ((x140) w140Var).a.S).c(((is30) ks30Var).a, v770Var);
                            return zy11Var;
                        }
                        if (ks30Var instanceof js30) {
                            jst.e.getClass();
                            return zy11Var;
                        }
                        w511.b();
                        return null;
                    }
                    if (vt30Var instanceof ut30) {
                        String str4 = ((ut30) vt30Var).a;
                        if (str4 != null) {
                            ((a60) ((x140) w140Var).a.S).c(str4, v770Var);
                            return zy11Var;
                        }
                    } else {
                        if (vt30Var instanceof st30) {
                            ArrayList arrayList = ((st30) vt30Var).a;
                            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((fu30) it.next()).c);
                            }
                            ls30Var.c(arrayList2, MasstransitPurchaseAnalytics$PurchaseScenariosSource.StopCard);
                            return zy11Var;
                        }
                        if (vt30Var instanceof pt30) {
                            ls30Var.a(Collections.singletonList(((pt30) vt30Var).a.c), MasstransitPurchaseAnalytics$PurchaseScenariosSource.StopCard);
                            return zy11Var;
                        }
                        if (vt30Var instanceof qt30) {
                            ls30Var.b(MasstransitPurchaseAnalytics$PurchaseScenariosSource.StopCard);
                            return zy11Var;
                        }
                        if (!(vt30Var instanceof rt30)) {
                            w511.b();
                            return null;
                        }
                    }
                }
            }
        }
        return zy11Var;
    }
}
