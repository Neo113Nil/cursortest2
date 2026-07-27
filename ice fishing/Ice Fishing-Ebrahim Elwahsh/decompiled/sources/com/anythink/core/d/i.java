package com.anythink.core.d;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.h.ax;
import com.anythink.core.d.h;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17464a = "i";

    /* renamed from: b, reason: collision with root package name */
    private static volatile i f17465b;

    /* renamed from: c, reason: collision with root package name */
    private Context f17466c;

    public interface a {
        void a(String str);

        void a(JSONObject jSONObject);
    }

    private i(Context context) {
        this.f17466c = context.getApplicationContext();
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
        if (f17465b == null) {
            synchronized (i.class) {
                try {
                    if (f17465b == null) {
                        f17465b = new i(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17465b;
    }

    private static h a(JSONObject jSONObject) {
        try {
            jSONObject.put(h.b.f17457b, System.currentTimeMillis());
        } catch (Throwable unused) {
        }
        return h.a(jSONObject);
    }

    public final synchronized void a(ax axVar, final a aVar) {
        new com.anythink.core.common.m.m(this.f17466c, axVar).a(0, new com.anythink.core.common.m.q() { // from class: com.anythink.core.d.i.1
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
                Context unused = i.this.f17466c;
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
