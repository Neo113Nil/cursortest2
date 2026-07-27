package androidx.fragment.app;

import O.ViewTreeObserverOnPreDrawListenerC0348x;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: androidx.fragment.app.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0481y extends AnimationSet implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final ViewGroup f5080n;

    /* renamed from: u, reason: collision with root package name */
    public final View f5081u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5082v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5083w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5084x;

    public RunnableC0481y(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f5084x = true;
        this.f5080n = viewGroup;
        this.f5081u = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j6, Transformation transformation) {
        this.f5084x = true;
        if (this.f5082v) {
            return !this.f5083w;
        }
        if (!super.getTransformation(j6, transformation)) {
            this.f5082v = true;
            ViewTreeObserverOnPreDrawListenerC0348x.a(this.f5080n, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3 = this.f5082v;
        ViewGroup viewGroup = this.f5080n;
        if (z3 || !this.f5084x) {
            viewGroup.endViewTransition(this.f5081u);
            this.f5083w = true;
        } else {
            this.f5084x = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j6, Transformation transformation, float f3) {
        this.f5084x = true;
        if (this.f5082v) {
            return !this.f5083w;
        }
        if (!super.getTransformation(j6, transformation, f3)) {
            this.f5082v = true;
            ViewTreeObserverOnPreDrawListenerC0348x.a(this.f5080n, this);
        }
        return true;
    }
}
