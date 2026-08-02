package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class sd11 {
    public static final ld11 Companion = new ld11();
    public final rd11 a;

    public /* synthetic */ sd11(int i, rd11 rd11Var) {
        if (1 == (i & 1)) {
            this.a = rd11Var;
        } else {
            qje.Z(i, 1, kd11.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sd11) && jl40.l(this.a, ((sd11) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "TreasuryRequest(geolocationParams=" + this.a + ')';
    }

    public sd11(rd11 rd11Var) {
        this.a = rd11Var;
    }
}
