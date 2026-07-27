package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishToastGlide implements CatchingFishIntentFluxAdMob {
    public CatchingFishIntentFluxAdMob[] CatchingFishParcelableFAB;

    @Override // kotlin.text.CatchingFishIntentFluxAdMob
    public final CatchingFishAndroidXContext CatchingFishParcelableFAB(Class cls) {
        for (CatchingFishIntentFluxAdMob catchingFishIntentFluxAdMob : this.CatchingFishParcelableFAB) {
            if (catchingFishIntentFluxAdMob.CatchingFishSnackbar(cls)) {
                return catchingFishIntentFluxAdMob.CatchingFishParcelableFAB(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // kotlin.text.CatchingFishIntentFluxAdMob
    public final boolean CatchingFishSnackbar(Class cls) {
        for (CatchingFishIntentFluxAdMob catchingFishIntentFluxAdMob : this.CatchingFishParcelableFAB) {
            if (catchingFishIntentFluxAdMob.CatchingFishSnackbar(cls)) {
                return true;
            }
        }
        return false;
    }
}
