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
public class f extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9189a = "f";

    /* renamed from: k, reason: collision with root package name */
    private k f9190k;

    public f(Context context, x xVar, String str, boolean z8) {
        super(context, xVar, str, z8);
    }

    public final void a(k kVar) {
        this.f9190k = kVar;
    }

    @Override // com.anythink.basead.h.a
    public final void a(Activity activity, Map<String, Object> map) {
        try {
            if (this.f9160c == null) {
                k kVar = this.f9190k;
                if (kVar != null) {
                    kVar.onShowFailed(com.anythink.basead.d.g.a(com.anythink.basead.d.g.i, com.anythink.basead.d.g.f6310H));
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
            map.get(c.f9157h);
            int intValue = ((Integer) map.get(c.f9158j)).intValue();
            final String str2 = this.f9161d.f14313b + this.f9162e + System.currentTimeMillis();
            com.anythink.basead.g.b.a().a(str2, new b.AbstractC0041b() { // from class: com.anythink.basead.h.f.1
                @Override // com.anythink.basead.g.b.AbstractC0041b
                public final void a(j jVar) {
                    if (f.this.f9190k != null) {
                        f.this.f9190k.onAdShow(jVar);
                    }
                }

                @Override // com.anythink.basead.g.b.AbstractC0041b
                public final void b() {
                    if (f.this.f9190k != null) {
                        f.this.f9190k.onVideoAdPlayEnd();
                    }
                }

                @Override // com.anythink.basead.g.b.AbstractC0041b
                public final void c() {
                    if (f.this.f9190k != null) {
                        f.this.f9190k.onRewarded();
                    }
                }

                @Override // com.anythink.basead.g.b.AbstractC0041b
                public final void d() {
                    if (f.this.f9190k != null) {
                        f.this.f9190k.onAdClosed();
                    }
                    com.anythink.basead.g.b.a().b(str2);
                }

                @Override // com.anythink.basead.g.b.AbstractC0041b
                public final void a(com.anythink.basead.d.f fVar) {
                    fVar.c();
                    if (f.this.f9190k != null) {
                        f.this.f9190k.onShowFailed(fVar);
                    }
                }

                @Override // com.anythink.basead.g.b.AbstractC0041b
                public final void b(j jVar) {
                    if (f.this.f9190k != null) {
                        f.this.f9190k.onAdClick(jVar);
                    }
                }

                @Override // com.anythink.basead.g.b.AbstractC0041b
                public final void a() {
                    if (f.this.f9190k != null) {
                        f.this.f9190k.onVideoAdPlayStart();
                    }
                }

                @Override // com.anythink.basead.g.b.AbstractC0041b
                public final void a(boolean z8) {
                    if (f.this.f9190k != null) {
                        f.this.f9190k.onDeeplinkCallback(z8);
                    }
                }
            });
            com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
            cVar.f12076c = this.f9164g;
            cVar.f12077d = str2;
            cVar.f12074a = 1;
            cVar.f12081h = this.f9161d;
            cVar.f12078e = intValue;
            cVar.f12075b = str;
            BaseATActivity.a(activity, cVar);
        } catch (Exception e6) {
            e6.printStackTrace();
            k kVar2 = this.f9190k;
            if (kVar2 != null) {
                kVar2.onShowFailed(com.anythink.basead.d.g.a("-9999", e6.getMessage()));
            }
        }
    }
}
