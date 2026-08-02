package com.anythink.basead.ui.a.a;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public abstract class a implements com.anythink.basead.ui.a.b {

    /* renamed from: a, reason: collision with root package name */
    protected View f11193a;

    /* renamed from: b, reason: collision with root package name */
    protected ValueAnimator f11194b;

    /* renamed from: c, reason: collision with root package name */
    protected int f11195c;

    /* renamed from: d, reason: collision with root package name */
    protected int f11196d;

    public a(View view) {
        this.f11193a = view;
    }

    @Override // com.anythink.basead.ui.a.b
    public void a(Canvas canvas) {
    }

    @Override // com.anythink.basead.ui.a.b
    public void b() {
        ValueAnimator valueAnimator = this.f11194b;
        if (valueAnimator != null) {
            try {
                valueAnimator.pause();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.anythink.basead.ui.a.b
    public void c() {
        ValueAnimator valueAnimator = this.f11194b;
        if (valueAnimator != null) {
            try {
                valueAnimator.resume();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.anythink.basead.ui.a.b
    public void d() {
        ValueAnimator valueAnimator = this.f11194b;
        if (valueAnimator != null) {
            try {
                valueAnimator.cancel();
                this.f11194b = null;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public ValueAnimator e() {
        return null;
    }

    public void f() {
        View view = this.f11193a;
        if (view == null) {
            return;
        }
        if (this.f11195c == 0 || this.f11196d == 0) {
            this.f11195c = view.getWidth();
            this.f11196d = this.f11193a.getHeight();
        }
    }

    @Override // com.anythink.basead.ui.a.b
    public void a(int i, int i4) {
        this.f11195c = i;
        this.f11196d = i4;
    }

    @Override // com.anythink.basead.ui.a.b
    public synchronized void a() {
        if (this.f11193a == null) {
            return;
        }
        d();
        ValueAnimator e9 = e();
        this.f11194b = e9;
        if (e9 != null) {
            this.f11193a.post(new Runnable() { // from class: com.anythink.basead.ui.a.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    ValueAnimator valueAnimator = a.this.f11194b;
                    if (valueAnimator == null || valueAnimator.isStarted()) {
                        return;
                    }
                    a.this.f();
                    try {
                        a.this.f11194b.start();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
