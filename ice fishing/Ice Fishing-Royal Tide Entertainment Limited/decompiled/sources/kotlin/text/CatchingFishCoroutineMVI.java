package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishCoroutineMVI extends CatchingFishSpannableAdMob {
    public final CatchingFishMVIServiceFlux CatchingFishParcelableFAB;
    public final CatchingFishMoshiRealm CatchingFishSnackbar;

    public CatchingFishCoroutineMVI(CatchingFishMVIServiceFlux catchingFishMVIServiceFlux) {
        CatchingFishMoshiRealm catchingFishMoshiRealm;
        this.CatchingFishParcelableFAB = catchingFishMVIServiceFlux;
        long j = catchingFishMVIServiceFlux.CatchingFishDaggerWebsocket;
        if ((j >>> 32) == (4294967295L & j) && j == catchingFishMVIServiceFlux.CatchingFishWorkManager && j == catchingFishMVIServiceFlux.CatchingFishViewModelScope && j == catchingFishMVIServiceFlux.CatchingFishViewModelFAB) {
            catchingFishMoshiRealm = null;
        } else {
            catchingFishMoshiRealm = new CatchingFishMoshiRealm();
            CatchingFishMoshiRealm.CatchingFishParcelableFAB(catchingFishMoshiRealm, catchingFishMVIServiceFlux);
        }
        this.CatchingFishSnackbar = catchingFishMoshiRealm;
    }

    @Override // kotlin.text.CatchingFishSpannableAdMob
    public final CatchingFishFluxExoPlayer CatchingFishParcelableFAB() {
        CatchingFishMVIServiceFlux catchingFishMVIServiceFlux = this.CatchingFishParcelableFAB;
        return new CatchingFishFluxExoPlayer(catchingFishMVIServiceFlux.CatchingFishParcelableFAB, catchingFishMVIServiceFlux.CatchingFishSnackbar, catchingFishMVIServiceFlux.CatchingFishCoroutine, catchingFishMVIServiceFlux.CatchingFishReduxKtor);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CatchingFishCoroutineMVI) {
            return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishParcelableFAB, ((CatchingFishCoroutineMVI) obj).CatchingFishParcelableFAB);
        }
        return false;
    }

    public final int hashCode() {
        return this.CatchingFishParcelableFAB.hashCode();
    }
}
