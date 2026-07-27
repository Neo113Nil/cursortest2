package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.ui.component.CTAButtonLayout;
import com.anythink.basead.ui.f.b;
import com.anythink.basead.ui.f.d;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.h;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class AsseblemSplashATView extends BaseSdkSplashATView {

    /* renamed from: a, reason: collision with root package name */
    protected TextView f9682a;

    /* renamed from: b, reason: collision with root package name */
    protected TextView f9683b;

    /* renamed from: c, reason: collision with root package name */
    protected RoundImageView f9684c;

    /* renamed from: d, reason: collision with root package name */
    protected View f9685d;

    public AsseblemSplashATView(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashATView
    public final void b() {
        this.f9685d = findViewById(q.a(getContext(), "myoffer_splash_ad_bottom_container", "id"));
        this.f9682a = (TextView) findViewById(q.a(getContext(), "myoffer_splash_ad_title", "id"));
        this.f9683b = (TextView) findViewById(q.a(getContext(), "myoffer_splash_desc", "id"));
        this.f9684c = (RoundImageView) findViewById(q.a(getContext(), "myoffer_splash_icon", "id"));
        this.f9745q = findViewById(q.a(getContext(), "myoffer_splash_ad_cta_layout", "id"));
        if (TextUtils.isEmpty(this.f9736g.z())) {
            com.anythink.basead.ui.f.b.a((View) this.f9684c, false);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9684c.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.rightMargin = 0;
                this.f9684c.setLayoutParams(layoutParams);
            }
            if (this.f9735f.f14168o.C() != 2) {
                TextView textView = this.f9682a;
                if (textView != null) {
                    textView.setGravity(17);
                }
                TextView textView2 = this.f9683b;
                if (textView2 != null) {
                    textView2.setGravity(17);
                }
            }
        } else {
            this.f9684c.setVisibility(0);
            this.f9684c.setNeedRadiu(true);
            this.f9684c.setRadiusInDip(12);
            int i = this.f9684c.getLayoutParams().width;
            com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f9736g.z()), i, i, new b.a() { // from class: com.anythink.basead.ui.AsseblemSplashATView.2
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (TextUtils.equals(str, AsseblemSplashATView.this.f9736g.z())) {
                        AsseblemSplashATView.this.f9684c.setImageBitmap(bitmap);
                    }
                }
            });
        }
        if (this.f9735f.f14168o.J() != 1) {
            this.f9742n.add(this.f9684c);
        }
        if (TextUtils.isEmpty(this.f9736g.x())) {
            this.f9682a.setVisibility(4);
        } else {
            this.f9682a.setText(this.f9736g.x());
            this.f9682a.setVisibility(0);
        }
        if (this.f9735f.f14168o.J() != 1) {
            this.f9742n.add(this.f9682a);
        }
        View view = this.f9745q;
        if (view != null) {
            if (view instanceof CTAButtonLayout) {
                ((CTAButtonLayout) view).initSetting(this.f9736g, this.f9735f, false, new b.a() { // from class: com.anythink.basead.ui.AsseblemSplashATView.3
                    @Override // com.anythink.basead.ui.f.b.a
                    public final void a(int i6, int i9) {
                        AsseblemSplashATView.this.a(i6, i9);
                    }
                });
                ((CTAButtonLayout) this.f9745q).changeMinorButtonStyle();
            }
            this.f9742n.add(this.f9745q);
        }
        if (this.f9683b != null) {
            if (TextUtils.isEmpty(this.f9736g.y())) {
                this.f9683b.setVisibility(8);
            } else {
                this.f9683b.setText(this.f9736g.y());
            }
            if (this.f9735f.f14168o.J() != 1) {
                this.f9742n.add(this.f9683b);
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashATView, com.anythink.basead.ui.BaseSplashATView
    public void beforeSplashEndCardShow() {
        super.beforeSplashEndCardShow();
        TextView textView = (TextView) findViewById(q.a(getContext(), "myoffer_splash_ad_title", "id"));
        View findViewById = findViewById(q.a(getContext(), "myoffer_splash_ad_cta_layout", "id"));
        TextView textView2 = (TextView) findViewById(q.a(getContext(), "myoffer_splash_desc", "id"));
        RoundImageView roundImageView = (RoundImageView) findViewById(q.a(getContext(), "myoffer_splash_icon", "id"));
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        if (roundImageView != null) {
            roundImageView.setVisibility(8);
        }
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashATView
    public final void c() {
        super.c();
        final FrameLayout frameLayout = (FrameLayout) findViewById(q.a(getContext(), "myoffer_splash_ad_content_image_area", "id"));
        final RoundImageView roundImageView = (RoundImageView) findViewById(q.a(getContext(), "myoffer_splash_bg", "id"));
        frameLayout.removeAllViews();
        final WrapRoundImageView wrapRoundImageView = new WrapRoundImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        wrapRoundImageView.setLayoutParams(layoutParams);
        wrapRoundImageView.setNeedRadiu(false);
        wrapRoundImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        wrapRoundImageView.setVisibility(4);
        frameLayout.addView(wrapRoundImageView, layoutParams);
        frameLayout.setVisibility(0);
        roundImageView.setNeedRadiu(false);
        roundImageView.setVisibility(0);
        if (TextUtils.isEmpty(this.f9736g.B())) {
            roundImageView.setBackgroundColor(Color.parseColor("#EFEFEF"));
            return;
        }
        com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f9736g.B()), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new b.a() { // from class: com.anythink.basead.ui.AsseblemSplashATView.4
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, final Bitmap bitmap) {
                if (TextUtils.equals(str, AsseblemSplashATView.this.f9736g.B())) {
                    frameLayout.post(new Runnable() { // from class: com.anythink.basead.ui.AsseblemSplashATView.4.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                            wrapRoundImageView.setBitmapAndResize(bitmap, frameLayout.getWidth(), frameLayout.getHeight());
                            wrapRoundImageView.setVisibility(0);
                        }
                    });
                    h.a(AsseblemSplashATView.this.getContext(), bitmap, new h.a() { // from class: com.anythink.basead.ui.AsseblemSplashATView.4.2
                        @Override // com.anythink.core.common.v.h.a
                        public final void a() {
                        }

                        @Override // com.anythink.core.common.v.h.a
                        public final void a(Bitmap bitmap2) {
                            roundImageView.setImageBitmap(bitmap2);
                        }
                    });
                }
            }
        });
        if (this.f9735f.f14168o.J() != 1) {
            this.f9742n.add(wrapRoundImageView);
        }
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashATView
    public void d() {
        super.a(this.f9735f.f14168o.ab() < 0 ? 100 : this.f9735f.f14168o.ab(), new Runnable() { // from class: com.anythink.basead.ui.AsseblemSplashATView.5
            @Override // java.lang.Runnable
            public final void run() {
                AsseblemSplashATView asseblemSplashATView = AsseblemSplashATView.this;
                if (asseblemSplashATView.f9941O == null) {
                    return;
                }
                asseblemSplashATView.j();
            }
        });
    }

    public AsseblemSplashATView(Context context, x xVar, w wVar, com.anythink.basead.g.a aVar) {
        super(context, xVar, wVar, aVar);
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a() {
        View inflate = this.f9735f.f14168o.C() == 2 ? LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_splash_ad_layout_asseblem_vertical_land", "layout"), this) : LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_splash_ad_layout_asseblem_vertical_port", "layout"), this);
        w();
        d dVar = this.f9946T;
        if (dVar != null) {
            dVar.a(d.f10801c).a(new com.anythink.basead.ui.d.a() { // from class: com.anythink.basead.ui.AsseblemSplashATView.1
                @Override // com.anythink.basead.ui.d.a
                public final void a(int i, int i6) {
                    AsseblemSplashATView.this.a(i, i6);
                }
            }).a(getContext(), inflate);
        }
    }
}
