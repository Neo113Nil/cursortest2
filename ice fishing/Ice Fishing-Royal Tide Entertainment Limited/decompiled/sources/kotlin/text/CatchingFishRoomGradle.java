package kotlin.text;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class CatchingFishRoomGradle implements CatchingFishGradleStripeAPI {
    public boolean CatchingFishDaggerWebsocket;
    public final CatchingFishFragmentService CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishFragmentMockk CatchingFishWorkManager;

    public CatchingFishRoomGradle(CatchingFishFragmentMockk catchingFishFragmentMockk) {
        this.CatchingFishWorkManager = catchingFishFragmentMockk;
        this.CatchingFishReduxKtor = new CatchingFishFragmentService(catchingFishFragmentMockk.CatchingFishCoroutine.CatchingFishParcelableFAB());
    }

    @Override // kotlin.text.CatchingFishGradleStripeAPI
    public final CatchingFishMoshiFirebase CatchingFishParcelableFAB() {
        return this.CatchingFishReduxKtor;
    }

    public final void CatchingFishSnackbar() {
        CatchingFishFragmentMockk catchingFishFragmentMockk = this.CatchingFishWorkManager;
        int i = catchingFishFragmentMockk.CatchingFishDaggerWebsocket;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + catchingFishFragmentMockk.CatchingFishDaggerWebsocket);
        }
        CatchingFishFragmentService catchingFishFragmentService = this.CatchingFishReduxKtor;
        CatchingFishMoshiFirebase catchingFishMoshiFirebase = catchingFishFragmentService.CatchingFishDaggerWebsocket;
        catchingFishFragmentService.CatchingFishDaggerWebsocket = CatchingFishMoshiFirebase.CatchingFishReduxKtor;
        catchingFishMoshiFirebase.CatchingFishParcelableFAB();
        catchingFishMoshiFirebase.CatchingFishSnackbar();
        catchingFishFragmentMockk.CatchingFishDaggerWebsocket = 6;
    }

    @Override // kotlin.text.CatchingFishGradleStripeAPI
    public long CatchingFishSpannableWidget(CatchingFishWidgetGradle catchingFishWidgetGradle, long j) {
        CatchingFishFragmentMockk catchingFishFragmentMockk = this.CatchingFishWorkManager;
        try {
            return catchingFishFragmentMockk.CatchingFishCoroutine.CatchingFishSpannableWidget(catchingFishWidgetGradle, j);
        } catch (IOException e) {
            catchingFishFragmentMockk.CatchingFishSnackbar.CatchingFishViewModelFAB();
            CatchingFishSnackbar();
            throw e;
        }
    }
}
