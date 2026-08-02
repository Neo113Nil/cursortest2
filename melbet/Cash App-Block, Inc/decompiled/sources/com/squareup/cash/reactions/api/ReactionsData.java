package com.squareup.cash.reactions.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ReactionsData {
    public final List existingReactions;
    public final List extendedReactions;
    public final List quickReactions;

    public ReactionsData(List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        this.quickReactions = list;
        this.existingReactions = list2;
        this.extendedReactions = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactionsData)) {
            return false;
        }
        ReactionsData reactionsData = (ReactionsData) obj;
        return Intrinsics.areEqual(this.quickReactions, reactionsData.quickReactions) && Intrinsics.areEqual(this.existingReactions, reactionsData.existingReactions) && this.extendedReactions.equals(reactionsData.extendedReactions);
    }

    public final int hashCode() {
        return this.extendedReactions.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.quickReactions.hashCode() * 31, 31, this.existingReactions);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(re$$ExternalSyntheticOutline0.m("ReactionsData(quickReactions=", ", existingReactions=", ", extendedReactions=", this.quickReactions, this.existingReactions), this.extendedReactions, ")");
    }
}
