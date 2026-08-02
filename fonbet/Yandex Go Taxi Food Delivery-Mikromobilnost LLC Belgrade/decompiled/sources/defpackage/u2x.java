package defpackage;

import com.yandex.go.address.models.FavoriteAddress;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.favorites.list.ViewType;

/* loaded from: classes5.dex */
public final class u2x extends w2x {
    public final FavoriteAddress b;
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2x(FavoriteAddress favoriteAddress) {
        super(ViewType.SUGGESTED);
        String id = favoriteAddress.getId();
        this.b = favoriteAddress;
        this.c = id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2x)) {
            return false;
        }
        u2x u2xVar = (u2x) obj;
        return jl40.l(this.b, u2xVar.b) && jl40.l(this.c, u2xVar.c);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "Suggested(address=" + this.b + ", id=" + this.c + Extension.C_BRAKE;
    }
}
