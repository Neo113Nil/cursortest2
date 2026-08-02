package defpackage;

import com.yandex.go.taxi.order.details.v1.elements.route_point.DetailsCardRoutePointsStyleInteractor$RoutePointsState;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class z6j {
    public final DetailsCardRoutePointsStyleInteractor$RoutePointsState a;
    public final List b;

    public z6j(DetailsCardRoutePointsStyleInteractor$RoutePointsState detailsCardRoutePointsStyleInteractor$RoutePointsState, List list) {
        this.a = detailsCardRoutePointsStyleInteractor$RoutePointsState;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6j)) {
            return false;
        }
        z6j z6jVar = (z6j) obj;
        return this.a == z6jVar.a && jl40.l(this.b, z6jVar.b);
    }

    public final int hashCode() {
        DetailsCardRoutePointsStyleInteractor$RoutePointsState detailsCardRoutePointsStyleInteractor$RoutePointsState = this.a;
        int hashCode = (detailsCardRoutePointsStyleInteractor$RoutePointsState == null ? 0 : detailsCardRoutePointsStyleInteractor$RoutePointsState.hashCode()) * 31;
        List list = this.b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "RoutePointsDomainModel(state=" + this.a + ", addresses=" + this.b + Extension.C_BRAKE;
    }
}
