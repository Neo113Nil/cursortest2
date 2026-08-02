package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes10.dex */
public final class w431 extends z431 {
    public o3 d;
    public o3 f;
    public float e = 0.0f;
    public float g = 1.0f;
    public float h = 1.0f;
    public float i = 0.0f;
    public float j = 1.0f;
    public float k = 0.0f;
    public Paint.Cap l = Paint.Cap.BUTT;
    public Paint.Join m = Paint.Join.MITER;
    public float n = 4.0f;

    @Override // defpackage.y431
    public final boolean a() {
        return this.f.w() || this.d.w();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.y431
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z;
        o3 o3Var;
        o3 o3Var2 = this.f;
        boolean z2 = true;
        if (o3Var2.w()) {
            ColorStateList colorStateList = (ColorStateList) o3Var2.c;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != o3Var2.b) {
                o3Var2.b = colorForState;
                z = true;
                o3Var = this.d;
                if (o3Var.w()) {
                    ColorStateList colorStateList2 = (ColorStateList) o3Var.c;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != o3Var.b) {
                        o3Var.b = colorForState2;
                        return z | z2;
                    }
                }
                z2 = false;
                return z | z2;
            }
        }
        z = false;
        o3Var = this.d;
        if (o3Var.w()) {
        }
        z2 = false;
        return z | z2;
    }

    public final void d(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray i = uvb1.i(resources, theme, attributeSet, z0s.c);
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
            String string = i.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = i.getString(2);
            if (string2 != null) {
                this.a = n891.h(string2);
            }
            this.f = uvb1.e(i, xmlPullParser, theme, "fillColor", 1);
            float f = this.h;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                f = i.getFloat(12, f);
            }
            this.h = f;
            int i2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? i.getInt(8, -1) : -1;
            Paint.Cap cap = this.l;
            if (i2 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i2 == 1) {
                cap = Paint.Cap.ROUND;
            } else if (i2 == 2) {
                cap = Paint.Cap.SQUARE;
            }
            this.l = cap;
            int i3 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? i.getInt(9, -1) : -1;
            Paint.Join join = this.m;
            if (i3 == 0) {
                join = Paint.Join.MITER;
            } else if (i3 == 1) {
                join = Paint.Join.ROUND;
            } else if (i3 == 2) {
                join = Paint.Join.BEVEL;
            }
            this.m = join;
            float f2 = this.n;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                f2 = i.getFloat(10, f2);
            }
            this.n = f2;
            this.d = uvb1.e(i, xmlPullParser, theme, "strokeColor", 3);
            float f3 = this.g;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                f3 = i.getFloat(11, f3);
            }
            this.g = f3;
            float f4 = this.e;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                f4 = i.getFloat(4, f4);
            }
            this.e = f4;
            float f5 = this.j;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                f5 = i.getFloat(6, f5);
            }
            this.j = f5;
            float f6 = this.k;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                f6 = i.getFloat(7, f6);
            }
            this.k = f6;
            float f7 = this.i;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                f7 = i.getFloat(5, f7);
            }
            this.i = f7;
            int i4 = this.c;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                i4 = i.getInt(13, i4);
            }
            this.c = i4;
        }
        i.recycle();
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f.b;
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    public int getStrokeColor() {
        return this.d.b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f) {
        this.h = f;
    }

    public void setFillColor(int i) {
        this.f.b = i;
    }

    public void setStrokeAlpha(float f) {
        this.g = f;
    }

    public void setStrokeColor(int i) {
        this.d.b = i;
    }

    public void setStrokeWidth(float f) {
        this.e = f;
    }

    public void setTrimPathEnd(float f) {
        this.j = f;
    }

    public void setTrimPathOffset(float f) {
        this.k = f;
    }

    public void setTrimPathStart(float f) {
        this.i = f;
    }
}
