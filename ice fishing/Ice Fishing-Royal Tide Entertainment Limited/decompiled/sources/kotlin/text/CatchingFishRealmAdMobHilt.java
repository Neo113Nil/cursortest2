package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishRealmAdMobHilt implements CatchingFishHiltViewOkHttp {
    public final CatchingFishHiltViewOkHttp CatchingFishParcelableFAB;
    public final CatchingFishHiltViewOkHttp CatchingFishSnackbar;

    public CatchingFishRealmAdMobHilt(CatchingFishHiltViewOkHttp catchingFishHiltViewOkHttp, CatchingFishHiltViewOkHttp catchingFishHiltViewOkHttp2) {
        this.CatchingFishParcelableFAB = catchingFishHiltViewOkHttp;
        this.CatchingFishSnackbar = catchingFishHiltViewOkHttp2;
    }

    @Override // kotlin.text.CatchingFishHiltViewOkHttp
    public final int CatchingFishCoroutine(CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout) {
        return Math.max(this.CatchingFishParcelableFAB.CatchingFishCoroutine(catchingFishWidgetXMLLayout), this.CatchingFishSnackbar.CatchingFishCoroutine(catchingFishWidgetXMLLayout));
    }

    @Override // kotlin.text.CatchingFishHiltViewOkHttp
    public final int CatchingFishParcelableFAB(CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout) {
        return Math.max(this.CatchingFishParcelableFAB.CatchingFishParcelableFAB(catchingFishWidgetXMLLayout), this.CatchingFishSnackbar.CatchingFishParcelableFAB(catchingFishWidgetXMLLayout));
    }

    @Override // kotlin.text.CatchingFishHiltViewOkHttp
    public final int CatchingFishReduxKtor(CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout, CatchingFishGradleMVPKtor catchingFishGradleMVPKtor) {
        return Math.max(this.CatchingFishParcelableFAB.CatchingFishReduxKtor(catchingFishWidgetXMLLayout, catchingFishGradleMVPKtor), this.CatchingFishSnackbar.CatchingFishReduxKtor(catchingFishWidgetXMLLayout, catchingFishGradleMVPKtor));
    }

    @Override // kotlin.text.CatchingFishHiltViewOkHttp
    public final int CatchingFishSnackbar(CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout, CatchingFishGradleMVPKtor catchingFishGradleMVPKtor) {
        return Math.max(this.CatchingFishParcelableFAB.CatchingFishSnackbar(catchingFishWidgetXMLLayout, catchingFishGradleMVPKtor), this.CatchingFishSnackbar.CatchingFishSnackbar(catchingFishWidgetXMLLayout, catchingFishGradleMVPKtor));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishRealmAdMobHilt)) {
            return false;
        }
        CatchingFishRealmAdMobHilt catchingFishRealmAdMobHilt = (CatchingFishRealmAdMobHilt) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishRealmAdMobHilt.CatchingFishParcelableFAB, this.CatchingFishParcelableFAB) && CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishRealmAdMobHilt.CatchingFishSnackbar, this.CatchingFishSnackbar);
    }

    public final int hashCode() {
        return (this.CatchingFishSnackbar.hashCode() * 31) + this.CatchingFishParcelableFAB.hashCode();
    }

    public final String toString() {
        return "(" + this.CatchingFishParcelableFAB + " ∪ " + this.CatchingFishSnackbar + ')';
    }
}
