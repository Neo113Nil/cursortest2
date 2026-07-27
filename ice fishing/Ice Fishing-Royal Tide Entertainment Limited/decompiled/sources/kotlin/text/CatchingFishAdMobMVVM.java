package kotlin.text;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class CatchingFishAdMobMVVM implements CatchingFishLayoutFragment {
    public final CatchingFishWidgetGradle CatchingFishDaggerWebsocket;
    public final CatchingFishGradleStripeAPI CatchingFishReduxKtor;
    public boolean CatchingFishWorkManager;

    public CatchingFishAdMobMVVM(CatchingFishGradleStripeAPI catchingFishGradleStripeAPI) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishGradleStripeAPI, "source");
        this.CatchingFishReduxKtor = catchingFishGradleStripeAPI;
        this.CatchingFishDaggerWebsocket = new CatchingFishWidgetGradle();
    }

    @Override // kotlin.text.CatchingFishLayoutFragment
    public final String CatchingFish(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long CatchingFishCoroutine = CatchingFishCoroutine((byte) 10, 0L, j2);
        CatchingFishWidgetGradle catchingFishWidgetGradle = this.CatchingFishDaggerWebsocket;
        if (CatchingFishCoroutine != -1) {
            return CatchingFishViewPagerToast.CatchingFishParcelableFAB(catchingFishWidgetGradle, CatchingFishCoroutine);
        }
        if (j2 < Long.MAX_VALUE && CatchingFishDaggerWebsocket(j2) && catchingFishWidgetGradle.CatchingFishDaggerWebsocket(j2 - 1) == 13 && CatchingFishDaggerWebsocket(j2 + 1) && catchingFishWidgetGradle.CatchingFishDaggerWebsocket(j2) == 10) {
            return CatchingFishViewPagerToast.CatchingFishParcelableFAB(catchingFishWidgetGradle, j2);
        }
        CatchingFishWidgetGradle catchingFishWidgetGradle2 = new CatchingFishWidgetGradle();
        catchingFishWidgetGradle.CatchingFishCoroutine(catchingFishWidgetGradle2, 0L, Math.min(32, catchingFishWidgetGradle.CatchingFishDaggerWebsocket));
        throw new EOFException("\\n not found: limit=" + Math.min(catchingFishWidgetGradle.CatchingFishDaggerWebsocket, j) + " content=" + catchingFishWidgetGradle2.CatchingFishViewModelFAB(catchingFishWidgetGradle2.CatchingFishDaggerWebsocket).CatchingFishDaggerWebsocket() + (char) 8230);
    }

    public final long CatchingFishCoroutine(byte b, long j, long j2) {
        if (this.CatchingFishWorkManager) {
            throw new IllegalStateException("closed");
        }
        if (0 > j2) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j2).toString());
        }
        long j3 = 0;
        while (j3 < j2) {
            CatchingFishWidgetGradle catchingFishWidgetGradle = this.CatchingFishDaggerWebsocket;
            byte b2 = b;
            long j4 = j2;
            long CatchingFishLayout = catchingFishWidgetGradle.CatchingFishLayout(b2, j3, j4);
            if (CatchingFishLayout == -1) {
                long j5 = catchingFishWidgetGradle.CatchingFishDaggerWebsocket;
                if (j5 >= j4 || this.CatchingFishReduxKtor.CatchingFishSpannableWidget(catchingFishWidgetGradle, 8192L) == -1) {
                    break;
                }
                j3 = Math.max(j3, j5);
                b = b2;
                j2 = j4;
            } else {
                return CatchingFishLayout;
            }
        }
        return -1L;
    }

    public final boolean CatchingFishDaggerWebsocket(long j) {
        CatchingFishWidgetGradle catchingFishWidgetGradle;
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.CatchingFishWorkManager) {
            throw new IllegalStateException("closed");
        }
        do {
            catchingFishWidgetGradle = this.CatchingFishDaggerWebsocket;
            if (catchingFishWidgetGradle.CatchingFishDaggerWebsocket >= j) {
                return true;
            }
        } while (this.CatchingFishReduxKtor.CatchingFishSpannableWidget(catchingFishWidgetGradle, 8192L) != -1);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        kotlin.text.CatchingFishRobolectricHilt.CatchingFishOkHttp(16);
        kotlin.text.CatchingFishRobolectricHilt.CatchingFishOkHttp(16);
        r1 = java.lang.Integer.toString(r2, 16);
        kotlin.text.CatchingFishFirebaseDagger.CatchingFishRoomDatabase(r1, "toString(this, checkRadix(radix))");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    @Override // kotlin.text.CatchingFishLayoutFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long CatchingFishGsonAppCompat() {
        CatchingFishWidgetGradle catchingFishWidgetGradle;
        CatchingFishJetpackCompose(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket(i2);
            catchingFishWidgetGradle = this.CatchingFishDaggerWebsocket;
            if (!CatchingFishDaggerWebsocket) {
                break;
            }
            byte CatchingFishDaggerWebsocket2 = catchingFishWidgetGradle.CatchingFishDaggerWebsocket(i);
            if ((CatchingFishDaggerWebsocket2 < 48 || CatchingFishDaggerWebsocket2 > 57) && ((CatchingFishDaggerWebsocket2 < 97 || CatchingFishDaggerWebsocket2 > 102) && (CatchingFishDaggerWebsocket2 < 65 || CatchingFishDaggerWebsocket2 > 70))) {
                break;
            }
            i = i2;
        }
        return catchingFishWidgetGradle.CatchingFishGsonAppCompat();
    }

    @Override // kotlin.text.CatchingFishLayoutFragment
    public final void CatchingFishJetpackCompose(long j) {
        if (!CatchingFishDaggerWebsocket(j)) {
            throw new EOFException();
        }
    }

    @Override // kotlin.text.CatchingFishGradleStripeAPI
    public final CatchingFishMoshiFirebase CatchingFishParcelableFAB() {
        return this.CatchingFishReduxKtor.CatchingFishParcelableFAB();
    }

    @Override // kotlin.text.CatchingFishLayoutFragment
    public final void CatchingFishPayPal(CatchingFishWidgetGradle catchingFishWidgetGradle, long j) {
        CatchingFishWidgetGradle catchingFishWidgetGradle2 = this.CatchingFishDaggerWebsocket;
        try {
            CatchingFishJetpackCompose(j);
            catchingFishWidgetGradle2.CatchingFishPayPal(catchingFishWidgetGradle, j);
        } catch (EOFException e) {
            catchingFishWidgetGradle.CatchingFishCardViewRealm(catchingFishWidgetGradle2);
            throw e;
        }
    }

    public final int CatchingFishReduxKtor() {
        CatchingFishJetpackCompose(4L);
        int readInt = this.CatchingFishDaggerWebsocket.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final boolean CatchingFishSnackbar() {
        if (this.CatchingFishWorkManager) {
            throw new IllegalStateException("closed");
        }
        CatchingFishWidgetGradle catchingFishWidgetGradle = this.CatchingFishDaggerWebsocket;
        return catchingFishWidgetGradle.CatchingFishReduxKtor() && this.CatchingFishReduxKtor.CatchingFishSpannableWidget(catchingFishWidgetGradle, 8192L) == -1;
    }

    @Override // kotlin.text.CatchingFishGradleStripeAPI
    public final long CatchingFishSpannableWidget(CatchingFishWidgetGradle catchingFishWidgetGradle, long j) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishWidgetGradle, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.CatchingFishWorkManager) {
            throw new IllegalStateException("closed");
        }
        CatchingFishWidgetGradle catchingFishWidgetGradle2 = this.CatchingFishDaggerWebsocket;
        if (catchingFishWidgetGradle2.CatchingFishDaggerWebsocket == 0 && this.CatchingFishReduxKtor.CatchingFishSpannableWidget(catchingFishWidgetGradle2, 8192L) == -1) {
            return -1L;
        }
        return catchingFishWidgetGradle2.CatchingFishSpannableWidget(catchingFishWidgetGradle, Math.min(j, catchingFishWidgetGradle2.CatchingFishDaggerWebsocket));
    }

    @Override // kotlin.text.CatchingFishLayoutFragment
    public final String CatchingFishUnitTesting() {
        return CatchingFish(Long.MAX_VALUE);
    }

    @Override // kotlin.text.CatchingFishLayoutFragment
    public final CatchingFishWebSocketMockk CatchingFishViewModelFAB(long j) {
        CatchingFishJetpackCompose(j);
        return this.CatchingFishDaggerWebsocket.CatchingFishViewModelFAB(j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.CatchingFishWorkManager) {
            return;
        }
        this.CatchingFishWorkManager = true;
        this.CatchingFishReduxKtor.close();
        CatchingFishWidgetGradle catchingFishWidgetGradle = this.CatchingFishDaggerWebsocket;
        catchingFishWidgetGradle.skip(catchingFishWidgetGradle.CatchingFishDaggerWebsocket);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.CatchingFishWorkManager;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(byteBuffer, "sink");
        CatchingFishWidgetGradle catchingFishWidgetGradle = this.CatchingFishDaggerWebsocket;
        if (catchingFishWidgetGradle.CatchingFishDaggerWebsocket == 0 && this.CatchingFishReduxKtor.CatchingFishSpannableWidget(catchingFishWidgetGradle, 8192L) == -1) {
            return -1;
        }
        return catchingFishWidgetGradle.read(byteBuffer);
    }

    @Override // kotlin.text.CatchingFishLayoutFragment
    public final byte readByte() {
        CatchingFishJetpackCompose(1L);
        return this.CatchingFishDaggerWebsocket.readByte();
    }

    @Override // kotlin.text.CatchingFishLayoutFragment
    public final void readFully(byte[] bArr) {
        CatchingFishWidgetGradle catchingFishWidgetGradle = this.CatchingFishDaggerWebsocket;
        CatchingFishFirebaseDagger.CatchingFishNavigation(bArr, "sink");
        try {
            CatchingFishJetpackCompose(bArr.length);
            catchingFishWidgetGradle.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = catchingFishWidgetGradle.CatchingFishDaggerWebsocket;
                if (j <= 0) {
                    throw e;
                }
                int read = catchingFishWidgetGradle.read(bArr, i, (int) j);
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
        }
    }

    @Override // kotlin.text.CatchingFishLayoutFragment
    public final int readInt() {
        CatchingFishJetpackCompose(4L);
        return this.CatchingFishDaggerWebsocket.readInt();
    }

    @Override // kotlin.text.CatchingFishLayoutFragment
    public final long readLong() {
        CatchingFishJetpackCompose(8L);
        return this.CatchingFishDaggerWebsocket.readLong();
    }

    @Override // kotlin.text.CatchingFishLayoutFragment
    public final short readShort() {
        CatchingFishJetpackCompose(2L);
        return this.CatchingFishDaggerWebsocket.readShort();
    }

    @Override // kotlin.text.CatchingFishLayoutFragment
    public final void skip(long j) {
        if (this.CatchingFishWorkManager) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            CatchingFishWidgetGradle catchingFishWidgetGradle = this.CatchingFishDaggerWebsocket;
            if (catchingFishWidgetGradle.CatchingFishDaggerWebsocket == 0 && this.CatchingFishReduxKtor.CatchingFishSpannableWidget(catchingFishWidgetGradle, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, catchingFishWidgetGradle.CatchingFishDaggerWebsocket);
            catchingFishWidgetGradle.skip(min);
            j -= min;
        }
    }

    public final String toString() {
        return "buffer(" + this.CatchingFishReduxKtor + ')';
    }
}
