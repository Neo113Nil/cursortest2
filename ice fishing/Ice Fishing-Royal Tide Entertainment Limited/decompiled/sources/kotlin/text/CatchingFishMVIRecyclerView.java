package kotlin.text;

import java.io.IOException;
import java.util.Random;

/* loaded from: classes.dex */
public final class CatchingFishMVIRecyclerView {
    public final CatchingFishWidgetGradle CatchingFishCoroutine;
    public final CatchingFishPicassoToolbar CatchingFishLayout;
    public final Random CatchingFishParcelableFAB;
    public boolean CatchingFishReduxKtor;
    public final CatchingFishAnimationMVI CatchingFishSnackbar;
    public final byte[] CatchingFishViewModelFAB;
    public boolean CatchingFishViewModelScope;
    public final CatchingFishWidgetGradle CatchingFishDaggerWebsocket = new CatchingFishWidgetGradle();
    public final CatchingFishRoomToastToast CatchingFishWorkManager = new CatchingFishRoomToastToast(this);

    public CatchingFishMVIRecyclerView(CatchingFishAnimationMVI catchingFishAnimationMVI, Random random) {
        if (catchingFishAnimationMVI == null) {
            throw new NullPointerException("sink == null");
        }
        if (random == null) {
            throw new NullPointerException("random == null");
        }
        this.CatchingFishSnackbar = catchingFishAnimationMVI;
        this.CatchingFishCoroutine = catchingFishAnimationMVI.CatchingFishViewModelScope();
        this.CatchingFishParcelableFAB = random;
        this.CatchingFishViewModelFAB = new byte[4];
        this.CatchingFishLayout = new CatchingFishPicassoToolbar();
    }

    public final void CatchingFishParcelableFAB(int i, CatchingFishWebSocketMockk catchingFishWebSocketMockk) {
        if (this.CatchingFishReduxKtor) {
            throw new IOException("closed");
        }
        int CatchingFishReduxKtor = catchingFishWebSocketMockk.CatchingFishReduxKtor();
        if (CatchingFishReduxKtor > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        CatchingFishWidgetGradle catchingFishWidgetGradle = this.CatchingFishCoroutine;
        catchingFishWidgetGradle.CatchingFishCardViewView(i | 128);
        catchingFishWidgetGradle.CatchingFishCardViewView(CatchingFishReduxKtor | 128);
        Random random = this.CatchingFishParcelableFAB;
        byte[] bArr = this.CatchingFishViewModelFAB;
        random.nextBytes(bArr);
        catchingFishWidgetGradle.m12write(bArr);
        if (CatchingFishReduxKtor > 0) {
            long j = catchingFishWidgetGradle.CatchingFishDaggerWebsocket;
            catchingFishWidgetGradle.CatchingFishCoroutineFlow(catchingFishWebSocketMockk);
            CatchingFishPicassoToolbar catchingFishPicassoToolbar = this.CatchingFishLayout;
            catchingFishWidgetGradle.CatchingFishEspressoTesting(catchingFishPicassoToolbar);
            catchingFishPicassoToolbar.CatchingFishSnackbar(j);
            CatchingFishKtorViewModel.CatchingFishMVPRobolectric(catchingFishPicassoToolbar, bArr);
            catchingFishPicassoToolbar.close();
        }
        this.CatchingFishSnackbar.flush();
    }

    public final void CatchingFishSnackbar(int i, long j, boolean z, boolean z2) {
        if (this.CatchingFishReduxKtor) {
            throw new IOException("closed");
        }
        if (!z) {
            i = 0;
        }
        if (z2) {
            i |= 128;
        }
        CatchingFishWidgetGradle catchingFishWidgetGradle = this.CatchingFishCoroutine;
        catchingFishWidgetGradle.CatchingFishCardViewView(i);
        if (j <= 125) {
            catchingFishWidgetGradle.CatchingFishCardViewView(((int) j) | 128);
        } else if (j <= 65535) {
            catchingFishWidgetGradle.CatchingFishCardViewView(254);
            catchingFishWidgetGradle.CatchingFishFragmentFactory((int) j);
        } else {
            catchingFishWidgetGradle.CatchingFishCardViewView(255);
            CatchingFishMoshiDaggerMVP CatchingFishNavigation = catchingFishWidgetGradle.CatchingFishNavigation(8);
            byte[] bArr = CatchingFishNavigation.CatchingFishParcelableFAB;
            int i2 = CatchingFishNavigation.CatchingFishCoroutine;
            bArr[i2] = (byte) ((j >>> 56) & 255);
            bArr[i2 + 1] = (byte) ((j >>> 48) & 255);
            bArr[i2 + 2] = (byte) ((j >>> 40) & 255);
            bArr[i2 + 3] = (byte) ((j >>> 32) & 255);
            bArr[i2 + 4] = (byte) ((j >>> 24) & 255);
            bArr[i2 + 5] = (byte) ((j >>> 16) & 255);
            bArr[i2 + 6] = (byte) ((j >>> 8) & 255);
            bArr[i2 + 7] = (byte) (j & 255);
            CatchingFishNavigation.CatchingFishCoroutine = i2 + 8;
            catchingFishWidgetGradle.CatchingFishDaggerWebsocket += 8;
        }
        Random random = this.CatchingFishParcelableFAB;
        byte[] bArr2 = this.CatchingFishViewModelFAB;
        random.nextBytes(bArr2);
        catchingFishWidgetGradle.m12write(bArr2);
        if (j > 0) {
            long j2 = catchingFishWidgetGradle.CatchingFishDaggerWebsocket;
            catchingFishWidgetGradle.CatchingFishCloudMessaging(this.CatchingFishDaggerWebsocket, j);
            CatchingFishPicassoToolbar catchingFishPicassoToolbar = this.CatchingFishLayout;
            catchingFishWidgetGradle.CatchingFishEspressoTesting(catchingFishPicassoToolbar);
            catchingFishPicassoToolbar.CatchingFishSnackbar(j2);
            CatchingFishKtorViewModel.CatchingFishMVPRobolectric(catchingFishPicassoToolbar, bArr2);
            catchingFishPicassoToolbar.close();
        }
        this.CatchingFishSnackbar.CatchingFishFragmentHandler();
    }
}
