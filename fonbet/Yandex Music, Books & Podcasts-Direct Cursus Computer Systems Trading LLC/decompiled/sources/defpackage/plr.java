package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class plr {
    public final pv9 a;
    public final bt2 b;
    public final wa6 c;
    public final d1 d;
    public final int e;
    public final c5p f;
    public final boolean g;
    public final boolean h;

    public plr(pv9 pv9Var, bt2 bt2Var, jzi jziVar, d1 d1Var, int i, c5p c5pVar, boolean z, boolean z2) {
        d1Var.getClass();
        this.a = pv9Var;
        this.b = bt2Var;
        this.c = jziVar;
        this.d = d1Var;
        this.e = i;
        this.f = c5pVar;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plr)) {
            return false;
        }
        plr plrVar = (plr) obj;
        return Intrinsics.d(this.a, plrVar.a) && Intrinsics.d(this.b, plrVar.b) && Intrinsics.d(this.c, plrVar.c) && Intrinsics.d(this.d, plrVar.d) && this.e == plrVar.e && this.f.equals(plrVar.f) && this.g == plrVar.g && this.h == plrVar.h;
    }

    public final int hashCode() {
        pv9 pv9Var = this.a;
        int hashCode = (pv9Var == null ? 0 : pv9Var.hashCode()) * 31;
        bt2 bt2Var = this.b;
        int hashCode2 = (hashCode + (bt2Var == null ? 0 : bt2Var.hashCode())) * 31;
        wa6 wa6Var = this.c;
        return Boolean.hashCode(this.h) + k5r.e((this.f.hashCode() + f1d.a(this.e, (this.d.hashCode() + ((hashCode2 + (wa6Var != null ? wa6Var.hashCode() : 0)) * 31)) * 31, 31)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(drmTypeSupplier=");
        sb.append(this.a);
        sb.append(", reportBuilder=");
        sb.append(this.b);
        sb.append(", decoderProviderConsumer=");
        sb.append(this.c);
        sb.append(", abConfig=");
        sb.append(this.d);
        sb.append(", playerIndex=");
        sb.append(this.e);
        sb.append(", eventIndexGenerator=");
        sb.append(this.f);
        sb.append(", useSimpleManifestUrlInflater=");
        sb.append(this.g);
        sb.append(", shouldReleaseScheduledExecutorService=");
        return dfi.j(sb, this.h, ')');
    }
}
