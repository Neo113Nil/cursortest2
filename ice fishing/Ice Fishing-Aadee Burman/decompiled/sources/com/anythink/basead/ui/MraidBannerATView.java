package com.anythink.basead.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.basead.ui.MraidContainerView;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.u.e;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class MraidBannerATView extends BaseBannerATView {

    /* renamed from: A, reason: collision with root package name */
    MraidContainerView f10107A;

    /* renamed from: B, reason: collision with root package name */
    boolean f10108B;

    /* renamed from: C, reason: collision with root package name */
    boolean f10109C;

    /* renamed from: D, reason: collision with root package name */
    boolean f10110D;

    public MraidBannerATView(Context context) {
        super(context);
    }

    private void w() {
        int a9;
        int a10;
        String D8 = this.f9735f.f14168o.D();
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_web_banner_ad_layout", "layout"), this);
        this.f9815b = (CloseImageView) findViewById(q.a(getContext(), "myoffer_banner_close", "id"));
        a9 = q.a(getContext(), 50.0f);
        a10 = q.a(getContext(), 320.0f);
        D8.getClass();
        switch (D8) {
            case "300x250":
                a10 = q.a(getContext(), 300.0f);
                a9 = q.a(getContext(), 250.0f);
                break;
            case "320x90":
                a10 = q.a(getContext(), 320.0f);
                a9 = q.a(getContext(), 90.0f);
                break;
            case "728x90":
                a10 = q.a(getContext(), 720.0f);
                a9 = q.a(getContext(), 90.0f);
                break;
        }
        int min = Math.min(a10, getResources().getDisplayMetrics().widthPixels);
        if (this.f9754z != null) {
            a(findViewById(q.a(getContext(), "myoffer_banner_root", "id")));
            this.f9754z.a(this.f9815b);
        }
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.f9736g, this.f9735f, this.f9754z, new AnonymousClass1());
        this.f10107A = mraidContainerView;
        mraidContainerView.init();
        FrameLayout frameLayout = (FrameLayout) findViewById(q.a(getContext(), "myoffer_banner_web", "id"));
        this.f10107A.setMinimumHeight(q.a(getContext(), 50.0f));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(min, a9);
        layoutParams.gravity = 17;
        frameLayout.addView(this.f10107A, 0, layoutParams);
        setLayoutParams(new ViewGroup.LayoutParams(min, a9));
        if (this.f9735f.f14168o.E() != 0) {
            this.f9815b.setVisibility(8);
        } else {
            this.f9815b.setVisibility(0);
            a((b) this.f9815b, false);
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a() {
        int a9;
        int a10;
        String D8 = this.f9735f.f14168o.D();
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_web_banner_ad_layout", "layout"), this);
        this.f9815b = (CloseImageView) findViewById(q.a(getContext(), "myoffer_banner_close", "id"));
        a9 = q.a(getContext(), 50.0f);
        a10 = q.a(getContext(), 320.0f);
        D8.getClass();
        switch (D8) {
            case "300x250":
                a10 = q.a(getContext(), 300.0f);
                a9 = q.a(getContext(), 250.0f);
                break;
            case "320x90":
                a10 = q.a(getContext(), 320.0f);
                a9 = q.a(getContext(), 90.0f);
                break;
            case "728x90":
                a10 = q.a(getContext(), 720.0f);
                a9 = q.a(getContext(), 90.0f);
                break;
        }
        int min = Math.min(a10, getResources().getDisplayMetrics().widthPixels);
        if (this.f9754z != null) {
            a(findViewById(q.a(getContext(), "myoffer_banner_root", "id")));
            this.f9754z.a(this.f9815b);
        }
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.f9736g, this.f9735f, this.f9754z, new AnonymousClass1());
        this.f10107A = mraidContainerView;
        mraidContainerView.init();
        FrameLayout frameLayout = (FrameLayout) findViewById(q.a(getContext(), "myoffer_banner_web", "id"));
        this.f10107A.setMinimumHeight(q.a(getContext(), 50.0f));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(min, a9);
        layoutParams.gravity = 17;
        frameLayout.addView(this.f10107A, 0, layoutParams);
        setLayoutParams(new ViewGroup.LayoutParams(min, a9));
        if (this.f9735f.f14168o.E() == 0) {
            this.f9815b.setVisibility(0);
            a((b) this.f9815b, false);
        } else {
            this.f9815b.setVisibility(8);
        }
        com.anythink.basead.ui.f.a aVar = new com.anythink.basead.ui.f.a(this.f9736g, this.f9735f);
        this.f9817d = aVar;
        aVar.b(this);
    }

    @Override // com.anythink.basead.ui.BaseBannerATView
    public final void b() {
        if (this.f10107A == null) {
            return;
        }
        super.b();
    }

    public final synchronized void d() {
        if (this.f10108B && this.f10109C && !this.f10110D) {
            this.f10110D = true;
            e.a(this.f9735f, this.f9736g);
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public void destroy() {
        super.destroy();
        MraidContainerView mraidContainerView = this.f10107A;
        if (mraidContainerView != null) {
            mraidContainerView.release();
        }
    }

    @Override // com.anythink.basead.ui.BaseBannerATView, com.anythink.basead.ui.BaseATView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10109C = true;
        d();
    }

    @Override // com.anythink.basead.ui.BaseATView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10109C = false;
    }

    /* renamed from: com.anythink.basead.ui.MraidBannerATView$1, reason: invalid class name */
    public class AnonymousClass1 implements MraidContainerView.a {
        public AnonymousClass1() {
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void a(String str) {
            MraidBannerATView.this.f9736g.w(str);
            MraidBannerATView.this.a(1, 13);
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void b() {
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void c() {
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void a() {
            MraidBannerATView mraidBannerATView = MraidBannerATView.this;
            mraidBannerATView.f10108B = true;
            mraidBannerATView.d();
            try {
                MraidBannerATView.this.b();
            } catch (Throwable unused) {
            }
        }
    }

    public MraidBannerATView(Context context, x xVar, w wVar, com.anythink.basead.g.a aVar) {
        super(context, xVar, wVar, aVar);
        c();
    }
}
