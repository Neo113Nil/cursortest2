package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class c2k {
    public static final c2k e = new c2k(a1k.g);
    public final ArrayList a;
    public int b;
    public int c;
    public int d;

    public c2k(int i, int i2, List list) {
        list.getClass();
        this.a = new ArrayList(list);
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 += ((c7t) it.next()).b.size();
        }
        this.b = i3;
        this.c = i;
        this.d = i2;
    }

    public final fiu a(int i) {
        ArrayList arrayList;
        int i2 = i - this.c;
        int i3 = 0;
        while (true) {
            arrayList = this.a;
            if (i2 < ((c7t) arrayList.get(i3)).b.size() || i3 >= u75.g(arrayList)) {
                break;
            }
            i2 -= ((c7t) arrayList.get(i3)).b.size();
            i3++;
        }
        c7t c7tVar = (c7t) arrayList.get(i3);
        int i4 = i - this.c;
        int d = ((d() - i) - this.d) - 1;
        Integer N = xz0.N(((c7t) CollectionsKt.Q(arrayList)).a);
        N.getClass();
        int intValue = N.intValue();
        int c = c();
        int i5 = c7tVar.c;
        List list = c7tVar.d;
        if (list != null && u75.f(list).q(i2)) {
            i2 = ((Number) list.get(i2)).intValue();
        }
        return new fiu(i5, i2, i4, d, intValue, c);
    }

    public final Object b(int i) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((c7t) arrayList.get(i2)).b.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return ((c7t) arrayList.get(i2)).b.get(i);
    }

    public final int c() {
        Integer valueOf;
        int[] iArr = ((c7t) CollectionsKt.Y(this.a)).a;
        iArr.getClass();
        if (iArr.length == 0) {
            valueOf = null;
        } else {
            int i = iArr[0];
            int i2 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i3 = iArr[i2];
                    if (i < i3) {
                        i = i3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            valueOf = Integer.valueOf(i);
        }
        valueOf.getClass();
        return valueOf.intValue();
    }

    public final int d() {
        return this.c + this.b + this.d;
    }

    public final String toString() {
        int i = this.b;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(b(i2));
        }
        String X = CollectionsKt.X(arrayList, null, null, null, null, 63);
        StringBuilder sb = new StringBuilder("[(");
        sb.append(this.c);
        sb.append(" placeholders), ");
        sb.append(X);
        sb.append(", (");
        return f1d.i(sb, this.d, " placeholders)]");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c2k(a1k a1kVar) {
        this(a1kVar.c, a1kVar.d, a1kVar.b);
        a1kVar.getClass();
    }
}
