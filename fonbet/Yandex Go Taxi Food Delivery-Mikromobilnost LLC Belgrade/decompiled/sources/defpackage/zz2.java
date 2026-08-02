package defpackage;

import com.adjust.sdk.Constants;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zz2 {
    public final pho a;

    public zz2(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(boolean z, boolean z2, String str, String str2) {
        HashMap hashMap = new HashMap();
        oo31.q(z, hashMap, "is_cold_launch", z2, "is_opened_by_deeplink");
        hashMap.put("time_since_app_launch_sec", str);
        if (str2 != null) {
            hashMap.put(Constants.DEEPLINK, str2);
        }
        this.a.a("Application.Resumed", hashMap, 2, new HashMap());
    }

    public final void b(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("resolved_theme", str2);
        }
        if (str3 != null) {
            hashMap.put("system_theme", str3);
        }
        if (str4 != null) {
            hashMap.put("theme_state", str4);
        }
        x4e.B(this.a, str, hashMap, 1);
    }
}
