package defpackage;

@gsq0(with = t630.class)
/* loaded from: classes4.dex */
public final class xrg extends trg {
    public static final wrg Companion = new wrg();
    public final int b;

    public xrg(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        w511.f(oyr.j(i, "Unit duration must be positive, but was ", " months."));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xrg) {
            return this.b == ((xrg) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ 131072;
    }

    public final String toString() {
        int i = this.b;
        return i % 1200 == 0 ? asg.a(i / 1200, "CENTURY") : i % 12 == 0 ? asg.a(i / 12, "YEAR") : i % 3 == 0 ? asg.a(i / 3, "QUARTER") : asg.a(i, "MONTH");
    }
}
