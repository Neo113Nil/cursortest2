package kotlin.text;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class CatchingFishMVIRoomPicasso extends LinearLayoutManager {
    public final /* synthetic */ int CatchingFishFragmentFactory;
    public final /* synthetic */ CatchingFishRetrofitRealm CatchingFishMutableLiveData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishMVIRoomPicasso(CatchingFishRetrofitRealm catchingFishRetrofitRealm, int i, int i2) {
        super(i);
        this.CatchingFishMutableLiveData = catchingFishRetrofitRealm;
        this.CatchingFishFragmentFactory = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void CatchingFishCameraX(CatchingFishReduxGlide catchingFishReduxGlide, int[] iArr) {
        int i = this.CatchingFishFragmentFactory;
        CatchingFishRetrofitRealm catchingFishRetrofitRealm = this.CatchingFishMutableLiveData;
        if (i == 0) {
            iArr[0] = catchingFishRetrofitRealm.CatchingFishRedux.getWidth();
            iArr[1] = catchingFishRetrofitRealm.CatchingFishRedux.getWidth();
        } else {
            iArr[0] = catchingFishRetrofitRealm.CatchingFishRedux.getHeight();
            iArr[1] = catchingFishRetrofitRealm.CatchingFishRedux.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishDynamicFeature(RecyclerView recyclerView, int i) {
        CatchingFishViewPagerKtor catchingFishViewPagerKtor = new CatchingFishViewPagerKtor(recyclerView.getContext());
        catchingFishViewPagerKtor.CatchingFishParcelableFAB = i;
        CatchingFishPayPalHandler(catchingFishViewPagerKtor);
    }
}
