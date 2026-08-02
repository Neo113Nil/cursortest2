package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class rlv implements gov {
    public static final qlv Companion = new qlv();
    public final String a;

    public /* synthetic */ rlv(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, plv.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rlv) && jl40.l(this.a, ((rlv) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("AppHasBeenBackgrounded(trackId="), this.a, ')');
    }

    public rlv() {
        this.a = null;
    }
}
