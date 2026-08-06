package J1;

import i1.AbstractC0252i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f844c = new e(AbstractC0252i.V(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f845a;

    /* renamed from: b, reason: collision with root package name */
    public final R1.l f846b;

    public e(Set set, R1.l lVar) {
        this.f845a = set;
        this.f846b = lVar;
    }

    public final void a(String hostname, InterfaceC1046a interfaceC1046a) {
        kotlin.jvm.internal.i.e(hostname, "hostname");
        Iterator it = this.f845a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (kotlin.jvm.internal.i.a(eVar.f845a, this.f845a) && kotlin.jvm.internal.i.a(eVar.f846b, this.f846b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f845a.hashCode() + 1517) * 41;
        R1.l lVar = this.f846b;
        return hashCode + (lVar != null ? lVar.hashCode() : 0);
    }
}
