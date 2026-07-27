package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class CatchingFishViewPagerFlux implements CatchingFishViewOkHttp {
    public final CatchingFishGoogleMapsRedux CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor = 1;
    public final Object CatchingFishWorkManager;

    public CatchingFishViewPagerFlux(OutputStream outputStream, CatchingFishGoogleMapsRedux catchingFishGoogleMapsRedux) {
        this.CatchingFishWorkManager = outputStream;
        this.CatchingFishDaggerWebsocket = catchingFishGoogleMapsRedux;
    }

    @Override // kotlin.text.CatchingFishViewOkHttp
    public final void CatchingFishCloudMessaging(CatchingFishWidgetGradle catchingFishWidgetGradle, long j) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishXMLLayoutGlide.CatchingFishAnimationMockk(catchingFishWidgetGradle.CatchingFishDaggerWebsocket, 0L, j);
                long j2 = j;
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    CatchingFishMoshiDaggerMVP catchingFishMoshiDaggerMVP = catchingFishWidgetGradle.CatchingFishReduxKtor;
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishMoshiDaggerMVP);
                    while (true) {
                        if (j3 < 65536) {
                            j3 += catchingFishMoshiDaggerMVP.CatchingFishCoroutine - catchingFishMoshiDaggerMVP.CatchingFishSnackbar;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                catchingFishMoshiDaggerMVP = catchingFishMoshiDaggerMVP.CatchingFishWorkManager;
                                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishMoshiDaggerMVP);
                            }
                        }
                    }
                    CatchingFishViewPagerFlux catchingFishViewPagerFlux = (CatchingFishViewPagerFlux) this.CatchingFishWorkManager;
                    CatchingFishGoogleMapsRedux catchingFishGoogleMapsRedux = this.CatchingFishDaggerWebsocket;
                    catchingFishGoogleMapsRedux.CatchingFishLayout();
                    try {
                        try {
                            catchingFishViewPagerFlux.CatchingFishCloudMessaging(catchingFishWidgetGradle, j3);
                            if (catchingFishGoogleMapsRedux.CatchingFishFragmentHandler()) {
                                throw catchingFishGoogleMapsRedux.CatchingFishEspressoTesting(null);
                            }
                            j2 -= j3;
                        } catch (IOException e) {
                            if (!catchingFishGoogleMapsRedux.CatchingFishFragmentHandler()) {
                                throw e;
                            }
                            throw catchingFishGoogleMapsRedux.CatchingFishEspressoTesting(e);
                        }
                    } catch (Throwable th) {
                        catchingFishGoogleMapsRedux.CatchingFishFragmentHandler();
                        throw th;
                    }
                }
            default:
                CatchingFishXMLLayoutGlide.CatchingFishAnimationMockk(catchingFishWidgetGradle.CatchingFishDaggerWebsocket, 0L, j);
                while (j > 0) {
                    this.CatchingFishDaggerWebsocket.CatchingFishWorkManager();
                    CatchingFishMoshiDaggerMVP catchingFishMoshiDaggerMVP2 = catchingFishWidgetGradle.CatchingFishReduxKtor;
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishMoshiDaggerMVP2);
                    int min = (int) Math.min(j, catchingFishMoshiDaggerMVP2.CatchingFishCoroutine - catchingFishMoshiDaggerMVP2.CatchingFishSnackbar);
                    ((OutputStream) this.CatchingFishWorkManager).write(catchingFishMoshiDaggerMVP2.CatchingFishParcelableFAB, catchingFishMoshiDaggerMVP2.CatchingFishSnackbar, min);
                    int i = catchingFishMoshiDaggerMVP2.CatchingFishSnackbar + min;
                    catchingFishMoshiDaggerMVP2.CatchingFishSnackbar = i;
                    long j4 = min;
                    j -= j4;
                    catchingFishWidgetGradle.CatchingFishDaggerWebsocket -= j4;
                    if (i == catchingFishMoshiDaggerMVP2.CatchingFishCoroutine) {
                        catchingFishWidgetGradle.CatchingFishReduxKtor = catchingFishMoshiDaggerMVP2.CatchingFishParcelableFAB();
                        CatchingFishAnimationFlux.CatchingFishParcelableFAB(catchingFishMoshiDaggerMVP2);
                    }
                }
                return;
        }
    }

    @Override // kotlin.text.CatchingFishViewOkHttp
    public final CatchingFishMoshiFirebase CatchingFishParcelableFAB() {
        switch (this.CatchingFishReduxKtor) {
        }
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishViewOkHttp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishViewPagerFlux catchingFishViewPagerFlux = (CatchingFishViewPagerFlux) this.CatchingFishWorkManager;
                CatchingFishGoogleMapsRedux catchingFishGoogleMapsRedux = this.CatchingFishDaggerWebsocket;
                catchingFishGoogleMapsRedux.CatchingFishLayout();
                try {
                    catchingFishViewPagerFlux.close();
                    if (catchingFishGoogleMapsRedux.CatchingFishFragmentHandler()) {
                        throw catchingFishGoogleMapsRedux.CatchingFishEspressoTesting(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!catchingFishGoogleMapsRedux.CatchingFishFragmentHandler()) {
                        throw e;
                    }
                    throw catchingFishGoogleMapsRedux.CatchingFishEspressoTesting(e);
                } finally {
                    catchingFishGoogleMapsRedux.CatchingFishFragmentHandler();
                }
            default:
                ((OutputStream) this.CatchingFishWorkManager).close();
                return;
        }
    }

    @Override // kotlin.text.CatchingFishViewOkHttp, java.io.Flushable
    public final void flush() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishViewPagerFlux catchingFishViewPagerFlux = (CatchingFishViewPagerFlux) this.CatchingFishWorkManager;
                CatchingFishGoogleMapsRedux catchingFishGoogleMapsRedux = this.CatchingFishDaggerWebsocket;
                catchingFishGoogleMapsRedux.CatchingFishLayout();
                try {
                    catchingFishViewPagerFlux.flush();
                    if (catchingFishGoogleMapsRedux.CatchingFishFragmentHandler()) {
                        throw catchingFishGoogleMapsRedux.CatchingFishEspressoTesting(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!catchingFishGoogleMapsRedux.CatchingFishFragmentHandler()) {
                        throw e;
                    }
                    throw catchingFishGoogleMapsRedux.CatchingFishEspressoTesting(e);
                } finally {
                    catchingFishGoogleMapsRedux.CatchingFishFragmentHandler();
                }
            default:
                ((OutputStream) this.CatchingFishWorkManager).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "AsyncTimeout.sink(" + ((CatchingFishViewPagerFlux) this.CatchingFishWorkManager) + ')';
            default:
                return "sink(" + ((OutputStream) this.CatchingFishWorkManager) + ')';
        }
    }

    public CatchingFishViewPagerFlux(CatchingFishGoogleMapsRedux catchingFishGoogleMapsRedux, CatchingFishViewPagerFlux catchingFishViewPagerFlux) {
        this.CatchingFishDaggerWebsocket = catchingFishGoogleMapsRedux;
        this.CatchingFishWorkManager = catchingFishViewPagerFlux;
    }
}
