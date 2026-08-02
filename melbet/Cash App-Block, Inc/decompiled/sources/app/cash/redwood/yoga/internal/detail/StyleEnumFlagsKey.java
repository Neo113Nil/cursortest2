package app.cash.redwood.yoga.internal.detail;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final class StyleEnumFlagsKey {
    public final KClass enumClazz;
    public final int index;

    public StyleEnumFlagsKey(int i, KClass kClass) {
        kClass.getClass();
        this.enumClazz = kClass;
        this.index = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StyleEnumFlagsKey)) {
            return false;
        }
        StyleEnumFlagsKey styleEnumFlagsKey = (StyleEnumFlagsKey) obj;
        return Intrinsics.areEqual(this.enumClazz, styleEnumFlagsKey.enumClazz) && this.index == styleEnumFlagsKey.index;
    }

    public final int hashCode() {
        return Integer.hashCode(this.index) + (this.enumClazz.hashCode() * 31);
    }

    public final String toString() {
        return "StyleEnumFlagsKey(enumClazz=" + this.enumClazz + ", index=" + this.index + ")";
    }
}
