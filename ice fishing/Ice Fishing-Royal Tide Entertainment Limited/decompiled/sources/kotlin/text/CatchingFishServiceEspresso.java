package kotlin.text;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishServiceEspresso implements Runnable {
    public final int CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishServiceEspresso(int i, int i2, Object obj) {
        this.CatchingFishReduxKtor = i2;
        this.CatchingFishWorkManager = obj;
        this.CatchingFishDaggerWebsocket = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CatchingFishKtorDataStore catchingFishKtorDataStore;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishOkHttpFAB catchingFishOkHttpFAB = (CatchingFishOkHttpFAB) ((CatchingFishEspressoPayPal) this.CatchingFishWorkManager).CatchingFishDaggerWebsocket;
                if (catchingFishOkHttpFAB != null) {
                    catchingFishOkHttpFAB.CatchingFishSensorManager(this.CatchingFishDaggerWebsocket);
                    break;
                }
                break;
            case 1:
                CatchingFishBundleGlide catchingFishBundleGlide = ((CatchingFishFragmentGlide) this.CatchingFishWorkManager).CatchingFishOkHttp;
                int i = this.CatchingFishDaggerWebsocket;
                if (i == 5) {
                    ((CatchingFishMVINavigation) catchingFishBundleGlide.CatchingFishWorkManager).CatchingFishParcelableFAB();
                    break;
                } else if (i == 6) {
                    ((CatchingFishMVINavigation) catchingFishBundleGlide.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB();
                    break;
                }
                break;
            case 2:
                ArrayList arrayList = (ArrayList) this.CatchingFishWorkManager;
                int size = arrayList.size();
                int i2 = 0;
                if (this.CatchingFishDaggerWebsocket == 1) {
                    while (i2 < size) {
                        ((CatchingFishAdMobFirebase) arrayList.get(i2)).CatchingFishParcelableFAB();
                        i2++;
                    }
                    break;
                } else {
                    while (i2 < size) {
                        ((CatchingFishAdMobFirebase) arrayList.get(i2)).getClass();
                        i2++;
                    }
                    break;
                }
            case 3:
                RecyclerView recyclerView = ((CatchingFishRetrofitRealm) this.CatchingFishWorkManager).CatchingFishRedux;
                if (!recyclerView.CatchingFishGsonAppCompat && (catchingFishKtorDataStore = recyclerView.CatchingFishAnimationMockk) != null) {
                    catchingFishKtorDataStore.CatchingFishDynamicFeature(recyclerView, this.CatchingFishDaggerWebsocket);
                    break;
                }
                break;
            default:
                ((CatchingFishAdMobDaggerMVP) this.CatchingFishWorkManager).CatchingFishReduxKtor(this.CatchingFishDaggerWebsocket);
                break;
        }
    }

    public CatchingFishServiceEspresso(int i, Bundle bundle, CatchingFishFragmentGlide catchingFishFragmentGlide) {
        this.CatchingFishReduxKtor = 1;
        this.CatchingFishWorkManager = catchingFishFragmentGlide;
        this.CatchingFishDaggerWebsocket = i;
    }

    public CatchingFishServiceEspresso(List list, int i, Throwable th) {
        this.CatchingFishReduxKtor = 2;
        CatchingFishHiltMVPToast.CatchingFishWorkManager(list, "initCallbacks cannot be null");
        this.CatchingFishWorkManager = new ArrayList(list);
        this.CatchingFishDaggerWebsocket = i;
    }
}
