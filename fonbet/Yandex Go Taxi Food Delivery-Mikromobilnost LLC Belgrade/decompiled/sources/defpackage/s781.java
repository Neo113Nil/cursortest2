package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public final class s781 implements fl61 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // defpackage.fl61
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((fl61) it.next()).a();
        }
    }

    @Override // defpackage.fl61
    public final void b() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((fl61) it.next()).b();
        }
    }

    @Override // defpackage.fl61
    public final void c(long j, long j2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((fl61) it.next()).c(j, j2);
        }
    }
}
