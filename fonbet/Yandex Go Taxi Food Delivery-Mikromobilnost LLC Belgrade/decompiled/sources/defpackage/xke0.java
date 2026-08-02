package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class xke0 implements hle0 {
    public static final wke0 Companion = new wke0();
    public final String a;

    public /* synthetic */ xke0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, vke0.a.getDescriptor());
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
        return (obj instanceof xke0) && jl40.l(this.a, ((xke0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("NotNull(argName="), this.a, ')');
    }

    public xke0(String str) {
        this.a = str;
    }
}
