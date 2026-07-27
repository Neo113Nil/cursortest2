package E0;

import F.q;
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
public final class f extends g implements Animatable {

    /* renamed from: v, reason: collision with root package name */
    public final Context f666v;

    /* renamed from: w, reason: collision with root package name */
    public D0.k f667w = null;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f668x = null;

    /* renamed from: y, reason: collision with root package name */
    public final c f669y = new c(this);

    /* renamed from: u, reason: collision with root package name */
    public final d f665u = new d();

    public f(Context context) {
        this.f666v = context;
    }

    @Override // E0.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            H.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            return H.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f665u;
        dVar.f659a.draw(canvas);
        if (dVar.f660b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f670n;
        return drawable != null ? drawable.getAlpha() : this.f665u.f659a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f665u.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f670n;
        return drawable != null ? H.a.c(drawable) : this.f665u.f659a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f670n == null) {
            return null;
        }
        return new e(0, this.f670n.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f670n;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f665u.f659a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f670n;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f665u.f659a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f670n;
        return drawable != null ? drawable.getOpacity() : this.f665u.f659a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        d dVar;
        Drawable drawable = this.f670n;
        if (drawable != null) {
            H.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            dVar = this.f665u;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f3 = F.b.f(resources, theme, attributeSet, a.f655e);
                    int resourceId = f3.getResourceId(0, 0);
                    if (resourceId != 0) {
                        p pVar = new p();
                        ThreadLocal threadLocal = q.f879a;
                        pVar.f670n = F.j.a(resources, resourceId, theme);
                        new o(pVar.f670n.getConstantState());
                        pVar.f728y = false;
                        pVar.setCallback(this.f669y);
                        p pVar2 = dVar.f659a;
                        if (pVar2 != null) {
                            pVar2.setCallback(null);
                        }
                        dVar.f659a = pVar;
                    }
                    f3.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f656f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f666v;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(dVar.f659a.f724u.f710b.f708o.getOrDefault(string, null));
                        if (dVar.f661c == null) {
                            dVar.f661c = new ArrayList();
                            dVar.f662d = new s.b();
                        }
                        dVar.f661c.add(loadAnimator);
                        dVar.f662d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (dVar.f660b == null) {
            dVar.f660b = new AnimatorSet();
        }
        dVar.f660b.playTogether(dVar.f661c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f670n;
        return drawable != null ? drawable.isAutoMirrored() : this.f665u.f659a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f670n;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f665u.f660b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f670n;
        return drawable != null ? drawable.isStateful() : this.f665u.f659a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f665u.f659a.setBounds(rect);
        }
    }

    @Override // E0.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f670n;
        return drawable != null ? drawable.setLevel(i) : this.f665u.f659a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f670n;
        return drawable != null ? drawable.setState(iArr) : this.f665u.f659a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f665u.f659a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            drawable.setAutoMirrored(z3);
        } else {
            this.f665u.f659a.setAutoMirrored(z3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f665u.f659a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            com.bumptech.glide.e.h(drawable, i);
        } else {
            this.f665u.f659a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            H.a.h(drawable, colorStateList);
        } else {
            this.f665u.f659a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            H.a.i(drawable, mode);
        } else {
            this.f665u.f659a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z6) {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            return drawable.setVisible(z3, z6);
        }
        this.f665u.f659a.setVisible(z3, z6);
        return super.setVisible(z3, z6);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f665u;
        if (dVar.f660b.isStarted()) {
            return;
        }
        dVar.f660b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f665u.f660b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
