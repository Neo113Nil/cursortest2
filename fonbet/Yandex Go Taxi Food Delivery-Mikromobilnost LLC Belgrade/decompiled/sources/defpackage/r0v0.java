package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public final class r0v0 implements q0v0 {
    public final Set a;

    public r0v0(q0v0 q0v0Var) {
        Set synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        this.a = synchronizedSet;
        synchronizedSet.add(q0v0Var);
    }

    @Override // defpackage.q0v0
    public final void a() {
        synchronized (this.a) {
            Iterator it = a.N0(this.a).iterator();
            while (it.hasNext()) {
                ((q0v0) it.next()).a();
            }
        }
    }

    @Override // defpackage.q0v0
    public final void b() {
        synchronized (this.a) {
            Iterator it = a.N0(this.a).iterator();
            while (it.hasNext()) {
                ((q0v0) it.next()).b();
            }
        }
    }

    @Override // defpackage.q0v0
    public final void c() {
        synchronized (this.a) {
            Iterator it = a.N0(this.a).iterator();
            while (it.hasNext()) {
                ((q0v0) it.next()).c();
            }
        }
    }
}
