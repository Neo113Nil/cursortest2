package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.b.e;
import com.anythink.basead.d.g;
import com.anythink.basead.ui.component.CTAButtonLayout;
import com.anythink.basead.ui.f.d;
import com.anythink.core.api.ATSDKGlobalSetting;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.res.b;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.h;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class SinglePictureSplashATView extends BaseSdkSplashATView {
    public SinglePictureSplashATView(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashATView
    public final void b() {
        View view;
        this.f10531q = findViewById(q.a(getContext(), "myoffer_splash_ad_cta_layout", "id"));
        if (this.f10522g.b() == 4) {
            try {
                View directlySplashCTAButton = ATSDKGlobalSetting.getDirectlySplashCTAButton();
                if (directlySplashCTAButton != null) {
                    try {
                        int indexOfChild = indexOfChild(this.f10531q);
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f10531q.getLayoutParams();
                        this.f10531q.setVisibility(8);
                        this.f10531q = directlySplashCTAButton;
                        if (directlySplashCTAButton.getLayoutParams() != null && (directlySplashCTAButton.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                            layoutParams = (RelativeLayout.LayoutParams) directlySplashCTAButton.getLayoutParams();
                        }
                        am.a(directlySplashCTAButton);
                        addView(directlySplashCTAButton, indexOfChild, layoutParams);
                        if (t.b().F()) {
                            Log.d(this.f10520e, "DIRECTLY Splash View replace cta success");
                        }
                    } catch (Throwable unused) {
                        Log.w(this.f10520e, "DIRECTLY Splash View replace cta fail");
                        this.f10531q = findViewById(q.a(getContext(), "myoffer_splash_ad_cta_layout", "id"));
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        x xVar = this.f10521f;
        if (xVar.f14954o == null || (view = this.f10531q) == null) {
            return;
        }
        if (view instanceof CTAButtonLayout) {
            ((CTAButtonLayout) view).initSetting(this.f10522g, xVar, false, null);
        } else if (view instanceof TextView) {
            if (TextUtils.isEmpty(this.f10522g.D())) {
                ((TextView) this.f10531q).setText(e.a(getContext(), this.f10522g));
            } else {
                ((TextView) this.f10531q).setText(this.f10522g.D());
            }
        }
        if (this.f10521f.f14954o.J() == 0 || n()) {
            this.f10531q.setVisibility(8);
        } else {
            this.f10528n.add(this.f10531q);
        }
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashATView
    public final void c() {
        super.c();
        com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, this.f10522g.B()), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new b.a() { // from class: com.anythink.basead.ui.SinglePictureSplashATView.2
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, final Bitmap bitmap) {
                if (TextUtils.equals(str, SinglePictureSplashATView.this.f10522g.B())) {
                    SinglePictureSplashATView singlePictureSplashATView = SinglePictureSplashATView.this;
                    final WrapRoundImageView wrapRoundImageView = (WrapRoundImageView) singlePictureSplashATView.findViewById(q.a(singlePictureSplashATView.getContext(), "myoffer_splash_ad_content_image_area", "id"));
                    SinglePictureSplashATView singlePictureSplashATView2 = SinglePictureSplashATView.this;
                    final RoundImageView roundImageView = (RoundImageView) singlePictureSplashATView2.findViewById(q.a(singlePictureSplashATView2.getContext(), "myoffer_splash_bg", "id"));
                    wrapRoundImageView.setVisibility(0);
                    if (SinglePictureSplashATView.this.f10521f.f14954o.t() == 2) {
                        wrapRoundImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        wrapRoundImageView.setImageBitmap(bitmap);
                    } else {
                        wrapRoundImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        wrapRoundImageView.post(new Runnable() { // from class: com.anythink.basead.ui.SinglePictureSplashATView.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                wrapRoundImageView.setBitmapAndResize(bitmap, SinglePictureSplashATView.this.getWidth(), SinglePictureSplashATView.this.getHeight());
                            }
                        });
                    }
                    if (roundImageView != null) {
                        h.a(SinglePictureSplashATView.this.getContext(), bitmap, new h.a() { // from class: com.anythink.basead.ui.SinglePictureSplashATView.2.2
                            @Override // com.anythink.core.common.v.h.a
                            public final void a() {
                            }

                            @Override // com.anythink.core.common.v.h.a
                            public final void a(Bitmap bitmap2) {
                                roundImageView.setVisibility(0);
                                roundImageView.setImageBitmap(bitmap2);
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashATView
    public final void d() {
        super.a(this.f10521f.f14954o.ab() < 0 ? 100 : this.f10521f.f14954o.ab(), new Runnable() { // from class: com.anythink.basead.ui.SinglePictureSplashATView.3
            @Override // java.lang.Runnable
            public final void run() {
                SinglePictureSplashATView singlePictureSplashATView = SinglePictureSplashATView.this;
                if (singlePictureSplashATView.f10727O == null) {
                    return;
                }
                int width = singlePictureSplashATView.getWidth();
                int height = SinglePictureSplashATView.this.getHeight();
                int i = (int) (SinglePictureSplashATView.this.getResources().getDisplayMetrics().heightPixels * 0.5d);
                if (width < ((int) (SinglePictureSplashATView.this.getResources().getDisplayMetrics().widthPixels * 0.5d))) {
                    SinglePictureSplashATView.this.a(g.a(g.f6965k, "Splash display width is less than 50% of screen width!"));
                    Log.e("anythink", "Splash display width is less than 50% of screen width!");
                } else if (height >= i) {
                    SinglePictureSplashATView.this.j();
                } else {
                    SinglePictureSplashATView.this.a(g.a(g.f6965k, "Splash display height is less than 50% of screen height!"));
                    Log.e("anythink", "Splash display height is less than 50% of screen height!");
                }
            }
        });
    }

    public SinglePictureSplashATView(Context context, x xVar, w wVar, com.anythink.basead.g.a aVar) {
        super(context, xVar, wVar, aVar);
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a() {
        View inflate;
        if (this.f10521f.f14954o.C() == 2) {
            inflate = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_splash_ad_layout_single_land", "layout"), this);
        } else {
            inflate = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_splash_ad_layout_single_port", "layout"), this);
        }
        w();
        d dVar = this.f10732T;
        if (dVar != null) {
            dVar.a(d.f11587c).a(new com.anythink.basead.ui.d.a() { // from class: com.anythink.basead.ui.SinglePictureSplashATView.1
                @Override // com.anythink.basead.ui.d.a
                public final void a(int i, int i4) {
                    SinglePictureSplashATView.this.a(i, i4);
                }
            }).a(getContext(), inflate);
        }
    }
}
