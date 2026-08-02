package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public abstract class Animatable2Compat$AnimationCallback {
    public AnonymousClass1 mPlatformCallback;

    /* renamed from: androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback$1, reason: invalid class name */
    public final class AnonymousClass1 extends Animatable2.AnimationCallback {
        public AnonymousClass1() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public final void onAnimationEnd(Drawable drawable) {
            Animatable2Compat$AnimationCallback.this.onAnimationEnd(drawable);
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public final void onAnimationStart(Drawable drawable) {
            Animatable2Compat$AnimationCallback.this.onAnimationStart(drawable);
        }
    }

    public abstract void onAnimationEnd(Drawable drawable);

    public void onAnimationStart(Drawable drawable) {
    }
}
