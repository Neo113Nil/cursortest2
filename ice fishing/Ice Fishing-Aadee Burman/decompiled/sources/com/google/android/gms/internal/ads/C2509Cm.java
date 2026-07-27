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
import u2.C5069B;

/* renamed from: com.google.android.gms.internal.ads.Cm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2509Cm {

    /* renamed from: k, reason: collision with root package name */
    public static final ImageView.ScaleType f24216k = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: a, reason: collision with root package name */
    public final C5069B f24217a;

    /* renamed from: b, reason: collision with root package name */
    public final C3052cu f24218b;

    /* renamed from: c, reason: collision with root package name */
    public final C4120wm f24219c;

    /* renamed from: d, reason: collision with root package name */
    public final C4012um f24220d;

    /* renamed from: e, reason: collision with root package name */
    public final C2645Km f24221e;

    /* renamed from: f, reason: collision with root package name */
    public final C2696Nm f24222f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f24223g;

    /* renamed from: h, reason: collision with root package name */
    public final RD f24224h;
    public final C3462kb i;

    /* renamed from: j, reason: collision with root package name */
    public final C3904sm f24225j;

    public C2509Cm(C5069B c5069b, C3052cu c3052cu, C4120wm c4120wm, C4012um c4012um, C2645Km c2645Km, C2696Nm c2696Nm, Executor executor, RD rd, C3904sm c3904sm) {
        this.f24217a = c5069b;
        this.f24218b = c3052cu;
        this.i = c3052cu.f29628j;
        this.f24219c = c4120wm;
        this.f24220d = c4012um;
        this.f24221e = c2645Km;
        this.f24222f = c2696Nm;
        this.f24223g = executor;
        this.f24224h = rd;
        this.f24225j = c3904sm;
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

    public final void a(InterfaceViewOnClickListenerC2713Om interfaceViewOnClickListenerC2713Om) {
        if (interfaceViewOnClickListenerC2713Om == null) {
            return;
        }
        Context context = interfaceViewOnClickListenerC2713Om.H0().getContext();
        if (L3.F.A(context, this.f24219c.f34870a)) {
            if (!(context instanceof Activity)) {
                int i = u2.z.f41319b;
                v2.i.a("Activity context is needed for policy validator.");
                return;
            }
            C2696Nm c2696Nm = this.f24222f;
            if (c2696Nm == null || interfaceViewOnClickListenerC2713Om.D3() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(c2696Nm.a(interfaceViewOnClickListenerC2713Om.D3(), windowManager), L3.F.C());
            } catch (C2521Dh e9) {
                u2.z.l("web view can not be obtained", e9);
            }
        }
    }

    public final boolean c(ViewGroup viewGroup, boolean z3) {
        View view;
        if (z3) {
            C4012um c4012um = this.f24220d;
            synchronized (c4012um) {
                view = c4012um.f34577o;
            }
        } else {
            C4012um c4012um2 = this.f24220d;
            synchronized (c4012um2) {
                view = c4012um2.f34578p;
            }
        }
        if (view == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        viewGroup.addView(view, ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32050J4)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}
