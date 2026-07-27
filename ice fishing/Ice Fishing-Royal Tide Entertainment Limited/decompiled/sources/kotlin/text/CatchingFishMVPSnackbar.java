package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMVPSnackbar implements CatchingFishHiltViewOkHttp {
    public final int CatchingFishParcelableFAB;
    public final String CatchingFishSnackbar;
    public final CatchingFishAsyncTaskIntent CatchingFishCoroutine = CatchingFishLayoutRoom.CatchingFishGsonAppCompat(CatchingFishReduxPayPal.CatchingFishDaggerWebsocket);
    public final CatchingFishAsyncTaskIntent CatchingFishReduxKtor = CatchingFishLayoutRoom.CatchingFishGsonAppCompat(Boolean.TRUE);

    public CatchingFishMVPSnackbar(String str, int i) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = str;
    }

    @Override // kotlin.text.CatchingFishHiltViewOkHttp
    public final int CatchingFishCoroutine(CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout) {
        return CatchingFishDaggerWebsocket().CatchingFishReduxKtor;
    }

    public final CatchingFishReduxPayPal CatchingFishDaggerWebsocket() {
        return (CatchingFishReduxPayPal) this.CatchingFishCoroutine.getValue();
    }

    @Override // kotlin.text.CatchingFishHiltViewOkHttp
    public final int CatchingFishParcelableFAB(CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout) {
        return CatchingFishDaggerWebsocket().CatchingFishSnackbar;
    }

    @Override // kotlin.text.CatchingFishHiltViewOkHttp
    public final int CatchingFishReduxKtor(CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout, CatchingFishGradleMVPKtor catchingFishGradleMVPKtor) {
        return CatchingFishDaggerWebsocket().CatchingFishParcelableFAB;
    }

    @Override // kotlin.text.CatchingFishHiltViewOkHttp
    public final int CatchingFishSnackbar(CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout, CatchingFishGradleMVPKtor catchingFishGradleMVPKtor) {
        return CatchingFishDaggerWebsocket().CatchingFishCoroutine;
    }

    public final void CatchingFishWorkManager(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM, int i) {
        int i2 = this.CatchingFishParcelableFAB;
        if (i == 0 || (i & i2) != 0) {
            this.CatchingFishCoroutine.setValue(catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB.CatchingFishLayout(i2));
            this.CatchingFishReduxKtor.setValue(Boolean.valueOf(catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB.CatchingFishCoroutineFlow(i2)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CatchingFishMVPSnackbar) {
            return this.CatchingFishParcelableFAB == ((CatchingFishMVPSnackbar) obj).CatchingFishParcelableFAB;
        }
        return false;
    }

    public final int hashCode() {
        return this.CatchingFishParcelableFAB;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.CatchingFishSnackbar);
        sb.append('(');
        sb.append(CatchingFishDaggerWebsocket().CatchingFishParcelableFAB);
        sb.append(", ");
        sb.append(CatchingFishDaggerWebsocket().CatchingFishSnackbar);
        sb.append(", ");
        sb.append(CatchingFishDaggerWebsocket().CatchingFishCoroutine);
        sb.append(", ");
        return CatchingFishMVPLiveData.CatchingFishAnimationMockk(sb, CatchingFishDaggerWebsocket().CatchingFishReduxKtor, ')');
    }
}
