package com.anythink.basead.ui.a.a;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public abstract class a implements com.anythink.basead.ui.a.b {

    /* renamed from: a, reason: collision with root package name */
    protected View f10564a;

    /* renamed from: b, reason: collision with root package name */
    protected ValueAnimator f10565b;

    /* renamed from: c, reason: collision with root package name */
    protected int f10566c;

    /* renamed from: d, reason: collision with root package name */
    protected int f10567d;

    public a(View view) {
        this.f10564a = view;
    }

    @Override // com.anythink.basead.ui.a.b
    public void a(Canvas canvas) {
    }

    @Override // com.anythink.basead.ui.a.b
    public void b() {
        ValueAnimator valueAnimator = this.f10565b;
        if (valueAnimator != null) {
            try {
                valueAnimator.pause();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.anythink.basead.ui.a.b
    public void c() {
        ValueAnimator valueAnimator = this.f10565b;
        if (valueAnimator != null) {
            try {
                valueAnimator.resume();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.anythink.basead.ui.a.b
    public void d() {
        ValueAnimator valueAnimator = this.f10565b;
        if (valueAnimator != null) {
            try {
                valueAnimator.cancel();
                this.f10565b = null;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public ValueAnimator e() {
        return null;
    }

    public void f() {
        View view = this.f10564a;
        if (view == null) {
            return;
        }
        if (this.f10566c == 0 || this.f10567d == 0) {
            this.f10566c = view.getWidth();
            this.f10567d = this.f10564a.getHeight();
        }
    }

    @Override // com.anythink.basead.ui.a.b
    public void a(int i, int i4) {
        this.f10566c = i;
        this.f10567d = i4;
    }

    @Override // com.anythink.basead.ui.a.b
    public synchronized void a() {
        if (this.f10564a == null) {
            return;
        }
        d();
        ValueAnimator e6 = e();
        this.f10565b = e6;
        if (e6 != null) {
            this.f10564a.post(new Runnable() { // from class: com.anythink.basead.ui.a.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    ValueAnimator valueAnimator = a.this.f10565b;
                    if (valueAnimator == null || valueAnimator.isStarted()) {
                        return;
                    }
                    a.this.f();
                    try {
                        a.this.f10565b.start();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
