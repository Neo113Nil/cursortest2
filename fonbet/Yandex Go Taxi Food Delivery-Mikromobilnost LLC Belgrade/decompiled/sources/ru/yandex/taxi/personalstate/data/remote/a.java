package ru.yandex.taxi.personalstate.data.remote;

import com.yandex.go.payments.data.model.response.Card;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.c6b0;
import defpackage.d6b0;
import defpackage.fga0;
import defpackage.fl8;
import defpackage.g4z;
import defpackage.h3y;
import defpackage.ny61;
import defpackage.w6b0;
import defpackage.wfa0;
import defpackage.ww90;
import defpackage.x4e;
import defpackage.xku0;
import defpackage.z6b0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.personalstate.domain.interactor.g;

/* loaded from: classes9.dex */
public final class a {
    public final w6b0 a;
    public final c6b0 b;
    public final z6b0 c;
    public final xku0 d;
    public final h3y e;

    public a(w6b0 w6b0Var, c6b0 c6b0Var, z6b0 z6b0Var, xku0 xku0Var, h3y h3yVar) {
        this.a = w6b0Var;
        this.b = c6b0Var;
        this.c = z6b0Var;
        this.d = xku0Var;
        this.e = h3yVar;
    }

    public static String f(String str, Map map) {
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final void a(g4z g4zVar) {
        d6b0 d6b0Var = new d6b0();
        g4zVar.invoke(d6b0Var);
        LinkedHashMap linkedHashMap = d6b0Var.a;
        String f = f(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, linkedHashMap);
        String f2 = f("vertical", linkedHashMap);
        c6b0 c6b0Var = this.b;
        c6b0Var.getClass();
        HashMap hashMap = new HashMap();
        if (f != null) {
            hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, f);
        }
        if (f2 != null) {
            hashMap.put("vertical", f2);
        }
        c6b0Var.a.a("PersonalState.Local.Saved", hashMap, 1, new HashMap());
    }

    public final void b(String str, String str2, String str3, String str4) {
        c6b0 c6b0Var = this.b;
        c6b0Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("before_tariff_class", str);
        }
        if (str2 != null) {
            hashMap.put("before_vertical_id", str2);
        }
        if (str3 != null) {
            hashMap.put("desired_tariff_class", str3);
        }
        if (str4 != null) {
            hashMap.put("desired_vertical_id", str4);
        }
        x4e.B(c6b0Var.a, "PersonalState.Tariff.Selection", hashMap, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        PersonalStateAnalyticsImpl$reportPromoTariffList$1 personalStateAnalyticsImpl$reportPromoTariffList$1;
        int i;
        if (continuationImpl instanceof PersonalStateAnalyticsImpl$reportPromoTariffList$1) {
            personalStateAnalyticsImpl$reportPromoTariffList$1 = (PersonalStateAnalyticsImpl$reportPromoTariffList$1) continuationImpl;
            int i2 = personalStateAnalyticsImpl$reportPromoTariffList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                personalStateAnalyticsImpl$reportPromoTariffList$1.label = i2 - Integer.MIN_VALUE;
                Object obj = personalStateAnalyticsImpl$reportPromoTariffList$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = personalStateAnalyticsImpl$reportPromoTariffList$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    wfa0 wfa0Var = (wfa0) this.e.get();
                    xku0 xku0Var = this.d;
                    fga0 fga0Var = xku0Var.a;
                    fga0Var.getClass();
                    Card g = fga0Var.g(fga0Var.q(PaymentMethod$Type.CARD));
                    fl8 a = g != null ? xku0Var.c.a(g, true) : null;
                    String str = a != null ? a.a : null;
                    personalStateAnalyticsImpl$reportPromoTariffList$1.label = 1;
                    obj = ((g) wfa0Var).b(str, personalStateAnalyticsImpl$reportPromoTariffList$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                c6b0 c6b0Var = this.b;
                c6b0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("tariffs_list", (List) obj);
                c6b0Var.a.a("PersonalState.PromoTariffList", hashMap, 1, new HashMap());
                return zy11.a;
            }
        }
        personalStateAnalyticsImpl$reportPromoTariffList$1 = new PersonalStateAnalyticsImpl$reportPromoTariffList$1(this, continuationImpl);
        Object obj3 = personalStateAnalyticsImpl$reportPromoTariffList$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalStateAnalyticsImpl$reportPromoTariffList$1.label;
        if (i != 0) {
        }
        c6b0 c6b0Var2 = this.b;
        c6b0Var2.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("tariffs_list", (List) obj3);
        c6b0Var2.a.a("PersonalState.PromoTariffList", hashMap2, 1, new HashMap());
        return zy11.a;
    }

    public final void d(g4z g4zVar) {
        d6b0 d6b0Var = new d6b0();
        g4zVar.invoke(d6b0Var);
        LinkedHashMap linkedHashMap = d6b0Var.a;
        String f = f(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, linkedHashMap);
        String f2 = f("vertical", linkedHashMap);
        c6b0 c6b0Var = this.b;
        c6b0Var.getClass();
        HashMap hashMap = new HashMap();
        if (f != null) {
            hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, f);
        }
        if (f2 != null) {
            hashMap.put("vertical", f2);
        }
        c6b0Var.a.a("PersonalState.Remote.Loaded", hashMap, 1, new HashMap());
    }

    public final void e(ww90 ww90Var) {
        d6b0 d6b0Var = new d6b0();
        ww90Var.invoke(d6b0Var);
        LinkedHashMap linkedHashMap = d6b0Var.a;
        String f = f(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, linkedHashMap);
        String f2 = f("vertical", linkedHashMap);
        String f3 = f("save_trigger", linkedHashMap);
        c6b0 c6b0Var = this.b;
        c6b0Var.getClass();
        HashMap hashMap = new HashMap();
        if (f3 != null) {
            hashMap.put("save_trigger", f3);
        }
        if (f != null) {
            hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, f);
        }
        if (f2 != null) {
            hashMap.put("vertical", f2);
        }
        c6b0Var.a.a("PersonalState.Remote.Saved", hashMap, 1, new HashMap());
    }
}
