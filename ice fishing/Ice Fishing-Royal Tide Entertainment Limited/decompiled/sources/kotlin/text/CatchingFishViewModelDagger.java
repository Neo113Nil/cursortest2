package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class CatchingFishViewModelDagger implements Closeable {
    public static final Logger CatchingFishViewModelFAB = Logger.getLogger(CatchingFishViewModelRedux.class.getName());
    public final CatchingFishXMLLayoutMVI CatchingFishDaggerWebsocket;
    public final CatchingFishLayoutFragment CatchingFishReduxKtor;
    public final CatchingFishKtorGlide CatchingFishViewModelScope;
    public final boolean CatchingFishWorkManager;

    public CatchingFishViewModelDagger(CatchingFishAdMobMVVM catchingFishAdMobMVVM, boolean z) {
        this.CatchingFishReduxKtor = catchingFishAdMobMVVM;
        this.CatchingFishWorkManager = z;
        CatchingFishXMLLayoutMVI catchingFishXMLLayoutMVI = new CatchingFishXMLLayoutMVI(catchingFishAdMobMVVM);
        this.CatchingFishDaggerWebsocket = catchingFishXMLLayoutMVI;
        this.CatchingFishViewModelScope = new CatchingFishKtorGlide(catchingFishXMLLayoutMVI);
    }

    public static int CatchingFishOkHttp(CatchingFishLayoutFragment catchingFishLayoutFragment) {
        return (catchingFishLayoutFragment.readByte() & 255) | ((catchingFishLayoutFragment.readByte() & 255) << 16) | ((catchingFishLayoutFragment.readByte() & 255) << 8);
    }

    public static int CatchingFishSnackbar(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        CatchingFishViewModelRedux.CatchingFishCoroutine("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    public final void CatchingFishAnimationMockk(CatchingFishGradleAndroidX catchingFishGradleAndroidX, int i, byte b, int i2) {
        if (i2 == 0) {
            CatchingFishViewModelRedux.CatchingFishCoroutine("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short readByte = (b & 8) != 0 ? (short) (this.CatchingFishReduxKtor.readByte() & 255) : (short) 0;
        int readInt = this.CatchingFishReduxKtor.readInt() & Integer.MAX_VALUE;
        ArrayList CatchingFishLayout = CatchingFishLayout(CatchingFishSnackbar(i - 4, b, readByte), readByte, b, i2);
        CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi = (CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager;
        synchronized (catchingFishSharedFlowMoshi) {
            try {
                if (catchingFishSharedFlowMoshi.CatchingFishGsonAppCompat.contains(Integer.valueOf(readInt))) {
                    catchingFishSharedFlowMoshi.CatchingFishStateLiveData(readInt, 2);
                    return;
                }
                catchingFishSharedFlowMoshi.CatchingFishGsonAppCompat.add(Integer.valueOf(readInt));
                try {
                    catchingFishSharedFlowMoshi.CatchingFishDaggerWebsocket(new CatchingFishToastMoshiRealm(catchingFishSharedFlowMoshi, new Object[]{catchingFishSharedFlowMoshi.CatchingFishViewModelScope, Integer.valueOf(readInt)}, readInt, CatchingFishLayout));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean CatchingFishCoroutine(boolean z, CatchingFishGradleAndroidX catchingFishGradleAndroidX) {
        int i;
        int i2;
        CatchingFishPayPalMVI[] catchingFishPayPalMVIArr;
        try {
            this.CatchingFishReduxKtor.CatchingFishJetpackCompose(9L);
            int CatchingFishOkHttp = CatchingFishOkHttp(this.CatchingFishReduxKtor);
            if (CatchingFishOkHttp < 0 || CatchingFishOkHttp > 16384) {
                CatchingFishViewModelRedux.CatchingFishCoroutine("FRAME_SIZE_ERROR: %s", Integer.valueOf(CatchingFishOkHttp));
                throw null;
            }
            byte readByte = (byte) (this.CatchingFishReduxKtor.readByte() & 255);
            if (z && readByte != 4) {
                CatchingFishViewModelRedux.CatchingFishCoroutine("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
                throw null;
            }
            byte readByte2 = (byte) (this.CatchingFishReduxKtor.readByte() & 255);
            int readInt = this.CatchingFishReduxKtor.readInt();
            int i3 = Integer.MAX_VALUE & readInt;
            Logger logger = CatchingFishViewModelFAB;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(CatchingFishViewModelRedux.CatchingFishParcelableFAB(true, i3, CatchingFishOkHttp, readByte, readByte2));
            }
            switch (readByte) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    CatchingFishDaggerWebsocket(catchingFishGradleAndroidX, CatchingFishOkHttp, readByte2, i3);
                    return true;
                case 1:
                    CatchingFishEspressoTesting(catchingFishGradleAndroidX, CatchingFishOkHttp, readByte2, i3);
                    return true;
                case 2:
                    if (CatchingFishOkHttp != 5) {
                        CatchingFishViewModelRedux.CatchingFishCoroutine("TYPE_PRIORITY length: %d != 5", Integer.valueOf(CatchingFishOkHttp));
                        throw null;
                    }
                    if (i3 == 0) {
                        CatchingFishViewModelRedux.CatchingFishCoroutine("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    CatchingFishLayoutFragment catchingFishLayoutFragment = this.CatchingFishReduxKtor;
                    catchingFishLayoutFragment.readInt();
                    catchingFishLayoutFragment.readByte();
                    return true;
                case 3:
                    if (CatchingFishOkHttp != 4) {
                        CatchingFishViewModelRedux.CatchingFishCoroutine("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(CatchingFishOkHttp));
                        throw null;
                    }
                    if (i3 == 0) {
                        CatchingFishViewModelRedux.CatchingFishCoroutine("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        throw null;
                    }
                    int readInt2 = this.CatchingFishReduxKtor.readInt();
                    int[] CatchingFishGsonAppCompat = CatchingFishMVPLiveData.CatchingFishGsonAppCompat(11);
                    int length = CatchingFishGsonAppCompat.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            i = CatchingFishGsonAppCompat[i4];
                            if (CatchingFishMVPLiveData.CatchingFishDaggerWebsocket(i) != readInt2) {
                                i4++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        CatchingFishViewModelRedux.CatchingFishCoroutine("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt2));
                        throw null;
                    }
                    CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi = (CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager;
                    if (i3 != 0 && (readInt & 1) == 0) {
                        r2 = 1;
                    }
                    if (r2 != 0) {
                        catchingFishSharedFlowMoshi.CatchingFishDaggerWebsocket(new CatchingFishToastMoshiRealm(catchingFishSharedFlowMoshi, new Object[]{catchingFishSharedFlowMoshi.CatchingFishViewModelScope, Integer.valueOf(i3)}, i3, i));
                        return true;
                    }
                    CatchingFishPayPalMVI CatchingFishLayout = catchingFishSharedFlowMoshi.CatchingFishLayout(i3);
                    if (CatchingFishLayout != null) {
                        synchronized (CatchingFishLayout) {
                            if (CatchingFishLayout.CatchingFishCloudMessaging == 0) {
                                CatchingFishLayout.CatchingFishCloudMessaging = i;
                                CatchingFishLayout.notifyAll();
                            }
                        }
                        return true;
                    }
                    return true;
                case 4:
                    CatchingFishLayoutFragment catchingFishLayoutFragment2 = this.CatchingFishReduxKtor;
                    if (i3 != 0) {
                        CatchingFishViewModelRedux.CatchingFishCoroutine("TYPE_SETTINGS streamId != 0", new Object[0]);
                        throw null;
                    }
                    if ((readByte2 & 1) != 0) {
                        if (CatchingFishOkHttp != 0) {
                            CatchingFishViewModelRedux.CatchingFishCoroutine("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                            throw null;
                        }
                        return true;
                    }
                    if (CatchingFishOkHttp % 6 != 0) {
                        CatchingFishViewModelRedux.CatchingFishCoroutine("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(CatchingFishOkHttp));
                        throw null;
                    }
                    CatchingFishWidgetToolbar catchingFishWidgetToolbar = new CatchingFishWidgetToolbar(2, false);
                    for (int i5 = 0; i5 < CatchingFishOkHttp; i5 += 6) {
                        int readShort = catchingFishLayoutFragment2.readShort() & 65535;
                        int readInt3 = catchingFishLayoutFragment2.readInt();
                        if (readShort != 2) {
                            if (readShort == 3) {
                                readShort = 4;
                            } else if (readShort == 4) {
                                if (readInt3 < 0) {
                                    CatchingFishViewModelRedux.CatchingFishCoroutine("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                    throw null;
                                }
                                readShort = 7;
                            } else if (readShort == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                CatchingFishViewModelRedux.CatchingFishCoroutine("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt3));
                                throw null;
                            }
                        } else if (readInt3 != 0 && readInt3 != 1) {
                            CatchingFishViewModelRedux.CatchingFishCoroutine("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            throw null;
                        }
                        catchingFishWidgetToolbar.CatchingFishViewModelFAB(readShort, readInt3);
                    }
                    CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi2 = (CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager;
                    catchingFishSharedFlowMoshi2.CatchingFishCloudMessaging.execute(new CatchingFishGradleAndroidX(catchingFishGradleAndroidX, new Object[]{catchingFishSharedFlowMoshi2.CatchingFishViewModelScope}, catchingFishWidgetToolbar));
                    return true;
                case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                    CatchingFishAnimationMockk(catchingFishGradleAndroidX, CatchingFishOkHttp, readByte2, i3);
                    return true;
                case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (CatchingFishOkHttp != 8) {
                        CatchingFishViewModelRedux.CatchingFishCoroutine("TYPE_PING length != 8: %s", Integer.valueOf(CatchingFishOkHttp));
                        throw null;
                    }
                    if (i3 != 0) {
                        CatchingFishViewModelRedux.CatchingFishCoroutine("TYPE_PING streamId != 0", new Object[0]);
                        throw null;
                    }
                    int readInt4 = this.CatchingFishReduxKtor.readInt();
                    int readInt5 = this.CatchingFishReduxKtor.readInt();
                    if (((readByte2 & 1) != 0 ? 1 : 0) == 0) {
                        CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi3 = (CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager;
                        catchingFishSharedFlowMoshi3.CatchingFishCloudMessaging.execute(new CatchingFishAndroidXWidget(catchingFishSharedFlowMoshi3, readInt4, readInt5));
                        return true;
                    }
                    synchronized (((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager)) {
                        try {
                            if (readInt4 == 1) {
                                ((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager).CatchingFishUnitTesting++;
                            } else if (readInt4 == 2) {
                                ((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager).CatchingFishStateLiveData++;
                            } else if (readInt4 == 3) {
                                ((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager).notifyAll();
                            }
                        } finally {
                        }
                    }
                    return true;
                case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (CatchingFishOkHttp < 8) {
                        CatchingFishViewModelRedux.CatchingFishCoroutine("TYPE_GOAWAY length < 8: %s", Integer.valueOf(CatchingFishOkHttp));
                        throw null;
                    }
                    if (i3 != 0) {
                        CatchingFishViewModelRedux.CatchingFishCoroutine("TYPE_GOAWAY streamId != 0", new Object[0]);
                        throw null;
                    }
                    int readInt6 = this.CatchingFishReduxKtor.readInt();
                    int readInt7 = this.CatchingFishReduxKtor.readInt();
                    int i6 = CatchingFishOkHttp - 8;
                    int[] CatchingFishGsonAppCompat2 = CatchingFishMVPLiveData.CatchingFishGsonAppCompat(11);
                    int length2 = CatchingFishGsonAppCompat2.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 < length2) {
                            i2 = CatchingFishGsonAppCompat2[i7];
                            if (CatchingFishMVPLiveData.CatchingFishDaggerWebsocket(i2) != readInt7) {
                                i7++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        CatchingFishViewModelRedux.CatchingFishCoroutine("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt7));
                        throw null;
                    }
                    CatchingFishWebSocketMockk catchingFishWebSocketMockk = CatchingFishWebSocketMockk.CatchingFishViewModelScope;
                    if (i6 > 0) {
                        catchingFishWebSocketMockk = this.CatchingFishReduxKtor.CatchingFishViewModelFAB(i6);
                    }
                    catchingFishWebSocketMockk.CatchingFishReduxKtor();
                    synchronized (((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager)) {
                        catchingFishPayPalMVIArr = (CatchingFishPayPalMVI[]) ((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager).CatchingFishWorkManager.values().toArray(new CatchingFishPayPalMVI[((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager).CatchingFishWorkManager.size()]);
                        ((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager).CatchingFishFragmentHandler = true;
                    }
                    int length3 = catchingFishPayPalMVIArr.length;
                    while (r2 < length3) {
                        CatchingFishPayPalMVI catchingFishPayPalMVI = catchingFishPayPalMVIArr[r2];
                        if (catchingFishPayPalMVI.CatchingFishCoroutine > readInt6 && catchingFishPayPalMVI.CatchingFishViewModelScope()) {
                            synchronized (catchingFishPayPalMVI) {
                                if (catchingFishPayPalMVI.CatchingFishCloudMessaging == 0) {
                                    catchingFishPayPalMVI.CatchingFishCloudMessaging = 5;
                                    catchingFishPayPalMVI.notifyAll();
                                }
                            }
                            ((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager).CatchingFishLayout(catchingFishPayPalMVI.CatchingFishCoroutine);
                        }
                        r2++;
                    }
                    return true;
                case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                    if (CatchingFishOkHttp != 4) {
                        CatchingFishViewModelRedux.CatchingFishCoroutine("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(CatchingFishOkHttp));
                        throw null;
                    }
                    long readInt8 = this.CatchingFishReduxKtor.readInt() & 2147483647L;
                    if (readInt8 == 0) {
                        CatchingFishViewModelRedux.CatchingFishCoroutine("windowSizeIncrement was 0", Long.valueOf(readInt8));
                        throw null;
                    }
                    if (i3 == 0) {
                        synchronized (((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager)) {
                            CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi4 = (CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager;
                            catchingFishSharedFlowMoshi4.CatchingFish += readInt8;
                            catchingFishSharedFlowMoshi4.notifyAll();
                        }
                        return true;
                    }
                    CatchingFishPayPalMVI CatchingFishCoroutine = ((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager).CatchingFishCoroutine(i3);
                    if (CatchingFishCoroutine != null) {
                        synchronized (CatchingFishCoroutine) {
                            CatchingFishCoroutine.CatchingFishSnackbar += readInt8;
                            if (readInt8 > 0) {
                                CatchingFishCoroutine.notifyAll();
                            }
                        }
                        return true;
                    }
                    return true;
                default:
                    this.CatchingFishReduxKtor.skip(CatchingFishOkHttp);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void CatchingFishDaggerWebsocket(CatchingFishGradleAndroidX catchingFishGradleAndroidX, int i, byte b, int i2) {
        boolean z;
        boolean z2;
        long j;
        if (i2 == 0) {
            CatchingFishViewModelRedux.CatchingFishCoroutine("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
            throw null;
        }
        boolean z3 = (b & 1) != 0;
        if ((b & 32) != 0) {
            CatchingFishViewModelRedux.CatchingFishCoroutine("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        short readByte = (b & 8) != 0 ? (short) (this.CatchingFishReduxKtor.readByte() & 255) : (short) 0;
        int CatchingFishSnackbar = CatchingFishSnackbar(i, b, readByte);
        CatchingFishLayoutFragment catchingFishLayoutFragment = this.CatchingFishReduxKtor;
        CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi = (CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager;
        if (i2 == 0 || (i2 & 1) != 0) {
            CatchingFishPayPalMVI CatchingFishCoroutine = catchingFishSharedFlowMoshi.CatchingFishCoroutine(i2);
            if (CatchingFishCoroutine == null) {
                ((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager).CatchingFishStateLiveData(i2, 2);
                long j2 = CatchingFishSnackbar;
                ((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager).CatchingFishOkHttp(j2);
                catchingFishLayoutFragment.skip(j2);
            } else {
                CatchingFishMockkGlide catchingFishMockkGlide = CatchingFishCoroutine.CatchingFishViewModelScope;
                long j3 = CatchingFishSnackbar;
                while (true) {
                    if (j3 <= 0) {
                        catchingFishMockkGlide.getClass();
                        break;
                    }
                    synchronized (catchingFishMockkGlide.CatchingFishLayout) {
                        z = catchingFishMockkGlide.CatchingFishViewModelFAB;
                        z2 = catchingFishMockkGlide.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket + j3 > catchingFishMockkGlide.CatchingFishWorkManager;
                    }
                    if (z2) {
                        catchingFishLayoutFragment.skip(j3);
                        catchingFishMockkGlide.CatchingFishLayout.CatchingFishDaggerWebsocket(4);
                        break;
                    }
                    if (z) {
                        catchingFishLayoutFragment.skip(j3);
                        break;
                    }
                    long CatchingFishSpannableWidget = catchingFishLayoutFragment.CatchingFishSpannableWidget(catchingFishMockkGlide.CatchingFishReduxKtor, j3);
                    if (CatchingFishSpannableWidget == -1) {
                        throw new EOFException();
                    }
                    j3 -= CatchingFishSpannableWidget;
                    synchronized (catchingFishMockkGlide.CatchingFishLayout) {
                        try {
                            if (catchingFishMockkGlide.CatchingFishViewModelScope) {
                                CatchingFishWidgetGradle catchingFishWidgetGradle = catchingFishMockkGlide.CatchingFishReduxKtor;
                                j = catchingFishWidgetGradle.CatchingFishDaggerWebsocket;
                                catchingFishWidgetGradle.skip(j);
                            } else {
                                CatchingFishWidgetGradle catchingFishWidgetGradle2 = catchingFishMockkGlide.CatchingFishDaggerWebsocket;
                                boolean z4 = catchingFishWidgetGradle2.CatchingFishDaggerWebsocket == 0;
                                catchingFishWidgetGradle2.CatchingFishCardViewRealm(catchingFishMockkGlide.CatchingFishReduxKtor);
                                if (z4) {
                                    catchingFishMockkGlide.CatchingFishLayout.notifyAll();
                                }
                                j = 0;
                            }
                        } finally {
                        }
                    }
                    if (j > 0) {
                        catchingFishMockkGlide.CatchingFishLayout.CatchingFishReduxKtor.CatchingFishOkHttp(j);
                    }
                }
                if (z3) {
                    CatchingFishCoroutine.CatchingFishLayout(CatchingFishEspressoDagger.CatchingFishCoroutine, true);
                }
            }
        } else {
            CatchingFishWidgetGradle catchingFishWidgetGradle3 = new CatchingFishWidgetGradle();
            long j4 = CatchingFishSnackbar;
            catchingFishLayoutFragment.CatchingFishJetpackCompose(j4);
            catchingFishLayoutFragment.CatchingFishSpannableWidget(catchingFishWidgetGradle3, j4);
            if (catchingFishWidgetGradle3.CatchingFishDaggerWebsocket != j4) {
                throw new IOException(catchingFishWidgetGradle3.CatchingFishDaggerWebsocket + " != " + CatchingFishSnackbar);
            }
            catchingFishSharedFlowMoshi.CatchingFishDaggerWebsocket(new CatchingFishGsonMVI(catchingFishSharedFlowMoshi, new Object[]{catchingFishSharedFlowMoshi.CatchingFishViewModelScope, Integer.valueOf(i2)}, i2, catchingFishWidgetGradle3, CatchingFishSnackbar, z3));
        }
        this.CatchingFishReduxKtor.skip(readByte);
    }

    public final void CatchingFishEspressoTesting(CatchingFishGradleAndroidX catchingFishGradleAndroidX, int i, byte b, int i2) {
        if (i2 == 0) {
            CatchingFishViewModelRedux.CatchingFishCoroutine("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z = (b & 1) != 0;
        short readByte = (b & 8) != 0 ? (short) (this.CatchingFishReduxKtor.readByte() & 255) : (short) 0;
        if ((b & 32) != 0) {
            CatchingFishLayoutFragment catchingFishLayoutFragment = this.CatchingFishReduxKtor;
            catchingFishLayoutFragment.readInt();
            catchingFishLayoutFragment.readByte();
            i -= 5;
        }
        ArrayList CatchingFishLayout = CatchingFishLayout(CatchingFishSnackbar(i, b, readByte), readByte, b, i2);
        CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi = (CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager;
        if (i2 != 0 && (i2 & 1) == 0) {
            try {
                catchingFishSharedFlowMoshi.CatchingFishDaggerWebsocket(new CatchingFishToastMoshiRealm(catchingFishSharedFlowMoshi, new Object[]{catchingFishSharedFlowMoshi.CatchingFishViewModelScope, Integer.valueOf(i2)}, i2, CatchingFishLayout, z));
                return;
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        synchronized (catchingFishSharedFlowMoshi) {
            try {
                CatchingFishPayPalMVI CatchingFishCoroutine = ((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager).CatchingFishCoroutine(i2);
                if (CatchingFishCoroutine != null) {
                    CatchingFishCoroutine.CatchingFishLayout(CatchingFishEspressoDagger.CatchingFishRoomDatabase(CatchingFishLayout), z);
                    return;
                }
                CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi2 = (CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager;
                if (catchingFishSharedFlowMoshi2.CatchingFishFragmentHandler) {
                    return;
                }
                if (i2 <= catchingFishSharedFlowMoshi2.CatchingFishViewModelFAB) {
                    return;
                }
                if (i2 % 2 == catchingFishSharedFlowMoshi2.CatchingFishLayout % 2) {
                    return;
                }
                CatchingFishPayPalMVI catchingFishPayPalMVI = new CatchingFishPayPalMVI(i2, (CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager, false, z, CatchingFishEspressoDagger.CatchingFishRoomDatabase(CatchingFishLayout));
                CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi3 = (CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager;
                catchingFishSharedFlowMoshi3.CatchingFishViewModelFAB = i2;
                catchingFishSharedFlowMoshi3.CatchingFishWorkManager.put(Integer.valueOf(i2), catchingFishPayPalMVI);
                CatchingFishSharedFlowMoshi.CatchingFishCardViewRealm.execute(new CatchingFishGradleAndroidX(catchingFishGradleAndroidX, new Object[]{((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager).CatchingFishViewModelScope, Integer.valueOf(i2)}, catchingFishPayPalMVI));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ArrayList CatchingFishLayout(int i, short s, byte b, int i2) {
        CatchingFishXMLLayoutMVI catchingFishXMLLayoutMVI = this.CatchingFishDaggerWebsocket;
        catchingFishXMLLayoutMVI.CatchingFishViewModelFAB = i;
        catchingFishXMLLayoutMVI.CatchingFishDaggerWebsocket = i;
        catchingFishXMLLayoutMVI.CatchingFishLayout = s;
        catchingFishXMLLayoutMVI.CatchingFishWorkManager = b;
        catchingFishXMLLayoutMVI.CatchingFishViewModelScope = i2;
        CatchingFishKtorGlide catchingFishKtorGlide = this.CatchingFishViewModelScope;
        CatchingFishAdMobMVVM catchingFishAdMobMVVM = catchingFishKtorGlide.CatchingFishSnackbar;
        ArrayList arrayList = catchingFishKtorGlide.CatchingFishParcelableFAB;
        while (!catchingFishAdMobMVVM.CatchingFishSnackbar()) {
            byte readByte = catchingFishAdMobMVVM.readByte();
            int i3 = readByte & 255;
            if (i3 == 128) {
                throw new IOException("index == 0");
            }
            if ((readByte & 128) == 128) {
                int CatchingFishDaggerWebsocket = catchingFishKtorGlide.CatchingFishDaggerWebsocket(i3, 127);
                int i4 = CatchingFishDaggerWebsocket - 1;
                if (i4 >= 0) {
                    CatchingFishXMLLayoutFAB[] catchingFishXMLLayoutFABArr = CatchingFishHiltMockkRealm.CatchingFishParcelableFAB;
                    if (i4 <= catchingFishXMLLayoutFABArr.length - 1) {
                        arrayList.add(catchingFishXMLLayoutFABArr[i4]);
                    }
                }
                int length = catchingFishKtorGlide.CatchingFishWorkManager + 1 + (i4 - CatchingFishHiltMockkRealm.CatchingFishParcelableFAB.length);
                if (length >= 0) {
                    CatchingFishXMLLayoutFAB[] catchingFishXMLLayoutFABArr2 = catchingFishKtorGlide.CatchingFishDaggerWebsocket;
                    if (length < catchingFishXMLLayoutFABArr2.length) {
                        arrayList.add(catchingFishXMLLayoutFABArr2[length]);
                    }
                }
                throw new IOException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("Header index too large ", CatchingFishDaggerWebsocket));
            }
            if (i3 == 64) {
                CatchingFishWebSocketMockk CatchingFishReduxKtor = catchingFishKtorGlide.CatchingFishReduxKtor();
                CatchingFishHiltMockkRealm.CatchingFishParcelableFAB(CatchingFishReduxKtor);
                catchingFishKtorGlide.CatchingFishCoroutine(new CatchingFishXMLLayoutFAB(CatchingFishReduxKtor, catchingFishKtorGlide.CatchingFishReduxKtor()));
            } else if ((readByte & 64) == 64) {
                catchingFishKtorGlide.CatchingFishCoroutine(new CatchingFishXMLLayoutFAB(catchingFishKtorGlide.CatchingFishSnackbar(catchingFishKtorGlide.CatchingFishDaggerWebsocket(i3, 63) - 1), catchingFishKtorGlide.CatchingFishReduxKtor()));
            } else if ((readByte & 32) == 32) {
                int CatchingFishDaggerWebsocket2 = catchingFishKtorGlide.CatchingFishDaggerWebsocket(i3, 31);
                catchingFishKtorGlide.CatchingFishReduxKtor = CatchingFishDaggerWebsocket2;
                if (CatchingFishDaggerWebsocket2 < 0 || CatchingFishDaggerWebsocket2 > catchingFishKtorGlide.CatchingFishCoroutine) {
                    throw new IOException("Invalid dynamic table size update " + catchingFishKtorGlide.CatchingFishReduxKtor);
                }
                int i5 = catchingFishKtorGlide.CatchingFishViewModelFAB;
                if (CatchingFishDaggerWebsocket2 < i5) {
                    if (CatchingFishDaggerWebsocket2 == 0) {
                        Arrays.fill(catchingFishKtorGlide.CatchingFishDaggerWebsocket, (Object) null);
                        catchingFishKtorGlide.CatchingFishWorkManager = catchingFishKtorGlide.CatchingFishDaggerWebsocket.length - 1;
                        catchingFishKtorGlide.CatchingFishViewModelScope = 0;
                        catchingFishKtorGlide.CatchingFishViewModelFAB = 0;
                    } else {
                        catchingFishKtorGlide.CatchingFishParcelableFAB(i5 - CatchingFishDaggerWebsocket2);
                    }
                }
            } else if (i3 == 16 || i3 == 0) {
                CatchingFishWebSocketMockk CatchingFishReduxKtor2 = catchingFishKtorGlide.CatchingFishReduxKtor();
                CatchingFishHiltMockkRealm.CatchingFishParcelableFAB(CatchingFishReduxKtor2);
                arrayList.add(new CatchingFishXMLLayoutFAB(CatchingFishReduxKtor2, catchingFishKtorGlide.CatchingFishReduxKtor()));
            } else {
                arrayList.add(new CatchingFishXMLLayoutFAB(catchingFishKtorGlide.CatchingFishSnackbar(catchingFishKtorGlide.CatchingFishDaggerWebsocket(i3, 15) - 1), catchingFishKtorGlide.CatchingFishReduxKtor()));
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        return arrayList2;
    }

    public final void CatchingFishReduxKtor(CatchingFishGradleAndroidX catchingFishGradleAndroidX) {
        if (this.CatchingFishWorkManager) {
            if (CatchingFishCoroutine(true, catchingFishGradleAndroidX)) {
                return;
            }
            CatchingFishViewModelRedux.CatchingFishCoroutine("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        CatchingFishWebSocketMockk catchingFishWebSocketMockk = CatchingFishViewModelRedux.CatchingFishParcelableFAB;
        CatchingFishWebSocketMockk CatchingFishViewModelFAB2 = this.CatchingFishReduxKtor.CatchingFishViewModelFAB(catchingFishWebSocketMockk.CatchingFishReduxKtor.length);
        Level level = Level.FINE;
        Logger logger = CatchingFishViewModelFAB;
        if (logger.isLoggable(level)) {
            String CatchingFishDaggerWebsocket = CatchingFishViewModelFAB2.CatchingFishDaggerWebsocket();
            byte[] bArr = CatchingFishEspressoDagger.CatchingFishParcelableFAB;
            Locale locale = Locale.US;
            logger.fine("<< CONNECTION " + CatchingFishDaggerWebsocket);
        }
        if (catchingFishWebSocketMockk.equals(CatchingFishViewModelFAB2)) {
            return;
        }
        CatchingFishViewModelRedux.CatchingFishCoroutine("Expected a connection header but was %s", CatchingFishViewModelFAB2.CatchingFishEspressoTesting());
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.CatchingFishReduxKtor.close();
    }
}
