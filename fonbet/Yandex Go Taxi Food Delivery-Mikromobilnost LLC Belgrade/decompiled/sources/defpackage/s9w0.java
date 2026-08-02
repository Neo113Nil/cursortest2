package defpackage;

import com.yandex.go.superapp_carts.analytics.SuperappCartsAnalytics$ScreenState;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class s9w0 {
    public final pho a;

    public s9w0(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(SuperappCartsAnalytics$ScreenState superappCartsAnalytics$ScreenState, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("screen_state", superappCartsAnalytics$ScreenState.getEventValue());
        if (str != null) {
            hashMap.put("search_session_id", str);
        }
        this.a.a("SuperappCarts.Back.Tapped", hashMap, 1, new HashMap());
    }
}
