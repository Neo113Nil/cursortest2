package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class tsi implements q {
    public final ArrayList a;

    public tsi(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_PAUSE) {
            ArrayList arrayList = this.a;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((g18) it.next()).cancel();
            }
            arrayList.clear();
        }
    }
}
