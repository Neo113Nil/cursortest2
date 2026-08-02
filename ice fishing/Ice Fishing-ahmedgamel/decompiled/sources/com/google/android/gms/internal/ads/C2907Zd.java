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
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Zd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2907Zd extends S0.s {

    /* renamed from: A, reason: collision with root package name */
    public int f29671A;

    /* renamed from: B, reason: collision with root package name */
    public int f29672B;

    /* renamed from: C, reason: collision with root package name */
    public int f29673C;

    /* renamed from: D, reason: collision with root package name */
    public int f29674D;

    /* renamed from: E, reason: collision with root package name */
    public final Object f29675E;

    /* renamed from: F, reason: collision with root package name */
    public final C2575Fh f29676F;

    /* renamed from: G, reason: collision with root package name */
    public final Activity f29677G;

    /* renamed from: H, reason: collision with root package name */
    public A3.r f29678H;

    /* renamed from: I, reason: collision with root package name */
    public ImageView f29679I;
    public LinearLayout J;

    /* renamed from: K, reason: collision with root package name */
    public final Qx f29680K;

    /* renamed from: L, reason: collision with root package name */
    public PopupWindow f29681L;

    /* renamed from: M, reason: collision with root package name */
    public RelativeLayout f29682M;

    /* renamed from: N, reason: collision with root package name */
    public ViewGroup f29683N;

    /* renamed from: w, reason: collision with root package name */
    public String f29684w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f29685x;

    /* renamed from: y, reason: collision with root package name */
    public int f29686y;

    /* renamed from: z, reason: collision with root package name */
    public int f29687z;

    static {
        s.c cVar = new s.c(7);
        Collections.addAll(cVar, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        Collections.unmodifiableSet(cVar);
    }

    public C2907Zd(C2575Fh c2575Fh, Qx qx) {
        super(13, c2575Fh, com.onesignal.inAppMessages.internal.display.impl.m.EVENT_TYPE_RESIZE);
        this.f29684w = "top-right";
        this.f29685x = true;
        this.f29686y = 0;
        this.f29687z = 0;
        this.f29671A = -1;
        this.f29672B = 0;
        this.f29673C = 0;
        this.f29674D = -1;
        this.f29675E = new Object();
        this.f29676F = c2575Fh;
        this.f29677G = c2575Fh.j();
        this.f29680K = qx;
    }

    public final void B(boolean z6) {
        synchronized (this.f29675E) {
            try {
                if (this.f29681L != null) {
                    if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.jc)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        C(z6);
                    } else {
                        AbstractC3436jg.f32060f.a(new E2.B(2, this, z6));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void C(boolean z6) {
        C3324ha c3324ha = AbstractC3592ma.kc;
        s2.r rVar = s2.r.f40506e;
        boolean booleanValue = ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue();
        C2575Fh c2575Fh = this.f29676F;
        if (booleanValue) {
            this.f29682M.removeView(c2575Fh);
            this.f29681L.dismiss();
        } else {
            this.f29681L.dismiss();
            this.f29682M.removeView(c2575Fh);
        }
        C3324ha c3324ha2 = AbstractC3592ma.lc;
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue()) {
            ViewParent parent = c2575Fh.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c2575Fh);
            }
        }
        ViewGroup viewGroup = this.f29683N;
        if (viewGroup != null) {
            viewGroup.removeView(this.f29679I);
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.mc)).booleanValue()) {
                try {
                    this.f29683N.addView(c2575Fh);
                    c2575Fh.f1(this.f29678H);
                } catch (IllegalStateException e9) {
                    int i = w2.z.f41712b;
                    x2.i.d("Unable to add webview back to view hierarchy.", e9);
                    C4906k.f40186C.f40196h.d("MraidCallResizeHandler.collapseInternal", e9);
                }
            } else {
                this.f29683N.addView(c2575Fh);
                c2575Fh.f1(this.f29678H);
            }
        }
        if (z6) {
            z(com.anythink.core.express.b.a.f18317f);
            Qx qx = this.f29680K;
            if (qx != null) {
                ((C2632In) qx.f27895u).f26322c.M1(C2958ak.f29866C);
            }
        }
        this.f29681L = null;
        this.f29682M = null;
        this.f29683N = null;
        this.J = null;
    }
}
