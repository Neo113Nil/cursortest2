package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes7.dex */
public final class xc71 implements z971, bg71 {
    public final LinkedHashSet a = new LinkedHashSet();
    public final LinkedHashSet b = new LinkedHashSet();

    @Override // defpackage.bg71
    public final void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((bg71) it.next()).a();
        }
    }

    @Override // defpackage.bg71
    public final void b() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((bg71) it.next()).b();
        }
    }

    @Override // defpackage.z971
    public final void c(long j, long j2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((z971) it.next()).c(j, j2);
        }
    }
}
