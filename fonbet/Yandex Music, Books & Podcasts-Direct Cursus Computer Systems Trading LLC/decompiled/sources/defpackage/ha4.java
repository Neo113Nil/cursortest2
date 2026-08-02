package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ha4 {
    public static final ha4 c = new ha4(CollectionsKt.A0(new ArrayList()), null);
    public final Set a;
    public final irf b;

    public ha4(Set set, irf irfVar) {
        set.getClass();
        this.a = set;
        this.b = irfVar;
    }

    public final void a(String str, Function0 function0) {
        str.getClass();
        Set set = this.a;
        c5b c5bVar = c5b.a;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw hrg.j(it);
        }
        c5bVar.getClass();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ha4)) {
            return false;
        }
        ha4 ha4Var = (ha4) obj;
        return Intrinsics.d(ha4Var.a, this.a) && Intrinsics.d(ha4Var.b, this.b);
    }

    public final int hashCode() {
        int f = su4.f(this.a, 1517, 41);
        irf irfVar = this.b;
        return f + (irfVar != null ? irfVar.hashCode() : 0);
    }
}
