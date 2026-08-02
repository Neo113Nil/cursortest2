package defpackage;

import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$Animation;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$ShimmeringAnimation;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$Type;
import java.util.List;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class q6l0 {
    public static final q6l0 k = new q6l0(EmptyList.a, null, null, null, null, null, null, false, null);
    public final List a;
    public final kdc b;
    public final Float c;
    public final Float d;
    public final MapRouteAppearance$Animation e;
    public final Float f;
    public final MapRouteAppearance$ShimmeringAnimation g;
    public final boolean h;
    public final MapRouteAppearance$Type i;
    public final i3y j = a.a(new iik0(10, this));

    public q6l0(List list, kdc kdcVar, Float f, Float f2, MapRouteAppearance$Animation mapRouteAppearance$Animation, Float f3, MapRouteAppearance$ShimmeringAnimation mapRouteAppearance$ShimmeringAnimation, boolean z, MapRouteAppearance$Type mapRouteAppearance$Type) {
        this.a = list;
        this.b = kdcVar;
        this.c = f;
        this.d = f2;
        this.e = mapRouteAppearance$Animation;
        this.f = f3;
        this.g = mapRouteAppearance$ShimmeringAnimation;
        this.h = z;
        this.i = mapRouteAppearance$Type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6l0)) {
            return false;
        }
        q6l0 q6l0Var = (q6l0) obj;
        return jl40.l(this.a, q6l0Var.a) && jl40.l(this.b, q6l0Var.b) && jl40.l(this.c, q6l0Var.c) && jl40.l(this.d, q6l0Var.d) && jl40.l(this.e, q6l0Var.e) && jl40.l(this.f, q6l0Var.f) && jl40.l(this.g, q6l0Var.g) && this.h == q6l0Var.h && this.i == q6l0Var.i;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kdc kdcVar = this.b;
        int hashCode2 = (hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        Float f = this.c;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.d;
        int hashCode4 = (hashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        MapRouteAppearance$Animation mapRouteAppearance$Animation = this.e;
        int hashCode5 = (hashCode4 + (mapRouteAppearance$Animation == null ? 0 : mapRouteAppearance$Animation.hashCode())) * 31;
        Float f3 = this.f;
        int hashCode6 = (hashCode5 + (f3 == null ? 0 : f3.hashCode())) * 31;
        MapRouteAppearance$ShimmeringAnimation mapRouteAppearance$ShimmeringAnimation = this.g;
        int e = unr0.e((hashCode6 + (mapRouteAppearance$ShimmeringAnimation == null ? 0 : mapRouteAppearance$ShimmeringAnimation.hashCode())) * 31, 31, this.h);
        MapRouteAppearance$Type mapRouteAppearance$Type = this.i;
        return e + (mapRouteAppearance$Type != null ? mapRouteAppearance$Type.hashCode() : 0);
    }

    public final String toString() {
        return "RouteOverride(points=" + this.a + ", color=" + this.b + ", width=" + this.c + ", arcApproximation=" + this.d + ", animation=" + this.e + ", turnRadius=" + this.f + ", shimmeringAnimation=" + this.g + ", isWalkRoute=" + this.h + ", analyticsType=" + this.i + Extension.C_BRAKE;
    }
}
