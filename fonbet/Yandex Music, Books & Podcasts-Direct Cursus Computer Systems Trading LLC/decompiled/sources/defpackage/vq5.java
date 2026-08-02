package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class vq5 implements ja8 {
    public final ArrayList a = new ArrayList();
    public boolean b;

    public final void a(ja8 ja8Var) {
        if (this.b) {
            xq0.x("close() method was called");
        } else if (ja8Var != ja8.b0) {
            this.a.add(ja8Var);
        }
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        ArrayList arrayList = this.a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ja8) it.next()).close();
        }
        arrayList.clear();
        this.b = true;
    }
}
