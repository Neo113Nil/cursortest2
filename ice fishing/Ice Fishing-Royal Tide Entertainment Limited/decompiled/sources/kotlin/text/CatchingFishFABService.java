package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishFABService implements CatchingFishHiltViewOkHttp {
    public final CatchingFishHiltViewOkHttp CatchingFishParcelableFAB;
    public final CatchingFishHiltViewOkHttp CatchingFishSnackbar;

    public CatchingFishFABService(CatchingFishHiltViewOkHttp catchingFishHiltViewOkHttp, CatchingFishHiltViewOkHttp catchingFishHiltViewOkHttp2) {
        this.CatchingFishParcelableFAB = catchingFishHiltViewOkHttp;
        this.CatchingFishSnackbar = catchingFishHiltViewOkHttp2;
    }

    @Override // kotlin.text.CatchingFishHiltViewOkHttp
    public final int CatchingFishCoroutine(CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout) {
        int CatchingFishCoroutine = this.CatchingFishParcelableFAB.CatchingFishCoroutine(catchingFishWidgetXMLLayout) - this.CatchingFishSnackbar.CatchingFishCoroutine(catchingFishWidgetXMLLayout);
        if (CatchingFishCoroutine < 0) {
            return 0;
        }
        return CatchingFishCoroutine;
    }

    @Override // kotlin.text.CatchingFishHiltViewOkHttp
    public final int CatchingFishParcelableFAB(CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout) {
        int CatchingFishParcelableFAB = this.CatchingFishParcelableFAB.CatchingFishParcelableFAB(catchingFishWidgetXMLLayout) - this.CatchingFishSnackbar.CatchingFishParcelableFAB(catchingFishWidgetXMLLayout);
        if (CatchingFishParcelableFAB < 0) {
            return 0;
        }
        return CatchingFishParcelableFAB;
    }

    @Override // kotlin.text.CatchingFishHiltViewOkHttp
    public final int CatchingFishReduxKtor(CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout, CatchingFishGradleMVPKtor catchingFishGradleMVPKtor) {
        int CatchingFishReduxKtor = this.CatchingFishParcelableFAB.CatchingFishReduxKtor(catchingFishWidgetXMLLayout, catchingFishGradleMVPKtor) - this.CatchingFishSnackbar.CatchingFishReduxKtor(catchingFishWidgetXMLLayout, catchingFishGradleMVPKtor);
        if (CatchingFishReduxKtor < 0) {
            return 0;
        }
        return CatchingFishReduxKtor;
    }

    @Override // kotlin.text.CatchingFishHiltViewOkHttp
    public final int CatchingFishSnackbar(CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout, CatchingFishGradleMVPKtor catchingFishGradleMVPKtor) {
        int CatchingFishSnackbar = this.CatchingFishParcelableFAB.CatchingFishSnackbar(catchingFishWidgetXMLLayout, catchingFishGradleMVPKtor) - this.CatchingFishSnackbar.CatchingFishSnackbar(catchingFishWidgetXMLLayout, catchingFishGradleMVPKtor);
        if (CatchingFishSnackbar < 0) {
            return 0;
        }
        return CatchingFishSnackbar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishFABService)) {
            return false;
        }
        CatchingFishFABService catchingFishFABService = (CatchingFishFABService) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishFABService.CatchingFishParcelableFAB, this.CatchingFishParcelableFAB) && CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishFABService.CatchingFishSnackbar, this.CatchingFishSnackbar);
    }

    public final int hashCode() {
        return this.CatchingFishSnackbar.hashCode() + (this.CatchingFishParcelableFAB.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.CatchingFishParcelableFAB + " - " + this.CatchingFishSnackbar + ')';
    }
}
