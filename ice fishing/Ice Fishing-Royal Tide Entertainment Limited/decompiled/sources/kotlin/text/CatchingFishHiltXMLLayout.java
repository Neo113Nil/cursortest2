package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishHiltXMLLayout extends CatchingFishKtorContext {
    public int CatchingFishCloudMessaging;
    public int CatchingFishEspressoTesting;
    public CatchingFishAnimationMVVM CatchingFishOkHttp;

    @Override // kotlin.text.CatchingFishKtorContext
    public final void CatchingFishViewModelFAB(CatchingFishDaggerRetrofit catchingFishDaggerRetrofit, boolean z) {
        int i = this.CatchingFishCloudMessaging;
        this.CatchingFishEspressoTesting = i;
        if (z) {
            if (i == 5) {
                this.CatchingFishEspressoTesting = 1;
            } else if (i == 6) {
                this.CatchingFishEspressoTesting = 0;
            }
        } else if (i == 5) {
            this.CatchingFishEspressoTesting = 0;
        } else if (i == 6) {
            this.CatchingFishEspressoTesting = 1;
        }
        if (catchingFishDaggerRetrofit instanceof CatchingFishAnimationMVVM) {
            ((CatchingFishAnimationMVVM) catchingFishDaggerRetrofit).CatchingFishStateFlowIntent = this.CatchingFishEspressoTesting;
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.CatchingFishOkHttp.CatchingFishWidget;
    }

    public int getMargin() {
        return this.CatchingFishOkHttp.CatchingFishKtorService;
    }

    public int getType() {
        return this.CatchingFishCloudMessaging;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.CatchingFishOkHttp.CatchingFishWidget = z;
    }

    public void setDpMargin(int i) {
        this.CatchingFishOkHttp.CatchingFishKtorService = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.CatchingFishOkHttp.CatchingFishKtorService = i;
    }

    public void setType(int i) {
        this.CatchingFishCloudMessaging = i;
    }
}
