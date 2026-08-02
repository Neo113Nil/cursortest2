package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qx3 {
    public final u8j0 a;
    public final vou0 b;
    public final rgq0 c;
    public final List d;
    public final u8j0 e;
    public final h5a0 f;
    public final h5a0 g;
    public final boolean h;

    public qx3(u8j0 u8j0Var, vou0 vou0Var, rgq0 rgq0Var, List list, u8j0 u8j0Var2, h5a0 h5a0Var, h5a0 h5a0Var2, boolean z) {
        this.a = u8j0Var;
        this.b = vou0Var;
        this.c = rgq0Var;
        this.d = list;
        this.e = u8j0Var2;
        this.f = h5a0Var;
        this.g = h5a0Var2;
        this.h = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [u8j0] */
    public static qx3 a(qx3 qx3Var, r8j0 r8j0Var, vou0 vou0Var, rgq0 rgq0Var, List list, u8j0 u8j0Var, h5a0 h5a0Var, h5a0 h5a0Var2, boolean z, int i) {
        r8j0 r8j0Var2 = r8j0Var;
        if ((i & 1) != 0) {
            r8j0Var2 = qx3Var.a;
        }
        r8j0 r8j0Var3 = r8j0Var2;
        if ((i & 2) != 0) {
            vou0Var = qx3Var.b;
        }
        vou0 vou0Var2 = vou0Var;
        if ((i & 4) != 0) {
            rgq0Var = qx3Var.c;
        }
        rgq0 rgq0Var2 = rgq0Var;
        if ((i & 8) != 0) {
            list = qx3Var.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            u8j0Var = qx3Var.e;
        }
        u8j0 u8j0Var2 = u8j0Var;
        if ((i & 32) != 0) {
            h5a0Var = qx3Var.f;
        }
        h5a0 h5a0Var3 = h5a0Var;
        h5a0 h5a0Var4 = (i & 64) != 0 ? qx3Var.g : h5a0Var2;
        boolean z2 = (i & 128) != 0 ? qx3Var.h : z;
        qx3Var.getClass();
        return new qx3(r8j0Var3, vou0Var2, rgq0Var2, list2, u8j0Var2, h5a0Var3, h5a0Var4, z2);
    }

    public final csi0 b() {
        asi0 asi0Var = (asi0) this.e.a();
        if (asi0Var != null) {
            return asi0Var.a;
        }
        return null;
    }

    public final boolean c() {
        asi0 asi0Var = (asi0) this.e.a();
        List list = asi0Var != null ? asi0Var.i : null;
        if (list == null) {
            return true;
        }
        List list2 = list;
        h5a0 h5a0Var = this.f;
        return a.G(list2, h5a0Var != null ? h5a0Var.getId() : null) || !(h5a0Var instanceof e5a0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx3)) {
            return false;
        }
        qx3 qx3Var = (qx3) obj;
        return jl40.l(this.a, qx3Var.a) && jl40.l(this.b, qx3Var.b) && jl40.l(this.c, qx3Var.c) && jl40.l(this.d, qx3Var.d) && jl40.l(this.e, qx3Var.e) && jl40.l(this.f, qx3Var.f) && jl40.l(this.g, qx3Var.g) && this.h == qx3Var.h;
    }

    public final int hashCode() {
        u8j0 u8j0Var = this.a;
        int hashCode = (u8j0Var == null ? 0 : u8j0Var.hashCode()) * 31;
        vou0 vou0Var = this.b;
        int hashCode2 = (this.e.hashCode() + unr0.c((this.c.hashCode() + ((hashCode + (vou0Var == null ? 0 : vou0Var.hashCode())) * 31)) * 31, 31, this.d)) * 31;
        h5a0 h5a0Var = this.f;
        int hashCode3 = (hashCode2 + (h5a0Var == null ? 0 : h5a0Var.hashCode())) * 31;
        h5a0 h5a0Var2 = this.g;
        return Boolean.hashCode(this.h) + ((hashCode3 + (h5a0Var2 != null ? h5a0Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AutoTopupRegularState(saveStatus=" + this.a + ", instruction=" + this.b + ", selectedOption=" + this.c + ", validationErrors=" + this.d + ", autoTopupResponse=" + this.e + ", selectedPaymentMethod=" + this.f + ", newSelectedPaymentMethod=" + this.g + ", shouldShowSourceError=" + this.h + Extension.C_BRAKE;
    }

    public qx3(int i) {
        this(null, null, rgq0.g, EmptyList.a, new t8j0(), null, null, true);
    }

    public qx3() {
        this(0);
    }
}
