package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.camera.video.Recorder;
import androidx.camera.view.PreviewView;
import androidx.core.view.ViewCompat;
import androidx.media3.common.FlagSet;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Client;
import com.squareup.cash.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class ToolbarActionBar extends ActionBar {
    public final ToolbarWidgetWrapper mDecorToolbar;
    public boolean mLastMenuVisibility;
    public final Recorder.AnonymousClass6 mMenuCallback;
    public boolean mMenuCallbackSet;
    public boolean mToolbarMenuPrepared;
    public final Window.Callback mWindowCallback;
    public final ArrayList mMenuVisibilityListeners = new ArrayList();
    public final Client.AnonymousClass7 mMenuInvalidator = new Client.AnonymousClass7(this, 1);

    public ToolbarActionBar(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        PreviewView.AnonymousClass1 anonymousClass1 = new PreviewView.AnonymousClass1(this, false);
        ToolbarWidgetWrapper toolbarWidgetWrapper = new ToolbarWidgetWrapper(toolbar, false);
        this.mDecorToolbar = toolbarWidgetWrapper;
        callback.getClass();
        this.mWindowCallback = callback;
        toolbarWidgetWrapper.mWindowCallback = callback;
        toolbar.setOnMenuItemClickListener(anonymousClass1);
        if (!toolbarWidgetWrapper.mTitleSet) {
            toolbarWidgetWrapper.mTitle = charSequence;
            if ((toolbarWidgetWrapper.mDisplayOpts & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (toolbarWidgetWrapper.mTitleSet) {
                    ViewCompat.setAccessibilityPaneTitle(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.mMenuCallback = new Recorder.AnonymousClass6(this, 3);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean closeOptionsMenu() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.mDecorToolbar.mToolbar.mMenuView;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.mPresenter) == null || !actionMenuPresenter.hideOverflowMenu()) ? false : true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean collapseActionView() {
        MenuItemImpl menuItemImpl;
        Toolbar.ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.mDecorToolbar.mToolbar.mExpandedMenuPresenter;
        if (expandedActionViewMenuPresenter == null || (menuItemImpl = expandedActionViewMenuPresenter.mCurrentExpandedItem) == null) {
            return false;
        }
        if (expandedActionViewMenuPresenter == null) {
            menuItemImpl = null;
        }
        if (menuItemImpl == null) {
            return true;
        }
        menuItemImpl.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void dispatchMenuVisibilityChanged(boolean z) {
        if (z == this.mLastMenuVisibility) {
            return;
        }
        this.mLastMenuVisibility = z;
        ArrayList arrayList = this.mMenuVisibilityListeners;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        a$$ExternalSyntheticBUOutline0.m$1();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int getDisplayOptions() {
        return this.mDecorToolbar.mDisplayOpts;
    }

    public final MenuBuilder getMenu() {
        boolean z = this.mMenuCallbackSet;
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.mDecorToolbar;
        if (!z) {
            toolbarWidgetWrapper.mToolbar.setMenuCallbacks(new FlagSet.Builder(this, 1), new Toolbar.AnonymousClass1(this));
            this.mMenuCallbackSet = true;
        }
        return toolbarWidgetWrapper.mToolbar.getMenu();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context getThemedContext() {
        return this.mDecorToolbar.mToolbar.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void hide() {
        this.mDecorToolbar.mToolbar.setVisibility(8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean invalidateOptionsMenu() {
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.mDecorToolbar;
        Toolbar toolbar = toolbarWidgetWrapper.mToolbar;
        Client.AnonymousClass7 anonymousClass7 = this.mMenuInvalidator;
        toolbar.removeCallbacks(anonymousClass7);
        Toolbar toolbar2 = toolbarWidgetWrapper.mToolbar;
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        toolbar2.postOnAnimation(anonymousClass7);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void onConfigurationChanged() {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void onDestroy() {
        this.mDecorToolbar.mToolbar.removeCallbacks(this.mMenuInvalidator);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        MenuBuilder menu = getMenu();
        if (menu == null) {
            return false;
        }
        menu.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menu.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean onMenuKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            openOptionsMenu();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean openOptionsMenu() {
        return this.mDecorToolbar.mToolbar.showOverflowMenu();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setBackgroundDrawable(ColorDrawable colorDrawable) {
        this.mDecorToolbar.mToolbar.setBackground(colorDrawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setCustomView(View view) {
        setCustomView(view, new ActionBar.LayoutParams());
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setDefaultDisplayHomeAsUpEnabled(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setDisplayHomeAsUpEnabled(boolean z) {
        setDisplayOptions(4, 4);
    }

    public final void setDisplayOptions(int i, int i2) {
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.mDecorToolbar;
        toolbarWidgetWrapper.setDisplayOptions((i & i2) | ((~i2) & toolbarWidgetWrapper.mDisplayOpts));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setDisplayShowCustomEnabled() {
        setDisplayOptions(16, 16);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setDisplayShowHomeEnabled() {
        setDisplayOptions(2, 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setShowHideAnimationEnabled(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setStackedBackgroundDrawable(ColorDrawable colorDrawable) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setTitle() {
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.mDecorToolbar;
        CharSequence text = toolbarWidgetWrapper.mToolbar.getContext().getText(R.string.stripe_3ds2_hzv_header_label);
        toolbarWidgetWrapper.mTitleSet = true;
        Toolbar toolbar = toolbarWidgetWrapper.mToolbar;
        toolbarWidgetWrapper.mTitle = text;
        if ((toolbarWidgetWrapper.mDisplayOpts & 8) != 0) {
            toolbar.setTitle(text);
            if (toolbarWidgetWrapper.mTitleSet) {
                ViewCompat.setAccessibilityPaneTitle(toolbar.getRootView(), text);
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setWindowTitle(CharSequence charSequence) {
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.mDecorToolbar;
        if (toolbarWidgetWrapper.mTitleSet) {
            return;
        }
        Toolbar toolbar = toolbarWidgetWrapper.mToolbar;
        toolbarWidgetWrapper.mTitle = charSequence;
        if ((toolbarWidgetWrapper.mDisplayOpts & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (toolbarWidgetWrapper.mTitleSet) {
                ViewCompat.setAccessibilityPaneTitle(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setCustomView(View view, ActionBar.LayoutParams layoutParams) {
        view.setLayoutParams(layoutParams);
        this.mDecorToolbar.setCustomView(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setTitle(CharSequence charSequence) {
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.mDecorToolbar;
        toolbarWidgetWrapper.mTitleSet = true;
        Toolbar toolbar = toolbarWidgetWrapper.mToolbar;
        toolbarWidgetWrapper.mTitle = charSequence;
        if ((toolbarWidgetWrapper.mDisplayOpts & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (toolbarWidgetWrapper.mTitleSet) {
                ViewCompat.setAccessibilityPaneTitle(toolbar.getRootView(), charSequence);
            }
        }
    }
}
