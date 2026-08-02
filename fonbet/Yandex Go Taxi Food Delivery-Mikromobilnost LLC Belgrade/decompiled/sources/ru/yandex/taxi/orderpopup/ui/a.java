package ru.yandex.taxi.orderpopup.ui;

import android.content.SharedPreferences;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.ad5;
import defpackage.cne0;
import defpackage.d6c;
import defpackage.eu6;
import defpackage.g8e;
import defpackage.gu6;
import defpackage.iu6;
import defpackage.mth;
import defpackage.mx70;
import defpackage.ntv;
import defpackage.ny61;
import defpackage.t380;
import defpackage.tje;
import defpackage.tse0;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.orderpopup.analytics.OrderPopupAnalytics$Screen;

/* loaded from: classes6.dex */
public final class a extends ad5 {
    public final iu6 A;
    public final t380 B;
    public final OrderPopupAnalytics$Screen x;
    public final String y;
    public final wiq0 z;

    public a(OrderPopupAnalytics$Screen orderPopupAnalytics$Screen, String str, wiq0 wiq0Var, iu6 iu6Var, t380 t380Var) {
        super(eu6.class);
        this.x = orderPopupAnalytics$Screen;
        this.y = str;
        this.z = wiq0Var;
        this.A = iu6Var;
        this.B = t380Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(a aVar, ContinuationImpl continuationImpl) {
        BulletsOrderPopupPresenter$closeOnTariffChange$1 bulletsOrderPopupPresenter$closeOnTariffChange$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof BulletsOrderPopupPresenter$closeOnTariffChange$1) {
            bulletsOrderPopupPresenter$closeOnTariffChange$1 = (BulletsOrderPopupPresenter$closeOnTariffChange$1) continuationImpl;
            int i2 = bulletsOrderPopupPresenter$closeOnTariffChange$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bulletsOrderPopupPresenter$closeOnTariffChange$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bulletsOrderPopupPresenter$closeOnTariffChange$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bulletsOrderPopupPresenter$closeOnTariffChange$1.label;
                if (i != 0) {
                    b.b(obj);
                    mth mthVar = new mth(((k) aVar.z).g(), 4);
                    bulletsOrderPopupPresenter$closeOnTariffChange$1.label = 1;
                    if (e.y(mthVar, bulletsOrderPopupPresenter$closeOnTariffChange$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                ((eu6) aVar.Dg()).close();
                return zy11.a;
            }
        }
        bulletsOrderPopupPresenter$closeOnTariffChange$1 = new BulletsOrderPopupPresenter$closeOnTariffChange$1(aVar, continuationImpl);
        Object obj2 = bulletsOrderPopupPresenter$closeOnTariffChange$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bulletsOrderPopupPresenter$closeOnTariffChange$1.label;
        if (i != 0) {
        }
        ((eu6) aVar.Dg()).close();
        return zy11.a;
    }

    public final void Lg(eu6 eu6Var) {
        String str;
        String str2;
        Bg(eu6Var);
        OrderPopupAnalytics$Screen orderPopupAnalytics$Screen = OrderPopupAnalytics$Screen.INTERCITY_DASHBOARD;
        OrderPopupAnalytics$Screen orderPopupAnalytics$Screen2 = this.x;
        if (orderPopupAnalytics$Screen2 != orderPopupAnalytics$Screen) {
            tje.N(Jg(), null, null, new BulletsOrderPopupPresenter$attachView$1(this, null), 3);
        }
        iu6 iu6Var = this.A;
        iu6Var.getClass();
        cne0 cne0Var = iu6Var.a;
        String str3 = this.y;
        String o = g8e.o("bullets_order_popup_show_count", str3);
        String o2 = g8e.o("bullets_order_popup_last_shown_time_for_id_", str3);
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = cne0Var.k().edit();
        edit.putInt(o, cne0Var.i("bullets_order_popup_show_count" + str3, 0) + 1);
        edit.putLong(o2, currentTimeMillis);
        edit.apply();
        iu6Var.b.g(zy11.a);
        int i = gu6.a[orderPopupAnalytics$Screen2.ordinal()];
        t380 t380Var = this.B;
        if (i == 1) {
            ntv ntvVar = iu6Var.c;
            mx70 mx70Var = t380Var.b;
            if (ntvVar != null) {
                str = ((xnt) t380Var.a).e(ntvVar, ntv.Companion.serializer());
            } else {
                str = null;
            }
            mx70.b(mx70Var, str, "summary_screen", null, 4);
            return;
        }
        if (i == 2) {
            mx70.b(t380Var.b, null, "active_order", "combo", 1);
            return;
        }
        if (i != 3) {
            w511.b();
            return;
        }
        ntv ntvVar2 = iu6Var.c;
        mx70 mx70Var2 = t380Var.b;
        if (ntvVar2 != null) {
            str2 = ((xnt) t380Var.a).e(ntvVar2, ntv.Companion.serializer());
        } else {
            str2 = null;
        }
        mx70.b(mx70Var2, str2, "intercity_dashboard", null, 4);
    }

    public final void Mg(Integer num, Long l, String str, String str2) {
        if (this.x == OrderPopupAnalytics$Screen.SUMMARY) {
            this.B.a(str, str2, num, l, this.A.c);
        }
    }

    public final void Ng(String str) {
        String str2;
        if (this.x == OrderPopupAnalytics$Screen.SUMMARY) {
            ntv ntvVar = this.A.c;
            t380 t380Var = this.B;
            wnt wntVar = t380Var.a;
            d6c d6cVar = new d6c(str);
            mx70 mx70Var = t380Var.b;
            if (ntvVar != null) {
                str2 = ((xnt) wntVar).e(ntvVar, ntv.Companion.serializer());
            } else {
                str2 = null;
            }
            String e = ((xnt) wntVar).e(d6cVar, d6c.Companion.serializer());
            mx70Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("source", "summary_screen");
            if (str2 != null) {
                hashMap.put("InfoModalCardParams", str2);
            }
            mx70Var.a.a("OrderInfoCard.Closed", hashMap, 1, tse0.r("ClosedReasonParams", hashMap, e));
        }
    }
}
