package app.cash.redwood.yoga.internal;

import app.cash.redwood.yoga.internal.enums.YGUnit;

/* loaded from: classes3.dex */
public final class YGValue {
    public final YGUnit unit;
    public final float value;

    public YGValue(float f, YGUnit yGUnit) {
        this.value = f;
        this.unit = yGUnit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YGValue)) {
            return false;
        }
        YGValue yGValue = (YGValue) obj;
        return Float.compare(this.value, yGValue.value) == 0 && this.unit == yGValue.unit;
    }

    public final YGUnit getUnit() {
        return this.unit;
    }

    public final int hashCode() {
        return this.unit.hashCode() + (Float.hashCode(this.value) * 31);
    }

    public final String toString() {
        return "YGValue(value=" + this.value + ", unit=" + this.unit + ")";
    }
}
