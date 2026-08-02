package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.HashMap;
import r2.C4906k;
import w.AbstractC5128c;
import w2.HandlerC5139A;

/* renamed from: com.google.android.gms.internal.ads.wg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4137wg extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public boolean f35624A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f35625B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f35626C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f35627D;

    /* renamed from: E, reason: collision with root package name */
    public long f35628E;

    /* renamed from: F, reason: collision with root package name */
    public long f35629F;

    /* renamed from: G, reason: collision with root package name */
    public String f35630G;

    /* renamed from: H, reason: collision with root package name */
    public String[] f35631H;

    /* renamed from: I, reason: collision with root package name */
    public Bitmap f35632I;
    public final ImageView J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f35633K;

    /* renamed from: n, reason: collision with root package name */
    public final C2575Fh f35634n;

    /* renamed from: u, reason: collision with root package name */
    public final FrameLayout f35635u;

    /* renamed from: v, reason: collision with root package name */
    public final View f35636v;

    /* renamed from: w, reason: collision with root package name */
    public final C3808qa f35637w;

    /* renamed from: x, reason: collision with root package name */
    public final RunnableC4083vg f35638x;

    /* renamed from: y, reason: collision with root package name */
    public final long f35639y;

    /* renamed from: z, reason: collision with root package name */
    public final AbstractC3975tg f35640z;

    public C4137wg(Context context, C2575Fh c2575Fh, int i, boolean z6, C3808qa c3808qa, C2506Bg c2506Bg, C3230fo c3230fo) {
        super(context);
        C3808qa c3808qa2;
        AbstractC3975tg textureViewSurfaceTextureListenerC3921sg;
        AbstractC3975tg abstractC3975tg;
        this.f35634n = c2575Fh;
        this.f35637w = c3808qa;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35635u = frameLayout;
        C3324ha c3324ha = AbstractC3592ma.f33149t;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            frameLayout.setBackgroundColor(-16777216);
        }
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        R2.w.h(c2575Fh.f25606n.f25884z);
        ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh = c2575Fh.f25606n;
        Object obj = viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25884z.f39715b;
        C2523Cg c2523Cg = new C2523Cg(context, viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25880x, viewTreeObserverOnGlobalLayoutListenerC2592Gh.K(), c3808qa, viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25867n0);
        if (i == 3) {
            abstractC3975tg = new C3707oh(context, c2523Cg);
            c3808qa2 = c3808qa;
        } else {
            if (i == 2) {
                viewTreeObserverOnGlobalLayoutListenerC2592Gh.j0().getClass();
                textureViewSurfaceTextureListenerC3921sg = new TextureViewSurfaceTextureListenerC2625Ig(context, c2523Cg, c2575Fh, z6, c2506Bg, c3230fo);
                c3808qa2 = c3808qa;
            } else {
                c3808qa2 = c3808qa;
                textureViewSurfaceTextureListenerC3921sg = new TextureViewSurfaceTextureListenerC3921sg(context, c2575Fh, z6, viewTreeObserverOnGlobalLayoutListenerC2592Gh.j0().b(), new C2523Cg(context, viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25880x, viewTreeObserverOnGlobalLayoutListenerC2592Gh.K(), c3808qa, viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25867n0), c3230fo);
            }
            abstractC3975tg = textureViewSurfaceTextureListenerC3921sg;
        }
        this.f35640z = abstractC3975tg;
        View view = new View(context);
        this.f35636v = view;
        view.setBackgroundColor(0);
        frameLayout.addView(abstractC3975tg, new FrameLayout.LayoutParams(-1, -1, 17));
        C3324ha c3324ha2 = AbstractC3592ma.f33113p0;
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.m0)).booleanValue()) {
            a();
        }
        this.J = new ImageView(context);
        this.f35639y = ((Long) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33131r0)).longValue();
        boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33105o0)).booleanValue();
        this.f35627D = booleanValue;
        c3808qa2.c("spinner_used", true != booleanValue ? "0" : "1");
        this.f35638x = new RunnableC4083vg(this);
        abstractC3975tg.e(this);
    }

    public final void a() {
        AbstractC3975tg abstractC3975tg = this.f35640z;
        if (abstractC3975tg == null) {
            return;
        }
        TextView textView = new TextView(abstractC3975tg.getContext());
        Resources c9 = C4906k.f40186C.f40196h.c();
        textView.setText(String.valueOf(c9 == null ? "AdMob - " : c9.getString(C5248R.string.watermark_label_prefix)).concat(abstractC3975tg.d()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        FrameLayout frameLayout = this.f35635u;
        frameLayout.addView(textView, layoutParams);
        frameLayout.bringChildToFront(textView);
    }

    public final void b() {
        AbstractC3975tg abstractC3975tg = this.f35640z;
        if (abstractC3975tg == null) {
            return;
        }
        long k9 = abstractC3975tg.k();
        if (this.f35628E == k9 || k9 <= 0) {
            return;
        }
        float f2 = k9 / 1000.0f;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33188x2)).booleanValue()) {
            String valueOf = String.valueOf(f2);
            String valueOf2 = String.valueOf(abstractC3975tg.x());
            String valueOf3 = String.valueOf(abstractC3975tg.w());
            String valueOf4 = String.valueOf(abstractC3975tg.v());
            String valueOf5 = String.valueOf(abstractC3975tg.y());
            C4906k.f40186C.f40198k.getClass();
            c("timeupdate", "time", valueOf, "totalBytes", valueOf2, "qoeCachedBytes", valueOf3, "qoeLoadedBytes", valueOf4, "droppedFrames", valueOf5, "reportTime", String.valueOf(System.currentTimeMillis()));
        } else {
            c("timeupdate", "time", String.valueOf(f2));
        }
        this.f35628E = k9;
    }

    public final void c(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        AbstractC3975tg abstractC3975tg = this.f35640z;
        Integer z6 = abstractC3975tg != null ? abstractC3975tg.z() : null;
        if (z6 != null) {
            hashMap.put("playerId", z6.toString());
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
        this.f35634n.d("onVideoEvent", hashMap);
    }

    public final void d() {
        C2575Fh c2575Fh = this.f35634n;
        if (c2575Fh.j() == null || !this.f35625B || this.f35626C) {
            return;
        }
        c2575Fh.j().getWindow().clearFlags(128);
        this.f35625B = false;
    }

    public final void e() {
        AbstractC3975tg abstractC3975tg = this.f35640z;
        if (abstractC3975tg != null && this.f35629F == 0) {
            c("canplaythrough", "duration", String.valueOf(abstractC3975tg.j() / 1000.0f), "videoWidth", String.valueOf(abstractC3975tg.o()), "videoHeight", String.valueOf(abstractC3975tg.p()));
        }
    }

    public final void f() {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33207z2)).booleanValue()) {
            RunnableC4083vg runnableC4083vg = this.f35638x;
            runnableC4083vg.f35471v = false;
            HandlerC5139A handlerC5139A = w2.D.f41627l;
            handlerC5139A.removeCallbacks(runnableC4083vg);
            handlerC5139A.postDelayed(runnableC4083vg, 250L);
        }
        C2575Fh c2575Fh = this.f35634n;
        if (c2575Fh.j() != null && !this.f35625B) {
            boolean z6 = (c2575Fh.j().getWindow().getAttributes().flags & 128) != 0;
            this.f35626C = z6;
            if (!z6) {
                c2575Fh.j().getWindow().addFlags(128);
                this.f35625B = true;
            }
        }
        this.f35624A = true;
    }

    public final void finalize() {
        try {
            this.f35638x.a();
            AbstractC3975tg abstractC3975tg = this.f35640z;
            if (abstractC3975tg != null) {
                AbstractC3436jg.f32060f.execute(new RunnableC3134e(19, abstractC3975tg));
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        c(com.anythink.expressad.foundation.d.d.co, new String[0]);
        d();
        this.f35624A = false;
    }

    public final void h() {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33207z2)).booleanValue()) {
            this.f35638x.a();
        }
        c("ended", new String[0]);
        d();
    }

    public final void i() {
        if (this.f35633K && this.f35632I != null) {
            ImageView imageView = this.J;
            if (imageView.getParent() == null) {
                imageView.setImageBitmap(this.f35632I);
                imageView.invalidate();
                FrameLayout frameLayout = this.f35635u;
                frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.bringChildToFront(imageView);
            }
        }
        this.f35638x.a();
        this.f35629F = this.f35628E;
        w2.D.f41627l.post(new RunnableC4029ug(this, 1));
    }

    public final void j(int i, int i4) {
        if (this.f35627D) {
            C3324ha c3324ha = AbstractC3592ma.f33122q0;
            s2.r rVar = s2.r.f40506e;
            int max = Math.max(i / ((Integer) rVar.f40509c.a(c3324ha)).intValue(), 1);
            int max2 = Math.max(i4 / ((Integer) rVar.f40509c.a(c3324ha)).intValue(), 1);
            Bitmap bitmap = this.f35632I;
            if (bitmap != null && bitmap.getWidth() == max && this.f35632I.getHeight() == max2) {
                return;
            }
            this.f35632I = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.f35633K = false;
        }
    }

    public final void k() {
        this.f35636v.setVisibility(4);
        w2.D.f41627l.post(new RunnableC4029ug(2, this, false));
    }

    public final void l(int i, int i4, int i6, int i9) {
        if (w2.z.m()) {
            int length = String.valueOf(i).length();
            StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(i4).length() + 3 + String.valueOf(i6).length() + 3 + String.valueOf(i9).length());
            AbstractC5128c.g(sb, "Set video bounds to x:", i, ";y:", i4);
            sb.append(";w:");
            sb.append(i6);
            sb.append(";h:");
            sb.append(i9);
            w2.z.k(sb.toString());
        }
        if (i6 == 0 || i9 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i9);
        layoutParams.setMargins(i, i4, 0, 0);
        this.f35635u.setLayoutParams(layoutParams);
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        RunnableC4083vg runnableC4083vg = this.f35638x;
        if (z6) {
            runnableC4083vg.f35471v = false;
            HandlerC5139A handlerC5139A = w2.D.f41627l;
            handlerC5139A.removeCallbacks(runnableC4083vg);
            handlerC5139A.postDelayed(runnableC4083vg, 250L);
        } else {
            runnableC4083vg.a();
            this.f35629F = this.f35628E;
        }
        w2.D.f41627l.post(new RunnableC4083vg(1, this, z6));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        boolean z6 = false;
        RunnableC4083vg runnableC4083vg = this.f35638x;
        if (i == 0) {
            runnableC4083vg.f35471v = false;
            HandlerC5139A handlerC5139A = w2.D.f41627l;
            handlerC5139A.removeCallbacks(runnableC4083vg);
            handlerC5139A.postDelayed(runnableC4083vg, 250L);
            z6 = true;
        } else {
            runnableC4083vg.a();
            this.f35629F = this.f35628E;
        }
        w2.D.f41627l.post(new RunnableC4083vg(0, this, z6));
    }
}
