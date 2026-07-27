package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class CatchingFishCustomViewFAB implements Comparator {
    public final /* synthetic */ int CatchingFishParcelableFAB = 0;
    public final /* synthetic */ Comparator CatchingFishSnackbar;

    public CatchingFishCustomViewFAB(Comparator comparator) {
        this.CatchingFishSnackbar = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int compare = this.CatchingFishSnackbar.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return CatchingFishBiometricRoom.CatchingFishAppCompat.compare(((CatchingFishMVIGraphQLHilt) obj).CatchingFishCoroutine, ((CatchingFishMVIGraphQLHilt) obj2).CatchingFishCoroutine);
            default:
                int compare2 = ((CatchingFishCustomViewFAB) this.CatchingFishSnackbar).compare(obj, obj2);
                return compare2 != 0 ? compare2 : CatchingFishAdMobFAB.CatchingFishRoomDatabase(Integer.valueOf(((CatchingFishMVIGraphQLHilt) obj).CatchingFishViewModelScope), Integer.valueOf(((CatchingFishMVIGraphQLHilt) obj2).CatchingFishViewModelScope));
        }
    }

    public CatchingFishCustomViewFAB(CatchingFishCustomViewFAB catchingFishCustomViewFAB) {
        this.CatchingFishSnackbar = catchingFishCustomViewFAB;
    }
}
