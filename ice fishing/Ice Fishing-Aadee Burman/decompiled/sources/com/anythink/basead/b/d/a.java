package com.anythink.basead.b.d;

import D.y;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.component.CTAButtonLayout;
import com.anythink.basead.ui.f.b;
import com.anythink.core.common.a.b;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.v.g;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    CTAButtonLayout f5983a;

    /* renamed from: b, reason: collision with root package name */
    ImageView f5984b;

    /* renamed from: c, reason: collision with root package name */
    View f5985c;

    /* renamed from: d, reason: collision with root package name */
    View f5986d;

    /* renamed from: e, reason: collision with root package name */
    Context f5987e;

    /* renamed from: f, reason: collision with root package name */
    ValueAnimator f5988f;

    /* renamed from: g, reason: collision with root package name */
    boolean f5989g;

    /* renamed from: h, reason: collision with root package name */
    boolean f5990h;
    int i;

    /* renamed from: j, reason: collision with root package name */
    int f5991j;

    public a(final Context context) {
        this.f5987e = context;
        this.f5985c = LayoutInflater.from(context).inflate(q.a(context, "myoffer_letter_top_layout", "layout"), (ViewGroup) null);
        View view = new View(context);
        this.f5986d = view;
        view.setBackgroundResource(q.a(context, "myoffer_letter_bottom", k.f19632c));
        this.f5983a = (CTAButtonLayout) this.f5985c.findViewById(q.a(context, "myoffer_panel_cta_layout", "id"));
        this.f5984b = (ImageView) this.f5985c.findViewById(q.a(context, "myoffer_letter_icon", "id"));
        String a9 = g.a().a(b.d.f12118c);
        String a10 = g.a().a(b.d.f12119d);
        if (!TextUtils.isEmpty(a9)) {
            y.f().a(new e(3, a9), new b.a() { // from class: com.anythink.basead.b.d.a.1
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    Context context2;
                    View findViewById;
                    View view2 = a.this.f5985c;
                    if (view2 == null || (context2 = context) == null || (findViewById = view2.findViewById(q.a(context2, "myoffer_letter_top", "id"))) == null) {
                        return;
                    }
                    findViewById.setBackground(new BitmapDrawable(context.getResources(), bitmap));
                }
            });
        }
        if (TextUtils.isEmpty(a10)) {
            return;
        }
        y.f().a(new e(3, a10), new b.a() { // from class: com.anythink.basead.b.d.a.2
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, Bitmap bitmap) {
                ImageView imageView = a.this.f5984b;
                if (imageView == null || context == null) {
                    return;
                }
                imageView.setImageBitmap(bitmap);
            }
        });
    }

    public final void a(RelativeLayout relativeLayout, int i) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(8, i);
        this.f5985c.setLayoutParams(layoutParams);
        relativeLayout.addView(this.f5985c, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(8, this.f5985c.getId());
        layoutParams2.addRule(5, this.f5985c.getId());
        layoutParams2.addRule(7, this.f5985c.getId());
        relativeLayout.addView(this.f5986d, 0, layoutParams2);
    }

    public final int b() {
        return this.f5991j;
    }

    public final void c() {
        this.f5990h = true;
        try {
            ValueAnimator valueAnimator = this.f5988f;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            this.f5988f.cancel();
        } catch (Throwable unused) {
        }
    }

    public final View d() {
        return this.f5983a;
    }

    public final void a(w wVar, x xVar, final b.a aVar) {
        if (!TextUtils.isEmpty(wVar.H())) {
            this.f5983a.initSetting(wVar, xVar, false, new b.a() { // from class: com.anythink.basead.b.d.a.3
                @Override // com.anythink.basead.ui.f.b.a
                public final void a(int i, int i6) {
                    b.a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(i, i6);
                    }
                }
            });
            this.f5983a.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.b.d.a.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(1, 1);
                    }
                }
            });
            this.f5984b.setVisibility(8);
            this.f5983a.setVisibility(0);
        } else {
            this.f5983a.setVisibility(8);
            this.f5984b.setVisibility(0);
        }
        new com.anythink.basead.ui.f.a(wVar, xVar).b(this.f5985c);
    }

    public final void a(int i) {
        this.i = (i * 111) / 300;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f5985c.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = this.i;
        this.f5985c.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f5986d.getLayoutParams();
        layoutParams2.width = i;
        layoutParams2.height = (layoutParams.height * 200) / 111;
        this.f5986d.setLayoutParams(layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f5983a.getLayoutParams();
        layoutParams3.height = (layoutParams.height * 48) / com.anythink.expressad.video.module.a.a.f21727Q;
        layoutParams3.bottomMargin = (this.i / com.anythink.expressad.video.module.a.a.f21730T) * 35;
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f5984b.getLayoutParams();
        int i6 = this.i;
        layoutParams4.bottomMargin = (i6 / com.anythink.expressad.video.module.a.a.f21730T) * 35;
        this.f5991j = i6 / 3;
    }

    public final void a(final View view) {
        if (this.f5989g || this.f5990h) {
            return;
        }
        this.f5989g = true;
        view.postDelayed(new Runnable() { // from class: com.anythink.basead.b.d.a.5
            @Override // java.lang.Runnable
            public final void run() {
                a.this.f5988f = ValueAnimator.ofFloat(0.0f, 720.0f);
                a.this.f5988f.setDuration(com.anythink.basead.exoplayer.i.a.f7883f);
                a.this.f5988f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.b.d.a.5.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float duration = ((valueAnimator.getDuration() * 2) - valueAnimator.getCurrentPlayTime()) / (valueAnimator.getDuration() * 2.0f);
                        double pow = Math.pow(duration, 2.0d) * Math.sin(Math.toRadians(((Float) valueAnimator.getAnimatedValue()).floatValue()));
                        view.setTranslationY(-((float) (a.this.f5991j * pow)));
                    }
                });
                if (a.this.f5988f.isStarted()) {
                    return;
                }
                a.this.f5988f.start();
            }
        }, com.anythink.basead.exoplayer.i.a.f7883f);
    }

    public final int a() {
        return this.i;
    }
}
