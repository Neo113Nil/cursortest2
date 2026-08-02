package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes13.dex */
public class zbc0 {
    public final LinkedHashSet a = new LinkedHashSet();

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            u45 u45Var = (u45) ((WeakReference) it.next()).get();
            if (u45Var != null) {
                arrayList.add(u45Var);
            }
        }
        return arrayList;
    }
}
