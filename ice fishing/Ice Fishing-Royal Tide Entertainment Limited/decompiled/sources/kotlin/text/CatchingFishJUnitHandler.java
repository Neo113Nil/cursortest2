package kotlin.text;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CatchingFishJUnitHandler extends CatchingFishRoomGradle {
    public final /* synthetic */ CatchingFishFragmentMockk CatchingFishViewModelFAB;
    public long CatchingFishViewModelScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishJUnitHandler(CatchingFishFragmentMockk catchingFishFragmentMockk, long j) {
        super(catchingFishFragmentMockk);
        this.CatchingFishViewModelFAB = catchingFishFragmentMockk;
        this.CatchingFishViewModelScope = j;
        if (j == 0) {
            CatchingFishSnackbar();
        }
    }

    @Override // kotlin.text.CatchingFishRoomGradle, kotlin.text.CatchingFishGradleStripeAPI
    public final long CatchingFishSpannableWidget(CatchingFishWidgetGradle catchingFishWidgetGradle, long j) {
        if (this.CatchingFishDaggerWebsocket) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.CatchingFishViewModelScope;
        if (j2 == 0) {
            return -1L;
        }
        long CatchingFishSpannableWidget = super.CatchingFishSpannableWidget(catchingFishWidgetGradle, Math.min(j2, 8192L));
        if (CatchingFishSpannableWidget == -1) {
            this.CatchingFishViewModelFAB.CatchingFishSnackbar.CatchingFishViewModelFAB();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            CatchingFishSnackbar();
            throw protocolException;
        }
        long j3 = this.CatchingFishViewModelScope - CatchingFishSpannableWidget;
        this.CatchingFishViewModelScope = j3;
        if (j3 == 0) {
            CatchingFishSnackbar();
        }
        return CatchingFishSpannableWidget;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.CatchingFishDaggerWebsocket) {
            return;
        }
        if (this.CatchingFishViewModelScope != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                z = CatchingFishEspressoDagger.CatchingFishUnitTesting(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.CatchingFishViewModelFAB.CatchingFishSnackbar.CatchingFishViewModelFAB();
                CatchingFishSnackbar();
            }
        }
        this.CatchingFishDaggerWebsocket = true;
    }
}
