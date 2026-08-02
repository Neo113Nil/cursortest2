package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class r6c {
    public static final q6c Companion = new q6c();
    public static final i3y[] l = {null, null, null, null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new z2c(2)), null, null, null};
    public final String a;
    public final String b;
    public final String c;
    public final q9v d;
    public final q3k0 e;
    public final q3k0 f;
    public final spd g;
    public final List h;
    public final String i;
    public final String j;
    public final q3k0 k;

    public /* synthetic */ r6c(int i, String str, String str2, String str3, q9v q9vVar, q3k0 q3k0Var, q3k0 q3k0Var2, spd spdVar, List list, String str4, String str5, q3k0 q3k0Var3) {
        if (991 != (i & 991)) {
            qje.Z(i, 991, m6c.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = q9vVar;
        this.e = q3k0Var;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = q3k0Var2;
        }
        this.g = spdVar;
        this.h = list;
        this.i = str4;
        this.j = str5;
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = q3k0Var3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6c)) {
            return false;
        }
        r6c r6cVar = (r6c) obj;
        return jl40.l(this.a, r6cVar.a) && jl40.l(this.b, r6cVar.b) && jl40.l(this.c, r6cVar.c) && jl40.l(this.d, r6cVar.d) && jl40.l(this.e, r6cVar.e) && jl40.l(this.f, r6cVar.f) && jl40.l(this.g, r6cVar.g) && jl40.l(this.h, r6cVar.h) && jl40.l(this.i, r6cVar.i) && jl40.l(this.j, r6cVar.j) && jl40.l(this.k, r6cVar.k);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31;
        q3k0 q3k0Var = this.f;
        int b = unr0.b(unr0.b(unr0.c((this.g.hashCode() + ((hashCode + (q3k0Var == null ? 0 : q3k0Var.hashCode())) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j);
        q3k0 q3k0Var2 = this.k;
        return b + (q3k0Var2 != null ? q3k0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ClosingOfferDto(eventSessionId=" + this.a + ", batchId=" + this.b + ", target=" + this.c + ", backgroundImage=" + this.d + ", closingOfferTitle=" + this.e + ", closingOfferSubtitle=" + this.f + ", offer=" + this.g + ", offerAssets=" + this.h + ", acceptButtonText=" + this.i + ", rejectButtonText=" + this.j + ", footer=" + this.k + ')';
    }
}
