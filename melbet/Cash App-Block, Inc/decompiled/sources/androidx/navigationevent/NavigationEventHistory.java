package androidx.navigationevent;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class NavigationEventHistory {
    public final int currentIndex;
    public final List mergedHistory;

    public NavigationEventHistory(List list, int i) {
        this.mergedHistory = list;
        this.currentIndex = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        List list2 = list;
        if (!list2.isEmpty()) {
            int size = list2.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        Drop$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '"), CollectionsKt__CollectionsKt.getIndices(list2), "'.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NavigationEventHistory.class != obj.getClass()) {
            return false;
        }
        NavigationEventHistory navigationEventHistory = (NavigationEventHistory) obj;
        return this.currentIndex == navigationEventHistory.currentIndex && Intrinsics.areEqual(this.mergedHistory, navigationEventHistory.mergedHistory);
    }

    public final int hashCode() {
        return this.mergedHistory.hashCode() + (this.currentIndex * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationEventHistory(currentIndex=");
        sb.append(this.currentIndex);
        sb.append(", mergedHistory=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.mergedHistory, ')');
    }

    public NavigationEventHistory() {
        this(EmptyList.INSTANCE, -1);
    }
}
