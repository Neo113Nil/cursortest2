package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class x9d0 {
    public static final e9d0 Companion = new e9d0();
    public static final i3y[] h = {null, null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new q2d0(20)), null};
    public final String a;
    public final String b;
    public final String c;
    public final Long d;
    public final String e;
    public final List f;
    public final d9d0 g;

    public /* synthetic */ x9d0(int i, String str, String str2, String str3, Long l, String str4, List list, d9d0 d9d0Var) {
        if (16 != (i & 16)) {
            qje.Z(i, 16, a9d0.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l;
        }
        this.e = str4;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = d9d0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9d0)) {
            return false;
        }
        x9d0 x9d0Var = (x9d0) obj;
        return jl40.l(this.a, x9d0Var.a) && jl40.l(this.b, x9d0Var.b) && jl40.l(this.c, x9d0Var.c) && jl40.l(this.d, x9d0Var.d) && jl40.l(this.e, x9d0Var.e) && jl40.l(this.f, x9d0Var.f) && jl40.l(this.g, x9d0Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.d;
        int b = unr0.b((hashCode3 + (l == null ? 0 : l.hashCode())) * 31, 31, this.e);
        List list = this.f;
        int hashCode4 = (b + (list == null ? 0 : list.hashCode())) * 31;
        d9d0 d9d0Var = this.g;
        return hashCode4 + (d9d0Var != null ? d9d0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlusPayAcquisitionSmartOffersBatchDto(sessionId=" + this.a + ", page=" + this.b + ", mlRequestId=" + this.c + ", configId=" + this.d + ", language=" + this.e + ", smartOffers=" + this.f + ", bdui=" + this.g + ')';
    }
}
