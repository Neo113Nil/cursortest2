package q0;

import a.AbstractC0078a;
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
import r.C0338f;

/* loaded from: classes.dex */
public final class f extends g implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    public final Context f4246c;

    /* renamed from: d, reason: collision with root package name */
    public B0.c f4247d = null;
    public ArrayList e = null;

    /* renamed from: f, reason: collision with root package name */
    public final c f4248f = new c(this);

    /* renamed from: b, reason: collision with root package name */
    public final d f4245b = new d();

    public f(Context context) {
        this.f4246c = context;
    }

    @Override // q0.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f4245b;
        dVar.f4240a.draw(canvas);
        if (dVar.f4241b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f4249a;
        return drawable != null ? drawable.getAlpha() : this.f4245b.f4240a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f4245b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f4249a;
        return drawable != null ? drawable.getColorFilter() : this.f4245b.f4240a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f4249a != null) {
            return new e(this.f4249a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f4249a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f4245b.f4240a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f4249a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f4245b.f4240a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4249a;
        return drawable != null ? drawable.getOpacity() : this.f4245b.f4240a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        d dVar;
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            dVar = this.f4245b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f2 = F.b.f(resources, theme, attributeSet, AbstractC0332a.e);
                    int resourceId = f2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        p pVar = new p();
                        ThreadLocal threadLocal = F.o.f221a;
                        pVar.f4249a = resources.getDrawable(resourceId, theme);
                        new o(pVar.f4249a.getConstantState());
                        pVar.f4295f = false;
                        pVar.setCallback(this.f4248f);
                        p pVar2 = dVar.f4240a;
                        if (pVar2 != null) {
                            pVar2.setCallback(null);
                        }
                        dVar.f4240a = pVar;
                    }
                    f2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC0332a.f4237f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f4246c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(dVar.f4240a.f4292b.f4283b.f4281o.get(string));
                        if (dVar.f4242c == null) {
                            dVar.f4242c = new ArrayList();
                            dVar.f4243d = new C0338f(0);
                        }
                        dVar.f4242c.add(loadAnimator);
                        dVar.f4243d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (dVar.f4241b == null) {
            dVar.f4241b = new AnimatorSet();
        }
        dVar.f4241b.playTogether(dVar.f4242c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f4249a;
        return drawable != null ? drawable.isAutoMirrored() : this.f4245b.f4240a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f4249a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f4245b.f4241b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f4249a;
        return drawable != null ? drawable.isStateful() : this.f4245b.f4240a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4245b.f4240a.setBounds(rect);
        }
    }

    @Override // q0.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f4249a;
        return drawable != null ? drawable.setLevel(i) : this.f4245b.f4240a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4249a;
        return drawable != null ? drawable.setState(iArr) : this.f4245b.f4240a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f4245b.f4240a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f4245b.f4240a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4245b.f4240a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            AbstractC0078a.d0(drawable, i);
        } else {
            this.f4245b.f4240a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f4245b.f4240a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f4245b.f4240a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f4245b.f4240a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f4245b;
        if (dVar.f4241b.isStarted()) {
            return;
        }
        dVar.f4241b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4245b.f4241b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
