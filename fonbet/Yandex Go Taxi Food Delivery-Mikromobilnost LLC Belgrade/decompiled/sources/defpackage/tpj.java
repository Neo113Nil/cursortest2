package defpackage;

import com.yandex.go.promocodes.base.impl.discounts.domain.analytics.ItemType;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralService;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.profile.a;

/* loaded from: classes13.dex */
public final class tpj {
    public final o61 a;
    public final u8w b;
    public final co40 c;
    public final u8w d;
    public final a e;
    public final g f;

    public tpj(o61 o61Var, u8w u8wVar, co40 co40Var, u8w u8wVar2, a aVar, g gVar) {
        this.a = o61Var;
        this.b = u8wVar;
        this.c = co40Var;
        this.d = u8wVar2;
        this.e = aVar;
        this.f = gVar;
    }

    public final void a() {
        co40 co40Var = this.c;
        co40Var.getClass();
        co40Var.a.a("PromoCodes.Deleted", new HashMap(), 1, new HashMap());
        o61 o61Var = this.a;
        o61Var.getClass();
        o61Var.a.a("Main.Deleted", new HashMap(), 1, new HashMap());
        u8w u8wVar = this.b;
        u8wVar.getClass();
        u8wVar.a.a("Menu.Deleted", new HashMap(), 1, new HashMap());
        u8w u8wVar2 = this.d;
        u8wVar2.getClass();
        u8wVar2.a.a("ReferralDiscountPromo.Deleted", new HashMap(), 1, new HashMap());
    }

    public final void b(ItemType itemType, ReferralService referralService) {
        String analyticsName = referralService == ReferralService.UNKNOWN ? ReferralService.TAXI.getAnalyticsName() : referralService.getAnalyticsName();
        c(itemType, analyticsName, null);
        String value = itemType.getValue();
        u8w u8wVar = this.d;
        u8wVar.getClass();
        pho phoVar = u8wVar.a;
        HashMap hashMap = new HashMap();
        if (value != null) {
            hashMap.put("button_name", value);
        }
        if (analyticsName != null) {
            hashMap.put(Constants.KEY_SERVICE, analyticsName);
        }
        phoVar.a("ReferralDiscountPromo.PromoCodeTapped", hashMap, 1, new HashMap());
        String value2 = itemType.getValue();
        HashMap hashMap2 = new HashMap();
        if (value2 != null) {
            hashMap2.put("button_name", value2);
        }
        if (analyticsName != null) {
            hashMap2.put(Constants.KEY_SERVICE, analyticsName);
        }
        phoVar.a("ReferralDiscountPromo.Tapped", hashMap2, 1, new HashMap());
    }

    public final void c(ItemType itemType, String str, String str2) {
        String value = itemType.getValue();
        co40 co40Var = this.c;
        co40Var.getClass();
        pho phoVar = co40Var.a;
        HashMap hashMap = new HashMap();
        if (value != null) {
            hashMap.put("button_name", value);
        }
        if (str2 != null) {
            hashMap.put("promocode", str2);
        }
        if (str != null) {
            hashMap.put(Constants.KEY_SERVICE, str);
        }
        phoVar.a("PromoCodes.Tapped", hashMap, 1, new HashMap());
        String value2 = itemType.getValue();
        HashMap hashMap2 = new HashMap();
        if (value2 != null) {
            hashMap2.put("button_name", value2);
        }
        if (str2 != null) {
            hashMap2.put("promocode", str2);
        }
        if (str != null) {
            hashMap2.put(Constants.KEY_SERVICE, str);
        }
        phoVar.a("PromoCodes.PromoCodeTapped", hashMap2, 1, new HashMap());
        String value3 = itemType.getValue();
        o61 o61Var = this.a;
        o61Var.getClass();
        HashMap hashMap3 = new HashMap();
        if (value3 != null) {
            hashMap3.put("button_name", value3);
        }
        if (str2 != null) {
            hashMap3.put("promocode", str2);
        }
        if (str != null) {
            hashMap3.put(Constants.KEY_SERVICE, str);
        }
        o61Var.a.a("Main.PromoCodeTapped", hashMap3, 1, new HashMap());
        String value4 = itemType.getValue();
        u8w u8wVar = this.b;
        u8wVar.getClass();
        HashMap hashMap4 = new HashMap();
        if (value4 != null) {
            hashMap4.put("button_name", value4);
        }
        if (str2 != null) {
            hashMap4.put("promocode", str2);
        }
        if (str != null) {
            hashMap4.put(Constants.KEY_SERVICE, str);
        }
        u8wVar.a.a("Menu.Tapped", hashMap4, 1, new HashMap());
    }
}
