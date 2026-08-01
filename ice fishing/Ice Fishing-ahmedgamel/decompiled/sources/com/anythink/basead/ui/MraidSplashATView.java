package com.anythink.basead.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.anythink.basead.d.g;
import com.anythink.basead.ui.MraidContainerView;
import com.anythink.basead.ui.f.d;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class MraidSplashATView extends BaseSplashATView {

    /* renamed from: a, reason: collision with root package name */
    MraidContainerView f10153a;

    /* renamed from: b, reason: collision with root package name */
    boolean f10154b;

    /* renamed from: com.anythink.basead.ui.MraidSplashATView$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MraidSplashATView mraidSplashATView = MraidSplashATView.this;
            if (mraidSplashATView.f9941O == null) {
                return;
            }
            mraidSplashATView.j();
        }
    }

    public MraidSplashATView(Context context) {
        super(context);
    }

    private void c() {
        if (this.f9736g.n() && this.f10153a == null) {
            return;
        }
        super.a(this.f9735f.f14168o.ab() < 0 ? 100 : this.f9735f.f14168o.ab(), new AnonymousClass3());
    }

    @Override // com.anythink.basead.ui.BaseSplashATView, com.anythink.basead.ui.BaseATView
    public void destroy() {
        super.destroy();
        MraidContainerView mraidContainerView = this.f10153a;
        if (mraidContainerView != null) {
            mraidContainerView.release();
        }
    }

    @Override // com.anythink.basead.ui.BaseSplashATView, android.view.View
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        MraidContainerView mraidContainerView = this.f10153a;
        if (mraidContainerView != null) {
            mraidContainerView.fireMraidIsViewable(z3);
        }
    }

    @Override // com.anythink.basead.ui.BaseSplashATView
    public final void x() {
        int size = this.f9742n.size();
        for (int i = 0; i < size; i++) {
            View view = this.f9742n.get(i);
            if (view != null) {
                view.setOnClickListener(this.f9945S);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.MraidSplashATView$2, reason: invalid class name */
    public class AnonymousClass2 implements MraidContainerView.a {
        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void a(String str) {
            MraidSplashATView.this.f9736g.w(str);
            MraidSplashATView.this.a(1, 13);
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void b() {
            MraidSplashATView.this.a(106);
            MraidSplashATView.this.x();
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void c() {
            MraidSplashATView.this.a(g.a(g.f6179k, g.f6166V));
            MraidSplashATView.this.a(true, 5);
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void a() {
            try {
                MraidSplashATView.a(MraidSplashATView.this);
            } catch (Throwable unused) {
            }
        }
    }

    public MraidSplashATView(Context context, x xVar, w wVar, com.anythink.basead.g.a aVar) {
        super(context, xVar, wVar, aVar);
    }

    private void b() {
        if (this.f9754z != null) {
            a((View) this);
            this.f9754z.a(findViewById(q.a(getContext(), "myoffer_splash_skip_area", "id")));
        }
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.f9736g, this.f9735f, this.f9754z, new AnonymousClass2());
        this.f10153a = mraidContainerView;
        mraidContainerView.setNeedRegisterVolumeChangeReceiver(true);
        this.f10153a.init();
        FrameLayout frameLayout = (FrameLayout) findViewById(q.a(getContext(), "myoffer_splash_web", "id"));
        if (frameLayout != null) {
            this.f10153a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(this.f10153a);
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a() {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_web_splash_ad_layout", "layout"), this);
        d dVar = this.f9946T;
        if (dVar != null) {
            dVar.a(d.f10801c).a(new com.anythink.basead.ui.d.a() { // from class: com.anythink.basead.ui.MraidSplashATView.1
                @Override // com.anythink.basead.ui.d.a
                public final void a(int i, int i6) {
                    MraidSplashATView.this.a(i, i6);
                }
            }).a(getContext(), this);
        }
        if (this.f9754z != null) {
            a((View) this);
            this.f9754z.a(findViewById(q.a(getContext(), "myoffer_splash_skip_area", "id")));
        }
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.f9736g, this.f9735f, this.f9754z, new AnonymousClass2());
        this.f10153a = mraidContainerView;
        mraidContainerView.setNeedRegisterVolumeChangeReceiver(true);
        this.f10153a.init();
        FrameLayout frameLayout = (FrameLayout) findViewById(q.a(getContext(), "myoffer_splash_web", "id"));
        if (frameLayout != null) {
            this.f10153a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(this.f10153a);
        }
    }

    public static /* synthetic */ void a(MraidSplashATView mraidSplashATView) {
        if (mraidSplashATView.f9736g.n() && mraidSplashATView.f10153a == null) {
            return;
        }
        super.a(mraidSplashATView.f9735f.f14168o.ab() < 0 ? 100 : mraidSplashATView.f9735f.f14168o.ab(), mraidSplashATView.new AnonymousClass3());
    }
}
