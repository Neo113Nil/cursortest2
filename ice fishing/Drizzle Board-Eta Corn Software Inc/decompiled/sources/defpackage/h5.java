package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.Pair;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class h5 extends zd {
    public float OnDfzHZD;
    public final Pair OxcuoDLp;
    public float P7K7Inc8;
    public float Qr9iLBAD;
    public float b2ZJblxo;
    public float eVhOlqcC;
    public float jb9XjC4I;
    public float k3x7lurq;
    public float lDXGDhIF;
    public int ow5vqvCr;
    public final RectF sjUBp5pO;
    public boolean ygLcUYwZ;

    public h5(m5 m5Var) {
        super(m5Var);
        this.sjUBp5pO = new RectF();
        this.OxcuoDLp = new Pair(new yd(), new yd());
    }

    public final void MdtA4re8(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        float f6;
        Canvas canvas2;
        float f7 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f8 = f % 1.0f;
        if (f8 < 0.0f) {
            f8 += 1.0f;
        }
        if (this.lDXGDhIF < 1.0f) {
            float f9 = f8 + f7;
            if (f9 > 1.0f) {
                MdtA4re8(canvas, paint, f8, 1.0f, i, i2, 0, f3, f4, z);
                MdtA4re8(canvas, paint, 1.0f, f9, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.b2ZJblxo / this.jb9XjC4I);
        float f10 = f7 - 0.99f;
        if (f10 >= 0.0f) {
            float f11 = ((f10 * degrees) / 180.0f) / 0.01f;
            f7 += f11;
            if (!z) {
                f8 -= f11 / 2.0f;
            }
        }
        float f12 = this.lDXGDhIF;
        float f13 = (f8 * 1.0f) + ((1.0f - f8) * (1.0f - f12));
        float f14 = (f7 * f12) + ((1.0f - f7) * 0.0f);
        float degrees2 = (float) Math.toDegrees(i2 / this.jb9XjC4I);
        float degrees3 = ((f14 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.jb9XjC4I));
        float f15 = (f13 * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        m5 m5Var = this.qoPGr6Ce;
        boolean z2 = m5Var.qoPGr6Ce(this.ygLcUYwZ) && z && f3 > 0.0f;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.P7K7Inc8);
        float f16 = this.b2ZJblxo * 2.0f;
        float f17 = degrees * 2.0f;
        PathMeasure pathMeasure = this.wxUZMvaN;
        if (degrees3 < f17) {
            float f18 = degrees3 / f17;
            float f19 = (degrees * f18) + f15;
            yd ydVar = new yd();
            if (z2) {
                float length = (pathMeasure.getLength() * (f19 / 360.0f)) / 2.0f;
                float f20 = this.Qr9iLBAD * f3;
                float f21 = this.jb9XjC4I;
                if (f21 != this.OnDfzHZD || f20 != this.k3x7lurq) {
                    this.k3x7lurq = f20;
                    this.OnDfzHZD = f21;
                    qoPGr6Ce();
                }
                pathMeasure.getPosTan(length, ydVar.qoPGr6Ce, ydVar.NCTxEWno);
            } else {
                ydVar.MdtA4re8(f19 + 90.0f);
                ydVar.qoPGr6Ce(-this.jb9XjC4I);
            }
            paint.setStyle(Paint.Style.FILL);
            wxUZMvaN(canvas, paint, ydVar, f16, this.P7K7Inc8, f18);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap((m5Var.wxUZMvaN && m5Var.MdtA4re8 == 0.5f) ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f22 = f15 + degrees;
        float f23 = degrees3 - f17;
        Pair pair = this.OxcuoDLp;
        ((yd) pair.first).NCTxEWno();
        ((yd) pair.second).NCTxEWno();
        if (z2) {
            float f24 = f22 / 360.0f;
            float f25 = f23 / 360.0f;
            float f26 = this.Qr9iLBAD * f3;
            int i4 = this.ygLcUYwZ ? m5Var.eVhOlqcC : m5Var.k3x7lurq;
            float f27 = this.jb9XjC4I;
            if (f27 != this.OnDfzHZD || f26 != this.k3x7lurq || i4 != this.ow5vqvCr) {
                this.k3x7lurq = f26;
                this.ow5vqvCr = i4;
                this.OnDfzHZD = f27;
                qoPGr6Ce();
            }
            Path path = this.MdtA4re8;
            path.rewind();
            float b2ZJblxo = ej0.b2ZJblxo(f25, 0.0f, 1.0f);
            if (m5Var.qoPGr6Ce(this.ygLcUYwZ)) {
                f5 = 1.0f;
                float f28 = f4 / ((float) ((this.jb9XjC4I * 6.283185307179586d) / this.eVhOlqcC));
                f24 += f28;
                f6 = 0.0f - (f28 * 360.0f);
            } else {
                f5 = 1.0f;
                f6 = 0.0f;
            }
            float f29 = f24 % f5;
            float length2 = (pathMeasure.getLength() * f29) / 2.0f;
            float length3 = (pathMeasure.getLength() * (f29 + b2ZJblxo)) / 2.0f;
            pathMeasure.getSegment(length2, length3, path, true);
            yd ydVar2 = (yd) pair.first;
            ydVar2.NCTxEWno();
            pathMeasure.getPosTan(length2, ydVar2.qoPGr6Ce, ydVar2.NCTxEWno);
            yd ydVar3 = (yd) pair.second;
            ydVar3.NCTxEWno();
            pathMeasure.getPosTan(length3, ydVar3.qoPGr6Ce, ydVar3.NCTxEWno);
            Matrix matrix = this.VgvYg0wo;
            matrix.reset();
            matrix.setRotate(f6);
            ydVar2.MdtA4re8(f6);
            ydVar3.MdtA4re8(f6);
            path.transform(matrix);
            canvas2 = canvas;
            canvas2.drawPath(path, paint);
        } else {
            ((yd) pair.first).MdtA4re8(f22 + 90.0f);
            ((yd) pair.first).qoPGr6Ce(-this.jb9XjC4I);
            ((yd) pair.second).MdtA4re8(f22 + f23 + 90.0f);
            ((yd) pair.second).qoPGr6Ce(-this.jb9XjC4I);
            float f30 = this.jb9XjC4I;
            float f31 = -f30;
            RectF rectF = this.sjUBp5pO;
            rectF.set(f31, f31, f30, f30);
            canvas.drawArc(rectF, f22, f23, false, paint);
            canvas2 = canvas;
        }
        if (!(m5Var.wxUZMvaN && m5Var.MdtA4re8 == 0.5f) && this.b2ZJblxo > 0.0f) {
            paint.setStyle(Paint.Style.FILL);
            wxUZMvaN(canvas2, paint, (yd) pair.first, f16, this.P7K7Inc8, 1.0f);
            wxUZMvaN(canvas, paint, (yd) pair.second, f16, this.P7K7Inc8, 1.0f);
        }
    }

    public final void P7K7Inc8(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int wxUZMvaN = g6.wxUZMvaN(i, (Color.alpha(i) * i2) / 255);
        this.ygLcUYwZ = false;
        MdtA4re8(canvas, paint, f, f2, wxUZMvaN, i3, i3, 0.0f, 0.0f, false);
    }

    public final void VgvYg0wo(Canvas canvas, Paint paint, xd xdVar, int i) {
        int i2 = xdVar.MdtA4re8;
        int wxUZMvaN = g6.wxUZMvaN(i2, (Color.alpha(i2) * i) / 255);
        canvas.save();
        canvas.rotate(xdVar.P7K7Inc8);
        this.ygLcUYwZ = xdVar.b2ZJblxo;
        MdtA4re8(canvas, paint, xdVar.qoPGr6Ce, xdVar.NCTxEWno, wxUZMvaN, 0, 0, xdVar.wxUZMvaN, xdVar.VgvYg0wo, true);
        canvas.restore();
    }

    public final int b2ZJblxo() {
        m5 m5Var = this.qoPGr6Ce;
        return (m5Var.KlHjfFWx * 2) + m5Var.amk52bBQ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zd
    public final void qoPGr6Ce() {
        int i;
        Path path = this.NCTxEWno;
        path.rewind();
        path.moveTo(1.0f, 0.0f);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = 2;
            if (i3 >= 2) {
                break;
            }
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
            i3++;
        }
        Matrix matrix = this.VgvYg0wo;
        matrix.reset();
        float f = this.jb9XjC4I;
        matrix.setScale(f, f);
        path.transform(matrix);
        boolean qoPGr6Ce = this.qoPGr6Ce.qoPGr6Ce(this.ygLcUYwZ);
        PathMeasure pathMeasure = this.wxUZMvaN;
        if (qoPGr6Ce) {
            pathMeasure.setPath(path, false);
            float f2 = this.k3x7lurq;
            path.rewind();
            float length = pathMeasure.getLength();
            float f3 = 2.0f;
            int max = Math.max(3, (int) ((length / (this.ygLcUYwZ ? r2.eVhOlqcC : r2.k3x7lurq)) / 2.0f)) * 2;
            this.eVhOlqcC = length / max;
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < max; i4++) {
                yd ydVar = new yd();
                float f4 = i4;
                pathMeasure.getPosTan(this.eVhOlqcC * f4, ydVar.qoPGr6Ce, ydVar.NCTxEWno);
                yd ydVar2 = new yd();
                float f5 = this.eVhOlqcC;
                pathMeasure.getPosTan((f5 / 2.0f) + (f4 * f5), ydVar2.qoPGr6Ce, ydVar2.NCTxEWno);
                arrayList.add(ydVar);
                ydVar2.qoPGr6Ce(f2 * 2.0f);
                arrayList.add(ydVar2);
            }
            arrayList.add((yd) arrayList.get(0));
            yd ydVar3 = (yd) arrayList.get(0);
            float[] fArr = ydVar3.qoPGr6Ce;
            char c = 1;
            path.moveTo(fArr[0], fArr[1]);
            int i5 = 1;
            while (i5 < arrayList.size()) {
                yd ydVar4 = (yd) arrayList.get(i5);
                float f6 = (this.eVhOlqcC / f3) * 0.48f;
                float[] fArr2 = ydVar3.qoPGr6Ce;
                float[] fArr3 = new float[i];
                System.arraycopy(fArr2, i2, fArr3, i2, i);
                System.arraycopy(ydVar3.NCTxEWno, i2, new float[i], i2, i);
                new Matrix();
                float[] fArr4 = ydVar4.qoPGr6Ce;
                float[] fArr5 = new float[i];
                System.arraycopy(fArr4, i2, fArr5, i2, i);
                System.arraycopy(ydVar4.NCTxEWno, i2, new float[i], i2, i);
                new Matrix();
                char c2 = c;
                float atan2 = (float) Math.atan2(r6[c], r6[i2]);
                double d = fArr3[i2];
                double d2 = f6;
                int i6 = i2;
                double d3 = atan2;
                fArr3[i6] = (float) ((Math.cos(d3) * d2) + d);
                fArr3[c2] = (float) ((Math.sin(d3) * d2) + fArr3[c2]);
                double d4 = -f6;
                double atan22 = (float) Math.atan2(r11[c2], r11[i6]);
                fArr5[i6] = (float) ((Math.cos(atan22) * d4) + fArr5[i6]);
                float sin = (float) ((Math.sin(atan22) * d4) + fArr5[c2]);
                fArr5[c2] = sin;
                float f7 = fArr3[i6];
                float f8 = fArr3[c2];
                float f9 = fArr5[i6];
                float[] fArr6 = ydVar4.qoPGr6Ce;
                path.cubicTo(f7, f8, f9, sin, fArr6[i6], fArr6[c2]);
                i5++;
                ydVar3 = ydVar4;
                c = c2;
                i2 = i6;
                pathMeasure = pathMeasure;
                i = 2;
                f3 = 2.0f;
            }
        }
        pathMeasure.setPath(path, i2);
    }

    public final void wxUZMvaN(Canvas canvas, Paint paint, yd ydVar, float f, float f2, float f3) {
        float min = Math.min(f2, this.P7K7Inc8);
        float f4 = f / 2.0f;
        float min2 = Math.min(f4, (this.b2ZJblxo * min) / this.P7K7Inc8);
        RectF rectF = new RectF((-f) / 2.0f, (-min) / 2.0f, f4, min / 2.0f);
        canvas.save();
        float[] fArr = ydVar.qoPGr6Ce;
        canvas.translate(fArr[0], fArr[1]);
        float[] fArr2 = ydVar.NCTxEWno;
        canvas.rotate((float) Math.toDegrees(Math.atan2(fArr2[1], fArr2[0])));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }
}
