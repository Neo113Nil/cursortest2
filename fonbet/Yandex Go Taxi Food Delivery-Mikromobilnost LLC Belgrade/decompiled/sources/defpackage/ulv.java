package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class ulv implements gov {
    public static final tlv Companion = new tlv();
    public final String a;

    public /* synthetic */ ulv(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, slv.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ulv) && jl40.l(this.a, ((ulv) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("AppHasBeenForegrounded(trackId="), this.a, ')');
    }

    public ulv() {
        this.a = null;
    }
}
