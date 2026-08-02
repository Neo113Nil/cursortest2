package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class qyi0 extends yjs0 {
    public final ArrayList d;

    public qyi0(ArrayList arrayList) {
        this.d = arrayList;
    }

    @Override // defpackage.yjs0
    public final void b(Context context, int i, int i2, int i3, n86 n86Var) {
        Iterator it = this.d.iterator();
        while (true) {
            int i4 = i3;
            if (!it.hasNext()) {
                return;
            }
            i3 = i4 + 1;
            ((yjs0) it.next()).b(context, i, i2, i4, n86Var);
        }
    }

    @Override // defpackage.yjs0
    public final void c(Context context, qa10 qa10Var) {
        d(qa10Var.a, qa10Var.b);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((yjs0) it.next()).a(context, qa10Var);
        }
    }
}
