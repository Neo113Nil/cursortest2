package kotlin.text;

import java.io.IOException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class CatchingFishMockkGlide implements CatchingFishGradleStripeAPI {
    public final /* synthetic */ CatchingFishPayPalMVI CatchingFishLayout;
    public boolean CatchingFishViewModelFAB;
    public boolean CatchingFishViewModelScope;
    public final long CatchingFishWorkManager;
    public final CatchingFishWidgetGradle CatchingFishReduxKtor = new CatchingFishWidgetGradle();
    public final CatchingFishWidgetGradle CatchingFishDaggerWebsocket = new CatchingFishWidgetGradle();

    public CatchingFishMockkGlide(CatchingFishPayPalMVI catchingFishPayPalMVI, long j) {
        this.CatchingFishLayout = catchingFishPayPalMVI;
        this.CatchingFishWorkManager = j;
    }

    @Override // kotlin.text.CatchingFishGradleStripeAPI
    public final CatchingFishMoshiFirebase CatchingFishParcelableFAB() {
        return this.CatchingFishLayout.CatchingFishLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    @Override // kotlin.text.CatchingFishGradleStripeAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long CatchingFishSpannableWidget(CatchingFishWidgetGradle catchingFishWidgetGradle, long j) {
        Throwable th;
        long CatchingFishSpannableWidget;
        while (true) {
            synchronized (this.CatchingFishLayout) {
                this.CatchingFishLayout.CatchingFishLayout.CatchingFishLayout();
                try {
                    CatchingFishPayPalMVI catchingFishPayPalMVI = this.CatchingFishLayout;
                    if (catchingFishPayPalMVI.CatchingFishCloudMessaging != 0) {
                        th = catchingFishPayPalMVI.CatchingFishEspressoTesting;
                        if (th == null) {
                            th = new CatchingFishDaggerContext(this.CatchingFishLayout.CatchingFishCloudMessaging);
                        }
                    } else {
                        th = null;
                    }
                    if (this.CatchingFishViewModelScope) {
                        throw new IOException("stream closed");
                    }
                    CatchingFishWidgetGradle catchingFishWidgetGradle2 = this.CatchingFishDaggerWebsocket;
                    long j2 = catchingFishWidgetGradle2.CatchingFishDaggerWebsocket;
                    if (j2 > 0) {
                        CatchingFishSpannableWidget = catchingFishWidgetGradle2.CatchingFishSpannableWidget(catchingFishWidgetGradle, Math.min(8192L, j2));
                        CatchingFishPayPalMVI catchingFishPayPalMVI2 = this.CatchingFishLayout;
                        long j3 = catchingFishPayPalMVI2.CatchingFishParcelableFAB + CatchingFishSpannableWidget;
                        catchingFishPayPalMVI2.CatchingFishParcelableFAB = j3;
                        if (th == null && j3 >= catchingFishPayPalMVI2.CatchingFishReduxKtor.CatchingFishJetpackCompose.CatchingFishParcelableFAB() / 2) {
                            CatchingFishPayPalMVI catchingFishPayPalMVI3 = this.CatchingFishLayout;
                            catchingFishPayPalMVI3.CatchingFishReduxKtor.CatchingFishRoomDatabase(catchingFishPayPalMVI3.CatchingFishCoroutine, catchingFishPayPalMVI3.CatchingFishParcelableFAB);
                            this.CatchingFishLayout.CatchingFishParcelableFAB = 0L;
                        }
                    } else {
                        if (this.CatchingFishViewModelFAB || th != null) {
                            break;
                        }
                        try {
                            this.CatchingFishLayout.wait();
                            this.CatchingFishLayout.CatchingFishLayout.CatchingFishEspressoTesting();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th2) {
                    this.CatchingFishLayout.CatchingFishLayout.CatchingFishEspressoTesting();
                    throw th2;
                }
            }
            if (CatchingFishSpannableWidget == -1) {
                this.CatchingFishLayout.CatchingFishReduxKtor.CatchingFishOkHttp(CatchingFishSpannableWidget);
                return CatchingFishSpannableWidget;
            }
            if (th == null) {
                return -1L;
            }
            throw th;
        }
        this.CatchingFishLayout.CatchingFishLayout.CatchingFishEspressoTesting();
        if (CatchingFishSpannableWidget == -1) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        synchronized (this.CatchingFishLayout) {
            this.CatchingFishViewModelScope = true;
            CatchingFishWidgetGradle catchingFishWidgetGradle = this.CatchingFishDaggerWebsocket;
            j = catchingFishWidgetGradle.CatchingFishDaggerWebsocket;
            catchingFishWidgetGradle.skip(j);
            this.CatchingFishLayout.notifyAll();
        }
        if (j > 0) {
            this.CatchingFishLayout.CatchingFishReduxKtor.CatchingFishOkHttp(j);
        }
        this.CatchingFishLayout.CatchingFishParcelableFAB();
    }
}
