package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.MenuPresenter;
import com.squareup.cash.R;

/* loaded from: classes3.dex */
public class MenuPopupHelper {
    public View mAnchorView;
    public final Context mContext;
    public boolean mForceShowIcon;
    public final MenuBuilder mMenu;
    public PopupWindow.OnDismissListener mOnDismissListener;
    public final boolean mOverflowOnly;
    public MenuPopup mPopup;
    public final int mPopupStyleAttr;
    public final int mPopupStyleRes;
    public MenuPresenter.Callback mPresenterCallback;
    public int mDropDownGravity = 8388611;
    public final AnonymousClass1 mInternalOnDismissListener = new PopupWindow.OnDismissListener() { // from class: androidx.appcompat.view.menu.MenuPopupHelper.1
        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            MenuPopupHelper.this.onDismiss();
        }
    };

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.view.menu.MenuPopupHelper$1] */
    public MenuPopupHelper(int i, int i2, Context context, View view, MenuBuilder menuBuilder, boolean z) {
        this.mContext = context;
        this.mMenu = menuBuilder;
        this.mAnchorView = view;
        this.mOverflowOnly = z;
        this.mPopupStyleAttr = i;
        this.mPopupStyleRes = i2;
    }

    public final MenuPopup getPopup() {
        MenuPopup standardMenuPopup;
        if (this.mPopup == null) {
            Context context = this.mContext;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int min = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.mContext;
            if (min >= dimensionPixelSize) {
                standardMenuPopup = new CascadingMenuPopup(context2, this.mAnchorView, this.mPopupStyleAttr, this.mPopupStyleRes, this.mOverflowOnly);
            } else {
                View view = this.mAnchorView;
                standardMenuPopup = new StandardMenuPopup(this.mPopupStyleAttr, this.mPopupStyleRes, context2, view, this.mMenu, this.mOverflowOnly);
            }
            standardMenuPopup.addMenu(this.mMenu);
            standardMenuPopup.setOnDismissListener(this.mInternalOnDismissListener);
            standardMenuPopup.setAnchorView(this.mAnchorView);
            standardMenuPopup.setCallback(this.mPresenterCallback);
            standardMenuPopup.setForceShowIcon(this.mForceShowIcon);
            standardMenuPopup.setGravity(this.mDropDownGravity);
            this.mPopup = standardMenuPopup;
        }
        return this.mPopup;
    }

    public final boolean isShowing() {
        MenuPopup menuPopup = this.mPopup;
        return menuPopup != null && menuPopup.isShowing();
    }

    public void onDismiss() {
        this.mPopup = null;
        PopupWindow.OnDismissListener onDismissListener = this.mOnDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void showPopup(int i, int i2, boolean z, boolean z2) {
        MenuPopup popup = getPopup();
        popup.setShowTitle(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.mDropDownGravity, this.mAnchorView.getLayoutDirection()) & 7) == 5) {
                i -= this.mAnchorView.getWidth();
            }
            popup.setHorizontalOffset(i);
            popup.setVerticalOffset(i2);
            int i3 = (int) ((this.mContext.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            popup.mEpicenterBounds = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        popup.show();
    }
}
