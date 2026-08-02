package ru.cprocsp.ACSP.tools.store.items;

import ru.cprocsp.ACSP.tools.store.items.common.ListItem;
import ru.cprocsp.ACSP.tools.store.model.ObjectDescriptor;

/* loaded from: classes4.dex */
public class SingleItem implements ListItem {
    private boolean isShowDetail = false;
    private final ObjectDescriptor objectDescriptor;

    public SingleItem(ObjectDescriptor objectDescriptor) {
        this.objectDescriptor = objectDescriptor;
    }

    @Override // ru.cprocsp.ACSP.tools.store.items.common.ListItem
    public boolean equalsContents(ListItem listItem) {
        SingleItem singleItem = (SingleItem) listItem;
        return this.isShowDetail == singleItem.isShowDetail && this.objectDescriptor.equals(singleItem.objectDescriptor);
    }

    public ObjectDescriptor getObjectDescriptor() {
        return this.objectDescriptor;
    }

    public boolean isShowDetail() {
        return this.isShowDetail;
    }

    public void setShowDetail(boolean z) {
        this.isShowDetail = z;
    }
}
