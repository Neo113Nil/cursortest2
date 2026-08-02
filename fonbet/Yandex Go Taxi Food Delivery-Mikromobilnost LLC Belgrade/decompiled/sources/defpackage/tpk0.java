package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$IdType;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$TripButtonName;

/* loaded from: classes5.dex */
public final class tpk0 {
    public final String a;
    public final FavoritesAnalytics$IdType b;
    public final FavoritesAnalytics$TripButtonName c;

    public tpk0(String str, FavoritesAnalytics$IdType favoritesAnalytics$IdType, FavoritesAnalytics$TripButtonName favoritesAnalytics$TripButtonName) {
        this.a = str;
        this.b = favoritesAnalytics$IdType;
        this.c = favoritesAnalytics$TripButtonName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpk0)) {
            return false;
        }
        tpk0 tpk0Var = (tpk0) obj;
        return jl40.l(this.a, tpk0Var.a) && this.b == tpk0Var.b && this.c == tpk0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RideData(id=" + this.a + ", idType=" + this.b + ", buttonName=" + this.c + Extension.C_BRAKE;
    }
}
