package defpackage;

import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class ozq {
    public final Set a;
    public final Set b;
    public final List c;
    public final long d;
    public final int[] e;

    public ozq(Set set, Set set2, List list, long j, int[] iArr) {
        set.getClass();
        set2.getClass();
        list.getClass();
        this.a = set;
        this.b = set2;
        this.c = list;
        this.d = j;
        this.e = iArr;
    }

    public final String toString() {
        int size = this.a.size();
        int size2 = this.b.size();
        int[] iArr = this.e;
        Integer valueOf = iArr != null ? Integer.valueOf(iArr.length) : null;
        StringBuilder l = dfi.l("SmartDownloadingUpdateBatch(add=", size, size2, ", delete=", ", nextTime=");
        l.append(this.d);
        l.append(", program=");
        l.append(valueOf);
        l.append(", intervals=");
        l.append(this.c);
        l.append(")");
        return l.toString();
    }
}
