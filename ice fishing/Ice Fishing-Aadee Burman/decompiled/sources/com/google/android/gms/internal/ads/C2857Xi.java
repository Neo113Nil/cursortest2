package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;
import u2.C5070a;

/* renamed from: com.google.android.gms.internal.ads.Xi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2857Xi implements InterfaceC2982bd {

    /* renamed from: n, reason: collision with root package name */
    public final Context f28552n;

    /* renamed from: u, reason: collision with root package name */
    public final C3819r8 f28553u;

    /* renamed from: v, reason: collision with root package name */
    public final PowerManager f28554v;

    public C2857Xi(Context context, C3819r8 c3819r8) {
        this.f28552n = context;
        this.f28553u = c3819r8;
        this.f28554v = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982bd
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject n(C2889Zi c2889Zi) {
        boolean z3;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        C3873s8 c3873s8 = c2889Zi.f28940e;
        if (c3873s8 == null) {
            jSONObject = new JSONObject();
        } else {
            C3819r8 c3819r8 = this.f28553u;
            if (c3819r8.f33528b == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", c3819r8.f33530d).put("activeViewJSON", c3819r8.f33528b).put(com.anythink.expressad.foundation.d.d.f18596u, c2889Zi.f28938c).put("adFormat", c3819r8.f33527a).put("hashCode", c3819r8.f33529c).put("isMraid", false).put("isStopped", false).put("isPaused", c2889Zi.f28937b).put("isNative", c3819r8.f33531e).put("isScreenOn", this.f28554v.isInteractive());
            C5070a c5070a = C4835j.f39730C.i;
            synchronized (c5070a) {
                z3 = c5070a.f41249a;
            }
            JSONObject put2 = put.put("appMuted", z3).put("appVolume", r5.i.a());
            Context context = this.f28552n;
            put2.put("deviceVolume", C5070a.b(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject put3 = jSONObject3.put("windowVisibility", c3873s8.f33892b).put("isAttachedToWindow", c3873s8.f33891a);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = c3873s8.f33893c;
            JSONObject put4 = put3.put("viewBox", jSONObject4.put("top", rect.top).put("bottom", rect.bottom).put("left", rect.left).put("right", rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = c3873s8.f33894d;
            JSONObject put5 = put4.put("adBox", jSONObject5.put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = c3873s8.f33895e;
            JSONObject put6 = put5.put("globalVisibleBox", jSONObject6.put("top", rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put("right", rect3.right)).put("globalVisibleBoxVisible", c3873s8.f33896f);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = c3873s8.f33897g;
            JSONObject put7 = put6.put("localVisibleBox", jSONObject7.put("top", rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("localVisibleBoxVisible", c3873s8.f33898h);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = c3873s8.i;
            put7.put("hitBox", jSONObject8.put("top", rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put("isVisible", c2889Zi.f28936a);
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32169X1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = c3873s8.f33900k;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put("right", rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(c2889Zi.f28939d)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
