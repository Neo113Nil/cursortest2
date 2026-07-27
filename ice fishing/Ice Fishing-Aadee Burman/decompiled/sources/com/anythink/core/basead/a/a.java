package com.anythink.core.basead.a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.basead.adx.api.ATAdxAPI;
import com.anythink.core.basead.adx.api.ATAdxAdapterConfig;
import com.anythink.core.basead.adx.api.ATAdxAdapterConfigListener;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ax;
import com.anythink.core.d.i;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f11864a = "anythink_adx_context";

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f11865b;

    public static a a() {
        if (f11865b == null) {
            synchronized (t.class) {
                try {
                    if (f11865b == null) {
                        f11865b = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11865b;
    }

    public final void a(Context context, String str, Map<String, Object> map, final ATAdxAdapterConfigListener aTAdxAdapterConfigListener) {
        if (context == null) {
            if (aTAdxAdapterConfigListener != null) {
                aTAdxAdapterConfigListener.onLoadFailed("context = null");
                return;
            }
            return;
        }
        String p9 = t.b().p();
        String q8 = t.b().q();
        if (t.b().g() != null && !TextUtils.isEmpty(p9) && !TextUtils.isEmpty(q8)) {
            if (TextUtils.isEmpty(str)) {
                if (aTAdxAdapterConfigListener != null) {
                    aTAdxAdapterConfigListener.onLoadFailed("placementId is empty");
                    return;
                }
                return;
            } else {
                if (map == null) {
                    if (aTAdxAdapterConfigListener != null) {
                        aTAdxAdapterConfigListener.onLoadFailed("requestMap = null");
                        return;
                    }
                    return;
                }
                Object obj = map.get(ATAdxAPI.KEY_A_WF_INFO);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    Objects.toString(jSONObject);
                    i.a(context).a(new ax(p9, q8, str, t.b().d(str), jSONObject), new i.a() { // from class: com.anythink.core.basead.a.a.1
                        @Override // com.anythink.core.d.i.a
                        public final void a(JSONObject jSONObject2) {
                            ATAdxAdapterConfigListener aTAdxAdapterConfigListener2 = aTAdxAdapterConfigListener;
                            if (aTAdxAdapterConfigListener2 != null) {
                                aTAdxAdapterConfigListener2.onLoadSuccess(ATAdxAdapterConfig.parse(jSONObject2));
                            }
                        }

                        @Override // com.anythink.core.d.i.a
                        public final void a(String str2) {
                            ATAdxAdapterConfigListener aTAdxAdapterConfigListener2 = aTAdxAdapterConfigListener;
                            if (aTAdxAdapterConfigListener2 != null) {
                                aTAdxAdapterConfigListener2.onLoadFailed(str2);
                            }
                        }
                    });
                    return;
                } else {
                    if (aTAdxAdapterConfigListener != null) {
                        aTAdxAdapterConfigListener.onLoadFailed("waterfall info = null");
                        return;
                    }
                    return;
                }
            }
        }
        Log.e(f11864a, "SDK init error!");
        if (aTAdxAdapterConfigListener != null) {
            aTAdxAdapterConfigListener.onLoadFailed("SDK init error!");
        }
    }
}
