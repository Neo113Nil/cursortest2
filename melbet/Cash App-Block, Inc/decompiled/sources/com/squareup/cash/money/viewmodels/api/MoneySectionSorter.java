package com.squareup.cash.money.viewmodels.api;

import java.util.Comparator;

/* loaded from: classes6.dex */
public final class MoneySectionSorter implements Comparator {
    public static final MoneySectionSorter INSTANCE = new MoneySectionSorter();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Section section = (Section) obj;
        Section section2 = (Section) obj2;
        section.getClass();
        section2.getClass();
        return section.getId().compareTo(section2.getId());
    }
}
