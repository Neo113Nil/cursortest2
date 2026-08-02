package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class y4b implements egc {
    public static final y4b a = new y4b();
    public static final c5b b;
    public static final c5b c;

    static {
        c5b c5bVar = c5b.a;
        b = c5bVar;
        c = c5bVar;
    }

    @Override // defpackage.egc
    public final boolean b() {
        return false;
    }

    @Override // defpackage.egc
    public final int c(int i) {
        return -1;
    }

    @Override // defpackage.egc
    public final int d(int i) {
        return -1;
    }

    @Override // defpackage.egc
    public final mwk e(int i) {
        throw new IndexOutOfBoundsException("EmptyCommonQueue does not have any elements");
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof y4b);
    }

    @Override // defpackage.egc
    public final List f() {
        return c;
    }

    @Override // defpackage.egc
    public final List getElements() {
        return b;
    }

    public final int hashCode() {
        return 228075354;
    }

    public final String toString() {
        return "EmptyFixedQueue";
    }

    @Override // defpackage.egc
    public final egc a() {
        return this;
    }

    @Override // defpackage.egc
    public final egc g() {
        return this;
    }
}
