package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ff0 extends gf0 {
    public float MdtA4re8;
    public final ArrayList NCTxEWno;
    public float P7K7Inc8;
    public float Qr9iLBAD;
    public float VgvYg0wo;
    public float b2ZJblxo;
    public final Matrix eVhOlqcC;
    public float jb9XjC4I;
    public String k3x7lurq;
    public final Matrix qoPGr6Ce;
    public float wxUZMvaN;

    /* JADX WARN: Multi-variable type inference failed */
    public ff0(ff0 ff0Var, x0 x0Var) {
        df0 df0Var;
        this.qoPGr6Ce = new Matrix();
        this.NCTxEWno = new ArrayList();
        this.MdtA4re8 = 0.0f;
        this.wxUZMvaN = 0.0f;
        this.VgvYg0wo = 0.0f;
        this.P7K7Inc8 = 1.0f;
        this.b2ZJblxo = 1.0f;
        this.Qr9iLBAD = 0.0f;
        this.jb9XjC4I = 0.0f;
        Matrix matrix = new Matrix();
        this.eVhOlqcC = matrix;
        this.k3x7lurq = null;
        this.MdtA4re8 = ff0Var.MdtA4re8;
        this.wxUZMvaN = ff0Var.wxUZMvaN;
        this.VgvYg0wo = ff0Var.VgvYg0wo;
        this.P7K7Inc8 = ff0Var.P7K7Inc8;
        this.b2ZJblxo = ff0Var.b2ZJblxo;
        this.Qr9iLBAD = ff0Var.Qr9iLBAD;
        this.jb9XjC4I = ff0Var.jb9XjC4I;
        String str = ff0Var.k3x7lurq;
        this.k3x7lurq = str;
        if (str != null) {
            x0Var.put(str, this);
        }
        matrix.set(ff0Var.eVhOlqcC);
        ArrayList arrayList = ff0Var.NCTxEWno;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof ff0) {
                this.NCTxEWno.add(new ff0((ff0) obj, x0Var));
            } else {
                if (obj instanceof ef0) {
                    ef0 ef0Var = (ef0) obj;
                    ef0 ef0Var2 = new ef0(ef0Var);
                    ef0Var2.VgvYg0wo = 0.0f;
                    ef0Var2.b2ZJblxo = 1.0f;
                    ef0Var2.Qr9iLBAD = 1.0f;
                    ef0Var2.jb9XjC4I = 0.0f;
                    ef0Var2.eVhOlqcC = 1.0f;
                    ef0Var2.k3x7lurq = 0.0f;
                    ef0Var2.ow5vqvCr = Paint.Cap.BUTT;
                    ef0Var2.OnDfzHZD = Paint.Join.MITER;
                    ef0Var2.ygLcUYwZ = 4.0f;
                    ef0Var2.wxUZMvaN = ef0Var.wxUZMvaN;
                    ef0Var2.VgvYg0wo = ef0Var.VgvYg0wo;
                    ef0Var2.b2ZJblxo = ef0Var.b2ZJblxo;
                    ef0Var2.P7K7Inc8 = ef0Var.P7K7Inc8;
                    ef0Var2.MdtA4re8 = ef0Var.MdtA4re8;
                    ef0Var2.Qr9iLBAD = ef0Var.Qr9iLBAD;
                    ef0Var2.jb9XjC4I = ef0Var.jb9XjC4I;
                    ef0Var2.eVhOlqcC = ef0Var.eVhOlqcC;
                    ef0Var2.k3x7lurq = ef0Var.k3x7lurq;
                    ef0Var2.ow5vqvCr = ef0Var.ow5vqvCr;
                    ef0Var2.OnDfzHZD = ef0Var.OnDfzHZD;
                    ef0Var2.ygLcUYwZ = ef0Var.ygLcUYwZ;
                    df0Var = ef0Var2;
                } else {
                    if (!(obj instanceof df0)) {
                        m1.Ey6iv0m0("Unknown object in the tree!");
                        throw null;
                    }
                    df0Var = new df0((df0) obj);
                }
                this.NCTxEWno.add(df0Var);
                Object obj2 = df0Var.NCTxEWno;
                if (obj2 != null) {
                    x0Var.put(obj2, df0Var);
                }
            }
        }
    }

    public final void MdtA4re8() {
        Matrix matrix = this.eVhOlqcC;
        matrix.reset();
        matrix.postTranslate(-this.wxUZMvaN, -this.VgvYg0wo);
        matrix.postScale(this.P7K7Inc8, this.b2ZJblxo);
        matrix.postRotate(this.MdtA4re8, 0.0f, 0.0f);
        matrix.postTranslate(this.Qr9iLBAD + this.wxUZMvaN, this.jb9XjC4I + this.VgvYg0wo);
    }

    @Override // defpackage.gf0
    public final boolean NCTxEWno(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.NCTxEWno;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((gf0) arrayList.get(i)).NCTxEWno(iArr);
            i++;
        }
    }

    public String getGroupName() {
        return this.k3x7lurq;
    }

    public Matrix getLocalMatrix() {
        return this.eVhOlqcC;
    }

    public float getPivotX() {
        return this.wxUZMvaN;
    }

    public float getPivotY() {
        return this.VgvYg0wo;
    }

    public float getRotation() {
        return this.MdtA4re8;
    }

    public float getScaleX() {
        return this.P7K7Inc8;
    }

    public float getScaleY() {
        return this.b2ZJblxo;
    }

    public float getTranslateX() {
        return this.Qr9iLBAD;
    }

    public float getTranslateY() {
        return this.jb9XjC4I;
    }

    @Override // defpackage.gf0
    public final boolean qoPGr6Ce() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.NCTxEWno;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((gf0) arrayList.get(i)).qoPGr6Ce()) {
                return true;
            }
            i++;
        }
    }

    public void setPivotX(float f) {
        if (f != this.wxUZMvaN) {
            this.wxUZMvaN = f;
            MdtA4re8();
        }
    }

    public void setPivotY(float f) {
        if (f != this.VgvYg0wo) {
            this.VgvYg0wo = f;
            MdtA4re8();
        }
    }

    public void setRotation(float f) {
        if (f != this.MdtA4re8) {
            this.MdtA4re8 = f;
            MdtA4re8();
        }
    }

    public void setScaleX(float f) {
        if (f != this.P7K7Inc8) {
            this.P7K7Inc8 = f;
            MdtA4re8();
        }
    }

    public void setScaleY(float f) {
        if (f != this.b2ZJblxo) {
            this.b2ZJblxo = f;
            MdtA4re8();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.Qr9iLBAD) {
            this.Qr9iLBAD = f;
            MdtA4re8();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.jb9XjC4I) {
            this.jb9XjC4I = f;
            MdtA4re8();
        }
    }

    public ff0() {
        this.qoPGr6Ce = new Matrix();
        this.NCTxEWno = new ArrayList();
        this.MdtA4re8 = 0.0f;
        this.wxUZMvaN = 0.0f;
        this.VgvYg0wo = 0.0f;
        this.P7K7Inc8 = 1.0f;
        this.b2ZJblxo = 1.0f;
        this.Qr9iLBAD = 0.0f;
        this.jb9XjC4I = 0.0f;
        this.eVhOlqcC = new Matrix();
        this.k3x7lurq = null;
    }
}
