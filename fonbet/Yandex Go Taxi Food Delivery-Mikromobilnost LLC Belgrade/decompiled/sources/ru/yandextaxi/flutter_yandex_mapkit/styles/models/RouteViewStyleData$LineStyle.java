package ru.yandextaxi.flutter_yandex_mapkit.styles.models;

import com.yandex.mapkit.navigation.transport.layer.RouteLineStyle;
import defpackage.jl40;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"ru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$LineStyle", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$PolylineStyle;", "base", "inner", "<init>", "(Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$PolylineStyle;Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$PolylineStyle;)V", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$PolylineStyle;", "getBase", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/RouteViewStyleData$PolylineStyle;", "getInner", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RouteViewStyleData$LineStyle {

    @ysq0("base")
    private final RouteViewStyleData$PolylineStyle base;

    @ysq0("inner")
    private final RouteViewStyleData$PolylineStyle inner;

    public RouteViewStyleData$LineStyle(RouteViewStyleData$PolylineStyle routeViewStyleData$PolylineStyle, RouteViewStyleData$PolylineStyle routeViewStyleData$PolylineStyle2) {
        this.base = routeViewStyleData$PolylineStyle;
        this.inner = routeViewStyleData$PolylineStyle2;
    }

    public final void a(RouteLineStyle routeLineStyle) {
        this.base.a(routeLineStyle.getBase());
        RouteViewStyleData$PolylineStyle routeViewStyleData$PolylineStyle = this.inner;
        if (routeViewStyleData$PolylineStyle != null) {
            routeViewStyleData$PolylineStyle.a(routeLineStyle.getInner());
            routeLineStyle.setDrawInnerLine(true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteViewStyleData$LineStyle)) {
            return false;
        }
        RouteViewStyleData$LineStyle routeViewStyleData$LineStyle = (RouteViewStyleData$LineStyle) obj;
        return jl40.l(this.base, routeViewStyleData$LineStyle.base) && jl40.l(this.inner, routeViewStyleData$LineStyle.inner);
    }

    public final int hashCode() {
        int hashCode = this.base.hashCode() * 31;
        RouteViewStyleData$PolylineStyle routeViewStyleData$PolylineStyle = this.inner;
        return hashCode + (routeViewStyleData$PolylineStyle == null ? 0 : routeViewStyleData$PolylineStyle.hashCode());
    }

    public final String toString() {
        return "LineStyle(base=" + this.base + ", inner=" + this.inner + Extension.C_BRAKE;
    }
}
