package com.anythink.expressad.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.y;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.b;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.g.a;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.signal.a.j;
import com.anythink.expressad.video.signal.factory.IJSFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class BaseRewardJsH5 implements IRewardBridge {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f21843a = "JS-Reward-Brigde";

    /* renamed from: b, reason: collision with root package name */
    protected IJSFactory f21844b;

    private static String a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            return !TextUtils.isEmpty(jSONObject2) ? Base64.encodeToString(jSONObject2.getBytes(), 2) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void cai(Object obj, String str) {
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
                    jSONObject.put("code", CommonJSBridgeImpUtils.f17949b);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i);
                    jSONObject.put("data", jSONObject2);
                    h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e9) {
                    CommonJSBridgeImpUtils.callbackExcep(obj, e9.getMessage());
                    e9.getMessage();
                }
            } catch (JSONException e10) {
                CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + e10.getLocalizedMessage());
            }
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + th.getLocalizedMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void getEndScreenInfo(Object obj, String str) {
        try {
            IJSFactory iJSFactory = this.f21844b;
            if (iJSFactory != null) {
                String a9 = iJSFactory.getIJSRewardVideoV1().a();
                h.a().a(obj, !TextUtils.isEmpty(a9) ? Base64.encodeToString(a9.getBytes(), 2) : "");
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void gial(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.f17949b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("packageNameList", "[]");
            jSONObject.put("data", jSONObject2);
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e9) {
            CommonJSBridgeImpUtils.callbackExcep(obj, e9.getMessage());
            e9.getMessage();
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, th.getMessage());
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void handlerPlayableException(Object obj, String str) {
        try {
            if (this.f21844b == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f21844b.getIJSRewardVideoV1().handlerPlayableException(new JSONObject(str).optString(a.f19093q));
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        if (context instanceof IJSFactory) {
            this.f21844b = (IJSFactory) context;
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void install(Object obj, String str) {
        j jVar;
        Context context;
        try {
            if (this.f21844b != null) {
                if (obj != null) {
                    b bVar = (b) obj;
                    if ((bVar.f18062a.getObject() instanceof j) && (jVar = (j) bVar.f18062a.getObject()) != null && (context = bVar.f18062a.getContext()) != null && context != context.getApplicationContext()) {
                        jVar.a(context);
                    }
                }
                if (this.f21844b.getJSContainerModule().endCardShowing()) {
                    this.f21844b.getJSCommon().click(3, str);
                } else {
                    this.f21844b.getJSCommon().click(1, str);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f21844b == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f21844b.getIJSRewardVideoV1().notifyCloseBtn(new JSONObject(str).optInt(com.anythink.core.express.b.a.f17526b));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        Context g4 = t.b().g();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (g4 == null) {
            try {
                if ((obj instanceof b) && (windVaneWebView = ((b) obj).f18062a) != null) {
                    g4 = windVaneWebView.getContext();
                }
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
        if (g4 == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("url");
            int optInt = jSONObject.optInt("type");
            if (optInt == 1) {
                y.a(optString);
            } else if (optInt == 2) {
                y.a(g4, optString);
            }
        } catch (JSONException e10) {
            e10.getMessage();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void setOrientation(Object obj, String str) {
        try {
            if (this.f21844b == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f21844b.getIJSRewardVideoV1().b(new JSONObject(str).optString(com.anythink.core.express.b.a.f17526b));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f21844b == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f21844b.getIJSRewardVideoV1().toggleCloseBtn(new JSONObject(str).optInt(com.anythink.core.express.b.a.f17526b));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.f21844b == null || TextUtils.isEmpty(str)) {
                return;
            }
            h.a().a(obj, a(0));
            this.f21844b.getIJSRewardVideoV1().a(new JSONObject(str).optString(com.anythink.core.express.b.a.f17526b));
        } catch (Throwable unused) {
            h.a().a(obj, a(-1));
        }
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        if (obj instanceof IJSFactory) {
            this.f21844b = (IJSFactory) obj;
        }
    }
}
