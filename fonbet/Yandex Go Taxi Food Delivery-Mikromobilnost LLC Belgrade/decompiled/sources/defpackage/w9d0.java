package defpackage;

import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class w9d0 {
    public static final j9d0 Companion = new j9d0();
    public static final i3y[] k = {null, null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new q2d0(21)), null, null, null, null};
    public final i9d0 a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final Set f;
    public final Boolean g;
    public final v9d0 h;
    public final s9d0 i;
    public final s8d0 j;

    public /* synthetic */ w9d0(int i, i9d0 i9d0Var, String str, String str2, int i2, String str3, Set set, Boolean bool, v9d0 v9d0Var, s9d0 s9d0Var, s8d0 s8d0Var) {
        if (921 != (i & 921)) {
            qje.Z(i, 921, f9d0.a.getDescriptor());
            throw null;
        }
        this.a = i9d0Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        this.d = i2;
        this.e = str3;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = set;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
        this.h = v9d0Var;
        this.i = s9d0Var;
        this.j = s8d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9d0)) {
            return false;
        }
        w9d0 w9d0Var = (w9d0) obj;
        return jl40.l(this.a, w9d0Var.a) && jl40.l(this.b, w9d0Var.b) && jl40.l(this.c, w9d0Var.c) && this.d == w9d0Var.d && jl40.l(this.e, w9d0Var.e) && jl40.l(this.f, w9d0Var.f) && jl40.l(this.g, w9d0Var.g) && jl40.l(this.h, w9d0Var.h) && jl40.l(this.i, w9d0Var.i) && jl40.l(this.j, w9d0Var.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int b = unr0.b(oyr.b(this.d, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.e);
        Set set = this.f;
        int hashCode3 = (b + (set == null ? 0 : set.hashCode())) * 31;
        Boolean bool = this.g;
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SmartOffer(analytics=" + this.a + ", purchaseToken=" + this.b + ", place=" + this.c + ", priority=" + this.d + ", target=" + this.e + ", requestedFeatures=" + this.f + ", isOneClickEnabled=" + this.g + ", texts=" + this.h + ", legals=" + this.i + ", compositeOffer=" + this.j + ')';
    }
}
