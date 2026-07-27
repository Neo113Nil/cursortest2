package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.HashMap;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.tg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3965tg extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public boolean f34426A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f34427B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f34428C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f34429D;

    /* renamed from: E, reason: collision with root package name */
    public long f34430E;

    /* renamed from: F, reason: collision with root package name */
    public long f34431F;

    /* renamed from: G, reason: collision with root package name */
    public String f34432G;

    /* renamed from: H, reason: collision with root package name */
    public String[] f34433H;

    /* renamed from: I, reason: collision with root package name */
    public Bitmap f34434I;
    public final ImageView J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f34435K;

    /* renamed from: n, reason: collision with root package name */
    public final C2486Bh f34436n;

    /* renamed from: u, reason: collision with root package name */
    public final FrameLayout f34437u;

    /* renamed from: v, reason: collision with root package name */
    public final View f34438v;

    /* renamed from: w, reason: collision with root package name */
    public final C3636na f34439w;

    /* renamed from: x, reason: collision with root package name */
    public final RunnableC3911sg f34440x;

    /* renamed from: y, reason: collision with root package name */
    public final long f34441y;

    /* renamed from: z, reason: collision with root package name */
    public final AbstractC3804qg f34442z;

    public C3965tg(Context context, C2486Bh c2486Bh, int i, boolean z8, C3636na c3636na, C4235yg c4235yg, C3165eo c3165eo) {
        super(context);
        C3636na c3636na2;
        AbstractC3804qg textureViewSurfaceTextureListenerC3696og;
        AbstractC3804qg abstractC3804qg;
        this.f34436n = c2486Bh;
        this.f34439w = c3636na;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34437u = frameLayout;
        C3151ea c3151ea = AbstractC3368ia.f31787t;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            frameLayout.setBackgroundColor(-16777216);
        }
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        O2.w.h(c2486Bh.f24059n.f24508z);
        ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh = c2486Bh.f24059n;
        Object obj = viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24508z.f2952u;
        C4289zg c4289zg = new C4289zg(context, viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24504x, viewTreeObserverOnGlobalLayoutListenerC2520Dh.M(), c3636na, viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24496s0);
        if (i == 3) {
            abstractC3804qg = new C3481kh(context, c4289zg);
            c3636na2 = c3636na;
        } else {
            if (i == 2) {
                viewTreeObserverOnGlobalLayoutListenerC2520Dh.e0().getClass();
                textureViewSurfaceTextureListenerC3696og = new TextureViewSurfaceTextureListenerC2553Fg(context, c4289zg, c2486Bh, z8, c4235yg, c3165eo);
                c3636na2 = c3636na;
            } else {
                c3636na2 = c3636na;
                textureViewSurfaceTextureListenerC3696og = new TextureViewSurfaceTextureListenerC3696og(context, c2486Bh, z8, viewTreeObserverOnGlobalLayoutListenerC2520Dh.e0().b(), new C4289zg(context, viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24504x, viewTreeObserverOnGlobalLayoutListenerC2520Dh.M(), c3636na, viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24496s0), c3165eo);
            }
            abstractC3804qg = textureViewSurfaceTextureListenerC3696og;
        }
        this.f34442z = abstractC3804qg;
        View view = new View(context);
        this.f34438v = view;
        view.setBackgroundColor(0);
        frameLayout.addView(abstractC3804qg, new FrameLayout.LayoutParams(-1, -1, 17));
        C3151ea c3151ea2 = AbstractC3368ia.f31753p0;
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.m0)).booleanValue()) {
            a();
        }
        this.J = new ImageView(context);
        this.f34441y = ((Long) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31770r0)).longValue();
        boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31743o0)).booleanValue();
        this.f34429D = booleanValue;
        c3636na2.c("spinner_used", true != booleanValue ? "0" : "1");
        this.f34440x = new RunnableC3911sg(this);
        abstractC3804qg.e(this);
    }

    public final void a() {
        AbstractC3804qg abstractC3804qg = this.f34442z;
        if (abstractC3804qg == null) {
            return;
        }
        TextView textView = new TextView(abstractC3804qg.getContext());
        Resources c4 = p2.j.f39798C.f39808h.c();
        textView.setText(String.valueOf(c4 == null ? "AdMob - " : c4.getString(C5284R.string.watermark_label_prefix)).concat(abstractC3804qg.d()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        FrameLayout frameLayout = this.f34437u;
        frameLayout.addView(textView, layoutParams);
        frameLayout.bringChildToFront(textView);
    }

    public final void b() {
        AbstractC3804qg abstractC3804qg = this.f34442z;
        if (abstractC3804qg == null) {
            return;
        }
        long k6 = abstractC3804qg.k();
        if (this.f34430E == k6 || k6 <= 0) {
            return;
        }
        float f6 = k6 / 1000.0f;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31828x2)).booleanValue()) {
            String valueOf = String.valueOf(f6);
            String valueOf2 = String.valueOf(abstractC3804qg.x());
            String valueOf3 = String.valueOf(abstractC3804qg.r());
            String valueOf4 = String.valueOf(abstractC3804qg.q());
            String valueOf5 = String.valueOf(abstractC3804qg.y());
            p2.j.f39798C.f39810k.getClass();
            c("timeupdate", "time", valueOf, "totalBytes", valueOf2, "qoeCachedBytes", valueOf3, "qoeLoadedBytes", valueOf4, "droppedFrames", valueOf5, "reportTime", String.valueOf(System.currentTimeMillis()));
        } else {
            c("timeupdate", "time", String.valueOf(f6));
        }
        this.f34430E = k6;
    }

    public final void c(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        AbstractC3804qg abstractC3804qg = this.f34442z;
        Integer z8 = abstractC3804qg != null ? abstractC3804qg.z() : null;
        if (z8 != null) {
            hashMap.put("playerId", z8.toString());
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
        this.f34436n.a("onVideoEvent", hashMap);
    }

    public final void d() {
        C2486Bh c2486Bh = this.f34436n;
        if (c2486Bh.h() == null || !this.f34427B || this.f34428C) {
            return;
        }
        c2486Bh.h().getWindow().clearFlags(128);
        this.f34427B = false;
    }

    public final void e() {
        AbstractC3804qg abstractC3804qg = this.f34442z;
        if (abstractC3804qg != null && this.f34431F == 0) {
            c("canplaythrough", "duration", String.valueOf(abstractC3804qg.j() / 1000.0f), "videoWidth", String.valueOf(abstractC3804qg.o()), "videoHeight", String.valueOf(abstractC3804qg.p()));
        }
    }

    public final void f() {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31845z2)).booleanValue()) {
            RunnableC3911sg runnableC3911sg = this.f34440x;
            runnableC3911sg.f34256v = false;
            t2.D d2 = t2.G.f40858l;
            d2.removeCallbacks(runnableC3911sg);
            d2.postDelayed(runnableC3911sg, 250L);
        }
        C2486Bh c2486Bh = this.f34436n;
        if (c2486Bh.h() != null && !this.f34427B) {
            boolean z8 = (c2486Bh.h().getWindow().getAttributes().flags & 128) != 0;
            this.f34428C = z8;
            if (!z8) {
                c2486Bh.h().getWindow().addFlags(128);
                this.f34427B = true;
            }
        }
        this.f34426A = true;
    }

    public final void finalize() {
        try {
            this.f34440x.a();
            AbstractC3804qg abstractC3804qg = this.f34442z;
            if (abstractC3804qg != null) {
                AbstractC3212fg.f30743f.execute(new RunnableC3068d(19, abstractC3804qg));
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        c(com.anythink.expressad.foundation.d.d.co, new String[0]);
        d();
        this.f34426A = false;
    }

    public final void h() {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31845z2)).booleanValue()) {
            this.f34440x.a();
        }
        c("ended", new String[0]);
        d();
    }

    public final void i() {
        if (this.f34435K && this.f34434I != null) {
            ImageView imageView = this.J;
            if (imageView.getParent() == null) {
                imageView.setImageBitmap(this.f34434I);
                imageView.invalidate();
                FrameLayout frameLayout = this.f34437u;
                frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.bringChildToFront(imageView);
            }
        }
        this.f34440x.a();
        this.f34431F = this.f34430E;
        t2.G.f40858l.post(new RunnableC3857rg(this, 1));
    }

    public final void j(int i, int i4) {
        if (this.f34429D) {
            C3151ea c3151ea = AbstractC3368ia.f31761q0;
            q2.r rVar = q2.r.f40116e;
            int max = Math.max(i / ((Integer) rVar.f40119c.a(c3151ea)).intValue(), 1);
            int max2 = Math.max(i4 / ((Integer) rVar.f40119c.a(c3151ea)).intValue(), 1);
            Bitmap bitmap = this.f34434I;
            if (bitmap != null && bitmap.getWidth() == max && this.f34434I.getHeight() == max2) {
                return;
            }
            this.f34434I = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.f34435K = false;
        }
    }

    public final void k() {
        this.f34438v.setVisibility(4);
        t2.G.f40858l.post(new RunnableC3857rg(2, this, false));
    }

    public final void l(int i, int i4, int i9, int i10) {
        if (t2.C.m()) {
            int length = String.valueOf(i).length();
            StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(i4).length() + 3 + String.valueOf(i9).length() + 3 + String.valueOf(i10).length());
            AbstractC5051n.i(sb, "Set video bounds to x:", i, ";y:", i4);
            sb.append(";w:");
            sb.append(i9);
            sb.append(";h:");
            sb.append(i10);
            t2.C.k(sb.toString());
        }
        if (i9 == 0 || i10 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i9, i10);
        layoutParams.setMargins(i, i4, 0, 0);
        this.f34437u.setLayoutParams(layoutParams);
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        RunnableC3911sg runnableC3911sg = this.f34440x;
        if (z8) {
            runnableC3911sg.f34256v = false;
            t2.D d2 = t2.G.f40858l;
            d2.removeCallbacks(runnableC3911sg);
            d2.postDelayed(runnableC3911sg, 250L);
        } else {
            runnableC3911sg.a();
            this.f34431F = this.f34430E;
        }
        t2.G.f40858l.post(new RunnableC3911sg(1, this, z8));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        boolean z8 = false;
        RunnableC3911sg runnableC3911sg = this.f34440x;
        if (i == 0) {
            runnableC3911sg.f34256v = false;
            t2.D d2 = t2.G.f40858l;
            d2.removeCallbacks(runnableC3911sg);
            d2.postDelayed(runnableC3911sg, 250L);
            z8 = true;
        } else {
            runnableC3911sg.a();
            this.f34431F = this.f34430E;
        }
        t2.G.f40858l.post(new RunnableC3911sg(0, this, z8));
    }
}
