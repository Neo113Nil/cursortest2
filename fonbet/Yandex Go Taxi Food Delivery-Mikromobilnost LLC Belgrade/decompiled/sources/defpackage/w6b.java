package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public abstract class w6b {
    public abstract List a(long j);

    public abstract long[] b(ArrayList arrayList);

    public abstract boolean c(long j);

    public abstract void d(long j);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    public final boolean e(long j, long[] jArr) {
        ?? r1;
        if (jArr != null) {
            r1 = new ArrayList(jArr.length);
            for (long j2 : jArr) {
                r1.add(Long.valueOf(j2));
            }
        } else {
            r1 = EmptyList.a;
        }
        Iterable iterable = (Iterable) r1;
        if (a.N0(iterable).equals(a.N0(a(j)))) {
            return false;
        }
        d(j);
        ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new v6b(j, ((Number) it.next()).longValue()));
        }
        b(arrayList);
        return true;
    }
}
