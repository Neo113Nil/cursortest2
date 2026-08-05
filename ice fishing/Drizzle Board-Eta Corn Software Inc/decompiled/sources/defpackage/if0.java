package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class if0 {
    public static final Matrix sjUBp5pO = new Matrix();
    public final Matrix MdtA4re8;
    public final Path NCTxEWno;
    public String OnDfzHZD;
    public PathMeasure P7K7Inc8;
    public float Qr9iLBAD;
    public Paint VgvYg0wo;
    public final ff0 b2ZJblxo;
    public float eVhOlqcC;
    public float jb9XjC4I;
    public float k3x7lurq;
    public final x0 lDXGDhIF;
    public int ow5vqvCr;
    public final Path qoPGr6Ce;
    public Paint wxUZMvaN;
    public Boolean ygLcUYwZ;

    public if0(if0 if0Var) {
        this.MdtA4re8 = new Matrix();
        this.Qr9iLBAD = 0.0f;
        this.jb9XjC4I = 0.0f;
        this.eVhOlqcC = 0.0f;
        this.k3x7lurq = 0.0f;
        this.ow5vqvCr = 255;
        this.OnDfzHZD = null;
        this.ygLcUYwZ = null;
        x0 x0Var = new x0(0);
        this.lDXGDhIF = x0Var;
        this.b2ZJblxo = new ff0(if0Var.b2ZJblxo, x0Var);
        this.qoPGr6Ce = new Path(if0Var.qoPGr6Ce);
        this.NCTxEWno = new Path(if0Var.NCTxEWno);
        this.Qr9iLBAD = if0Var.Qr9iLBAD;
        this.jb9XjC4I = if0Var.jb9XjC4I;
        this.eVhOlqcC = if0Var.eVhOlqcC;
        this.k3x7lurq = if0Var.k3x7lurq;
        this.ow5vqvCr = if0Var.ow5vqvCr;
        this.OnDfzHZD = if0Var.OnDfzHZD;
        String str = if0Var.OnDfzHZD;
        if (str != null) {
            x0Var.put(str, this);
        }
        this.ygLcUYwZ = if0Var.ygLcUYwZ;
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.ow5vqvCr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void qoPGr6Ce(ff0 ff0Var, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        float f2;
        Matrix matrix2 = ff0Var.qoPGr6Ce;
        ArrayList arrayList = ff0Var.NCTxEWno;
        matrix2.set(matrix);
        Matrix matrix3 = ff0Var.qoPGr6Ce;
        matrix3.preConcat(ff0Var.eVhOlqcC);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            gf0 gf0Var = (gf0) arrayList.get(i5);
            if (gf0Var instanceof ff0) {
                qoPGr6Ce((ff0) gf0Var, matrix3, canvas, i, i2);
            } else if (gf0Var instanceof hf0) {
                hf0 hf0Var = (hf0) gf0Var;
                float f3 = i / this.eVhOlqcC;
                float f4 = i2 / this.k3x7lurq;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.MdtA4re8;
                matrix4.set(matrix3);
                matrix4.postScale(f3, f4);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c], fArr[1]);
                boolean z = c;
                i3 = i5;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f5) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.qoPGr6Ce;
                    path.reset();
                    kz[] kzVarArr = hf0Var.qoPGr6Ce;
                    if (kzVarArr != null) {
                        w30.pRiPUEwG(kzVarArr, path);
                    }
                    Path path2 = this.NCTxEWno;
                    path2.reset();
                    if (hf0Var instanceof df0) {
                        path2.setFillType(hf0Var.MdtA4re8 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        ef0 ef0Var = (ef0) hf0Var;
                        float f6 = ef0Var.jb9XjC4I;
                        if (f6 != 0.0f || ef0Var.eVhOlqcC != 1.0f) {
                            float f7 = ef0Var.k3x7lurq;
                            float f8 = (f6 + f7) % 1.0f;
                            float f9 = (ef0Var.eVhOlqcC + f7) % 1.0f;
                            PathMeasure pathMeasure = this.P7K7Inc8;
                            PathMeasure pathMeasure2 = pathMeasure;
                            if (pathMeasure == null) {
                                PathMeasure pathMeasure3 = new PathMeasure();
                                this.P7K7Inc8 = pathMeasure3;
                                pathMeasure2 = pathMeasure3;
                            }
                            pathMeasure2.setPath(path, z);
                            float length = this.P7K7Inc8.getLength();
                            float f10 = f8 * length;
                            float f11 = f9 * length;
                            path.reset();
                            PathMeasure pathMeasure4 = this.P7K7Inc8;
                            if (f10 > f11) {
                                pathMeasure4.getSegment(f10, length, path, true);
                                f = 0.0f;
                                this.P7K7Inc8.getSegment(0.0f, f11, path, true);
                            } else {
                                f = 0.0f;
                                pathMeasure4.getSegment(f10, f11, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        rpbmbhyp rpbmbhypVar = ef0Var.P7K7Inc8;
                        if (((Shader) rpbmbhypVar.NCTxEWno) == null && rpbmbhypVar.qoPGr6Ce == 0) {
                            f2 = 255.0f;
                            i4 = 16777215;
                        } else {
                            if (this.VgvYg0wo == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.VgvYg0wo = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.VgvYg0wo;
                            Shader shader = (Shader) rpbmbhypVar.NCTxEWno;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(ef0Var.Qr9iLBAD * 255.0f));
                                f2 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = rpbmbhypVar.qoPGr6Ce;
                                float f12 = ef0Var.Qr9iLBAD;
                                PorterDuff.Mode mode = lf0.k3x7lurq;
                                f2 = 255.0f;
                                paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(ef0Var.MdtA4re8 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        rpbmbhyp rpbmbhypVar2 = ef0Var.wxUZMvaN;
                        if (((Shader) rpbmbhypVar2.NCTxEWno) != null || rpbmbhypVar2.qoPGr6Ce != 0) {
                            if (this.wxUZMvaN == null) {
                                Paint paint3 = new Paint(1);
                                this.wxUZMvaN = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.wxUZMvaN;
                            Paint.Join join = ef0Var.OnDfzHZD;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = ef0Var.ow5vqvCr;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(ef0Var.ygLcUYwZ);
                            Shader shader2 = (Shader) rpbmbhypVar2.NCTxEWno;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(ef0Var.b2ZJblxo * f2));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = rpbmbhypVar2.qoPGr6Ce;
                                float f13 = ef0Var.b2ZJblxo;
                                PorterDuff.Mode mode2 = lf0.k3x7lurq;
                                paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(ef0Var.VgvYg0wo * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.ow5vqvCr = i;
    }

    public if0() {
        this.MdtA4re8 = new Matrix();
        this.Qr9iLBAD = 0.0f;
        this.jb9XjC4I = 0.0f;
        this.eVhOlqcC = 0.0f;
        this.k3x7lurq = 0.0f;
        this.ow5vqvCr = 255;
        this.OnDfzHZD = null;
        this.ygLcUYwZ = null;
        this.lDXGDhIF = new x0(0);
        this.b2ZJblxo = new ff0();
        this.qoPGr6Ce = new Path();
        this.NCTxEWno = new Path();
    }
}
