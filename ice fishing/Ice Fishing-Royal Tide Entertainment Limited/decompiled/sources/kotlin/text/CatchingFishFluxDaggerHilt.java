package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishFluxDaggerHilt implements CatchingFishKtorGraphQL {
    public final CatchingFishWidgetMockkHilt CatchingFishCoroutine;
    public final CatchingFishWidgetMockkHilt CatchingFishParcelableFAB;
    public final CatchingFishWidgetMockkHilt CatchingFishReduxKtor;
    public final CatchingFishWidgetMockkHilt CatchingFishSnackbar;

    public CatchingFishFluxDaggerHilt(CatchingFishWidgetMockkHilt catchingFishWidgetMockkHilt, CatchingFishWidgetMockkHilt catchingFishWidgetMockkHilt2, CatchingFishWidgetMockkHilt catchingFishWidgetMockkHilt3, CatchingFishWidgetMockkHilt catchingFishWidgetMockkHilt4) {
        this.CatchingFishParcelableFAB = catchingFishWidgetMockkHilt;
        this.CatchingFishSnackbar = catchingFishWidgetMockkHilt2;
        this.CatchingFishCoroutine = catchingFishWidgetMockkHilt3;
        this.CatchingFishReduxKtor = catchingFishWidgetMockkHilt4;
    }

    @Override // kotlin.text.CatchingFishKtorGraphQL
    public final CatchingFishSpannableAdMob CatchingFishParcelableFAB(long j, CatchingFishGradleMVPKtor catchingFishGradleMVPKtor, CatchingFishOkHttpFlux catchingFishOkHttpFlux) {
        float CatchingFishParcelableFAB = this.CatchingFishParcelableFAB.CatchingFishParcelableFAB(j, catchingFishOkHttpFlux);
        float CatchingFishParcelableFAB2 = this.CatchingFishSnackbar.CatchingFishParcelableFAB(j, catchingFishOkHttpFlux);
        float CatchingFishParcelableFAB3 = this.CatchingFishCoroutine.CatchingFishParcelableFAB(j, catchingFishOkHttpFlux);
        float CatchingFishParcelableFAB4 = this.CatchingFishReduxKtor.CatchingFishParcelableFAB(j, catchingFishOkHttpFlux);
        float min = Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
        float f = CatchingFishParcelableFAB + CatchingFishParcelableFAB4;
        if (f > min) {
            float f2 = min / f;
            CatchingFishParcelableFAB *= f2;
            CatchingFishParcelableFAB4 *= f2;
        }
        float f3 = CatchingFishParcelableFAB2 + CatchingFishParcelableFAB3;
        if (f3 > min) {
            float f4 = min / f3;
            CatchingFishParcelableFAB2 *= f4;
            CatchingFishParcelableFAB3 *= f4;
        }
        if (CatchingFishParcelableFAB < 0.0f || CatchingFishParcelableFAB2 < 0.0f || CatchingFishParcelableFAB3 < 0.0f || CatchingFishParcelableFAB4 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + CatchingFishParcelableFAB + ", topEnd = " + CatchingFishParcelableFAB2 + ", bottomEnd = " + CatchingFishParcelableFAB3 + ", bottomStart = " + CatchingFishParcelableFAB4 + ")!").toString());
        }
        if (CatchingFishParcelableFAB + CatchingFishParcelableFAB2 + CatchingFishParcelableFAB3 + CatchingFishParcelableFAB4 == 0.0f) {
            return new CatchingFishJUnitToolbar(CatchingFishToastHiltBundle.CatchingFishReduxKtor(0L, j));
        }
        CatchingFishFluxExoPlayer CatchingFishReduxKtor = CatchingFishToastHiltBundle.CatchingFishReduxKtor(0L, j);
        CatchingFishGradleMVPKtor catchingFishGradleMVPKtor2 = CatchingFishGradleMVPKtor.CatchingFishReduxKtor;
        long CatchingFishDaggerWebsocket = CatchingFishFirebaseDagger.CatchingFishDaggerWebsocket(catchingFishGradleMVPKtor == catchingFishGradleMVPKtor2 ? CatchingFishParcelableFAB : CatchingFishParcelableFAB2);
        if (catchingFishGradleMVPKtor == catchingFishGradleMVPKtor2) {
            CatchingFishParcelableFAB = CatchingFishParcelableFAB2;
        }
        long CatchingFishDaggerWebsocket2 = CatchingFishFirebaseDagger.CatchingFishDaggerWebsocket(CatchingFishParcelableFAB);
        long CatchingFishDaggerWebsocket3 = CatchingFishFirebaseDagger.CatchingFishDaggerWebsocket(catchingFishGradleMVPKtor == catchingFishGradleMVPKtor2 ? CatchingFishParcelableFAB3 : CatchingFishParcelableFAB4);
        if (catchingFishGradleMVPKtor != catchingFishGradleMVPKtor2) {
            CatchingFishParcelableFAB4 = CatchingFishParcelableFAB3;
        }
        return new CatchingFishCoroutineMVI(new CatchingFishMVIServiceFlux(CatchingFishReduxKtor.CatchingFishParcelableFAB, CatchingFishReduxKtor.CatchingFishSnackbar, CatchingFishReduxKtor.CatchingFishCoroutine, CatchingFishReduxKtor.CatchingFishReduxKtor, CatchingFishDaggerWebsocket, CatchingFishDaggerWebsocket2, CatchingFishDaggerWebsocket3, CatchingFishFirebaseDagger.CatchingFishDaggerWebsocket(CatchingFishParcelableFAB4)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishFluxDaggerHilt)) {
            return false;
        }
        CatchingFishFluxDaggerHilt catchingFishFluxDaggerHilt = (CatchingFishFluxDaggerHilt) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishParcelableFAB, catchingFishFluxDaggerHilt.CatchingFishParcelableFAB) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishSnackbar, catchingFishFluxDaggerHilt.CatchingFishSnackbar) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishCoroutine, catchingFishFluxDaggerHilt.CatchingFishCoroutine) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor, catchingFishFluxDaggerHilt.CatchingFishReduxKtor);
    }

    public final int hashCode() {
        return this.CatchingFishReduxKtor.hashCode() + ((this.CatchingFishCoroutine.hashCode() + ((this.CatchingFishSnackbar.hashCode() + (this.CatchingFishParcelableFAB.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.CatchingFishParcelableFAB + ", topEnd = " + this.CatchingFishSnackbar + ", bottomEnd = " + this.CatchingFishCoroutine + ", bottomStart = " + this.CatchingFishReduxKtor + ')';
    }
}
