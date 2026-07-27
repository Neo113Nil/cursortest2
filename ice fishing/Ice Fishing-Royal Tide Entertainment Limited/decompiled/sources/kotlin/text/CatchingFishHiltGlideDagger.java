package kotlin.text;

import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishHiltGlideDagger extends CatchingFishReduxLayout {
    public int CatchingFishCloudMessaging;
    public int CatchingFishEspressoTesting;
    public int CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public int CatchingFishOkHttp = Integer.MAX_VALUE;
    public int CatchingFishViewModelFAB;
    public final byte[] CatchingFishViewModelScope;
    public final FileInputStream CatchingFishWorkManager;

    public CatchingFishHiltGlideDagger(FileInputStream fileInputStream) {
        Charset charset = CatchingFishFirebaseBundle.CatchingFishParcelableFAB;
        this.CatchingFishWorkManager = fileInputStream;
        this.CatchingFishViewModelScope = new byte[4096];
        this.CatchingFishViewModelFAB = 0;
        this.CatchingFishFragmentHandler = 0;
        this.CatchingFishEspressoTesting = 0;
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final long CatchingFish() {
        return CatchingFishDagger();
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final long CatchingFishAnimationMockk() {
        return CatchingFishSensorManager();
    }

    public final long CatchingFishCameraXIntent() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.CatchingFishFragmentHandler == this.CatchingFishViewModelFAB) {
                CatchingFishPayPalLiveData(1);
            }
            int i2 = this.CatchingFishFragmentHandler;
            this.CatchingFishFragmentHandler = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.CatchingFishViewModelScope[i2] & 128) == 0) {
                return j;
            }
        }
        throw CatchingFishKtorMVPAndroidX.CatchingFishCoroutine();
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final int CatchingFishCardViewRealm() {
        if (CatchingFishCoroutine()) {
            this.CatchingFishCloudMessaging = 0;
            return 0;
        }
        int CatchingFishEspressoMockk = CatchingFishEspressoMockk();
        this.CatchingFishCloudMessaging = CatchingFishEspressoMockk;
        if ((CatchingFishEspressoMockk >>> 3) != 0) {
            return CatchingFishEspressoMockk;
        }
        throw new CatchingFishKtorMVPAndroidX("Protocol message contained an invalid tag (zero).");
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final long CatchingFishCardViewView() {
        return CatchingFishDagger();
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final CatchingFishCameraXRealm CatchingFishCloudMessaging() {
        int CatchingFishEspressoMockk = CatchingFishEspressoMockk();
        int i = this.CatchingFishViewModelFAB;
        int i2 = this.CatchingFishFragmentHandler;
        int i3 = i - i2;
        byte[] bArr = this.CatchingFishViewModelScope;
        if (CatchingFishEspressoMockk <= i3 && CatchingFishEspressoMockk > 0) {
            CatchingFishCameraXRealm CatchingFishCoroutine = CatchingFishCameraXRealm.CatchingFishCoroutine(bArr, i2, CatchingFishEspressoMockk);
            this.CatchingFishFragmentHandler += CatchingFishEspressoMockk;
            return CatchingFishCoroutine;
        }
        if (CatchingFishEspressoMockk == 0) {
            return CatchingFishCameraXRealm.CatchingFishWorkManager;
        }
        if (CatchingFishEspressoMockk < 0) {
            throw CatchingFishKtorMVPAndroidX.CatchingFishReduxKtor();
        }
        byte[] CatchingFishMutableLiveData = CatchingFishMutableLiveData(CatchingFishEspressoMockk);
        if (CatchingFishMutableLiveData != null) {
            return CatchingFishCameraXRealm.CatchingFishCoroutine(CatchingFishMutableLiveData, 0, CatchingFishMutableLiveData.length);
        }
        int i4 = this.CatchingFishFragmentHandler;
        int i5 = this.CatchingFishViewModelFAB;
        int i6 = i5 - i4;
        this.CatchingFishEspressoTesting += i5;
        this.CatchingFishFragmentHandler = 0;
        this.CatchingFishViewModelFAB = 0;
        ArrayList CatchingFishJobScheduler = CatchingFishJobScheduler(CatchingFishEspressoMockk - i6);
        byte[] bArr2 = new byte[CatchingFishEspressoMockk];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        int size = CatchingFishJobScheduler.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = CatchingFishJobScheduler.get(i7);
            i7++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
            i6 += bArr3.length;
        }
        CatchingFishCameraXRealm catchingFishCameraXRealm = CatchingFishCameraXRealm.CatchingFishWorkManager;
        return new CatchingFishCameraXRealm(bArr2);
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final boolean CatchingFishCoroutine() {
        return this.CatchingFishFragmentHandler == this.CatchingFishViewModelFAB && !CatchingFishMotionLayout(1);
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final long CatchingFishCoroutineFlow() {
        return CatchingFishSensorManager();
    }

    public final long CatchingFishDagger() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.CatchingFishFragmentHandler;
        int i2 = this.CatchingFishViewModelFAB;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.CatchingFishViewModelScope;
            byte b = bArr[i];
            if (b >= 0) {
                this.CatchingFishFragmentHandler = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.CatchingFishFragmentHandler = i4;
                return j;
            }
        }
        return CatchingFishCameraXIntent();
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final int CatchingFishDaggerHiltFAB() {
        int CatchingFishEspressoMockk = CatchingFishEspressoMockk();
        return (-(CatchingFishEspressoMockk & 1)) ^ (CatchingFishEspressoMockk >>> 1);
    }

    public final int CatchingFishEspressoMockk() {
        int i;
        int i2 = this.CatchingFishFragmentHandler;
        int i3 = this.CatchingFishViewModelFAB;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.CatchingFishViewModelScope;
            byte b = bArr[i2];
            if (b >= 0) {
                this.CatchingFishFragmentHandler = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.CatchingFishFragmentHandler = i5;
                return i;
            }
        }
        return (int) CatchingFishCameraXIntent();
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final double CatchingFishEspressoTesting() {
        return Double.longBitsToDouble(CatchingFishSensorManager());
    }

    public final byte[] CatchingFishFragmentFactory(int i) {
        byte[] CatchingFishMutableLiveData = CatchingFishMutableLiveData(i);
        if (CatchingFishMutableLiveData != null) {
            return CatchingFishMutableLiveData;
        }
        int i2 = this.CatchingFishFragmentHandler;
        int i3 = this.CatchingFishViewModelFAB;
        int i4 = i3 - i2;
        this.CatchingFishEspressoTesting += i3;
        this.CatchingFishFragmentHandler = 0;
        this.CatchingFishViewModelFAB = 0;
        ArrayList CatchingFishJobScheduler = CatchingFishJobScheduler(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.CatchingFishViewModelScope, i2, bArr, 0, i4);
        int size = CatchingFishJobScheduler.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = CatchingFishJobScheduler.get(i5);
            i5++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final boolean CatchingFishFragmentHandler() {
        return CatchingFishDagger() != 0;
    }

    public final void CatchingFishGradleManifest(int i) {
        int i2 = this.CatchingFishViewModelFAB;
        int i3 = this.CatchingFishFragmentHandler;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.CatchingFishFragmentHandler = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.CatchingFishWorkManager;
        if (i < 0) {
            throw CatchingFishKtorMVPAndroidX.CatchingFishReduxKtor();
        }
        int i5 = this.CatchingFishEspressoTesting;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.CatchingFishOkHttp;
        if (i7 > i8) {
            CatchingFishGradleManifest((i8 - i5) - i3);
            throw CatchingFishKtorMVPAndroidX.CatchingFishDaggerWebsocket();
        }
        this.CatchingFishEspressoTesting = i6;
        this.CatchingFishViewModelFAB = 0;
        this.CatchingFishFragmentHandler = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long skip = fileInputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i4 += (int) skip;
                    }
                } catch (CatchingFishKtorMVPAndroidX e) {
                    e.CatchingFishReduxKtor = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.CatchingFishEspressoTesting += i4;
                CatchingFishHandler();
                throw th;
            }
        }
        this.CatchingFishEspressoTesting += i4;
        CatchingFishHandler();
        if (i4 >= i) {
            return;
        }
        int i9 = this.CatchingFishViewModelFAB;
        int i10 = i9 - this.CatchingFishFragmentHandler;
        this.CatchingFishFragmentHandler = i9;
        CatchingFishPayPalLiveData(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.CatchingFishViewModelFAB;
            if (i11 <= i12) {
                this.CatchingFishFragmentHandler = i11;
                return;
            } else {
                i10 += i12;
                this.CatchingFishFragmentHandler = i12;
                CatchingFishPayPalLiveData(1);
            }
        }
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final String CatchingFishGsonAppCompat() {
        int CatchingFishEspressoMockk = CatchingFishEspressoMockk();
        int i = this.CatchingFishFragmentHandler;
        int i2 = this.CatchingFishViewModelFAB;
        int i3 = i2 - i;
        byte[] bArr = this.CatchingFishViewModelScope;
        if (CatchingFishEspressoMockk <= i3 && CatchingFishEspressoMockk > 0) {
            this.CatchingFishFragmentHandler = i + CatchingFishEspressoMockk;
        } else {
            if (CatchingFishEspressoMockk == 0) {
                return "";
            }
            if (CatchingFishEspressoMockk < 0) {
                throw CatchingFishKtorMVPAndroidX.CatchingFishReduxKtor();
            }
            i = 0;
            if (CatchingFishEspressoMockk <= i2) {
                CatchingFishPayPalLiveData(CatchingFishEspressoMockk);
                this.CatchingFishFragmentHandler = CatchingFishEspressoMockk;
            } else {
                bArr = CatchingFishFragmentFactory(CatchingFishEspressoMockk);
            }
        }
        return CatchingFishFABGraphQLFAB.CatchingFishParcelableFAB.CatchingFishUnitTesting(bArr, i, CatchingFishEspressoMockk);
    }

    public final void CatchingFishHandler() {
        int i = this.CatchingFishViewModelFAB + this.CatchingFishLayout;
        this.CatchingFishViewModelFAB = i;
        int i2 = this.CatchingFishEspressoTesting + i;
        int i3 = this.CatchingFishOkHttp;
        if (i2 <= i3) {
            this.CatchingFishLayout = 0;
            return;
        }
        int i4 = i2 - i3;
        this.CatchingFishLayout = i4;
        this.CatchingFishViewModelFAB = i - i4;
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final int CatchingFishJetpackCompose() {
        return CatchingFishPayPalService();
    }

    public final ArrayList CatchingFishJobScheduler(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.CatchingFishWorkManager.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw CatchingFishKtorMVPAndroidX.CatchingFishDaggerWebsocket();
                }
                this.CatchingFishEspressoTesting += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final int CatchingFishLayout(int i) {
        if (i < 0) {
            throw CatchingFishKtorMVPAndroidX.CatchingFishReduxKtor();
        }
        int i2 = this.CatchingFishEspressoTesting + this.CatchingFishFragmentHandler + i;
        if (i2 < 0) {
            throw new CatchingFishKtorMVPAndroidX("Failed to parse the message.");
        }
        int i3 = this.CatchingFishOkHttp;
        if (i2 > i3) {
            throw CatchingFishKtorMVPAndroidX.CatchingFishDaggerWebsocket();
        }
        this.CatchingFishOkHttp = i2;
        CatchingFishHandler();
        return i3;
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final boolean CatchingFishMVPRobolectric(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                CatchingFishGradleManifest(8);
                return true;
            }
            if (i2 == 2) {
                CatchingFishGradleManifest(CatchingFishEspressoMockk());
                return true;
            }
            if (i2 == 3) {
                CatchingFishCustomView();
                CatchingFishParcelableFAB(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw CatchingFishKtorMVPAndroidX.CatchingFishSnackbar();
            }
            CatchingFishGradleManifest(4);
            return true;
        }
        int i4 = this.CatchingFishViewModelFAB - this.CatchingFishFragmentHandler;
        byte[] bArr = this.CatchingFishViewModelScope;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.CatchingFishFragmentHandler;
                this.CatchingFishFragmentHandler = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw CatchingFishKtorMVPAndroidX.CatchingFishCoroutine();
        }
        while (i3 < 10) {
            if (this.CatchingFishFragmentHandler == this.CatchingFishViewModelFAB) {
                CatchingFishPayPalLiveData(1);
            }
            int i6 = this.CatchingFishFragmentHandler;
            this.CatchingFishFragmentHandler = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw CatchingFishKtorMVPAndroidX.CatchingFishCoroutine();
        return true;
    }

    public final boolean CatchingFishMotionLayout(int i) {
        FileInputStream fileInputStream = this.CatchingFishWorkManager;
        int i2 = this.CatchingFishFragmentHandler;
        int i3 = i2 + i;
        int i4 = this.CatchingFishViewModelFAB;
        if (i3 <= i4) {
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }
        int i5 = this.CatchingFishEspressoTesting;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.CatchingFishOkHttp) {
            byte[] bArr = this.CatchingFishViewModelScope;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.CatchingFishEspressoTesting += i2;
                this.CatchingFishViewModelFAB -= i2;
                this.CatchingFishFragmentHandler = 0;
            }
            int i6 = this.CatchingFishViewModelFAB;
            try {
                int read = fileInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.CatchingFishEspressoTesting) - i6));
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                }
                if (read > 0) {
                    this.CatchingFishViewModelFAB += read;
                    CatchingFishHandler();
                    if (this.CatchingFishViewModelFAB >= i) {
                        return true;
                    }
                    return CatchingFishMotionLayout(i);
                }
            } catch (CatchingFishKtorMVPAndroidX e) {
                e.CatchingFishReduxKtor = true;
                throw e;
            }
        }
        return false;
    }

    public final byte[] CatchingFishMutableLiveData(int i) {
        if (i == 0) {
            return CatchingFishFirebaseBundle.CatchingFishSnackbar;
        }
        if (i < 0) {
            throw CatchingFishKtorMVPAndroidX.CatchingFishReduxKtor();
        }
        int i2 = this.CatchingFishEspressoTesting;
        int i3 = this.CatchingFishFragmentHandler;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new CatchingFishKtorMVPAndroidX("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.CatchingFishOkHttp;
        if (i4 > i5) {
            CatchingFishGradleManifest((i5 - i2) - i3);
            throw CatchingFishKtorMVPAndroidX.CatchingFishDaggerWebsocket();
        }
        int i6 = this.CatchingFishViewModelFAB - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.CatchingFishWorkManager;
        if (i7 >= 4096) {
            try {
                if (i7 > fileInputStream.available()) {
                    return null;
                }
            } catch (CatchingFishKtorMVPAndroidX e) {
                e.CatchingFishReduxKtor = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.CatchingFishViewModelScope, this.CatchingFishFragmentHandler, bArr, 0, i6);
        this.CatchingFishEspressoTesting += this.CatchingFishViewModelFAB;
        this.CatchingFishFragmentHandler = 0;
        this.CatchingFishViewModelFAB = 0;
        while (i6 < i) {
            try {
                int read = fileInputStream.read(bArr, i6, i - i6);
                if (read == -1) {
                    throw CatchingFishKtorMVPAndroidX.CatchingFishDaggerWebsocket();
                }
                this.CatchingFishEspressoTesting += read;
                i6 += read;
            } catch (CatchingFishKtorMVPAndroidX e2) {
                e2.CatchingFishReduxKtor = true;
                throw e2;
            }
        }
        return bArr;
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final int CatchingFishNavigation() {
        return CatchingFishEspressoMockk();
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final int CatchingFishOkHttp() {
        return CatchingFishEspressoMockk();
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final void CatchingFishParcelableFAB(int i) {
        if (this.CatchingFishCloudMessaging != i) {
            throw new CatchingFishKtorMVPAndroidX("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final String CatchingFishParcelableFlux() {
        int CatchingFishEspressoMockk = CatchingFishEspressoMockk();
        byte[] bArr = this.CatchingFishViewModelScope;
        if (CatchingFishEspressoMockk > 0) {
            int i = this.CatchingFishViewModelFAB;
            int i2 = this.CatchingFishFragmentHandler;
            if (CatchingFishEspressoMockk <= i - i2) {
                String str = new String(bArr, i2, CatchingFishEspressoMockk, CatchingFishFirebaseBundle.CatchingFishParcelableFAB);
                this.CatchingFishFragmentHandler += CatchingFishEspressoMockk;
                return str;
            }
        }
        if (CatchingFishEspressoMockk == 0) {
            return "";
        }
        if (CatchingFishEspressoMockk < 0) {
            throw CatchingFishKtorMVPAndroidX.CatchingFishReduxKtor();
        }
        if (CatchingFishEspressoMockk > this.CatchingFishViewModelFAB) {
            return new String(CatchingFishFragmentFactory(CatchingFishEspressoMockk), CatchingFishFirebaseBundle.CatchingFishParcelableFAB);
        }
        CatchingFishPayPalLiveData(CatchingFishEspressoMockk);
        String str2 = new String(bArr, this.CatchingFishFragmentHandler, CatchingFishEspressoMockk, CatchingFishFirebaseBundle.CatchingFishParcelableFAB);
        this.CatchingFishFragmentHandler += CatchingFishEspressoMockk;
        return str2;
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final int CatchingFishPayPal() {
        return CatchingFishEspressoMockk();
    }

    public final void CatchingFishPayPalLiveData(int i) {
        if (CatchingFishMotionLayout(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.CatchingFishEspressoTesting) - this.CatchingFishFragmentHandler) {
            throw CatchingFishKtorMVPAndroidX.CatchingFishDaggerWebsocket();
        }
        throw new CatchingFishKtorMVPAndroidX("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final int CatchingFishPayPalService() {
        int i = this.CatchingFishFragmentHandler;
        if (this.CatchingFishViewModelFAB - i < 4) {
            CatchingFishPayPalLiveData(4);
            i = this.CatchingFishFragmentHandler;
        }
        this.CatchingFishFragmentHandler = i + 4;
        byte[] bArr = this.CatchingFishViewModelScope;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final float CatchingFishRoomDatabase() {
        return Float.intBitsToFloat(CatchingFishPayPalService());
    }

    public final long CatchingFishSensorManager() {
        int i = this.CatchingFishFragmentHandler;
        if (this.CatchingFishViewModelFAB - i < 8) {
            CatchingFishPayPalLiveData(8);
            i = this.CatchingFishFragmentHandler;
        }
        this.CatchingFishFragmentHandler = i + 8;
        byte[] bArr = this.CatchingFishViewModelScope;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final int CatchingFishSnackbar() {
        return this.CatchingFishEspressoTesting + this.CatchingFishFragmentHandler;
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final long CatchingFishSpannableWidget() {
        long CatchingFishDagger = CatchingFishDagger();
        return (-(CatchingFishDagger & 1)) ^ (CatchingFishDagger >>> 1);
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final int CatchingFishUnitTesting() {
        return CatchingFishPayPalService();
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final void CatchingFishViewModelFAB(int i) {
        this.CatchingFishOkHttp = i;
        CatchingFishHandler();
    }
}
