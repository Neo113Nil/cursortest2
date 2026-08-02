package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.f.a.a;
import com.anythink.expressad.foundation.h.v;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class BaseAbsFeedBackForH5 extends j {

    /* renamed from: b, reason: collision with root package name */
    public static final String f18827b = "onFeedbackAlertStatusNotify";

    /* renamed from: c, reason: collision with root package name */
    public static final String f18828c = "status";

    /* renamed from: d, reason: collision with root package name */
    public static final int f18829d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f18830e = 2;
    private static int i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static int f18831j = 1;

    /* renamed from: a, reason: collision with root package name */
    private String f18832a = "AbsFeedBackForH5";

    public void callbackExcep(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f18831j);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public void callbackSuccess(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put("message", "");
            jSONObject.put("data", new JSONObject());
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e9) {
            callbackExcep(obj, e9.getMessage());
            e9.getMessage();
        }
    }

    public void callbackSuccessWithData(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", i);
            jSONObject2.put("message", "");
            jSONObject2.put("data", jSONObject);
            h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e9) {
            callbackExcep(obj, e9.getMessage());
            e9.getMessage();
        }
    }

    public void feedbackLayoutOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("width", -1);
                int optInt2 = jSONObject.optInt("height", -1);
                int optInt3 = jSONObject.optInt("radius", 20);
                int optInt4 = jSONObject.optInt("left", -1);
                int optInt5 = jSONObject.optInt("top", -1);
                double optDouble = jSONObject.optDouble("opacity", 1.0d);
                String optString = jSONObject.optString("fontColor", "");
                String optString2 = jSONObject.optString("bgColor", "");
                com.anythink.expressad.foundation.f.a.a a9 = com.anythink.expressad.foundation.f.b.a().a(jSONObject.optString("key", ""));
                Context g9 = t.b().g();
                a9.a(v.b(g9, optInt4), v.b(g9, optInt5), v.b(g9, optInt), v.b(g9, optInt2), v.b(g9, optInt3), (float) optDouble, optString, optString2);
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void feedbackOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                b bVar = (b) obj;
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("view_visible", 1);
                String optString = jSONObject.optString("key", "");
                com.anythink.expressad.foundation.f.b a9 = com.anythink.expressad.foundation.f.b.a();
                int i4 = optInt == 1 ? 8 : 0;
                WindVaneWebView windVaneWebView = bVar.f18849a;
                com.anythink.expressad.foundation.f.a.a a10 = a9.a(optString);
                if (a10.c() != null) {
                    a10.a(i4);
                    if (i4 == 0) {
                        a9.a(optString, t.b().g(), windVaneWebView, null, null);
                    }
                }
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void feedbackPopupOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("view_visible", 1);
                String optString = jSONObject.optString("key", "");
                final WindVaneWebView windVaneWebView = ((b) obj).f18849a;
                com.anythink.expressad.foundation.f.a aVar = new com.anythink.expressad.foundation.f.a() { // from class: com.anythink.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5.1
                    @Override // com.anythink.expressad.foundation.f.a
                    public final void a() {
                        String str2;
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            if (t.b().g() != null) {
                                jSONObject2.put("status", 1);
                            }
                            str2 = jSONObject2.toString();
                        } catch (Throwable th) {
                            String unused = BaseAbsFeedBackForH5.this.f18832a;
                            th.getMessage();
                            str2 = "";
                        }
                        com.anythink.core.express.d.a.a((WebView) windVaneWebView, BaseAbsFeedBackForH5.f18827b, com.IceFishing.LiveIceFishing.k.o(2, str2));
                    }

                    @Override // com.anythink.expressad.foundation.f.a
                    public final void b() {
                        String str2;
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            if (t.b().g() != null) {
                                jSONObject2.put("status", 2);
                            }
                            str2 = jSONObject2.toString();
                        } catch (Throwable th) {
                            String unused = BaseAbsFeedBackForH5.this.f18832a;
                            th.getMessage();
                            str2 = "";
                        }
                        com.anythink.core.express.d.a.a((WebView) windVaneWebView, BaseAbsFeedBackForH5.f18827b, com.IceFishing.LiveIceFishing.k.o(2, str2));
                    }

                    @Override // com.anythink.expressad.foundation.f.a
                    public final void c() {
                        String str2;
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            if (t.b().g() != null) {
                                jSONObject2.put("status", 2);
                            }
                            str2 = jSONObject2.toString();
                        } catch (Throwable th) {
                            String unused = BaseAbsFeedBackForH5.this.f18832a;
                            th.getMessage();
                            str2 = "";
                        }
                        com.anythink.core.express.d.a.a((WebView) windVaneWebView, BaseAbsFeedBackForH5.f18827b, com.IceFishing.LiveIceFishing.k.o(2, str2));
                    }
                };
                com.anythink.expressad.foundation.f.a.a a9 = com.anythink.expressad.foundation.f.b.a().a(optString);
                a9.a(new a.C0120a(optString, aVar));
                if (optInt == 1) {
                    a9.b();
                } else {
                    a9.a();
                }
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void getCacheKey(Object obj, String str) {
        try {
            com.anythink.expressad.atsignalcommon.d.a.a().a(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void startShake(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.optInt("deviceMotionUpdateInterval", 1);
                com.anythink.expressad.atsignalcommon.d.a.a().a(obj, ((b) obj).f18849a, jSONObject.optString("oldCache", ""), jSONObject.optString(com.anythink.expressad.foundation.g.g.a.b.f20208O, ""));
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void stopShake(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                com.anythink.expressad.atsignalcommon.d.a.a().a(obj, ((b) obj).f18849a, new JSONObject(str).optString(com.anythink.expressad.foundation.g.g.a.b.f20208O, ""));
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }
}
