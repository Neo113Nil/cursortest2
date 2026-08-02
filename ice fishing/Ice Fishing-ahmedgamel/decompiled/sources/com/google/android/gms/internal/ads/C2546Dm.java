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
import w2.C5140B;

/* renamed from: com.google.android.gms.internal.ads.Dm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2546Dm {

    /* renamed from: k, reason: collision with root package name */
    public static final ImageView.ScaleType f25202k = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: a, reason: collision with root package name */
    public final C5140B f25203a;

    /* renamed from: b, reason: collision with root package name */
    public final C3075cu f25204b;

    /* renamed from: c, reason: collision with root package name */
    public final C4197xm f25205c;

    /* renamed from: d, reason: collision with root package name */
    public final C4089vm f25206d;

    /* renamed from: e, reason: collision with root package name */
    public final C2682Lm f25207e;

    /* renamed from: f, reason: collision with root package name */
    public final C2733Om f25208f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f25209g;

    /* renamed from: h, reason: collision with root package name */
    public final RD f25210h;
    public final C3485kb i;

    /* renamed from: j, reason: collision with root package name */
    public final C3981tm f25211j;

    public C2546Dm(C5140B c5140b, C3075cu c3075cu, C4197xm c4197xm, C4089vm c4089vm, C2682Lm c2682Lm, C2733Om c2733Om, Executor executor, RD rd, C3981tm c3981tm) {
        this.f25203a = c5140b;
        this.f25204b = c3075cu;
        this.i = c3075cu.f30398j;
        this.f25205c = c4197xm;
        this.f25206d = c4089vm;
        this.f25207e = c2682Lm;
        this.f25208f = c2733Om;
        this.f25209g = executor;
        this.f25210h = rd;
        this.f25211j = c3981tm;
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

    public final void a(InterfaceViewOnClickListenerC2750Pm interfaceViewOnClickListenerC2750Pm) {
        if (interfaceViewOnClickListenerC2750Pm == null) {
            return;
        }
        Context context = interfaceViewOnClickListenerC2750Pm.F0().getContext();
        if (t8.g.C(context, this.f25205c.f35829a)) {
            if (!(context instanceof Activity)) {
                int i = w2.z.f41712b;
                x2.i.a("Activity context is needed for policy validator.");
                return;
            }
            C2733Om c2733Om = this.f25208f;
            if (c2733Om == null || interfaceViewOnClickListenerC2750Pm.z3() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(c2733Om.a(interfaceViewOnClickListenerC2750Pm.z3(), windowManager), t8.g.E());
            } catch (C2541Dh e9) {
                w2.z.l("web view can not be obtained", e9);
            }
        }
    }

    public final boolean c(ViewGroup viewGroup, boolean z6) {
        View view;
        if (z6) {
            C4089vm c4089vm = this.f25206d;
            synchronized (c4089vm) {
                view = c4089vm.f35498o;
            }
        } else {
            C4089vm c4089vm2 = this.f25206d;
            synchronized (c4089vm2) {
                view = c4089vm2.f35499p;
            }
        }
        if (view == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        viewGroup.addView(view, ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32830J4)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}
