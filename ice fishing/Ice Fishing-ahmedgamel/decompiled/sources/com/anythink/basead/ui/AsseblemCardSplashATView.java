package com.anythink.basead.ui;

import D.y;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.basead.ui.BaseShakeView;
import com.anythink.basead.ui.f.d;
import com.anythink.core.common.a.b;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.g;
import com.anythink.core.common.v.h;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class AsseblemCardSplashATView extends BaseNewStyleSDKSplashATView {

    /* renamed from: a, reason: collision with root package name */
    protected TextView f9666a;
    private SplashShakeTextHintView ad;
    private ImageView ae;

    /* renamed from: b, reason: collision with root package name */
    protected TextView f9667b;

    /* renamed from: c, reason: collision with root package name */
    protected TextView f9668c;

    /* renamed from: d, reason: collision with root package name */
    protected RoundImageView f9669d;

    public AsseblemCardSplashATView(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashATView
    public final void b() {
        this.f9666a = (TextView) findViewById(q.a(getContext(), "myoffer_splash_ad_title", "id"));
        this.f9667b = (TextView) findViewById(q.a(getContext(), "myoffer_splash_desc", "id"));
        this.f9668c = (TextView) findViewById(q.a(getContext(), "myoffer_splash_cta_text", "id"));
        this.f9669d = (RoundImageView) findViewById(q.a(getContext(), "myoffer_splash_icon", "id"));
        this.f9745q = findViewById(q.a(getContext(), "myoffer_splash_ad_cta_layout", "id"));
        this.ad = (SplashShakeTextHintView) findViewById(q.a(getContext(), "myoffer_splash_cta_shake", "id"));
        this.ae = (ImageView) findViewById(q.a(getContext(), "myoffer_splash_ambience_bg", "id"));
        if (TextUtils.isEmpty(this.f9736g.z())) {
            am.a(this.f9669d, 0, 0);
        } else {
            this.f9669d.setVisibility(0);
            this.f9669d.setNeedRadiu(true);
            this.f9669d.setRadiusInDip(12);
            int i = this.f9669d.getLayoutParams().width;
            com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f9736g.z()), i, i, new b.a() { // from class: com.anythink.basead.ui.AsseblemCardSplashATView.2
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (TextUtils.equals(str, AsseblemCardSplashATView.this.f9736g.z())) {
                        AsseblemCardSplashATView.this.f9669d.setImageBitmap(bitmap);
                    }
                }
            });
        }
        if (TextUtils.isEmpty(this.f9736g.x())) {
            am.a(this.f9666a, 0, 0);
        } else {
            this.f9666a.setText(this.f9736g.x());
            this.f9666a.setVisibility(0);
        }
        if (this.f9667b != null) {
            if (TextUtils.isEmpty(this.f9736g.y())) {
                this.f9667b.setVisibility(8);
            } else {
                this.f9667b.setText(this.f9736g.y());
            }
        }
        View view = this.f9745q;
        if (view != null) {
            this.f9742n.add(view);
        }
        if (n()) {
            TextView textView = this.f9668c;
            if (textView != null) {
                textView.setVisibility(8);
            }
            SplashShakeTextHintView splashShakeTextHintView = this.ad;
            if (splashShakeTextHintView != null) {
                if (((BaseNewStyleSDKSplashATView) this).f9837A > ((BaseNewStyleSDKSplashATView) this).f9838B) {
                    splashShakeTextHintView.setTextSize(17);
                }
                this.ad.setVisibility(0);
                this.ad.setShakeSetting(this.f9735f.f14168o, this.f9736g.K());
                this.ad.setOnShakeListener(new BaseShakeView.a() { // from class: com.anythink.basead.ui.AsseblemCardSplashATView.3
                    @Override // com.anythink.basead.ui.BaseShakeView.a
                    public final boolean a() {
                        if (!AsseblemCardSplashATView.this.C()) {
                            return false;
                        }
                        AsseblemCardSplashATView.this.a(4, 5);
                        return true;
                    }
                }, this.f9735f.f14168o);
            }
        } else {
            if (this.f9668c != null && ((BaseNewStyleSDKSplashATView) this).f9837A > ((BaseNewStyleSDKSplashATView) this).f9838B) {
                if (TextUtils.isEmpty(this.f9736g.D())) {
                    this.f9668c.setText(com.anythink.basead.b.e.a(getContext(), this.f9736g));
                } else {
                    this.f9668c.setText(this.f9736g.D());
                }
            }
            SplashShakeTextHintView splashShakeTextHintView2 = this.ad;
            if (splashShakeTextHintView2 != null) {
                splashShakeTextHintView2.setVisibility(8);
            }
        }
        if (this.ae != null) {
            String a9 = g.a().a(b.d.f12124j);
            if (TextUtils.isEmpty(a9)) {
                return;
            }
            y.f().a(new e(3, a9), new b.a() { // from class: com.anythink.basead.ui.AsseblemCardSplashATView.4
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (AsseblemCardSplashATView.this.ae != null) {
                        AsseblemCardSplashATView.this.ae.setImageBitmap(bitmap);
                    }
                }
            });
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
        com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f9736g.B()), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new b.a() { // from class: com.anythink.basead.ui.AsseblemCardSplashATView.5
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, final Bitmap bitmap) {
                if (TextUtils.equals(str, AsseblemCardSplashATView.this.f9736g.B())) {
                    frameLayout.post(new Runnable() { // from class: com.anythink.basead.ui.AsseblemCardSplashATView.5.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                            wrapRoundImageView.setBitmapAndResize(bitmap, frameLayout.getWidth(), frameLayout.getHeight());
                            wrapRoundImageView.setVisibility(0);
                        }
                    });
                    h.a(AsseblemCardSplashATView.this.getContext(), bitmap, new h.a() { // from class: com.anythink.basead.ui.AsseblemCardSplashATView.5.2
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
    public final void d() {
        super.a(this.f9735f.f14168o.ab() < 0 ? 100 : this.f9735f.f14168o.ab(), new Runnable() { // from class: com.anythink.basead.ui.AsseblemCardSplashATView.6
            @Override // java.lang.Runnable
            public final void run() {
                AsseblemCardSplashATView asseblemCardSplashATView = AsseblemCardSplashATView.this;
                if (asseblemCardSplashATView.f9941O == null) {
                    return;
                }
                asseblemCardSplashATView.j();
            }
        });
    }

    public AsseblemCardSplashATView(Context context, x xVar, w wVar, com.anythink.basead.g.a aVar) {
        super(context, xVar, wVar, aVar);
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a() {
        View inflate;
        if (((BaseNewStyleSDKSplashATView) this).f9837A > ((BaseNewStyleSDKSplashATView) this).f9838B) {
            inflate = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_splash_ad_layout_asseblem_card_horizontal", "layout"), this);
        } else {
            inflate = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_splash_ad_layout_asseblem_card_vertical", "layout"), this);
        }
        w();
        d dVar = this.f9946T;
        if (dVar != null) {
            dVar.a(d.f10801c).a(new com.anythink.basead.ui.d.a() { // from class: com.anythink.basead.ui.AsseblemCardSplashATView.1
                @Override // com.anythink.basead.ui.d.a
                public final void a(int i, int i6) {
                    AsseblemCardSplashATView.this.a(i, i6);
                }
            }).a(getContext(), inflate);
        }
    }
}
