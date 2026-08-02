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

/* renamed from: com.google.android.gms.internal.ads.ow, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3722ow {

    /* renamed from: a, reason: collision with root package name */
    public final String f33765a;

    /* renamed from: c, reason: collision with root package name */
    public long f33767c = System.nanoTime();

    /* renamed from: d, reason: collision with root package name */
    public int f33768d = 1;

    /* renamed from: b, reason: collision with root package name */
    public Aw f33766b = new Aw(null);

    public AbstractC3722ow(String str) {
        this.f33765a = str;
    }

    public void a() {
    }

    public void b() {
        this.f33766b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView c() {
        return (WebView) this.f33766b.get();
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
        String str4 = uv.f28839g;
        JSONObject jSONObject2 = new JSONObject();
        AbstractC3937sw.b(jSONObject2, "environment", "app");
        AbstractC3937sw.b(jSONObject2, "adSessionType", (Tv) c32.f24789z);
        JSONObject jSONObject3 = new JSONObject();
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        char c9 = 2;
        AbstractC3937sw.b(jSONObject3, "deviceType", D.x.p(new StringBuilder(String.valueOf(str5).length() + 2 + String.valueOf(str6).length()), str5, "; ", str6));
        AbstractC3937sw.b(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        AbstractC3937sw.b(jSONObject3, "os", "Android");
        AbstractC3937sw.b(jSONObject2, "deviceInfo", jSONObject3);
        UiModeManager uiModeManager = AbstractC3066cl.f30356P;
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
            AbstractC3937sw.b(jSONObject2, "deviceCategory", str);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("clid");
            jSONArray.put("vlid");
            AbstractC3937sw.b(jSONObject2, "supports", jSONArray);
            JSONObject jSONObject4 = new JSONObject();
            C3754pa c3754pa = (C3754pa) c32.f24783n;
            AbstractC3937sw.b(jSONObject4, "partnerName", c3754pa.f33861a);
            AbstractC3937sw.b(jSONObject4, "partnerVersion", c3754pa.f33862b);
            AbstractC3937sw.b(jSONObject2, "omidNativeInfo", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            AbstractC3937sw.b(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
            AbstractC3937sw.b(jSONObject5, com.anythink.expressad.videocommon.e.b.f23194u, C3506kw.f32448b.f32449a.getApplicationContext().getPackageName());
            AbstractC3937sw.b(jSONObject2, "app", jSONObject5);
            str2 = (String) c32.f24788y;
            if (str2 != null) {
                AbstractC3937sw.b(jSONObject2, "contentUrl", str2);
            }
            str3 = (String) c32.f24787x;
            if (str3 != null) {
                AbstractC3937sw.b(jSONObject2, "customReferenceData", str3);
            }
            JSONObject jSONObject6 = new JSONObject();
            it = Collections.unmodifiableList((ArrayList) c32.f24785v).iterator();
            if (!it.hasNext()) {
                throw D.x.i(it);
            }
            V2.f28874z.z(c(), "startSession", str4, jSONObject2, jSONObject6, jSONObject);
            return;
        }
        c9 = 3;
        if (c9 != 1) {
        }
        AbstractC3937sw.b(jSONObject2, "deviceCategory", str);
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put("clid");
        jSONArray2.put("vlid");
        AbstractC3937sw.b(jSONObject2, "supports", jSONArray2);
        JSONObject jSONObject42 = new JSONObject();
        C3754pa c3754pa2 = (C3754pa) c32.f24783n;
        AbstractC3937sw.b(jSONObject42, "partnerName", c3754pa2.f33861a);
        AbstractC3937sw.b(jSONObject42, "partnerVersion", c3754pa2.f33862b);
        AbstractC3937sw.b(jSONObject2, "omidNativeInfo", jSONObject42);
        JSONObject jSONObject52 = new JSONObject();
        AbstractC3937sw.b(jSONObject52, "libraryVersion", "1.5.2-google_20241009");
        AbstractC3937sw.b(jSONObject52, com.anythink.expressad.videocommon.e.b.f23194u, C3506kw.f32448b.f32449a.getApplicationContext().getPackageName());
        AbstractC3937sw.b(jSONObject2, "app", jSONObject52);
        str2 = (String) c32.f24788y;
        if (str2 != null) {
        }
        str3 = (String) c32.f24787x;
        if (str3 != null) {
        }
        JSONObject jSONObject62 = new JSONObject();
        it = Collections.unmodifiableList((ArrayList) c32.f24785v).iterator();
        if (!it.hasNext()) {
        }
    }

    public final void f(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        AbstractC3937sw.b(jSONObject, com.anythink.expressad.foundation.d.d.f19383u, Long.valueOf(date.getTime()));
        V2.f28874z.z(c(), "setLastActivity", jSONObject);
    }
}
