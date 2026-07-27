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

/* renamed from: com.google.android.gms.internal.ads.Wd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2839Wd extends C2881Yl {

    /* renamed from: A, reason: collision with root package name */
    public int f28400A;

    /* renamed from: B, reason: collision with root package name */
    public int f28401B;

    /* renamed from: C, reason: collision with root package name */
    public int f28402C;

    /* renamed from: D, reason: collision with root package name */
    public int f28403D;

    /* renamed from: E, reason: collision with root package name */
    public final Object f28404E;

    /* renamed from: F, reason: collision with root package name */
    public final C2486Bh f28405F;

    /* renamed from: G, reason: collision with root package name */
    public final Activity f28406G;

    /* renamed from: H, reason: collision with root package name */
    public W2.b f28407H;

    /* renamed from: I, reason: collision with root package name */
    public ImageView f28408I;
    public LinearLayout J;

    /* renamed from: K, reason: collision with root package name */
    public final Rx f28409K;

    /* renamed from: L, reason: collision with root package name */
    public PopupWindow f28410L;

    /* renamed from: M, reason: collision with root package name */
    public RelativeLayout f28411M;

    /* renamed from: N, reason: collision with root package name */
    public ViewGroup f28412N;

    /* renamed from: w, reason: collision with root package name */
    public String f28413w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f28414x;

    /* renamed from: y, reason: collision with root package name */
    public int f28415y;

    /* renamed from: z, reason: collision with root package name */
    public int f28416z;

    static {
        s.c cVar = new s.c(7);
        Collections.addAll(cVar, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        Collections.unmodifiableSet(cVar);
    }

    public C2839Wd(C2486Bh c2486Bh, Rx rx) {
        super(17, c2486Bh, com.onesignal.inAppMessages.internal.display.impl.m.EVENT_TYPE_RESIZE);
        this.f28413w = "top-right";
        this.f28414x = true;
        this.f28415y = 0;
        this.f28416z = 0;
        this.f28400A = -1;
        this.f28401B = 0;
        this.f28402C = 0;
        this.f28403D = -1;
        this.f28404E = new Object();
        this.f28405F = c2486Bh;
        this.f28406G = c2486Bh.h();
        this.f28409K = rx;
    }

    public final void x(boolean z8) {
        synchronized (this.f28404E) {
            try {
                if (this.f28410L != null) {
                    if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.jc)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        y(z8);
                    } else {
                        AbstractC3212fg.f30743f.a(new B2.D(2, this, z8));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(boolean z8) {
        C3151ea c3151ea = AbstractC3368ia.kc;
        q2.r rVar = q2.r.f40116e;
        boolean booleanValue = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue();
        C2486Bh c2486Bh = this.f28405F;
        if (booleanValue) {
            this.f28411M.removeView(c2486Bh);
            this.f28410L.dismiss();
        } else {
            this.f28410L.dismiss();
            this.f28411M.removeView(c2486Bh);
        }
        C3151ea c3151ea2 = AbstractC3368ia.lc;
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue()) {
            ViewParent parent = c2486Bh.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c2486Bh);
            }
        }
        ViewGroup viewGroup = this.f28412N;
        if (viewGroup != null) {
            viewGroup.removeView(this.f28408I);
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.mc)).booleanValue()) {
                try {
                    this.f28412N.addView(c2486Bh);
                    c2486Bh.J0(this.f28407H);
                } catch (IllegalStateException e6) {
                    int i = t2.C.f40822b;
                    u2.i.d("Unable to add webview back to view hierarchy.", e6);
                    p2.j.f39798C.f39808h.d("MraidCallResizeHandler.collapseInternal", e6);
                }
            } else {
                this.f28412N.addView(c2486Bh);
                c2486Bh.J0(this.f28407H);
            }
        }
        if (z8) {
            v(com.anythink.core.express.b.a.f17688f);
            Rx rx = this.f28409K;
            if (rx != null) {
                ((C2611In) rx.f27448u).f25594c.u1(C2943ak.f29273C);
            }
        }
        this.f28410L = null;
        this.f28411M = null;
        this.f28412N = null;
        this.J = null;
    }
}
