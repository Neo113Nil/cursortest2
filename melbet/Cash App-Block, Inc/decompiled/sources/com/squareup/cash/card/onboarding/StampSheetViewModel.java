package com.squareup.cash.card.onboarding;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StampSheetViewModel {
    public final boolean limitReached;
    public final List selectedStamps;
    public final List stamps;

    public StampSheetViewModel(List list, List list2, boolean z) {
        list.getClass();
        list2.getClass();
        this.stamps = list;
        this.selectedStamps = list2;
        this.limitReached = z;
    }

    public static StampSheetViewModel copy$default(StampSheetViewModel stampSheetViewModel, List list, boolean z) {
        List list2 = stampSheetViewModel.stamps;
        stampSheetViewModel.getClass();
        list2.getClass();
        list.getClass();
        return new StampSheetViewModel(list2, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StampSheetViewModel)) {
            return false;
        }
        StampSheetViewModel stampSheetViewModel = (StampSheetViewModel) obj;
        return Intrinsics.areEqual(this.stamps, stampSheetViewModel.stamps) && Intrinsics.areEqual(this.selectedStamps, stampSheetViewModel.selectedStamps) && this.limitReached == stampSheetViewModel.limitReached;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.limitReached) + Recorder$$ExternalSyntheticOutline2.m(this.stamps.hashCode() * 31, 31, this.selectedStamps);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(re$$ExternalSyntheticOutline0.m("StampSheetViewModel(stamps=", ", selectedStamps=", ", limitReached=", this.stamps, this.selectedStamps), this.limitReached, ")");
    }
}
