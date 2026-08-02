package ru.cprocsp.ACSP.tools.store.items;

import java.util.List;
import ru.cprocsp.ACSP.tools.store.items.common.ListItem;
import ru.cprocsp.ACSP.tools.store.util.IUtilHelper;

/* loaded from: classes4.dex */
public class ExpandableItem implements ListItem {
    private final List<InnerItem> certificates;
    private boolean isCollapsed = true;
    private int position;
    private final IUtilHelper.StorageType storageType;
    private final int titleRes;

    public ExpandableItem(IUtilHelper.StorageType storageType, int i, List<InnerItem> list) {
        this.storageType = storageType;
        this.titleRes = i;
        this.certificates = list;
    }

    @Override // ru.cprocsp.ACSP.tools.store.items.common.ListItem
    public boolean equalsContents(ListItem listItem) {
        ExpandableItem expandableItem = (ExpandableItem) listItem;
        return this.storageType == expandableItem.storageType && this.isCollapsed == expandableItem.isCollapsed && this.titleRes == expandableItem.titleRes && this.certificates.size() == expandableItem.certificates.size();
    }

    public List<InnerItem> getCertificates() {
        return this.certificates;
    }

    public int getPosition() {
        return this.position;
    }

    public IUtilHelper.StorageType getStorageType() {
        return this.storageType;
    }

    public int getTitleRes() {
        return this.titleRes;
    }

    public boolean isCollapsed() {
        return this.isCollapsed;
    }

    public void setCollapsed(boolean z) {
        this.isCollapsed = z;
    }

    public void setPosition(int i) {
        this.position = i;
    }
}
