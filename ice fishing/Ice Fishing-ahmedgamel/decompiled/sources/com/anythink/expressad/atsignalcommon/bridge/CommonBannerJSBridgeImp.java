package com.anythink.expressad.atsignalcommon.bridge;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.y;
import com.anythink.core.express.d.a;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.b;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.v;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class CommonBannerJSBridgeImp implements IBannerJSBridge {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18734a = "CommonBannerJSBridgeImp";

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void cai(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                String optString = new JSONObject(str).optString("packageName");
                if (TextUtils.isEmpty(optString)) {
                    CommonJSBridgeImpUtils.callbackExcep(obj, "packageName is empty");
                }
                int i = v.a(t.b().g(), optString) ? 1 : 2;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", CommonJSBridgeImpUtils.f18736b);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i);
                    jSONObject.put("data", jSONObject2);
                    h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e9) {
                    CommonJSBridgeImpUtils.callbackExcep(obj, e9.getMessage());
                    e9.getMessage();
                }
            } catch (Throwable th) {
                CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + th.getLocalizedMessage());
            }
        } catch (JSONException e10) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + e10.getLocalizedMessage());
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void click(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void getFileInfo(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void getNetstat(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        Context g9 = t.b().g();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (g9 == null) {
            try {
                if ((obj instanceof b) && (windVaneWebView = ((b) obj).f18849a) != null) {
                    g9 = windVaneWebView.getContext();
                }
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
        if (g9 == null) {
            h.a().a(obj, CommonJSBridgeImpUtils.codeToJsonString(1));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NativeAdvancedJsUtils.f18690m, n.b());
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                jSONObject2 = Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            h.a().a(obj, jSONObject2);
        } catch (Throwable th) {
            th.getMessage();
            h.a().a(obj, CommonJSBridgeImpUtils.codeToJsonString(1));
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void gial(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.f18736b);
            jSONObject.put("data", new JSONObject());
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e9) {
            CommonJSBridgeImpUtils.callbackExcep(obj, e9.getMessage());
            e9.getMessage();
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, th.getMessage());
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void handlerH5Exception(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void increaseOfferFrequence(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                CommonJSBridgeImpUtils.increaseOfferFrequence(obj, new JSONObject(str));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void init(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void install(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void onJSBridgeConnect(Object obj, String str) {
        try {
            if (obj instanceof b) {
                h.a();
                a.a(((b) obj).f18849a);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        Context g9 = t.b().g();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (g9 == null) {
            try {
                if ((obj instanceof b) && (windVaneWebView = ((b) obj).f18849a) != null) {
                    g9 = windVaneWebView.getContext();
                }
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
        if (g9 == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("url");
            int optInt = jSONObject.optInt("type");
            if (optInt == 1) {
                y.a(optString);
            } else if (optInt == 2) {
                y.a(g9, optString);
            }
        } catch (JSONException e10) {
            e10.getMessage();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void readyStatus(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void reportData(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void reportUrls(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void resetCountdown(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void sendImpressions(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void toggleCloseBtn(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void triggerCloseBtn(Object obj, String str) {
    }
}
