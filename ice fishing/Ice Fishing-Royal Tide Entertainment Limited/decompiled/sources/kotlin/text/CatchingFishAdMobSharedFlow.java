package kotlin.text;

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
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class CatchingFishAdMobSharedFlow extends CatchingFishKtorMVVMFAB implements Animatable {
    public final Context CatchingFishWorkManager;
    public CatchingFishStateLiveData CatchingFishViewModelScope = null;
    public ArrayList CatchingFishViewModelFAB = null;
    public final CatchingFishMoshiBiometric CatchingFishLayout = new CatchingFishMoshiBiometric(this);
    public final CatchingFishBundleFlux CatchingFishDaggerWebsocket = new CatchingFishBundleFlux();

    public CatchingFishAdMobSharedFlow(Context context, int i) {
        this.CatchingFishWorkManager = context;
    }

    @Override // kotlin.text.CatchingFishKtorMVVMFAB, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        CatchingFishBundleFlux catchingFishBundleFlux = this.CatchingFishDaggerWebsocket;
        catchingFishBundleFlux.CatchingFishParcelableFAB.draw(canvas);
        if (catchingFishBundleFlux.CatchingFishSnackbar.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.CatchingFishReduxKtor;
        return drawable != null ? drawable.getAlpha() : this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.CatchingFishDaggerWebsocket.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.CatchingFishReduxKtor;
        return drawable != null ? drawable.getColorFilter() : this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.CatchingFishReduxKtor != null) {
            return new CatchingFishServiceMVP(this.CatchingFishReduxKtor.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.CatchingFishReduxKtor;
        return drawable != null ? drawable.getIntrinsicHeight() : this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.CatchingFishReduxKtor;
        return drawable != null ? drawable.getIntrinsicWidth() : this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.CatchingFishReduxKtor;
        return drawable != null ? drawable.getOpacity() : this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        CatchingFishBundleFlux catchingFishBundleFlux;
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            catchingFishBundleFlux = this.CatchingFishDaggerWebsocket;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray CatchingFish = CatchingFishViewMVIMVVM.CatchingFish(resources, theme, attributeSet, CatchingFishGsonCardView.CatchingFishViewModelScope);
                    int resourceId = CatchingFish.getResourceId(0, 0);
                    if (resourceId != 0) {
                        CatchingFishPayPalRoomFlux catchingFishPayPalRoomFlux = new CatchingFishPayPalRoomFlux();
                        ThreadLocal threadLocal = CatchingFishFABAsyncTask.CatchingFishParcelableFAB;
                        catchingFishPayPalRoomFlux.CatchingFishReduxKtor = resources.getDrawable(resourceId, theme);
                        new CatchingFishIntentToolbar(catchingFishPayPalRoomFlux.CatchingFishReduxKtor.getConstantState());
                        catchingFishPayPalRoomFlux.CatchingFishLayout = false;
                        catchingFishPayPalRoomFlux.setCallback(this.CatchingFishLayout);
                        CatchingFishPayPalRoomFlux catchingFishPayPalRoomFlux2 = catchingFishBundleFlux.CatchingFishParcelableFAB;
                        if (catchingFishPayPalRoomFlux2 != null) {
                            catchingFishPayPalRoomFlux2.setCallback(null);
                        }
                        catchingFishBundleFlux.CatchingFishParcelableFAB = catchingFishPayPalRoomFlux;
                    }
                    CatchingFish.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, CatchingFishGsonCardView.CatchingFishViewModelFAB);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.CatchingFishWorkManager;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(catchingFishBundleFlux.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket.CatchingFishSnackbar.CatchingFishAnimationMockk.get(string));
                        if (catchingFishBundleFlux.CatchingFishCoroutine == null) {
                            catchingFishBundleFlux.CatchingFishCoroutine = new ArrayList();
                            catchingFishBundleFlux.CatchingFishReduxKtor = new CatchingFishCameraXRetrofit(0);
                        }
                        catchingFishBundleFlux.CatchingFishCoroutine.add(loadAnimator);
                        catchingFishBundleFlux.CatchingFishReduxKtor.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (catchingFishBundleFlux.CatchingFishSnackbar == null) {
            catchingFishBundleFlux.CatchingFishSnackbar = new AnimatorSet();
        }
        catchingFishBundleFlux.CatchingFishSnackbar.playTogether(catchingFishBundleFlux.CatchingFishCoroutine);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.CatchingFishReduxKtor;
        return drawable != null ? drawable.isAutoMirrored() : this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.CatchingFishReduxKtor;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.CatchingFishDaggerWebsocket.CatchingFishSnackbar.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.CatchingFishReduxKtor;
        return drawable != null ? drawable.isStateful() : this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.setBounds(rect);
        }
    }

    @Override // kotlin.text.CatchingFishKtorMVVMFAB, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.CatchingFishReduxKtor;
        return drawable != null ? drawable.setLevel(i) : this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.CatchingFishReduxKtor;
        return drawable != null ? drawable.setState(iArr) : this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        CatchingFishBundleFlux catchingFishBundleFlux = this.CatchingFishDaggerWebsocket;
        if (catchingFishBundleFlux.CatchingFishSnackbar.isStarted()) {
            return;
        }
        catchingFishBundleFlux.CatchingFishSnackbar.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.CatchingFishReduxKtor;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.CatchingFishDaggerWebsocket.CatchingFishSnackbar.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
