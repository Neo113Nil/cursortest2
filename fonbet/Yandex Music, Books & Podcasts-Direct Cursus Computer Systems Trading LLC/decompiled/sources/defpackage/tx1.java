package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class tx1 {
    public static final tx1 e = new tx1(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public tx1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = dvt.T(i3) ? dvt.v(i3) * i2 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx1)) {
            return false;
        }
        tx1 tx1Var = (tx1) obj;
        return this.a == tx1Var.a && this.b == tx1Var.b && this.c == tx1Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.a);
        sb.append(", channelCount=");
        sb.append(this.b);
        sb.append(", encoding=");
        return vz1.r(sb, this.c, ']');
    }
}
