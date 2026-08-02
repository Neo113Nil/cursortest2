package defpackage;

import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$RevealingState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class zf80 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Integer f;
    public final Float g;
    public final PlacesMapConfig$RevealingState h;
    public final Float i;
    public final Float j;
    public final boolean k;

    public zf80(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, Float f, PlacesMapConfig$RevealingState placesMapConfig$RevealingState, Float f2, Float f3, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = num;
        this.g = f;
        this.h = placesMapConfig$RevealingState;
        this.i = f2;
        this.j = f3;
        this.k = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf80)) {
            return false;
        }
        zf80 zf80Var = (zf80) obj;
        return this.a == zf80Var.a && this.b == zf80Var.b && this.c == zf80Var.c && this.d == zf80Var.d && this.e == zf80Var.e && jl40.l(this.f, zf80Var.f) && jl40.l(this.g, zf80Var.g) && this.h == zf80Var.h && jl40.l(this.i, zf80Var.i) && jl40.l(this.j, zf80Var.j) && this.k == zf80Var.k;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        Integer num = this.f;
        int hashCode = (e + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.g;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        PlacesMapConfig$RevealingState placesMapConfig$RevealingState = this.h;
        int hashCode3 = (hashCode2 + (placesMapConfig$RevealingState == null ? 0 : placesMapConfig$RevealingState.hashCode())) * 31;
        Float f2 = this.i;
        int hashCode4 = (hashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.j;
        return Boolean.hashCode(this.k) + ((hashCode4 + (f3 != null ? f3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder u = qv10.u("OrganizationCardModalViewConfig(shouldOpenFullscreenOnStart=", ", isCollapsable=", ", shouldHideGeoButton=", this.a, this.b);
        nnm.v(", shouldHideZoomButtons=", ", isExternalMapEnabled=", u, this.c, this.d);
        u.append(this.e);
        u.append(", anchoredHeight=");
        u.append(this.f);
        u.append(", anchoredHeightAsScreenPercent=");
        u.append(this.g);
        u.append(", initialRevealingState=");
        u.append(this.h);
        u.append(", minHeight=");
        u.append(this.i);
        u.append(", maxHeightRatio=");
        u.append(this.j);
        u.append(", isOrganizationCardMapEnabled=");
        return x4e.i(u, this.k, Extension.C_BRAKE);
    }
}
