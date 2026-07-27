package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Am, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2474Am {

    /* renamed from: k, reason: collision with root package name */
    public static final ImageView.ScaleType f23888k = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: a, reason: collision with root package name */
    public final t2.E f23889a;

    /* renamed from: b, reason: collision with root package name */
    public final C3226fu f23890b;

    /* renamed from: c, reason: collision with root package name */
    public final C4025um f23891c;

    /* renamed from: d, reason: collision with root package name */
    public final C3917sm f23892d;

    /* renamed from: e, reason: collision with root package name */
    public final C2610Im f23893e;

    /* renamed from: f, reason: collision with root package name */
    public final C2661Lm f23894f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f23895g;

    /* renamed from: h, reason: collision with root package name */
    public final SD f23896h;
    public final C3261gb i;

    /* renamed from: j, reason: collision with root package name */
    public final C3756pm f23897j;

    public C2474Am(t2.E e6, C3226fu c3226fu, C4025um c4025um, C3917sm c3917sm, C2610Im c2610Im, C2661Lm c2661Lm, Executor executor, SD sd, C3756pm c3756pm) {
        this.f23889a = e6;
        this.f23890b = c3226fu;
        this.i = c3226fu.f30906j;
        this.f23891c = c4025um;
        this.f23892d = c3917sm;
        this.f23893e = c2610Im;
        this.f23894f = c2661Lm;
        this.f23895g = executor;
        this.f23896h = sd;
        this.f23897j = c3756pm;
    }

    public static void b(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public final void a(InterfaceViewOnClickListenerC2678Mm interfaceViewOnClickListenerC2678Mm) {
        if (interfaceViewOnClickListenerC2678Mm == null) {
            return;
        }
        Context context = interfaceViewOnClickListenerC2678Mm.A0().getContext();
        if (w8.a.t(context, this.f23891c.f34649a)) {
            if (!(context instanceof Activity)) {
                int i = t2.C.f40822b;
                u2.i.a("Activity context is needed for policy validator.");
                return;
            }
            C2661Lm c2661Lm = this.f23894f;
            if (c2661Lm == null || interfaceViewOnClickListenerC2678Mm.q3() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(c2661Lm.a(interfaceViewOnClickListenerC2678Mm.q3(), windowManager), w8.a.v());
            } catch (C4290zh e6) {
                t2.C.l("web view can not be obtained", e6);
            }
        }
    }

    public final boolean c(ViewGroup viewGroup, boolean z8) {
        View view;
        if (z8) {
            C3917sm c3917sm = this.f23892d;
            synchronized (c3917sm) {
                view = c3917sm.f34288o;
            }
        } else {
            C3917sm c3917sm2 = this.f23892d;
            synchronized (c3917sm2) {
                view = c3917sm2.f34289p;
            }
        }
        if (view == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        viewGroup.addView(view, ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31469J4)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}
