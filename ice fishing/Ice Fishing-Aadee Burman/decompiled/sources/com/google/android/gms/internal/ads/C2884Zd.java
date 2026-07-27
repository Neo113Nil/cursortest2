package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.Collections;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Zd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2884Zd extends S0.s {

    /* renamed from: A, reason: collision with root package name */
    public int f28894A;

    /* renamed from: B, reason: collision with root package name */
    public int f28895B;

    /* renamed from: C, reason: collision with root package name */
    public int f28896C;

    /* renamed from: D, reason: collision with root package name */
    public int f28897D;

    /* renamed from: E, reason: collision with root package name */
    public final Object f28898E;

    /* renamed from: F, reason: collision with root package name */
    public final C2555Fh f28899F;

    /* renamed from: G, reason: collision with root package name */
    public final Activity f28900G;

    /* renamed from: H, reason: collision with root package name */
    public X2.b f28901H;

    /* renamed from: I, reason: collision with root package name */
    public ImageView f28902I;
    public LinearLayout J;

    /* renamed from: K, reason: collision with root package name */
    public final Qx f28903K;

    /* renamed from: L, reason: collision with root package name */
    public PopupWindow f28904L;

    /* renamed from: M, reason: collision with root package name */
    public RelativeLayout f28905M;

    /* renamed from: N, reason: collision with root package name */
    public ViewGroup f28906N;

    /* renamed from: w, reason: collision with root package name */
    public String f28907w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f28908x;

    /* renamed from: y, reason: collision with root package name */
    public int f28909y;

    /* renamed from: z, reason: collision with root package name */
    public int f28910z;

    static {
        s.c cVar = new s.c(7);
        Collections.addAll(cVar, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        Collections.unmodifiableSet(cVar);
    }

    public C2884Zd(C2555Fh c2555Fh, Qx qx) {
        super(11, c2555Fh, com.onesignal.inAppMessages.internal.display.impl.m.EVENT_TYPE_RESIZE);
        this.f28907w = "top-right";
        this.f28908x = true;
        this.f28909y = 0;
        this.f28910z = 0;
        this.f28894A = -1;
        this.f28895B = 0;
        this.f28896C = 0;
        this.f28897D = -1;
        this.f28898E = new Object();
        this.f28899F = c2555Fh;
        this.f28900G = c2555Fh.j();
        this.f28903K = qx;
    }

    public final void C(boolean z3) {
        synchronized (this.f28898E) {
            try {
                if (this.f28904L != null) {
                    if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.jc)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        D(z3);
                    } else {
                        AbstractC3413jg.f31273f.a(new C2.C(2, this, z3));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void D(boolean z3) {
        C3301ha c3301ha = AbstractC3569ma.kc;
        q2.r rVar = q2.r.f40204e;
        boolean booleanValue = ((Boolean) rVar.f40207c.a(c3301ha)).booleanValue();
        C2555Fh c2555Fh = this.f28899F;
        if (booleanValue) {
            this.f28905M.removeView(c2555Fh);
            this.f28904L.dismiss();
        } else {
            this.f28904L.dismiss();
            this.f28905M.removeView(c2555Fh);
        }
        C3301ha c3301ha2 = AbstractC3569ma.lc;
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue()) {
            ViewParent parent = c2555Fh.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c2555Fh);
            }
        }
        ViewGroup viewGroup = this.f28906N;
        if (viewGroup != null) {
            viewGroup.removeView(this.f28902I);
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.mc)).booleanValue()) {
                try {
                    this.f28906N.addView(c2555Fh);
                    c2555Fh.o0(this.f28901H);
                } catch (IllegalStateException e9) {
                    int i = u2.z.f41319b;
                    v2.i.d("Unable to add webview back to view hierarchy.", e9);
                    C4835j.f39730C.f39740h.d("MraidCallResizeHandler.collapseInternal", e9);
                }
            } else {
                this.f28906N.addView(c2555Fh);
                c2555Fh.o0(this.f28901H);
            }
        }
        if (z3) {
            A(com.anythink.core.express.b.a.f17530f);
            Qx qx = this.f28903K;
            if (qx != null) {
                ((C2595Hn) qx.f27139u).f25358c.M1(C2935ak.f29091C);
            }
        }
        this.f28904L = null;
        this.f28905M = null;
        this.f28906N = null;
        this.J = null;
    }
}
