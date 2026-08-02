package androidx.camera.camera2.pipe;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes3.dex */
public final class AfMode {
    public static final List values = CollectionsKt__CollectionsKt.listOf((Object[]) new AfMode[]{new AfMode(0), new AfMode(1), new AfMode(2), new AfMode(3), new AfMode(4), new AfMode(5)});
    public final int value;

    public /* synthetic */ AfMode(int i) {
        this.value = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AfMode) {
            return this.value == ((AfMode) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AfMode(value=", this.value, ')');
    }
}
