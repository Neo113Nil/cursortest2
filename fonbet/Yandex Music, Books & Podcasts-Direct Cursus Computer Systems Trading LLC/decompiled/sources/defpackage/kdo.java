package defpackage;

import java.util.List;
import kotlin.collections.a;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public final class kdo extends a {
    public final List b;

    public kdo(List list) {
        list.getClass();
        this.b = list;
    }

    @Override // defpackage.w5
    public final int f() {
        return this.b.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= u75.g(this)) {
            return this.b.get(u75.g(this) - i);
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new IntRange(0, u75.g(this), 1) + "].");
    }
}
