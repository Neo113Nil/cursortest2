package ru.yandextaxi.flutter_yandex_mapkit.styles.models;

import com.yandex.mapkit.navigation.transport.layer.RouteStyle;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"ru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$TransportRouteStyle", "", "", "showRoute", "showBalloons", "showManeuvers", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getShowRoute", "()Ljava/lang/Boolean;", "getShowBalloons", "getShowManeuvers", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RouteViewStyleData$TransportRouteStyle {

    @ysq0("showBalloons")
    private final Boolean showBalloons;

    @ysq0("showManeuvers")
    private final Boolean showManeuvers;

    @ysq0("showRoute")
    private final Boolean showRoute;

    public RouteViewStyleData$TransportRouteStyle(Boolean bool, Boolean bool2, Boolean bool3) {
        this.showRoute = bool;
        this.showBalloons = bool2;
        this.showManeuvers = bool3;
    }

    public final void a(RouteStyle routeStyle) {
        Boolean bool = this.showRoute;
        if (bool != null) {
            routeStyle.setShowRoute(bool.booleanValue());
        }
        Boolean bool2 = this.showManeuvers;
        if (bool2 != null) {
            routeStyle.setShowManoeuvres(bool2.booleanValue());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteViewStyleData$TransportRouteStyle)) {
            return false;
        }
        RouteViewStyleData$TransportRouteStyle routeViewStyleData$TransportRouteStyle = (RouteViewStyleData$TransportRouteStyle) obj;
        return jl40.l(this.showRoute, routeViewStyleData$TransportRouteStyle.showRoute) && jl40.l(this.showBalloons, routeViewStyleData$TransportRouteStyle.showBalloons) && jl40.l(this.showManeuvers, routeViewStyleData$TransportRouteStyle.showManeuvers);
    }

    public final int hashCode() {
        Boolean bool = this.showRoute;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.showBalloons;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.showManeuvers;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.showRoute;
        Boolean bool2 = this.showBalloons;
        Boolean bool3 = this.showManeuvers;
        StringBuilder sb = new StringBuilder("TransportRouteStyle(showRoute=");
        sb.append(bool);
        sb.append(", showBalloons=");
        sb.append(bool2);
        sb.append(", showManeuvers=");
        return nzs.d(sb, bool3, Extension.C_BRAKE);
    }
}
