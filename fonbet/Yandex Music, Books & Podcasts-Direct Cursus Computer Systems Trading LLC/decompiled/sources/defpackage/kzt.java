package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class kzt extends bzt {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;
    public izt b;
    public PorterDuffColorFilter c;
    public ColorFilter d;
    public boolean e;
    public boolean f;
    public final float[] g;
    public final Matrix h;
    public final Rect i;

    public kzt() {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        izt iztVar = new izt();
        iztVar.c = null;
        iztVar.d = j;
        iztVar.b = new hzt();
        this.b = iztVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.g;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        izt iztVar = this.b;
        Bitmap bitmap = iztVar.f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != iztVar.f.getHeight()) {
            iztVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            iztVar.k = true;
        }
        boolean z = this.f;
        izt iztVar2 = this.b;
        if (!z) {
            iztVar2.f.eraseColor(0);
            Canvas canvas2 = new Canvas(iztVar2.f);
            hzt hztVar = iztVar2.b;
            hztVar.a(hztVar.g, hzt.p, canvas2, min, min2);
        } else if (iztVar2.k || iztVar2.g != iztVar2.c || iztVar2.h != iztVar2.d || iztVar2.j != iztVar2.e || iztVar2.i != iztVar2.b.getRootAlpha()) {
            izt iztVar3 = this.b;
            iztVar3.f.eraseColor(0);
            Canvas canvas3 = new Canvas(iztVar3.f);
            hzt hztVar2 = iztVar3.b;
            hztVar2.a(hztVar2.g, hzt.p, canvas3, min, min2);
            izt iztVar4 = this.b;
            iztVar4.g = iztVar4.c;
            iztVar4.h = iztVar4.d;
            iztVar4.i = iztVar4.b.getRootAlpha();
            iztVar4.j = iztVar4.e;
            iztVar4.k = false;
        }
        izt iztVar5 = this.b;
        if (iztVar5.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (iztVar5.l == null) {
                Paint paint2 = new Paint();
                iztVar5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            iztVar5.l.setAlpha(iztVar5.b.getRootAlpha());
            iztVar5.l.setColorFilter(colorFilter);
            paint = iztVar5.l;
        }
        canvas.drawBitmap(iztVar5.f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getColorFilter() : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a != null) {
            return new jzt(this.a.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        int i3;
        int i4;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        izt iztVar = this.b;
        iztVar.b = new hzt();
        TypedArray I = pcg.I(resources, theme, attributeSet, tt0.a);
        izt iztVar2 = this.b;
        hzt hztVar = iztVar2.b;
        int i5 = !pcg.F("tintMode", xmlPullParser) ? -1 : I.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i6 = 3;
        if (i5 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i5 != 5) {
            if (i5 != 9) {
                switch (i5) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        iztVar2.d = mode;
        ColorStateList C = pcg.C(I, xmlPullParser, theme);
        if (C != null) {
            iztVar2.c = C;
        }
        boolean z = iztVar2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = I.getBoolean(5, z);
        }
        iztVar2.e = z;
        float f = hztVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = I.getFloat(7, f);
        }
        hztVar.j = f;
        float f2 = hztVar.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = I.getFloat(8, f2);
        }
        hztVar.k = f2;
        if (hztVar.j <= 0.0f) {
            throw new XmlPullParserException(I.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(I.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        hztVar.h = I.getDimension(3, hztVar.h);
        int i7 = 2;
        float dimension = I.getDimension(2, hztVar.i);
        hztVar.i = dimension;
        if (hztVar.h <= 0.0f) {
            throw new XmlPullParserException(I.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(I.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = hztVar.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = I.getFloat(4, alpha);
        }
        hztVar.setAlpha(alpha);
        String string = I.getString(0);
        if (string != null) {
            hztVar.m = string;
            hztVar.o.put(string, hztVar);
        }
        I.recycle();
        iztVar.a = getChangingConfigurations();
        int i8 = 1;
        iztVar.k = true;
        izt iztVar3 = this.b;
        hzt hztVar2 = iztVar3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        ezt eztVar = hztVar2.g;
        xy0 xy0Var = hztVar2.o;
        arrayDeque.push(eztVar);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i8 && (xmlPullParser.getDepth() >= depth || eventType != i6)) {
            if (eventType == i7) {
                String name = xmlPullParser.getName();
                ezt eztVar2 = (ezt) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    dzt dztVar = new dzt();
                    dztVar.e = 0.0f;
                    dztVar.g = 1.0f;
                    dztVar.h = 1.0f;
                    dztVar.i = 0.0f;
                    dztVar.j = 1.0f;
                    dztVar.k = 0.0f;
                    Paint.Cap cap = Paint.Cap.BUTT;
                    dztVar.l = cap;
                    Paint.Join join = Paint.Join.MITER;
                    dztVar.m = join;
                    dztVar.n = 4.0f;
                    TypedArray I2 = pcg.I(resources, theme, attributeSet, tt0.c);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = I2.getString(0);
                        if (string2 != null) {
                            dztVar.b = string2;
                        }
                        String string3 = I2.getString(2);
                        if (string3 != null) {
                            dztVar.a = a4g.v(string3);
                        }
                        dztVar.f = pcg.D(I2, xmlPullParser, theme, "fillColor", 1);
                        float f3 = dztVar.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = I2.getFloat(12, f3);
                        }
                        dztVar.h = f3;
                        int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? I2.getInt(8, -1) : -1;
                        dztVar.l = i9 != 0 ? i9 != 1 ? i9 != 2 ? dztVar.l : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                        int i10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? I2.getInt(9, -1) : -1;
                        dztVar.m = i10 != 0 ? i10 != 1 ? i10 != 2 ? dztVar.m : Paint.Join.BEVEL : Paint.Join.ROUND : join;
                        float f4 = dztVar.n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = I2.getFloat(10, f4);
                        }
                        dztVar.n = f4;
                        dztVar.d = pcg.D(I2, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = dztVar.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = I2.getFloat(11, f5);
                        }
                        dztVar.g = f5;
                        float f6 = dztVar.e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = I2.getFloat(4, f6);
                        }
                        dztVar.e = f6;
                        float f7 = dztVar.j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = I2.getFloat(6, f7);
                        }
                        dztVar.j = f7;
                        float f8 = dztVar.k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = I2.getFloat(7, f8);
                        }
                        dztVar.k = f8;
                        float f9 = dztVar.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = I2.getFloat(5, f9);
                        }
                        dztVar.i = f9;
                        int i11 = dztVar.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i11 = I2.getInt(13, i11);
                        }
                        dztVar.c = i11;
                    }
                    I2.recycle();
                    eztVar2.b.add(dztVar);
                    if (dztVar.getPathName() != null) {
                        xy0Var.put(dztVar.getPathName(), dztVar);
                    }
                    iztVar3.a = iztVar3.a;
                    i4 = 1;
                    z2 = false;
                } else {
                    if ("clip-path".equals(name)) {
                        czt cztVar = new czt();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray I3 = pcg.I(resources, theme, attributeSet, tt0.d);
                            String string4 = I3.getString(0);
                            if (string4 != null) {
                                cztVar.b = string4;
                            }
                            String string5 = I3.getString(1);
                            if (string5 != null) {
                                cztVar.a = a4g.v(string5);
                            }
                            cztVar.c = !pcg.F("fillType", xmlPullParser) ? 0 : I3.getInt(2, 0);
                            I3.recycle();
                        }
                        eztVar2.b.add(cztVar);
                        if (cztVar.getPathName() != null) {
                            xy0Var.put(cztVar.getPathName(), cztVar);
                        }
                        iztVar3.a = iztVar3.a;
                    } else if ("group".equals(name)) {
                        ezt eztVar3 = new ezt();
                        TypedArray I4 = pcg.I(resources, theme, attributeSet, tt0.b);
                        float f10 = eztVar3.c;
                        if (pcg.F(CameraProperty.ROTATION, xmlPullParser)) {
                            f10 = I4.getFloat(5, f10);
                        }
                        eztVar3.c = f10;
                        i4 = 1;
                        eztVar3.d = I4.getFloat(1, eztVar3.d);
                        eztVar3.e = I4.getFloat(2, eztVar3.e);
                        float f11 = eztVar3.f;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f11 = I4.getFloat(3, f11);
                        }
                        eztVar3.f = f11;
                        float f12 = eztVar3.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f12 = I4.getFloat(4, f12);
                        }
                        eztVar3.g = f12;
                        float f13 = eztVar3.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f13 = I4.getFloat(6, f13);
                        }
                        eztVar3.h = f13;
                        float f14 = eztVar3.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f14 = I4.getFloat(7, f14);
                        }
                        eztVar3.i = f14;
                        String string6 = I4.getString(0);
                        if (string6 != null) {
                            eztVar3.k = string6;
                        }
                        eztVar3.c();
                        I4.recycle();
                        eztVar2.b.add(eztVar3);
                        arrayDeque.push(eztVar3);
                        if (eztVar3.getGroupName() != null) {
                            xy0Var.put(eztVar3.getGroupName(), eztVar3);
                        }
                        iztVar3.a = iztVar3.a;
                    }
                    i4 = 1;
                }
                i3 = i4;
                i2 = 3;
            } else {
                i = depth;
                i2 = i6;
                i3 = 1;
                if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i6 = i2;
            i8 = i3;
            depth = i;
            i7 = 2;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.c = a(iztVar.c, iztVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        izt iztVar = this.b;
        if (iztVar == null) {
            return false;
        }
        hzt hztVar = iztVar.b;
        if (hztVar.n == null) {
            hztVar.n = Boolean.valueOf(hztVar.g.a());
        }
        if (hztVar.n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.b.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            izt iztVar = this.b;
            izt iztVar2 = new izt();
            iztVar2.c = null;
            iztVar2.d = j;
            if (iztVar != null) {
                iztVar2.a = iztVar.a;
                hzt hztVar = new hzt(iztVar.b);
                iztVar2.b = hztVar;
                if (iztVar.b.e != null) {
                    hztVar.e = new Paint(iztVar.b.e);
                }
                if (iztVar.b.d != null) {
                    iztVar2.b.d = new Paint(iztVar.b.d);
                }
                iztVar2.c = iztVar.c;
                iztVar2.d = iztVar.d;
                iztVar2.e = iztVar.e;
            }
            this.b = iztVar2;
            this.e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        izt iztVar = this.b;
        ColorStateList colorStateList = iztVar.c;
        if (colorStateList == null || (mode = iztVar.d) == null) {
            z = false;
        } else {
            this.c = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        hzt hztVar = iztVar.b;
        if (hztVar.n == null) {
            hztVar.n = Boolean.valueOf(hztVar.g.a());
        }
        if (hztVar.n.booleanValue()) {
            boolean b = iztVar.b.g.b(iArr);
            iztVar.k |= b;
            if (b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        izt iztVar = this.b;
        if (iztVar.c != colorStateList) {
            iztVar.c = colorStateList;
            this.c = a(colorStateList, iztVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        izt iztVar = this.b;
        if (iztVar.d != mode) {
            iztVar.d = mode;
            this.c = a(iztVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public kzt(izt iztVar) {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.b = iztVar;
        this.c = a(iztVar.c, iztVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
