package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.StateSet;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class ger extends Drawable implements Drawable.Callback {
    public fer a;
    public Rect b;
    public Drawable c;
    public Drawable d;
    public boolean f;
    public boolean h;
    public q9 i;
    public long j;
    public long k;
    public ml0 l;
    public fer m;
    public boolean n;
    public int e = KotlinVersion.MAX_COMPONENT_VALUE;
    public int g = -1;

    public ger(fer ferVar, Resources resources) {
        fer ferVar2 = new fer(ferVar, this, resources);
        this.a = ferVar2;
        int i = this.g;
        if (i >= 0) {
            Drawable b = ferVar2.b(i);
            this.c = b;
            if (b != null) {
                d(b);
            }
        }
        this.d = null;
        this.m = ferVar2;
        onStateChange(getState());
    }

    public final void a(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            fer ferVar = this.m;
            int i = ferVar.h;
            Drawable[] drawableArr = ferVar.g;
            if (i >= drawableArr.length) {
                int i2 = i + 10;
                Drawable[] drawableArr2 = new Drawable[i2];
                System.arraycopy(drawableArr, 0, drawableArr2, 0, i);
                ferVar.g = drawableArr2;
                int[][] iArr2 = new int[i2][];
                System.arraycopy(ferVar.D, 0, iArr2, 0, i);
                ferVar.D = iArr2;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(ferVar.a);
            ferVar.g[i] = drawable;
            ferVar.h++;
            ferVar.e = drawable.getChangingConfigurations() | ferVar.e;
            ferVar.p = false;
            ferVar.r = false;
            ferVar.j = null;
            ferVar.i = false;
            ferVar.k = false;
            ferVar.s = false;
            ferVar.D[i] = iArr;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        c(theme);
        onStateChange(getState());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z) {
        boolean z2;
        Drawable drawable;
        boolean z3 = true;
        this.f = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            long j = this.j;
            if (j != 0) {
                if (j > uptimeMillis) {
                    this.a.getClass();
                    drawable2.setAlpha(((255 - (((int) ((j - uptimeMillis) * 255)) / 0)) * this.e) / KotlinVersion.MAX_COMPONENT_VALUE);
                    z2 = true;
                    drawable = this.d;
                    if (drawable == null) {
                        long j2 = this.k;
                        if (j2 != 0) {
                            if (j2 > uptimeMillis) {
                                this.a.getClass();
                                drawable.setAlpha(((((int) ((j2 - uptimeMillis) * 255)) / 0) * this.e) / KotlinVersion.MAX_COMPONENT_VALUE);
                                if (z && z3) {
                                    scheduleSelf(this.i, uptimeMillis + 16);
                                    return;
                                }
                                return;
                            }
                            drawable.setVisible(false, false);
                            this.d = null;
                            this.k = 0L;
                        }
                    } else {
                        this.k = 0L;
                    }
                    z3 = z2;
                    if (z) {
                        return;
                    } else {
                        return;
                    }
                }
                drawable2.setAlpha(this.e);
                this.j = 0L;
            }
        } else {
            this.j = 0L;
        }
        z2 = false;
        drawable = this.d;
        if (drawable == null) {
        }
        z3 = z2;
        if (z) {
        }
    }

    public final void c(Resources.Theme theme) {
        fer ferVar = this.a;
        if (theme == null) {
            ferVar.getClass();
            return;
        }
        ferVar.a();
        int i = ferVar.h;
        Drawable[] drawableArr = ferVar.g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i2].applyTheme(theme);
                ferVar.e |= drawableArr[i2].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            ferVar.b = resources;
            int i3 = resources.getDisplayMetrics().densityDpi;
            if (i3 == 0) {
                i3 = 160;
            }
            int i4 = ferVar.c;
            ferVar.c = i3;
            if (i4 != i3) {
                ferVar.k = false;
                ferVar.i = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.l == null) {
            this.l = new ml0();
        }
        ml0 ml0Var = this.l;
        ml0Var.b = drawable.getCallback();
        drawable.setCallback(ml0Var);
        try {
            this.a.getClass();
            if (this.f) {
                drawable.setAlpha(this.e);
            }
            fer ferVar = this.a;
            if (ferVar.y) {
                drawable.setColorFilter(ferVar.x);
            } else {
                if (ferVar.B) {
                    drawable.setTintList(ferVar.z);
                }
                fer ferVar2 = this.a;
                if (ferVar2.C) {
                    drawable.setTintMode(ferVar2.A);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.a.u);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.a.w);
            Rect rect = this.b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            ml0 ml0Var2 = this.l;
            Drawable.Callback callback = (Drawable.Callback) ml0Var2.b;
            ml0Var2.b = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            ml0 ml0Var3 = this.l;
            Drawable.Callback callback2 = (Drawable.Callback) ml0Var3.b;
            ml0Var3.b = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final Drawable e() {
        if (!this.h && super.mutate() == this) {
            fer ferVar = new fer(this.m, this, null);
            ferVar.c();
            this.a = ferVar;
            int i = this.g;
            if (i >= 0) {
                Drawable b = ferVar.b(i);
                this.c = b;
                if (b != null) {
                    d(b);
                }
            }
            this.d = null;
            this.m = ferVar;
            this.h = true;
        }
        return this;
    }

    public final boolean f(int[] iArr) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        fer ferVar = this.a;
        if (!ferVar.s) {
            ferVar.a();
            ferVar.s = true;
            int i = ferVar.h;
            Drawable[] drawableArr = ferVar.g;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    ferVar.t = true;
                    z = true;
                    break;
                }
                if (drawableArr[i2].getConstantState() == null) {
                    ferVar.t = false;
                    z = false;
                    break;
                }
                i2++;
            }
        } else {
            z = ferVar.t;
        }
        if (!z) {
            return null;
        }
        this.a.d = getChangingConfigurations();
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        this.a.getClass();
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.a.getClass();
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        this.a.getClass();
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        this.a.getClass();
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.c;
        if (drawable != null && drawable.isVisible()) {
            fer ferVar = this.a;
            if (ferVar.p) {
                return ferVar.q;
            }
            ferVar.a();
            int i = ferVar.h;
            Drawable[] drawableArr = ferVar.g;
            r1 = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                r1 = Drawable.resolveOpacity(r1, drawableArr[i2].getOpacity());
            }
            ferVar.q = r1;
            ferVar.p = true;
        }
        return r1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        fer ferVar = this.a;
        ferVar.getClass();
        Rect rect2 = ferVar.j;
        boolean z = false;
        if (rect2 == null && !ferVar.i) {
            ferVar.a();
            Rect rect3 = new Rect();
            int i = ferVar.h;
            Drawable[] drawableArr = ferVar.g;
            Rect rect4 = null;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect4 == null) {
                        rect4 = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect4.left) {
                        rect4.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect4.top) {
                        rect4.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect4.right) {
                        rect4.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect4.bottom) {
                        rect4.bottom = i6;
                    }
                }
            }
            ferVar.i = true;
            ferVar.j = rect4;
            rect2 = rect4;
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z = true;
            }
        } else {
            Drawable drawable = this.c;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.a.w && getLayoutDirection() == 1) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        fer ferVar = this.a;
        if (ferVar != null) {
            ferVar.p = false;
            ferVar.r = false;
        }
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.a.w;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.d;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.d = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f) {
                this.c.setAlpha(this.e);
            }
        }
        if (this.k != 0) {
            this.k = 0L;
            z = true;
        }
        if (this.j != 0) {
            this.j = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.n) {
            e();
            this.m.c();
            this.n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        fer ferVar = this.a;
        int i2 = this.g;
        int i3 = ferVar.h;
        Drawable[] drawableArr = ferVar.g;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i);
                if (i4 == i2) {
                    z = layoutDirection;
                }
            }
        }
        ferVar.v = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStateChange(int[] iArr) {
        q9 q9Var;
        boolean f = f(iArr);
        fer ferVar = this.m;
        int[][] iArr2 = ferVar.D;
        int i = ferVar.h;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                break;
            }
            i2++;
        }
        if (i2 < 0) {
            fer ferVar2 = this.m;
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = ferVar2.D;
            int i3 = ferVar2.h;
            i2 = 0;
            while (true) {
                if (i2 >= i3) {
                    i2 = -1;
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i2], iArr3)) {
                    break;
                }
                i2++;
            }
        }
        if (i2 == this.g) {
            return f;
        }
        SystemClock.uptimeMillis();
        this.a.getClass();
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setVisible(false, false);
        }
        if (i2 >= 0) {
            fer ferVar3 = this.a;
            if (i2 < ferVar3.h) {
                Drawable b = ferVar3.b(i2);
                this.c = b;
                this.g = i2;
                if (b != null) {
                    this.a.getClass();
                    d(b);
                }
                if (this.j == 0 || this.k != 0) {
                    q9Var = this.i;
                    if (q9Var != null) {
                        this.i = new q9(22, this);
                    } else {
                        unscheduleSelf(q9Var);
                    }
                    b(true);
                }
                invalidateSelf();
                return true;
            }
        }
        this.c = null;
        this.g = -1;
        if (this.j == 0) {
        }
        q9Var = this.i;
        if (q9Var != null) {
        }
        b(true);
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f && this.e == i) {
            return;
        }
        this.f = true;
        this.e = i;
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.j == 0) {
                drawable.setAlpha(i);
            } else {
                b(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        fer ferVar = this.a;
        if (ferVar.w != z) {
            ferVar.w = z;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        fer ferVar = this.a;
        ferVar.y = true;
        if (ferVar.x != colorFilter) {
            ferVar.x = colorFilter;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        fer ferVar = this.a;
        if (ferVar.u != z) {
            ferVar.u = z;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.b;
        if (rect == null) {
            this.b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        fer ferVar = this.a;
        ferVar.B = true;
        if (ferVar.z != colorStateList) {
            ferVar.z = colorStateList;
            this.c.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        fer ferVar = this.a;
        ferVar.C = true;
        if (ferVar.A != mode) {
            ferVar.A = mode;
            this.c.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
