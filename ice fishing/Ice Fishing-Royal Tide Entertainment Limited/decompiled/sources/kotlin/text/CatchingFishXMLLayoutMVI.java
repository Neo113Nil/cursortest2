package kotlin.text;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class CatchingFishXMLLayoutMVI implements CatchingFishGradleStripeAPI {
    public int CatchingFishDaggerWebsocket;
    public short CatchingFishLayout;
    public final CatchingFishLayoutFragment CatchingFishReduxKtor;
    public int CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public byte CatchingFishWorkManager;

    public CatchingFishXMLLayoutMVI(CatchingFishLayoutFragment catchingFishLayoutFragment) {
        this.CatchingFishReduxKtor = catchingFishLayoutFragment;
    }

    @Override // kotlin.text.CatchingFishGradleStripeAPI
    public final CatchingFishMoshiFirebase CatchingFishParcelableFAB() {
        return this.CatchingFishReduxKtor.CatchingFishParcelableFAB();
    }

    @Override // kotlin.text.CatchingFishGradleStripeAPI
    public final long CatchingFishSpannableWidget(CatchingFishWidgetGradle catchingFishWidgetGradle, long j) {
        int i;
        int readInt;
        do {
            int i2 = this.CatchingFishViewModelFAB;
            CatchingFishLayoutFragment catchingFishLayoutFragment = this.CatchingFishReduxKtor;
            if (i2 == 0) {
                catchingFishLayoutFragment.skip(this.CatchingFishLayout);
                this.CatchingFishLayout = (short) 0;
                if ((this.CatchingFishWorkManager & 4) == 0) {
                    i = this.CatchingFishViewModelScope;
                    int CatchingFishOkHttp = CatchingFishViewModelDagger.CatchingFishOkHttp(catchingFishLayoutFragment);
                    this.CatchingFishViewModelFAB = CatchingFishOkHttp;
                    this.CatchingFishDaggerWebsocket = CatchingFishOkHttp;
                    byte readByte = (byte) (catchingFishLayoutFragment.readByte() & 255);
                    this.CatchingFishWorkManager = (byte) (catchingFishLayoutFragment.readByte() & 255);
                    Logger logger = CatchingFishViewModelDagger.CatchingFishViewModelFAB;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(CatchingFishViewModelRedux.CatchingFishParcelableFAB(true, this.CatchingFishViewModelScope, this.CatchingFishDaggerWebsocket, readByte, this.CatchingFishWorkManager));
                    }
                    readInt = catchingFishLayoutFragment.readInt() & Integer.MAX_VALUE;
                    this.CatchingFishViewModelScope = readInt;
                    if (readByte != 9) {
                        CatchingFishViewModelRedux.CatchingFishCoroutine("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                        throw null;
                    }
                }
            } else {
                long CatchingFishSpannableWidget = catchingFishLayoutFragment.CatchingFishSpannableWidget(catchingFishWidgetGradle, Math.min(8192L, i2));
                if (CatchingFishSpannableWidget != -1) {
                    this.CatchingFishViewModelFAB = (int) (this.CatchingFishViewModelFAB - CatchingFishSpannableWidget);
                    return CatchingFishSpannableWidget;
                }
            }
            return -1L;
        } while (readInt == i);
        CatchingFishViewModelRedux.CatchingFishCoroutine("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
