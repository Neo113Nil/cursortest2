package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class sm extends wd {
    public lf0 OxcuoDLp;
    public h5 lDXGDhIF;
    public cD2QLRqg sjUBp5pO;

    @Override // defpackage.wd
    public final boolean VgvYg0wo(boolean z, boolean z2, boolean z3) {
        lf0 lf0Var;
        boolean VgvYg0wo = super.VgvYg0wo(z, z2, z3);
        if (this.wxUZMvaN != null && Settings.Global.getFloat(this.NCTxEWno.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (lf0Var = this.OxcuoDLp) != null) {
            return lf0Var.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.sjUBp5pO.MdtA4re8();
        }
        if (z && z3) {
            this.sjUBp5pO.sjUBp5pO();
        }
        return VgvYg0wo;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        int i;
        lf0 lf0Var;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.OnDfzHZD)) {
            rSPHMVzL rsphmvzl = this.wxUZMvaN;
            m5 m5Var = this.MdtA4re8;
            if (rsphmvzl != null && Settings.Global.getFloat(this.NCTxEWno.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (lf0Var = this.OxcuoDLp) != null) {
                lf0Var.setBounds(getBounds());
                this.OxcuoDLp.setTint(m5Var.VgvYg0wo[0]);
                this.OxcuoDLp.draw(canvas);
                return;
            }
            canvas.save();
            h5 h5Var = this.lDXGDhIF;
            Rect bounds = getBounds();
            float NCTxEWno = NCTxEWno();
            ObjectAnimator objectAnimator = this.VgvYg0wo;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.P7K7Inc8;
            h5Var.NCTxEWno(canvas, bounds, NCTxEWno, z, objectAnimator2 != null && objectAnimator2.isRunning());
            int i2 = m5Var.jb9XjC4I;
            int i3 = this.ow5vqvCr;
            boolean z2 = (m5Var instanceof m5) && m5Var.I5GHvsYW;
            boolean z3 = z2 && i2 == 0 && !m5Var.qoPGr6Ce(false);
            Paint paint = this.k3x7lurq;
            if (z3) {
                this.lDXGDhIF.P7K7Inc8(canvas, paint, 0.0f, 1.0f, m5Var.P7K7Inc8, i3, 0);
            } else if (z2) {
                xd xdVar = (xd) ((ArrayList) this.sjUBp5pO.NCTxEWno).get(0);
                ArrayList arrayList = (ArrayList) this.sjUBp5pO.NCTxEWno;
                xd xdVar2 = (xd) arrayList.get(arrayList.size() - 1);
                canvas.save();
                canvas.rotate(xdVar2.P7K7Inc8);
                i = i2;
                this.lDXGDhIF.P7K7Inc8(canvas, paint, xdVar2.NCTxEWno, xdVar.qoPGr6Ce + 1.0f, m5Var.P7K7Inc8, i3, i);
                canvas.restore();
                for (int i4 = 0; i4 < ((ArrayList) this.sjUBp5pO.NCTxEWno).size(); i4++) {
                    xd xdVar3 = (xd) ((ArrayList) this.sjUBp5pO.NCTxEWno).get(i4);
                    xdVar3.VgvYg0wo = MdtA4re8();
                    this.lDXGDhIF.VgvYg0wo(canvas, paint, xdVar3, this.ow5vqvCr);
                    if (i4 > 0 && !z3 && z2) {
                        this.lDXGDhIF.P7K7Inc8(canvas, paint, ((xd) ((ArrayList) this.sjUBp5pO.NCTxEWno).get(i4 - 1)).NCTxEWno, xdVar3.qoPGr6Ce, m5Var.P7K7Inc8, i3, i);
                    }
                }
                canvas.restore();
            }
            i = i2;
            while (i4 < ((ArrayList) this.sjUBp5pO.NCTxEWno).size()) {
            }
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.lDXGDhIF.b2ZJblxo();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.lDXGDhIF.b2ZJblxo();
    }
}
