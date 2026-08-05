package defpackage;

import android.graphics.Rect;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class ii0 {
    public final Rect[][] NCTxEWno;
    public final Rect[][] qoPGr6Ce;

    public ii0(wi0 wi0Var) {
        this.qoPGr6Ce = new Rect[10][];
        this.NCTxEWno = new Rect[10][];
        MdtA4re8(wi0Var);
    }

    public void MdtA4re8(wi0 wi0Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> VgvYg0wo = wi0Var.qoPGr6Ce.VgvYg0wo(i);
            int eVhOlqcC = e50.eVhOlqcC(i);
            this.qoPGr6Ce[eVhOlqcC] = (Rect[]) VgvYg0wo.toArray(new Rect[VgvYg0wo.size()]);
            if (i != 8) {
                List<Rect> P7K7Inc8 = wi0Var.qoPGr6Ce.P7K7Inc8(i);
                this.NCTxEWno[eVhOlqcC] = (Rect[]) P7K7Inc8.toArray(new Rect[P7K7Inc8.size()]);
            }
        }
    }

    public abstract wi0 NCTxEWno();

    public abstract void VgvYg0wo(bn bnVar);

    public abstract void wxUZMvaN(bn bnVar);

    public ii0() {
        this(new wi0());
    }

    public final void qoPGr6Ce() {
    }
}
