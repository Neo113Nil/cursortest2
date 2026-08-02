package ru.cprocsp.ACSP.tools.store.model;

import java.security.cert.X509Certificate;
import java.util.Comparator;
import ru.cprocsp.ACSP.tools.store.items.SingleItem;

/* loaded from: classes4.dex */
public class ObjectDescriptorNotBeforeComparator implements Comparator<SingleItem> {
    @Override // java.util.Comparator
    public int compare(SingleItem singleItem, SingleItem singleItem2) {
        int compareTo = singleItem.getObjectDescriptor().getStoreType().compareTo(singleItem2.getObjectDescriptor().getStoreType());
        if (compareTo != 0) {
            return compareTo;
        }
        X509Certificate[] certificates = singleItem.getObjectDescriptor().getCertificates();
        X509Certificate[] certificates2 = singleItem2.getObjectDescriptor().getCertificates();
        if (certificates == null && certificates2 == null) {
            return 0;
        }
        if (certificates == null || certificates2 == null) {
            return certificates != null ? 1 : -1;
        }
        return certificates[0].getNotBefore().compareTo(certificates2[0].getNotBefore()) * (-1);
    }
}
