package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import defpackage.P7K7Inc8;
import defpackage.c40;
import defpackage.nh;
import defpackage.oh;
import defpackage.r60;
import defpackage.ra;
import defpackage.re;
import defpackage.t60;
import defpackage.tef3qNMP;
import defpackage.tr;
import defpackage.v60;
import defpackage.y00;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {
    public final RectF MdtA4re8;
    public final Paint NCTxEWno;
    public boolean OnDfzHZD;
    public final Path P7K7Inc8;
    public final v60 Qr9iLBAD;
    public final Path VgvYg0wo;
    public final Matrix b2ZJblxo;
    public float eVhOlqcC;
    public WeakReference jb9XjC4I;
    public ObjectAnimator k3x7lurq;
    public boolean lDXGDhIF;
    public float ow5vqvCr;
    public oh sjUBp5pO;
    public final Rect wxUZMvaN;
    public boolean ygLcUYwZ;
    public static final ColorDrawable OxcuoDLp = new ColorDrawable(0);
    public static final int[] amk52bBQ = {R.attr.state_focused, R.attr.state_window_focused};
    public static final OvershootInterpolator KlHjfFWx = new OvershootInterpolator(4.0f);
    public static final nh Ey6iv0m0 = new nh("interpolation");

    public FocusRingDrawable(oh ohVar, Resources resources) {
        super(null);
        Paint paint = new Paint(1);
        this.NCTxEWno = paint;
        this.MdtA4re8 = new RectF();
        this.wxUZMvaN = new Rect();
        this.VgvYg0wo = new Path();
        this.P7K7Inc8 = new Path();
        this.b2ZJblxo = new Matrix();
        this.Qr9iLBAD = v60.NCTxEWno();
        this.eVhOlqcC = -1.0f;
        this.ow5vqvCr = 1.0f;
        this.ygLcUYwZ = false;
        this.lDXGDhIF = false;
        oh ohVar2 = new oh(ohVar);
        this.sjUBp5pO = ohVar2;
        Drawable.ConstantState constantState = ohVar2.qoPGr6Ce;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.sjUBp5pO.eVhOlqcC)) {
            return;
        }
        paint.setStrokeWidth(this.sjUBp5pO.eVhOlqcC);
    }

    public static int MdtA4re8(TypedArray typedArray, int i) {
        if (typedArray.getType(i) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    public static float P7K7Inc8(float f, Resources.Theme theme, int i, TypedArray typedArray, int i2, int i3) {
        if (!Float.isNaN(f)) {
            return f;
        }
        Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i2, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i3 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i3);
    }

    public static FocusRingDrawable VgvYg0wo(Context context, LayerDrawable layerDrawable, tr trVar) {
        if (!ra.ytu5o6f4(context.getTheme(), com.kolosta.rejin.jilosa.R.attr.focusRingsEnabled, false)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, OxcuoDLp);
        if (trVar != null) {
            focusRingDrawable.jb9XjC4I = new WeakReference(trVar);
        }
        layerDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(layerDrawable);
        return focusRingDrawable;
    }

    public final void NCTxEWno(Canvas canvas, Path path, float f, float f2, int i) {
        RectF rectF = this.MdtA4re8;
        qoPGr6Ce(rectF);
        float f3 = f * 2.0f;
        float width = 1.0f - (f3 / rectF.width());
        float height = 1.0f - (f3 / rectF.height());
        Matrix matrix = this.b2ZJblxo;
        matrix.reset();
        matrix.postScale(width, height, rectF.centerX(), rectF.centerY());
        Path path2 = this.VgvYg0wo;
        path.transform(matrix, path2);
        float f4 = f2 * this.ow5vqvCr;
        Paint paint = this.NCTxEWno;
        paint.setStrokeWidth(f4);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        wxUZMvaN(theme);
    }

    public final void b2ZJblxo(r60 r60Var) {
        RectF rectF = this.MdtA4re8;
        qoPGr6Ce(rectF);
        t60 NCTxEWno = r60Var.NCTxEWno(amk52bBQ);
        boolean jb9XjC4I = NCTxEWno.jb9XjC4I(rectF);
        Path path = this.P7K7Inc8;
        if (!jb9XjC4I) {
            this.Qr9iLBAD.qoPGr6Ce(NCTxEWno, null, 1.0f, rectF, null, path);
            this.eVhOlqcC = -1.0f;
            return;
        }
        oh ohVar = this.sjUBp5pO;
        float f = ((ohVar.eVhOlqcC / 2.0f) * this.ow5vqvCr) + ohVar.sjUBp5pO;
        rectF.inset(f, f);
        this.eVhOlqcC = NCTxEWno.VgvYg0wo.qoPGr6Ce(rectF);
        path.reset();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0046, code lost:
    
        if (r1.isEmpty() == false) goto L9;
     */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f;
        int radius;
        super.draw(canvas);
        oh ohVar = this.sjUBp5pO;
        if (ohVar.MdtA4re8 && this.ygLcUYwZ) {
            float f2 = ohVar.sjUBp5pO;
            float f3 = ohVar.eVhOlqcC / 2.0f;
            float f4 = this.ow5vqvCr;
            float f5 = (f3 * f4) + f2;
            float f6 = ((ohVar.ow5vqvCr / 2.0f) * f4) + f2 + ohVar.amk52bBQ;
            Path path = this.P7K7Inc8;
            if (path.isEmpty()) {
                WeakReference weakReference = this.jb9XjC4I;
                if (weakReference != null && weakReference.get() != null) {
                    path = ((tr) this.jb9XjC4I.get()).eVhOlqcC;
                }
                path = null;
            }
            Path path2 = path;
            oh ohVar2 = this.sjUBp5pO;
            if (path2 != null) {
                NCTxEWno(canvas, path2, f6, ohVar2.ow5vqvCr, ohVar2.Qr9iLBAD);
                oh ohVar3 = this.sjUBp5pO;
                NCTxEWno(canvas, path2, f5, ohVar3.eVhOlqcC, ohVar3.P7K7Inc8);
                return;
            }
            if (Float.isNaN(ohVar2.ygLcUYwZ)) {
                f = this.eVhOlqcC;
                if (f < 0.0f) {
                    WeakReference weakReference2 = this.jb9XjC4I;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        tr trVar = (tr) this.jb9XjC4I.get();
                        float MdtA4re8 = trVar.MdtA4re8(trVar.b2ZJblxo(), trVar.MdtA4re8.qoPGr6Ce.wxUZMvaN(), trVar.i7xS8jrb);
                        if (MdtA4re8 >= 0.0f) {
                            MdtA4re8 *= trVar.MdtA4re8.jb9XjC4I;
                        }
                        if (MdtA4re8 >= 0.0f) {
                            f = Math.max(0.0f, MdtA4re8 - (this.sjUBp5pO.eVhOlqcC / 2.0f));
                        }
                    }
                    Drawable drawable = getDrawable();
                    f = (!(drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) ? 0.0f : radius;
                }
            } else {
                f = this.sjUBp5pO.ygLcUYwZ;
            }
            float max = Math.max(0.0f, f - (this.sjUBp5pO.eVhOlqcC / 2.0f));
            oh ohVar4 = this.sjUBp5pO;
            float f7 = ohVar4.ow5vqvCr;
            int i = ohVar4.Qr9iLBAD;
            RectF rectF = this.MdtA4re8;
            qoPGr6Ce(rectF);
            rectF.inset(f6, f6);
            float f8 = f7 * this.ow5vqvCr;
            Paint paint = this.NCTxEWno;
            paint.setStrokeWidth(f8);
            paint.setColor(i);
            canvas.drawRoundRect(rectF, max, max, paint);
            oh ohVar5 = this.sjUBp5pO;
            float f9 = ohVar5.eVhOlqcC;
            int i2 = ohVar5.P7K7Inc8;
            qoPGr6Ce(rectF);
            rectF.inset(f5, f5);
            paint.setStrokeWidth(f9 * this.ow5vqvCr);
            paint.setColor(i2);
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        oh ohVar = this.sjUBp5pO;
        if (ohVar.qoPGr6Ce == null) {
            return null;
        }
        ohVar.NCTxEWno = getChangingConfigurations();
        return this.sjUBp5pO;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            if (super.hasFocusStateSpecified()) {
                return true;
            }
            return this.sjUBp5pO.MdtA4re8;
        } catch (NoSuchMethodError unused) {
            return this.sjUBp5pO.MdtA4re8;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = y00.eVhOlqcC;
        TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.sjUBp5pO.wxUZMvaN = MdtA4re8(obtainStyledAttributes, 0);
        if (this.sjUBp5pO.wxUZMvaN == Integer.MIN_VALUE && obtainStyledAttributes.hasValue(0)) {
            oh ohVar = this.sjUBp5pO;
            ohVar.MdtA4re8 = obtainStyledAttributes.getBoolean(0, ohVar.MdtA4re8);
            this.sjUBp5pO.VgvYg0wo = true;
        }
        this.sjUBp5pO.b2ZJblxo = MdtA4re8(obtainStyledAttributes, 5);
        oh ohVar2 = this.sjUBp5pO;
        if (ohVar2.b2ZJblxo == Integer.MIN_VALUE) {
            ohVar2.P7K7Inc8 = obtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.sjUBp5pO.jb9XjC4I = MdtA4re8(obtainStyledAttributes, 1);
        oh ohVar3 = this.sjUBp5pO;
        if (ohVar3.jb9XjC4I == Integer.MIN_VALUE) {
            ohVar3.Qr9iLBAD = obtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.sjUBp5pO.k3x7lurq = MdtA4re8(obtainStyledAttributes, 6);
        oh ohVar4 = this.sjUBp5pO;
        if (ohVar4.k3x7lurq == Integer.MIN_VALUE) {
            ohVar4.eVhOlqcC = obtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.sjUBp5pO.OnDfzHZD = MdtA4re8(obtainStyledAttributes, 3);
        oh ohVar5 = this.sjUBp5pO;
        if (ohVar5.OnDfzHZD == Integer.MIN_VALUE) {
            ohVar5.ow5vqvCr = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.sjUBp5pO.OnDfzHZD = MdtA4re8(obtainStyledAttributes, 3);
        oh ohVar6 = this.sjUBp5pO;
        if (ohVar6.OnDfzHZD == Integer.MIN_VALUE) {
            ohVar6.ow5vqvCr = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.sjUBp5pO.lDXGDhIF = MdtA4re8(obtainStyledAttributes, 7);
        oh ohVar7 = this.sjUBp5pO;
        if (ohVar7.lDXGDhIF == Integer.MIN_VALUE) {
            ohVar7.ygLcUYwZ = obtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.sjUBp5pO.OxcuoDLp = MdtA4re8(obtainStyledAttributes, 4);
        oh ohVar8 = this.sjUBp5pO;
        if (ohVar8.OxcuoDLp == Integer.MIN_VALUE) {
            ohVar8.sjUBp5pO = obtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.sjUBp5pO.KlHjfFWx = MdtA4re8(obtainStyledAttributes, 2);
        oh ohVar9 = this.sjUBp5pO;
        if (ohVar9.KlHjfFWx == Integer.MIN_VALUE) {
            ohVar9.amk52bBQ = obtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.sjUBp5pO.RXQxj5Oe = MdtA4re8(obtainStyledAttributes, 8);
        this.sjUBp5pO.I5GHvsYW = obtainStyledAttributes.getType(8) == 1 ? obtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE) : Integer.MIN_VALUE;
        obtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable drawable = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable != null) {
            setDrawable(drawable);
            this.sjUBp5pO.qoPGr6Ce = drawable.getConstantState();
        } else {
            ColorDrawable colorDrawable = OxcuoDLp;
            setDrawable(colorDrawable);
            this.sjUBp5pO.qoPGr6Ce = colorDrawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        boolean isProjected;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return false;
        }
        isProjected = drawable.isProjected();
        return isProjected;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.sjUBp5pO.MdtA4re8;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.k3x7lurq;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.k3x7lurq = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.lDXGDhIF && super.mutate() == this) {
            this.sjUBp5pO = new oh(this.sjUBp5pO);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.sjUBp5pO.qoPGr6Ce = drawable.getConstantState();
            }
            this.lDXGDhIF = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x018c  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBoundsChange(Rect rect) {
        float[] fArr;
        float f;
        t60 t60Var;
        super.onBoundsChange(rect);
        oh ohVar = this.sjUBp5pO;
        if (!ohVar.MdtA4re8) {
            return;
        }
        r60 r60Var = ohVar.Ey6iv0m0;
        if (r60Var != null) {
            b2ZJblxo(r60Var);
            return;
        }
        Drawable drawable = getDrawable();
        t60 t60Var2 = null;
        if (drawable instanceof ShapeDrawable) {
            Outline outline = new Outline();
            ((ShapeDrawable) drawable).getOutline(outline);
            if (outline.getRadius() > 0.0f) {
                c40 c40Var = new c40();
                c40 c40Var2 = new c40();
                c40 c40Var3 = new c40();
                c40 c40Var4 = new c40();
                re reVar = new re(0);
                re reVar2 = new re(0);
                re reVar3 = new re(0);
                re reVar4 = new re(0);
                float radius = outline.getRadius();
                P7K7Inc8 p7K7Inc8 = new P7K7Inc8(radius);
                P7K7Inc8 p7K7Inc82 = new P7K7Inc8(radius);
                P7K7Inc8 p7K7Inc83 = new P7K7Inc8(radius);
                P7K7Inc8 p7K7Inc84 = new P7K7Inc8(radius);
                t60Var = new t60();
                t60Var.qoPGr6Ce = c40Var;
                t60Var.NCTxEWno = c40Var2;
                t60Var.MdtA4re8 = c40Var3;
                t60Var.wxUZMvaN = c40Var4;
                t60Var.VgvYg0wo = p7K7Inc8;
                t60Var.P7K7Inc8 = p7K7Inc82;
                t60Var.b2ZJblxo = p7K7Inc83;
                t60Var.Qr9iLBAD = p7K7Inc84;
                t60Var.jb9XjC4I = reVar;
                t60Var.eVhOlqcC = reVar2;
                t60Var.k3x7lurq = reVar3;
                t60Var.ow5vqvCr = reVar4;
                t60Var2 = t60Var;
            }
            if (t60Var2 == null) {
                b2ZJblxo(t60Var2);
                return;
            } else {
                this.eVhOlqcC = -1.0f;
                this.P7K7Inc8.reset();
                return;
            }
        }
        if (drawable instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            try {
                fArr = gradientDrawable.getCornerRadii();
            } catch (NullPointerException unused) {
                fArr = null;
            }
            if (fArr != null) {
                c40 c40Var5 = new c40();
                c40 c40Var6 = new c40();
                c40 c40Var7 = new c40();
                c40 c40Var8 = new c40();
                re reVar5 = new re(0);
                re reVar6 = new re(0);
                re reVar7 = new re(0);
                re reVar8 = new re(0);
                P7K7Inc8 p7K7Inc85 = new P7K7Inc8(Math.min(fArr[0], fArr[1]));
                P7K7Inc8 p7K7Inc86 = new P7K7Inc8(Math.min(fArr[2], fArr[3]));
                P7K7Inc8 p7K7Inc87 = new P7K7Inc8(Math.min(fArr[4], fArr[5]));
                P7K7Inc8 p7K7Inc88 = new P7K7Inc8(Math.min(fArr[6], fArr[7]));
                t60Var = new t60();
                t60Var.qoPGr6Ce = c40Var5;
                t60Var.NCTxEWno = c40Var6;
                t60Var.MdtA4re8 = c40Var7;
                t60Var.wxUZMvaN = c40Var8;
                t60Var.VgvYg0wo = p7K7Inc85;
                t60Var.P7K7Inc8 = p7K7Inc86;
                t60Var.b2ZJblxo = p7K7Inc87;
                t60Var.Qr9iLBAD = p7K7Inc88;
                t60Var.jb9XjC4I = reVar5;
                t60Var.eVhOlqcC = reVar6;
                t60Var.k3x7lurq = reVar7;
                t60Var.ow5vqvCr = reVar8;
                t60Var2 = t60Var;
            } else {
                try {
                    f = gradientDrawable.getCornerRadius();
                } catch (NullPointerException unused2) {
                    f = -1.0f;
                }
                if (f > 0.0f) {
                    c40 c40Var9 = new c40();
                    c40 c40Var10 = new c40();
                    c40 c40Var11 = new c40();
                    c40 c40Var12 = new c40();
                    re reVar9 = new re(0);
                    re reVar10 = new re(0);
                    re reVar11 = new re(0);
                    re reVar12 = new re(0);
                    P7K7Inc8 p7K7Inc89 = new P7K7Inc8(f);
                    P7K7Inc8 p7K7Inc810 = new P7K7Inc8(f);
                    P7K7Inc8 p7K7Inc811 = new P7K7Inc8(f);
                    P7K7Inc8 p7K7Inc812 = new P7K7Inc8(f);
                    t60 t60Var3 = new t60();
                    t60Var3.qoPGr6Ce = c40Var9;
                    t60Var3.NCTxEWno = c40Var10;
                    t60Var3.MdtA4re8 = c40Var11;
                    t60Var3.wxUZMvaN = c40Var12;
                    t60Var3.VgvYg0wo = p7K7Inc89;
                    t60Var3.P7K7Inc8 = p7K7Inc810;
                    t60Var3.b2ZJblxo = p7K7Inc811;
                    t60Var3.Qr9iLBAD = p7K7Inc812;
                    t60Var3.jb9XjC4I = reVar9;
                    t60Var3.eVhOlqcC = reVar10;
                    t60Var3.k3x7lurq = reVar11;
                    t60Var3.ow5vqvCr = reVar12;
                    t60Var2 = t60Var3;
                }
            }
        }
        if (t60Var2 == null) {
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        oh ohVar = this.sjUBp5pO;
        if (!ohVar.MdtA4re8) {
            this.ygLcUYwZ = false;
            return super.onStateChange(iArr);
        }
        boolean stateSetMatches = StateSet.stateSetMatches(ohVar.gjV1z5T1, iArr);
        boolean z = this.ygLcUYwZ != stateSetMatches;
        this.ygLcUYwZ = stateSetMatches;
        if (z && iArr.length > 0 && !this.OnDfzHZD) {
            ObjectAnimator objectAnimator = this.k3x7lurq;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.k3x7lurq = null;
            }
            if (stateSetMatches) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, Ey6iv0m0, 0.0f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.setInterpolator(KlHjfFWx);
                ofFloat.addListener(new tef3qNMP(2, this));
                this.k3x7lurq = ofFloat;
                ofFloat.start();
            } else {
                this.ow5vqvCr = 1.0f;
            }
        }
        this.OnDfzHZD = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    public final void qoPGr6Ce(RectF rectF) {
        Rect rect = this.sjUBp5pO.FySoLYna;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        WeakReference weakReference = this.jb9XjC4I;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((tr) this.jb9XjC4I.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect2 = this.wxUZMvaN;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    public final void wxUZMvaN(Resources.Theme theme) {
        TypedValue SgZGMMPL;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(y00.eVhOlqcC);
        int i = this.sjUBp5pO.wxUZMvaN;
        if (i != Integer.MIN_VALUE && (SgZGMMPL = ra.SgZGMMPL(theme, i)) != null) {
            oh ohVar = this.sjUBp5pO;
            ohVar.MdtA4re8 = SgZGMMPL.data != 0;
            ohVar.VgvYg0wo = true;
        }
        oh ohVar2 = this.sjUBp5pO;
        if (!ohVar2.VgvYg0wo) {
            ohVar2.MdtA4re8 = ra.ytu5o6f4(theme, com.kolosta.rejin.jilosa.R.attr.focusRingsEnabled, ohVar2.MdtA4re8);
        }
        oh ohVar3 = this.sjUBp5pO;
        if (ohVar3.MdtA4re8) {
            int i2 = ohVar3.P7K7Inc8;
            int i3 = ohVar3.b2ZJblxo;
            if (i2 == Integer.MIN_VALUE) {
                if (i3 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    if (theme.resolveAttribute(i3, typedValue, true)) {
                        i2 = typedValue.data;
                    }
                }
                i2 = obtainStyledAttributes.getColor(5, -16777216);
            }
            ohVar3.P7K7Inc8 = i2;
            oh ohVar4 = this.sjUBp5pO;
            int i4 = ohVar4.Qr9iLBAD;
            int i5 = ohVar4.jb9XjC4I;
            if (i4 == Integer.MIN_VALUE) {
                if (i5 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    if (theme.resolveAttribute(i5, typedValue2, true)) {
                        i4 = typedValue2.data;
                    }
                }
                i4 = obtainStyledAttributes.getColor(1, -1);
            }
            ohVar4.Qr9iLBAD = i4;
            oh ohVar5 = this.sjUBp5pO;
            ohVar5.eVhOlqcC = P7K7Inc8(ohVar5.eVhOlqcC, theme, ohVar5.k3x7lurq, obtainStyledAttributes, 6, com.kolosta.rejin.jilosa.R.dimen.mtrl_focus_ring_outer_stroke_width);
            oh ohVar6 = this.sjUBp5pO;
            ohVar6.ow5vqvCr = P7K7Inc8(ohVar6.ow5vqvCr, theme, ohVar6.OnDfzHZD, obtainStyledAttributes, 3, com.kolosta.rejin.jilosa.R.dimen.mtrl_focus_ring_inner_stroke_width);
            oh ohVar7 = this.sjUBp5pO;
            ohVar7.ygLcUYwZ = P7K7Inc8(ohVar7.ygLcUYwZ, theme, ohVar7.lDXGDhIF, obtainStyledAttributes, 7, 0);
            oh ohVar8 = this.sjUBp5pO;
            ohVar8.sjUBp5pO = P7K7Inc8(ohVar8.sjUBp5pO, theme, ohVar8.OxcuoDLp, obtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.sjUBp5pO.sjUBp5pO)) {
                this.sjUBp5pO.sjUBp5pO = 0.0f;
            }
            oh ohVar9 = this.sjUBp5pO;
            ohVar9.amk52bBQ = P7K7Inc8(ohVar9.amk52bBQ, theme, ohVar9.KlHjfFWx, obtainStyledAttributes, 2, com.kolosta.rejin.jilosa.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            oh ohVar10 = this.sjUBp5pO;
            int i6 = ohVar10.I5GHvsYW;
            int[] iArr = y00.gjV1z5T1;
            if (i6 != Integer.MIN_VALUE) {
                ohVar10.Ey6iv0m0 = t60.b2ZJblxo(theme.obtainStyledAttributes(i6, iArr), new P7K7Inc8(0.0f)).qoPGr6Ce();
            } else {
                int i7 = ohVar10.RXQxj5Oe;
                if (i7 == Integer.MIN_VALUE) {
                    i7 = com.kolosta.rejin.jilosa.R.attr.focusRingsShapeAppearance;
                }
                TypedValue SgZGMMPL2 = ra.SgZGMMPL(theme, i7);
                if (SgZGMMPL2 != null) {
                    this.sjUBp5pO.Ey6iv0m0 = t60.b2ZJblxo(theme.obtainStyledAttributes(SgZGMMPL2.resourceId, iArr), new P7K7Inc8(0.0f)).qoPGr6Ce();
                }
            }
        }
        obtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.NCTxEWno;
        paint.setStyle(style);
        if (Float.isNaN(this.sjUBp5pO.eVhOlqcC)) {
            return;
        }
        paint.setStrokeWidth(this.sjUBp5pO.eVhOlqcC);
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.NCTxEWno = new Paint(1);
        this.MdtA4re8 = new RectF();
        this.wxUZMvaN = new Rect();
        this.VgvYg0wo = new Path();
        this.P7K7Inc8 = new Path();
        this.b2ZJblxo = new Matrix();
        this.Qr9iLBAD = v60.NCTxEWno();
        this.eVhOlqcC = -1.0f;
        this.ow5vqvCr = 1.0f;
        this.ygLcUYwZ = false;
        this.lDXGDhIF = false;
        oh ohVar = new oh(null);
        this.sjUBp5pO = ohVar;
        if (drawable != null) {
            ohVar.qoPGr6Ce = drawable.getConstantState();
        }
        wxUZMvaN(context.getTheme());
    }

    public FocusRingDrawable() {
        super(null);
        this.NCTxEWno = new Paint(1);
        this.MdtA4re8 = new RectF();
        this.wxUZMvaN = new Rect();
        this.VgvYg0wo = new Path();
        this.P7K7Inc8 = new Path();
        this.b2ZJblxo = new Matrix();
        this.Qr9iLBAD = v60.NCTxEWno();
        this.eVhOlqcC = -1.0f;
        this.ow5vqvCr = 1.0f;
        this.ygLcUYwZ = false;
        this.lDXGDhIF = false;
        this.sjUBp5pO = new oh(null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
