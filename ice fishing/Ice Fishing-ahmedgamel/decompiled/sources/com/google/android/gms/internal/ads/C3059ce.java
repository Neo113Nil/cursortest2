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
import r2.C4906k;
import s2.C4949p;

/* renamed from: com.google.android.gms.internal.ads.ce, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3059ce extends S0.s implements InterfaceC3272gc {

    /* renamed from: A, reason: collision with root package name */
    public DisplayMetrics f30289A;

    /* renamed from: B, reason: collision with root package name */
    public float f30290B;

    /* renamed from: C, reason: collision with root package name */
    public int f30291C;

    /* renamed from: D, reason: collision with root package name */
    public int f30292D;

    /* renamed from: E, reason: collision with root package name */
    public int f30293E;

    /* renamed from: F, reason: collision with root package name */
    public int f30294F;

    /* renamed from: G, reason: collision with root package name */
    public int f30295G;

    /* renamed from: H, reason: collision with root package name */
    public int f30296H;

    /* renamed from: I, reason: collision with root package name */
    public int f30297I;

    /* renamed from: w, reason: collision with root package name */
    public final C2575Fh f30298w;

    /* renamed from: x, reason: collision with root package name */
    public final Context f30299x;

    /* renamed from: y, reason: collision with root package name */
    public final WindowManager f30300y;

    /* renamed from: z, reason: collision with root package name */
    public final C3216fa f30301z;

    public C3059ce(C2575Fh c2575Fh, Context context, C3216fa c3216fa) {
        super(13, c2575Fh, "");
        this.f30291C = -1;
        this.f30292D = -1;
        this.f30294F = -1;
        this.f30295G = -1;
        this.f30296H = -1;
        this.f30297I = -1;
        this.f30298w = c2575Fh;
        this.f30299x = context;
        this.f30301z = c3216fa;
        this.f30300y = (WindowManager) context.getSystemService("window");
    }

    public final void B(int i, int i4) {
        int i6;
        Context context = this.f30299x;
        int i9 = 0;
        if (context instanceof Activity) {
            w2.D d9 = C4906k.f40186C.f40191c;
            i6 = w2.D.q((Activity) context)[0];
        } else {
            i6 = 0;
        }
        C2575Fh c2575Fh = this.f30298w;
        ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh = c2575Fh.f25606n;
        if (viewTreeObserverOnGlobalLayoutListenerC2592Gh.j0() == null || !viewTreeObserverOnGlobalLayoutListenerC2592Gh.j0().b()) {
            int width = c2575Fh.getWidth();
            int height = c2575Fh.getHeight();
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32750A0)).booleanValue()) {
                if (width == 0) {
                    width = viewTreeObserverOnGlobalLayoutListenerC2592Gh.j0() != null ? viewTreeObserverOnGlobalLayoutListenerC2592Gh.j0().f186c : 0;
                }
                if (height == 0) {
                    if (viewTreeObserverOnGlobalLayoutListenerC2592Gh.j0() != null) {
                        i9 = viewTreeObserverOnGlobalLayoutListenerC2592Gh.j0().f185b;
                    }
                    C4949p c4949p = C4949p.f40498g;
                    this.f30296H = c4949p.f40499a.h(context, width);
                    this.f30297I = c4949p.f40499a.h(context, i9);
                }
            }
            i9 = height;
            C4949p c4949p2 = C4949p.f40498g;
            this.f30296H = c4949p2.f40499a.h(context, width);
            this.f30297I = c4949p2.f40499a.h(context, i9);
        }
        try {
            ((InterfaceC4084vh) this.f2969u).e("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i4 - i6).put("width", this.f30296H).put("height", this.f30297I));
        } catch (JSONException e9) {
            int i10 = w2.z.f41712b;
            x2.i.d("Error occurred while dispatching default position.", e9);
        }
        C2907Zd c2907Zd = viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25846G.f26940Q;
        if (c2907Zd != null) {
            c2907Zd.f29686y = i;
            c2907Zd.f29687z = i4;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
    public final void e(Object obj, Map map) {
        JSONObject jSONObject;
        this.f30289A = new DisplayMetrics();
        Display defaultDisplay = this.f30300y.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f30289A);
        this.f30290B = this.f30289A.density;
        this.f30293E = defaultDisplay.getRotation();
        x2.d dVar = C4949p.f40498g.f40499a;
        this.f30291C = Math.round(r11.widthPixels / this.f30289A.density);
        this.f30292D = Math.round(r11.heightPixels / this.f30289A.density);
        C2575Fh c2575Fh = this.f30298w;
        Activity j6 = c2575Fh.j();
        if (j6 == null || j6.getWindow() == null) {
            this.f30294F = this.f30291C;
            this.f30295G = this.f30292D;
        } else {
            w2.D d9 = C4906k.f40186C.f40191c;
            int[] p9 = w2.D.p(j6);
            this.f30294F = Math.round(p9[0] / this.f30289A.density);
            this.f30295G = Math.round(p9[1] / this.f30289A.density);
        }
        ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh = c2575Fh.f25606n;
        if (viewTreeObserverOnGlobalLayoutListenerC2592Gh.j0().b()) {
            this.f30296H = this.f30291C;
            this.f30297I = this.f30292D;
        } else {
            c2575Fh.measure(0, 0);
        }
        A(this.f30291C, this.f30292D, this.f30294F, this.f30295G, this.f30290B, this.f30293E);
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        C3216fa c3216fa = this.f30301z;
        boolean d10 = c3216fa.d(intent);
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        boolean d11 = c3216fa.d(intent2);
        boolean d12 = c3216fa.d(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
        CallableC3162ea callableC3162ea = CallableC3162ea.f30725b;
        Context context = c3216fa.f31039n;
        try {
            jSONObject = new JSONObject().put("sms", d11).put("tel", d10).put("calendar", d12).put("storePicture", ((Boolean) A8.b.y(context, callableC3162ea)).booleanValue() && X2.b.a(context).f60u.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0).put("inlineVideo", true);
        } catch (JSONException e9) {
            int i = w2.z.f41712b;
            x2.i.d("Error occurred while obtaining the MRAID capabilities.", e9);
            jSONObject = null;
        }
        c2575Fh.e("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        c2575Fh.getLocationOnScreen(iArr);
        C4949p c4949p = C4949p.f40498g;
        x2.d dVar2 = c4949p.f40499a;
        int i4 = iArr[0];
        Context context2 = this.f30299x;
        B(dVar2.h(context2, i4), c4949p.f40499a.h(context2, iArr[1]));
        if (x2.i.j(2)) {
            x2.i.e("Dispatching Ready Event.");
        }
        try {
            ((InterfaceC4084vh) this.f2969u).e("onReadyEventReceived", new JSONObject().put("js", viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25880x.f41845n));
        } catch (JSONException e10) {
            int i6 = w2.z.f41712b;
            x2.i.d("Error occurred while dispatching ready Event.", e10);
        }
    }
}
