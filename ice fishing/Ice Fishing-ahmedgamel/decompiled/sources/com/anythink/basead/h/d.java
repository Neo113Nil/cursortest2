package com.anythink.basead.h;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.g.b;
import com.anythink.basead.g.j;
import com.anythink.basead.g.k;
import com.anythink.basead.ui.BaseATActivity;
import com.anythink.core.common.h.x;
import java.util.Map;

/* loaded from: classes.dex */
public class d extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9010a = "d";

    /* renamed from: k, reason: collision with root package name */
    private k f9011k;

    public d(Context context, x xVar, String str, boolean z3) {
        super(context, xVar, str, z3);
    }

    public final void a(k kVar) {
        this.f9011k = kVar;
    }

    @Override // com.anythink.basead.h.a
    public final void a(Activity activity, Map<String, Object> map) {
        try {
            if (this.f9003c == null) {
                k kVar = this.f9011k;
                if (kVar != null) {
                    kVar.onShowFailed(com.anythink.basead.d.g.a(com.anythink.basead.d.g.i, com.anythink.basead.d.g.f6153H));
                    return;
                }
                return;
            }
            String str = "";
            try {
                Object obj = map.get("extra_scenario");
                if (obj != null) {
                    str = obj.toString();
                }
            } catch (Throwable unused) {
            }
            map.get(c.f9000h);
            int intValue = ((Integer) map.get(c.f9001j)).intValue();
            final String str2 = this.f9004d.f14156b + this.f9005e + System.currentTimeMillis();
            com.anythink.basead.g.b.a().a(str2, new b.AbstractC0042b() { // from class: com.anythink.basead.h.d.1
                @Override // com.anythink.basead.g.b.AbstractC0042b
                public final void a(j jVar) {
                    if (d.this.f9011k != null) {
                        d.this.f9011k.onAdShow(jVar);
                    }
                }

                @Override // com.anythink.basead.g.b.AbstractC0042b
                public final void b() {
                    if (d.this.f9011k != null) {
                        d.this.f9011k.onVideoAdPlayEnd();
                    }
                }

                @Override // com.anythink.basead.g.b.AbstractC0042b
                public final void c() {
                }

                @Override // com.anythink.basead.g.b.AbstractC0042b
                public final void d() {
                    if (d.this.f9011k != null) {
                        d.this.f9011k.onAdClosed();
                    }
                    com.anythink.basead.g.b.a().b(str2);
                }

                @Override // com.anythink.basead.g.b.AbstractC0042b
                public final void a(com.anythink.basead.d.f fVar) {
                    fVar.c();
                    if (d.this.f9011k != null) {
                        d.this.f9011k.onShowFailed(fVar);
                    }
                }

                @Override // com.anythink.basead.g.b.AbstractC0042b
                public final void b(j jVar) {
                    if (d.this.f9011k != null) {
                        d.this.f9011k.onAdClick(jVar);
                    }
                }

                @Override // com.anythink.basead.g.b.AbstractC0042b
                public final void a() {
                    if (d.this.f9011k != null) {
                        d.this.f9011k.onVideoAdPlayStart();
                    }
                }

                @Override // com.anythink.basead.g.b.AbstractC0042b
                public final void a(boolean z3) {
                    if (d.this.f9011k != null) {
                        d.this.f9011k.onDeeplinkCallback(z3);
                    }
                }
            });
            com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
            cVar.f11919c = this.f9007g;
            cVar.f11920d = str2;
            cVar.f11917a = 3;
            cVar.f11924h = this.f9004d;
            cVar.f11921e = intValue;
            cVar.f11918b = str;
            BaseATActivity.a(activity, cVar);
        } catch (Exception e9) {
            e9.printStackTrace();
            k kVar2 = this.f9011k;
            if (kVar2 != null) {
                kVar2.onShowFailed(com.anythink.basead.d.g.a("-9999", e9.getMessage()));
            }
        }
    }
}
