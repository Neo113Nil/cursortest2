package defpackage;

import com.yandex.go.address.models.FavoriteAddress;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class uep {
    public final String a;
    public final tu21 b;
    public final String c;
    public final String d;
    public final FavoriteAddress e;
    public final e47 f;
    public final boolean g;
    public final n3c0 h;
    public final xj50 i;

    public uep(String str, tu21 tu21Var, String str2, String str3, FavoriteAddress favoriteAddress, e47 e47Var, boolean z, n3c0 n3c0Var, xj50 xj50Var) {
        this.a = str;
        this.b = tu21Var;
        this.c = str2;
        this.d = str3;
        this.e = favoriteAddress;
        this.f = e47Var;
        this.g = z;
        this.h = n3c0Var;
        this.i = xj50Var;
    }

    public static uep a(uep uepVar, tu21 tu21Var, String str, FavoriteAddress favoriteAddress, e47 e47Var, boolean z, n3c0 n3c0Var, xj50 xj50Var, int i) {
        String str2 = uepVar.a;
        if ((i & 2) != 0) {
            tu21Var = uepVar.b;
        }
        tu21 tu21Var2 = tu21Var;
        if ((i & 4) != 0) {
            str = uepVar.c;
        }
        String str3 = str;
        String str4 = uepVar.d;
        if ((i & 16) != 0) {
            favoriteAddress = uepVar.e;
        }
        FavoriteAddress favoriteAddress2 = favoriteAddress;
        if ((i & 32) != 0) {
            e47Var = uepVar.f;
        }
        e47 e47Var2 = e47Var;
        boolean z2 = (i & 64) != 0 ? uepVar.g : z;
        n3c0 n3c0Var2 = (i & 128) != 0 ? uepVar.h : n3c0Var;
        xj50 xj50Var2 = (i & 256) != 0 ? uepVar.i : xj50Var;
        uepVar.getClass();
        return new uep(str2, tu21Var2, str3, str4, favoriteAddress2, e47Var2, z2, n3c0Var2, xj50Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uep)) {
            return false;
        }
        uep uepVar = (uep) obj;
        return jl40.l(this.a, uepVar.a) && jl40.l(this.b, uepVar.b) && jl40.l(this.c, uepVar.c) && jl40.l(this.d, uepVar.d) && jl40.l(this.e, uepVar.e) && jl40.l(this.f, uepVar.f) && this.g == uepVar.g && jl40.l(this.h, uepVar.h) && jl40.l(this.i, uepVar.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        tu21 tu21Var = this.b;
        int hashCode2 = (this.h.hashCode() + unr0.e((this.f.hashCode() + ((this.e.hashCode() + unr0.b(unr0.b((hashCode + (tu21Var == null ? 0 : tu21Var.a.hashCode())) * 31, 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g)) * 31;
        xj50 xj50Var = this.i;
        return hashCode2 + (xj50Var != null ? xj50Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FavoriteAddressUiState(title=");
        sb.append(this.a);
        sb.append(", emoji=");
        sb.append(this.b);
        sb.append(", name=");
        g8e.D(sb, this.c, ", hint=", this.d, ", address=");
        sb.append(this.e);
        sb.append(", button=");
        sb.append(this.f);
        sb.append(", isLoading=");
        sb.append(this.g);
        sb.append(", placeTypeState=");
        sb.append(this.h);
        sb.append(", nearbyUserplaceState=");
        sb.append(this.i);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
