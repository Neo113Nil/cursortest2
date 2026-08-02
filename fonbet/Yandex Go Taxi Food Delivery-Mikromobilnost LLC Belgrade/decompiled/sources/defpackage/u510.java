package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class u510 {
    public final t740 a;
    public final String b;
    public final v8u c;
    public final CharSequence d;
    public final List e;
    public final wp2 f;
    public final String g;
    public final String h;
    public final boolean i;
    public final Long j;
    public final boolean k;

    public /* synthetic */ u510(t740 t740Var, String str, v8u v8uVar, CharSequence charSequence, List list, wp2 wp2Var, String str2, String str3, boolean z, int i) {
        this((i & 1) != 0 ? null : t740Var, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : v8uVar, (i & 8) != 0 ? "" : charSequence, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : wp2Var, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? true : z, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [t740] */
    public static u510 a(u510 u510Var, p740 p740Var, Long l, boolean z, int i) {
        return new u510((i & 1) != 0 ? u510Var.a : p740Var, u510Var.b, u510Var.c, u510Var.d, u510Var.e, u510Var.f, u510Var.g, u510Var.h, u510Var.i, (i & 512) != 0 ? u510Var.j : l, (i & 1024) != 0 ? u510Var.k : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u510)) {
            return false;
        }
        u510 u510Var = (u510) obj;
        return jl40.l(this.a, u510Var.a) && jl40.l(this.b, u510Var.b) && jl40.l(this.c, u510Var.c) && jl40.l(this.d, u510Var.d) && jl40.l(this.e, u510Var.e) && jl40.l(this.f, u510Var.f) && jl40.l(this.g, u510Var.g) && jl40.l(this.h, u510Var.h) && this.i == u510Var.i && jl40.l(this.j, u510Var.j) && this.k == u510Var.k;
    }

    public final int hashCode() {
        t740 t740Var = this.a;
        int hashCode = (t740Var == null ? 0 : t740Var.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        v8u v8uVar = this.c;
        int b = smw0.b((hashCode2 + (v8uVar == null ? 0 : v8uVar.hashCode())) * 31, 31, this.d);
        List list = this.e;
        int hashCode3 = (b + (list == null ? 0 : list.hashCode())) * 31;
        wp2 wp2Var = this.f;
        int hashCode4 = (hashCode3 + (wp2Var == null ? 0 : wp2Var.hashCode())) * 31;
        String str2 = this.g;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int e = unr0.e((hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.i);
        Long l = this.j;
        return Boolean.hashCode(this.k) + ((e + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MasstransitTicket(state=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", header=");
        sb.append(this.c);
        sb.append(", detailsTitle=");
        sb.append((Object) this.d);
        sb.append(", detailSlotItems=");
        sb.append(this.e);
        sb.append(", transportColor=");
        sb.append(this.f);
        sb.append(", expirationDate=");
        g8e.D(sb, this.g, ", expirationTitle=", this.h, ", isValid=");
        sb.append(this.i);
        sb.append(", expirationRemainingMs=");
        sb.append(this.j);
        sb.append(", pendingExpirationAnimation=");
        return x4e.i(sb, this.k, Extension.C_BRAKE);
    }

    public u510(t740 t740Var, String str, v8u v8uVar, CharSequence charSequence, List list, wp2 wp2Var, String str2, String str3, boolean z, Long l, boolean z2) {
        this.a = t740Var;
        this.b = str;
        this.c = v8uVar;
        this.d = charSequence;
        this.e = list;
        this.f = wp2Var;
        this.g = str2;
        this.h = str3;
        this.i = z;
        this.j = l;
        this.k = z2;
    }

    public u510() {
        this(null, null, null, null, null, null, null, null, false, 2047);
    }
}
