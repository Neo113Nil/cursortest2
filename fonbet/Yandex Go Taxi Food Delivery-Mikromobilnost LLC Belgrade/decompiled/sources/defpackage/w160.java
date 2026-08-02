package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class w160 implements mo50 {
    public static final v160 Companion = new v160();
    public final String a;

    public /* synthetic */ w160(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, u160.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w160) && jl40.l(this.a, ((w160) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("NetworkTransparentColorModel(type="), this.a, ')');
    }
}
