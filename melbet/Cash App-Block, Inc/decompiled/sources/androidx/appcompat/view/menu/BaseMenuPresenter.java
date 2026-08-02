package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.MenuPresenter;

/* loaded from: classes3.dex */
public abstract class BaseMenuPresenter implements MenuPresenter {
    public MenuPresenter.Callback mCallback;
    public Context mContext;
    public int mItemLayoutRes;
    public MenuBuilder mMenu;
    public int mMenuLayoutRes;
    public MenuView mMenuView;
    public Context mSystemContext;
    public LayoutInflater mSystemInflater;

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean collapseItemActionView(MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean expandItemActionView(MenuItemImpl menuItemImpl) {
        return false;
    }
}
