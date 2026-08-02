package defpackage;

import com.yandex.go.address.models.FavoriteAddress;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wj50 {
    public final uu21 a;
    public final String b;
    public final FavoriteAddress c;

    public wj50(uu21 uu21Var, String str, FavoriteAddress favoriteAddress) {
        this.a = uu21Var;
        this.b = str;
        this.c = favoriteAddress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj50)) {
            return false;
        }
        wj50 wj50Var = (wj50) obj;
        return this.a.equals(wj50Var.a) && this.b.equals(wj50Var.b) && this.c.equals(wj50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "NearbyUserplaceItem(emoji=" + this.a + ", name=" + this.b + ", address=" + this.c + Extension.C_BRAKE;
    }
}
