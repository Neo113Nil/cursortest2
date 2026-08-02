package androidx.appcompat.view.menu;

/* loaded from: classes3.dex */
public interface MenuView {

    public interface ItemView {
        MenuItemImpl getItemData();

        void initialize(MenuItemImpl menuItemImpl);
    }

    void initialize(MenuBuilder menuBuilder);
}
