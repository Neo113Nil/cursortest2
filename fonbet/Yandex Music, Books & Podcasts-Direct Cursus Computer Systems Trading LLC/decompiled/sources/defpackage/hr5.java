package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class hr5 implements iib {
    public final ArrayList a;

    public hr5(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.iib
    public final jib a(mkn mknVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((iib) it.next()).a(mknVar));
        }
        return new gr5(arrayList);
    }
}
