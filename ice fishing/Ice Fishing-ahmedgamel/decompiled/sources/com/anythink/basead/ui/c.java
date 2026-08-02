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
    private ViewGroup f11390a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f11391b;

    /* renamed from: c, reason: collision with root package name */
    private int f11392c;

    /* renamed from: com.anythink.basead.ui.c$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (c.this.f11390a instanceof RelativeLayout) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(c.this.f11392c, c.this.f11392c);
                    layoutParams.addRule(13);
                    c.this.f11390a.addView(c.this.f11391b, layoutParams);
                } else if (c.this.f11390a instanceof FrameLayout) {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(c.this.f11392c, c.this.f11392c);
                    layoutParams2.gravity = 17;
                    c.this.f11390a.addView(c.this.f11391b, layoutParams2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public c(ViewGroup viewGroup) {
        this.f11390a = viewGroup;
        ImageView imageView = new ImageView(this.f11390a.getContext());
        this.f11391b = imageView;
        imageView.setId(q.a(this.f11390a.getContext(), "myoffer_loading_id", "id"));
        this.f11391b.setImageResource(q.a(this.f11390a.getContext(), "myoffer_loading", k.f20419c));
        this.f11392c = (int) TypedValue.applyDimension(1, 50.0f, this.f11390a.getResources().getDisplayMetrics());
    }

    private void d() {
        ImageView imageView = this.f11391b;
        if (imageView != null) {
            this.f11390a.removeView(imageView);
        }
        this.f11390a.post(new AnonymousClass1());
    }

    public final void a() {
        this.f11392c = (int) TypedValue.applyDimension(1, 30.0f, this.f11390a.getResources().getDisplayMetrics());
    }

    public final void b() {
        ImageView imageView = this.f11391b;
        if (imageView != null) {
            this.f11390a.removeView(imageView);
        }
        this.f11390a.post(new AnonymousClass1());
        this.f11391b.post(new Runnable() { // from class: com.anythink.basead.ui.c.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    c.this.f11391b.setAlpha(1.0f);
                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -360.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setDuration(1000L);
                    rotateAnimation.setInterpolator(new LinearInterpolator());
                    rotateAnimation.setRepeatCount(-1);
                    c.this.f11391b.startAnimation(rotateAnimation);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public final void c() {
        if (this.f11391b != null) {
            this.f11390a.post(new Runnable() { // from class: com.anythink.basead.ui.c.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        c.this.f11391b.clearAnimation();
                        c.this.f11391b.setAlpha(0.0f);
                        c.this.f11390a.removeView(c.this.f11391b);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
