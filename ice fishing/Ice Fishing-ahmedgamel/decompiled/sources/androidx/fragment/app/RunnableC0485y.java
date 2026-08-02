package androidx.fragment.app;

import O.ViewTreeObserverOnPreDrawListenerC0353x;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: androidx.fragment.app.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0485y extends AnimationSet implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final ViewGroup f5047n;

    /* renamed from: u, reason: collision with root package name */
    public final View f5048u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5049v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5050w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5051x;

    public RunnableC0485y(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f5051x = true;
        this.f5047n = viewGroup;
        this.f5048u = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j6, Transformation transformation) {
        this.f5051x = true;
        if (this.f5049v) {
            return !this.f5050w;
        }
        if (!super.getTransformation(j6, transformation)) {
            this.f5049v = true;
            ViewTreeObserverOnPreDrawListenerC0353x.a(this.f5047n, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6 = this.f5049v;
        ViewGroup viewGroup = this.f5047n;
        if (z6 || !this.f5051x) {
            viewGroup.endViewTransition(this.f5048u);
            this.f5050w = true;
        } else {
            this.f5051x = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j6, Transformation transformation, float f2) {
        this.f5051x = true;
        if (this.f5049v) {
            return !this.f5050w;
        }
        if (!super.getTransformation(j6, transformation, f2)) {
            this.f5049v = true;
            ViewTreeObserverOnPreDrawListenerC0353x.a(this.f5047n, this);
        }
        return true;
    }
}
