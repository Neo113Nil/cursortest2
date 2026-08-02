package defpackage;

import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$RevealingState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class wac0 {
    public final PlacesMapConfig$PlacesMapScreenName a;
    public final String b;
    public final float c;
    public final Float d;
    public final Float e;
    public final Float f;
    public final PlacesMapConfig$RevealingState g;
    public final String h;
    public final xac0 i;

    public wac0(PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName, String str, float f, Float f2, Float f3, Float f4, PlacesMapConfig$RevealingState placesMapConfig$RevealingState, String str2, xac0 xac0Var) {
        this.a = placesMapConfig$PlacesMapScreenName;
        this.b = str;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = placesMapConfig$RevealingState;
        this.h = str2;
        this.i = xac0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wac0)) {
            return false;
        }
        wac0 wac0Var = (wac0) obj;
        return this.a == wac0Var.a && jl40.l(this.b, wac0Var.b) && Float.compare(this.c, wac0Var.c) == 0 && jl40.l(this.d, wac0Var.d) && jl40.l(this.e, wac0Var.e) && jl40.l(this.f, wac0Var.f) && this.g == wac0Var.g && jl40.l(this.h, wac0Var.h) && jl40.l(this.i, wac0Var.i);
    }

    public final int hashCode() {
        int c = g8e.c(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31);
        Float f = this.d;
        int hashCode = (c + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.e;
        int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.f;
        int hashCode3 = (hashCode2 + (f3 == null ? 0 : f3.hashCode())) * 31;
        PlacesMapConfig$RevealingState placesMapConfig$RevealingState = this.g;
        int hashCode4 = (hashCode3 + (placesMapConfig$RevealingState == null ? 0 : placesMapConfig$RevealingState.hashCode())) * 31;
        String str = this.h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        xac0 xac0Var = this.i;
        return hashCode5 + (xac0Var != null ? xac0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlacesMapScreenConfig(screen=" + this.a + ", mapStyle=" + this.b + ", defaultMapZoom=" + this.c + ", minHeight=" + this.d + ", anchoredHeightScreenPercent=" + this.e + ", maxHeightRatio=" + this.f + ", revealingState=" + this.g + ", commonMapStyleName=" + this.h + ", sliderMapUpdatesConfig=" + this.i + Extension.C_BRAKE;
    }
}
