package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class xod implements fpd {
    public static final wod Companion = new wod();
    public final ipd a;
    public final long b;

    public /* synthetic */ xod(int i, ipd ipdVar, long j) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, vod.a.getDescriptor());
            throw null;
        }
        this.a = ipdVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xod)) {
            return false;
        }
        xod xodVar = (xod) obj;
        return jl40.l(this.a, xodVar.a) && this.b == xodVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntroUntil(price=");
        sb.append(this.a);
        sb.append(", until=");
        return b64.o(sb, this.b, ')');
    }
}
