package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.File;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class CatchingFishDaggerBundle extends CatchingFishViewWebsocket implements CatchingFishJUnitGlide {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishKtorView CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishDaggerBundle(CatchingFishKtorView catchingFishKtorView, int i) {
        super(0);
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = catchingFishKtorView;
    }

    @Override // kotlin.text.CatchingFishJUnitGlide
    public final Object CatchingFishParcelableFAB() {
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((CatchingFishAnimationAdMob) this.CatchingFishWorkManager.CatchingFishOkHttp.getValue()).CatchingFishSnackbar;
            default:
                CatchingFishOkHttpOkHttp catchingFishOkHttpOkHttp = this.CatchingFishWorkManager.CatchingFishReduxKtor;
                File canonicalFile = ((File) catchingFishOkHttpOkHttp.CatchingFishSnackbar.CatchingFishParcelableFAB()).getCanonicalFile();
                synchronized (CatchingFishOkHttpOkHttp.CatchingFishReduxKtor) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = CatchingFishOkHttpOkHttp.CatchingFishCoroutine;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    CatchingFishFirebaseDagger.CatchingFishRoomDatabase(absolutePath, "path");
                    linkedHashSet.add(absolutePath);
                }
                return new CatchingFishAnimationAdMob(canonicalFile, (CatchingFishServiceJUnit) catchingFishOkHttpOkHttp.CatchingFishParcelableFAB.CatchingFishFragmentHandler(canonicalFile), new CatchingFishViewPagerRedux(1, canonicalFile));
        }
    }
}
