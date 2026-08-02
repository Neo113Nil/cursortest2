package coil3.size;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import coil3.size.Dimension;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes3.dex */
public final class RealViewSizeResolver implements SizeResolver {
    public final View view;

    public RealViewSizeResolver(View view) {
        this.view = view;
    }

    public static Dimension getDimension(int i, int i2, int i3) {
        if (i == -2) {
            return Dimension.Undefined.INSTANCE;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            DimensionKt.Dimension(i4);
            return new Dimension.Pixels(i4);
        }
        int i5 = i2 - i3;
        if (i5 <= 0) {
            return null;
        }
        DimensionKt.Dimension(i5);
        return new Dimension.Pixels(i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RealViewSizeResolver) && Intrinsics.areEqual(this.view, ((RealViewSizeResolver) obj).view);
    }

    public final Size getSize() {
        View view = this.view;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Dimension dimension = getDimension(layoutParams != null ? layoutParams.width : -1, view.getWidth(), view.getPaddingRight() + view.getPaddingLeft());
        if (dimension == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        Dimension dimension2 = getDimension(layoutParams2 != null ? layoutParams2.height : -1, view.getHeight(), view.getPaddingBottom() + view.getPaddingTop());
        if (dimension2 == null) {
            return null;
        }
        return new Size(dimension, dimension2);
    }

    public final View getView() {
        return this.view;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.view.hashCode() * 31);
    }

    @Override // coil3.size.SizeResolver
    public final Object size(Continuation continuation) {
        Size size = getSize();
        if (size != null) {
            return size;
        }
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        cancellableContinuationImpl.initCancellability();
        final ViewTreeObserver viewTreeObserver = this.view.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: coil3.size.ViewSizeResolver$size$3$preDrawListener$1
            public boolean isResumed;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                RealViewSizeResolver realViewSizeResolver = RealViewSizeResolver.this;
                Size size2 = realViewSizeResolver.getSize();
                if (size2 != null) {
                    ViewTreeObserver viewTreeObserver2 = viewTreeObserver;
                    if (viewTreeObserver2.isAlive()) {
                        viewTreeObserver2.removeOnPreDrawListener(this);
                    } else {
                        realViewSizeResolver.view.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                    if (!this.isResumed) {
                        this.isResumed = true;
                        Result.Companion companion = Result.Companion;
                        cancellableContinuationImpl.resumeWith(size2);
                    }
                }
                return true;
            }
        };
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        cancellableContinuationImpl.invokeOnCancellation(new ViewSizeResolver$size$3$1(0, this, viewTreeObserver, onPreDrawListener));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public final String toString() {
        return "RealViewSizeResolver(view=" + this.view + ", subtractPadding=true)";
    }
}
