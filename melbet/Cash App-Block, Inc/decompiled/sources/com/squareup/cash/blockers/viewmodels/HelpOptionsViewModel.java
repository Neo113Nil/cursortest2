package com.squareup.cash.blockers.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class HelpOptionsViewModel {
    public final ArrayList helpItems;

    public HelpOptionsViewModel(ArrayList arrayList) {
        this.helpItems = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HelpOptionsViewModel) && this.helpItems.equals(((HelpOptionsViewModel) obj).helpItems);
    }

    public final int hashCode() {
        return this.helpItems.hashCode();
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("HelpOptionsViewModel(helpItems=", ")", this.helpItems);
    }
}
