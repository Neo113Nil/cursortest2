package defpackage;

import java.util.Calendar;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class vc7 implements Comparable {
    public final long a;
    public final TimeZone b;
    public final Object c;

    public vc7(long j, TimeZone timeZone) {
        timeZone.getClass();
        this.a = j;
        this.b = timeZone;
        this.c = btf.a(bwf.c, new rs6(16, this));
        timeZone.getRawOffset();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        vc7 vc7Var = (vc7) obj;
        vc7Var.getClass();
        return Intrinsics.f(this.a, vc7Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vc7) {
            return this.a == ((vc7) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    public final String toString() {
        Calendar calendar = (Calendar) this.c.getValue();
        calendar.getClass();
        return String.valueOf(calendar.get(1)) + '-' + StringsKt.X(2, String.valueOf(calendar.get(2) + 1)) + '-' + StringsKt.X(2, String.valueOf(calendar.get(5))) + ' ' + StringsKt.X(2, String.valueOf(calendar.get(11))) + ':' + StringsKt.X(2, String.valueOf(calendar.get(12))) + ':' + StringsKt.X(2, String.valueOf(calendar.get(13)));
    }
}
