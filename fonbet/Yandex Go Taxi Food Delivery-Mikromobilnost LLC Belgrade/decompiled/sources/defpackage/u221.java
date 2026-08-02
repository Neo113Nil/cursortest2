package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public final class u221 {
    public final ArrayList a = new ArrayList();

    public final synchronized void a(t221 t221Var) {
        this.a.add(t221Var);
    }

    public final synchronized void b(tls tlsVar) {
        Iterator it = a.J0(this.a).iterator();
        while (it.hasNext()) {
            tlsVar.invoke(it.next());
        }
    }
}
