package com.anythink.expressad.splash.js;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.y;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.f.b;
import com.anythink.expressad.f.c;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.splash.d.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SplashJSBridgeImpl implements ISplashBridge {

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<Context> f20833b;

    /* renamed from: c, reason: collision with root package name */
    private List<d> f20834c;

    /* renamed from: d, reason: collision with root package name */
    private String f20835d;

    /* renamed from: e, reason: collision with root package name */
    private String f20836e;

    /* renamed from: f, reason: collision with root package name */
    private int f20837f;

    /* renamed from: g, reason: collision with root package name */
    private int f20838g;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private a f20840j;

    /* renamed from: k, reason: collision with root package name */
    private SplashExpandDialog f20841k;

    /* renamed from: a, reason: collision with root package name */
    private String f20832a = "SplashJSBridgeImpl";

    /* renamed from: h, reason: collision with root package name */
    private int f20839h = 5;

    public SplashJSBridgeImpl(Context context, String str, String str2) {
        this.f20836e = str;
        this.f20835d = str2;
        this.f20833b = new WeakReference<>(context);
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
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
                    jSONObject.put("code", CommonJSBridgeImpUtils.f18107b);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i);
                    jSONObject.put("data", jSONObject2);
                    h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e6) {
                    CommonJSBridgeImpUtils.callbackExcep(obj, e6.getMessage());
                    e6.getMessage();
                }
            } catch (Throwable th) {
                CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + th.getLocalizedMessage());
            }
        } catch (JSONException e9) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + e9.getLocalizedMessage());
        }
    }

    @Override // com.anythink.core.express.b.b
    public void close() {
        try {
            a aVar = this.f20840j;
            if (aVar != null) {
                aVar.c();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.express.b.b
    public void expand(String str, boolean z8) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z8);
            WeakReference<Context> weakReference = this.f20833b;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            SplashExpandDialog splashExpandDialog = this.f20841k;
            if (splashExpandDialog == null || !splashExpandDialog.isShowing()) {
                SplashExpandDialog splashExpandDialog2 = new SplashExpandDialog(this.f20833b.get(), bundle, this.f20840j);
                this.f20841k = splashExpandDialog2;
                splashExpandDialog2.setCampaignList(this.f20835d, this.f20834c);
                this.f20841k.show();
                a aVar = this.f20840j;
                if (aVar != null) {
                    aVar.a(true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public d getMraidCampaign() {
        List<d> list = this.f20834c;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f20834c.get(0);
    }

    public a getSplashBridgeListener() {
        return this.f20840j;
    }

    public List<d> getmCampaignList() {
        return this.f20834c;
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void gial(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.f18107b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("packageNameList", new JSONArray());
            jSONObject.put("data", jSONObject2);
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e6) {
            CommonJSBridgeImpUtils.callbackExcep(obj, e6.getMessage());
            e6.getMessage();
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, th.getMessage());
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void handlerH5Exception(Object obj, String str) {
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void init(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            com.anythink.expressad.splash.a.a aVar = new com.anythink.expressad.splash.a.a(t.b().g());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f20837f);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", aVar.a());
            jSONObject.put("campaignList", d.b(this.f20834c));
            b.a();
            c c4 = b.c(com.anythink.expressad.foundation.b.a.c().f(), this.f20835d);
            if (c4 == null) {
                c4 = c.c(this.f20835d);
            }
            if (!TextUtils.isEmpty(this.f20836e)) {
                c4.e(this.f20836e);
            }
            c4.a(this.f20835d);
            c4.b(this.f20839h);
            c4.a(this.f20838g);
            jSONObject.put("unitSetting", c4.s());
            b.a();
            String a9 = b.a(com.anythink.expressad.foundation.b.a.c().f());
            if (!TextUtils.isEmpty(a9)) {
                jSONObject.put("appSetting", new JSONObject(a9));
            }
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO, com.anythink.expressad.atsignalcommon.a.a.f18091a);
            jSONObject.toString();
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void install(Object obj, String str) {
        try {
            List<d> list = this.f20834c;
            if (list == null) {
                return;
            }
            d dVar = (list == null || list.size() <= 0) ? null : this.f20834c.get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject a9 = d.a(dVar);
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    a9.put(next, jSONObject.getString(next));
                }
                d b9 = d.b(a9);
                String optString = a9.optString("unitId");
                if (!TextUtils.isEmpty(optString)) {
                    b9.l(optString);
                }
                dVar = b9;
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
            a aVar = this.f20840j;
            if (aVar != null) {
                aVar.a(dVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void onJSBridgeConnect(Object obj, String str) {
        try {
            if (obj instanceof com.anythink.expressad.atsignalcommon.windvane.b) {
                h.a();
                com.anythink.core.express.d.a.a(((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18220a);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.express.b.b
    public void open(String str) {
        a aVar = this.f20840j;
        if (aVar != null) {
            aVar.b(str);
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
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
                if ((obj instanceof com.anythink.expressad.atsignalcommon.windvane.b) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18220a) != null) {
                    g9 = windVaneWebView.getContext();
                }
            } catch (Exception e6) {
                e6.getMessage();
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
        } catch (JSONException e9) {
            e9.getMessage();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void pauseCountDown(Object obj, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 0);
            jSONObject.put("message", "Call pause count down success.");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.anythink.expressad.f.a.b.dl, this.i);
            jSONObject.put("data", jSONObject2);
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e6) {
            e6.getMessage();
        }
        a aVar = this.f20840j;
        if (aVar != null) {
            aVar.a(1, -1);
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void readyStatus(Object obj, String str) {
    }

    public void release() {
        if (this.f20840j != null) {
            this.f20840j = null;
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void reportData(Object obj, String str) {
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void reportUrls(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int optInt = jSONObject.optInt("type");
                String optString = jSONObject.optString("url");
                StringBuilder sb = new StringBuilder();
                sb.append(n.k());
                String a9 = v.a(optString, "&tun=", sb.toString());
                int optInt2 = jSONObject.optInt("report");
                boolean z8 = true;
                if (optInt2 == 0) {
                    Context g9 = t.b().g();
                    if (optInt == 0) {
                        z8 = false;
                    }
                    com.anythink.expressad.b.a.a(g9, (d) null, "", a9, z8);
                } else {
                    com.anythink.expressad.b.a.a(t.b().g(), null, "", a9, false, optInt != 0, optInt2);
                }
            }
            h.a().a(obj, SplashJsUtils.codeToJsonString(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void resetCountdown(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int i = new JSONObject(str).getInt(com.anythink.expressad.f.a.b.dl);
            a aVar = this.f20840j;
            if (aVar != null) {
                aVar.b(i);
            }
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    @Override // com.anythink.expressad.splash.js.ISplashBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void resumeCountDown(Object obj, String str) {
        a aVar;
        int i = 0;
        if (!TextUtils.isEmpty(str)) {
            try {
                int optInt = new JSONObject(str).optInt(com.anythink.expressad.f.a.b.dl);
                try {
                    h.a().a(obj, SplashJsUtils.codeToJsonString(0));
                    i = optInt;
                } catch (Exception e6) {
                    e = e6;
                    i = optInt;
                    e.getMessage();
                    aVar = this.f20840j;
                    if (aVar == null) {
                    }
                }
            } catch (Exception e9) {
                e = e9;
            }
        }
        aVar = this.f20840j;
        if (aVar == null) {
            aVar.a(2, i);
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void sendImpressions(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                for (d dVar : this.f20834c) {
                    if (dVar.bh().equals(string)) {
                        f.a(this.f20835d, dVar, f.f19282f);
                        arrayList.add(string);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void setAllowSkip(int i) {
        this.f20838g = i;
    }

    public void setCampaignList(List<d> list) {
        this.f20834c = list;
    }

    public void setCountdownS(int i) {
        this.f20839h = i;
    }

    public void setDevCloseBtnStatus(int i) {
        this.f20837f = i;
    }

    public void setSplashBridgeListener(a aVar) {
        if (aVar != null) {
            this.f20840j = aVar;
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int optInt = new JSONObject(str).optInt(com.anythink.core.express.b.a.f17684b);
            a aVar = this.f20840j;
            if (aVar != null) {
                aVar.a(optInt);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.splash.js.ISplashBridge
    public void triggerCloseBtn(Object obj, String str) {
        a aVar = this.f20840j;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.anythink.core.express.b.b
    public void unload() {
        close();
    }

    public void updateContext(Context context) {
        this.f20833b = new WeakReference<>(context);
    }

    public void updateCountDown(int i) {
        this.i = i;
    }

    @Override // com.anythink.core.express.b.b
    public void useCustomClose(boolean z8) {
        int i = z8 ? 2 : 1;
        try {
            a aVar = this.f20840j;
            if (aVar != null) {
                aVar.a(i);
            }
        } catch (Throwable unused) {
        }
    }
}
