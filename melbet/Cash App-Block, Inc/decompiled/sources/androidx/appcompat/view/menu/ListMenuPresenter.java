package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import com.squareup.cash.R;
import java.util.ArrayList;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class ListMenuPresenter implements MenuPresenter, AdapterView.OnItemClickListener {
    public MenuAdapter mAdapter;
    public MenuPresenter.Callback mCallback;
    public Context mContext;
    public LayoutInflater mInflater;
    public MenuBuilder mMenu;
    public ExpandedMenuView mMenuView;

    public final class MenuAdapter extends BaseAdapter {
        public int mExpandedIndex = -1;

        public MenuAdapter() {
            findExpandedIndex();
        }

        public final void findExpandedIndex() {
            MenuBuilder menuBuilder = ListMenuPresenter.this.mMenu;
            MenuItemImpl menuItemImpl = menuBuilder.mExpandedItem;
            if (menuItemImpl != null) {
                menuBuilder.flagActionItems();
                ArrayList arrayList = menuBuilder.mNonActionItems;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((MenuItemImpl) arrayList.get(i)) == menuItemImpl) {
                        this.mExpandedIndex = i;
                        return;
                    }
                }
            }
            this.mExpandedIndex = -1;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            MenuBuilder menuBuilder = ListMenuPresenter.this.mMenu;
            menuBuilder.flagActionItems();
            int size = menuBuilder.mNonActionItems.size();
            return this.mExpandedIndex < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public final MenuItemImpl getItem(int i) {
            MenuBuilder menuBuilder = ListMenuPresenter.this.mMenu;
            menuBuilder.flagActionItems();
            ArrayList arrayList = menuBuilder.mNonActionItems;
            int i2 = this.mExpandedIndex;
            if (i2 >= 0 && i >= i2) {
                i++;
            }
            return (MenuItemImpl) arrayList.get(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = ListMenuPresenter.this.mInflater.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((MenuView.ItemView) view).initialize(getItem(i));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            findExpandedIndex();
            super.notifyDataSetChanged();
        }
    }

    public ListMenuPresenter(Context context) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean collapseItemActionView(MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean expandItemActionView(MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        return false;
    }

    public final MenuAdapter getAdapter() {
        if (this.mAdapter == null) {
            this.mAdapter = new MenuAdapter();
        }
        return this.mAdapter;
    }

    public final MenuView getMenuView(ViewGroup viewGroup) {
        if (this.mMenuView == null) {
            this.mMenuView = (ExpandedMenuView) this.mInflater.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.mAdapter == null) {
                this.mAdapter = new MenuAdapter();
            }
            this.mMenuView.setAdapter((ListAdapter) this.mAdapter);
            this.mMenuView.setOnItemClickListener(this);
        }
        return this.mMenuView;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void initForMenu(Context context, MenuBuilder menuBuilder) {
        if (this.mContext != null) {
            this.mContext = context;
            if (this.mInflater == null) {
                this.mInflater = LayoutInflater.from(context);
            }
        }
        this.mMenu = menuBuilder;
        MenuAdapter menuAdapter = this.mAdapter;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        MenuPresenter.Callback callback = this.mCallback;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.mMenu.performItemAction(this.mAdapter.getItem(i), this, 0);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        MenuDialogHelper menuDialogHelper = new MenuDialogHelper();
        menuDialogHelper.mMenu = subMenuBuilder;
        AlertDialog.Builder builder = new AlertDialog.Builder(subMenuBuilder.mContext);
        ListMenuPresenter listMenuPresenter = new ListMenuPresenter(builder.getContext());
        menuDialogHelper.mPresenter = listMenuPresenter;
        listMenuPresenter.mCallback = menuDialogHelper;
        subMenuBuilder.addMenuPresenter(listMenuPresenter);
        MenuAdapter adapter = menuDialogHelper.mPresenter.getAdapter();
        AlertController.AlertParams alertParams = builder.P;
        alertParams.mAdapter = adapter;
        alertParams.mOnClickListener = menuDialogHelper;
        View view = subMenuBuilder.mHeaderView;
        if (view != null) {
            alertParams.mCustomTitleView = view;
        } else {
            alertParams.mIcon = subMenuBuilder.mHeaderIcon;
            builder.setTitle(subMenuBuilder.mHeaderTitle);
        }
        alertParams.mOnKeyListener = menuDialogHelper;
        AlertDialog create = builder.create();
        menuDialogHelper.mDialog = create;
        create.setOnDismissListener(menuDialogHelper);
        WindowManager.LayoutParams attributes = menuDialogHelper.mDialog.getWindow().getAttributes();
        attributes.type = IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_COLOR_TABLE;
        attributes.flags |= PKIFailureInfo.unsupportedVersion;
        menuDialogHelper.mDialog.show();
        MenuPresenter.Callback callback = this.mCallback;
        if (callback == null) {
            return true;
        }
        callback.onOpenSubMenu(subMenuBuilder);
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void setCallback(MenuPresenter.Callback callback) {
        this.mCallback = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView() {
        MenuAdapter menuAdapter = this.mAdapter;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }
}
