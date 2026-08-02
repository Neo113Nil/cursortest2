package com.squareup.cash.paychecks.views;

/* loaded from: classes6.dex */
public final class AngleAndQuadrant {
    public final float angle;
    public final Quadrant quadrant;

    public AngleAndQuadrant(float f, Quadrant quadrant) {
        quadrant.getClass();
        this.angle = f;
        this.quadrant = quadrant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AngleAndQuadrant)) {
            return false;
        }
        AngleAndQuadrant angleAndQuadrant = (AngleAndQuadrant) obj;
        return Float.compare(this.angle, angleAndQuadrant.angle) == 0 && this.quadrant == angleAndQuadrant.quadrant;
    }

    public final int hashCode() {
        return this.quadrant.hashCode() + (Float.hashCode(this.angle) * 31);
    }

    public final String toString() {
        return "AngleAndQuadrant(angle=" + this.angle + ", quadrant=" + this.quadrant + ")";
    }
}
