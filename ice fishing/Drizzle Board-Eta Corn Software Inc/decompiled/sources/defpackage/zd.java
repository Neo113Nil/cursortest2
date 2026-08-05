package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.os.Build;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class zd {
    public final Path MdtA4re8;
    public final Path NCTxEWno;
    public final Matrix VgvYg0wo;
    public final m5 qoPGr6Ce;
    public final PathMeasure wxUZMvaN;

    public zd(m5 m5Var) {
        Path path = new Path();
        this.NCTxEWno = path;
        this.MdtA4re8 = new Path();
        this.wxUZMvaN = new PathMeasure(path, false);
        this.qoPGr6Ce = m5Var;
        this.VgvYg0wo = new Matrix();
    }

    public final void NCTxEWno(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        this.qoPGr6Ce.NCTxEWno();
        h5 h5Var = (h5) this;
        float width = rect.width() / h5Var.b2ZJblxo();
        float height = rect.height() / h5Var.b2ZJblxo();
        m5 m5Var = h5Var.qoPGr6Ce;
        float f2 = (m5Var.amk52bBQ / 2.0f) + m5Var.KlHjfFWx;
        canvas.translate((f2 * width) + rect.left, (f2 * height) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(width, height);
        if (m5Var.Ey6iv0m0 != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        h5Var.P7K7Inc8 = m5Var.qoPGr6Ce * f;
        h5Var.b2ZJblxo = Math.min(r9 / 2, m5Var.wxUZMvaN ? (int) (r10 * m5Var.MdtA4re8) : m5Var.NCTxEWno) * f;
        h5Var.Qr9iLBAD = m5Var.ow5vqvCr * f;
        int i = m5Var.amk52bBQ;
        int i2 = m5Var.qoPGr6Ce;
        float f4 = (i - i2) / 2.0f;
        h5Var.jb9XjC4I = f4;
        if (z || z2) {
            float f5 = ((1.0f - f) * i2) / 2.0f;
            if ((z && m5Var.b2ZJblxo == 2) || (z2 && m5Var.Qr9iLBAD == 1)) {
                h5Var.jb9XjC4I = f4 + f5;
            } else if ((z && m5Var.b2ZJblxo == 1) || (z2 && m5Var.Qr9iLBAD == 2)) {
                h5Var.jb9XjC4I = f4 - f5;
            }
        }
        if (z2 && m5Var.Qr9iLBAD == 3) {
            h5Var.lDXGDhIF = f;
        } else {
            h5Var.lDXGDhIF = 1.0f;
        }
    }

    public abstract void qoPGr6Ce();
}
