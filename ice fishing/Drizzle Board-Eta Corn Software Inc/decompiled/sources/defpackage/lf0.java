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
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class lf0 extends cf0 {
    public static final PorterDuff.Mode k3x7lurq = PorterDuff.Mode.SRC_IN;
    public jf0 MdtA4re8;
    public boolean P7K7Inc8;
    public final float[] Qr9iLBAD;
    public ColorFilter VgvYg0wo;
    public boolean b2ZJblxo;
    public final Rect eVhOlqcC;
    public final Matrix jb9XjC4I;
    public PorterDuffColorFilter wxUZMvaN;

    public lf0() {
        this.b2ZJblxo = true;
        this.Qr9iLBAD = new float[9];
        this.jb9XjC4I = new Matrix();
        this.eVhOlqcC = new Rect();
        jf0 jf0Var = new jf0();
        jf0Var.MdtA4re8 = null;
        jf0Var.wxUZMvaN = k3x7lurq;
        jf0Var.NCTxEWno = new if0();
        this.MdtA4re8 = jf0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.NCTxEWno;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.eVhOlqcC;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.VgvYg0wo;
        if (colorFilter == null) {
            colorFilter = this.wxUZMvaN;
        }
        Matrix matrix = this.jb9XjC4I;
        canvas.getMatrix(matrix);
        float[] fArr = this.Qr9iLBAD;
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
        jf0 jf0Var = this.MdtA4re8;
        Bitmap bitmap = jf0Var.P7K7Inc8;
        if (bitmap == null || min != bitmap.getWidth() || min2 != jf0Var.P7K7Inc8.getHeight()) {
            jf0Var.P7K7Inc8 = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            jf0Var.k3x7lurq = true;
        }
        boolean z = this.b2ZJblxo;
        jf0 jf0Var2 = this.MdtA4re8;
        if (!z) {
            jf0Var2.P7K7Inc8.eraseColor(0);
            Canvas canvas2 = new Canvas(jf0Var2.P7K7Inc8);
            if0 if0Var = jf0Var2.NCTxEWno;
            if0Var.qoPGr6Ce(if0Var.b2ZJblxo, if0.sjUBp5pO, canvas2, min, min2);
        } else if (jf0Var2.k3x7lurq || jf0Var2.b2ZJblxo != jf0Var2.MdtA4re8 || jf0Var2.Qr9iLBAD != jf0Var2.wxUZMvaN || jf0Var2.eVhOlqcC != jf0Var2.VgvYg0wo || jf0Var2.jb9XjC4I != jf0Var2.NCTxEWno.getRootAlpha()) {
            jf0 jf0Var3 = this.MdtA4re8;
            jf0Var3.P7K7Inc8.eraseColor(0);
            Canvas canvas3 = new Canvas(jf0Var3.P7K7Inc8);
            if0 if0Var2 = jf0Var3.NCTxEWno;
            if0Var2.qoPGr6Ce(if0Var2.b2ZJblxo, if0.sjUBp5pO, canvas3, min, min2);
            jf0 jf0Var4 = this.MdtA4re8;
            jf0Var4.b2ZJblxo = jf0Var4.MdtA4re8;
            jf0Var4.Qr9iLBAD = jf0Var4.wxUZMvaN;
            jf0Var4.jb9XjC4I = jf0Var4.NCTxEWno.getRootAlpha();
            jf0Var4.eVhOlqcC = jf0Var4.VgvYg0wo;
            jf0Var4.k3x7lurq = false;
        }
        jf0 jf0Var5 = this.MdtA4re8;
        if (jf0Var5.NCTxEWno.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (jf0Var5.ow5vqvCr == null) {
                Paint paint2 = new Paint();
                jf0Var5.ow5vqvCr = paint2;
                paint2.setFilterBitmap(true);
            }
            jf0Var5.ow5vqvCr.setAlpha(jf0Var5.NCTxEWno.getRootAlpha());
            jf0Var5.ow5vqvCr.setColorFilter(colorFilter);
            paint = jf0Var5.ow5vqvCr;
        }
        canvas.drawBitmap(jf0Var5.P7K7Inc8, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.NCTxEWno;
        return drawable != null ? drawable.getAlpha() : this.MdtA4re8.NCTxEWno.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.MdtA4re8.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.NCTxEWno;
        return drawable != null ? drawable.getColorFilter() : this.VgvYg0wo;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.NCTxEWno != null) {
            return new kf0(this.NCTxEWno.getConstantState());
        }
        this.MdtA4re8.qoPGr6Ce = getChangingConfigurations();
        return this.MdtA4re8;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.NCTxEWno;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.MdtA4re8.NCTxEWno.jb9XjC4I;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.NCTxEWno;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.MdtA4re8.NCTxEWno.Qr9iLBAD;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        char c;
        int i2;
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        jf0 jf0Var = this.MdtA4re8;
        jf0Var.NCTxEWno = new if0();
        TypedArray b2ZJblxo = n50.b2ZJblxo(resources, theme, attributeSet, fn.qoPGr6Ce);
        jf0 jf0Var2 = this.MdtA4re8;
        if0 if0Var = jf0Var2.NCTxEWno;
        int i3 = !n50.wxUZMvaN(xmlPullParser, "tintMode") ? -1 : b2ZJblxo.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i3 != 5) {
            if (i3 != 9) {
                switch (i3) {
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
        jf0Var2.wxUZMvaN = mode;
        ColorStateList colorStateList = null;
        int i4 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            b2ZJblxo.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 < 28 || i5 > 31) {
                Resources resources2 = b2ZJblxo.getResources();
                int resourceId = b2ZJblxo.getResourceId(1, 0);
                ThreadLocal threadLocal = f6.qoPGr6Ce;
                try {
                    colorStateList = f6.qoPGr6Ce(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            jf0Var2.MdtA4re8 = colorStateList2;
        }
        boolean z = jf0Var2.VgvYg0wo;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = b2ZJblxo.getBoolean(5, z);
        }
        jf0Var2.VgvYg0wo = z;
        float f = if0Var.eVhOlqcC;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = b2ZJblxo.getFloat(7, f);
        }
        if0Var.eVhOlqcC = f;
        float f2 = if0Var.k3x7lurq;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = b2ZJblxo.getFloat(8, f2);
        }
        if0Var.k3x7lurq = f2;
        if (if0Var.eVhOlqcC <= 0.0f) {
            throw new XmlPullParserException(b2ZJblxo.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(b2ZJblxo.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        if0Var.Qr9iLBAD = b2ZJblxo.getDimension(3, if0Var.Qr9iLBAD);
        float dimension = b2ZJblxo.getDimension(2, if0Var.jb9XjC4I);
        if0Var.jb9XjC4I = dimension;
        if (if0Var.Qr9iLBAD <= 0.0f) {
            throw new XmlPullParserException(b2ZJblxo.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(b2ZJblxo.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = if0Var.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = b2ZJblxo.getFloat(4, alpha);
        }
        if0Var.setAlpha(alpha);
        String string = b2ZJblxo.getString(0);
        if (string != null) {
            if0Var.OnDfzHZD = string;
            if0Var.lDXGDhIF.put(string, if0Var);
        }
        b2ZJblxo.recycle();
        jf0Var.qoPGr6Ce = getChangingConfigurations();
        jf0Var.k3x7lurq = true;
        jf0 jf0Var3 = this.MdtA4re8;
        if0 if0Var2 = jf0Var3.NCTxEWno;
        ArrayDeque arrayDeque = new ArrayDeque();
        ff0 ff0Var = if0Var2.b2ZJblxo;
        x0 x0Var = if0Var2.lDXGDhIF;
        arrayDeque.push(ff0Var);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                ff0 ff0Var2 = (ff0) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    ef0 ef0Var = new ef0();
                    ef0Var.VgvYg0wo = 0.0f;
                    ef0Var.b2ZJblxo = 1.0f;
                    ef0Var.Qr9iLBAD = 1.0f;
                    ef0Var.jb9XjC4I = 0.0f;
                    ef0Var.eVhOlqcC = 1.0f;
                    ef0Var.k3x7lurq = 0.0f;
                    Paint.Cap cap = Paint.Cap.BUTT;
                    ef0Var.ow5vqvCr = cap;
                    Paint.Join join = Paint.Join.MITER;
                    ef0Var.OnDfzHZD = join;
                    ef0Var.ygLcUYwZ = 4.0f;
                    TypedArray b2ZJblxo2 = n50.b2ZJblxo(resources, theme, attributeSet, fn.MdtA4re8);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = b2ZJblxo2.getString(0);
                        if (string2 != null) {
                            ef0Var.NCTxEWno = string2;
                        }
                        String string3 = b2ZJblxo2.getString(2);
                        if (string3 != null) {
                            ef0Var.qoPGr6Ce = w30.lDXGDhIF(string3);
                        }
                        ef0Var.P7K7Inc8 = n50.NCTxEWno(b2ZJblxo2, xmlPullParser, theme, "fillColor", 1);
                        float f3 = ef0Var.Qr9iLBAD;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = b2ZJblxo2.getFloat(12, f3);
                        }
                        ef0Var.Qr9iLBAD = f3;
                        int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? b2ZJblxo2.getInt(8, -1) : -1;
                        ef0Var.ow5vqvCr = i6 != 0 ? i6 != 1 ? i6 != 2 ? ef0Var.ow5vqvCr : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                        int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? b2ZJblxo2.getInt(9, -1) : -1;
                        ef0Var.OnDfzHZD = i7 != 0 ? i7 != 1 ? i7 != 2 ? ef0Var.OnDfzHZD : Paint.Join.BEVEL : Paint.Join.ROUND : join;
                        float f4 = ef0Var.ygLcUYwZ;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = b2ZJblxo2.getFloat(10, f4);
                        }
                        ef0Var.ygLcUYwZ = f4;
                        ef0Var.wxUZMvaN = n50.NCTxEWno(b2ZJblxo2, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = ef0Var.b2ZJblxo;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = b2ZJblxo2.getFloat(11, f5);
                        }
                        ef0Var.b2ZJblxo = f5;
                        float f6 = ef0Var.VgvYg0wo;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = b2ZJblxo2.getFloat(4, f6);
                        }
                        ef0Var.VgvYg0wo = f6;
                        float f7 = ef0Var.eVhOlqcC;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = b2ZJblxo2.getFloat(6, f7);
                        }
                        ef0Var.eVhOlqcC = f7;
                        float f8 = ef0Var.k3x7lurq;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = b2ZJblxo2.getFloat(7, f8);
                        }
                        ef0Var.k3x7lurq = f8;
                        float f9 = ef0Var.jb9XjC4I;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = b2ZJblxo2.getFloat(5, f9);
                        }
                        ef0Var.jb9XjC4I = f9;
                        int i8 = ef0Var.MdtA4re8;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i8 = b2ZJblxo2.getInt(13, i8);
                        }
                        ef0Var.MdtA4re8 = i8;
                    }
                    b2ZJblxo2.recycle();
                    ff0Var2.NCTxEWno.add(ef0Var);
                    if (ef0Var.getPathName() != null) {
                        x0Var.put(ef0Var.getPathName(), ef0Var);
                    }
                    jf0Var3.qoPGr6Ce = jf0Var3.qoPGr6Ce;
                    z2 = false;
                    c = '\b';
                } else {
                    c = '\b';
                    if ("clip-path".equals(name)) {
                        df0 df0Var = new df0();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray b2ZJblxo3 = n50.b2ZJblxo(resources, theme, attributeSet, fn.wxUZMvaN);
                            String string4 = b2ZJblxo3.getString(0);
                            if (string4 != null) {
                                df0Var.NCTxEWno = string4;
                            }
                            String string5 = b2ZJblxo3.getString(1);
                            if (string5 != null) {
                                df0Var.qoPGr6Ce = w30.lDXGDhIF(string5);
                            }
                            df0Var.MdtA4re8 = !n50.wxUZMvaN(xmlPullParser, "fillType") ? 0 : b2ZJblxo3.getInt(2, 0);
                            b2ZJblxo3.recycle();
                        }
                        ff0Var2.NCTxEWno.add(df0Var);
                        if (df0Var.getPathName() != null) {
                            x0Var.put(df0Var.getPathName(), df0Var);
                        }
                        jf0Var3.qoPGr6Ce = jf0Var3.qoPGr6Ce;
                    } else if ("group".equals(name)) {
                        ff0 ff0Var3 = new ff0();
                        TypedArray b2ZJblxo4 = n50.b2ZJblxo(resources, theme, attributeSet, fn.NCTxEWno);
                        float f10 = ff0Var3.MdtA4re8;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "rotation") != null) {
                            f10 = b2ZJblxo4.getFloat(5, f10);
                        }
                        ff0Var3.MdtA4re8 = f10;
                        ff0Var3.wxUZMvaN = b2ZJblxo4.getFloat(1, ff0Var3.wxUZMvaN);
                        ff0Var3.VgvYg0wo = b2ZJblxo4.getFloat(2, ff0Var3.VgvYg0wo);
                        float f11 = ff0Var3.P7K7Inc8;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f11 = b2ZJblxo4.getFloat(3, f11);
                        }
                        ff0Var3.P7K7Inc8 = f11;
                        float f12 = ff0Var3.b2ZJblxo;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f12 = b2ZJblxo4.getFloat(4, f12);
                        }
                        ff0Var3.b2ZJblxo = f12;
                        float f13 = ff0Var3.Qr9iLBAD;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f13 = b2ZJblxo4.getFloat(6, f13);
                        }
                        ff0Var3.Qr9iLBAD = f13;
                        float f14 = ff0Var3.jb9XjC4I;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f14 = b2ZJblxo4.getFloat(7, f14);
                        }
                        ff0Var3.jb9XjC4I = f14;
                        String string6 = b2ZJblxo4.getString(0);
                        if (string6 != null) {
                            ff0Var3.k3x7lurq = string6;
                        }
                        ff0Var3.MdtA4re8();
                        b2ZJblxo4.recycle();
                        ff0Var2.NCTxEWno.add(ff0Var3);
                        arrayDeque.push(ff0Var3);
                        if (ff0Var3.getGroupName() != null) {
                            x0Var.put(ff0Var3.getGroupName(), ff0Var3);
                        }
                        jf0Var3.qoPGr6Ce = jf0Var3.qoPGr6Ce;
                    }
                }
                i2 = 1;
            } else {
                i = depth;
                c = '\b';
                i2 = 1;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i4 = i2;
            depth = i;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.wxUZMvaN = qoPGr6Ce(jf0Var.MdtA4re8, jf0Var.wxUZMvaN);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.NCTxEWno;
        return drawable != null ? drawable.isAutoMirrored() : this.MdtA4re8.VgvYg0wo;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        jf0 jf0Var = this.MdtA4re8;
        if (jf0Var == null) {
            return false;
        }
        if0 if0Var = jf0Var.NCTxEWno;
        Boolean bool = if0Var.ygLcUYwZ;
        if (bool == null) {
            bool = Boolean.valueOf(if0Var.b2ZJblxo.qoPGr6Ce());
            if0Var.ygLcUYwZ = bool;
        }
        if (bool.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.MdtA4re8.MdtA4re8;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.P7K7Inc8 && super.mutate() == this) {
            jf0 jf0Var = this.MdtA4re8;
            jf0 jf0Var2 = new jf0();
            jf0Var2.MdtA4re8 = null;
            jf0Var2.wxUZMvaN = k3x7lurq;
            if (jf0Var != null) {
                jf0Var2.qoPGr6Ce = jf0Var.qoPGr6Ce;
                if0 if0Var = new if0(jf0Var.NCTxEWno);
                jf0Var2.NCTxEWno = if0Var;
                if (jf0Var.NCTxEWno.VgvYg0wo != null) {
                    if0Var.VgvYg0wo = new Paint(jf0Var.NCTxEWno.VgvYg0wo);
                }
                if (jf0Var.NCTxEWno.wxUZMvaN != null) {
                    jf0Var2.NCTxEWno.wxUZMvaN = new Paint(jf0Var.NCTxEWno.wxUZMvaN);
                }
                jf0Var2.MdtA4re8 = jf0Var.MdtA4re8;
                jf0Var2.wxUZMvaN = jf0Var.wxUZMvaN;
                jf0Var2.VgvYg0wo = jf0Var.VgvYg0wo;
            }
            this.MdtA4re8 = jf0Var2;
            this.P7K7Inc8 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        jf0 jf0Var = this.MdtA4re8;
        ColorStateList colorStateList = jf0Var.MdtA4re8;
        if (colorStateList == null || (mode = jf0Var.wxUZMvaN) == null) {
            z = false;
        } else {
            this.wxUZMvaN = qoPGr6Ce(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if0 if0Var = jf0Var.NCTxEWno;
        Boolean bool = if0Var.ygLcUYwZ;
        if (bool == null) {
            bool = Boolean.valueOf(if0Var.b2ZJblxo.qoPGr6Ce());
            if0Var.ygLcUYwZ = bool;
        }
        if (bool.booleanValue()) {
            boolean NCTxEWno = jf0Var.NCTxEWno.b2ZJblxo.NCTxEWno(iArr);
            jf0Var.k3x7lurq |= NCTxEWno;
            if (NCTxEWno) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public final PorterDuffColorFilter qoPGr6Ce(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.MdtA4re8.NCTxEWno.getRootAlpha() != i) {
            this.MdtA4re8.NCTxEWno.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.MdtA4re8.VgvYg0wo = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.VgvYg0wo = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        jf0 jf0Var = this.MdtA4re8;
        if (jf0Var.MdtA4re8 != colorStateList) {
            jf0Var.MdtA4re8 = colorStateList;
            this.wxUZMvaN = qoPGr6Ce(colorStateList, jf0Var.wxUZMvaN);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        jf0 jf0Var = this.MdtA4re8;
        if (jf0Var.wxUZMvaN != mode) {
            jf0Var.wxUZMvaN = mode;
            this.wxUZMvaN = qoPGr6Ce(jf0Var.MdtA4re8, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.NCTxEWno;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public lf0(jf0 jf0Var) {
        this.b2ZJblxo = true;
        this.Qr9iLBAD = new float[9];
        this.jb9XjC4I = new Matrix();
        this.eVhOlqcC = new Rect();
        this.MdtA4re8 = jf0Var;
        this.wxUZMvaN = qoPGr6Ce(jf0Var.MdtA4re8, jf0Var.wxUZMvaN);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.NCTxEWno;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
