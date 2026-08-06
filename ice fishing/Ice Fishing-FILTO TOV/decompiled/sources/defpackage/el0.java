package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class el0 {
    public final /* synthetic */ Object GWasM1elztuh;

    public /* synthetic */ el0(Object obj) {
        this.GWasM1elztuh = obj;
    }

    public void GWasM1elztuh() {
        lv lvVar = (lv) this.GWasM1elztuh;
        synchronized (e41.X1lG3V04pd) {
            List list = e41.encWxUiV2;
            list.getClass();
            ArrayList arrayList = new ArrayList(sb.dcDmLGVhzWm(list, 10));
            boolean z = false;
            for (Object obj : list) {
                boolean z2 = true;
                if (!z && o30.rQPn8YBR(obj, lvVar)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            e41.encWxUiV2 = arrayList;
        }
    }
}
