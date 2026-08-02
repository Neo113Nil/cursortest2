package ru.cprocsp.ACSP.tools.store.items;

import ru.cprocsp.ACSP.tools.store.items.common.ListItem;
import ru.cprocsp.ACSP.tools.store.model.ObjectDescriptor;

/* loaded from: classes4.dex */
public class InnerItem extends SingleItem {
    private boolean isSwipe;
    private int position;

    public InnerItem(ObjectDescriptor objectDescriptor) {
        super(objectDescriptor);
        this.isSwipe = false;
    }

    @Override // ru.cprocsp.ACSP.tools.store.items.SingleItem, ru.cprocsp.ACSP.tools.store.items.common.ListItem
    public boolean equalsContents(ListItem listItem) {
        return super.equalsContents(listItem);
    }

    public int getPosition() {
        return this.position;
    }

    public boolean isSwipe() {
        return this.isSwipe;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setSwipe(boolean z) {
        this.isSwipe = z;
    }
}
