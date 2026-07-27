package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishFABStripeAPIFAB implements CatchingFishLayoutContext {
    public boolean CatchingFishAnimationMockk;
    public CatchingFishDaggerToolbar CatchingFishCloudMessaging;
    public CatchingFishFABCoroutine CatchingFishDaggerWebsocket;
    public boolean CatchingFishEspressoTesting;
    public CatchingFishWebsocketFAB CatchingFishFragmentHandler;
    public CatchingFishFABStripeAPIFAB CatchingFishLayout;
    public boolean CatchingFishOkHttp;
    public boolean CatchingFishRoomDatabase;
    public CatchingFishAppCompatJUnit CatchingFishStateLiveData;
    public boolean CatchingFishUnitTesting;
    public CatchingFishFABStripeAPIFAB CatchingFishViewModelFAB;
    public int CatchingFishWorkManager;
    public final CatchingFishFABStripeAPIFAB CatchingFishReduxKtor = this;
    public int CatchingFishViewModelScope = -1;

    public boolean CatchingFish() {
        return !(this instanceof CatchingFishBundlePayPal);
    }

    public final void CatchingFishCardViewRealm() {
        if (!this.CatchingFishRoomDatabase) {
            CatchingFishFluxGradle.CatchingFishSnackbar("node detached multiple times");
        }
        if (this.CatchingFishCloudMessaging == null) {
            CatchingFishFluxGradle.CatchingFishSnackbar("detach invoked on a node without a coordinator");
        }
        if (!this.CatchingFishAnimationMockk) {
            CatchingFishFluxGradle.CatchingFishSnackbar("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.CatchingFishAnimationMockk = false;
        CatchingFishAppCompatJUnit catchingFishAppCompatJUnit = this.CatchingFishStateLiveData;
        if (catchingFishAppCompatJUnit != null) {
            catchingFishAppCompatJUnit.CatchingFishParcelableFAB();
        }
        CatchingFishSpannableWidget();
    }

    public final void CatchingFishCoroutineFlow() {
        if (!this.CatchingFishRoomDatabase) {
            CatchingFishFluxGradle.CatchingFishSnackbar("Cannot detach a node that is not attached");
        }
        if (this.CatchingFishUnitTesting) {
            CatchingFishFluxGradle.CatchingFishSnackbar("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.CatchingFishAnimationMockk) {
            CatchingFishFluxGradle.CatchingFishSnackbar("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.CatchingFishRoomDatabase = false;
        CatchingFishFABCoroutine catchingFishFABCoroutine = this.CatchingFishDaggerWebsocket;
        if (catchingFishFABCoroutine != null) {
            CatchingFishIntentGlide catchingFishIntentGlide = new CatchingFishIntentGlide("The Modifier.Node was detached", 2);
            CatchingFishRoomViewGson catchingFishRoomViewGson = (CatchingFishRoomViewGson) catchingFishFABCoroutine.CatchingFishReduxKtor.CatchingFishCoroutineFlow(CatchingFishMVPExoPlayer.CatchingFishLayout);
            if (catchingFishRoomViewGson != null) {
                catchingFishRoomViewGson.CatchingFishCoroutine(catchingFishIntentGlide);
                this.CatchingFishDaggerWebsocket = null;
            } else {
                throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + catchingFishFABCoroutine).toString());
            }
        }
    }

    public final void CatchingFishGsonAppCompat() {
        if (!this.CatchingFishRoomDatabase) {
            CatchingFishFluxGradle.CatchingFishSnackbar("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.CatchingFishUnitTesting) {
            CatchingFishFluxGradle.CatchingFishSnackbar("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.CatchingFishUnitTesting = false;
        CatchingFishDaggerHiltFAB();
        this.CatchingFishAnimationMockk = true;
    }

    public final void CatchingFishJetpackCompose() {
        if (this.CatchingFishRoomDatabase) {
            CatchingFishFluxGradle.CatchingFishSnackbar("node attached multiple times");
        }
        if (this.CatchingFishCloudMessaging == null) {
            CatchingFishFluxGradle.CatchingFishSnackbar("attach invoked on a node without a coordinator");
        }
        this.CatchingFishRoomDatabase = true;
        this.CatchingFishUnitTesting = true;
    }

    public void CatchingFishDaggerHiltFAB() {
    }

    public void CatchingFishParcelableFlux() {
    }

    public void CatchingFishSpannableWidget() {
    }
}
