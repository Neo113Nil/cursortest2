package com.yandex.plus.home.feature.webviews.internal.utils;

import android.animation.Animator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.fwo;
import defpackage.gwo;
import defpackage.t4c;

/* loaded from: classes5.dex */
public final class b implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewPager2 b;

    public /* synthetic */ b(ViewPager2 viewPager2, int i) {
        this.a = i;
        this.b = viewPager2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                t4c t4cVar = this.b.n;
                gwo gwoVar = t4cVar.b;
                boolean z = gwoVar.m;
                if (z) {
                    if (gwoVar.f != 1 || z) {
                        gwoVar.m = false;
                        gwoVar.g();
                        fwo fwoVar = gwoVar.g;
                        if (fwoVar.c == 0) {
                            int i = fwoVar.b;
                            if (i != gwoVar.h) {
                                gwoVar.c(i);
                            }
                            gwoVar.d(0);
                            gwoVar.e();
                        } else {
                            gwoVar.d(2);
                        }
                    }
                    VelocityTracker velocityTracker = t4cVar.d;
                    velocityTracker.computeCurrentVelocity(1000, t4cVar.e);
                    if (!t4cVar.c.U((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
                        ViewPager2 viewPager2 = t4cVar.a;
                        View e = viewPager2.k.e(viewPager2.g);
                        if (e != null) {
                            int[] b = viewPager2.k.b(viewPager2.g, e);
                            int i2 = b[0];
                            if (i2 != 0 || b[1] != 0) {
                                viewPager2.j.B0(i2, b[1], false);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            default:
                t4c t4cVar = this.b.n;
                gwo gwoVar = t4cVar.b;
                if (gwoVar.f != 1) {
                    t4cVar.g = 0;
                    t4cVar.f = 0;
                    t4cVar.h = SystemClock.uptimeMillis();
                    VelocityTracker velocityTracker = t4cVar.d;
                    if (velocityTracker == null) {
                        t4cVar.d = VelocityTracker.obtain();
                        t4cVar.e = ViewConfiguration.get(t4cVar.a.getContext()).getScaledMaximumFlingVelocity();
                    } else {
                        velocityTracker.clear();
                    }
                    gwoVar.e = 4;
                    gwoVar.f(true);
                    if (gwoVar.f != 0) {
                        t4cVar.c.G0();
                    }
                    long j = t4cVar.h;
                    MotionEvent obtain = MotionEvent.obtain(j, j, 0, 0.0f, 0.0f, 0);
                    t4cVar.d.addMovement(obtain);
                    obtain.recycle();
                    break;
                }
                break;
        }
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }
}
