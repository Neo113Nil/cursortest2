package com.squareup.cash.blockers.viewmodels;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class VerifyHelpViewModel {
    public final List helpItems;
    public final List verifyHelpItems;

    public VerifyHelpViewModel(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.helpItems = list;
        this.verifyHelpItems = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyHelpViewModel)) {
            return false;
        }
        VerifyHelpViewModel verifyHelpViewModel = (VerifyHelpViewModel) obj;
        return Intrinsics.areEqual(this.helpItems, verifyHelpViewModel.helpItems) && Intrinsics.areEqual(this.verifyHelpItems, verifyHelpViewModel.verifyHelpItems);
    }

    public final int hashCode() {
        return this.verifyHelpItems.hashCode() + (this.helpItems.hashCode() * 31);
    }

    public final String toString() {
        return "VerifyHelpViewModel(helpItems=" + this.helpItems + ", verifyHelpItems=" + this.verifyHelpItems + ")";
    }
}
