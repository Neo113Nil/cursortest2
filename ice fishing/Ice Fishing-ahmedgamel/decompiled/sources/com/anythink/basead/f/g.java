package com.anythink.basead.f;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.f.c;
import com.anythink.core.common.h.x;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class g extends c {
    public static final String i = "g";

    public g(Context context, c.b bVar, x xVar) {
        super(context, bVar, xVar);
    }

    public final void a(Activity activity, Map<String, Object> map) {
        String str;
        String str2 = "";
        try {
            if (!c()) {
                com.anythink.basead.g.a aVar = this.f9681e;
                if (aVar != null) {
                    aVar.onShowFailed(com.anythink.basead.d.g.a(com.anythink.basead.d.g.i, com.anythink.basead.d.g.f6935D));
                }
                this.f9680d = null;
                return;
            }
            try {
                Object obj = map.get("extra_scenario");
                str = obj != null ? obj.toString() : "";
            } catch (Throwable unused) {
                str = "";
            }
            int intValue = ((Integer) map.get(com.anythink.basead.h.c.f9787j)).intValue();
            String a9 = a(this.f9680d);
            HashMap hashMap = new HashMap(2);
            a(hashMap);
            if (this.f9678b != null) {
                str2 = this.f9678b.f14944d + this.f9678b.f14943c;
            }
            this.f9684h.a(activity, hashMap, intValue, a9, str, str2);
        } catch (Exception e9) {
            e9.printStackTrace();
            com.anythink.basead.g.a aVar2 = this.f9681e;
            if (aVar2 != null) {
                aVar2.onShowFailed(com.anythink.basead.d.g.a("-9999", e9.getMessage()));
            }
            this.f9680d = null;
        }
    }

    @Override // com.anythink.basead.f.c
    public final void b() {
        super.b();
        this.f9681e = null;
    }
}
