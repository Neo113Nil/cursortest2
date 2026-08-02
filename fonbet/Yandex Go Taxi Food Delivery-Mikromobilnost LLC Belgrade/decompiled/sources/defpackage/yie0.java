package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class yie0 implements cje0 {
    public static final xie0 Companion = new xie0();
    public final int a;

    public /* synthetic */ yie0(int i, int i2) {
        if (1 == (i & 1)) {
            this.a = i2;
        } else {
            qje.Z(i, 1, wie0.a.getDescriptor());
            throw null;
        }
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yie0) && this.a == ((yie0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.s(new StringBuilder("IntValue(value="), this.a, ')');
    }

    public yie0(int i) {
        this.a = i;
    }
}
