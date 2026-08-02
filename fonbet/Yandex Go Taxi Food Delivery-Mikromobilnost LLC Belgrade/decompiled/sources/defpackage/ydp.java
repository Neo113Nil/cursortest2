package defpackage;

import com.yandex.go.address.models.FavoriteAddress;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ydp {
    public final FavoriteAddress a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final ye0 e;

    public ydp(FavoriteAddress favoriteAddress, boolean z, String str, ye0 ye0Var, int i) {
        boolean z2 = (i & 4) == 0;
        str = (i & 8) != 0 ? "" : str;
        ye0Var = (i & 16) != 0 ? null : ye0Var;
        this.a = favoriteAddress;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = ye0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydp)) {
            return false;
        }
        ydp ydpVar = (ydp) obj;
        return jl40.l(this.a, ydpVar.a) && this.b == ydpVar.b && this.c == ydpVar.c && jl40.l(this.d, ydpVar.d) && jl40.l(this.e, ydpVar.e);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.e(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        ye0 ye0Var = this.e;
        return b + (ye0Var == null ? 0 : ye0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FavoriteAddressPayload(address=");
        sb.append(this.a);
        sb.append(", isNewAddress=");
        sb.append(this.b);
        sb.append(", isOnMap=");
        unr0.A(", source=", this.d, ", analyticsData=", sb, this.c);
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
