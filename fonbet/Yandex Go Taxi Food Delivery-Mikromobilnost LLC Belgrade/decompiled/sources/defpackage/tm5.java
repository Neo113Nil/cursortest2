package defpackage;

import com.yandex.go.benefits_center.benefits.analytics.BenefitsCenterAnalytics$BenefitsCenterTappedType;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class tm5 {
    public final pho a;

    public tm5(pho phoVar) {
        this.a = phoVar;
    }

    public static void a(tm5 tm5Var, String str, BenefitsCenterAnalytics$BenefitsCenterTappedType benefitsCenterAnalytics$BenefitsCenterTappedType) {
        tm5Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("open_reason", str);
        hashMap.put("type", benefitsCenterAnalytics$BenefitsCenterTappedType.getEventValue());
        tm5Var.a.a("BenefitsCenter.Promocodes.Tapped", hashMap, 1, new HashMap());
    }
}
