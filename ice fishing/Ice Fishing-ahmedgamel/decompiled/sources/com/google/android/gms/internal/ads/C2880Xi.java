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
import r2.C4906k;
import w2.C5141a;

/* renamed from: com.google.android.gms.internal.ads.Xi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2880Xi implements InterfaceC3005bd {

    /* renamed from: n, reason: collision with root package name */
    public final Context f29324n;

    /* renamed from: u, reason: collision with root package name */
    public final C3842r8 f29325u;

    /* renamed from: v, reason: collision with root package name */
    public final PowerManager f29326v;

    public C2880Xi(Context context, C3842r8 c3842r8) {
        this.f29324n = context;
        this.f29325u = c3842r8;
        this.f29326v = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3005bd
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject n(C2912Zi c2912Zi) {
        boolean z6;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        C3896s8 c3896s8 = c2912Zi.f29717e;
        if (c3896s8 == null) {
            jSONObject = new JSONObject();
        } else {
            C3842r8 c3842r8 = this.f29325u;
            if (c3842r8.f34296b == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", c3842r8.f34298d).put("activeViewJSON", c3842r8.f34296b).put(com.anythink.expressad.foundation.d.d.f19383u, c2912Zi.f29715c).put("adFormat", c3842r8.f34295a).put("hashCode", c3842r8.f34297c).put("isMraid", false).put("isStopped", false).put("isPaused", c2912Zi.f29714b).put("isNative", c3842r8.f34299e).put("isScreenOn", this.f29326v.isInteractive());
            C5141a c5141a = C4906k.f40186C.i;
            synchronized (c5141a) {
                z6 = c5141a.f41642a;
            }
            JSONObject put2 = put.put("appMuted", z6).put("appVolume", r5.i.a());
            Context context = this.f29324n;
            put2.put("deviceVolume", C5141a.b(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject put3 = jSONObject3.put("windowVisibility", c3896s8.f34660b).put("isAttachedToWindow", c3896s8.f34659a);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = c3896s8.f34661c;
            JSONObject put4 = put3.put("viewBox", jSONObject4.put("top", rect.top).put("bottom", rect.bottom).put("left", rect.left).put("right", rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = c3896s8.f34662d;
            JSONObject put5 = put4.put("adBox", jSONObject5.put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = c3896s8.f34663e;
            JSONObject put6 = put5.put("globalVisibleBox", jSONObject6.put("top", rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put("right", rect3.right)).put("globalVisibleBoxVisible", c3896s8.f34664f);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = c3896s8.f34665g;
            JSONObject put7 = put6.put("localVisibleBox", jSONObject7.put("top", rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("localVisibleBoxVisible", c3896s8.f34666h);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = c3896s8.i;
            put7.put("hitBox", jSONObject8.put("top", rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put("isVisible", c2912Zi.f29713a);
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32948X1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = c3896s8.f34668k;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put("right", rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(c2912Zi.f29716d)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
