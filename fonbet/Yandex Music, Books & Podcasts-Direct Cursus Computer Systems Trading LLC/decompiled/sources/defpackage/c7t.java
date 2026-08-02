package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c7t {
    public static final c7t e = new c7t(c5b.a, 0);
    public final int[] a;
    public final List b;
    public final int c;
    public final List d;

    public c7t(int[] iArr, List list, int i, List list2) {
        iArr.getClass();
        list.getClass();
        this.a = iArr;
        this.b = list;
        this.c = i;
        this.d = list2;
        if (iArr.length == 0) {
            xq0.x("originalPageOffsets cannot be empty when constructing TransformablePage");
            throw null;
        }
        if (list2 == null || list2.size() == list.size()) {
            return;
        }
        list2.getClass();
        throw new IllegalArgumentException(("If originalIndices (size = " + list2.size() + ") is provided, it must be same length as data (size = " + list.size() + ')').toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c7t.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        c7t c7tVar = (c7t) obj;
        return Arrays.equals(this.a, c7tVar.a) && Intrinsics.d(this.b, c7tVar.b) && this.c == c7tVar.c && Intrinsics.d(this.d, c7tVar.d);
    }

    public final int hashCode() {
        int d = (k5r.d(Arrays.hashCode(this.a) * 31, 31, this.b) + this.c) * 31;
        List list = this.d;
        return d + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformablePage(originalPageOffsets=");
        sb.append(Arrays.toString(this.a));
        sb.append(", data=");
        sb.append(this.b);
        sb.append(", hintOriginalPageOffset=");
        sb.append(this.c);
        sb.append(", hintOriginalIndices=");
        return eta.h(sb, this.d, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c7t(List list, int i) {
        this(new int[]{i}, list, i, null);
        list.getClass();
    }
}
