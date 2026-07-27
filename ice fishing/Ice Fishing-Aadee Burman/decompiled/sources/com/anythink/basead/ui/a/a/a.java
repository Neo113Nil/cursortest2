package com.anythink.basead.ui.a.a;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public abstract class a implements com.anythink.basead.ui.a.b {

    /* renamed from: a, reason: collision with root package name */
    protected View f10407a;

    /* renamed from: b, reason: collision with root package name */
    protected ValueAnimator f10408b;

    /* renamed from: c, reason: collision with root package name */
    protected int f10409c;

    /* renamed from: d, reason: collision with root package name */
    protected int f10410d;

    public a(View view) {
        this.f10407a = view;
    }

    @Override // com.anythink.basead.ui.a.b
    public void a(Canvas canvas) {
    }

    @Override // com.anythink.basead.ui.a.b
    public void b() {
        ValueAnimator valueAnimator = this.f10408b;
        if (valueAnimator != null) {
            try {
                valueAnimator.pause();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.anythink.basead.ui.a.b
    public void c() {
        ValueAnimator valueAnimator = this.f10408b;
        if (valueAnimator != null) {
            try {
                valueAnimator.resume();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.anythink.basead.ui.a.b
    public void d() {
        ValueAnimator valueAnimator = this.f10408b;
        if (valueAnimator != null) {
            try {
                valueAnimator.cancel();
                this.f10408b = null;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public ValueAnimator e() {
        return null;
    }

    public void f() {
        View view = this.f10407a;
        if (view == null) {
            return;
        }
        if (this.f10409c == 0 || this.f10410d == 0) {
            this.f10409c = view.getWidth();
            this.f10410d = this.f10407a.getHeight();
        }
    }

    @Override // com.anythink.basead.ui.a.b
    public void a(int i, int i6) {
        this.f10409c = i;
        this.f10410d = i6;
    }

    @Override // com.anythink.basead.ui.a.b
    public synchronized void a() {
        if (this.f10407a == null) {
            return;
        }
        d();
        ValueAnimator e9 = e();
        this.f10408b = e9;
        if (e9 != null) {
            this.f10407a.post(new Runnable() { // from class: com.anythink.basead.ui.a.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    ValueAnimator valueAnimator = a.this.f10408b;
                    if (valueAnimator == null || valueAnimator.isStarted()) {
                        return;
                    }
                    a.this.f();
                    try {
                        a.this.f10408b.start();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
