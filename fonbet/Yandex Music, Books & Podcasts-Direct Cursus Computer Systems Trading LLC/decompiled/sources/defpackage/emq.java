package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class emq implements n76 {
    public final /* synthetic */ fmq a;

    public emq(fmq fmqVar) {
        this.a = fmqVar;
    }

    @Override // defpackage.n76
    public final void a(boolean z) {
        ArrayList arrayList;
        xut.a();
        synchronized (this.a) {
            arrayList = new ArrayList((HashSet) this.a.d);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((n76) it.next()).a(z);
        }
    }
}
