package ru.yandex.tankerapp.go.sdk.location;

import defpackage.nzs;
import defpackage.oyr;
import defpackage.unr0;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, d2 = {"Lru/yandex/tankerapp/go/sdk/location/CartechPosition;", "Ljava/io/Serializable;", "", "latitude", CA20Status.STATUS_REQUEST_D, "getLatitude", "()D", "longitude", "getLongitude", "altitude", "getAltitude", "accuracy", "getAccuracy", "heading", "getHeading", "headingAccuracy", "getHeadingAccuracy", "speed", "getSpeed", "speedAccuracy", "getSpeedAccuracy", "tanker_go_sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CartechPosition implements Serializable {
    private final double accuracy;
    private final double latitude;
    private final double longitude;
    private final double speed;
    private final double altitude = 0.0d;
    private final double heading = 0.0d;
    private final double headingAccuracy = 0.0d;
    private final double speedAccuracy = 0.0d;

    public CartechPosition(double d, double d2, double d3, double d4) {
        this.latitude = d;
        this.longitude = d2;
        this.accuracy = d3;
        this.speed = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartechPosition)) {
            return false;
        }
        CartechPosition cartechPosition = (CartechPosition) obj;
        return Double.compare(this.latitude, cartechPosition.latitude) == 0 && Double.compare(this.longitude, cartechPosition.longitude) == 0 && Double.compare(this.altitude, cartechPosition.altitude) == 0 && Double.compare(this.accuracy, cartechPosition.accuracy) == 0 && Double.compare(this.heading, cartechPosition.heading) == 0 && Double.compare(this.headingAccuracy, cartechPosition.headingAccuracy) == 0 && Double.compare(this.speed, cartechPosition.speed) == 0 && Double.compare(this.speedAccuracy, cartechPosition.speedAccuracy) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.speedAccuracy) + unr0.a(unr0.a(unr0.a(unr0.a(unr0.a(unr0.a(Double.hashCode(this.latitude) * 31, 31, this.longitude), 31, this.altitude), 31, this.accuracy), 31, this.heading), 31, this.headingAccuracy), 31, this.speed);
    }

    public final String toString() {
        double d = this.latitude;
        double d2 = this.longitude;
        double d3 = this.altitude;
        double d4 = this.accuracy;
        double d5 = this.heading;
        double d6 = this.headingAccuracy;
        double d7 = this.speed;
        double d8 = this.speedAccuracy;
        StringBuilder u = oyr.u(d, "CartechPosition(latitude=", ", longitude=");
        u.append(d2);
        nzs.o(u, ", altitude=", d3, ", accuracy=");
        u.append(d4);
        nzs.o(u, ", heading=", d5, ", headingAccuracy=");
        u.append(d6);
        nzs.o(u, ", speed=", d7, ", speedAccuracy=");
        return nzs.c(u, d8, Extension.C_BRAKE);
    }
}
