package com.anythink.expressad.video.bt.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.anythink.core.common.a.n;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.am;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.u;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.bt.a.a;
import com.anythink.expressad.video.bt.module.ATTempContainer;
import com.anythink.expressad.video.bt.module.AnythinkBTContainer;
import com.anythink.expressad.video.bt.module.AnythinkBTLayout;
import com.anythink.expressad.video.bt.module.AnythinkBTNativeEC;
import com.anythink.expressad.video.bt.module.AnythinkBTVideoView;
import com.anythink.expressad.video.bt.module.AnythinkBTWebView;
import com.anythink.expressad.video.bt.module.BTBaseView;
import com.anythink.expressad.video.signal.a.j;
import com.anythink.expressad.videocommon.b.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f20840a = -999;

    /* renamed from: b, reason: collision with root package name */
    private static final String f20841b = "OperateViews";

    /* renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, LinkedHashMap<String, View>> f20842c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static LinkedHashMap<String, String> f20843d = new LinkedHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private static LinkedHashMap<String, d> f20844e = new LinkedHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private static LinkedHashMap<String, com.anythink.expressad.videocommon.e.d> f20845f = new LinkedHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private static LinkedHashMap<String, String> f20846g = new LinkedHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private static LinkedHashMap<String, Integer> f20847h = new LinkedHashMap<>();
    private static LinkedHashMap<String, Activity> i = new LinkedHashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private static volatile int f20848j = 10000;

    /* renamed from: k, reason: collision with root package name */
    private static int f20849k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static int f20850l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static String f20851m = "";

    /* renamed from: n, reason: collision with root package name */
    private static int f20852n;

    /* renamed from: o, reason: collision with root package name */
    private static int f20853o;

    /* renamed from: p, reason: collision with root package name */
    private static int f20854p;

    /* renamed from: q, reason: collision with root package name */
    private static int f20855q;

    /* renamed from: r, reason: collision with root package name */
    private static int f20856r;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static c f20871a = new c(0);

        private a() {
        }
    }

    public /* synthetic */ c(byte b9) {
        this();
    }

    public static void E(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    public static void I(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    public static void J(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
            } else {
                c(obj, "android mediaPlayer not support setScaleType");
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    public static void P(Object obj, JSONObject jSONObject) {
        int i6;
        int i9;
        boolean z3;
        String str;
        File file;
        JSONObject jSONObject2 = new JSONObject();
        int i10 = 1;
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put("message", "");
            JSONArray jSONArray = jSONObject.getJSONArray("resource");
            if (jSONArray == null || jSONArray.length() <= 0) {
                try {
                    jSONObject2.put("code", 1);
                    jSONObject2.put("message", "resource is null");
                    h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    return;
                } catch (JSONException e9) {
                    e9.getMessage();
                    return;
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            int length = jSONArray.length();
            int i11 = 0;
            while (i11 < length) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i11);
                String optString = jSONObject3.optString("ref", "");
                int i12 = jSONObject3.getInt("type");
                JSONObject jSONObject4 = new JSONObject();
                if (i12 != i10 || TextUtils.isEmpty(optString)) {
                    i6 = length;
                    i9 = i11;
                    z3 = false;
                    if (i12 == 2 && !TextUtils.isEmpty(optString)) {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("type", 2);
                        jSONObject5.put(com.anythink.expressad.a.f17603K, i.a().b(optString) == null ? "" : i.a().b(optString));
                        jSONObject4.put(optString, jSONObject5);
                        jSONArray2.put(jSONObject4);
                    } else if (i12 == 3 && !TextUtils.isEmpty(optString)) {
                        try {
                            file = new File(optString);
                        } catch (Throwable th) {
                            if (com.anythink.expressad.a.f17618a) {
                                th.printStackTrace();
                            }
                        }
                        if (file.exists() && file.isFile() && file.canRead()) {
                            str = "file:////".concat(String.valueOf(optString));
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("type", 3);
                            jSONObject6.put(com.anythink.expressad.a.f17603K, str);
                            jSONObject4.put(optString, jSONObject6);
                            jSONArray2.put(jSONObject4);
                        }
                        str = "";
                        JSONObject jSONObject62 = new JSONObject();
                        jSONObject62.put("type", 3);
                        jSONObject62.put(com.anythink.expressad.a.f17603K, str);
                        jSONObject4.put(optString, jSONObject62);
                        jSONArray2.put(jSONObject4);
                    } else if (i12 == 4 && !TextUtils.isEmpty(optString)) {
                        JSONObject jSONObject7 = new JSONObject();
                        jSONObject7.put("type", 4);
                        jSONObject7.put(com.anythink.expressad.a.f17603K, u.a(optString) == null ? "" : u.a(optString));
                        jSONObject4.put(optString, jSONObject7);
                        jSONArray2.put(jSONObject4);
                    }
                } else {
                    JSONObject jSONObject8 = new JSONObject();
                    com.anythink.expressad.videocommon.b.a.a();
                    n b9 = com.anythink.expressad.videocommon.b.a.b(optString);
                    if (b9 != null) {
                        jSONObject8.put("type", i10);
                        i6 = length;
                        i9 = i11;
                        jSONObject8.put("videoDataLength", b9.d());
                        String b10 = b9.b();
                        if (TextUtils.isEmpty(b10)) {
                            jSONObject8.put(com.anythink.expressad.a.f17603K, "");
                            jSONObject8.put("path4Web", "");
                        } else {
                            jSONObject8.put(com.anythink.expressad.a.f17603K, b10);
                            jSONObject8.put("path4Web", b10);
                        }
                        if (b9.c() == 100) {
                            jSONObject8.put("downloaded", 1);
                            z3 = false;
                        } else {
                            z3 = false;
                            jSONObject8.put("downloaded", 0);
                        }
                        jSONObject4.put(optString, jSONObject8);
                        jSONArray2.put(jSONObject4);
                    } else {
                        i6 = length;
                        i9 = i11;
                        z3 = false;
                    }
                }
                i11 = i9 + 1;
                length = i6;
                i10 = 1;
            }
            jSONObject2.put("resource", jSONArray2);
            h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            return;
        } catch (Throwable th2) {
            jSONObject2.put("code", 1);
            jSONObject2.put("message", th2.getLocalizedMessage());
            h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        }
        try {
            jSONObject2.put("code", 1);
            jSONObject2.put("message", th2.getLocalizedMessage());
            h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (JSONException e10) {
            e10.getMessage();
        }
    }

    public static c a() {
        return a.f20871a;
    }

    public static String b() {
        int i6 = f20848j + 1;
        f20848j = i6;
        return String.valueOf(i6);
    }

    public static void d(String str) {
        i.remove(str);
    }

    public static int e(String str) {
        if (f20847h.containsKey(str)) {
            return f20847h.get(str).intValue();
        }
        return 2;
    }

    public static void f(String str) {
        if (f20846g.containsKey(str)) {
            f20846g.remove(str);
        }
        if (f20845f.containsKey(str)) {
            f20845f.remove(str);
        }
        if (f20844e.containsKey(str)) {
            f20844e.remove(str);
        }
        if (f20843d.containsKey(str)) {
            f20843d.remove(str);
        }
    }

    public static void g(String str) {
        if (f20847h.containsKey(str)) {
            f20847h.remove(str);
        }
    }

    private static String h(String str) {
        return f20843d.containsKey(str) ? f20843d.get(str) : "";
    }

    private static Activity i(String str) {
        if (i.containsKey(str)) {
            return i.get(str);
        }
        return null;
    }

    public final void A(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (!b9.containsKey(optString2)) {
                c(obj, "instanceId not exit");
                return;
            }
            View view = b9.get(optString2);
            if (!(view instanceof AnythinkBTVideoView)) {
                c(obj, "instanceId is not player");
            } else {
                ((AnythinkBTVideoView) view).play();
                a(obj, optString2);
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void B(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (!b9.containsKey(optString2)) {
                c(obj, "instanceId not exit");
                return;
            }
            View view = b9.get(optString2);
            if (!(view instanceof AnythinkBTVideoView)) {
                c(obj, "instanceId is not player");
            } else {
                ((AnythinkBTVideoView) view).pause();
                a(obj, optString2);
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void C(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (!b9.containsKey(optString2)) {
                c(obj, "instanceId not exit");
                return;
            }
            View view = b9.get(optString2);
            if (!(view instanceof AnythinkBTVideoView)) {
                c(obj, "instanceId is not player");
            } else {
                ((AnythinkBTVideoView) view).resume();
                a(obj, optString2);
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void D(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (!b9.containsKey(optString2)) {
                c(obj, "instanceId not exit");
                return;
            }
            View view = b9.get(optString2);
            if (!(view instanceof AnythinkBTVideoView)) {
                c(obj, "instanceId is not player");
            } else {
                ((AnythinkBTVideoView) view).stop();
                a(obj, optString2);
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void F(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (!b9.containsKey(optString2)) {
                c(obj, "instanceId not exist");
                return;
            }
            View view = b9.get(optString2);
            if (!(view instanceof AnythinkBTVideoView)) {
                c(obj, "instanceId is not player");
            } else if (((AnythinkBTVideoView) view).playMute()) {
                a(obj, optString2);
            } else {
                c(obj, "set mute failed");
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void G(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (!b9.containsKey(optString2)) {
                c(obj, "instanceId not exit");
                return;
            }
            View view = b9.get(optString2);
            if (!(view instanceof AnythinkBTVideoView)) {
                c(obj, "instanceId is not player");
            } else if (!((AnythinkBTVideoView) view).playUnMute()) {
                a(obj, "set unmute failed");
            } else {
                a(obj, optString2);
                a(obj, "onUnmute", optString2);
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void H(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (!b9.containsKey(optString2)) {
                c(obj, "instanceId not exist");
                return;
            }
            View view = b9.get(optString2);
            if (!(view instanceof AnythinkBTVideoView)) {
                c(obj, "instanceId is not player");
                return;
            }
            int mute = ((AnythinkBTVideoView) view).getMute();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f20849k);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("id", optString2);
            jSONObject3.put("mute", mute);
            jSONObject2.put("data", jSONObject3);
            h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void K(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (!b9.containsKey(optString2)) {
                c(obj, "instanceId not exist");
                return;
            }
            View view = b9.get(optString2);
            if (!(view instanceof ATTempContainer)) {
                c(obj, "view not exist");
            } else {
                ((ATTempContainer) view).preload();
                a(obj, optString2);
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void L(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (b9.size() <= 0) {
                c(obj, "unitId or instanceId not exist");
                return;
            }
            AnythinkBTContainer anythinkBTContainer = null;
            for (View view : b9.values()) {
                if (view instanceof AnythinkBTContainer) {
                    anythinkBTContainer = (AnythinkBTContainer) view;
                } else if (view instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) view).onDestory();
                } else if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).getInstanceId();
                    com.anythink.expressad.video.bt.a.a unused = a.C0133a.f20834a;
                    ((AnythinkBTVideoView) view).onDestory();
                } else if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).onDestroy();
                }
            }
            if (anythinkBTContainer == null) {
                c(obj, "not found AnythinkBTContainer");
                return;
            }
            anythinkBTContainer.onAdClose();
            f20842c.remove(b9);
            b9.clear();
            f20842c.remove(optString + "_" + h9);
            a(obj, optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void M(Object obj, JSONObject jSONObject) {
        try {
            WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a;
            String rid = windVaneWebView != null ? windVaneWebView.getRid() : "";
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("eventName");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            LinkedHashMap<String, View> b9 = b(optString, rid);
            if (b9 == null || b9.size() <= 0) {
                c(obj, "unitId not exist");
                return;
            }
            for (View view : b9.values()) {
                if (view instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) view).broadcast(optString2, optJSONObject);
                }
                if (view instanceof AnythinkBTLayout) {
                    ((AnythinkBTLayout) view).broadcast(optString2, optJSONObject);
                }
            }
            a(obj, "");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void N(Object obj, JSONObject jSONObject) {
        com.anythink.expressad.videocommon.c.c cVar;
        String str;
        try {
            WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a;
            String rid = windVaneWebView != null ? windVaneWebView.getRid() : "";
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            String optString3 = optJSONObject.optString("userId");
            boolean optBoolean = optJSONObject.optBoolean("expired");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("reward");
            String optString4 = optJSONObject.optString("extra");
            if (optJSONObject2 != null) {
                cVar = new com.anythink.expressad.videocommon.c.c(optJSONObject2.optString("name"), optJSONObject2.optInt("amount"));
                str = optJSONObject2.optString("id");
            } else {
                cVar = null;
                str = "";
            }
            LinkedHashMap<String, View> b9 = b(optString, rid);
            if (b9.size() <= 0 || !f20846g.containsKey(optString2)) {
                c(obj, "unitId not exist");
                return;
            }
            View view = b9.get(optString2);
            if (!(view instanceof ATTempContainer)) {
                c(obj, "instanceId not exist");
                return;
            }
            ATTempContainer aTTempContainer = (ATTempContainer) view;
            aTTempContainer.setReward(cVar);
            aTTempContainer.setUserId(optString3);
            aTTempContainer.setRewardId(str);
            aTTempContainer.setCampaignExpired(optBoolean);
            if (!TextUtils.isEmpty(optString4)) {
                aTTempContainer.setDeveloperExtraData(optString4);
            }
            a(obj, optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void O(Object obj, JSONObject jSONObject) {
        try {
            WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a;
            String rid = windVaneWebView != null ? windVaneWebView.getRid() : "";
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            String optString3 = optJSONObject.optString("eventName");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("eventData");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            LinkedHashMap<String, View> b9 = b(optString, rid);
            if (b9.size() <= 0) {
                c(obj, "unitId not exist");
                return;
            }
            View view = b9.get(optString2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = viewGroup.getChildAt(i6);
                    if (childAt instanceof WindVaneWebView) {
                        h.a();
                        com.anythink.core.express.d.a.a((WebView) childAt, optString3, Base64.encodeToString(optJSONObject2.toString().getBytes(), 2));
                        a(obj, optString2);
                        return;
                    }
                }
            }
            c(obj, "instanceId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void Q(Object obj, JSONObject jSONObject) {
        Objects.toString(jSONObject);
        try {
            String optString = jSONObject.optString("unitId");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String str = "";
                d b9 = d.b(optJSONObject.optJSONObject("campaign"));
                if (b9 != null && !TextUtils.isEmpty(optString)) {
                    b9.l(optString);
                    str = b9.aa();
                }
                com.anythink.expressad.videocommon.e.d a9 = com.anythink.expressad.videocommon.e.d.a(optJSONObject.optJSONObject("unitSetting"));
                if (a9 != null) {
                    a9.a(optString);
                }
                AnythinkBTNativeEC anythinkBTNativeEC = new AnythinkBTNativeEC(t.b().g());
                anythinkBTNativeEC.setCampaign(b9);
                j jVar = new j(null, b9);
                jVar.a(optString);
                anythinkBTNativeEC.setJSCommon(jVar);
                anythinkBTNativeEC.setUnitId(optString);
                anythinkBTNativeEC.setRewardUnitSetting(a9);
                WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a;
                if (windVaneWebView != null) {
                    str = windVaneWebView.getRid();
                    anythinkBTNativeEC.setCreateWebView(windVaneWebView);
                }
                LinkedHashMap<String, View> b10 = b(optString, str);
                String b11 = b();
                f20843d.put(b11, str);
                anythinkBTNativeEC.setInstanceId(b11);
                b10.put(b11, anythinkBTNativeEC);
                anythinkBTNativeEC.preLoadData();
                if (b9 == null) {
                    c(obj, "campaign is null");
                    return;
                } else {
                    a(obj, b11);
                    return;
                }
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void j(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String optString3 = optJSONObject.optString("id");
                LinkedHashMap<String, View> b9 = b(optString, h9);
                if (!b9.containsKey(optString2) || !b9.containsKey(optString3)) {
                    c(obj, "instanceId is not exist");
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) b9.get(optString3);
                View view = b9.get(optString2);
                am.a(view);
                if (viewGroup != null && view != null) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                    if (view instanceof ATTempContainer) {
                        Iterator<View> it = b9.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            View next = it.next();
                            if (next instanceof AnythinkBTContainer) {
                                am.a(view);
                                ((AnythinkBTContainer) next).appendSubView((AnythinkBTContainer) next, (ATTempContainer) view, optJSONObject2);
                                break;
                            }
                        }
                    } else {
                        if (optJSONObject2 != null) {
                            Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                            optInt = optJSONObject2.optInt("width");
                            optInt2 = optJSONObject2.optInt("height");
                            rect = rect2;
                        } else if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            optInt = ((BTBaseView) view).getViewWidth();
                            optInt2 = ((BTBaseView) view).getViewHeight();
                        } else {
                            optInt = 0;
                            rect = null;
                            optInt2 = 0;
                        }
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        if (viewGroup instanceof FrameLayout) {
                            layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof RelativeLayout) {
                            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof LinearLayout) {
                            layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        }
                        ViewGroup.LayoutParams a9 = a(layoutParams, rect, optInt, optInt2);
                        am.a(view);
                        viewGroup.addView(view, a9);
                    }
                    a(obj, optString2);
                    a(obj, "onAppendViewTo", optString2);
                    return;
                }
                c(obj, "view is not exist");
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void k(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("id");
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (!b9.containsKey(optString3) || !b9.containsKey(optString2)) {
                c(obj, "instanceId is not exist");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) b9.get(optString2);
            View view = b9.get(optString3);
            if (viewGroup != null && view != null) {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                if (view instanceof ATTempContainer) {
                    String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(f20852n), Integer.valueOf(f20853o), Integer.valueOf(f20854p), Integer.valueOf(f20855q), Integer.valueOf(f20856r));
                    ((ATTempContainer) view).setNotchPadding(f20852n, f20853o, f20854p, f20855q, f20856r);
                    Iterator<View> it = b9.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        View next = it.next();
                        if (next instanceof AnythinkBTContainer) {
                            am.a(view);
                            ((AnythinkBTContainer) next).appendSubView((AnythinkBTContainer) next, (ATTempContainer) view, optJSONObject2);
                            break;
                        }
                    }
                } else {
                    if (optJSONObject2 != null) {
                        Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                        optInt = optJSONObject2.optInt("width");
                        optInt2 = optJSONObject2.optInt("height");
                        rect = rect2;
                    } else if (view instanceof BTBaseView) {
                        rect = ((BTBaseView) view).getRect();
                        optInt = ((BTBaseView) view).getViewWidth();
                        optInt2 = ((BTBaseView) view).getViewHeight();
                    } else {
                        optInt = 0;
                        rect = null;
                        optInt2 = 0;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    viewGroup.addView(view, a(layoutParams, rect, optInt, optInt2));
                }
                a(obj, optString2);
                a(obj, "onAppendView", optString2);
                return;
            }
            c(obj, "view is not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void l(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String optString3 = optJSONObject.optString("id");
                LinkedHashMap<String, View> b9 = b(optString, h9);
                if (!b9.containsKey(optString2) || !b9.containsKey(optString3)) {
                    c(obj, "instanceId is not exist");
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) b9.get(optString3);
                View view = b9.get(optString2);
                if (viewGroup != null && view != null) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                    if (view instanceof ATTempContainer) {
                        Iterator<View> it = b9.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            View next = it.next();
                            if (next instanceof AnythinkBTContainer) {
                                am.a(view);
                                ((AnythinkBTContainer) next).appendSubView((AnythinkBTContainer) next, (ATTempContainer) view, optJSONObject2);
                                break;
                            }
                        }
                    } else {
                        if (optJSONObject2 != null) {
                            Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                            optInt = optJSONObject2.optInt("width");
                            optInt2 = optJSONObject2.optInt("height");
                            rect = rect2;
                        } else if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            optInt = ((BTBaseView) view).getViewWidth();
                            optInt2 = ((BTBaseView) view).getViewHeight();
                        } else {
                            optInt = 0;
                            rect = null;
                            optInt2 = 0;
                        }
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        if (viewGroup instanceof FrameLayout) {
                            layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof RelativeLayout) {
                            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof LinearLayout) {
                            layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        }
                        viewGroup.addView(view, a(layoutParams, rect, optInt, optInt2));
                    }
                    a(obj, optString2);
                    a(obj, "onAppendViewTo", optString2);
                    return;
                }
                c(obj, "view is not exist");
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void m(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (!b9.containsKey(optString2)) {
                c(obj, "instanceId is not exist");
                return;
            }
            View view = b9.get(optString2);
            if (view == null || view.getParent() == null) {
                c(obj, "view is null");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup == null) {
                c(obj, "parent is null");
                return;
            }
            viewGroup.bringChildToFront(view);
            a(obj, optString2);
            a(obj, "onBringViewToFront", optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void n(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (!b9.containsKey(optString2)) {
                c(obj, "instanceId not exist");
                return;
            }
            View view = b9.get(optString2);
            if (view == null) {
                c(obj, "view not exist");
                return;
            }
            view.setVisibility(8);
            a(obj, optString2);
            a(obj, "onHideView", optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void o(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (!b9.containsKey(optString2)) {
                c(obj, "instanceId not exist");
                return;
            }
            View view = b9.get(optString2);
            if (view == null) {
                c(obj, "view not exist");
                return;
            }
            view.setVisibility(0);
            a(obj, optString2);
            a(obj, "onShowView", optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void p(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString(k.f19633d);
            if (TextUtils.isEmpty(optString3)) {
                c(obj, "color is not exist");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (!b9.containsKey(optString2)) {
                c(obj, "instanceId not exist");
                return;
            }
            View view = b9.get(optString2);
            if (view == null) {
                c(obj, "view not exist");
                return;
            }
            a(obj, optString2);
            view.setBackgroundColor(Color.parseColor(optString3));
            a(obj, "onViewBgColorChanged", optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void q(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            double optDouble = optJSONObject.optDouble("alpha", 1.0d);
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (!b9.containsKey(optString2)) {
                c(obj, "instanceId not exist");
                return;
            }
            View view = b9.get(optString2);
            if (view == null) {
                c(obj, "view not exist");
                return;
            }
            view.setAlpha((float) optDouble);
            a(obj, optString2);
            a(obj, "onViewAlphaChanged", optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void r(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            double optDouble = optJSONObject.optDouble("vertical", 1.0d);
            double optDouble2 = optJSONObject.optDouble("horizon", 1.0d);
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (!b9.containsKey(optString2)) {
                c(obj, "instanceId not exist");
                return;
            }
            View view = b9.get(optString2);
            if (view == null) {
                c(obj, "view not exist");
                return;
            }
            view.setScaleX((float) optDouble2);
            view.setScaleY((float) optDouble);
            a(obj, optString2);
            a(obj, "onViewScaleChanged", optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void s(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("targetComponentId");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (!b9.containsKey(optString2) || !b9.containsKey(optString3)) {
                c(obj, "instanceId not exist");
                return;
            }
            View view = b9.get(optString2);
            View view2 = b9.get(optString3);
            if (view2 == null || view2.getParent() == null) {
                c(obj, "view not exist");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            int indexOfChild = viewGroup.indexOfChild(view2);
            if (optJSONObject2 != null) {
                Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                optInt = optJSONObject2.optInt("width");
                optInt2 = optJSONObject2.optInt("height");
                rect = rect2;
            } else if (view instanceof BTBaseView) {
                rect = ((BTBaseView) view).getRect();
                optInt = ((BTBaseView) view).getViewWidth();
                optInt2 = ((BTBaseView) view).getViewHeight();
            } else {
                optInt = 0;
                rect = null;
                optInt2 = 0;
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof LinearLayout) {
                layoutParams = new LinearLayout.LayoutParams(-1, -1);
            }
            ViewGroup.LayoutParams a9 = a(layoutParams, rect, optInt, optInt2);
            am.a(view);
            viewGroup.addView(view, indexOfChild + 1, a9);
            a(obj, optString2);
            a(obj, "onInsertViewAbove", optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void t(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("targetComponentId");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (!b9.containsKey(optString2) || !b9.containsKey(optString3)) {
                c(obj, "instanceId not exist");
                return;
            }
            View view = b9.get(optString2);
            View view2 = b9.get(optString3);
            if (view2 == null || view2.getParent() == null) {
                c(obj, "view not exist");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            int indexOfChild = viewGroup.indexOfChild(view2);
            if (optJSONObject2 != null) {
                Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                optInt = optJSONObject2.optInt("width");
                optInt2 = optJSONObject2.optInt("height");
                rect = rect2;
            } else if (view instanceof BTBaseView) {
                rect = ((BTBaseView) view).getRect();
                optInt = ((BTBaseView) view).getViewWidth();
                optInt2 = ((BTBaseView) view).getViewHeight();
            } else {
                rect = null;
                optInt = 0;
                optInt2 = 0;
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof LinearLayout) {
                layoutParams = new LinearLayout.LayoutParams(-1, -1);
            }
            ViewGroup.LayoutParams a9 = a(layoutParams, rect, optInt, optInt2);
            am.a(view);
            int i6 = indexOfChild - 1;
            viewGroup.addView(view, i6 >= 0 ? i6 : 0, a9);
            a(obj, optString2);
            a(obj, "onInsertViewBelow", optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void u(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("targetComponentId");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (!b9.containsKey(optString2) || !b9.containsKey(optString3)) {
                c(obj, "instanceId not exist");
                return;
            }
            View view = b9.get(optString2);
            View view2 = b9.get(optString3);
            if (view2 == null || view2.getParent() == null) {
                c(obj, "view not exist");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            int indexOfChild = viewGroup.indexOfChild(view2);
            if (optJSONObject2 != null) {
                Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                optInt = optJSONObject2.optInt("width");
                optInt2 = optJSONObject2.optInt("height");
                rect = rect2;
            } else if (view instanceof BTBaseView) {
                rect = ((BTBaseView) view).getRect();
                optInt = ((BTBaseView) view).getViewWidth();
                optInt2 = ((BTBaseView) view).getViewHeight();
            } else {
                optInt = 0;
                rect = null;
                optInt2 = 0;
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof LinearLayout) {
                layoutParams = new LinearLayout.LayoutParams(-1, -1);
            }
            viewGroup.addView(view, indexOfChild + 1, a(layoutParams, rect, optInt, optInt2));
            a(obj, optString2);
            a(obj, "onInsertViewAbove", optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void v(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("targetComponentId");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (!b9.containsKey(optString2) || !b9.containsKey(optString3)) {
                c(obj, "instanceId not exist");
                return;
            }
            View view = b9.get(optString2);
            View view2 = b9.get(optString3);
            if (view2 == null || view2.getParent() == null) {
                c(obj, "view not exist");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            int indexOfChild = viewGroup.indexOfChild(view2);
            if (optJSONObject2 != null) {
                Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                optInt = optJSONObject2.optInt("width");
                optInt2 = optJSONObject2.optInt("height");
                rect = rect2;
            } else if (view instanceof BTBaseView) {
                rect = ((BTBaseView) view).getRect();
                optInt = ((BTBaseView) view).getViewWidth();
                optInt2 = ((BTBaseView) view).getViewHeight();
            } else {
                optInt = 0;
                rect = null;
                optInt2 = 0;
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof LinearLayout) {
                layoutParams = new LinearLayout.LayoutParams(-1, -1);
            }
            viewGroup.addView(view, indexOfChild, a(layoutParams, rect, optInt, optInt2));
            a(obj, optString2);
            a(obj, "onInsertViewBelow", optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void w(Object obj, JSONObject jSONObject) {
        int i6;
        int i9;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("content");
            if (optJSONObject2 == null) {
                c(obj, "content is empty");
                return;
            }
            String optString3 = optJSONObject2.optString("fileURL");
            String optString4 = optJSONObject2.optString("filePath");
            String optString5 = optJSONObject2.optString(com.onesignal.inAppMessages.internal.d.HTML);
            if (TextUtils.isEmpty(optString3) && TextUtils.isEmpty(optString4) && TextUtils.isEmpty(optString5)) {
                c(obj, "url is empty");
                return;
            }
            JSONArray optJSONArray = optJSONObject2.optJSONArray("campaigns");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    d b9 = d.b(optJSONArray.getJSONObject(i10));
                    if (b9 != null) {
                        b9.l(optString);
                        arrayList.add(b9);
                    }
                }
            }
            String optString6 = optJSONObject2.optString("unitId");
            com.anythink.expressad.videocommon.e.d a9 = com.anythink.expressad.videocommon.e.d.a(optJSONObject2.optJSONObject("unitSetting"));
            if (a9 != null) {
                a9.a(optString6);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("rect");
            Rect rect = new Rect(-999, -999, -999, -999);
            if (optJSONObject3 != null) {
                Rect rect2 = new Rect(optJSONObject3.optInt("left", -999), optJSONObject3.optInt("top", -999), optJSONObject3.optInt("right", -999), optJSONObject3.optInt("bottom", -999));
                int optInt = optJSONObject3.optInt("width");
                i6 = optJSONObject3.optInt("height");
                i9 = optInt;
                rect = rect2;
            } else {
                i6 = 0;
                i9 = 0;
            }
            int optInt2 = optJSONObject2.optInt("refreshCache", 0);
            try {
                LinkedHashMap<String, View> b10 = b(optString, h9);
                if (!b10.containsKey(optString2)) {
                    c(obj, "instanceId not exist");
                    return;
                }
                View view = b10.get(optString2);
                if (!(view instanceof AnythinkBTWebView)) {
                    c(obj, "view not exist");
                    return;
                }
                AnythinkBTWebView anythinkBTWebView = (AnythinkBTWebView) view;
                anythinkBTWebView.setHtml(optString5);
                anythinkBTWebView.setFilePath(optString4);
                anythinkBTWebView.setFileURL(optString3);
                anythinkBTWebView.setRect(rect);
                anythinkBTWebView.setLayout(i9, i6);
                anythinkBTWebView.setCampaigns(arrayList);
                anythinkBTWebView.setRewardUnitSetting(a9);
                anythinkBTWebView.webviewLoad(optInt2);
                a(obj, optString2);
            } catch (Throwable th) {
                th = th;
                c(obj, th.getMessage());
                th.getMessage();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void x(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (!b9.containsKey(optString2)) {
                c(obj, "instanceId not exist");
                return;
            }
            View view = b9.get(optString2);
            if (!(view instanceof AnythinkBTWebView)) {
                c(obj, "view not exist");
            } else if (((AnythinkBTWebView) view).webviewReload()) {
                a(obj, optString2);
            } else {
                c(obj, "reload failed");
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void y(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (!b9.containsKey(optString2)) {
                c(obj, "instanceId not exist");
                return;
            }
            View view = b9.get(optString2);
            if (!(view instanceof AnythinkBTWebView)) {
                c(obj, "view not exist");
            } else if (((AnythinkBTWebView) view).webviewGoBack()) {
                a(obj, optString2);
            } else {
                c(obj, "webviewGoBack failed");
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void z(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (!b9.containsKey(optString2)) {
                c(obj, "instanceId not exist");
                return;
            }
            View view = b9.get(optString2);
            if (!(view instanceof AnythinkBTWebView)) {
                c(obj, "view not exist");
            } else if (((AnythinkBTWebView) view).webviewGoForward()) {
                a(obj, optString2);
            } else {
                c(obj, "webviewGoForward failed");
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    private c() {
    }

    public static d a(String str) {
        if (f20844e.containsKey(str)) {
            return f20844e.get(str);
        }
        return null;
    }

    public static String c(String str) {
        return f20846g.containsKey(str) ? f20846g.get(str) : "";
    }

    public final void d(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                int optInt = optJSONObject.optInt("mute");
                String str = "";
                d b9 = d.b(optJSONObject.optJSONObject("campaign"));
                if (b9 != null && !TextUtils.isEmpty(optString)) {
                    b9.l(optString);
                    str = b9.aa();
                }
                com.anythink.expressad.videocommon.e.d a9 = com.anythink.expressad.videocommon.e.d.a(optJSONObject.optJSONObject("unitSetting"));
                if (a9 != null) {
                    a9.a(optString);
                }
                String optString2 = optJSONObject.optString("userId");
                if (TextUtils.isEmpty(str) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                    str = windVaneWebView.getRid();
                }
                LinkedHashMap<String, View> b10 = b(optString, str);
                String b11 = b();
                f20843d.put(b11, str);
                ATTempContainer aTTempContainer = new ATTempContainer(t.b().g());
                aTTempContainer.setInstanceId(b11);
                aTTempContainer.setUnitId(optString);
                aTTempContainer.setCampaign(b9);
                aTTempContainer.setRewardUnitSetting(a9);
                aTTempContainer.setBigOffer(true);
                if (!TextUtils.isEmpty(optString2)) {
                    aTTempContainer.setUserId(optString2);
                }
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("reward");
                if (optJSONObject2 != null) {
                    String optString3 = optJSONObject2.optString("id");
                    com.anythink.expressad.videocommon.c.c cVar = new com.anythink.expressad.videocommon.c.c(optJSONObject2.optString("name"), optJSONObject2.optInt("amount"));
                    if (!TextUtils.isEmpty(optString3)) {
                        aTTempContainer.setRewardId(optString3);
                    }
                    if (!TextUtils.isEmpty(cVar.a())) {
                        aTTempContainer.setReward(cVar);
                    }
                }
                String optString4 = optJSONObject.optString("extra");
                if (!TextUtils.isEmpty(optString4)) {
                    aTTempContainer.setDeveloperExtraData(optString4);
                }
                aTTempContainer.setMute(optInt);
                b10.put(b11, aTTempContainer);
                f20846g.put(b11, optString);
                f20844e.put(b11, b9);
                f20845f.put(b11, a9);
                a(obj, b11);
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public static com.anythink.expressad.videocommon.e.d b(String str) {
        if (f20845f.containsKey(str)) {
            return f20845f.get(str);
        }
        return null;
    }

    public final void e(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") != null && !TextUtils.isEmpty(optString)) {
                String h9 = h(optString2);
                if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                    h9 = windVaneWebView.getRid();
                }
                LinkedHashMap<String, View> b9 = b(optString, h9);
                if (b9 != null && b9.containsKey(optString2)) {
                    View view = b9.get(optString2);
                    b9.remove(optString2);
                    if (view != null && view.getParent() != null) {
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(view);
                        }
                        if (view instanceof ViewGroup) {
                            ViewGroup viewGroup2 = (ViewGroup) view;
                            if (viewGroup2.getChildCount() > 0) {
                                int childCount = viewGroup2.getChildCount();
                                for (int i6 = 0; i6 < childCount; i6++) {
                                    View childAt = viewGroup2.getChildAt(i6);
                                    if (childAt instanceof AnythinkBTWebView) {
                                        b9.remove(((AnythinkBTWebView) childAt).getInstanceId());
                                        ((AnythinkBTWebView) childAt).onDestory();
                                    } else if (childAt instanceof AnythinkBTVideoView) {
                                        b9.remove(((AnythinkBTVideoView) childAt).getInstanceId());
                                        ((AnythinkBTVideoView) childAt).onDestory();
                                    } else if (childAt instanceof ATTempContainer) {
                                        b9.remove(((ATTempContainer) childAt).getInstanceId());
                                        ((ATTempContainer) childAt).onDestroy();
                                    }
                                }
                            }
                        }
                    }
                    if (view instanceof ATTempContainer) {
                        ((ATTempContainer) view).onDestroy();
                    }
                    if (view instanceof AnythinkBTWebView) {
                        ((AnythinkBTWebView) view).onDestory();
                    }
                    if (view instanceof AnythinkBTVideoView) {
                        ((AnythinkBTVideoView) view).onDestory();
                    }
                    a(obj, optString2);
                    a(obj, "onComponentDestroy", optString2);
                    return;
                }
                c(obj, "unitId or instanceId not exist");
                return;
            }
            c(obj, "unidId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    public final void g(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            if (optJSONObject2 == null) {
                c(obj, "rect not exist");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h9);
            Rect rect = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
            int optInt = optJSONObject2.optInt("width");
            int optInt2 = optJSONObject2.optInt("height");
            if (b9.containsKey(optString2)) {
                View view = b9.get(optString2);
                if (view != null) {
                    if (view.getParent() != null) {
                        view.setLayoutParams(a(view.getLayoutParams(), rect, optInt, optInt2));
                        view.requestLayout();
                    } else {
                        if (view instanceof AnythinkBTWebView) {
                            ((AnythinkBTWebView) view).setRect(rect);
                            ((AnythinkBTWebView) view).setLayout(optInt, optInt2);
                        }
                        if (view instanceof AnythinkBTVideoView) {
                            ((AnythinkBTVideoView) view).setRect(rect);
                            ((AnythinkBTVideoView) view).setLayout(optInt, optInt2);
                        }
                    }
                    a(obj, optString2);
                    a(obj, "onViewRectChanged", optString2);
                    return;
                }
                c(obj, "view is null");
                return;
            }
            c(obj, "instanceId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public final void i(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("id");
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (b9.containsKey(optString3) && b9.containsKey(optString2)) {
                ViewGroup viewGroup = (ViewGroup) b9.get(optString2);
                View view = b9.get(optString3);
                am.a(view);
                if (viewGroup != null && view != null) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                    if (view instanceof ATTempContainer) {
                        String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(f20852n), Integer.valueOf(f20853o), Integer.valueOf(f20854p), Integer.valueOf(f20855q), Integer.valueOf(f20856r));
                        ((ATTempContainer) view).setNotchPadding(f20852n, f20853o, f20854p, f20855q, f20856r);
                        Iterator<View> it = b9.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            View next = it.next();
                            if (next instanceof AnythinkBTContainer) {
                                am.a(view);
                                ((AnythinkBTContainer) next).appendSubView((AnythinkBTContainer) next, (ATTempContainer) view, optJSONObject2);
                                break;
                            }
                        }
                    } else {
                        if (optJSONObject2 == null) {
                            if (view instanceof BTBaseView) {
                                rect = ((BTBaseView) view).getRect();
                                optInt = ((BTBaseView) view).getViewWidth();
                                optInt2 = ((BTBaseView) view).getViewHeight();
                            } else {
                                optInt = 0;
                                rect = null;
                                optInt2 = 0;
                            }
                        } else {
                            Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                            optInt = optJSONObject2.optInt("width");
                            optInt2 = optJSONObject2.optInt("height");
                            rect = rect2;
                        }
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        if (viewGroup instanceof FrameLayout) {
                            layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof RelativeLayout) {
                            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof LinearLayout) {
                            layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        }
                        ViewGroup.LayoutParams a9 = a(layoutParams, rect, optInt, optInt2);
                        am.a(view);
                        viewGroup.addView(view, a9);
                    }
                    a(obj, optString2);
                    a(obj, "onAppendView", optString2);
                    return;
                }
                c(obj, "view is not exist");
                return;
            }
            c(obj, "instanceId is not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public static void a(String str, String str2) {
        f20843d.put(str, str2);
    }

    public final void h(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String h9 = h(optString2);
            if (TextUtils.isEmpty(h9) && (windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a) != null) {
                h9 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h9);
            if (b9.containsKey(optString2)) {
                View view = b9.get(optString2);
                if (view != null && view.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                        a(obj, optString2);
                        a(obj, "onRemoveFromView", optString2);
                        return;
                    }
                    c(obj, "parent is null");
                    return;
                }
                c(obj, "view is null");
                return;
            }
            c(obj, "params not enough");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public static void a(String str, Activity activity) {
        i.put(str, activity);
    }

    private static void c(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f20850l);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public final synchronized LinkedHashMap<String, View> b(String str, String str2) {
        if (f20842c.containsKey(str + "_" + str2)) {
            return f20842c.get(str + "_" + str2);
        }
        LinkedHashMap<String, View> linkedHashMap = new LinkedHashMap<>();
        f20842c.put(str + "_" + str2, linkedHashMap);
        return linkedHashMap;
    }

    public static void a(String str, int i6) {
        f20847h.put(str, Integer.valueOf(i6));
    }

    public static void a(WebView webView, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f20850l);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            h.a().a(webView, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public static void f(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            String optString = jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") == null) {
                c(obj, "data is empty");
            } else {
                a(obj, optString);
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    public final void b(Object obj, JSONObject jSONObject) {
        final Object obj2;
        Throwable th;
        final int i6;
        final int i9;
        try {
            final String optString = jSONObject.optString("unitId");
            try {
                if (TextUtils.isEmpty(optString)) {
                    c(obj, "unitId is empty");
                    return;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                int optInt = optJSONObject.optInt("delay", 0);
                final String optString2 = optJSONObject.optString("fileURL");
                final String optString3 = optJSONObject.optString("filePath");
                final String optString4 = optJSONObject.optString(com.onesignal.inAppMessages.internal.d.HTML);
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                Rect rect = new Rect(-999, -999, -999, -999);
                if (optJSONObject2 != null) {
                    rect = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                    int optInt2 = optJSONObject2.optInt("width");
                    i9 = optJSONObject2.optInt("height");
                    i6 = optInt2;
                } else {
                    i6 = 0;
                    i9 = 0;
                }
                final Rect rect2 = rect;
                obj2 = obj;
                try {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.anythink.expressad.video.bt.a.c.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str;
                            WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj2).f18062a;
                            if (windVaneWebView != null) {
                                str = windVaneWebView.getRid();
                            } else {
                                str = "";
                                windVaneWebView = null;
                            }
                            LinkedHashMap<String, View> b9 = c.this.b(optString, str);
                            String b10 = c.b();
                            c.f20843d.put(b10, str);
                            AnythinkBTWebView anythinkBTWebView = new AnythinkBTWebView(t.b().g());
                            b9.put(b10, anythinkBTWebView);
                            anythinkBTWebView.setInstanceId(b10);
                            anythinkBTWebView.setUnitId(optString);
                            anythinkBTWebView.setFileURL(optString2);
                            anythinkBTWebView.setFilePath(optString3);
                            anythinkBTWebView.setHtml(optString4);
                            anythinkBTWebView.setRect(rect2);
                            anythinkBTWebView.setWebViewRid(str);
                            anythinkBTWebView.setCreateWebView(windVaneWebView);
                            int i10 = i6;
                            if (i10 > 0 || i9 > 0) {
                                anythinkBTWebView.setLayout(i10, i9);
                            }
                            anythinkBTWebView.preload();
                            c.a(obj2, b10);
                        }
                    }, optInt);
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    c(obj2, th.getMessage());
                    th.getMessage();
                }
            } catch (Throwable th3) {
                th = th3;
                obj2 = obj;
                c(obj2, th.getMessage());
                th.getMessage();
            }
        } catch (Throwable th4) {
            th = th4;
            obj2 = obj;
        }
    }

    public final void c(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String str = "";
                d b9 = d.b(optJSONObject.optJSONObject("campaign"));
                if (b9 != null && !TextUtils.isEmpty(optString)) {
                    b9.l(optString);
                    str = b9.aa();
                }
                int optInt = optJSONObject.optInt("show_time", 0);
                int optInt2 = optJSONObject.optInt("show_mute", 0);
                int optInt3 = optJSONObject.optInt("show_close", 0);
                int optInt4 = optJSONObject.optInt("orientation", 1);
                int optInt5 = optJSONObject.optInt("show_pgb", 0);
                AnythinkBTVideoView anythinkBTVideoView = new AnythinkBTVideoView(t.b().g());
                anythinkBTVideoView.setCampaign(b9);
                anythinkBTVideoView.setUnitId(optString);
                anythinkBTVideoView.setShowMute(optInt2);
                anythinkBTVideoView.setShowTime(optInt);
                anythinkBTVideoView.setShowClose(optInt3);
                anythinkBTVideoView.setOrientation(optInt4);
                anythinkBTVideoView.setProgressBarState(optInt5);
                WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj).f18062a;
                if (windVaneWebView != null) {
                    str = windVaneWebView.getRid();
                    anythinkBTVideoView.setCreateWebView(windVaneWebView);
                }
                LinkedHashMap<String, View> b10 = b(optString, str);
                String b11 = b();
                f20843d.put(b11, str);
                anythinkBTVideoView.setInstanceId(b11);
                b10.put(b11, anythinkBTVideoView);
                anythinkBTVideoView.preLoadData();
                if (b9 == null) {
                    c(obj, "campaign is null");
                } else {
                    a(obj, b11);
                }
                com.anythink.expressad.video.bt.a.a unused = a.C0133a.f20834a;
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            th.getMessage();
        }
    }

    public static void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f20849k);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e9) {
            c(obj, e9.getMessage());
            e9.getMessage();
        }
    }

    private static void a(Object obj, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f20849k);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put("data", jSONObject2);
            h.a().a(obj, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e9) {
            c(obj, e9.getMessage());
            e9.getMessage();
        }
    }

    public static void b(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i6);
                int optInt = jSONObject.optInt("type");
                String optString = jSONObject.optString("url");
                int optInt2 = jSONObject.optInt("report");
                boolean z3 = true;
                if (optInt2 == 0) {
                    Context g4 = t.b().g();
                    if (optInt == 0) {
                        z3 = false;
                    }
                    com.anythink.expressad.b.a.a(g4, (d) null, "", optString, z3);
                } else {
                    com.anythink.expressad.b.a.a(t.b().g(), null, "", optString, false, optInt != 0, optInt2);
                }
            }
            a(obj, "");
        } catch (Throwable unused) {
        }
    }

    public static void a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f20849k);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put("data", jSONObject2);
            h.a();
            com.anythink.core.express.d.a.a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e9) {
            a(webView, e9.getMessage());
            e9.getMessage();
        }
    }

    public final void a(Object obj, JSONObject jSONObject) {
        final Object obj2;
        Throwable th;
        final int i6;
        final int i9;
        try {
            final String optString = jSONObject.optString("unitId");
            try {
                if (TextUtils.isEmpty(optString)) {
                    c(obj, "unitId is empty");
                    return;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                int optInt = optJSONObject.optInt("delay", 0);
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                Rect rect = new Rect(-999, -999, -999, -999);
                if (optJSONObject2 != null) {
                    rect = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt("bottom", -999));
                    int optInt2 = optJSONObject2.optInt("width");
                    i9 = optJSONObject2.optInt("height");
                    i6 = optInt2;
                } else {
                    i6 = 0;
                    i9 = 0;
                }
                final Rect rect2 = rect;
                obj2 = obj;
                try {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.anythink.expressad.video.bt.a.c.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str;
                            WindVaneWebView windVaneWebView = ((com.anythink.expressad.atsignalcommon.windvane.b) obj2).f18062a;
                            if (windVaneWebView != null) {
                                str = windVaneWebView.getRid();
                            } else {
                                str = "";
                                windVaneWebView = null;
                            }
                            LinkedHashMap<String, View> b9 = c.this.b(optString, str);
                            String b10 = c.b();
                            c.f20843d.put(b10, str);
                            AnythinkBTLayout anythinkBTLayout = new AnythinkBTLayout(t.b().g());
                            b9.put(b10, anythinkBTLayout);
                            anythinkBTLayout.setInstanceId(b10);
                            anythinkBTLayout.setUnitId(optString);
                            anythinkBTLayout.setWebView(windVaneWebView);
                            anythinkBTLayout.setRect(rect2);
                            int i10 = i6;
                            if (i10 > 0 || i9 > 0) {
                                anythinkBTLayout.setLayout(i10, i9);
                            }
                            c.a(obj2, b10);
                        }
                    }, optInt);
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    c(obj2, th.getMessage());
                    th.getMessage();
                }
            } catch (Throwable th3) {
                th = th3;
                obj2 = obj;
                c(obj2, th.getMessage());
                th.getMessage();
            }
        } catch (Throwable th4) {
            th = th4;
            obj2 = obj;
        }
    }

    public final void c(String str, String str2) {
        LinkedHashMap<String, View> b9 = b(str, str2);
        if (b9 != null && !b9.isEmpty()) {
            Iterator<Map.Entry<String, View>> it = b9.entrySet().iterator();
            while (it.hasNext()) {
                View value = it.next().getValue();
                if (value != null && value.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) value.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(value);
                    }
                    if (value instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) value;
                        if (viewGroup2.getChildCount() > 0) {
                            int childCount = viewGroup2.getChildCount();
                            for (int i6 = 0; i6 < childCount; i6++) {
                                View childAt = viewGroup2.getChildAt(i6);
                                if (childAt instanceof AnythinkBTWebView) {
                                    AnythinkBTWebView anythinkBTWebView = (AnythinkBTWebView) childAt;
                                    b9.remove(anythinkBTWebView.getInstanceId());
                                    anythinkBTWebView.onDestory();
                                } else if (childAt instanceof AnythinkBTVideoView) {
                                    AnythinkBTVideoView anythinkBTVideoView = (AnythinkBTVideoView) childAt;
                                    b9.remove(anythinkBTVideoView.getInstanceId());
                                    anythinkBTVideoView.onDestory();
                                } else if (childAt instanceof ATTempContainer) {
                                    ATTempContainer aTTempContainer = (ATTempContainer) childAt;
                                    b9.remove(aTTempContainer.getInstanceId());
                                    aTTempContainer.onDestroy();
                                }
                            }
                        }
                    }
                }
                if (value instanceof ATTempContainer) {
                    ((ATTempContainer) value).onDestroy();
                }
                if (value instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) value).onDestory();
                }
                if (value instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) value).onDestory();
                }
            }
        }
        if (b9 != null) {
            b9.clear();
        }
    }

    private void d(String str, String str2) {
        try {
            LinkedHashMap<String, View> b9 = b(str, str2);
            if (b9 != null && !b9.isEmpty()) {
                for (View view : b9.values()) {
                    if (view instanceof AnythinkBTContainer) {
                        ((AnythinkBTContainer) view).addNativeCloseButtonWhenWebViewCrash();
                    }
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.widget.LinearLayout$LayoutParams] */
    private static ViewGroup.LayoutParams a(ViewGroup.LayoutParams layoutParams, Rect rect, int i6, int i9) {
        if (rect == null) {
            rect = new Rect(-999, -999, -999, -999);
        }
        Context g4 = t.b().g();
        if (g4 != null) {
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                int i10 = rect.left;
                if (i10 != -999) {
                    layoutParams2.leftMargin = v.b(g4, i10);
                }
                int i11 = rect.top;
                if (i11 != -999) {
                    layoutParams2.topMargin = v.b(g4, i11);
                }
                int i12 = rect.right;
                if (i12 != -999) {
                    layoutParams2.rightMargin = v.b(g4, i12);
                }
                int i13 = rect.bottom;
                if (i13 != -999) {
                    layoutParams2.bottomMargin = v.b(g4, i13);
                }
                if (i6 > 0) {
                    layoutParams2.width = v.b(g4, i6);
                }
                if (i9 > 0) {
                    layoutParams2.height = v.b(g4, i9);
                }
                return layoutParams2;
            }
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                int i14 = rect.left;
                if (i14 != -999) {
                    layoutParams3.leftMargin = v.b(g4, i14);
                }
                int i15 = rect.top;
                if (i15 != -999) {
                    layoutParams3.topMargin = v.b(g4, i15);
                }
                int i16 = rect.right;
                if (i16 != -999) {
                    layoutParams3.rightMargin = v.b(g4, i16);
                }
                int i17 = rect.bottom;
                if (i17 != -999) {
                    layoutParams3.bottomMargin = v.b(g4, i17);
                }
                if (i6 > 0) {
                    layoutParams3.width = v.b(g4, i6);
                }
                if (i9 > 0) {
                    layoutParams3.height = v.b(g4, i9);
                }
                return layoutParams3;
            }
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                layoutParams = new LinearLayout.LayoutParams(-1, -1);
                int i18 = rect.left;
                if (i18 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).leftMargin = v.b(g4, i18);
                }
                int i19 = rect.top;
                if (i19 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).topMargin = v.b(g4, i19);
                }
                int i20 = rect.right;
                if (i20 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).rightMargin = v.b(g4, i20);
                }
                int i21 = rect.bottom;
                if (i21 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).bottomMargin = v.b(g4, i21);
                }
                if (i6 > 0) {
                    ((LinearLayout.LayoutParams) layoutParams).width = v.b(g4, i6);
                }
                if (i9 > 0) {
                    ((LinearLayout.LayoutParams) layoutParams).height = v.b(g4, i9);
                }
            }
        }
        return layoutParams;
    }

    public static void a(Object obj) {
        try {
            a(obj, "");
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    private static void a(String str, d dVar) {
        if (f.f19128k == null || TextUtils.isEmpty(dVar.bh())) {
            return;
        }
        f.a(str, dVar, "reward");
    }

    public static void a(int i6, int i9, int i10, int i11, int i12) {
        String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(i6), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        f20851m = com.anythink.expressad.foundation.h.i.a(i6, i9, i10, i11, i12);
        f20852n = i6;
        f20853o = i9;
        f20854p = i10;
        f20855q = i11;
        f20856r = i12;
    }

    private static void a(String str, String str2, String str3) {
        try {
            LinkedHashMap<String, View> b9 = a.f20871a.b(str, str2);
            if (b9 == null || b9.size() <= 0) {
                return;
            }
            for (View view : b9.values()) {
                if (!(view instanceof ATTempContainer) && !(view instanceof AnythinkBTWebView) && (view instanceof AnythinkBTLayout)) {
                    ((AnythinkBTLayout) view).notifyEvent(str3);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
