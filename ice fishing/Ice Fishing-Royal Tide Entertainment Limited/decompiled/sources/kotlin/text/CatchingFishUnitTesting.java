package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishUnitTesting implements CatchingFishJUnitGlide {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishUnitTesting(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.text.CatchingFishJUnitGlide
    public final Object CatchingFishParcelableFAB() {
        int i = this.CatchingFishReduxKtor;
        Object obj = this.CatchingFishDaggerWebsocket;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishKtorMockk catchingFishKtorMockk = (CatchingFishKtorMockk) obj;
                if (catchingFishKtorMockk.CatchingFishParcelableFlux()) {
                    catchingFishKtorMockk.CatchingFishViewModelFAB("");
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            default:
                ArrayList arrayList = ((CatchingFishPayPalAppCompat) obj).CatchingFishParcelableFAB;
                CatchingFishPayPalService catchingFishPayPalService = new CatchingFishPayPalService(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    CatchingFishAdMobIntent catchingFishAdMobIntent = (CatchingFishAdMobIntent) arrayList.get(i2);
                    Object obj2 = catchingFishAdMobIntent.CatchingFishSnackbar;
                    int i3 = catchingFishAdMobIntent.CatchingFishParcelableFAB;
                    Object catchingFishToastFirebase = obj2 != null ? new CatchingFishToastFirebase(Integer.valueOf(i3), catchingFishAdMobIntent.CatchingFishSnackbar) : Integer.valueOf(i3);
                    int CatchingFishWorkManager = catchingFishPayPalService.CatchingFishWorkManager(catchingFishToastFirebase);
                    boolean z = CatchingFishWorkManager < 0;
                    Object obj3 = z ? null : catchingFishPayPalService.CatchingFishCoroutine[CatchingFishWorkManager];
                    if (obj3 != null) {
                        if (obj3 instanceof CatchingFishBundleGradle) {
                            CatchingFishBundleGradle catchingFishBundleGradle = (CatchingFishBundleGradle) obj3;
                            catchingFishBundleGradle.CatchingFishParcelableFAB(catchingFishAdMobIntent);
                            catchingFishAdMobIntent = catchingFishBundleGradle;
                        } else {
                            Object[] objArr = CatchingFishHandlerLayout.CatchingFishParcelableFAB;
                            CatchingFishBundleGradle catchingFishBundleGradle2 = new CatchingFishBundleGradle(2);
                            catchingFishBundleGradle2.CatchingFishParcelableFAB(obj3);
                            catchingFishBundleGradle2.CatchingFishParcelableFAB(catchingFishAdMobIntent);
                            catchingFishAdMobIntent = catchingFishBundleGradle2;
                        }
                    }
                    if (z) {
                        int i4 = ~CatchingFishWorkManager;
                        catchingFishPayPalService.CatchingFishSnackbar[i4] = catchingFishToastFirebase;
                        catchingFishPayPalService.CatchingFishCoroutine[i4] = catchingFishAdMobIntent;
                    } else {
                        catchingFishPayPalService.CatchingFishCoroutine[CatchingFishWorkManager] = catchingFishAdMobIntent;
                    }
                }
                return new CatchingFishLayoutMockk(catchingFishPayPalService);
        }
    }
}
