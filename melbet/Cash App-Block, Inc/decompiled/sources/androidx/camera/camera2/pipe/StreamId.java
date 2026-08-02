package androidx.camera.camera2.pipe;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class StreamId {
    public final int value;

    public /* synthetic */ StreamId(int i) {
        this.value = i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m57toStringimpl(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Stream-");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof StreamId) {
            return this.value == ((StreamId) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return m57toStringimpl(this.value);
    }
}
