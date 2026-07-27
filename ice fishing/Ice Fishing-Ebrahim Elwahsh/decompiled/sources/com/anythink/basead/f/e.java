package com.anythink.basead.f;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.f.c;
import com.anythink.core.common.h.x;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class e extends c {
    public static final String i = "e";

    public e(Context context, c.b bVar, x xVar) {
        super(context, bVar, xVar);
    }

    public final void a(Activity activity, Map<String, Object> map) {
        String str;
        String str2 = "";
        try {
            if (!c()) {
                com.anythink.basead.g.a aVar = this.f9052e;
                if (aVar != null) {
                    aVar.onShowFailed(com.anythink.basead.d.g.a(com.anythink.basead.d.g.i, com.anythink.basead.d.g.f6306D));
                }
                this.f9051d = null;
                return;
            }
            try {
                Object obj = map.get("extra_scenario");
                str = obj != null ? obj.toString() : "";
            } catch (Throwable unused) {
                str = "";
            }
            int intValue = ((Integer) map.get(com.anythink.basead.h.c.f9158j)).intValue();
            String a9 = a(this.f9051d);
            HashMap hashMap = new HashMap(2);
            a(hashMap);
            if (this.f9049b != null) {
                str2 = this.f9049b.f14315d + this.f9049b.f14314c;
            }
            this.f9055h.b(activity, hashMap, intValue, a9, str, str2);
        } catch (Exception e6) {
            e6.printStackTrace();
            com.anythink.basead.g.a aVar2 = this.f9052e;
            if (aVar2 != null) {
                aVar2.onShowFailed(com.anythink.basead.d.g.a("-9999", e6.getMessage()));
            }
            this.f9051d = null;
        }
    }

    @Override // com.anythink.basead.f.c
    public final void b() {
        super.b();
        this.f9052e = null;
    }
}
