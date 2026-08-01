package com.anythink.basead.l;

import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.AdError;
import com.anythink.core.common.h.x;
import com.anythink.core.common.m.q;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f9206a = 5;

    /* renamed from: b, reason: collision with root package name */
    private static final String f9207b = "c";

    /* renamed from: c, reason: collision with root package name */
    private x f9208c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.basead.l.a f9209d;

    /* renamed from: e, reason: collision with root package name */
    private final a f9210e;

    /* renamed from: f, reason: collision with root package name */
    private com.anythink.basead.l.b.b f9211f;

    /* renamed from: g, reason: collision with root package name */
    private com.anythink.basead.l.b.b f9212g;

    /* renamed from: h, reason: collision with root package name */
    private int f9213h;
    private List<String> i;

    /* renamed from: j, reason: collision with root package name */
    private JSONArray f9214j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f9215k;

    /* renamed from: l, reason: collision with root package name */
    private final q f9216l;

    public interface a {
        void a(int i, String str);

        void a(com.anythink.basead.l.b.a[] aVarArr, JSONArray jSONArray);
    }

    public c(x xVar, a aVar) {
        this(xVar, false, aVar);
    }

    private void b() {
        com.anythink.basead.l.a aVar = this.f9209d;
        if (aVar != null) {
            aVar.b();
        }
    }

    private void c(String str) {
        this.f9210e.a(-1, "Invalid ad response: ".concat(String.valueOf(str)));
    }

    public c(x xVar, boolean z3, a aVar) {
        this.f9216l = new q() { // from class: com.anythink.basead.l.c.1
            @Override // com.anythink.core.common.m.q
            public final void onLoadCanceled(int i) {
                c.b(c.this, "onLoadCanceled");
            }

            @Override // com.anythink.core.common.m.q
            public final void onLoadError(int i, String str, AdError adError) {
                c cVar = c.this;
                StringBuilder c9 = AbstractC5049e.c(str, ",");
                c9.append(adError.toString());
                c.b(cVar, c9.toString());
            }

            @Override // com.anythink.core.common.m.q
            public final void onLoadFinish(int i, Object obj) {
                if (obj == null || !(obj instanceof String)) {
                    c.b(c.this, "onLoadFinish but empty result");
                } else {
                    c.this.b(obj.toString());
                }
            }

            @Override // com.anythink.core.common.m.q
            public final void onLoadStart(int i) {
            }
        };
        this.f9208c = xVar;
        this.f9215k = z3;
        this.f9210e = aVar;
        this.f9209d = new com.anythink.basead.l.a(xVar);
        this.i = new ArrayList();
        this.f9214j = new JSONArray();
    }

    public final void a(String str) {
        b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (!e.a(str)) {
            this.f9210e.a(-3, "VAST schema validation error.");
            return;
        }
        try {
            this.f9214j.put(str);
        } catch (Throwable unused) {
        }
        this.f9213h++;
        try {
            com.anythink.basead.l.b.b bVar = new com.anythink.basead.l.b.b(str);
            if (this.f9211f == null) {
                this.f9211f = bVar;
            } else {
                this.f9212g.g(bVar);
            }
            this.f9212g = bVar;
            String d2 = bVar.d();
            if (!TextUtils.isEmpty(d2)) {
                if (this.f9213h >= 5) {
                    this.f9210e.a(-2, "Wrapper limit reached, as defined by the video player. Too many Wrapper responses have been received with no InLine response.");
                    this.f9213h = 0;
                    return;
                } else {
                    this.i.add(d2);
                    if (this.f9215k) {
                        return;
                    }
                    this.f9209d.a(d2, this.f9216l);
                    return;
                }
            }
            this.f9210e.a(new com.anythink.basead.l.b.a[]{this.f9211f, this.f9212g}, this.f9214j);
        } catch (b e9) {
            Log.getStackTraceString(e9);
            this.f9210e.a(-3, "AdResponseParserVast creation failed: " + e9.getMessage());
        }
    }

    public final void a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            jSONArray.length();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    b(jSONArray.getString(i));
                } catch (Throwable unused) {
                    this.f9210e.a(-3, "VAST extractByLocalData error with error.");
                    return;
                }
            }
            return;
        }
        this.f9210e.a(-3, "VAST extractByLocalData error with empty data.");
    }

    public final List<String> a() {
        return this.i;
    }

    public static /* synthetic */ void b(c cVar, String str) {
        cVar.f9210e.a(-1, "Invalid ad response: ".concat(String.valueOf(str)));
    }
}
