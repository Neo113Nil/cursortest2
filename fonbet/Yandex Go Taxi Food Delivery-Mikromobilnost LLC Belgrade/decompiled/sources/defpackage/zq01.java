package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zq01 {
    public final dh90 a;
    public final List b;
    public final boolean c;
    public final boolean d;

    public /* synthetic */ zq01(List list, int i) {
        this(zg90.a, (i & 2) != 0 ? EmptyList.a : list, false, true);
    }

    public static zq01 a(zq01 zq01Var, dh90 dh90Var, List list, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            dh90Var = zq01Var.a;
        }
        if ((i & 2) != 0) {
            list = zq01Var.b;
        }
        if ((i & 4) != 0) {
            z = zq01Var.c;
        }
        if ((i & 8) != 0) {
            z2 = zq01Var.d;
        }
        zq01Var.getClass();
        return new zq01(dh90Var, list, z, z2);
    }

    public final tq01 b() {
        return (tq01) a.S(c(), this.b);
    }

    public final int c() {
        zp01 zp01Var = new zp01(1);
        Iterator it = this.b.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((Boolean) zp01Var.invoke(it.next())).booleanValue()) {
                break;
            }
            i++;
        }
        Integer valueOf = Integer.valueOf(i);
        if (i == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    public final zq01 d(vqj0 vqj0Var) {
        return a(this, null, ftb1.c(this.b, c(), new jl01(13, vqj0Var)), false, false, 13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq01)) {
            return false;
        }
        zq01 zq01Var = (zq01) obj;
        return jl40.l(this.a, zq01Var.a) && jl40.l(this.b, zq01Var.b) && this.c == zq01Var.c && this.d == zq01Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferRequisiteState(ybByBic=");
        sb.append(this.a);
        sb.append(", forms=");
        sb.append(this.b);
        sb.append(", isProcessingResultValidation=");
        return smw0.k(", shouldCallCheckAccountBic=", Extension.C_BRAKE, sb, this.c, this.d);
    }

    public zq01(dh90 dh90Var, List list, boolean z, boolean z2) {
        this.a = dh90Var;
        this.b = list;
        this.c = z;
        this.d = z2;
    }

    public zq01() {
        this(null, 15);
    }
}
