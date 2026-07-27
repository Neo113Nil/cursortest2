package kotlin.text;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class CatchingFishViewSnackbar extends CatchingFishFirebaseDagger {
    public static final Logger CatchingFishCardViewRealm = Logger.getLogger(CatchingFishViewSnackbar.class.getName());
    public static final boolean CatchingFishPayPal = CatchingFishGradleViewModel.CatchingFishDaggerWebsocket;
    public CatchingFishServiceHilt CatchingFishCoroutineFlow;
    public final byte[] CatchingFishDaggerHiltFAB;
    public final CatchingFishMoshiJUnitKtor CatchingFishGsonAppCompat;
    public int CatchingFishParcelableFlux;
    public final int CatchingFishSpannableWidget;

    public CatchingFishViewSnackbar(CatchingFishMoshiJUnitKtor catchingFishMoshiJUnitKtor, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i, 20);
        this.CatchingFishDaggerHiltFAB = new byte[max];
        this.CatchingFishSpannableWidget = max;
        this.CatchingFishGsonAppCompat = catchingFishMoshiJUnitKtor;
    }

    public static int CatchingFishDaggerMVVM(int i, CatchingFishCameraXRealm catchingFishCameraXRealm) {
        int CatchingFishReduxMoshi = CatchingFishReduxMoshi(i);
        int size = catchingFishCameraXRealm.size();
        return CatchingFishPicasso(size) + size + CatchingFishReduxMoshi;
    }

    public static int CatchingFishFirebase(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int CatchingFishMockkOkHttp(String str) {
        int length;
        try {
            length = CatchingFishFABGraphQLFAB.CatchingFishParcelableFAB(str);
        } catch (CatchingFishIntentRoom unused) {
            length = str.getBytes(CatchingFishFirebaseBundle.CatchingFishParcelableFAB).length;
        }
        return CatchingFishPicasso(length) + length;
    }

    public static int CatchingFishPicasso(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int CatchingFishReduxMoshi(int i) {
        return CatchingFishPicasso(i << 3);
    }

    public final void CatchingFishAndroidX(long j) {
        int i = this.CatchingFishParcelableFlux;
        int i2 = i + 1;
        this.CatchingFishParcelableFlux = i2;
        byte[] bArr = this.CatchingFishDaggerHiltFAB;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.CatchingFishParcelableFlux = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.CatchingFishParcelableFlux = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.CatchingFishParcelableFlux = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.CatchingFishParcelableFlux = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.CatchingFishParcelableFlux = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.CatchingFishParcelableFlux = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.CatchingFishParcelableFlux = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void CatchingFishCameraX(int i, int i2) {
        CatchingFishGradleLiveData(20);
        CatchingFishNavigationGson(i, 0);
        CatchingFishRedux(i2);
    }

    public final void CatchingFishCustomViewJUnit(long j) {
        boolean z = CatchingFishPayPal;
        byte[] bArr = this.CatchingFishDaggerHiltFAB;
        if (z) {
            while ((j & (-128)) != 0) {
                int i = this.CatchingFishParcelableFlux;
                this.CatchingFishParcelableFlux = i + 1;
                CatchingFishGradleViewModel.CatchingFishFragmentHandler(bArr, i, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            int i2 = this.CatchingFishParcelableFlux;
            this.CatchingFishParcelableFlux = i2 + 1;
            CatchingFishGradleViewModel.CatchingFishFragmentHandler(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i3 = this.CatchingFishParcelableFlux;
            this.CatchingFishParcelableFlux = i3 + 1;
            bArr[i3] = (byte) ((((int) j) | 128) & 255);
            j >>>= 7;
        }
        int i4 = this.CatchingFishParcelableFlux;
        this.CatchingFishParcelableFlux = i4 + 1;
        bArr[i4] = (byte) j;
    }

    public final void CatchingFishDynamicFeature(String str, int i) {
        CatchingFishSharedFlow(i, 2);
        CatchingFishPayPalHandler(str);
    }

    public final void CatchingFishFABLayout(CatchingFishCameraXRealm catchingFishCameraXRealm) {
        CatchingFishLifecycle(catchingFishCameraXRealm.size());
        CatchingFishMVVMAppCompat(catchingFishCameraXRealm.CatchingFishDaggerWebsocket, catchingFishCameraXRealm.CatchingFishWorkManager(), catchingFishCameraXRealm.size());
    }

    public final void CatchingFishGlideWidgetKtor(int i, CatchingFishCameraXRealm catchingFishCameraXRealm) {
        CatchingFishSharedFlow(i, 2);
        CatchingFishFABLayout(catchingFishCameraXRealm);
    }

    public final void CatchingFishGradleLiveData(int i) {
        if (this.CatchingFishSpannableWidget - this.CatchingFishParcelableFlux < i) {
            CatchingFishRetrofitMVI();
        }
    }

    public final void CatchingFishGraphQLGlide(int i, int i2) {
        CatchingFishGradleLiveData(14);
        CatchingFishNavigationGson(i, 5);
        CatchingFishMoshiDaggerHilt(i2);
    }

    public final void CatchingFishKtor(int i, long j) {
        CatchingFishGradleLiveData(20);
        CatchingFishNavigationGson(i, 0);
        CatchingFishCustomViewJUnit(j);
    }

    public final void CatchingFishKtorService(long j) {
        CatchingFishGradleLiveData(8);
        CatchingFishAndroidX(j);
    }

    public final void CatchingFishLifecycle(int i) {
        CatchingFishGradleLiveData(5);
        CatchingFishRedux(i);
    }

    public final void CatchingFishMVPHandler(long j) {
        CatchingFishGradleLiveData(10);
        CatchingFishCustomViewJUnit(j);
    }

    public final void CatchingFishMVPReduxContext(int i) {
        if (i >= 0) {
            CatchingFishLifecycle(i);
        } else {
            CatchingFishMVPHandler(i);
        }
    }

    @Override // kotlin.text.CatchingFishFirebaseDagger
    public final void CatchingFishMVVMAppCompat(byte[] bArr, int i, int i2) {
        CatchingFishView(bArr, i, i2);
    }

    public final void CatchingFishMoshiDaggerHilt(int i) {
        int i2 = this.CatchingFishParcelableFlux;
        int i3 = i2 + 1;
        this.CatchingFishParcelableFlux = i3;
        byte[] bArr = this.CatchingFishDaggerHiltFAB;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.CatchingFishParcelableFlux = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.CatchingFishParcelableFlux = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.CatchingFishParcelableFlux = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public final void CatchingFishNavigationGson(int i, int i2) {
        CatchingFishRedux((i << 3) | i2);
    }

    public final void CatchingFishPayPalHandler(String str) {
        try {
            int length = str.length() * 3;
            int CatchingFishPicasso = CatchingFishPicasso(length);
            int i = CatchingFishPicasso + length;
            int i2 = this.CatchingFishSpannableWidget;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int CatchingFishStateLiveData = CatchingFishFABGraphQLFAB.CatchingFishParcelableFAB.CatchingFishStateLiveData(str, bArr, 0, length);
                CatchingFishLifecycle(CatchingFishStateLiveData);
                CatchingFishView(bArr, 0, CatchingFishStateLiveData);
                return;
            }
            if (i > i2 - this.CatchingFishParcelableFlux) {
                CatchingFishRetrofitMVI();
            }
            int CatchingFishPicasso2 = CatchingFishPicasso(str.length());
            int i3 = this.CatchingFishParcelableFlux;
            byte[] bArr2 = this.CatchingFishDaggerHiltFAB;
            try {
                try {
                    if (CatchingFishPicasso2 == CatchingFishPicasso) {
                        int i4 = i3 + CatchingFishPicasso2;
                        this.CatchingFishParcelableFlux = i4;
                        int CatchingFishStateLiveData2 = CatchingFishFABGraphQLFAB.CatchingFishParcelableFAB.CatchingFishStateLiveData(str, bArr2, i4, i2 - i4);
                        this.CatchingFishParcelableFlux = i3;
                        CatchingFishRedux((CatchingFishStateLiveData2 - i3) - CatchingFishPicasso2);
                        this.CatchingFishParcelableFlux = CatchingFishStateLiveData2;
                    } else {
                        int CatchingFishParcelableFAB = CatchingFishFABGraphQLFAB.CatchingFishParcelableFAB(str);
                        CatchingFishRedux(CatchingFishParcelableFAB);
                        this.CatchingFishParcelableFlux = CatchingFishFABGraphQLFAB.CatchingFishParcelableFAB.CatchingFishStateLiveData(str, bArr2, this.CatchingFishParcelableFlux, CatchingFishParcelableFAB);
                    }
                } catch (CatchingFishIntentRoom e) {
                    this.CatchingFishParcelableFlux = i3;
                    throw e;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new CatchingFishAsyncTaskLayout(e2);
            }
        } catch (CatchingFishIntentRoom e3) {
            CatchingFishCardViewRealm.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(CatchingFishFirebaseBundle.CatchingFishParcelableFAB);
            try {
                CatchingFishLifecycle(bytes.length);
                CatchingFishMVVMAppCompat(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new CatchingFishAsyncTaskLayout(e4);
            }
        }
    }

    public final void CatchingFishRealmKtorRealm(int i, CatchingFishGlideWebsocket catchingFishGlideWebsocket, CatchingFishRoomHilt catchingFishRoomHilt) {
        CatchingFishSharedFlow(i, 2);
        CatchingFishLifecycle(catchingFishGlideWebsocket.CatchingFishParcelableFAB(catchingFishRoomHilt));
        catchingFishRoomHilt.CatchingFishDaggerWebsocket(catchingFishGlideWebsocket, this.CatchingFishCoroutineFlow);
    }

    public final void CatchingFishRedux(int i) {
        boolean z = CatchingFishPayPal;
        byte[] bArr = this.CatchingFishDaggerHiltFAB;
        if (z) {
            while ((i & (-128)) != 0) {
                int i2 = this.CatchingFishParcelableFlux;
                this.CatchingFishParcelableFlux = i2 + 1;
                CatchingFishGradleViewModel.CatchingFishFragmentHandler(bArr, i2, (byte) ((i | 128) & 255));
                i >>>= 7;
            }
            int i3 = this.CatchingFishParcelableFlux;
            this.CatchingFishParcelableFlux = i3 + 1;
            CatchingFishGradleViewModel.CatchingFishFragmentHandler(bArr, i3, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i4 = this.CatchingFishParcelableFlux;
            this.CatchingFishParcelableFlux = i4 + 1;
            bArr[i4] = (byte) ((i | 128) & 255);
            i >>>= 7;
        }
        int i5 = this.CatchingFishParcelableFlux;
        this.CatchingFishParcelableFlux = i5 + 1;
        bArr[i5] = (byte) i;
    }

    public final void CatchingFishRetrofit(byte b) {
        if (this.CatchingFishParcelableFlux == this.CatchingFishSpannableWidget) {
            CatchingFishRetrofitMVI();
        }
        int i = this.CatchingFishParcelableFlux;
        this.CatchingFishParcelableFlux = i + 1;
        this.CatchingFishDaggerHiltFAB[i] = b;
    }

    public final void CatchingFishRetrofitMVI() {
        this.CatchingFishGsonAppCompat.write(this.CatchingFishDaggerHiltFAB, 0, this.CatchingFishParcelableFlux);
        this.CatchingFishParcelableFlux = 0;
    }

    public final void CatchingFishServiceMVIJUnit(int i, boolean z) {
        CatchingFishGradleLiveData(11);
        CatchingFishNavigationGson(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.CatchingFishParcelableFlux;
        this.CatchingFishParcelableFlux = i2 + 1;
        this.CatchingFishDaggerHiltFAB[i2] = b;
    }

    public final void CatchingFishSharedFlow(int i, int i2) {
        CatchingFishLifecycle((i << 3) | i2);
    }

    public final void CatchingFishStateFlowIntent(int i) {
        CatchingFishGradleLiveData(4);
        CatchingFishMoshiDaggerHilt(i);
    }

    public final void CatchingFishView(byte[] bArr, int i, int i2) {
        int i3 = this.CatchingFishParcelableFlux;
        int i4 = this.CatchingFishSpannableWidget;
        int i5 = i4 - i3;
        byte[] bArr2 = this.CatchingFishDaggerHiltFAB;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.CatchingFishParcelableFlux += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.CatchingFishParcelableFlux = i4;
        CatchingFishRetrofitMVI();
        if (i7 > i4) {
            this.CatchingFishGsonAppCompat.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.CatchingFishParcelableFlux = i7;
        }
    }

    public final void CatchingFishWebSocketMockk(int i, int i2) {
        CatchingFishGradleLiveData(20);
        CatchingFishNavigationGson(i, 0);
        if (i2 >= 0) {
            CatchingFishRedux(i2);
        } else {
            CatchingFishCustomViewJUnit(i2);
        }
    }

    public final void CatchingFishWidget(int i, long j) {
        CatchingFishGradleLiveData(18);
        CatchingFishNavigationGson(i, 1);
        CatchingFishAndroidX(j);
    }
}
