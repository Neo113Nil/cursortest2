package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s9p {
    public final List a;
    public final jyr b;

    public s9p(List list) {
        list.getClass();
        this.a = list;
        if (list.isEmpty()) {
            su4.s(2, null, "Seeds.items must not be empty", null);
        }
        this.b = btf.b(new oxo(5, this));
    }

    public final g9p a() {
        g9p g9pVar = (g9p) CollectionsKt.firstOrNull(this.a);
        return g9pVar == null ? r9p.a : g9pVar;
    }

    public final boolean b(s9p s9pVar) {
        s9pVar.getClass();
        return Intrinsics.d(CollectionsKt.A0(this.a), CollectionsKt.A0(s9pVar.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s9p) && Intrinsics.d(this.a, ((s9p) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v3w.f("Seeds(items=", ")", this.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s9p(g9p... g9pVarArr) {
        this(r1);
        List asList = Arrays.asList(g9pVarArr);
        asList.getClass();
    }
}
