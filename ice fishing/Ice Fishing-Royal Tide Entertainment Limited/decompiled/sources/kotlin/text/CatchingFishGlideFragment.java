package kotlin.text;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public final class CatchingFishGlideFragment extends CatchingFishCameraXOkHttp {
    public CatchingFishKtorAdMob CatchingFish;
    public CatchingFishStripeAPIToast CatchingFishNavigation;
    public final int CatchingFishRoomDatabase;
    public final int CatchingFishStateLiveData;

    public CatchingFishGlideFragment(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.CatchingFishStateLiveData = 21;
            this.CatchingFishRoomDatabase = 22;
        } else {
            this.CatchingFishStateLiveData = 22;
            this.CatchingFishRoomDatabase = 21;
        }
    }

    @Override // kotlin.text.CatchingFishCameraXOkHttp, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        CatchingFishDatabindingKtor catchingFishDatabindingKtor;
        int i;
        int pointToPosition;
        int i2;
        if (this.CatchingFishNavigation != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                catchingFishDatabindingKtor = (CatchingFishDatabindingKtor) headerViewListAdapter.getWrappedAdapter();
            } else {
                catchingFishDatabindingKtor = (CatchingFishDatabindingKtor) adapter;
                i = 0;
            }
            CatchingFishKtorAdMob item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= catchingFishDatabindingKtor.getCount()) ? null : catchingFishDatabindingKtor.getItem(i2);
            CatchingFishKtorAdMob catchingFishKtorAdMob = this.CatchingFish;
            if (catchingFishKtorAdMob != item) {
                CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = catchingFishDatabindingKtor.CatchingFishParcelableFAB;
                if (catchingFishKtorAdMob != null) {
                    this.CatchingFishNavigation.CatchingFishLayout(catchingFishSharedFlowAdMob, catchingFishKtorAdMob);
                }
                this.CatchingFish = item;
                if (item != null) {
                    this.CatchingFishNavigation.CatchingFishCoroutine(catchingFishSharedFlowAdMob, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.CatchingFishStateLiveData) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.CatchingFishRoomDatabase) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (CatchingFishDatabindingKtor) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (CatchingFishDatabindingKtor) adapter).CatchingFishParcelableFAB.CatchingFishCoroutine(false);
        return true;
    }

    public void setHoverListener(CatchingFishStripeAPIToast catchingFishStripeAPIToast) {
        this.CatchingFishNavigation = catchingFishStripeAPIToast;
    }

    @Override // kotlin.text.CatchingFishCameraXOkHttp, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
