package defpackage;

import com.yandex.go.promocodes.referral.api.net.dto.ReferralService;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes13.dex */
public final class tmf0 {
    public static final List c = scc.g("action_button", "share", "cancel", "back_button");
    public final lx4 a;
    public final v770 b;

    public tmf0(lx4 lx4Var, v770 v770Var) {
        this.a = lx4Var;
        this.b = v770Var;
    }

    public final void a(String str, ReferralService referralService, int i, boolean z) {
        i d = ((j) this.a).d("Referral.Tapped");
        String analyticsName = referralService == ReferralService.UNKNOWN ? ReferralService.TAXI.getAnalyticsName() : referralService.getAnalyticsName();
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put(Constants.KEY_SERVICE, analyticsName);
        d.b(i, "rides_left");
        linkedHashMap.put("open_reason", this.b.a);
        linkedHashMap.put("button_list", c);
        linkedHashMap.put("button_name", str);
        d.g("is_new_screen", z);
        d.m();
    }

    public final void b(String str, ReferralService referralService, int i, boolean z) {
        i d = ((j) this.a).d("Referral.Closed");
        String analyticsName = referralService == ReferralService.UNKNOWN ? ReferralService.TAXI.getAnalyticsName() : referralService.getAnalyticsName();
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put(Constants.KEY_SERVICE, analyticsName);
        d.b(i, "rides_left");
        linkedHashMap.put("open_reason", this.b.a);
        linkedHashMap.put("button_list", c);
        linkedHashMap.put("close_reason", str);
        d.g("is_new_screen", z);
        d.m();
    }

    public final void c(ReferralService referralService, int i, boolean z) {
        List g = scc.g("share", "action_button", "cancel", "back_button");
        i d = ((j) this.a).d("Referral.Shown");
        String analyticsName = referralService == ReferralService.UNKNOWN ? ReferralService.TAXI.getAnalyticsName() : referralService.getAnalyticsName();
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put(Constants.KEY_SERVICE, analyticsName);
        d.b(i, "rides_left");
        linkedHashMap.put("open_reason", this.b.a);
        linkedHashMap.put("button_list", g);
        d.g("is_new_screen", z);
        d.m();
    }
}
