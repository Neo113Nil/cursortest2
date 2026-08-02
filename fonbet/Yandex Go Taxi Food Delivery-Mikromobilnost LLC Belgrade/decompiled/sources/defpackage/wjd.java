package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class wjd implements f1k {
    public final ArrayList a = new ArrayList();
    public boolean b;

    public final void a(f1k f1kVar) {
        if (this.b) {
            ny61.g("close() method was called");
        } else if (f1kVar != f1k.O1) {
            this.a.add(f1kVar);
        }
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        ArrayList arrayList = this.a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((f1k) it.next()).close();
        }
        arrayList.clear();
        this.b = true;
    }
}
