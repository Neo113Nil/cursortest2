package defpackage;

import java.math.BigInteger;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class s0u implements Comparable {
    public static final s0u f;
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final jyr e = btf.b(new ncs(10, this));

    static {
        new s0u("", 0, 0, 0);
        f = new s0u("", 0, 1, 0);
        new s0u("", 1, 0, 0);
    }

    public s0u(String str, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        s0u s0uVar = (s0u) obj;
        s0uVar.getClass();
        Object value = this.e.getValue();
        value.getClass();
        Object value2 = s0uVar.e.getValue();
        value2.getClass();
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s0u)) {
            return false;
        }
        s0u s0uVar = (s0u) obj;
        return this.a == s0uVar.a && this.b == s0uVar.b && this.c == s0uVar.c;
    }

    public final int hashCode() {
        return ((((527 + this.a) * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        String str = this.d;
        String g = !StringsKt.U(str) ? f1d.g("-", str) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        sb.append(this.b);
        sb.append('.');
        return f1d.i(sb, this.c, g);
    }
}
