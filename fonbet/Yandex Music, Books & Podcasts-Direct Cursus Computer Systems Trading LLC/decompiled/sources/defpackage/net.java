package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class net implements Comparable {

    @NotNull
    public static final met b = new met(null);
    public final long a;

    public /* synthetic */ net(long j) {
        this.a = j;
    }

    public static String a(long j) {
        if (j >= 0) {
            String l = Long.toString(j, CharsKt.checkRadix(10));
            l.getClass();
            return l;
        }
        long j2 = 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        String l2 = Long.toString(j3, CharsKt.checkRadix(10));
        l2.getClass();
        String l3 = Long.toString(j4, CharsKt.checkRadix(10));
        l3.getClass();
        return l2.concat(l3);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.f(this.a ^ Long.MIN_VALUE, ((net) obj).a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof net) {
            return this.a == ((net) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
