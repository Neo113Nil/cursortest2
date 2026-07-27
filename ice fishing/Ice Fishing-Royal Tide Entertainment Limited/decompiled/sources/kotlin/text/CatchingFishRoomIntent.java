package kotlin.text;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.catchingfish.fishcatcherpro.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishRoomIntent extends BaseAdapter {
    public int CatchingFishParcelableFAB = -1;
    public final /* synthetic */ CatchingFishEspressoGraphQL CatchingFishSnackbar;

    public CatchingFishRoomIntent(CatchingFishEspressoGraphQL catchingFishEspressoGraphQL) {
        this.CatchingFishSnackbar = catchingFishEspressoGraphQL;
        CatchingFishParcelableFAB();
    }

    public final void CatchingFishParcelableFAB() {
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = this.CatchingFishSnackbar.CatchingFishWorkManager;
        CatchingFishKtorAdMob catchingFishKtorAdMob = catchingFishSharedFlowAdMob.CatchingFishDaggerHiltFAB;
        if (catchingFishKtorAdMob != null) {
            catchingFishSharedFlowAdMob.CatchingFishLayout();
            ArrayList arrayList = catchingFishSharedFlowAdMob.CatchingFishFragmentHandler;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((CatchingFishKtorAdMob) arrayList.get(i)) == catchingFishKtorAdMob) {
                    this.CatchingFishParcelableFAB = i;
                    return;
                }
            }
        }
        this.CatchingFishParcelableFAB = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: CatchingFishSnackbar, reason: merged with bridge method [inline-methods] */
    public final CatchingFishKtorAdMob getItem(int i) {
        CatchingFishEspressoGraphQL catchingFishEspressoGraphQL = this.CatchingFishSnackbar;
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = catchingFishEspressoGraphQL.CatchingFishWorkManager;
        catchingFishSharedFlowAdMob.CatchingFishLayout();
        ArrayList arrayList = catchingFishSharedFlowAdMob.CatchingFishFragmentHandler;
        catchingFishEspressoGraphQL.getClass();
        int i2 = this.CatchingFishParcelableFAB;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (CatchingFishKtorAdMob) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        CatchingFishEspressoGraphQL catchingFishEspressoGraphQL = this.CatchingFishSnackbar;
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = catchingFishEspressoGraphQL.CatchingFishWorkManager;
        catchingFishSharedFlowAdMob.CatchingFishLayout();
        int size = catchingFishSharedFlowAdMob.CatchingFishFragmentHandler.size();
        catchingFishEspressoGraphQL.getClass();
        return this.CatchingFishParcelableFAB < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.CatchingFishSnackbar.CatchingFishDaggerWebsocket.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((CatchingFishWidgetStateFlow) view).CatchingFishParcelableFAB(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        CatchingFishParcelableFAB();
        super.notifyDataSetChanged();
    }
}
