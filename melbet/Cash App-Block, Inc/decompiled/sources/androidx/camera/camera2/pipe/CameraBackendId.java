package androidx.camera.camera2.pipe;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CameraBackendId {
    public final String value;

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m41toStringimpl(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(')', "CameraBackendId(value=", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CameraBackendId) {
            return Intrinsics.areEqual(this.value, ((CameraBackendId) obj).value);
        }
        return false;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return m41toStringimpl(this.value);
    }
}
