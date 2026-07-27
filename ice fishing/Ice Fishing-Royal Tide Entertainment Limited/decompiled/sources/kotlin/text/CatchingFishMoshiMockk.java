package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishMoshiMockk implements CatchingFishIntentFluxAdMob {
    public static final CatchingFishMoshiMockk CatchingFishSnackbar = new CatchingFishMoshiMockk(0);
    public final /* synthetic */ int CatchingFishParcelableFAB;

    public /* synthetic */ CatchingFishMoshiMockk(int i) {
        this.CatchingFishParcelableFAB = i;
    }

    @Override // kotlin.text.CatchingFishIntentFluxAdMob
    public final CatchingFishAndroidXContext CatchingFishParcelableFAB(Class cls) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!CatchingFishJUnitSharedFlow.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (CatchingFishAndroidXContext) CatchingFishJUnitSharedFlow.CatchingFishReduxKtor(cls.asSubclass(CatchingFishJUnitSharedFlow.class)).CatchingFishCoroutine(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // kotlin.text.CatchingFishIntentFluxAdMob
    public final boolean CatchingFishSnackbar(Class cls) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return CatchingFishJUnitSharedFlow.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
