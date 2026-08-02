package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.ToLongFunction;
import kotlin.Pair;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public final class zh11 {
    public final jtq0 a;
    public final cne0 b;

    public zh11(jtq0 jtq0Var, dne0 dne0Var) {
        this.a = jtq0Var;
        this.b = dne0Var.a("ru.yandex.taxi.deeplinks.TRUSTED");
    }

    public final void a(Uri uri) {
        String uri2 = uri.toString();
        long d = this.a.d();
        cne0 cne0Var = this.b;
        cne0Var.q(d, uri2);
        Set e = cne0Var.e();
        int size = e.size() - 30;
        if (size > 0) {
            Set<String> set = e;
            ArrayList arrayList = new ArrayList(tcc.n(set, 10));
            for (String str : set) {
                arrayList.add(new Pair(str, Long.valueOf(cne0Var.j(str, 0L))));
            }
            List J0 = a.J0(arrayList);
            final ceu0 ceu0Var = new ceu0(15);
            List x0 = a.x0(J0, Comparator.comparingLong(new ToLongFunction() { // from class: yh11
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return ((Number) ceu0.this.invoke(obj)).longValue();
                }
            }));
            ArrayList arrayList2 = new ArrayList(tcc.n(x0, 10));
            Iterator it = x0.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((Pair) it.next()).c());
            }
            Iterator it2 = arrayList2.subList(0, size).iterator();
            while (it2.hasNext()) {
                cne0Var.w((String) it2.next());
            }
        }
    }
}
