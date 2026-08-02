package com.squareup.cash.deposits.physical.viewmodels.map;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AtmPmdExplainerViewModel {
    public final List elements;
    public final List footerElements;

    public AtmPmdExplainerViewModel(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.elements = list;
        this.footerElements = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtmPmdExplainerViewModel)) {
            return false;
        }
        AtmPmdExplainerViewModel atmPmdExplainerViewModel = (AtmPmdExplainerViewModel) obj;
        return Intrinsics.areEqual(this.elements, atmPmdExplainerViewModel.elements) && Intrinsics.areEqual(this.footerElements, atmPmdExplainerViewModel.footerElements);
    }

    public final int hashCode() {
        return this.footerElements.hashCode() + (this.elements.hashCode() * 31);
    }

    public final String toString() {
        return "AtmPmdExplainerViewModel(elements=" + this.elements + ", footerElements=" + this.footerElements + ")";
    }
}
