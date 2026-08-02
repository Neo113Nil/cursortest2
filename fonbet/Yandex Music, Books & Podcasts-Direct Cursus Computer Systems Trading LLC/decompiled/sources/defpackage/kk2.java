package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.shape.a;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class kk2 extends Drawable implements kas {
    public final WeakReference a;
    public final a b;
    public final las c;
    public final Rect d;
    public final mk2 e;
    public float f;
    public float g;
    public final int h;
    public float i;
    public float j;
    public float k;
    public WeakReference l;
    public WeakReference m;

    public kk2(Context context) {
        x9s x9sVar;
        WeakReference weakReference = new WeakReference(context);
        this.a = weakReference;
        bcx.v(context, bcx.k, "Theme.MaterialComponents");
        this.d = new Rect();
        las lasVar = new las(this);
        this.c = lasVar;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = lasVar.a;
        textPaint.setTextAlign(align);
        mk2 mk2Var = new mk2(context);
        this.e = mk2Var;
        boolean f = f();
        lk2 lk2Var = mk2Var.b;
        a aVar = new a(eup.a(context, f ? lk2Var.g.intValue() : lk2Var.e.intValue(), f() ? lk2Var.h.intValue() : lk2Var.f.intValue()).e());
        this.b = aVar;
        h();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && lasVar.g != (x9sVar = new x9s(context2, lk2Var.d.intValue()))) {
            lasVar.b(x9sVar, context2);
            textPaint.setColor(lk2Var.c.intValue());
            invalidateSelf();
            j();
            invalidateSelf();
        }
        int i = lk2Var.l;
        if (i != -2) {
            this.h = ((int) Math.pow(10.0d, i - 1.0d)) - 1;
        } else {
            this.h = lk2Var.m;
        }
        lasVar.e = true;
        j();
        invalidateSelf();
        lasVar.e = true;
        h();
        j();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(lk2Var.b.intValue());
        if (aVar.b.d != valueOf) {
            aVar.r(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(lk2Var.c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.l.get();
            WeakReference weakReference3 = this.m;
            i(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        j();
        setVisible(lk2Var.t.booleanValue(), false);
    }

    @Override // defpackage.kas
    public final void a() {
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.ViewParent] */
    public final void b(View view, View view2) {
        float f;
        float f2;
        View view3;
        boolean z;
        FrameLayout d = d();
        if (d == null) {
            float y = view.getY();
            f2 = view.getX();
            view3 = view.getParent();
            f = y;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            view3 = d;
        }
        while (true) {
            z = view3 instanceof View;
            if (!z || view3 == view2) {
                break;
            }
            ViewParent parent = view3.getParent();
            if (!(parent instanceof ViewGroup) || ((ViewGroup) parent).getClipChildren()) {
                break;
            }
            View view4 = view3;
            f += view4.getY();
            f2 += view4.getX();
            view3 = view3.getParent();
        }
        if (z) {
            float f3 = (this.g - this.k) + f;
            float f4 = (this.f - this.j) + f2;
            View view5 = view3;
            float height = ((this.g + this.k) - view5.getHeight()) + f;
            float width = ((this.f + this.j) - view5.getWidth()) + f2;
            if (f3 < 0.0f) {
                this.g = Math.abs(f3) + this.g;
            }
            if (f4 < 0.0f) {
                this.f = Math.abs(f4) + this.f;
            }
            if (height > 0.0f) {
                this.g -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.f -= Math.abs(width);
            }
        }
    }

    public final String c() {
        mk2 mk2Var = this.e;
        lk2 lk2Var = mk2Var.b;
        lk2 lk2Var2 = mk2Var.b;
        String str = lk2Var.j;
        WeakReference weakReference = this.a;
        if (str == null) {
            if (!g()) {
                return null;
            }
            int i = this.h;
            if (i == -2 || e() <= i) {
                return NumberFormat.getInstance(lk2Var2.n).format(e());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(lk2Var2.n, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i), "+");
        }
        int i2 = lk2Var.l;
        if (i2 == -2 || str == null || str.length() <= i2) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i2 - 1), "…");
    }

    public final FrameLayout d() {
        WeakReference weakReference = this.m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String c;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.b.draw(canvas);
        if (!f() || (c = c()) == null) {
            return;
        }
        Rect rect = new Rect();
        las lasVar = this.c;
        lasVar.a.getTextBounds(c, 0, c.length(), rect);
        float exactCenterY = this.g - rect.exactCenterY();
        canvas.drawText(c, this.f, rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY), lasVar.a);
    }

    public final int e() {
        int i = this.e.b.k;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final boolean f() {
        return this.e.b.j != null || g();
    }

    public final boolean g() {
        lk2 lk2Var = this.e.b;
        return lk2Var.j == null && lk2Var.k != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.e.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        boolean f = f();
        mk2 mk2Var = this.e;
        this.b.setShapeAppearanceModel(eup.a(context, f ? mk2Var.b.g.intValue() : mk2Var.b.e.intValue(), f() ? mk2Var.b.h.intValue() : mk2Var.b.f.intValue()).e());
        invalidateSelf();
    }

    public final void i(View view, FrameLayout frameLayout) {
        this.l = new WeakReference(view);
        this.m = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        float f;
        float f2;
        int intValue;
        int intValue2;
        int intValue3;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        WeakReference weakReference = this.a;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.l;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.d;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.m;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean f11 = f();
        mk2 mk2Var = this.e;
        float f12 = f11 ? mk2Var.d : mk2Var.c;
        this.i = f12;
        if (f12 != -1.0f) {
            this.j = f12;
            this.k = f12;
        } else {
            this.j = Math.round((f() ? mk2Var.g : mk2Var.e) / 2.0f);
            this.k = Math.round((f() ? mk2Var.h : mk2Var.f) / 2.0f);
        }
        if (f()) {
            String c = c();
            float f13 = this.j;
            las lasVar = this.c;
            if (lasVar.e) {
                lasVar.a(c);
                f10 = lasVar.c;
            } else {
                f10 = lasVar.c;
            }
            this.j = Math.max(f13, (f10 / 2.0f) + mk2Var.b.u.intValue());
            float f14 = this.k;
            if (lasVar.e) {
                lasVar.a(c);
            }
            float max = Math.max(f14, (lasVar.d / 2.0f) + mk2Var.b.v.intValue());
            this.k = max;
            this.j = Math.max(this.j, max);
        }
        lk2 lk2Var = mk2Var.b;
        lk2 lk2Var2 = mk2Var.b;
        int i = mk2Var.l;
        int i2 = mk2Var.k;
        int intValue4 = lk2Var.x.intValue();
        if (f()) {
            intValue4 = lk2Var.z.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                f = -1.0f;
                f2 = 2.0f;
                intValue4 = wm0.c(intValue4, wm0.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), intValue4 - lk2Var.C.intValue());
                if (i2 == 0) {
                    intValue4 -= Math.round(this.k);
                }
                intValue = lk2Var.B.intValue() + intValue4;
                intValue2 = lk2Var2.s.intValue();
                if (intValue2 != 8388691 || intValue2 == 8388693) {
                    this.g = rect3.bottom - intValue;
                } else {
                    this.g = rect3.top + intValue;
                }
                int intValue5 = !f() ? lk2Var.y.intValue() : lk2Var.w.intValue();
                if (i2 == 1) {
                    intValue5 += f() ? mk2Var.j : mk2Var.i;
                }
                int intValue6 = lk2Var.A.intValue() + intValue5;
                intValue3 = lk2Var2.s.intValue();
                if (intValue3 != 8388659 || intValue3 == 8388691) {
                    if (i != 0) {
                        if (view.getLayoutDirection() == 0) {
                            f3 = rect3.left + this.j;
                            f4 = (this.k * f2) - intValue6;
                            f5 = f3 - f4;
                            this.f = f5;
                        } else {
                            f5 = (rect3.right - this.j) + ((this.k * f2) - intValue6);
                            this.f = f5;
                        }
                    } else if (view.getLayoutDirection() == 0) {
                        f5 = (rect3.left - this.j) + intValue6;
                        this.f = f5;
                    } else {
                        f3 = rect3.right + this.j;
                        f4 = intValue6;
                        f5 = f3 - f4;
                        this.f = f5;
                    }
                } else if (i == 0) {
                    if (view.getLayoutDirection() == 0) {
                        f7 = rect3.right + this.j;
                        f8 = intValue6;
                        f9 = f7 - f8;
                        this.f = f9;
                    } else {
                        f9 = (rect3.left - this.j) + intValue6;
                        this.f = f9;
                    }
                } else if (view.getLayoutDirection() == 0) {
                    f9 = (rect3.right - this.j) + ((this.k * f2) - intValue6);
                    this.f = f9;
                } else {
                    f7 = rect3.left + this.j;
                    f8 = (this.k * f2) - intValue6;
                    f9 = f7 - f8;
                    this.f = f9;
                }
                if (lk2Var.D.booleanValue()) {
                    b(view, null);
                } else {
                    ViewParent d = d();
                    if (d == null) {
                        d = view.getParent();
                    }
                    if ((d instanceof View) && (d.getParent() instanceof View)) {
                        b(view, (View) d.getParent());
                    }
                }
                float f15 = this.f;
                float f16 = this.g;
                float f17 = this.j;
                float f18 = this.k;
                rect2.set((int) (f15 - f17), (int) (f16 - f18), (int) (f15 + f17), (int) (f16 + f18));
                f6 = this.i;
                a aVar = this.b;
                if (f6 != f) {
                    aVar.setShapeAppearanceModel(aVar.b.a.i(f6));
                }
                if (rect.equals(rect2)) {
                    aVar.setBounds(rect2);
                    return;
                }
                return;
            }
        }
        f = -1.0f;
        f2 = 2.0f;
        if (i2 == 0) {
        }
        intValue = lk2Var.B.intValue() + intValue4;
        intValue2 = lk2Var2.s.intValue();
        if (intValue2 != 8388691) {
        }
        this.g = rect3.bottom - intValue;
        if (!f()) {
        }
        if (i2 == 1) {
        }
        int intValue62 = lk2Var.A.intValue() + intValue5;
        intValue3 = lk2Var2.s.intValue();
        if (intValue3 != 8388659) {
        }
        if (i != 0) {
        }
        if (lk2Var.D.booleanValue()) {
        }
        float f152 = this.f;
        float f162 = this.g;
        float f172 = this.j;
        float f182 = this.k;
        rect2.set((int) (f152 - f172), (int) (f162 - f182), (int) (f152 + f172), (int) (f162 + f182));
        f6 = this.i;
        a aVar2 = this.b;
        if (f6 != f) {
        }
        if (rect.equals(rect2)) {
        }
    }

    @Override // android.graphics.drawable.Drawable, defpackage.kas
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        mk2 mk2Var = this.e;
        mk2Var.a.i = i;
        mk2Var.b.i = i;
        this.c.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
