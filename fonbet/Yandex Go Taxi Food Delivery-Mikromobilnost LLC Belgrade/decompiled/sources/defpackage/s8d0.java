package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
/* loaded from: classes2.dex */
public final class s8d0 {
    public static final r8d0 Companion = new r8d0();
    public static final i3y[] f = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new q2d0(15)), null};
    public final String a;
    public final m8d0 b;
    public final aad0 c;
    public final List d;
    public final p8d0 e;

    public /* synthetic */ s8d0(int i, String str, m8d0 m8d0Var, aad0 aad0Var, List list, p8d0 p8d0Var) {
        if (17 != (i & 17)) {
            qje.Z(i, 17, q8d0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = m8d0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = aad0Var;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
        this.e = p8d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8d0)) {
            return false;
        }
        s8d0 s8d0Var = (s8d0) obj;
        return jl40.l(this.a, s8d0Var.a) && jl40.l(this.b, s8d0Var.b) && jl40.l(this.c, s8d0Var.c) && jl40.l(this.d, s8d0Var.d) && jl40.l(this.e, s8d0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        m8d0 m8d0Var = this.b;
        int hashCode2 = (hashCode + (m8d0Var == null ? 0 : m8d0Var.a.hashCode())) * 31;
        aad0 aad0Var = this.c;
        return this.e.hashCode() + unr0.c((hashCode2 + (aad0Var != null ? aad0Var.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        return "PlusPayAcquisitionOfferDto(positionId=" + this.a + ", currentTariffName=" + this.b + ", tariff=" + this.c + ", options=" + this.d + ", assets=" + this.e + ')';
    }
}
