package ru.cprocsp.ACSP.tools.store.model;

import java.util.Comparator;
import ru.cprocsp.ACSP.tools.store.items.SingleItem;

/* loaded from: classes4.dex */
public class ObjectDescriptorAliasComparator implements Comparator<SingleItem> {
    @Override // java.util.Comparator
    public int compare(SingleItem singleItem, SingleItem singleItem2) {
        int compareToIgnoreCase = singleItem.getObjectDescriptor().getStoreType().compareToIgnoreCase(singleItem2.getObjectDescriptor().getStoreType());
        return compareToIgnoreCase == 0 ? singleItem.getObjectDescriptor().getObjectAlias().compareToIgnoreCase(singleItem2.getObjectDescriptor().getObjectAlias()) : compareToIgnoreCase;
    }
}
