package kotlin.text;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class CatchingFishRetrofitHandler extends CatchingFishDaggerRetrofit {
    public CatchingFishDaggerRetrofit[] CatchingFishFABLayout = new CatchingFishDaggerRetrofit[4];
    public int CatchingFishGraphQLGlide = 0;

    public final void CatchingFishParcelable(int i, ArrayList arrayList, CatchingFishToolbarGlide catchingFishToolbarGlide) {
        for (int i2 = 0; i2 < this.CatchingFishGraphQLGlide; i2++) {
            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit = this.CatchingFishFABLayout[i2];
            ArrayList arrayList2 = catchingFishToolbarGlide.CatchingFishParcelableFAB;
            if (!arrayList2.contains(catchingFishDaggerRetrofit)) {
                arrayList2.add(catchingFishDaggerRetrofit);
            }
        }
        for (int i3 = 0; i3 < this.CatchingFishGraphQLGlide; i3++) {
            CatchingFishBiometricBundle.CatchingFishAnimationMockk(this.CatchingFishFABLayout[i3], i, arrayList, catchingFishToolbarGlide);
        }
    }

    public void CatchingFishRecyclerView() {
    }
}
