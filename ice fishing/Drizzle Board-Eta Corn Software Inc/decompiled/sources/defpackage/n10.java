package defpackage;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class n10 extends Observable {
    public final void MdtA4re8(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            b20 b20Var = (b20) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = b20Var.qoPGr6Ce;
            recyclerView.P7K7Inc8(null);
            VM67d7Sv vM67d7Sv = recyclerView.VgvYg0wo;
            ArrayList arrayList = (ArrayList) vM67d7Sv.MdtA4re8;
            if (i2 >= 1) {
                arrayList.add(vM67d7Sv.k3x7lurq(null, 1, i, i2));
                vM67d7Sv.qoPGr6Ce |= 1;
                if (arrayList.size() == 1) {
                    b20Var.qoPGr6Ce();
                }
            }
        }
    }

    public final void NCTxEWno(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            b20 b20Var = (b20) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = b20Var.qoPGr6Ce;
            recyclerView.P7K7Inc8(null);
            VM67d7Sv vM67d7Sv = recyclerView.VgvYg0wo;
            ArrayList arrayList = (ArrayList) vM67d7Sv.MdtA4re8;
            if (i2 >= 1) {
                arrayList.add(vM67d7Sv.k3x7lurq(null, 4, i, i2));
                vM67d7Sv.qoPGr6Ce |= 4;
                if (arrayList.size() == 1) {
                    b20Var.qoPGr6Ce();
                }
            }
        }
    }

    public final void qoPGr6Ce(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            b20 b20Var = (b20) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = b20Var.qoPGr6Ce;
            recyclerView.P7K7Inc8(null);
            VM67d7Sv vM67d7Sv = recyclerView.VgvYg0wo;
            ArrayList arrayList = (ArrayList) vM67d7Sv.MdtA4re8;
            if (i != i2) {
                arrayList.add(vM67d7Sv.k3x7lurq(null, 8, i, i2));
                vM67d7Sv.qoPGr6Ce |= 8;
                if (arrayList.size() == 1) {
                    b20Var.qoPGr6Ce();
                }
            }
        }
    }

    public final void wxUZMvaN(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            b20 b20Var = (b20) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = b20Var.qoPGr6Ce;
            recyclerView.P7K7Inc8(null);
            VM67d7Sv vM67d7Sv = recyclerView.VgvYg0wo;
            ArrayList arrayList = (ArrayList) vM67d7Sv.MdtA4re8;
            if (i2 >= 1) {
                arrayList.add(vM67d7Sv.k3x7lurq(null, 2, i, i2));
                vM67d7Sv.qoPGr6Ce |= 2;
                if (arrayList.size() == 1) {
                    b20Var.qoPGr6Ce();
                }
            }
        }
    }
}
