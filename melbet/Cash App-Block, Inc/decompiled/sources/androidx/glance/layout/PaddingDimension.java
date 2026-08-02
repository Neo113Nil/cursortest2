package androidx.glance.layout;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class PaddingDimension {
    public final float dp;
    public final List resourceIds;

    public PaddingDimension(int i) {
        this((i & 1) != 0 ? RecyclerView.DECELERATION_RATE : 10.0f, EmptyList.INSTANCE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaddingDimension)) {
            return false;
        }
        PaddingDimension paddingDimension = (PaddingDimension) obj;
        return Dp.m1037equalsimpl0(this.dp, paddingDimension.dp) && Intrinsics.areEqual(this.resourceIds, paddingDimension.resourceIds);
    }

    public final int hashCode() {
        return this.resourceIds.hashCode() + (Float.hashCode(this.dp) * 31);
    }

    public final PaddingDimension plus(PaddingDimension paddingDimension) {
        return new PaddingDimension(this.dp + paddingDimension.dp, CollectionsKt.plus((Iterable) paddingDimension.resourceIds, (Collection) this.resourceIds));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaddingDimension(dp=");
        Recorder$$ExternalSyntheticOutline1.m104m(this.dp, ", resourceIds=", sb);
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.resourceIds, ')');
    }

    public PaddingDimension(float f, List list) {
        this.dp = f;
        this.resourceIds = list;
    }
}
