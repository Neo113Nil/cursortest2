package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class ris0 implements z5e {
    public final /* synthetic */ tis0 a;

    public ris0(tis0 tis0Var) {
        this.a = tis0Var;
    }

    @Override // defpackage.z5e
    public final void a(boolean z) {
        ArrayList arrayList;
        pw21.a();
        synchronized (this.a) {
            arrayList = new ArrayList((HashSet) this.a.w);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((z5e) it.next()).a(z);
        }
    }
}
