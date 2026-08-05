package defpackage;

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

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class zgcfmssZ extends cf0 implements Animatable {
    public final Context wxUZMvaN;
    public tef3qNMP VgvYg0wo = null;
    public ArrayList P7K7Inc8 = null;
    public final ORgMjIos b2ZJblxo = new ORgMjIos(this);
    public final arJtZsWp MdtA4re8 = new arJtZsWp();

    public zgcfmssZ(Context context) {
        this.wxUZMvaN = context;
    }

    @Override // defpackage.cf0, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        arJtZsWp arjtzswp = this.MdtA4re8;
        arjtzswp.qoPGr6Ce.draw(canvas);
        if (arjtzswp.NCTxEWno.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.NCTxEWno;
        return drawable != null ? drawable.getAlpha() : this.MdtA4re8.qoPGr6Ce.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.MdtA4re8.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.NCTxEWno;
        return drawable != null ? drawable.getColorFilter() : this.MdtA4re8.qoPGr6Ce.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.NCTxEWno != null) {
            return new j8OPu0Ny(this.NCTxEWno.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.NCTxEWno;
        return drawable != null ? drawable.getIntrinsicHeight() : this.MdtA4re8.qoPGr6Ce.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.NCTxEWno;
        return drawable != null ? drawable.getIntrinsicWidth() : this.MdtA4re8.qoPGr6Ce.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.NCTxEWno;
        return drawable != null ? drawable.getOpacity() : this.MdtA4re8.qoPGr6Ce.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        arJtZsWp arjtzswp;
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            arjtzswp = this.MdtA4re8;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray b2ZJblxo = n50.b2ZJblxo(resources, theme, attributeSet, fn.VgvYg0wo);
                    int resourceId = b2ZJblxo.getResourceId(0, 0);
                    if (resourceId != 0) {
                        lf0 lf0Var = new lf0();
                        ThreadLocal threadLocal = i30.qoPGr6Ce;
                        lf0Var.NCTxEWno = resources.getDrawable(resourceId, theme);
                        new kf0(lf0Var.NCTxEWno.getConstantState());
                        lf0Var.b2ZJblxo = false;
                        lf0Var.setCallback(this.b2ZJblxo);
                        lf0 lf0Var2 = arjtzswp.qoPGr6Ce;
                        if (lf0Var2 != null) {
                            lf0Var2.setCallback(null);
                        }
                        arjtzswp.qoPGr6Ce = lf0Var;
                    }
                    b2ZJblxo.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, fn.P7K7Inc8);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.wxUZMvaN;
                        if (context == null) {
                            obtainAttributes.recycle();
                            m1.Ey6iv0m0("Context can't be null when inflating animators");
                            return;
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(arjtzswp.qoPGr6Ce.MdtA4re8.NCTxEWno.lDXGDhIF.get(string));
                        if (arjtzswp.MdtA4re8 == null) {
                            arjtzswp.MdtA4re8 = new ArrayList();
                            arjtzswp.wxUZMvaN = new x0(0);
                        }
                        arjtzswp.MdtA4re8.add(loadAnimator);
                        arjtzswp.wxUZMvaN.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        AnimatorSet animatorSet = arjtzswp.NCTxEWno;
        if (animatorSet == null) {
            animatorSet = new AnimatorSet();
            arjtzswp.NCTxEWno = animatorSet;
        }
        animatorSet.playTogether(arjtzswp.MdtA4re8);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.NCTxEWno;
        return drawable != null ? drawable.isAutoMirrored() : this.MdtA4re8.qoPGr6Ce.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.NCTxEWno;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.MdtA4re8.NCTxEWno.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.NCTxEWno;
        return drawable != null ? drawable.isStateful() : this.MdtA4re8.qoPGr6Ce.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.MdtA4re8.qoPGr6Ce.setBounds(rect);
        }
    }

    @Override // defpackage.cf0, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.NCTxEWno;
        return drawable != null ? drawable.setLevel(i) : this.MdtA4re8.qoPGr6Ce.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.NCTxEWno;
        return drawable != null ? drawable.setState(iArr) : this.MdtA4re8.qoPGr6Ce.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.MdtA4re8.qoPGr6Ce.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.MdtA4re8.qoPGr6Ce.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.MdtA4re8.qoPGr6Ce.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.MdtA4re8.qoPGr6Ce.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.MdtA4re8.qoPGr6Ce.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.MdtA4re8.qoPGr6Ce.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.MdtA4re8.qoPGr6Ce.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        arJtZsWp arjtzswp = this.MdtA4re8;
        if (arjtzswp.NCTxEWno.isStarted()) {
            return;
        }
        arjtzswp.NCTxEWno.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.MdtA4re8.NCTxEWno.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
