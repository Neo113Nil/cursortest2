package com.anythink.basead.ui;

import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private ViewGroup f10761a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f10762b;

    /* renamed from: c, reason: collision with root package name */
    private int f10763c;

    /* renamed from: com.anythink.basead.ui.c$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (c.this.f10761a instanceof RelativeLayout) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(c.this.f10763c, c.this.f10763c);
                    layoutParams.addRule(13);
                    c.this.f10761a.addView(c.this.f10762b, layoutParams);
                } else if (c.this.f10761a instanceof FrameLayout) {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(c.this.f10763c, c.this.f10763c);
                    layoutParams2.gravity = 17;
                    c.this.f10761a.addView(c.this.f10762b, layoutParams2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public c(ViewGroup viewGroup) {
        this.f10761a = viewGroup;
        ImageView imageView = new ImageView(this.f10761a.getContext());
        this.f10762b = imageView;
        imageView.setId(q.a(this.f10761a.getContext(), "myoffer_loading_id", "id"));
        this.f10762b.setImageResource(q.a(this.f10761a.getContext(), "myoffer_loading", k.f19790c));
        this.f10763c = (int) TypedValue.applyDimension(1, 50.0f, this.f10761a.getResources().getDisplayMetrics());
    }

    private void d() {
        ImageView imageView = this.f10762b;
        if (imageView != null) {
            this.f10761a.removeView(imageView);
        }
        this.f10761a.post(new AnonymousClass1());
    }

    public final void a() {
        this.f10763c = (int) TypedValue.applyDimension(1, 30.0f, this.f10761a.getResources().getDisplayMetrics());
    }

    public final void b() {
        ImageView imageView = this.f10762b;
        if (imageView != null) {
            this.f10761a.removeView(imageView);
        }
        this.f10761a.post(new AnonymousClass1());
        this.f10762b.post(new Runnable() { // from class: com.anythink.basead.ui.c.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    c.this.f10762b.setAlpha(1.0f);
                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -360.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setDuration(1000L);
                    rotateAnimation.setInterpolator(new LinearInterpolator());
                    rotateAnimation.setRepeatCount(-1);
                    c.this.f10762b.startAnimation(rotateAnimation);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public final void c() {
        if (this.f10762b != null) {
            this.f10761a.post(new Runnable() { // from class: com.anythink.basead.ui.c.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        c.this.f10762b.clearAnimation();
                        c.this.f10762b.setAlpha(0.0f);
                        c.this.f10761a.removeView(c.this.f10762b);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
