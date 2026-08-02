package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final /* synthetic */ class Toolbar$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Toolbar f$0;

    public /* synthetic */ Toolbar$$ExternalSyntheticLambda0(Toolbar toolbar, int i) {
        this.$r8$classId = i;
        this.f$0 = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Toolbar toolbar = this.f$0;
        switch (i) {
            case 0:
                Toolbar.ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = toolbar.mExpandedMenuPresenter;
                MenuItemImpl menuItemImpl = expandedActionViewMenuPresenter == null ? null : expandedActionViewMenuPresenter.mCurrentExpandedItem;
                if (menuItemImpl != null) {
                    menuItemImpl.collapseActionView();
                    break;
                }
                break;
            default:
                Iterator it = toolbar.mProvidedMenuItems.iterator();
                while (it.hasNext()) {
                    toolbar.getMenu().removeItem(((MenuItem) it.next()).getItemId());
                }
                MenuBuilder menu = toolbar.getMenu();
                ArrayList currentMenuItems = toolbar.getCurrentMenuItems();
                MenuHostHelper menuHostHelper = toolbar.mMenuHostHelper;
                SupportMenuInflater supportMenuInflater = new SupportMenuInflater(toolbar.getContext());
                Iterator it2 = menuHostHelper.mMenuProviders.iterator();
                while (it2.hasNext()) {
                    ((MenuProvider) it2.next()).onCreateMenu(menu, supportMenuInflater);
                }
                ArrayList currentMenuItems2 = toolbar.getCurrentMenuItems();
                currentMenuItems2.removeAll(currentMenuItems);
                toolbar.mProvidedMenuItems = currentMenuItems2;
                break;
        }
    }
}
