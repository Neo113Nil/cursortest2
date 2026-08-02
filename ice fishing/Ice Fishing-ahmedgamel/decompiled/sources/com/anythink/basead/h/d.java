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
    public static final String f9796a = "d";

    /* renamed from: k, reason: collision with root package name */
    private k f9797k;

    public d(Context context, x xVar, String str, boolean z6) {
        super(context, xVar, str, z6);
    }

    public final void a(k kVar) {
        this.f9797k = kVar;
    }

    @Override // com.anythink.basead.h.a
    public final void a(Activity activity, Map<String, Object> map) {
        try {
            if (this.f9789c == null) {
                k kVar = this.f9797k;
                if (kVar != null) {
                    kVar.onShowFailed(com.anythink.basead.d.g.a(com.anythink.basead.d.g.i, com.anythink.basead.d.g.f6939H));
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
            map.get(c.f9786h);
            int intValue = ((Integer) map.get(c.f9787j)).intValue();
            final String str2 = this.f9790d.f14942b + this.f9791e + System.currentTimeMillis();
            com.anythink.basead.g.b.a().a(str2, new b.AbstractC0042b() { // from class: com.anythink.basead.h.d.1
                @Override // com.anythink.basead.g.b.AbstractC0042b
                public final void a(j jVar) {
                    if (d.this.f9797k != null) {
                        d.this.f9797k.onAdShow(jVar);
                    }
                }

                @Override // com.anythink.basead.g.b.AbstractC0042b
                public final void b() {
                    if (d.this.f9797k != null) {
                        d.this.f9797k.onVideoAdPlayEnd();
                    }
                }

                @Override // com.anythink.basead.g.b.AbstractC0042b
                public final void c() {
                }

                @Override // com.anythink.basead.g.b.AbstractC0042b
                public final void d() {
                    if (d.this.f9797k != null) {
                        d.this.f9797k.onAdClosed();
                    }
                    com.anythink.basead.g.b.a().b(str2);
                }

                @Override // com.anythink.basead.g.b.AbstractC0042b
                public final void a(com.anythink.basead.d.f fVar) {
                    fVar.c();
                    if (d.this.f9797k != null) {
                        d.this.f9797k.onShowFailed(fVar);
                    }
                }

                @Override // com.anythink.basead.g.b.AbstractC0042b
                public final void b(j jVar) {
                    if (d.this.f9797k != null) {
                        d.this.f9797k.onAdClick(jVar);
                    }
                }

                @Override // com.anythink.basead.g.b.AbstractC0042b
                public final void a() {
                    if (d.this.f9797k != null) {
                        d.this.f9797k.onVideoAdPlayStart();
                    }
                }

                @Override // com.anythink.basead.g.b.AbstractC0042b
                public final void a(boolean z6) {
                    if (d.this.f9797k != null) {
                        d.this.f9797k.onDeeplinkCallback(z6);
                    }
                }
            });
            com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
            cVar.f12705c = this.f9793g;
            cVar.f12706d = str2;
            cVar.f12703a = 3;
            cVar.f12710h = this.f9790d;
            cVar.f12707e = intValue;
            cVar.f12704b = str;
            BaseATActivity.a(activity, cVar);
        } catch (Exception e9) {
            e9.printStackTrace();
            k kVar2 = this.f9797k;
            if (kVar2 != null) {
                kVar2.onShowFailed(com.anythink.basead.d.g.a("-9999", e9.getMessage()));
            }
        }
    }
}
