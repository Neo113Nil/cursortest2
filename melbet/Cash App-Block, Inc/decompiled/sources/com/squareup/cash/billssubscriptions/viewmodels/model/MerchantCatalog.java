package com.squareup.cash.billssubscriptions.viewmodels.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class MerchantCatalog {
    public final List categories;
    public final List sections;

    public MerchantCatalog(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.sections = list;
        this.categories = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantCatalog)) {
            return false;
        }
        MerchantCatalog merchantCatalog = (MerchantCatalog) obj;
        return Intrinsics.areEqual(this.sections, merchantCatalog.sections) && Intrinsics.areEqual(this.categories, merchantCatalog.categories);
    }

    public final int hashCode() {
        return this.categories.hashCode() + (this.sections.hashCode() * 31);
    }

    public final String toString() {
        return "MerchantCatalog(sections=" + this.sections + ", categories=" + this.categories + ")";
    }
}
