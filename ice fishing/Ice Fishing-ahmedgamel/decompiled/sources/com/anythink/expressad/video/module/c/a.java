package com.anythink.expressad.video.module.c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.anythink.expressad.foundation.g.f.h.b;
import com.anythink.expressad.foundation.h.n;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a extends com.anythink.expressad.foundation.g.f.h.a {
    public a(Context context) {
        super(context);
    }

    @Override // com.anythink.expressad.foundation.g.f.h.a
    public final void a(String str, b bVar) {
        super.a(str, bVar);
        bVar.a("platform", "1");
        bVar.a(com.anythink.expressad.foundation.g.a.bh, Build.VERSION.RELEASE);
        bVar.a("package_name", n.i(this.f20139a));
        bVar.a(com.anythink.expressad.foundation.g.a.bj, n.e(this.f20139a));
        StringBuilder sb = new StringBuilder();
        sb.append(n.d(this.f20139a));
        bVar.a("app_version_code", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(n.c(this.f20139a));
        bVar.a("orientation", sb2.toString());
        bVar.a("gaid", "");
        bVar.a(com.anythink.expressad.foundation.g.a.bs, com.anythink.expressad.out.b.f20809a);
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.foundation.b.a.c().f();
        if (com.anythink.expressad.f.b.b() != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (TextUtils.isEmpty(jSONObject.toString())) {
                    return;
                }
                String a9 = com.anythink.core.express.a.a.a(jSONObject.toString());
                if (TextUtils.isEmpty(a9)) {
                    return;
                }
                bVar.a("dvi", a9);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }
}
