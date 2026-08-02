package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.AppCompatPopupWindow;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.MenuPopupWindow;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.alexvasilkov.gestures.animation.ViewPositionHolder;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior$$ExternalSyntheticLambda0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.EndCompoundLayout;
import com.squareup.cash.R;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.cash.treehouse.hostview.LifecycleState;
import com.squareup.cash.ui.util.RealCashScreenBrightness;
import com.withpersona.sdk2.camera.CameraXController;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$$ExternalSyntheticLambda1;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes3.dex */
public final class StandardMenuPopup extends MenuPopup implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final MenuAdapter mAdapter;
    public View mAnchorView;
    public int mContentWidth;
    public final Context mContext;
    public boolean mHasContentWidth;
    public final MenuBuilder mMenu;
    public PopupWindow.OnDismissListener mOnDismissListener;
    public final boolean mOverflowOnly;
    public final MenuPopupWindow mPopup;
    public final int mPopupMaxWidth;
    public final int mPopupStyleAttr;
    public final int mPopupStyleRes;
    public MenuPresenter.Callback mPresenterCallback;
    public boolean mShowTitle;
    public View mShownAnchorView;
    public ViewTreeObserver mTreeObserver;
    public boolean mWasDismissed;
    public final AppCompatSpinner.AnonymousClass2 mGlobalLayoutListener = new AppCompatSpinner.AnonymousClass2(this, 2);
    public final AnonymousClass2 mAttachStateChangeListener = new AnonymousClass2(this, 0);
    public int mDropDownGravity = 0;

    /* renamed from: androidx.appcompat.view.menu.StandardMenuPopup$2, reason: invalid class name */
    public final class AnonymousClass2 implements View.OnAttachStateChangeListener {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnonymousClass2(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        private final void onViewAttachedToWindow$androidx$appcompat$view$menu$CascadingMenuPopup$2(View view) {
        }

        private final void onViewAttachedToWindow$androidx$appcompat$view$menu$StandardMenuPopup$2(View view) {
        }

        private final void onViewAttachedToWindow$com$google$android$material$behavior$HideBottomViewOnScrollBehavior$1(View view) {
        }

        private final void onViewAttachedToWindow$com$google$android$material$behavior$HideViewOnScrollBehavior$1(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                case 1:
                    break;
                case 2:
                    ((ViewPositionHolder) obj).onViewAttached(view, true);
                    break;
                case 3:
                case 4:
                    break;
                case 5:
                    EndCompoundLayout endCompoundLayout = (EndCompoundLayout) obj;
                    AccessibilityManager accessibilityManager = endCompoundLayout.accessibilityManager;
                    if (endCompoundLayout.touchExplorationStateChangeListener != null && accessibilityManager != null && endCompoundLayout.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(endCompoundLayout.touchExplorationStateChangeListener);
                        break;
                    }
                    break;
                case 6:
                    view.getClass();
                    CashTreehouseLayout.TreehouseHostViewService treehouseHostViewService = ((CashTreehouseLayout) obj).hostViewService;
                    LifecycleState lifecycleState = LifecycleState.APPEARED;
                    StateFlowImpl stateFlowImpl = treehouseHostViewService.state;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, lifecycleState);
                    break;
                case 7:
                    view.getClass();
                    ((RealCashScreenBrightness) obj).setScreenBrightness(1.0f);
                    break;
                case 8:
                    view.getClass();
                    ((CameraXController) obj).cameraStatsManager.startRecordingState();
                    break;
                case 9:
                    view.getClass();
                    break;
                default:
                    view.getClass();
                    view.postDelayed(new UiStepBottomSheet$$ExternalSyntheticLambda1((BottomSheetBehavior) obj, 3), 100L);
                    break;
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            AccessibilityManager accessibilityManager2;
            AccessibilityManager accessibilityManager3;
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                    StandardMenuPopup standardMenuPopup = (StandardMenuPopup) obj;
                    ViewTreeObserver viewTreeObserver = standardMenuPopup.mTreeObserver;
                    if (viewTreeObserver != null) {
                        if (!viewTreeObserver.isAlive()) {
                            standardMenuPopup.mTreeObserver = view.getViewTreeObserver();
                        }
                        standardMenuPopup.mTreeObserver.removeGlobalOnLayoutListener(standardMenuPopup.mGlobalLayoutListener);
                    }
                    view.removeOnAttachStateChangeListener(this);
                    break;
                case 1:
                    CascadingMenuPopup cascadingMenuPopup = (CascadingMenuPopup) obj;
                    ViewTreeObserver viewTreeObserver2 = cascadingMenuPopup.mTreeObserver;
                    if (viewTreeObserver2 != null) {
                        if (!viewTreeObserver2.isAlive()) {
                            cascadingMenuPopup.mTreeObserver = view.getViewTreeObserver();
                        }
                        cascadingMenuPopup.mTreeObserver.removeGlobalOnLayoutListener(cascadingMenuPopup.mGlobalLayoutListener);
                    }
                    view.removeOnAttachStateChangeListener(this);
                    break;
                case 2:
                    ((ViewPositionHolder) obj).onViewAttached(view, false);
                    break;
                case 3:
                    HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                    HideViewOnScrollBehavior$$ExternalSyntheticLambda0 hideViewOnScrollBehavior$$ExternalSyntheticLambda0 = hideBottomViewOnScrollBehavior.touchExplorationListener;
                    if (hideViewOnScrollBehavior$$ExternalSyntheticLambda0 != null && (accessibilityManager = hideBottomViewOnScrollBehavior.accessibilityManager) != null) {
                        accessibilityManager.removeTouchExplorationStateChangeListener(hideViewOnScrollBehavior$$ExternalSyntheticLambda0);
                        hideBottomViewOnScrollBehavior.touchExplorationListener = null;
                        break;
                    }
                    break;
                case 4:
                    HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                    HideViewOnScrollBehavior$$ExternalSyntheticLambda0 hideViewOnScrollBehavior$$ExternalSyntheticLambda02 = hideViewOnScrollBehavior.touchExplorationListener;
                    if (hideViewOnScrollBehavior$$ExternalSyntheticLambda02 != null && (accessibilityManager2 = hideViewOnScrollBehavior.accessibilityManager) != null) {
                        accessibilityManager2.removeTouchExplorationStateChangeListener(hideViewOnScrollBehavior$$ExternalSyntheticLambda02);
                        hideViewOnScrollBehavior.touchExplorationListener = null;
                        break;
                    }
                    break;
                case 5:
                    EndCompoundLayout endCompoundLayout = (EndCompoundLayout) obj;
                    AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = endCompoundLayout.touchExplorationStateChangeListener;
                    if (touchExplorationStateChangeListener != null && (accessibilityManager3 = endCompoundLayout.accessibilityManager) != null) {
                        accessibilityManager3.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                        break;
                    }
                    break;
                case 6:
                    view.getClass();
                    CashTreehouseLayout.TreehouseHostViewService treehouseHostViewService = ((CashTreehouseLayout) obj).hostViewService;
                    LifecycleState lifecycleState = LifecycleState.DESTROYED;
                    StateFlowImpl stateFlowImpl = treehouseHostViewService.state;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, lifecycleState);
                    break;
                case 7:
                    view.getClass();
                    ((RealCashScreenBrightness) obj).setScreenBrightness(-1.0f);
                    break;
                case 8:
                    view.getClass();
                    RealCameraStatsManager realCameraStatsManager = ((CameraXController) obj).cameraStatsManager;
                    realCameraStatsManager.isEventListenerRegistered = false;
                    realCameraStatsManager.sensorManager.unregisterListener(realCameraStatsManager.sensorEventListener);
                    break;
                case 9:
                    view.getClass();
                    CameraScreenRunner cameraScreenRunner = (CameraScreenRunner) obj;
                    StandaloneCoroutine standaloneCoroutine = cameraScreenRunner.maxRecordingLimitJob;
                    if (standaloneCoroutine != null) {
                        standaloneCoroutine.cancel(null);
                    }
                    cameraScreenRunner.maxRecordingLimitJob = null;
                    break;
                default:
                    view.getClass();
                    break;
            }
        }
    }

    public StandardMenuPopup(int i, int i2, Context context, View view, MenuBuilder menuBuilder, boolean z) {
        this.mContext = context;
        this.mMenu = menuBuilder;
        this.mOverflowOnly = z;
        this.mAdapter = new MenuAdapter(menuBuilder, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.mPopupStyleAttr = i;
        this.mPopupStyleRes = i2;
        Resources resources = context.getResources();
        this.mPopupMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.mAnchorView = view;
        this.mPopup = new MenuPopupWindow(context, null, i, i2);
        menuBuilder.addMenuPresenter(this, context);
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void addMenu(MenuBuilder menuBuilder) {
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        if (isShowing()) {
            this.mPopup.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final DropDownListView getListView() {
        return this.mPopup.mDropDownList;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean isShowing() {
        return !this.mWasDismissed && this.mPopup.mPopup.isShowing();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        if (menuBuilder != this.mMenu) {
            return;
        }
        dismiss();
        MenuPresenter.Callback callback = this.mPresenterCallback;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.mWasDismissed = true;
        this.mMenu.close(true);
        ViewTreeObserver viewTreeObserver = this.mTreeObserver;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.mTreeObserver = this.mShownAnchorView.getViewTreeObserver();
            }
            this.mTreeObserver.removeGlobalOnLayoutListener(this.mGlobalLayoutListener);
            this.mTreeObserver = null;
        }
        this.mShownAnchorView.removeOnAttachStateChangeListener(this.mAttachStateChangeListener);
        PopupWindow.OnDismissListener onDismissListener = this.mOnDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        boolean z;
        if (subMenuBuilder.hasVisibleItems()) {
            MenuPopupHelper menuPopupHelper = new MenuPopupHelper(this.mPopupStyleAttr, this.mPopupStyleRes, this.mContext, this.mShownAnchorView, subMenuBuilder, this.mOverflowOnly);
            MenuPresenter.Callback callback = this.mPresenterCallback;
            menuPopupHelper.mPresenterCallback = callback;
            MenuPopup menuPopup = menuPopupHelper.mPopup;
            if (menuPopup != null) {
                menuPopup.setCallback(callback);
            }
            int size = subMenuBuilder.mItems.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = subMenuBuilder.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            menuPopupHelper.mForceShowIcon = z;
            MenuPopup menuPopup2 = menuPopupHelper.mPopup;
            if (menuPopup2 != null) {
                menuPopup2.setForceShowIcon(z);
            }
            menuPopupHelper.mOnDismissListener = this.mOnDismissListener;
            this.mOnDismissListener = null;
            this.mMenu.close(false);
            MenuPopupWindow menuPopupWindow = this.mPopup;
            int i2 = menuPopupWindow.mDropDownHorizontalOffset;
            int verticalOffset = menuPopupWindow.getVerticalOffset();
            if ((Gravity.getAbsoluteGravity(this.mDropDownGravity, this.mAnchorView.getLayoutDirection()) & 7) == 5) {
                i2 += this.mAnchorView.getWidth();
            }
            if (!menuPopupHelper.isShowing()) {
                if (menuPopupHelper.mAnchorView != null) {
                    menuPopupHelper.showPopup(i2, verticalOffset, true, true);
                }
            }
            MenuPresenter.Callback callback2 = this.mPresenterCallback;
            if (callback2 != null) {
                callback2.onOpenSubMenu(subMenuBuilder);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void setAnchorView(View view) {
        this.mAnchorView = view;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void setCallback(MenuPresenter.Callback callback) {
        this.mPresenterCallback = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void setForceShowIcon(boolean z) {
        this.mAdapter.mForceShowIcon = z;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void setGravity(int i) {
        this.mDropDownGravity = i;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void setHorizontalOffset(int i) {
        this.mPopup.mDropDownHorizontalOffset = i;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void setShowTitle(boolean z) {
        this.mShowTitle = z;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void setVerticalOffset(int i) {
        this.mPopup.setVerticalOffset(i);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void show() {
        View view;
        if (isShowing()) {
            return;
        }
        if (this.mWasDismissed || (view = this.mAnchorView) == null) {
            a$$ExternalSyntheticBUOutline0.m$1("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.mShownAnchorView = view;
        MenuPopupWindow menuPopupWindow = this.mPopup;
        AppCompatPopupWindow appCompatPopupWindow = menuPopupWindow.mPopup;
        AppCompatPopupWindow appCompatPopupWindow2 = menuPopupWindow.mPopup;
        appCompatPopupWindow.setOnDismissListener(this);
        menuPopupWindow.mItemClickListener = this;
        menuPopupWindow.mModal = true;
        appCompatPopupWindow2.setFocusable(true);
        View view2 = this.mShownAnchorView;
        boolean z = this.mTreeObserver == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.mTreeObserver = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.mGlobalLayoutListener);
        }
        view2.addOnAttachStateChangeListener(this.mAttachStateChangeListener);
        menuPopupWindow.mDropDownAnchorView = view2;
        menuPopupWindow.mDropDownGravity = this.mDropDownGravity;
        boolean z2 = this.mHasContentWidth;
        Context context = this.mContext;
        MenuAdapter menuAdapter = this.mAdapter;
        if (!z2) {
            this.mContentWidth = MenuPopup.measureIndividualMenuWidth(menuAdapter, context, this.mPopupMaxWidth);
            this.mHasContentWidth = true;
        }
        menuPopupWindow.setContentWidth(this.mContentWidth);
        appCompatPopupWindow2.setInputMethodMode(2);
        Rect rect = this.mEpicenterBounds;
        menuPopupWindow.mEpicenterBounds = rect != null ? new Rect(rect) : null;
        menuPopupWindow.show();
        DropDownListView dropDownListView = menuPopupWindow.mDropDownList;
        dropDownListView.setOnKeyListener(this);
        if (this.mShowTitle) {
            MenuBuilder menuBuilder = this.mMenu;
            if (menuBuilder.mHeaderTitle != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) dropDownListView, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuBuilder.mHeaderTitle);
                }
                frameLayout.setEnabled(false);
                dropDownListView.addHeaderView(frameLayout, null, false);
            }
        }
        menuPopupWindow.setAdapter(menuAdapter);
        menuPopupWindow.show();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView() {
        this.mHasContentWidth = false;
        MenuAdapter menuAdapter = this.mAdapter;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }
}
