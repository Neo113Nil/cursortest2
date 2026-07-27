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
    CTAButtonLayout f6140a;

    /* renamed from: b, reason: collision with root package name */
    ImageView f6141b;

    /* renamed from: c, reason: collision with root package name */
    View f6142c;

    /* renamed from: d, reason: collision with root package name */
    View f6143d;

    /* renamed from: e, reason: collision with root package name */
    Context f6144e;

    /* renamed from: f, reason: collision with root package name */
    ValueAnimator f6145f;

    /* renamed from: g, reason: collision with root package name */
    boolean f6146g;

    /* renamed from: h, reason: collision with root package name */
    boolean f6147h;
    int i;

    /* renamed from: j, reason: collision with root package name */
    int f6148j;

    public a(final Context context) {
        this.f6144e = context;
        this.f6142c = LayoutInflater.from(context).inflate(q.a(context, "myoffer_letter_top_layout", "layout"), (ViewGroup) null);
        View view = new View(context);
        this.f6143d = view;
        view.setBackgroundResource(q.a(context, "myoffer_letter_bottom", k.f19790c));
        this.f6140a = (CTAButtonLayout) this.f6142c.findViewById(q.a(context, "myoffer_panel_cta_layout", "id"));
        this.f6141b = (ImageView) this.f6142c.findViewById(q.a(context, "myoffer_letter_icon", "id"));
        String a9 = g.a().a(b.d.f12275c);
        String a10 = g.a().a(b.d.f12276d);
        if (!TextUtils.isEmpty(a9)) {
            y.f().a(new e(3, a9), new b.a() { // from class: com.anythink.basead.b.d.a.1
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    Context context2;
                    View findViewById;
                    View view2 = a.this.f6142c;
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
                ImageView imageView = a.this.f6141b;
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
        this.f6142c.setLayoutParams(layoutParams);
        relativeLayout.addView(this.f6142c, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(8, this.f6142c.getId());
        layoutParams2.addRule(5, this.f6142c.getId());
        layoutParams2.addRule(7, this.f6142c.getId());
        relativeLayout.addView(this.f6143d, 0, layoutParams2);
    }

    public final int b() {
        return this.f6148j;
    }

    public final void c() {
        this.f6147h = true;
        try {
            ValueAnimator valueAnimator = this.f6145f;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            this.f6145f.cancel();
        } catch (Throwable unused) {
        }
    }

    public final View d() {
        return this.f6140a;
    }

    public final void a(w wVar, x xVar, final b.a aVar) {
        if (!TextUtils.isEmpty(wVar.H())) {
            this.f6140a.initSetting(wVar, xVar, false, new b.a() { // from class: com.anythink.basead.b.d.a.3
                @Override // com.anythink.basead.ui.f.b.a
                public final void a(int i, int i4) {
                    b.a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(i, i4);
                    }
                }
            });
            this.f6140a.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.b.d.a.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(1, 1);
                    }
                }
            });
            this.f6141b.setVisibility(8);
            this.f6140a.setVisibility(0);
        } else {
            this.f6140a.setVisibility(8);
            this.f6141b.setVisibility(0);
        }
        new com.anythink.basead.ui.f.a(wVar, xVar).b(this.f6142c);
    }

    public final void a(int i) {
        this.i = (i * 111) / 300;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f6142c.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = this.i;
        this.f6142c.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f6143d.getLayoutParams();
        layoutParams2.width = i;
        layoutParams2.height = (layoutParams.height * 200) / 111;
        this.f6143d.setLayoutParams(layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f6140a.getLayoutParams();
        layoutParams3.height = (layoutParams.height * 48) / com.anythink.expressad.video.module.a.a.f21885Q;
        layoutParams3.bottomMargin = (this.i / com.anythink.expressad.video.module.a.a.f21888T) * 35;
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f6141b.getLayoutParams();
        int i4 = this.i;
        layoutParams4.bottomMargin = (i4 / com.anythink.expressad.video.module.a.a.f21888T) * 35;
        this.f6148j = i4 / 3;
    }

    public final void a(final View view) {
        if (this.f6146g || this.f6147h) {
            return;
        }
        this.f6146g = true;
        view.postDelayed(new Runnable() { // from class: com.anythink.basead.b.d.a.5
            @Override // java.lang.Runnable
            public final void run() {
                a.this.f6145f = ValueAnimator.ofFloat(0.0f, 720.0f);
                a.this.f6145f.setDuration(com.anythink.basead.exoplayer.i.a.f8040f);
                a.this.f6145f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.b.d.a.5.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float duration = ((valueAnimator.getDuration() * 2) - valueAnimator.getCurrentPlayTime()) / (valueAnimator.getDuration() * 2.0f);
                        double pow = Math.pow(duration, 2.0d) * Math.sin(Math.toRadians(((Float) valueAnimator.getAnimatedValue()).floatValue()));
                        view.setTranslationY(-((float) (a.this.f6148j * pow)));
                    }
                });
                if (a.this.f6145f.isStarted()) {
                    return;
                }
                a.this.f6145f.start();
            }
        }, com.anythink.basead.exoplayer.i.a.f8040f);
    }

    public final int a() {
        return this.i;
    }
}
