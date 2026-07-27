package kotlin.text;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishFABBundle extends CatchingFishReduxLayout {
    public int CatchingFishCloudMessaging;
    public int CatchingFishEspressoTesting = Integer.MAX_VALUE;
    public final int CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public int CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public final byte[] CatchingFishWorkManager;

    public CatchingFishFABBundle(byte[] bArr, int i, int i2, boolean z) {
        this.CatchingFishWorkManager = bArr;
        this.CatchingFishViewModelScope = i2 + i;
        this.CatchingFishLayout = i;
        this.CatchingFishFragmentHandler = i;
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final long CatchingFish() {
        return CatchingFishPayPalService();
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final long CatchingFishAnimationMockk() {
        return CatchingFishMutableLiveData();
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final int CatchingFishCardViewRealm() {
        if (CatchingFishCoroutine()) {
            this.CatchingFishCloudMessaging = 0;
            return 0;
        }
        int CatchingFishJobScheduler = CatchingFishJobScheduler();
        this.CatchingFishCloudMessaging = CatchingFishJobScheduler;
        if ((CatchingFishJobScheduler >>> 3) != 0) {
            return CatchingFishJobScheduler;
        }
        throw new CatchingFishKtorMVPAndroidX("Protocol message contained an invalid tag (zero).");
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final long CatchingFishCardViewView() {
        return CatchingFishPayPalService();
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final CatchingFishCameraXRealm CatchingFishCloudMessaging() {
        byte[] bArr;
        int CatchingFishJobScheduler = CatchingFishJobScheduler();
        byte[] bArr2 = this.CatchingFishWorkManager;
        if (CatchingFishJobScheduler > 0) {
            int i = this.CatchingFishViewModelScope;
            int i2 = this.CatchingFishLayout;
            if (CatchingFishJobScheduler <= i - i2) {
                CatchingFishCameraXRealm CatchingFishCoroutine = CatchingFishCameraXRealm.CatchingFishCoroutine(bArr2, i2, CatchingFishJobScheduler);
                this.CatchingFishLayout += CatchingFishJobScheduler;
                return CatchingFishCoroutine;
            }
        }
        if (CatchingFishJobScheduler == 0) {
            return CatchingFishCameraXRealm.CatchingFishWorkManager;
        }
        if (CatchingFishJobScheduler > 0) {
            int i3 = this.CatchingFishViewModelScope;
            int i4 = this.CatchingFishLayout;
            if (CatchingFishJobScheduler <= i3 - i4) {
                int i5 = CatchingFishJobScheduler + i4;
                this.CatchingFishLayout = i5;
                bArr = Arrays.copyOfRange(bArr2, i4, i5);
                CatchingFishCameraXRealm catchingFishCameraXRealm = CatchingFishCameraXRealm.CatchingFishWorkManager;
                return new CatchingFishCameraXRealm(bArr);
            }
        }
        if (CatchingFishJobScheduler > 0) {
            throw CatchingFishKtorMVPAndroidX.CatchingFishDaggerWebsocket();
        }
        if (CatchingFishJobScheduler != 0) {
            throw CatchingFishKtorMVPAndroidX.CatchingFishReduxKtor();
        }
        bArr = CatchingFishFirebaseBundle.CatchingFishSnackbar;
        CatchingFishCameraXRealm catchingFishCameraXRealm2 = CatchingFishCameraXRealm.CatchingFishWorkManager;
        return new CatchingFishCameraXRealm(bArr);
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final boolean CatchingFishCoroutine() {
        return this.CatchingFishLayout == this.CatchingFishViewModelScope;
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final long CatchingFishCoroutineFlow() {
        return CatchingFishMutableLiveData();
    }

    public final void CatchingFishDagger(int i) {
        if (i >= 0) {
            int i2 = this.CatchingFishViewModelScope;
            int i3 = this.CatchingFishLayout;
            if (i <= i2 - i3) {
                this.CatchingFishLayout = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw CatchingFishKtorMVPAndroidX.CatchingFishDaggerWebsocket();
        }
        throw CatchingFishKtorMVPAndroidX.CatchingFishReduxKtor();
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final int CatchingFishDaggerHiltFAB() {
        int CatchingFishJobScheduler = CatchingFishJobScheduler();
        return (-(CatchingFishJobScheduler & 1)) ^ (CatchingFishJobScheduler >>> 1);
    }

    public final void CatchingFishEspressoMockk() {
        int i = this.CatchingFishViewModelScope + this.CatchingFishViewModelFAB;
        this.CatchingFishViewModelScope = i;
        int i2 = i - this.CatchingFishFragmentHandler;
        int i3 = this.CatchingFishEspressoTesting;
        if (i2 <= i3) {
            this.CatchingFishViewModelFAB = 0;
            return;
        }
        int i4 = i2 - i3;
        this.CatchingFishViewModelFAB = i4;
        this.CatchingFishViewModelScope = i - i4;
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final double CatchingFishEspressoTesting() {
        return Double.longBitsToDouble(CatchingFishMutableLiveData());
    }

    public final int CatchingFishFragmentFactory() {
        int i = this.CatchingFishLayout;
        if (this.CatchingFishViewModelScope - i < 4) {
            throw CatchingFishKtorMVPAndroidX.CatchingFishDaggerWebsocket();
        }
        this.CatchingFishLayout = i + 4;
        byte[] bArr = this.CatchingFishWorkManager;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final boolean CatchingFishFragmentHandler() {
        return CatchingFishPayPalService() != 0;
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final String CatchingFishGsonAppCompat() {
        int CatchingFishJobScheduler = CatchingFishJobScheduler();
        if (CatchingFishJobScheduler > 0) {
            int i = this.CatchingFishViewModelScope;
            int i2 = this.CatchingFishLayout;
            if (CatchingFishJobScheduler <= i - i2) {
                String CatchingFishUnitTesting = CatchingFishFABGraphQLFAB.CatchingFishParcelableFAB.CatchingFishUnitTesting(this.CatchingFishWorkManager, i2, CatchingFishJobScheduler);
                this.CatchingFishLayout += CatchingFishJobScheduler;
                return CatchingFishUnitTesting;
            }
        }
        if (CatchingFishJobScheduler == 0) {
            return "";
        }
        if (CatchingFishJobScheduler <= 0) {
            throw CatchingFishKtorMVPAndroidX.CatchingFishReduxKtor();
        }
        throw CatchingFishKtorMVPAndroidX.CatchingFishDaggerWebsocket();
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final int CatchingFishJetpackCompose() {
        return CatchingFishFragmentFactory();
    }

    public final int CatchingFishJobScheduler() {
        int i;
        int i2 = this.CatchingFishLayout;
        int i3 = this.CatchingFishViewModelScope;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.CatchingFishWorkManager;
            byte b = bArr[i2];
            if (b >= 0) {
                this.CatchingFishLayout = i4;
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
                this.CatchingFishLayout = i5;
                return i;
            }
        }
        return (int) CatchingFishSensorManager();
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final int CatchingFishLayout(int i) {
        if (i < 0) {
            throw CatchingFishKtorMVPAndroidX.CatchingFishReduxKtor();
        }
        int CatchingFishSnackbar = CatchingFishSnackbar() + i;
        if (CatchingFishSnackbar < 0) {
            throw new CatchingFishKtorMVPAndroidX("Failed to parse the message.");
        }
        int i2 = this.CatchingFishEspressoTesting;
        if (CatchingFishSnackbar > i2) {
            throw CatchingFishKtorMVPAndroidX.CatchingFishDaggerWebsocket();
        }
        this.CatchingFishEspressoTesting = CatchingFishSnackbar;
        CatchingFishEspressoMockk();
        return i2;
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final boolean CatchingFishMVPRobolectric(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                CatchingFishDagger(8);
                return true;
            }
            if (i2 == 2) {
                CatchingFishDagger(CatchingFishJobScheduler());
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
            CatchingFishDagger(4);
            return true;
        }
        int i4 = this.CatchingFishViewModelScope - this.CatchingFishLayout;
        byte[] bArr = this.CatchingFishWorkManager;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.CatchingFishLayout;
                this.CatchingFishLayout = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw CatchingFishKtorMVPAndroidX.CatchingFishCoroutine();
        }
        while (i3 < 10) {
            int i6 = this.CatchingFishLayout;
            if (i6 == this.CatchingFishViewModelScope) {
                throw CatchingFishKtorMVPAndroidX.CatchingFishDaggerWebsocket();
            }
            this.CatchingFishLayout = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw CatchingFishKtorMVPAndroidX.CatchingFishCoroutine();
        return true;
    }

    public final long CatchingFishMutableLiveData() {
        int i = this.CatchingFishLayout;
        if (this.CatchingFishViewModelScope - i < 8) {
            throw CatchingFishKtorMVPAndroidX.CatchingFishDaggerWebsocket();
        }
        this.CatchingFishLayout = i + 8;
        byte[] bArr = this.CatchingFishWorkManager;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final int CatchingFishNavigation() {
        return CatchingFishJobScheduler();
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final int CatchingFishOkHttp() {
        return CatchingFishJobScheduler();
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final void CatchingFishParcelableFAB(int i) {
        if (this.CatchingFishCloudMessaging != i) {
            throw new CatchingFishKtorMVPAndroidX("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final String CatchingFishParcelableFlux() {
        int CatchingFishJobScheduler = CatchingFishJobScheduler();
        if (CatchingFishJobScheduler > 0) {
            int i = this.CatchingFishViewModelScope;
            int i2 = this.CatchingFishLayout;
            if (CatchingFishJobScheduler <= i - i2) {
                String str = new String(this.CatchingFishWorkManager, i2, CatchingFishJobScheduler, CatchingFishFirebaseBundle.CatchingFishParcelableFAB);
                this.CatchingFishLayout += CatchingFishJobScheduler;
                return str;
            }
        }
        if (CatchingFishJobScheduler == 0) {
            return "";
        }
        if (CatchingFishJobScheduler < 0) {
            throw CatchingFishKtorMVPAndroidX.CatchingFishReduxKtor();
        }
        throw CatchingFishKtorMVPAndroidX.CatchingFishDaggerWebsocket();
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final int CatchingFishPayPal() {
        return CatchingFishJobScheduler();
    }

    public final long CatchingFishPayPalService() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.CatchingFishLayout;
        int i2 = this.CatchingFishViewModelScope;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.CatchingFishWorkManager;
            byte b = bArr[i];
            if (b >= 0) {
                this.CatchingFishLayout = i3;
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
                this.CatchingFishLayout = i4;
                return j;
            }
        }
        return CatchingFishSensorManager();
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final float CatchingFishRoomDatabase() {
        return Float.intBitsToFloat(CatchingFishFragmentFactory());
    }

    public final long CatchingFishSensorManager() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.CatchingFishLayout;
            if (i2 == this.CatchingFishViewModelScope) {
                throw CatchingFishKtorMVPAndroidX.CatchingFishDaggerWebsocket();
            }
            this.CatchingFishLayout = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.CatchingFishWorkManager[i2] & 128) == 0) {
                return j;
            }
        }
        throw CatchingFishKtorMVPAndroidX.CatchingFishCoroutine();
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final int CatchingFishSnackbar() {
        return this.CatchingFishLayout - this.CatchingFishFragmentHandler;
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final long CatchingFishSpannableWidget() {
        long CatchingFishPayPalService = CatchingFishPayPalService();
        return (-(CatchingFishPayPalService & 1)) ^ (CatchingFishPayPalService >>> 1);
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final int CatchingFishUnitTesting() {
        return CatchingFishFragmentFactory();
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final void CatchingFishViewModelFAB(int i) {
        this.CatchingFishEspressoTesting = i;
        CatchingFishEspressoMockk();
    }
}
