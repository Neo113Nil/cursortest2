package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class pl {
    public int[] MdtA4re8;
    public int NCTxEWno;
    public int qoPGr6Ce;
    public int wxUZMvaN;

    public final void NCTxEWno(RecyclerView recyclerView, boolean z) {
        this.wxUZMvaN = 0;
        int[] iArr = this.MdtA4re8;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        t10 t10Var = recyclerView.ygLcUYwZ;
        if (recyclerView.OnDfzHZD == null || t10Var == null || !t10Var.Qr9iLBAD) {
            return;
        }
        if (z) {
            if (((ArrayList) recyclerView.VgvYg0wo.MdtA4re8).size() <= 0) {
                t10Var.Qr9iLBAD(recyclerView.OnDfzHZD.qoPGr6Ce(), this);
            }
        } else if (!recyclerView.ytu5o6f4()) {
            t10Var.b2ZJblxo(this.qoPGr6Ce, this.NCTxEWno, recyclerView.pP9Y2m6O, this);
        }
        int i = this.wxUZMvaN;
        if (i > t10Var.jb9XjC4I) {
            t10Var.jb9XjC4I = i;
            t10Var.eVhOlqcC = z;
            recyclerView.MdtA4re8.ow5vqvCr();
        }
    }

    public final void qoPGr6Ce(int i, int i2) {
        if (i < 0) {
            m1.sjUBp5pO("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            m1.sjUBp5pO("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.wxUZMvaN;
        int i4 = i3 * 2;
        int[] iArr = this.MdtA4re8;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.MdtA4re8 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.MdtA4re8 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.MdtA4re8;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.wxUZMvaN++;
    }
}
