package androidx.camera.camera2.pipe;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes3.dex */
public final class AwbMode {
    public static final List values = CollectionsKt__CollectionsKt.listOf((Object[]) new AwbMode[]{new AwbMode(0), new AwbMode(1), new AwbMode(6), new AwbMode(5), new AwbMode(2), new AwbMode(3), new AwbMode(8), new AwbMode(7)});
    public final int value;

    public /* synthetic */ AwbMode(int i) {
        this.value = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AwbMode) {
            return this.value == ((AwbMode) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AwbMode(value=", this.value, ')');
    }
}
