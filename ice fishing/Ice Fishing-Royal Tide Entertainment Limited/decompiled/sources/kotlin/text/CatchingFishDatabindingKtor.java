package kotlin.text;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishDatabindingKtor extends BaseAdapter {
    public boolean CatchingFishCoroutine;
    public final LayoutInflater CatchingFishDaggerWebsocket;
    public final CatchingFishSharedFlowAdMob CatchingFishParcelableFAB;
    public final boolean CatchingFishReduxKtor;
    public int CatchingFishSnackbar = -1;
    public final int CatchingFishWorkManager;

    public CatchingFishDatabindingKtor(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, LayoutInflater layoutInflater, boolean z, int i) {
        this.CatchingFishReduxKtor = z;
        this.CatchingFishDaggerWebsocket = layoutInflater;
        this.CatchingFishParcelableFAB = catchingFishSharedFlowAdMob;
        this.CatchingFishWorkManager = i;
        CatchingFishParcelableFAB();
    }

    public final void CatchingFishParcelableFAB() {
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = this.CatchingFishParcelableFAB;
        CatchingFishKtorAdMob catchingFishKtorAdMob = catchingFishSharedFlowAdMob.CatchingFishDaggerHiltFAB;
        if (catchingFishKtorAdMob != null) {
            catchingFishSharedFlowAdMob.CatchingFishLayout();
            ArrayList arrayList = catchingFishSharedFlowAdMob.CatchingFishFragmentHandler;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((CatchingFishKtorAdMob) arrayList.get(i)) == catchingFishKtorAdMob) {
                    this.CatchingFishSnackbar = i;
                    return;
                }
            }
        }
        this.CatchingFishSnackbar = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: CatchingFishSnackbar, reason: merged with bridge method [inline-methods] */
    public final CatchingFishKtorAdMob getItem(int i) {
        ArrayList CatchingFishEspressoTesting;
        boolean z = this.CatchingFishReduxKtor;
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = this.CatchingFishParcelableFAB;
        if (z) {
            catchingFishSharedFlowAdMob.CatchingFishLayout();
            CatchingFishEspressoTesting = catchingFishSharedFlowAdMob.CatchingFishFragmentHandler;
        } else {
            CatchingFishEspressoTesting = catchingFishSharedFlowAdMob.CatchingFishEspressoTesting();
        }
        int i2 = this.CatchingFishSnackbar;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (CatchingFishKtorAdMob) CatchingFishEspressoTesting.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList CatchingFishEspressoTesting;
        boolean z = this.CatchingFishReduxKtor;
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = this.CatchingFishParcelableFAB;
        if (z) {
            catchingFishSharedFlowAdMob.CatchingFishLayout();
            CatchingFishEspressoTesting = catchingFishSharedFlowAdMob.CatchingFishFragmentHandler;
        } else {
            CatchingFishEspressoTesting = catchingFishSharedFlowAdMob.CatchingFishEspressoTesting();
        }
        return this.CatchingFishSnackbar < 0 ? CatchingFishEspressoTesting.size() : CatchingFishEspressoTesting.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.CatchingFishDaggerWebsocket.inflate(this.CatchingFishWorkManager, viewGroup, false);
        }
        int i2 = getItem(i).CatchingFishSnackbar;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).CatchingFishSnackbar : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.CatchingFishParcelableFAB.CatchingFishOkHttp() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        CatchingFishWidgetStateFlow catchingFishWidgetStateFlow = (CatchingFishWidgetStateFlow) view;
        if (this.CatchingFishCoroutine) {
            listMenuItemView.setForceShowIcon(true);
        }
        catchingFishWidgetStateFlow.CatchingFishParcelableFAB(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        CatchingFishParcelableFAB();
        super.notifyDataSetChanged();
    }
}
