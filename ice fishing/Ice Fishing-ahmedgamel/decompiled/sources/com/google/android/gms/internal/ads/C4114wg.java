package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.icefishinggame.icefishinggamemultigames.C5275R;
import java.util.HashMap;
import p2.C4835j;
import u2.HandlerC5068A;

/* renamed from: com.google.android.gms.internal.ads.wg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4114wg extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public boolean f34847A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f34848B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f34849C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f34850D;

    /* renamed from: E, reason: collision with root package name */
    public long f34851E;

    /* renamed from: F, reason: collision with root package name */
    public long f34852F;

    /* renamed from: G, reason: collision with root package name */
    public String f34853G;

    /* renamed from: H, reason: collision with root package name */
    public String[] f34854H;

    /* renamed from: I, reason: collision with root package name */
    public Bitmap f34855I;
    public final ImageView J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f34856K;

    /* renamed from: n, reason: collision with root package name */
    public final C2555Fh f34857n;

    /* renamed from: u, reason: collision with root package name */
    public final FrameLayout f34858u;

    /* renamed from: v, reason: collision with root package name */
    public final View f34859v;

    /* renamed from: w, reason: collision with root package name */
    public final C3785qa f34860w;

    /* renamed from: x, reason: collision with root package name */
    public final RunnableC4060vg f34861x;

    /* renamed from: y, reason: collision with root package name */
    public final long f34862y;

    /* renamed from: z, reason: collision with root package name */
    public final AbstractC3952tg f34863z;

    public C4114wg(Context context, C2555Fh c2555Fh, int i, boolean z3, C3785qa c3785qa, C2486Bg c2486Bg, C3153eo c3153eo) {
        super(context);
        C3785qa c3785qa2;
        AbstractC3952tg textureViewSurfaceTextureListenerC3898sg;
        AbstractC3952tg abstractC3952tg;
        this.f34857n = c2555Fh;
        this.f34860w = c3785qa;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34858u = frameLayout;
        C3301ha c3301ha = AbstractC3569ma.f32370t;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
            frameLayout.setBackgroundColor(-16777216);
        }
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        P2.w.h(c2555Fh.f24817n.f25097z);
        ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh = c2555Fh.f24817n;
        Object obj = viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25097z.f38706n;
        C2503Cg c2503Cg = new C2503Cg(context, viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25093x, viewTreeObserverOnGlobalLayoutListenerC2572Gh.H(), c3785qa, viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25085s0);
        if (i == 3) {
            abstractC3952tg = new C3684oh(context, c2503Cg);
            c3785qa2 = c3785qa;
        } else {
            if (i == 2) {
                viewTreeObserverOnGlobalLayoutListenerC2572Gh.i0().getClass();
                textureViewSurfaceTextureListenerC3898sg = new TextureViewSurfaceTextureListenerC2605Ig(context, c2503Cg, c2555Fh, z3, c2486Bg, c3153eo);
                c3785qa2 = c3785qa;
            } else {
                c3785qa2 = c3785qa;
                textureViewSurfaceTextureListenerC3898sg = new TextureViewSurfaceTextureListenerC3898sg(context, c2555Fh, z3, viewTreeObserverOnGlobalLayoutListenerC2572Gh.i0().b(), new C2503Cg(context, viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25093x, viewTreeObserverOnGlobalLayoutListenerC2572Gh.H(), c3785qa, viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25085s0), c3153eo);
            }
            abstractC3952tg = textureViewSurfaceTextureListenerC3898sg;
        }
        this.f34863z = abstractC3952tg;
        View view = new View(context);
        this.f34859v = view;
        view.setBackgroundColor(0);
        frameLayout.addView(abstractC3952tg, new FrameLayout.LayoutParams(-1, -1, 17));
        C3301ha c3301ha2 = AbstractC3569ma.f32333p0;
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.m0)).booleanValue()) {
            a();
        }
        this.J = new ImageView(context);
        this.f34862y = ((Long) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32351r0)).longValue();
        boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32324o0)).booleanValue();
        this.f34850D = booleanValue;
        c3785qa2.c("spinner_used", true != booleanValue ? "0" : "1");
        this.f34861x = new RunnableC4060vg(this);
        abstractC3952tg.e(this);
    }

    public final void a() {
        AbstractC3952tg abstractC3952tg = this.f34863z;
        if (abstractC3952tg == null) {
            return;
        }
        TextView textView = new TextView(abstractC3952tg.getContext());
        Resources c9 = C4835j.f39733C.f39743h.c();
        textView.setText(String.valueOf(c9 == null ? "AdMob - " : c9.getString(C5275R.string.watermark_label_prefix)).concat(abstractC3952tg.d()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        FrameLayout frameLayout = this.f34858u;
        frameLayout.addView(textView, layoutParams);
        frameLayout.bringChildToFront(textView);
    }

    public final void b() {
        AbstractC3952tg abstractC3952tg = this.f34863z;
        if (abstractC3952tg == null) {
            return;
        }
        long k9 = abstractC3952tg.k();
        if (this.f34851E == k9 || k9 <= 0) {
            return;
        }
        float f3 = k9 / 1000.0f;
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32409x2)).booleanValue()) {
            String valueOf = String.valueOf(f3);
            String valueOf2 = String.valueOf(abstractC3952tg.x());
            String valueOf3 = String.valueOf(abstractC3952tg.w());
            String valueOf4 = String.valueOf(abstractC3952tg.v());
            String valueOf5 = String.valueOf(abstractC3952tg.y());
            C4835j.f39733C.f39745k.getClass();
            c("timeupdate", "time", valueOf, "totalBytes", valueOf2, "qoeCachedBytes", valueOf3, "qoeLoadedBytes", valueOf4, "droppedFrames", valueOf5, "reportTime", String.valueOf(System.currentTimeMillis()));
        } else {
            c("timeupdate", "time", String.valueOf(f3));
        }
        this.f34851E = k9;
    }

    public final void c(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        AbstractC3952tg abstractC3952tg = this.f34863z;
        Integer z3 = abstractC3952tg != null ? abstractC3952tg.z() : null;
        if (z3 != null) {
            hashMap.put("playerId", z3.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f34857n.d("onVideoEvent", hashMap);
    }

    public final void d() {
        C2555Fh c2555Fh = this.f34857n;
        if (c2555Fh.j() == null || !this.f34848B || this.f34849C) {
            return;
        }
        c2555Fh.j().getWindow().clearFlags(128);
        this.f34848B = false;
    }

    public final void e() {
        AbstractC3952tg abstractC3952tg = this.f34863z;
        if (abstractC3952tg != null && this.f34852F == 0) {
            c("canplaythrough", "duration", String.valueOf(abstractC3952tg.j() / 1000.0f), "videoWidth", String.valueOf(abstractC3952tg.o()), "videoHeight", String.valueOf(abstractC3952tg.p()));
        }
    }

    public final void f() {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32428z2)).booleanValue()) {
            RunnableC4060vg runnableC4060vg = this.f34861x;
            runnableC4060vg.f34714v = false;
            HandlerC5068A handlerC5068A = u2.D.f41237l;
            handlerC5068A.removeCallbacks(runnableC4060vg);
            handlerC5068A.postDelayed(runnableC4060vg, 250L);
        }
        C2555Fh c2555Fh = this.f34857n;
        if (c2555Fh.j() != null && !this.f34848B) {
            boolean z3 = (c2555Fh.j().getWindow().getAttributes().flags & 128) != 0;
            this.f34849C = z3;
            if (!z3) {
                c2555Fh.j().getWindow().addFlags(128);
                this.f34848B = true;
            }
        }
        this.f34847A = true;
    }

    public final void finalize() {
        try {
            this.f34861x.a();
            AbstractC3952tg abstractC3952tg = this.f34863z;
            if (abstractC3952tg != null) {
                AbstractC3413jg.f31273f.execute(new RunnableC3111e(19, abstractC3952tg));
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        c(com.anythink.expressad.foundation.d.d.co, new String[0]);
        d();
        this.f34847A = false;
    }

    public final void h() {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32428z2)).booleanValue()) {
            this.f34861x.a();
        }
        c("ended", new String[0]);
        d();
    }

    public final void i() {
        if (this.f34856K && this.f34855I != null) {
            ImageView imageView = this.J;
            if (imageView.getParent() == null) {
                imageView.setImageBitmap(this.f34855I);
                imageView.invalidate();
                FrameLayout frameLayout = this.f34858u;
                frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.bringChildToFront(imageView);
            }
        }
        this.f34861x.a();
        this.f34852F = this.f34851E;
        u2.D.f41237l.post(new RunnableC4006ug(this, 1));
    }

    public final void j(int i, int i6) {
        if (this.f34850D) {
            C3301ha c3301ha = AbstractC3569ma.f32342q0;
            q2.r rVar = q2.r.f40207e;
            int max = Math.max(i / ((Integer) rVar.f40210c.a(c3301ha)).intValue(), 1);
            int max2 = Math.max(i6 / ((Integer) rVar.f40210c.a(c3301ha)).intValue(), 1);
            Bitmap bitmap = this.f34855I;
            if (bitmap != null && bitmap.getWidth() == max && this.f34855I.getHeight() == max2) {
                return;
            }
            this.f34855I = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.f34856K = false;
        }
    }

    public final void k() {
        this.f34859v.setVisibility(4);
        u2.D.f41237l.post(new RunnableC4006ug(2, this, false));
    }

    public final void l(int i, int i6, int i9, int i10) {
        if (u2.z.m()) {
            int length = String.valueOf(i).length();
            StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(i6).length() + 3 + String.valueOf(i9).length() + 3 + String.valueOf(i10).length());
            u1.h.h(sb, "Set video bounds to x:", i, ";y:", i6);
            sb.append(";w:");
            sb.append(i9);
            sb.append(";h:");
            sb.append(i10);
            u2.z.k(sb.toString());
        }
        if (i9 == 0 || i10 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i9, i10);
        layoutParams.setMargins(i, i6, 0, 0);
        this.f34858u.setLayoutParams(layoutParams);
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        RunnableC4060vg runnableC4060vg = this.f34861x;
        if (z3) {
            runnableC4060vg.f34714v = false;
            HandlerC5068A handlerC5068A = u2.D.f41237l;
            handlerC5068A.removeCallbacks(runnableC4060vg);
            handlerC5068A.postDelayed(runnableC4060vg, 250L);
        } else {
            runnableC4060vg.a();
            this.f34852F = this.f34851E;
        }
        u2.D.f41237l.post(new RunnableC4060vg(1, this, z3));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        boolean z3 = false;
        RunnableC4060vg runnableC4060vg = this.f34861x;
        if (i == 0) {
            runnableC4060vg.f34714v = false;
            HandlerC5068A handlerC5068A = u2.D.f41237l;
            handlerC5068A.removeCallbacks(runnableC4060vg);
            handlerC5068A.postDelayed(runnableC4060vg, 250L);
            z3 = true;
        } else {
            runnableC4060vg.a();
            this.f34852F = this.f34851E;
        }
        u2.D.f41237l.post(new RunnableC4060vg(0, this, z3));
    }
}
