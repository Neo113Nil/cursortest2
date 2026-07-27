package kotlin.text;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class CatchingFishKtorRedux implements Closeable {
    public static final Logger CatchingFishFragmentHandler = Logger.getLogger(CatchingFishViewModelRedux.class.getName());
    public final boolean CatchingFishDaggerWebsocket;
    public final CatchingFishGradleLayout CatchingFishLayout;
    public final CatchingFishAnimationMVI CatchingFishReduxKtor;
    public boolean CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public final CatchingFishWidgetGradle CatchingFishWorkManager;

    public CatchingFishKtorRedux(CatchingFishLayoutFlux catchingFishLayoutFlux, boolean z) {
        this.CatchingFishReduxKtor = catchingFishLayoutFlux;
        this.CatchingFishDaggerWebsocket = z;
        CatchingFishWidgetGradle catchingFishWidgetGradle = new CatchingFishWidgetGradle();
        this.CatchingFishWorkManager = catchingFishWidgetGradle;
        this.CatchingFishLayout = new CatchingFishGradleLayout(catchingFishWidgetGradle);
        this.CatchingFishViewModelScope = 16384;
    }

    public final synchronized void CatchingFishAnimationMockk(int i, long j) {
        if (this.CatchingFishViewModelFAB) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            CatchingFishViewModelRedux.CatchingFishSnackbar("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        }
        CatchingFishReduxKtor(i, 4, (byte) 8, (byte) 0);
        this.CatchingFishReduxKtor.writeInt((int) j);
        this.CatchingFishReduxKtor.flush();
    }

    public final synchronized void CatchingFishCoroutine(boolean z, int i, CatchingFishWidgetGradle catchingFishWidgetGradle, int i2) {
        if (this.CatchingFishViewModelFAB) {
            throw new IOException("closed");
        }
        CatchingFishReduxKtor(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 > 0) {
            this.CatchingFishReduxKtor.CatchingFishCloudMessaging(catchingFishWidgetGradle, i2);
        }
    }

    public final synchronized void CatchingFishDaggerWebsocket(byte[] bArr, int i, int i2) {
        try {
            if (this.CatchingFishViewModelFAB) {
                throw new IOException("closed");
            }
            if (CatchingFishMVPLiveData.CatchingFishDaggerWebsocket(i2) == -1) {
                CatchingFishViewModelRedux.CatchingFishSnackbar("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
            CatchingFishReduxKtor(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.CatchingFishReduxKtor.writeInt(i);
            this.CatchingFishReduxKtor.writeInt(CatchingFishMVPLiveData.CatchingFishDaggerWebsocket(i2));
            if (bArr.length > 0) {
                this.CatchingFishReduxKtor.write(bArr);
            }
            this.CatchingFishReduxKtor.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void CatchingFishEspressoTesting(int i, int i2, boolean z) {
        if (this.CatchingFishViewModelFAB) {
            throw new IOException("closed");
        }
        CatchingFishReduxKtor(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.CatchingFishReduxKtor.writeInt(i);
        this.CatchingFishReduxKtor.writeInt(i2);
        this.CatchingFishReduxKtor.flush();
    }

    public final synchronized void CatchingFishLayout(boolean z, int i, ArrayList arrayList) {
        if (this.CatchingFishViewModelFAB) {
            throw new IOException("closed");
        }
        this.CatchingFishLayout.CatchingFishReduxKtor(arrayList);
        long j = this.CatchingFishWorkManager.CatchingFishDaggerWebsocket;
        int min = (int) Math.min(this.CatchingFishViewModelScope, j);
        long j2 = min;
        byte b = j == j2 ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        CatchingFishReduxKtor(i, min, (byte) 1, b);
        this.CatchingFishReduxKtor.CatchingFishCloudMessaging(this.CatchingFishWorkManager, j2);
        if (j > j2) {
            long j3 = j - j2;
            while (j3 > 0) {
                int min2 = (int) Math.min(this.CatchingFishViewModelScope, j3);
                long j4 = min2;
                j3 -= j4;
                CatchingFishReduxKtor(i, min2, (byte) 9, j3 == 0 ? (byte) 4 : (byte) 0);
                this.CatchingFishReduxKtor.CatchingFishCloudMessaging(this.CatchingFishWorkManager, j4);
            }
        }
    }

    public final synchronized void CatchingFishOkHttp(int i, int i2) {
        if (this.CatchingFishViewModelFAB) {
            throw new IOException("closed");
        }
        if (CatchingFishMVPLiveData.CatchingFishDaggerWebsocket(i2) == -1) {
            throw new IllegalArgumentException();
        }
        CatchingFishReduxKtor(i, 4, (byte) 3, (byte) 0);
        this.CatchingFishReduxKtor.writeInt(CatchingFishMVPLiveData.CatchingFishDaggerWebsocket(i2));
        this.CatchingFishReduxKtor.flush();
    }

    public final void CatchingFishReduxKtor(int i, int i2, byte b, byte b2) {
        Level level = Level.FINE;
        Logger logger = CatchingFishFragmentHandler;
        if (logger.isLoggable(level)) {
            logger.fine(CatchingFishViewModelRedux.CatchingFishParcelableFAB(false, i, i2, b, b2));
        }
        int i3 = this.CatchingFishViewModelScope;
        if (i2 > i3) {
            CatchingFishViewModelRedux.CatchingFishSnackbar("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            CatchingFishViewModelRedux.CatchingFishSnackbar("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
        CatchingFishAnimationMVI catchingFishAnimationMVI = this.CatchingFishReduxKtor;
        catchingFishAnimationMVI.writeByte((i2 >>> 16) & 255);
        catchingFishAnimationMVI.writeByte((i2 >>> 8) & 255);
        catchingFishAnimationMVI.writeByte(i2 & 255);
        catchingFishAnimationMVI.writeByte(b & 255);
        catchingFishAnimationMVI.writeByte(b2 & 255);
        catchingFishAnimationMVI.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void CatchingFishSnackbar(CatchingFishWidgetToolbar catchingFishWidgetToolbar) {
        try {
            if (this.CatchingFishViewModelFAB) {
                throw new IOException("closed");
            }
            int i = this.CatchingFishViewModelScope;
            int i2 = catchingFishWidgetToolbar.CatchingFishSnackbar;
            if ((i2 & 32) != 0) {
                i = catchingFishWidgetToolbar.CatchingFishParcelableFAB[5];
            }
            this.CatchingFishViewModelScope = i;
            if (((i2 & 2) != 0 ? catchingFishWidgetToolbar.CatchingFishParcelableFAB[1] : -1) != -1) {
                CatchingFishGradleLayout catchingFishGradleLayout = this.CatchingFishLayout;
                int min = Math.min((i2 & 2) != 0 ? catchingFishWidgetToolbar.CatchingFishParcelableFAB[1] : -1, 16384);
                int i3 = catchingFishGradleLayout.CatchingFishReduxKtor;
                if (i3 != min) {
                    if (min < i3) {
                        catchingFishGradleLayout.CatchingFishSnackbar = Math.min(catchingFishGradleLayout.CatchingFishSnackbar, min);
                    }
                    catchingFishGradleLayout.CatchingFishCoroutine = true;
                    catchingFishGradleLayout.CatchingFishReduxKtor = min;
                    int i4 = catchingFishGradleLayout.CatchingFishViewModelFAB;
                    if (min < i4) {
                        if (min == 0) {
                            Arrays.fill(catchingFishGradleLayout.CatchingFishDaggerWebsocket, (Object) null);
                            catchingFishGradleLayout.CatchingFishWorkManager = catchingFishGradleLayout.CatchingFishDaggerWebsocket.length - 1;
                            catchingFishGradleLayout.CatchingFishViewModelScope = 0;
                            catchingFishGradleLayout.CatchingFishViewModelFAB = 0;
                        } else {
                            catchingFishGradleLayout.CatchingFishParcelableFAB(i4 - min);
                        }
                    }
                }
            }
            CatchingFishReduxKtor(0, 0, (byte) 4, (byte) 1);
            this.CatchingFishReduxKtor.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.CatchingFishViewModelFAB = true;
        this.CatchingFishReduxKtor.close();
    }

    public final synchronized void flush() {
        if (this.CatchingFishViewModelFAB) {
            throw new IOException("closed");
        }
        this.CatchingFishReduxKtor.flush();
    }
}
