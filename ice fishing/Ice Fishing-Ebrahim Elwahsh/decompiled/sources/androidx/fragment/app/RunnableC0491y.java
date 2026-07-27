package androidx.fragment.app;

import O.ViewTreeObserverOnPreDrawListenerC0361x;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: androidx.fragment.app.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0491y extends AnimationSet implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final ViewGroup f5192n;

    /* renamed from: u, reason: collision with root package name */
    public final View f5193u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5194v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5195w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5196x;

    public RunnableC0491y(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f5196x = true;
        this.f5192n = viewGroup;
        this.f5193u = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j9, Transformation transformation) {
        this.f5196x = true;
        if (this.f5194v) {
            return !this.f5195w;
        }
        if (!super.getTransformation(j9, transformation)) {
            this.f5194v = true;
            ViewTreeObserverOnPreDrawListenerC0361x.a(this.f5192n, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8 = this.f5194v;
        ViewGroup viewGroup = this.f5192n;
        if (z8 || !this.f5196x) {
            viewGroup.endViewTransition(this.f5193u);
            this.f5195w = true;
        } else {
            this.f5196x = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j9, Transformation transformation, float f6) {
        this.f5196x = true;
        if (this.f5194v) {
            return !this.f5195w;
        }
        if (!super.getTransformation(j9, transformation, f6)) {
            this.f5194v = true;
            ViewTreeObserverOnPreDrawListenerC0361x.a(this.f5192n, this);
        }
        return true;
    }
}
