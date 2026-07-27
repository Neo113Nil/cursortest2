package com.anythink.expressad.mbbanner.a.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.d.t;
import com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.u;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.videocommon.b.i;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c extends CommonBannerJSBridgeImp {

    /* renamed from: b, reason: collision with root package name */
    private static final String f19997b = "BannerJSBridgeImpl";

    /* renamed from: c, reason: collision with root package name */
    private WeakReference<Context> f19998c;

    /* renamed from: d, reason: collision with root package name */
    private List<d> f19999d;

    /* renamed from: e, reason: collision with root package name */
    private String f20000e;

    /* renamed from: f, reason: collision with root package name */
    private String f20001f;

    /* renamed from: g, reason: collision with root package name */
    private int f20002g;

    /* renamed from: h, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.c.a f20003h;
    private b i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f20004j = false;

    public c(Context context, String str, String str2) {
        this.f20000e = str;
        this.f20001f = str2;
        this.f19998c = new WeakReference<>(context);
    }

    public final void a(com.anythink.expressad.mbbanner.a.c.a aVar) {
        if (aVar != null) {
            this.f20003h = aVar;
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void click(Object obj, String str) {
        try {
            List<d> list = this.f19999d;
            if (list == null) {
                return;
            }
            d dVar = (list == null || list.size() <= 0) ? null : this.f19999d.get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject a9 = d.a(dVar);
                JSONObject jSONObject = new JSONObject(str).getJSONObject("pt");
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
            com.anythink.expressad.mbbanner.a.c.a aVar = this.f20003h;
            if (aVar != null) {
                aVar.a(dVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.express.b.b
    public final void close() {
        try {
            com.anythink.expressad.mbbanner.a.c.a aVar = this.f20003h;
            if (aVar != null) {
                aVar.b();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.express.b.b
    public final void expand(String str, boolean z8) {
        Context context;
        try {
            String str2 = "";
            if (getMraidCampaign() != null) {
                if (TextUtils.isEmpty(getMraidCampaign().q())) {
                    str2 = getMraidCampaign().p();
                } else {
                    str2 = "file:////" + getMraidCampaign().q();
                }
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str = str2;
            }
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z8);
            WeakReference<Context> weakReference = this.f19998c;
            if (weakReference != null && (context = weakReference.get()) != null) {
                b bVar = this.i;
                if (bVar != null && bVar.isShowing()) {
                    return;
                }
                b bVar2 = new b(context, bundle, this.f20003h);
                this.i = bVar2;
                bVar2.a(this.f20001f, this.f19999d);
                this.i.show();
            }
            com.anythink.expressad.mbbanner.a.c.a aVar = this.f20003h;
            if (aVar != null) {
                aVar.a(true);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void getFileInfo(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is empty");
            return;
        }
        try {
            a(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final d getMraidCampaign() {
        List<d> list = this.f19999d;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f19999d.get(0);
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void init(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            com.anythink.expressad.foundation.h.c cVar = new com.anythink.expressad.foundation.h.c(t.b().g());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f20002g);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", cVar.a());
            jSONObject.put("campaignList", d.b(this.f19999d));
            com.anythink.expressad.f.b.a();
            com.anythink.expressad.f.c c4 = com.anythink.expressad.f.b.c(com.anythink.expressad.foundation.b.a.c().f(), this.f20001f);
            if (c4 == null) {
                c4 = com.anythink.expressad.f.c.c(this.f20001f);
            }
            if (!TextUtils.isEmpty(this.f20000e)) {
                c4.e(this.f20000e);
            }
            jSONObject.put("unitSetting", c4.s());
            jSONObject.put("appSetting", new JSONObject());
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO, com.anythink.expressad.atsignalcommon.a.a.f18091a);
            jSONObject.toString();
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.express.b.b
    public final void open(String str) {
        try {
            if (this.f19999d.size() > 1) {
                t.b().g().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            com.anythink.expressad.mbbanner.a.c.a aVar = this.f20003h;
            if (aVar != null) {
                aVar.a(true, str);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                int optInt = new JSONObject(str).optInt("isReady", 1);
                h.a().a(obj, CommonJSBridgeImpUtils.codeToJsonString(0));
                com.anythink.expressad.mbbanner.a.c.a aVar = this.f20003h;
                if (aVar != null) {
                    aVar.b(optInt);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void reportUrls(Object obj, String str) {
        super.reportUrls(obj, str);
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
            h.a().a(obj, CommonJSBridgeImpUtils.codeToJsonString(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void sendImpressions(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                for (d dVar : this.f19999d) {
                    if (dVar.bh().equals(string)) {
                        f.a(this.f20001f, dVar, f.f19281e);
                        arrayList.add(string);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void toggleCloseBtn(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int optInt = new JSONObject(str).optInt(com.anythink.core.express.b.a.f17684b);
            com.anythink.expressad.mbbanner.a.c.a aVar = this.f20003h;
            if (aVar != null) {
                aVar.a(optInt);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void triggerCloseBtn(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            new JSONObject(str).optString(com.anythink.core.express.b.a.f17684b);
            com.anythink.expressad.mbbanner.a.c.a aVar = this.f20003h;
            if (aVar != null) {
                aVar.a();
            }
            h.a().a(obj, CommonJSBridgeImpUtils.codeToJsonString(0));
        } catch (Throwable unused) {
            h.a().a(obj, CommonJSBridgeImpUtils.codeToJsonString(-1));
        }
    }

    @Override // com.anythink.core.express.b.b
    public final void unload() {
        close();
    }

    @Override // com.anythink.core.express.b.b
    public final void useCustomClose(boolean z8) {
        int i = z8 ? 2 : 1;
        try {
            com.anythink.expressad.mbbanner.a.c.a aVar = this.f20003h;
            if (aVar != null) {
                aVar.a(i);
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(List<d> list) {
        this.f19999d = list;
    }

    public final void a(int i) {
        this.f20002g = i;
    }

    public final void a() {
        if (this.f20003h != null) {
            this.f20003h = null;
        }
        if (this.i != null) {
            this.i = null;
        }
    }

    private static void a(Object obj, JSONObject jSONObject) {
        int i;
        int i4;
        boolean z8;
        String str;
        File file;
        JSONObject jSONObject2 = new JSONObject();
        int i9 = 1;
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put("message", "");
            JSONArray jSONArray = jSONObject.getJSONArray("resource");
            if (jSONArray != null && jSONArray.length() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                int length = jSONArray.length();
                int i10 = 0;
                while (i10 < length) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                    String optString = jSONObject3.optString("ref", "");
                    int i11 = jSONObject3.getInt("type");
                    JSONObject jSONObject4 = new JSONObject();
                    if (i11 == i9 && !TextUtils.isEmpty(optString)) {
                        JSONObject jSONObject5 = new JSONObject();
                        com.anythink.expressad.videocommon.b.a.a();
                        com.anythink.core.common.a.n b9 = com.anythink.expressad.videocommon.b.a.b(optString);
                        if (b9 != null) {
                            jSONObject5.put("type", i9);
                            i = length;
                            i4 = i10;
                            jSONObject5.put("videoDataLength", b9.d());
                            String b10 = b9.b();
                            if (TextUtils.isEmpty(b10)) {
                                jSONObject5.put(com.anythink.expressad.a.f17761K, "");
                                jSONObject5.put("path4Web", "");
                            } else {
                                jSONObject5.put(com.anythink.expressad.a.f17761K, b10);
                                jSONObject5.put("path4Web", b10);
                            }
                            if (b9.c() == 100) {
                                jSONObject5.put("downloaded", 1);
                                z8 = false;
                            } else {
                                z8 = false;
                                jSONObject5.put("downloaded", 0);
                            }
                            jSONObject4.put(optString, jSONObject5);
                            jSONArray2.put(jSONObject4);
                        } else {
                            i = length;
                            i4 = i10;
                            z8 = false;
                        }
                    } else {
                        i = length;
                        i4 = i10;
                        z8 = false;
                        if (i11 == 2 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("type", 2);
                            jSONObject6.put(com.anythink.expressad.a.f17761K, i.a().a(optString) == null ? "" : i.a().b(optString));
                            jSONObject4.put(optString, jSONObject6);
                            jSONArray2.put(jSONObject4);
                        } else if (i11 == 3 && !TextUtils.isEmpty(optString)) {
                            try {
                                file = new File(optString);
                            } catch (Throwable th) {
                                if (com.anythink.expressad.a.f17776a) {
                                    th.printStackTrace();
                                }
                            }
                            if (file.exists() && file.isFile() && file.canRead()) {
                                str = "file:////".concat(String.valueOf(optString));
                                JSONObject jSONObject7 = new JSONObject();
                                jSONObject7.put("type", 3);
                                jSONObject7.put(com.anythink.expressad.a.f17761K, str);
                                jSONObject4.put(optString, jSONObject7);
                                jSONArray2.put(jSONObject4);
                            }
                            str = "";
                            JSONObject jSONObject72 = new JSONObject();
                            jSONObject72.put("type", 3);
                            jSONObject72.put(com.anythink.expressad.a.f17761K, str);
                            jSONObject4.put(optString, jSONObject72);
                            jSONArray2.put(jSONObject4);
                        } else if (i11 == 4 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("type", 4);
                            jSONObject8.put(com.anythink.expressad.a.f17761K, u.a(optString) == null ? "" : u.a(optString));
                            jSONObject4.put(optString, jSONObject8);
                            jSONArray2.put(jSONObject4);
                        }
                    }
                    i10 = i4 + 1;
                    length = i;
                    i9 = 1;
                }
                jSONObject2.put("resource", jSONArray2);
                h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            }
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put("message", "resource is null");
                h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e6) {
                e6.getMessage();
                return;
            }
        } catch (Throwable th2) {
            jSONObject2.put("code", 1);
            jSONObject2.put("message", th2.getLocalizedMessage());
            h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        }
        try {
            jSONObject2.put("code", 1);
            jSONObject2.put("message", th2.getLocalizedMessage());
            h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (JSONException e9) {
            e9.getMessage();
        }
    }
}
