package kotlin.text;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class CatchingFishGsonHilt implements CatchingFishGradleStripeAPI {
    public final Inflater CatchingFishDaggerWebsocket;
    public final CatchingFishAdMobMVVM CatchingFishReduxKtor;
    public boolean CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    public CatchingFishGsonHilt(CatchingFishAdMobMVVM catchingFishAdMobMVVM, Inflater inflater) {
        this.CatchingFishReduxKtor = catchingFishAdMobMVVM;
        this.CatchingFishDaggerWebsocket = inflater;
    }

    @Override // kotlin.text.CatchingFishGradleStripeAPI
    public final CatchingFishMoshiFirebase CatchingFishParcelableFAB() {
        return this.CatchingFishReduxKtor.CatchingFishReduxKtor.CatchingFishParcelableFAB();
    }

    @Override // kotlin.text.CatchingFishGradleStripeAPI
    public final long CatchingFishSpannableWidget(CatchingFishWidgetGradle catchingFishWidgetGradle, long j) {
        long j2;
        Inflater inflater = this.CatchingFishDaggerWebsocket;
        while (!this.CatchingFishViewModelScope) {
            try {
                CatchingFishMoshiDaggerMVP CatchingFishNavigation = catchingFishWidgetGradle.CatchingFishNavigation(1);
                int min = (int) Math.min(8192L, 8192 - CatchingFishNavigation.CatchingFishCoroutine);
                boolean needsInput = inflater.needsInput();
                CatchingFishAdMobMVVM catchingFishAdMobMVVM = this.CatchingFishReduxKtor;
                if (needsInput && !catchingFishAdMobMVVM.CatchingFishSnackbar()) {
                    CatchingFishMoshiDaggerMVP catchingFishMoshiDaggerMVP = catchingFishAdMobMVVM.CatchingFishDaggerWebsocket.CatchingFishReduxKtor;
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishMoshiDaggerMVP);
                    int i = catchingFishMoshiDaggerMVP.CatchingFishCoroutine;
                    int i2 = catchingFishMoshiDaggerMVP.CatchingFishSnackbar;
                    int i3 = i - i2;
                    this.CatchingFishWorkManager = i3;
                    inflater.setInput(catchingFishMoshiDaggerMVP.CatchingFishParcelableFAB, i2, i3);
                }
                int inflate = inflater.inflate(CatchingFishNavigation.CatchingFishParcelableFAB, CatchingFishNavigation.CatchingFishCoroutine, min);
                int i4 = this.CatchingFishWorkManager;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.CatchingFishWorkManager -= remaining;
                    catchingFishAdMobMVVM.skip(remaining);
                }
                if (inflate > 0) {
                    CatchingFishNavigation.CatchingFishCoroutine += inflate;
                    j2 = inflate;
                    catchingFishWidgetGradle.CatchingFishDaggerWebsocket += j2;
                } else {
                    if (CatchingFishNavigation.CatchingFishSnackbar == CatchingFishNavigation.CatchingFishCoroutine) {
                        catchingFishWidgetGradle.CatchingFishReduxKtor = CatchingFishNavigation.CatchingFishParcelableFAB();
                        CatchingFishAnimationFlux.CatchingFishParcelableFAB(CatchingFishNavigation);
                    }
                    j2 = 0;
                }
                if (j2 > 0) {
                    return j2;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (catchingFishAdMobMVVM.CatchingFishSnackbar()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.CatchingFishViewModelScope) {
            return;
        }
        this.CatchingFishDaggerWebsocket.end();
        this.CatchingFishViewModelScope = true;
        this.CatchingFishReduxKtor.close();
    }
}
