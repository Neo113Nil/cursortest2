package androidx.compose.runtime;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;

/* loaded from: classes.dex */
public final class OpaqueKey {
    public final String key;

    public OpaqueKey(String str) {
        this.key = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpaqueKey) && this.key.equals(((OpaqueKey) obj).key);
    }

    public final int hashCode() {
        return this.key.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("OpaqueKey(key="), this.key, ')');
    }
}
