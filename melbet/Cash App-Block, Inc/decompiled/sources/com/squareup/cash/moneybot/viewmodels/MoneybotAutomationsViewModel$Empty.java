package com.squareup.cash.moneybot.viewmodels;

import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneybotAutomationsViewModel$Empty {
    public final List suggestions;
    public final TabToolbarInternalViewModel tabToolbarViewModel;

    public MoneybotAutomationsViewModel$Empty(TabToolbarInternalViewModel tabToolbarInternalViewModel, List list) {
        tabToolbarInternalViewModel.getClass();
        list.getClass();
        this.tabToolbarViewModel = tabToolbarInternalViewModel;
        this.suggestions = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotAutomationsViewModel$Empty)) {
            return false;
        }
        MoneybotAutomationsViewModel$Empty moneybotAutomationsViewModel$Empty = (MoneybotAutomationsViewModel$Empty) obj;
        return Intrinsics.areEqual(this.tabToolbarViewModel, moneybotAutomationsViewModel$Empty.tabToolbarViewModel) && Intrinsics.areEqual(this.suggestions, moneybotAutomationsViewModel$Empty.suggestions);
    }

    public final int hashCode() {
        return this.suggestions.hashCode() + (this.tabToolbarViewModel.hashCode() * 31);
    }

    public final String toString() {
        return "Empty(tabToolbarViewModel=" + this.tabToolbarViewModel + ", suggestions=" + this.suggestions + ")";
    }
}
