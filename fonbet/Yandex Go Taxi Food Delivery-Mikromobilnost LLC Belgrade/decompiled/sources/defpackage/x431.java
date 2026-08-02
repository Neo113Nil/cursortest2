package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes10.dex */
public final class x431 extends y431 {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    /* JADX WARN: Multi-variable type inference failed */
    public x431(x431 x431Var, w53 w53Var) {
        v431 v431Var;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = x431Var.c;
        this.d = x431Var.d;
        this.e = x431Var.e;
        this.f = x431Var.f;
        this.g = x431Var.g;
        this.h = x431Var.h;
        this.i = x431Var.i;
        String str = x431Var.k;
        this.k = str;
        if (str != null) {
            w53Var.put(str, this);
        }
        matrix.set(x431Var.j);
        ArrayList arrayList = x431Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof x431) {
                this.b.add(new x431((x431) obj, w53Var));
            } else {
                if (obj instanceof w431) {
                    w431 w431Var = (w431) obj;
                    w431 w431Var2 = new w431(w431Var);
                    w431Var2.e = 0.0f;
                    w431Var2.g = 1.0f;
                    w431Var2.h = 1.0f;
                    w431Var2.i = 0.0f;
                    w431Var2.j = 1.0f;
                    w431Var2.k = 0.0f;
                    w431Var2.l = Paint.Cap.BUTT;
                    w431Var2.m = Paint.Join.MITER;
                    w431Var2.n = 4.0f;
                    w431Var2.d = w431Var.d;
                    w431Var2.e = w431Var.e;
                    w431Var2.g = w431Var.g;
                    w431Var2.f = w431Var.f;
                    w431Var2.c = w431Var.c;
                    w431Var2.h = w431Var.h;
                    w431Var2.i = w431Var.i;
                    w431Var2.j = w431Var.j;
                    w431Var2.k = w431Var.k;
                    w431Var2.l = w431Var.l;
                    w431Var2.m = w431Var.m;
                    w431Var2.n = w431Var.n;
                    v431Var = w431Var2;
                } else {
                    if (!(obj instanceof v431)) {
                        ny61.r("Unknown object in the tree!");
                        throw null;
                    }
                    v431Var = new v431((v431) obj);
                }
                this.b.add(v431Var);
                Object obj2 = v431Var.b;
                if (obj2 != null) {
                    w53Var.put(obj2, v431Var);
                }
            }
        }
    }

    @Override // defpackage.y431
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((y431) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.y431
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((y431) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray i = uvb1.i(resources, theme, attributeSet, z0s.b);
        float f = this.c;
        if (uvb1.h(xmlPullParser, "rotation")) {
            f = i.getFloat(5, f);
        }
        this.c = f;
        this.d = i.getFloat(1, this.d);
        this.e = i.getFloat(2, this.e);
        float f2 = this.f;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
            f2 = i.getFloat(3, f2);
        }
        this.f = f2;
        float f3 = this.g;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
            f3 = i.getFloat(4, f3);
        }
        this.g = f3;
        float f4 = this.h;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
            f4 = i.getFloat(6, f4);
        }
        this.h = f4;
        float f5 = this.i;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
            f5 = i.getFloat(7, f5);
        }
        this.i = f5;
        String string = i.getString(0);
        if (string != null) {
            this.k = string;
        }
        d();
        i.recycle();
    }

    public final void d() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            d();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            d();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            d();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            d();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            d();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            d();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            d();
        }
    }

    public x431() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }
}
