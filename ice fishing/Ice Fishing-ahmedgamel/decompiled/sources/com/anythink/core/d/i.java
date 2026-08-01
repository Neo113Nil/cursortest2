package com.anythink.core.d;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.h.ax;
import com.anythink.core.d.h;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17306a = "i";

    /* renamed from: b, reason: collision with root package name */
    private static volatile i f17307b;

    /* renamed from: c, reason: collision with root package name */
    private Context f17308c;

    public interface a {
        void a(String str);

        void a(JSONObject jSONObject);
    }

    private i(Context context) {
        this.f17308c = context.getApplicationContext();
    }

    private static void b(Object obj, a aVar) {
        if (!(obj instanceof JSONObject)) {
            if (aVar != null) {
                aVar.a("get mediation adapter Strategy error");
            }
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            a(jSONObject);
            if (aVar != null) {
                aVar.a(jSONObject);
            }
        }
    }

    public static i a(Context context) {
        if (f17307b == null) {
            synchronized (i.class) {
                try {
                    if (f17307b == null) {
                        f17307b = new i(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17307b;
    }

    private static h a(JSONObject jSONObject) {
        try {
            jSONObject.put(h.b.f17299b, System.currentTimeMillis());
        } catch (Throwable unused) {
        }
        return h.a(jSONObject);
    }

    public final synchronized void a(ax axVar, final a aVar) {
        new com.anythink.core.common.m.m(this.f17308c, axVar).a(0, new com.anythink.core.common.m.q() { // from class: com.anythink.core.d.i.1
            @Override // com.anythink.core.common.m.q
            public final void onLoadCanceled(int i) {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a("Request cancel");
                }
            }

            @Override // com.anythink.core.common.m.q
            public final void onLoadError(int i, String str, AdError adError) {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    if (str == null) {
                        str = "Request Strategy error.";
                    }
                    aVar2.a(str);
                }
            }

            @Override // com.anythink.core.common.m.q
            public final void onLoadFinish(int i, Object obj) {
                Context unused = i.this.f17308c;
                i.a(obj, aVar);
            }

            @Override // com.anythink.core.common.m.q
            public final void onLoadStart(int i) {
            }
        });
    }

    public static /* synthetic */ void a(Object obj, a aVar) {
        if (!(obj instanceof JSONObject)) {
            if (aVar != null) {
                aVar.a("get mediation adapter Strategy error");
            }
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            a(jSONObject);
            if (aVar != null) {
                aVar.a(jSONObject);
            }
        }
    }
}
