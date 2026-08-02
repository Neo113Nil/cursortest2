package com.google.maps.android.projection;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class Point {
    public final double x;
    public final double y;

    public Point(double d, double d2) {
        this.x = d;
        this.y = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Point.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        Point point = (Point) obj;
        return this.x == point.x && this.y == point.y;
    }

    public final int hashCode() {
        return Double.hashCode(this.y) + (Double.hashCode(this.x) * 31);
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("Point(x=", ", y=", this.x), this.y, ")");
    }
}
