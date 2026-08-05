package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class q10 {
    public long MdtA4re8;
    public ArrayList NCTxEWno;
    public long P7K7Inc8;
    public long VgvYg0wo;
    public l10 qoPGr6Ce;
    public long wxUZMvaN;

    public static void NCTxEWno(g20 g20Var) {
        RecyclerView recyclerView;
        int i = g20Var.jb9XjC4I;
        if (g20Var.VgvYg0wo() || (i & 4) != 0 || (recyclerView = g20Var.OxcuoDLp) == null) {
            return;
        }
        recyclerView.i7xS8jrb(g20Var);
    }

    public final void MdtA4re8(g20 g20Var) {
        l10 l10Var = this.qoPGr6Ce;
        if (l10Var != null) {
            RecyclerView recyclerView = l10Var.qoPGr6Ce;
            boolean z = true;
            g20Var.OnDfzHZD(true);
            View view = g20Var.qoPGr6Ce;
            if (g20Var.b2ZJblxo != null && g20Var.Qr9iLBAD == null) {
                g20Var.b2ZJblxo = null;
            }
            g20Var.Qr9iLBAD = null;
            if ((g20Var.jb9XjC4I & 16) != 0) {
                return;
            }
            z10 z10Var = recyclerView.MdtA4re8;
            recyclerView.KRabZ4CU();
            f0 f0Var = recyclerView.P7K7Inc8;
            a5 a5Var = (a5) f0Var.wxUZMvaN;
            l10 l10Var2 = (l10) f0Var.MdtA4re8;
            int indexOfChild = l10Var2.qoPGr6Ce.indexOfChild(view);
            if (indexOfChild == -1) {
                f0Var.eIA6dogk(view);
            } else if (a5Var.wxUZMvaN(indexOfChild)) {
                a5Var.P7K7Inc8(indexOfChild);
                f0Var.eIA6dogk(view);
                l10Var2.Qr9iLBAD(indexOfChild);
            } else {
                z = false;
            }
            if (z) {
                g20 euDDoUNr = RecyclerView.euDDoUNr(view);
                z10Var.k3x7lurq(euDDoUNr);
                z10Var.Qr9iLBAD(euDDoUNr);
            }
            recyclerView.gmkaJpmS(!z);
            if (z || !g20Var.jb9XjC4I()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract boolean P7K7Inc8();

    public abstract void VgvYg0wo();

    public abstract boolean qoPGr6Ce(g20 g20Var, g20 g20Var2, fw fwVar, fw fwVar2);

    public abstract void wxUZMvaN(g20 g20Var);
}
