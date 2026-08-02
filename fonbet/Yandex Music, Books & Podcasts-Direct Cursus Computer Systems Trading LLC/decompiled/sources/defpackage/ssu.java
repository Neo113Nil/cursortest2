package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ssu implements vsu {
    public final int a;
    public final int b;
    public final Long c;

    public ssu(int i, int i2, Long l) {
        this.a = i;
        this.b = i2;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssu)) {
            return false;
        }
        ssu ssuVar = (ssu) obj;
        return this.a == ssuVar.a && this.b == ssuVar.b && Intrinsics.d(this.c, ssuVar.c);
    }

    public final int hashCode() {
        int a = f1d.a(this.b, Integer.hashCode(this.a) * 31, 31);
        Long l = this.c;
        return a + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder m = f1d.m("StartFromIndex(current=", ran.a(this.a), ", live=", ran.a(this.b), ", progress=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }
}
