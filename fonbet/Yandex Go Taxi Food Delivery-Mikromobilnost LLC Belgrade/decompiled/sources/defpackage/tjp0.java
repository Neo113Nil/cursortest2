package defpackage;

import androidx.compose.foundation.c;
import androidx.compose.foundation.gestures.Orientation;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ltjp0;", "Lj530;", "Lujp0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class tjp0 extends j530 {
    public final c A;
    public final wkp0 a;
    public final Orientation b;
    public final boolean c;
    public final snr w;
    public final zx40 x;
    public final vk6 y;
    public final boolean z;

    public tjp0(vk6 vk6Var, snr snrVar, zx40 zx40Var, wkp0 wkp0Var, c cVar, Orientation orientation, boolean z, boolean z2) {
        this.a = wkp0Var;
        this.b = orientation;
        this.c = z;
        this.w = snrVar;
        this.x = zx40Var;
        this.y = vk6Var;
        this.z = z2;
        this.A = cVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        ujp0 ujp0Var = new ujp0();
        ujp0Var.c = this.a;
        ujp0Var.w = this.b;
        ujp0Var.x = this.c;
        ujp0Var.y = this.w;
        ujp0Var.z = this.x;
        ujp0Var.A = this.y;
        ujp0Var.B = this.z;
        ujp0Var.C = this.A;
        return ujp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tjp0.class != obj.getClass()) {
            return false;
        }
        tjp0 tjp0Var = (tjp0) obj;
        return jl40.l(this.a, tjp0Var.a) && this.b == tjp0Var.b && this.c == tjp0Var.c && jl40.l(this.w, tjp0Var.w) && jl40.l(this.x, tjp0Var.x) && jl40.l(this.y, tjp0Var.y) && this.z == tjp0Var.z && jl40.l(this.A, tjp0Var.A);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ((ujp0) e530Var).J0(this.y, this.w, this.x, this.a, this.A, this.b, this.z, this.c);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, false);
        snr snrVar = this.w;
        int hashCode = (e + (snrVar != null ? snrVar.hashCode() : 0)) * 31;
        zx40 zx40Var = this.x;
        int hashCode2 = (hashCode + (zx40Var != null ? zx40Var.hashCode() : 0)) * 31;
        vk6 vk6Var = this.y;
        int e2 = unr0.e((hashCode2 + (vk6Var != null ? vk6Var.hashCode() : 0)) * 31, 31, this.z);
        c cVar = this.A;
        return e2 + (cVar != null ? cVar.hashCode() : 0);
    }
}
