package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class v60 {
    public final d70[] qoPGr6Ce = new d70[4];
    public final Matrix[] NCTxEWno = new Matrix[4];
    public final Matrix[] MdtA4re8 = new Matrix[4];
    public final PointF wxUZMvaN = new PointF();
    public final Path VgvYg0wo = new Path();
    public final Path P7K7Inc8 = new Path();
    public final d70 b2ZJblxo = new d70();
    public final float[] Qr9iLBAD = new float[2];
    public final float[] jb9XjC4I = new float[2];
    public final Path eVhOlqcC = new Path();
    public final Path k3x7lurq = new Path();

    public v60() {
        for (int i = 0; i < 4; i++) {
            this.qoPGr6Ce[i] = new d70();
            this.NCTxEWno[i] = new Matrix();
            this.MdtA4re8[i] = new Matrix();
        }
    }

    public static v60 NCTxEWno() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? u60.qoPGr6Ce : new v60();
    }

    public final boolean MdtA4re8(Path path, int i) {
        Path path2 = this.k3x7lurq;
        path2.reset();
        this.qoPGr6Ce[i].NCTxEWno(this.NCTxEWno[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v6 */
    public final void qoPGr6Ce(t60 t60Var, float[] fArr, float f, RectF rectF, qr qrVar, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        d70[] d70VarArr;
        Matrix[] matrixArr2;
        boolean z;
        float f2;
        boolean z2;
        int i2;
        path.rewind();
        Path path2 = this.VgvYg0wo;
        path2.rewind();
        Path path3 = this.P7K7Inc8;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.MdtA4re8;
            fArr2 = this.Qr9iLBAD;
            d70VarArr = this.qoPGr6Ce;
            matrixArr2 = this.NCTxEWno;
            z = 0;
            if (i3 >= 4) {
                break;
            }
            i9 n5Var = fArr == null ? i3 != 1 ? i3 != 2 ? i3 != 3 ? t60Var.P7K7Inc8 : t60Var.VgvYg0wo : t60Var.Qr9iLBAD : t60Var.b2ZJblxo : new n5(fArr[i3]);
            ra raVar = i3 != 1 ? i3 != 2 ? i3 != 3 ? t60Var.NCTxEWno : t60Var.qoPGr6Ce : t60Var.wxUZMvaN : t60Var.MdtA4re8;
            d70 d70Var = d70VarArr[i3];
            raVar.getClass();
            raVar.amk52bBQ(d70Var, f, n5Var.qoPGr6Ce(rectF));
            int i4 = i3 + 1;
            float f3 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.wxUZMvaN;
            if (i3 == 1) {
                i2 = i3;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i3;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i3;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i3;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f3);
            d70 d70Var2 = d70VarArr[i2];
            fArr2[0] = d70Var2.NCTxEWno;
            fArr2[1] = d70Var2.MdtA4re8;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            d70 d70Var3 = d70VarArr[i5];
            d70Var3.getClass();
            fArr2[z] = 0.0f;
            fArr2[1] = d70Var3.qoPGr6Ce;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 0) {
                path.moveTo(fArr2[z], fArr2[1]);
            } else {
                path.lineTo(fArr2[z], fArr2[1]);
            }
            d70VarArr[i5].NCTxEWno(matrixArr2[i5], path);
            if (qrVar != null) {
                d70 d70Var4 = d70VarArr[i5];
                Matrix matrix = matrixArr2[i5];
                tr trVar = qrVar.qoPGr6Ce;
                f2 = 0.0f;
                BitSet bitSet = trVar.P7K7Inc8;
                d70Var4.getClass();
                bitSet.set(i5, z);
                c70[] c70VarArr = trVar.wxUZMvaN;
                d70Var4.qoPGr6Ce(d70Var4.VgvYg0wo);
                c70VarArr[i5] = new w60(new ArrayList(d70Var4.b2ZJblxo), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            d70 d70Var5 = d70VarArr[i5];
            fArr2[0] = d70Var5.NCTxEWno;
            fArr2[1] = d70Var5.MdtA4re8;
            matrixArr2[i5].mapPoints(fArr2);
            d70 d70Var6 = d70VarArr[i7];
            d70Var6.getClass();
            float[] fArr3 = this.jb9XjC4I;
            fArr3[0] = f2;
            fArr3[1] = d70Var6.qoPGr6Ce;
            matrixArr2[i7].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            d70[] d70VarArr2 = d70VarArr;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f2);
            d70 d70Var7 = d70VarArr2[i5];
            fArr2[0] = d70Var7.NCTxEWno;
            fArr2[1] = d70Var7.MdtA4re8;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            d70 d70Var8 = this.b2ZJblxo;
            d70Var8.wxUZMvaN(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? t60Var.eVhOlqcC : t60Var.jb9XjC4I : t60Var.ow5vqvCr : t60Var.k3x7lurq).getClass();
            d70Var8.MdtA4re8(max, 0.0f);
            Path path4 = this.eVhOlqcC;
            path4.reset();
            d70Var8.NCTxEWno(matrixArr3[i5], path4);
            if (MdtA4re8(path4, i5) || MdtA4re8(path4, i7)) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = d70Var8.qoPGr6Ce;
                matrixArr3[i5].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                d70Var8.NCTxEWno(matrixArr3[i5], path2);
            } else {
                d70Var8.NCTxEWno(matrixArr3[i5], path);
            }
            if (qrVar != null) {
                Matrix matrix2 = matrixArr3[i5];
                tr trVar2 = qrVar.qoPGr6Ce;
                z2 = false;
                trVar2.P7K7Inc8.set(i5 + 4, false);
                c70[] c70VarArr2 = trVar2.VgvYg0wo;
                d70Var8.qoPGr6Ce(d70Var8.VgvYg0wo);
                c70VarArr2[i5] = new w60(new ArrayList(d70Var8.b2ZJblxo), new Matrix(matrix2));
            } else {
                z2 = false;
            }
            matrixArr = matrixArr3;
            i5 = i6;
            z = z2;
            d70VarArr = d70VarArr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }
}
