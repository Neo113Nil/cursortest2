package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q4k extends r4k implements Iterable, j9f {
    public final List a;
    public final Object b;
    public final Object c;
    public final int d;
    public final int e;

    static {
        new q4k(c5b.a, null, null, 0, 0);
    }

    public q4k(List list, Integer num, Object obj, int i, int i2) {
        list.getClass();
        this.a = list;
        this.b = num;
        this.c = obj;
        this.d = i;
        this.e = i2;
        if (i != Integer.MIN_VALUE && i < 0) {
            xq0.x("itemsBefore cannot be negative");
            throw null;
        }
        if (i2 == Integer.MIN_VALUE || i2 >= 0) {
            return;
        }
        xq0.x("itemsAfter cannot be negative");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4k)) {
            return false;
        }
        q4k q4kVar = (q4k) obj;
        return Intrinsics.d(this.a, q4kVar.a) && Intrinsics.d(this.b, q4kVar.b) && Intrinsics.d(this.c, q4kVar.c) && this.d == q4kVar.d && this.e == q4kVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.c;
        return Integer.hashCode(this.e) + f1d.a(this.d, (hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31, 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.listIterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
        List list = this.a;
        sb.append(list.size());
        sb.append("\n                    |   first Item: ");
        sb.append(CollectionsKt.firstOrNull(list));
        sb.append("\n                    |   last Item: ");
        sb.append(CollectionsKt.Z(list));
        sb.append("\n                    |   nextKey: ");
        sb.append(this.c);
        sb.append("\n                    |   prevKey: ");
        sb.append(this.b);
        sb.append("\n                    |   itemsBefore: ");
        sb.append(this.d);
        sb.append("\n                    |   itemsAfter: ");
        sb.append(this.e);
        sb.append("\n                    |) ");
        return hlr.e(sb.toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q4k(List list, Integer num) {
        this(list, null, num, Integer.MIN_VALUE, Integer.MIN_VALUE);
        list.getClass();
    }
}
