package com.squareup.cash.nearby.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class NearbyOrderedListsViewModel {
    public final String description;
    public final List sections;
    public final String title;

    public NearbyOrderedListsViewModel(String str, String str2, List list) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, list);
        this.title = str;
        this.description = str2;
        this.sections = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyOrderedListsViewModel)) {
            return false;
        }
        NearbyOrderedListsViewModel nearbyOrderedListsViewModel = (NearbyOrderedListsViewModel) obj;
        return Intrinsics.areEqual(this.title, nearbyOrderedListsViewModel.title) && Intrinsics.areEqual(this.description, nearbyOrderedListsViewModel.description) && Intrinsics.areEqual(this.sections, nearbyOrderedListsViewModel.sections);
    }

    public final int hashCode() {
        return this.sections.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NearbyOrderedListsViewModel(title=", this.title, ", description=", this.description, ", sections="), this.sections, ")");
    }
}
