package androidx.camera.camera2.pipe;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class OutputStream$MirrorMode {
    public final int value;

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m50toStringimpl(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MirrorMode(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OutputStream$MirrorMode) {
            return this.value == ((OutputStream$MirrorMode) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return m50toStringimpl(this.value);
    }
}
