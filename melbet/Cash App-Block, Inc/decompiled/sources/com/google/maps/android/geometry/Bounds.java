package com.google.maps.android.geometry;

/* loaded from: classes4.dex */
public final class Bounds {
    public final double maxX;
    public final double maxY;
    public final double midX;
    public final double midY;
    public final double minX;
    public final double minY;

    public Bounds(double d, double d2, double d3, double d4) {
        this.minX = d;
        this.maxX = d2;
        this.minY = d3;
        this.maxY = d4;
        this.midX = (d + d2) / 2.0d;
        this.midY = (d3 + d4) / 2.0d;
    }

    public final boolean contains(double d, double d2) {
        return this.minX <= d && d <= this.maxX && this.minY <= d2 && d2 <= this.maxY;
    }
}
