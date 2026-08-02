package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class tie0 implements uie0 {
    public static final sie0 Companion = new sie0();
    public final String a;

    public /* synthetic */ tie0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, rie0.a.getDescriptor());
            throw null;
        }
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tie0) && jl40.l(this.a, ((tie0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("StringValue(value="), this.a, ')');
    }

    public tie0(String str) {
        this.a = str;
    }
}
