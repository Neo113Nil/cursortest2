package androidx.camera.camera2.pipe;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes3.dex */
public final class FlashMode {
    public static final List values = CollectionsKt__CollectionsKt.listOf((Object[]) new FlashMode[]{new FlashMode(0), new FlashMode(1), new FlashMode(2)});
    public final int value;

    public /* synthetic */ FlashMode(int i) {
        this.value = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FlashMode) {
            return this.value == ((FlashMode) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FlashMode(value=", this.value, ')');
    }
}
