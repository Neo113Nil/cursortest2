package defpackage;

import android.content.Context;
import com.yandex.go.mob.HostMobSupportedApiNames;
import com.yandex.messenger.websdk.api.MessengerAnalyticsFactory;
import com.yandex.messenger.websdk.api.MessengerParams;
import com.yandex.messenger.websdk.api.NotificationDecorator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class rh41 {
    public final Context a;
    public final MessengerAnalyticsFactory b;
    public final n220 c;
    public final NotificationDecorator d;
    public final b03 e;
    public final kb20 f;
    public final am2 g;

    public rh41(Context context, MessengerAnalyticsFactory messengerAnalyticsFactory, n220 n220Var, NotificationDecorator notificationDecorator, b03 b03Var, kb20 kb20Var, am2 am2Var) {
        this.a = context;
        this.b = messengerAnalyticsFactory;
        this.c = n220Var;
        this.d = notificationDecorator;
        this.e = b03Var;
        this.f = kb20Var;
        this.g = am2Var;
    }

    public final MessengerParams a(long j, String str, boolean z, boolean z2, boolean z3, String str2) {
        String j2 = b64.j(this.e.getApplicationId(), "_release");
        String a = this.f.a();
        am2 am2Var = this.g;
        fpt fptVar = (fpt) am2Var.c;
        ipt iptVar = (ipt) am2Var.b;
        Map map = ((kl20) iptVar.a.get()).e(iptVar.b.a().a, HostMobSupportedApiNames.WEB_MSNGR.getApiName(), HostMobSupportedApiNames.WEB_MSNGR_WEB.getApiName(), HostMobSupportedApiNames.WEB_MSNGR_YNDX.getApiName()).b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((iq20) entry.getValue()).a.a.d);
        }
        fptVar.getClass();
        String str3 = (String) linkedHashMap.get("WEB_MSNGR_WEB");
        String str4 = (String) linkedHashMap.get("WEB_MSNGR_YNDX");
        String str5 = (String) linkedHashMap.get("WEB_MSNGR");
        hst hstVar = jst.e;
        linkedHashMap.toString();
        hstVar.getClass();
        ((u02) am2Var.a).getClass();
        return new MessengerParams(j2, j, str, a, (linkedHashMap.isEmpty() || str3 == null || str4 == null || str5 == null) ? l120.b : new j120(str5, str4, str3), z, z2, z3, (str2 == null || str2.length() == 0) ? null : new y220(str2));
    }
}
