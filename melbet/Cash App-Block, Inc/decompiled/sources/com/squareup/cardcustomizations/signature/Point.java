package com.squareup.cardcustomizations.signature;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public class Point {
    public final float x;
    public final float y;

    public final class Timestamped extends Point {
        public final long time;

        public Timestamped(float f, float f2, long j) {
            super(f, f2);
            this.time = j;
        }

        @Override // com.squareup.cardcustomizations.signature.Point
        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("(", this.x, ", ", this.y, ") @ ");
            m.append(this.time);
            return m.toString();
        }
    }

    public Point(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public final Point halfWayTo(Point point) {
        point.getClass();
        float f = point.x;
        float f2 = this.x;
        float f3 = point.y;
        float f4 = this.y;
        return new Point(f2 + ((f - f2) / 2.0f), f4 + ((f3 - f4) / 2.0f));
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
