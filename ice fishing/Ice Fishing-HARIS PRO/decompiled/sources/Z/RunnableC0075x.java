package Z;

import O.ViewTreeObserverOnPreDrawListenerC0041q;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: Z.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0075x extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1632a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1633b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1634c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1635d;
    public boolean e;

    public RunnableC0075x(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.e = true;
        this.f1632a = viewGroup;
        this.f1633b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.e = true;
        if (this.f1634c) {
            return !this.f1635d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f1634c = true;
            ViewTreeObserverOnPreDrawListenerC0041q.a(this.f1632a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f1634c;
        ViewGroup viewGroup = this.f1632a;
        if (z2 || !this.e) {
            viewGroup.endViewTransition(this.f1633b);
            this.f1635d = true;
        } else {
            this.e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f2) {
        this.e = true;
        if (this.f1634c) {
            return !this.f1635d;
        }
        if (!super.getTransformation(j, transformation, f2)) {
            this.f1634c = true;
            ViewTreeObserverOnPreDrawListenerC0041q.a(this.f1632a, this);
        }
        return true;
    }
}
