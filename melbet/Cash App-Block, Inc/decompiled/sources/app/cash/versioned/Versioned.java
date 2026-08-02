package app.cash.versioned;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Versioned {
    public final Object value;
    public final int version;

    public Versioned(Object obj, int i) {
        this.value = obj;
        this.version = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Versioned)) {
            return false;
        }
        Versioned versioned = (Versioned) obj;
        return Intrinsics.areEqual(this.value, versioned.value) && this.version == versioned.version;
    }

    public final int hashCode() {
        Object obj = this.value;
        return Integer.hashCode(this.version) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "Versioned(value=" + this.value + ", version=" + this.version + ")";
    }
}
