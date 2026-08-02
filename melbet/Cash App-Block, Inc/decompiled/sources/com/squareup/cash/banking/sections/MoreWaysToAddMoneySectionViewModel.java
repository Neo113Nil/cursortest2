package com.squareup.cash.banking.sections;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class MoreWaysToAddMoneySectionViewModel {
    public final List items;
    public final String title;

    public MoreWaysToAddMoneySectionViewModel(String str, List list) {
        list.getClass();
        this.title = str;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoreWaysToAddMoneySectionViewModel)) {
            return false;
        }
        MoreWaysToAddMoneySectionViewModel moreWaysToAddMoneySectionViewModel = (MoreWaysToAddMoneySectionViewModel) obj;
        return Intrinsics.areEqual(this.title, moreWaysToAddMoneySectionViewModel.title) && Intrinsics.areEqual(this.items, moreWaysToAddMoneySectionViewModel.items);
    }

    public final int hashCode() {
        String str = this.title;
        return this.items.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("MoreWaysToAddMoneySectionViewModel(title=", this.title, ", items=", ")", this.items);
    }
}
