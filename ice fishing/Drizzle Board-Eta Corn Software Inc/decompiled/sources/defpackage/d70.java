package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class d70 {
    public float MdtA4re8;
    public float NCTxEWno;
    public float VgvYg0wo;
    public float qoPGr6Ce;
    public float wxUZMvaN;
    public final ArrayList P7K7Inc8 = new ArrayList();
    public final ArrayList b2ZJblxo = new ArrayList();

    public d70() {
        wxUZMvaN(0.0f, 270.0f, 0.0f);
    }

    public final void MdtA4re8(float f, float f2) {
        a70 a70Var = new a70();
        a70Var.NCTxEWno = f;
        a70Var.MdtA4re8 = f2;
        this.P7K7Inc8.add(a70Var);
        y60 y60Var = new y60(a70Var, this.NCTxEWno, this.MdtA4re8);
        float NCTxEWno = y60Var.NCTxEWno() + 270.0f;
        float NCTxEWno2 = y60Var.NCTxEWno() + 270.0f;
        qoPGr6Ce(NCTxEWno);
        this.b2ZJblxo.add(y60Var);
        this.wxUZMvaN = NCTxEWno2;
        this.NCTxEWno = f;
        this.MdtA4re8 = f2;
    }

    public final void NCTxEWno(Matrix matrix, Path path) {
        ArrayList arrayList = this.P7K7Inc8;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((b70) arrayList.get(i)).qoPGr6Ce(matrix, path);
        }
    }

    public final void qoPGr6Ce(float f) {
        float f2 = this.wxUZMvaN;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.NCTxEWno;
        float f5 = this.MdtA4re8;
        z60 z60Var = new z60(f4, f5, f4, f5);
        z60Var.P7K7Inc8 = this.wxUZMvaN;
        z60Var.b2ZJblxo = f3;
        this.b2ZJblxo.add(new x60(z60Var));
        this.wxUZMvaN = f;
    }

    public final void wxUZMvaN(float f, float f2, float f3) {
        this.qoPGr6Ce = f;
        this.NCTxEWno = 0.0f;
        this.MdtA4re8 = f;
        this.wxUZMvaN = f2;
        this.VgvYg0wo = (f2 + f3) % 360.0f;
        this.P7K7Inc8.clear();
        this.b2ZJblxo.clear();
    }
}
