package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class qje0 implements hle0 {
    public static final pje0 Companion = new pje0();
    public final String a;

    public /* synthetic */ qje0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, oje0.a.getDescriptor());
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
        return (obj instanceof qje0) && jl40.l(this.a, ((qje0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Bool(argName="), this.a, ')');
    }

    public qje0(String str) {
        this.a = str;
    }
}
