package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public final class sz61 implements bl81, mj61 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // defpackage.bl81
    public final void a(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((a371) it.next()).a(z);
        }
    }

    @Override // defpackage.bl81
    public final void c() {
    }

    @Override // defpackage.mj61
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((a371) it.next()).a();
        }
    }
}
