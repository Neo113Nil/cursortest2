package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.os.Build;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.nw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3645nw {

    /* renamed from: a, reason: collision with root package name */
    public final String f32808a;

    /* renamed from: c, reason: collision with root package name */
    public long f32810c = System.nanoTime();

    /* renamed from: d, reason: collision with root package name */
    public int f32811d = 1;

    /* renamed from: b, reason: collision with root package name */
    public Aw f32809b = new Aw(null);

    public AbstractC3645nw(String str) {
        this.f32808a = str;
    }

    public void a() {
    }

    public void b() {
        this.f32809b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView c() {
        return (WebView) this.f32809b.get();
    }

    public void d(Uv uv, C3 c32) {
        e(uv, c32, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Uv uv, C3 c32, JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        Iterator it;
        String str4 = uv.f28042g;
        JSONObject jSONObject2 = new JSONObject();
        AbstractC3914sw.b(jSONObject2, "environment", "app");
        AbstractC3914sw.b(jSONObject2, "adSessionType", (Tv) c32.f24026z);
        JSONObject jSONObject3 = new JSONObject();
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        char c9 = 2;
        AbstractC3914sw.b(jSONObject3, "deviceType", D.y.s(new StringBuilder(String.valueOf(str5).length() + 2 + String.valueOf(str6).length()), str5, "; ", str6));
        AbstractC3914sw.b(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        AbstractC3914sw.b(jSONObject3, "os", "Android");
        AbstractC3914sw.b(jSONObject2, "deviceInfo", jSONObject3);
        UiModeManager uiModeManager = AbstractC3043cl.f29571P;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType != 1) {
                if (currentModeType == 4) {
                    c9 = 1;
                }
            }
            if (c9 != 1) {
                str = "ctv";
            } else if (c9 == 2) {
                str = "mobile";
            } else {
                if (c9 != 3) {
                    throw null;
                }
                str = "other";
            }
            AbstractC3914sw.b(jSONObject2, "deviceCategory", str);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("clid");
            jSONArray.put("vlid");
            AbstractC3914sw.b(jSONObject2, "supports", jSONArray);
            JSONObject jSONObject4 = new JSONObject();
            C3731pa c3731pa = (C3731pa) c32.f24020n;
            AbstractC3914sw.b(jSONObject4, "partnerName", c3731pa.f33071a);
            AbstractC3914sw.b(jSONObject4, "partnerVersion", c3731pa.f33072b);
            AbstractC3914sw.b(jSONObject2, "omidNativeInfo", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            AbstractC3914sw.b(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
            AbstractC3914sw.b(jSONObject5, com.anythink.expressad.videocommon.e.b.f22407u, C3429jw.f31350b.f31351a.getApplicationContext().getPackageName());
            AbstractC3914sw.b(jSONObject2, "app", jSONObject5);
            str2 = (String) c32.f24025y;
            if (str2 != null) {
                AbstractC3914sw.b(jSONObject2, "contentUrl", str2);
            }
            str3 = (String) c32.f24024x;
            if (str3 != null) {
                AbstractC3914sw.b(jSONObject2, "customReferenceData", str3);
            }
            JSONObject jSONObject6 = new JSONObject();
            it = Collections.unmodifiableList((ArrayList) c32.f24022v).iterator();
            if (!it.hasNext()) {
                throw D.y.j(it);
            }
            V2.f28077z.z(c(), "startSession", str4, jSONObject2, jSONObject6, jSONObject);
            return;
        }
        c9 = 3;
        if (c9 != 1) {
        }
        AbstractC3914sw.b(jSONObject2, "deviceCategory", str);
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put("clid");
        jSONArray2.put("vlid");
        AbstractC3914sw.b(jSONObject2, "supports", jSONArray2);
        JSONObject jSONObject42 = new JSONObject();
        C3731pa c3731pa2 = (C3731pa) c32.f24020n;
        AbstractC3914sw.b(jSONObject42, "partnerName", c3731pa2.f33071a);
        AbstractC3914sw.b(jSONObject42, "partnerVersion", c3731pa2.f33072b);
        AbstractC3914sw.b(jSONObject2, "omidNativeInfo", jSONObject42);
        JSONObject jSONObject52 = new JSONObject();
        AbstractC3914sw.b(jSONObject52, "libraryVersion", "1.5.2-google_20241009");
        AbstractC3914sw.b(jSONObject52, com.anythink.expressad.videocommon.e.b.f22407u, C3429jw.f31350b.f31351a.getApplicationContext().getPackageName());
        AbstractC3914sw.b(jSONObject2, "app", jSONObject52);
        str2 = (String) c32.f24025y;
        if (str2 != null) {
        }
        str3 = (String) c32.f24024x;
        if (str3 != null) {
        }
        JSONObject jSONObject62 = new JSONObject();
        it = Collections.unmodifiableList((ArrayList) c32.f24022v).iterator();
        if (!it.hasNext()) {
        }
    }

    public final void f(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        AbstractC3914sw.b(jSONObject, com.anythink.expressad.foundation.d.d.f18596u, Long.valueOf(date.getTime()));
        V2.f28077z.z(c(), "setLastActivity", jSONObject);
    }
}
