package bo.app;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e {
    public final List a;

    public e(List list) {
        list.getClass();
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.areEqual(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("AcknowledgedDismissalsReceivedEvent(acknowledgedDismissals=", ")", this.a);
    }
}
