package defpackage;

import com.yandex.messaging.internal.LocalMessageRef;

/* loaded from: classes15.dex */
public final class sv10 {
    public final long a;
    public final Long b;
    public final Long c;
    public final LocalMessageRef d;

    public sv10(long j, Long l, Long l2, LocalMessageRef localMessageRef) {
        this.a = j;
        this.b = l;
        this.c = l2;
        this.d = localMessageRef;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sv10) {
            sv10 sv10Var = (sv10) obj;
            Long l = sv10Var.b;
            Long l2 = sv10Var.c;
            Long l3 = this.c;
            if (l3 != null && (l3.equals(l2) || l3.equals(l))) {
                return true;
            }
            Long l4 = this.b;
            if ((l4 != null && (l4.equals(l) || l4.equals(l2))) || this.a == sv10Var.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Long l = this.c;
        if (l != null) {
            return l.hashCode();
        }
        Long l2 = this.b;
        return l2 != null ? l2.hashCode() : Long.hashCode(this.a);
    }
}
