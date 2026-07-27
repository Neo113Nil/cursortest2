package kotlin.text;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CatchingFishReduxAppCompat extends CatchingFishRoomGradle {
    public final /* synthetic */ CatchingFishFragmentMockk CatchingFishFragmentHandler;
    public boolean CatchingFishLayout;
    public long CatchingFishViewModelFAB;
    public final CatchingFishBundleView CatchingFishViewModelScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishReduxAppCompat(CatchingFishFragmentMockk catchingFishFragmentMockk, CatchingFishBundleView catchingFishBundleView) {
        super(catchingFishFragmentMockk);
        this.CatchingFishFragmentHandler = catchingFishFragmentMockk;
        this.CatchingFishViewModelFAB = -1L;
        this.CatchingFishLayout = true;
        this.CatchingFishViewModelScope = catchingFishBundleView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        if (r7.CatchingFishLayout == false) goto L28;
     */
    @Override // kotlin.text.CatchingFishRoomGradle, kotlin.text.CatchingFishGradleStripeAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long CatchingFishSpannableWidget(CatchingFishWidgetGradle catchingFishWidgetGradle, long j) {
        CatchingFishFragmentMockk catchingFishFragmentMockk = this.CatchingFishFragmentHandler;
        CatchingFishLayoutFragment catchingFishLayoutFragment = catchingFishFragmentMockk.CatchingFishCoroutine;
        if (this.CatchingFishDaggerWebsocket) {
            throw new IllegalStateException("closed");
        }
        if (this.CatchingFishLayout) {
            long j2 = this.CatchingFishViewModelFAB;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    catchingFishLayoutFragment.CatchingFishUnitTesting();
                }
                try {
                    this.CatchingFishViewModelFAB = catchingFishLayoutFragment.CatchingFishGsonAppCompat();
                    String trim = catchingFishLayoutFragment.CatchingFishUnitTesting().trim();
                    if (this.CatchingFishViewModelFAB < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.CatchingFishViewModelFAB + trim + "\"");
                    }
                    if (this.CatchingFishViewModelFAB == 0) {
                        this.CatchingFishLayout = false;
                        CatchingFishWidgetEspresso.CatchingFishReduxKtor(catchingFishFragmentMockk.CatchingFishParcelableFAB.CatchingFishCloudMessaging, this.CatchingFishViewModelScope, catchingFishFragmentMockk.CatchingFishFragmentHandler());
                        CatchingFishSnackbar();
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long CatchingFishSpannableWidget = super.CatchingFishSpannableWidget(catchingFishWidgetGradle, Math.min(8192L, this.CatchingFishViewModelFAB));
            if (CatchingFishSpannableWidget != -1) {
                this.CatchingFishViewModelFAB -= CatchingFishSpannableWidget;
                return CatchingFishSpannableWidget;
            }
            catchingFishFragmentMockk.CatchingFishSnackbar.CatchingFishViewModelFAB();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            CatchingFishSnackbar();
            throw protocolException;
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.CatchingFishDaggerWebsocket) {
            return;
        }
        if (this.CatchingFishLayout) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                z = CatchingFishEspressoDagger.CatchingFishUnitTesting(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.CatchingFishFragmentHandler.CatchingFishSnackbar.CatchingFishViewModelFAB();
                CatchingFishSnackbar();
            }
        }
        this.CatchingFishDaggerWebsocket = true;
    }
}
