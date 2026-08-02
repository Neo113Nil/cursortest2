package androidx.camera.core;

import androidx.camera.core.impl.AutoValue_Identifier;
import androidx.room.TransactorKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CameraIdentifier {
    public final ArrayList cameraIds;
    public final AutoValue_Identifier compatibilityId;

    public CameraIdentifier(ArrayList arrayList, AutoValue_Identifier autoValue_Identifier) {
        this.cameraIds = arrayList;
        this.compatibilityId = autoValue_Identifier;
        TransactorKt.checkArgument("Camera ID set cannot be empty.", !arrayList.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraIdentifier)) {
            return false;
        }
        CameraIdentifier cameraIdentifier = (CameraIdentifier) obj;
        return this.cameraIds.equals(cameraIdentifier.cameraIds) && Intrinsics.areEqual(this.compatibilityId, cameraIdentifier.compatibilityId);
    }

    public final String getInternalId() {
        ArrayList arrayList = this.cameraIds;
        TransactorKt.checkState("getInternalId() is only available for single-camera identifiers.", arrayList.size() == 1);
        return (String) CollectionsKt.first((List) arrayList);
    }

    public final int hashCode() {
        int hashCode = this.cameraIds.hashCode() * 31;
        AutoValue_Identifier autoValue_Identifier = this.compatibilityId;
        return hashCode + (autoValue_Identifier != null ? autoValue_Identifier.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CameraIdentifier{cameraIds=");
        sb.append(CollectionsKt.joinToString$default(this.cameraIds, ",", null, null, 0, null, null, 62));
        AutoValue_Identifier autoValue_Identifier = this.compatibilityId;
        if (autoValue_Identifier != null) {
            str = ", compatId=" + autoValue_Identifier;
        } else {
            str = "";
        }
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, str, '}');
    }
}
