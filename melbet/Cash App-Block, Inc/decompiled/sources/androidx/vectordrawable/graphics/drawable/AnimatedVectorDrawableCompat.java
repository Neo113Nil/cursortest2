package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.collection.ArrayMap;
import androidx.core.content.res.ResourcesCompat;
import androidx.transition.Transition;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback.AnonymousClass1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class AnimatedVectorDrawableCompat extends VectorDrawableCommon implements Animatable {
    public final Context mContext;
    public Transition.AnonymousClass3 mAnimatorListener = null;
    public ArrayList mAnimationCallbacks = null;
    public final AnonymousClass1 mCallback = new Drawable.Callback() { // from class: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.1
        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            AnimatedVectorDrawableCompat.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            AnimatedVectorDrawableCompat.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            AnimatedVectorDrawableCompat.this.unscheduleSelf(runnable);
        }
    };
    public final AnimatedVectorDrawableCompatState mAnimatedVectorState = new AnimatedVectorDrawableCompatState();

    public abstract class Api23Impl {
        public static void clearAnimationCallbacks(Object obj) {
            ((AnimatedVectorDrawable) obj).clearAnimationCallbacks();
        }

        public static void registerAnimationCallback(Object obj, Object obj2) {
            ((AnimatedVectorDrawable) obj).registerAnimationCallback((Animatable2.AnimationCallback) obj2);
        }

        public static boolean unregisterAnimationCallback(Object obj, Object obj2) {
            return ((AnimatedVectorDrawable) obj).unregisterAnimationCallback((Animatable2.AnimationCallback) obj2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$1] */
    public AnimatedVectorDrawableCompat(Context context) {
        this.mContext = context;
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState = this.mAnimatedVectorState;
        animatedVectorDrawableCompatState.mVectorDrawable.draw(canvas);
        if (animatedVectorDrawableCompatState.mAnimatorSet.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.getAlpha() : this.mAnimatedVectorState.mVectorDrawable.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.mAnimatedVectorState.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.getColorFilter() : this.mAnimatedVectorState.mVectorDrawable.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.mDelegateDrawable != null) {
            return new GifDrawable.GifState(this.mDelegateDrawable.getConstantState(), 1);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.getIntrinsicHeight() : this.mAnimatedVectorState.mVectorDrawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.getIntrinsicWidth() : this.mAnimatedVectorState.mVectorDrawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.getOpacity() : this.mAnimatedVectorState.mVectorDrawable.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bc, code lost:
    
        if (r3.mAnimatorSet != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00be, code lost:
    
        r3.mAnimatorSet = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c5, code lost:
    
        r3.mAnimatorSet.playTogether(r3.mAnimators);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cc, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState = this.mAnimatedVectorState;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray obtainAttributes = DimensionKt.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_ANIMATED_VECTOR_DRAWABLE);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
                        vectorDrawableCompat.mDelegateDrawable = ResourcesCompat.getDrawable(resources, resourceId, theme);
                        vectorDrawableCompat.mAllowCaching = false;
                        vectorDrawableCompat.setCallback(this.mCallback);
                        VectorDrawableCompat vectorDrawableCompat2 = animatedVectorDrawableCompatState.mVectorDrawable;
                        if (vectorDrawableCompat2 != null) {
                            vectorDrawableCompat2.setCallback(null);
                        }
                        animatedVectorDrawableCompatState.mVectorDrawable = vectorDrawableCompat;
                    }
                    obtainAttributes.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(attributeSet, AndroidResources.STYLEABLE_ANIMATED_VECTOR_DRAWABLE_TARGET);
                    String string2 = obtainAttributes2.getString(0);
                    int resourceId2 = obtainAttributes2.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.mContext;
                        if (context == null) {
                            obtainAttributes2.recycle();
                            a$$ExternalSyntheticBUOutline0.m$1("Context can't be null when inflating animators");
                            return;
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(animatedVectorDrawableCompatState.mVectorDrawable.mVectorState.mVPathRenderer.mVGTargetsMap.get(string2));
                        if (animatedVectorDrawableCompatState.mAnimators == null) {
                            animatedVectorDrawableCompatState.mAnimators = new ArrayList();
                            animatedVectorDrawableCompatState.mTargetNameMap = new ArrayMap(0);
                        }
                        animatedVectorDrawableCompatState.mAnimators.add(loadAnimator);
                        animatedVectorDrawableCompatState.mTargetNameMap.put(loadAnimator, string2);
                    }
                    obtainAttributes2.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.isAutoMirrored() : this.mAnimatedVectorState.mVectorDrawable.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.mAnimatedVectorState.mAnimatorSet.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.isStateful() : this.mAnimatedVectorState.mVectorDrawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.mAnimatedVectorState.mVectorDrawable.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.setLevel(i) : this.mAnimatedVectorState.mVectorDrawable.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.mDelegateDrawable;
        return drawable != null ? drawable.setState(iArr) : this.mAnimatedVectorState.mVectorDrawable.setState(iArr);
    }

    public final void registerAnimationCallback(Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback) {
        if (animatable2Compat$AnimationCallback == null) {
            return;
        }
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            if (animatable2Compat$AnimationCallback.mPlatformCallback == null) {
                animatable2Compat$AnimationCallback.mPlatformCallback = animatable2Compat$AnimationCallback.new AnonymousClass1();
            }
            Api23Impl.registerAnimationCallback(animatedVectorDrawable, animatable2Compat$AnimationCallback.mPlatformCallback);
            return;
        }
        if (this.mAnimationCallbacks == null) {
            this.mAnimationCallbacks = new ArrayList();
        }
        if (this.mAnimationCallbacks.contains(animatable2Compat$AnimationCallback)) {
            return;
        }
        this.mAnimationCallbacks.add(animatable2Compat$AnimationCallback);
        if (this.mAnimatorListener == null) {
            this.mAnimatorListener = new Transition.AnonymousClass3(this, 2);
        }
        this.mAnimatedVectorState.mAnimatorSet.addListener(this.mAnimatorListener);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.mAnimatedVectorState.mVectorDrawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.mAnimatedVectorState.mVectorDrawable.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.mAnimatedVectorState.mVectorDrawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.mAnimatedVectorState.mVectorDrawable.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.mAnimatedVectorState.mVectorDrawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.mAnimatedVectorState.mVectorDrawable.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.mAnimatedVectorState.mVectorDrawable.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState = this.mAnimatedVectorState;
        if (animatedVectorDrawableCompatState.mAnimatorSet.isStarted()) {
            return;
        }
        animatedVectorDrawableCompatState.mAnimatorSet.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.mDelegateDrawable;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.mAnimatedVectorState.mAnimatorSet.end();
        }
    }

    public final class AnimatedVectorDrawableCompatState extends Drawable.ConstantState {
        public AnimatorSet mAnimatorSet;
        public ArrayList mAnimators;
        public ArrayMap mTargetNameMap;
        public VectorDrawableCompat mVectorDrawable;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
