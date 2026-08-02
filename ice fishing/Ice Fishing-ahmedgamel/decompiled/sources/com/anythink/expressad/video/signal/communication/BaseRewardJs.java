package com.anythink.expressad.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.y;
import com.anythink.expressad.atsignalcommon.b.a;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.b;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.signal.a.j;
import com.anythink.expressad.video.signal.factory.IJSFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class BaseRewardJs extends AbsFeedBackForH5 implements IRewardBridge {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f22629a = "JS-Reward-Brigde";
    protected IRewardBridge i;

    private static String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", -1);
            String jSONObject2 = jSONObject.toString();
            return !TextUtils.isEmpty(jSONObject2) ? Base64.encodeToString(jSONObject2.getBytes(), 2) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
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

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void getEndScreenInfo(Object obj, String str) {
        try {
            IRewardBridge iRewardBridge = this.i;
            if (iRewardBridge != null) {
                iRewardBridge.getEndScreenInfo(obj, str);
                return;
            }
            if (obj != null) {
                b bVar = (b) obj;
                if (bVar.f18849a != null) {
                    WindVaneWebView windVaneWebView = bVar.f18849a;
                    if (windVaneWebView.getWebViewListener() != null) {
                        ((a) windVaneWebView.getWebViewListener()).a(obj);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void gial(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.f18736b);
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
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.i.handlerPlayableException(obj, str);
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.j
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        boolean z6;
        super.initialize(context, windVaneWebView);
        try {
            z6 = IJSFactory.class.isInstance(context);
        } catch (ClassNotFoundException e9) {
            e9.printStackTrace();
            z6 = false;
        }
        try {
            if (z6) {
                this.i = (IRewardBridge) BaseRewardJsH5.class.newInstance();
                BaseRewardJsH5.class.getMethod("initialize", Context.class, WindVaneWebView.class).invoke(this.i, context, windVaneWebView);
            } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof IRewardBridge)) {
                this.i = (IRewardBridge) windVaneWebView.getObject();
            }
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f18405a) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void install(Object obj, String str) {
        try {
            IRewardBridge iRewardBridge = this.i;
            if (iRewardBridge != null) {
                iRewardBridge.install(obj, str);
                return;
            }
            if (TextUtils.isEmpty(str) || obj == null) {
                return;
            }
            b bVar = (b) obj;
            if (bVar.f18849a.getObject() instanceof j) {
                j jVar = (j) bVar.f18849a.getObject();
                Context context = bVar.f18849a.getContext();
                if (context != null && context != context.getApplicationContext()) {
                    jVar.a(context);
                }
                jVar.click(1, str);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.i.notifyCloseBtn(obj, str);
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void openURL(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("url");
            int optInt = jSONObject.optInt("type");
            if (optInt == 1) {
                y.a(optString);
            } else if (optInt == 2) {
                y.a(this.f18864f, optString);
            }
        } catch (JSONException e9) {
            e9.getMessage();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void setOrientation(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.i.setOrientation(obj, str);
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.i.toggleCloseBtn(obj, str);
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.video.signal.communication.IRewardBridge
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.i == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.i.triggerCloseBtn(obj, str);
        } catch (Throwable unused) {
            h.a().a(obj, a());
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.j
    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        boolean z6;
        super.initialize(obj, windVaneWebView);
        try {
            z6 = IJSFactory.class.isInstance(obj);
        } catch (ClassNotFoundException e9) {
            e9.printStackTrace();
            z6 = false;
        }
        try {
            if (z6) {
                this.i = (IRewardBridge) BaseRewardJsH5.class.newInstance();
                BaseRewardJsH5.class.getMethod("initialize", Object.class, WindVaneWebView.class).invoke(this.i, obj, windVaneWebView);
            } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof IRewardBridge)) {
                this.i = (IRewardBridge) windVaneWebView.getObject();
            }
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f18405a) {
                e10.printStackTrace();
            }
        }
    }
}
