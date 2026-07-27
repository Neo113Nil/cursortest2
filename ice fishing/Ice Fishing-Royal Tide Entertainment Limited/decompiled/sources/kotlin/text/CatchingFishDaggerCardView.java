package kotlin.text;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class CatchingFishDaggerCardView implements CatchingFishGradleStripeAPI {
    public final CatchingFishAdMobMVVM CatchingFishDaggerWebsocket;
    public byte CatchingFishReduxKtor;
    public final CRC32 CatchingFishViewModelFAB;
    public final CatchingFishGsonHilt CatchingFishViewModelScope;
    public final Inflater CatchingFishWorkManager;

    public CatchingFishDaggerCardView(CatchingFishGradleStripeAPI catchingFishGradleStripeAPI) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishGradleStripeAPI, "source");
        CatchingFishAdMobMVVM catchingFishAdMobMVVM = new CatchingFishAdMobMVVM(catchingFishGradleStripeAPI);
        this.CatchingFishDaggerWebsocket = catchingFishAdMobMVVM;
        Inflater inflater = new Inflater(true);
        this.CatchingFishWorkManager = inflater;
        this.CatchingFishViewModelScope = new CatchingFishGsonHilt(catchingFishAdMobMVVM, inflater);
        this.CatchingFishViewModelFAB = new CRC32();
    }

    public static void CatchingFishSnackbar(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    public final void CatchingFishCoroutine(CatchingFishWidgetGradle catchingFishWidgetGradle, long j, long j2) {
        CatchingFishMoshiDaggerMVP catchingFishMoshiDaggerMVP = catchingFishWidgetGradle.CatchingFishReduxKtor;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishMoshiDaggerMVP);
        while (true) {
            int i = catchingFishMoshiDaggerMVP.CatchingFishCoroutine;
            int i2 = catchingFishMoshiDaggerMVP.CatchingFishSnackbar;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            catchingFishMoshiDaggerMVP = catchingFishMoshiDaggerMVP.CatchingFishWorkManager;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishMoshiDaggerMVP);
        }
        while (j2 > 0) {
            int min = (int) Math.min(catchingFishMoshiDaggerMVP.CatchingFishCoroutine - r6, j2);
            this.CatchingFishViewModelFAB.update(catchingFishMoshiDaggerMVP.CatchingFishParcelableFAB, (int) (catchingFishMoshiDaggerMVP.CatchingFishSnackbar + j), min);
            j2 -= min;
            catchingFishMoshiDaggerMVP = catchingFishMoshiDaggerMVP.CatchingFishWorkManager;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishMoshiDaggerMVP);
            j = 0;
        }
    }

    @Override // kotlin.text.CatchingFishGradleStripeAPI
    public final CatchingFishMoshiFirebase CatchingFishParcelableFAB() {
        return this.CatchingFishDaggerWebsocket.CatchingFishReduxKtor.CatchingFishParcelableFAB();
    }

    @Override // kotlin.text.CatchingFishGradleStripeAPI
    public final long CatchingFishSpannableWidget(CatchingFishWidgetGradle catchingFishWidgetGradle, long j) {
        long j2;
        CatchingFishDaggerCardView catchingFishDaggerCardView = this;
        byte b = catchingFishDaggerCardView.CatchingFishReduxKtor;
        CRC32 crc32 = catchingFishDaggerCardView.CatchingFishViewModelFAB;
        CatchingFishAdMobMVVM catchingFishAdMobMVVM = catchingFishDaggerCardView.CatchingFishDaggerWebsocket;
        if (b == 0) {
            catchingFishAdMobMVVM.CatchingFishJetpackCompose(10L);
            CatchingFishWidgetGradle catchingFishWidgetGradle2 = catchingFishAdMobMVVM.CatchingFishDaggerWebsocket;
            byte CatchingFishDaggerWebsocket = catchingFishWidgetGradle2.CatchingFishDaggerWebsocket(3L);
            boolean z = ((CatchingFishDaggerWebsocket >> 1) & 1) == 1;
            if (z) {
                catchingFishDaggerCardView.CatchingFishCoroutine(catchingFishWidgetGradle2, 0L, 10L);
            }
            CatchingFishSnackbar("ID1ID2", 8075, catchingFishAdMobMVVM.readShort());
            catchingFishAdMobMVVM.skip(8L);
            if (((CatchingFishDaggerWebsocket >> 2) & 1) == 1) {
                catchingFishAdMobMVVM.CatchingFishJetpackCompose(2L);
                if (z) {
                    CatchingFishCoroutine(catchingFishWidgetGradle2, 0L, 2L);
                }
                short readShort = catchingFishWidgetGradle2.readShort();
                long j3 = ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8))) & 65535;
                catchingFishAdMobMVVM.CatchingFishJetpackCompose(j3);
                if (z) {
                    CatchingFishCoroutine(catchingFishWidgetGradle2, 0L, j3);
                }
                catchingFishAdMobMVVM.skip(j3);
            }
            if (((CatchingFishDaggerWebsocket >> 3) & 1) == 1) {
                long CatchingFishCoroutine = catchingFishAdMobMVVM.CatchingFishCoroutine((byte) 0, 0L, Long.MAX_VALUE);
                if (CatchingFishCoroutine == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = 2;
                    CatchingFishCoroutine(catchingFishWidgetGradle2, 0L, CatchingFishCoroutine + 1);
                } else {
                    j2 = 2;
                }
                catchingFishAdMobMVVM.skip(CatchingFishCoroutine + 1);
            } else {
                j2 = 2;
            }
            if (((CatchingFishDaggerWebsocket >> 4) & 1) == 1) {
                long j4 = j2;
                long CatchingFishCoroutine2 = catchingFishAdMobMVVM.CatchingFishCoroutine((byte) 0, 0L, Long.MAX_VALUE);
                if (CatchingFishCoroutine2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = j4;
                    catchingFishDaggerCardView = this;
                    catchingFishDaggerCardView.CatchingFishCoroutine(catchingFishWidgetGradle2, 0L, CatchingFishCoroutine2 + 1);
                } else {
                    catchingFishDaggerCardView = this;
                    j2 = j4;
                }
                catchingFishAdMobMVVM.skip(CatchingFishCoroutine2 + 1);
            } else {
                catchingFishDaggerCardView = this;
            }
            if (z) {
                catchingFishAdMobMVVM.CatchingFishJetpackCompose(j2);
                short readShort2 = catchingFishWidgetGradle2.readShort();
                CatchingFishSnackbar("FHCRC", (short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            catchingFishDaggerCardView.CatchingFishReduxKtor = (byte) 1;
        }
        if (catchingFishDaggerCardView.CatchingFishReduxKtor == 1) {
            long j5 = catchingFishWidgetGradle.CatchingFishDaggerWebsocket;
            long CatchingFishSpannableWidget = catchingFishDaggerCardView.CatchingFishViewModelScope.CatchingFishSpannableWidget(catchingFishWidgetGradle, 8192L);
            if (CatchingFishSpannableWidget != -1) {
                catchingFishDaggerCardView.CatchingFishCoroutine(catchingFishWidgetGradle, j5, CatchingFishSpannableWidget);
                return CatchingFishSpannableWidget;
            }
            catchingFishDaggerCardView.CatchingFishReduxKtor = (byte) 2;
        }
        if (catchingFishDaggerCardView.CatchingFishReduxKtor == 2) {
            CatchingFishSnackbar("CRC", catchingFishAdMobMVVM.CatchingFishReduxKtor(), (int) crc32.getValue());
            CatchingFishSnackbar("ISIZE", catchingFishAdMobMVVM.CatchingFishReduxKtor(), (int) catchingFishDaggerCardView.CatchingFishWorkManager.getBytesWritten());
            catchingFishDaggerCardView.CatchingFishReduxKtor = (byte) 3;
            if (!catchingFishAdMobMVVM.CatchingFishSnackbar()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.CatchingFishViewModelScope.close();
    }
}
