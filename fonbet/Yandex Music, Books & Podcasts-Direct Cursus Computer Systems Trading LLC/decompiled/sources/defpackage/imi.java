package defpackage;

import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class imi {
    public final Date a;
    public final List b;

    public imi(Date date, List list) {
        date.getClass();
        this.a = date;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imi)) {
            return false;
        }
        imi imiVar = (imi) obj;
        return Intrinsics.d(this.a, imiVar.a) && this.b.equals(imiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MusicHistoryTab(date=" + this.a + ", items=" + this.b + ")";
    }
}
