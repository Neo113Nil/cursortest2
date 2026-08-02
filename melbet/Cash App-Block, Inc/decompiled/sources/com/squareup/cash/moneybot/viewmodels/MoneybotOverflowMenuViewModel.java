package com.squareup.cash.moneybot.viewmodels;

import androidx.camera.viewfinder.compose.ViewfinderKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneybotOverflowMenuViewModel {
    public final List menuItems;
    public final ViewfinderKt recentChatHistoryViewModel;
    public final boolean showDebugMenuEntrypoint;

    public MoneybotOverflowMenuViewModel(List list, ViewfinderKt viewfinderKt, boolean z) {
        list.getClass();
        this.menuItems = list;
        this.recentChatHistoryViewModel = viewfinderKt;
        this.showDebugMenuEntrypoint = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotOverflowMenuViewModel)) {
            return false;
        }
        MoneybotOverflowMenuViewModel moneybotOverflowMenuViewModel = (MoneybotOverflowMenuViewModel) obj;
        return Intrinsics.areEqual(this.menuItems, moneybotOverflowMenuViewModel.menuItems) && Intrinsics.areEqual(this.recentChatHistoryViewModel, moneybotOverflowMenuViewModel.recentChatHistoryViewModel) && this.showDebugMenuEntrypoint == moneybotOverflowMenuViewModel.showDebugMenuEntrypoint;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.showDebugMenuEntrypoint) + ((this.recentChatHistoryViewModel.hashCode() + (this.menuItems.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneybotOverflowMenuViewModel(menuItems=");
        sb.append(this.menuItems);
        sb.append(", recentChatHistoryViewModel=");
        sb.append(this.recentChatHistoryViewModel);
        sb.append(", showDebugMenuEntrypoint=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showDebugMenuEntrypoint, ")");
    }
}
