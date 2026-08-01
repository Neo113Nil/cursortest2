package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;
import q2.C4900p;

/* renamed from: com.google.android.gms.internal.ads.ce, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3036ce extends S0.s implements InterfaceC3249gc {

    /* renamed from: A, reason: collision with root package name */
    public DisplayMetrics f29504A;

    /* renamed from: B, reason: collision with root package name */
    public float f29505B;

    /* renamed from: C, reason: collision with root package name */
    public int f29506C;

    /* renamed from: D, reason: collision with root package name */
    public int f29507D;

    /* renamed from: E, reason: collision with root package name */
    public int f29508E;

    /* renamed from: F, reason: collision with root package name */
    public int f29509F;

    /* renamed from: G, reason: collision with root package name */
    public int f29510G;

    /* renamed from: H, reason: collision with root package name */
    public int f29511H;

    /* renamed from: I, reason: collision with root package name */
    public int f29512I;

    /* renamed from: w, reason: collision with root package name */
    public final C2555Fh f29513w;

    /* renamed from: x, reason: collision with root package name */
    public final Context f29514x;

    /* renamed from: y, reason: collision with root package name */
    public final WindowManager f29515y;

    /* renamed from: z, reason: collision with root package name */
    public final C3193fa f29516z;

    public C3036ce(C2555Fh c2555Fh, Context context, C3193fa c3193fa) {
        super(11, c2555Fh, "");
        this.f29506C = -1;
        this.f29507D = -1;
        this.f29509F = -1;
        this.f29510G = -1;
        this.f29511H = -1;
        this.f29512I = -1;
        this.f29513w = c2555Fh;
        this.f29514x = context;
        this.f29516z = c3193fa;
        this.f29515y = (WindowManager) context.getSystemService("window");
    }

    public final void C(int i, int i6) {
        int i9;
        Context context = this.f29514x;
        int i10 = 0;
        if (context instanceof Activity) {
            u2.D d2 = C4835j.f39733C.f39738c;
            i9 = u2.D.q((Activity) context)[0];
        } else {
            i9 = 0;
        }
        C2555Fh c2555Fh = this.f29513w;
        ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh = c2555Fh.f24817n;
        if (viewTreeObserverOnGlobalLayoutListenerC2572Gh.i0() == null || !viewTreeObserverOnGlobalLayoutListenerC2572Gh.i0().b()) {
            int width = c2555Fh.getWidth();
            int height = c2555Fh.getHeight();
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f31969A0)).booleanValue()) {
                if (width == 0) {
                    width = viewTreeObserverOnGlobalLayoutListenerC2572Gh.i0() != null ? viewTreeObserverOnGlobalLayoutListenerC2572Gh.i0().f3773c : 0;
                }
                if (height == 0) {
                    if (viewTreeObserverOnGlobalLayoutListenerC2572Gh.i0() != null) {
                        i10 = viewTreeObserverOnGlobalLayoutListenerC2572Gh.i0().f3772b;
                    }
                    C4900p c4900p = C4900p.f40199g;
                    this.f29511H = c4900p.f40200a.h(context, width);
                    this.f29512I = c4900p.f40200a.h(context, i10);
                }
            }
            i10 = height;
            C4900p c4900p2 = C4900p.f40199g;
            this.f29511H = c4900p2.f40200a.h(context, width);
            this.f29512I = c4900p2.f40200a.h(context, i10);
        }
        try {
            ((InterfaceC4061vh) this.f2840u).e("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i6 - i9).put("width", this.f29511H).put("height", this.f29512I));
        } catch (JSONException e9) {
            int i11 = u2.z.f41322b;
            v2.i.d("Error occurred while dispatching default position.", e9);
        }
        C2884Zd c2884Zd = viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25061G.f26143Q;
        if (c2884Zd != null) {
            c2884Zd.f28909y = i;
            c2884Zd.f28910z = i6;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
    public final void e(Object obj, Map map) {
        JSONObject jSONObject;
        this.f29504A = new DisplayMetrics();
        Display defaultDisplay = this.f29515y.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f29504A);
        this.f29505B = this.f29504A.density;
        this.f29508E = defaultDisplay.getRotation();
        v2.d dVar = C4900p.f40199g.f40200a;
        this.f29506C = Math.round(r11.widthPixels / this.f29504A.density);
        this.f29507D = Math.round(r11.heightPixels / this.f29504A.density);
        C2555Fh c2555Fh = this.f29513w;
        Activity j6 = c2555Fh.j();
        if (j6 == null || j6.getWindow() == null) {
            this.f29509F = this.f29506C;
            this.f29510G = this.f29507D;
        } else {
            u2.D d2 = C4835j.f39733C.f39738c;
            int[] p9 = u2.D.p(j6);
            this.f29509F = Math.round(p9[0] / this.f29504A.density);
            this.f29510G = Math.round(p9[1] / this.f29504A.density);
        }
        ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh = c2555Fh.f24817n;
        if (viewTreeObserverOnGlobalLayoutListenerC2572Gh.i0().b()) {
            this.f29511H = this.f29506C;
            this.f29512I = this.f29507D;
        } else {
            c2555Fh.measure(0, 0);
        }
        B(this.f29506C, this.f29507D, this.f29509F, this.f29510G, this.f29505B, this.f29508E);
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        C3193fa c3193fa = this.f29516z;
        boolean d9 = c3193fa.d(intent);
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        boolean d10 = c3193fa.d(intent2);
        boolean d11 = c3193fa.d(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
        CallableC3139ea callableC3139ea = CallableC3139ea.f29934b;
        Context context = c3193fa.f30251n;
        try {
            jSONObject = new JSONObject().put("sms", d10).put("tel", d9).put("calendar", d11).put("storePicture", ((Boolean) O3.b.G(context, callableC3139ea)).booleanValue() && V2.c.a(context).f3273u.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0).put("inlineVideo", true);
        } catch (JSONException e9) {
            int i = u2.z.f41322b;
            v2.i.d("Error occurred while obtaining the MRAID capabilities.", e9);
            jSONObject = null;
        }
        c2555Fh.e("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        c2555Fh.getLocationOnScreen(iArr);
        C4900p c4900p = C4900p.f40199g;
        v2.d dVar2 = c4900p.f40200a;
        int i6 = iArr[0];
        Context context2 = this.f29514x;
        C(dVar2.h(context2, i6), c4900p.f40200a.h(context2, iArr[1]));
        if (v2.i.j(2)) {
            v2.i.e("Dispatching Ready Event.");
        }
        try {
            ((InterfaceC4061vh) this.f2840u).e("onReadyEventReceived", new JSONObject().put("js", viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25093x.f41391n));
        } catch (JSONException e10) {
            int i9 = u2.z.f41322b;
            v2.i.d("Error occurred while dispatching ready Event.", e10);
        }
    }
}
