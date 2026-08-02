package defpackage;

import com.yandex.go.address.models.FavoriteAddress;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class rgp implements tgp {
    public final FavoriteAddress a;

    public rgp(FavoriteAddress favoriteAddress) {
        this.a = favoriteAddress;
    }

    @Override // defpackage.ugp
    public final zzs B() {
        return this.a.getPoint();
    }

    @Override // defpackage.tgp
    public final FavoriteAddress a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rgp) && this.a.equals(((rgp) obj).a);
    }

    @Override // defpackage.ugp
    public final String getTitle() {
        return this.a.q();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Home(address=" + this.a + Extension.C_BRAKE;
    }
}
