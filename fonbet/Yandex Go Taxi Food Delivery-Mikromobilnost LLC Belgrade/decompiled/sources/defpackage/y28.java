package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes8.dex */
public final class y28 implements t1j0 {
    public final LinkedHashMap a = new LinkedHashMap();

    @Override // defpackage.t1j0
    public final synchronized void a(kn2 kn2Var) {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            kn2Var.invoke(new c38((u28) it.next()));
        }
    }

    @Override // defpackage.t1j0
    public final synchronized void clear() {
        this.a.clear();
    }

    @Override // defpackage.t1j0
    public final void save(Object obj) {
        e38 e38Var = (e38) obj;
        synchronized (this) {
            try {
                if (e38Var instanceof c38) {
                    this.a.put(new z28(((c38) e38Var).a.a()), ((c38) e38Var).a);
                } else {
                    if (!(e38Var instanceof d38)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.a.remove(new z28(((d38) e38Var).a.a()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
