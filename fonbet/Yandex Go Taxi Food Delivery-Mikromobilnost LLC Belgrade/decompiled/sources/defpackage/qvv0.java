package defpackage;

import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes14.dex */
public final class qvv0 {
    public static final qvv0 d = new qvv0();
    public final int a;
    public final RoutePointType b;
    public final String c;

    public qvv0() {
        RoutePointType routePointType = RoutePointType.POINT_B;
        String type = RoutePointType.SUPERAPP_DISCOVERY_MAP.getType();
        this.a = 1;
        this.b = routePointType;
        this.c = type;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qvv0);
    }

    public final int hashCode() {
        return 1484897508;
    }

    public final String toString() {
        return "Empty";
    }
}
