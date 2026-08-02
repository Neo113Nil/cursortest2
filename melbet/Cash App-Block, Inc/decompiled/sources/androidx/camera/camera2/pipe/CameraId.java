package androidx.camera.camera2.pipe;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class CameraId {
    public final String value;

    public /* synthetic */ CameraId(String str) {
        this.value = str;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static void m45constructorimpl(String str) {
        str.getClass();
        if (StringsKt.isBlank(str)) {
            a$$ExternalSyntheticBUOutline0.m$3("CameraId cannot be null or blank!");
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m46toStringimpl(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("CameraId-", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CameraId) {
            return Intrinsics.areEqual(this.value, ((CameraId) obj).value);
        }
        return false;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return m46toStringimpl(this.value);
    }
}
