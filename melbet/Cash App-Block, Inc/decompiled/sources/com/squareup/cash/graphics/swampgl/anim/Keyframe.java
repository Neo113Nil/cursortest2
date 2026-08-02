package com.squareup.cash.graphics.swampgl.anim;

/* loaded from: classes6.dex */
public final class Keyframe {
    public final float time;
    public final Object value;

    public Keyframe(Object obj, float f) {
        this.time = f;
        this.value = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Keyframe)) {
            return false;
        }
        Keyframe keyframe = (Keyframe) obj;
        return Float.compare(this.time, keyframe.time) == 0 && this.value.equals(keyframe.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + (Float.hashCode(this.time) * 31);
    }

    public final String toString() {
        return "Keyframe(time=" + this.time + ", value=" + this.value + ")";
    }
}
