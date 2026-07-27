package kotlin.text;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class CatchingFishMVPEspresso implements CatchingFishContextCameraX, CatchingFishDaggerHiltGson, AdapterView.OnItemClickListener {
    public Rect CatchingFishReduxKtor;

    public static int CatchingFishOkHttp(ListAdapter listAdapter, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public abstract void CatchingFish(boolean z);

    public abstract void CatchingFishAnimationMockk(boolean z);

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final boolean CatchingFishCloudMessaging(CatchingFishKtorAdMob catchingFishKtorAdMob) {
        return false;
    }

    public abstract void CatchingFishEspressoTesting(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob);

    public abstract void CatchingFishJetpackCompose(int i);

    public abstract void CatchingFishNavigation(PopupWindow.OnDismissListener onDismissListener);

    public abstract void CatchingFishRoomDatabase(int i);

    public abstract void CatchingFishStateLiveData(int i);

    public abstract void CatchingFishUnitTesting(View view);

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final boolean CatchingFishViewModelFAB(CatchingFishKtorAdMob catchingFishKtorAdMob) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (CatchingFishDatabindingKtor) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (CatchingFishDatabindingKtor) listAdapter).CatchingFishParcelableFAB.CatchingFishRoomDatabase((MenuItem) listAdapter.getItem(i), this, !(this instanceof CatchingFishSpannableMockk) ? 0 : 4);
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final void CatchingFishDaggerWebsocket(Context context, CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob) {
    }
}
