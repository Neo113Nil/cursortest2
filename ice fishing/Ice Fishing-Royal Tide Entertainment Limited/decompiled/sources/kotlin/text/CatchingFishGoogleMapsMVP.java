package kotlin.text;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class CatchingFishGoogleMapsMVP {
    public CatchingFishLayoutGsonRoom CatchingFish;
    public int CatchingFishAnimationMockk;
    public int CatchingFishCloudMessaging;
    public Object[] CatchingFishCoroutine;
    public int CatchingFishCoroutineFlow;
    public int CatchingFishDaggerHiltFAB;
    public HashMap CatchingFishDaggerWebsocket;
    public int CatchingFishEspressoTesting;
    public int CatchingFishFragmentHandler;
    public int CatchingFishJetpackCompose;
    public int CatchingFishLayout;
    public final CatchingFishWidgetToolbar CatchingFishNavigation;
    public int CatchingFishOkHttp;
    public final CatchingFishMVVMMVIRoom CatchingFishParcelableFAB;
    public CatchingFishGsonLayout CatchingFishParcelableFlux;
    public ArrayList CatchingFishReduxKtor;
    public final CatchingFishWidgetToolbar CatchingFishRoomDatabase;
    public int[] CatchingFishSnackbar;
    public boolean CatchingFishSpannableWidget;
    public final CatchingFishWidgetToolbar CatchingFishStateLiveData;
    public int CatchingFishUnitTesting;
    public int CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public CatchingFishLayoutGsonRoom CatchingFishWorkManager;

    public CatchingFishGoogleMapsMVP(CatchingFishMVVMMVIRoom catchingFishMVVMMVIRoom) {
        this.CatchingFishParcelableFAB = catchingFishMVVMMVIRoom;
        int[] iArr = catchingFishMVVMMVIRoom.CatchingFishReduxKtor;
        this.CatchingFishSnackbar = iArr;
        Object[] objArr = catchingFishMVVMMVIRoom.CatchingFishWorkManager;
        this.CatchingFishCoroutine = objArr;
        this.CatchingFishReduxKtor = catchingFishMVVMMVIRoom.CatchingFishEspressoTesting;
        this.CatchingFishDaggerWebsocket = catchingFishMVVMMVIRoom.CatchingFishOkHttp;
        this.CatchingFishWorkManager = catchingFishMVVMMVIRoom.CatchingFishUnitTesting;
        int i = catchingFishMVVMMVIRoom.CatchingFishDaggerWebsocket;
        this.CatchingFishViewModelScope = i;
        this.CatchingFishViewModelFAB = (iArr.length / 5) - i;
        int i2 = catchingFishMVVMMVIRoom.CatchingFishViewModelScope;
        this.CatchingFishCloudMessaging = i2;
        this.CatchingFishEspressoTesting = objArr.length - i2;
        this.CatchingFishOkHttp = i;
        this.CatchingFishStateLiveData = new CatchingFishWidgetToolbar(1, false);
        this.CatchingFishRoomDatabase = new CatchingFishWidgetToolbar(1, false);
        this.CatchingFishNavigation = new CatchingFishWidgetToolbar(1, false);
        this.CatchingFishCoroutineFlow = i;
        this.CatchingFishDaggerHiltFAB = -1;
    }

    public static int CatchingFishLayout(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static void CatchingFishParcelableFlux(CatchingFishGoogleMapsMVP catchingFishGoogleMapsMVP) {
        int i = catchingFishGoogleMapsMVP.CatchingFishDaggerHiltFAB;
        int CatchingFishRoomDatabase = catchingFishGoogleMapsMVP.CatchingFishRoomDatabase(i);
        int[] iArr = catchingFishGoogleMapsMVP.CatchingFishSnackbar;
        int i2 = (CatchingFishRoomDatabase * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        catchingFishGoogleMapsMVP.CatchingFishParcelable(catchingFishGoogleMapsMVP.CatchingFishMVPRobolectric(iArr, i));
    }

    public final int CatchingFish(int i) {
        return CatchingFishMockkKtorGlide.CatchingFishParcelableFAB(this.CatchingFishSnackbar, CatchingFishRoomDatabase(i));
    }

    public final int CatchingFishAnimationMockk() {
        return CatchingFishUnitTesting() - this.CatchingFishViewModelFAB;
    }

    public final int CatchingFishCameraXIntent(int[] iArr, int i) {
        if (i >= CatchingFishUnitTesting()) {
            return this.CatchingFishCoroutine.length - this.CatchingFishEspressoTesting;
        }
        int CatchingFishCoroutine = CatchingFishMockkKtorGlide.CatchingFishCoroutine(iArr, i);
        return CatchingFishCoroutine < 0 ? (this.CatchingFishCoroutine.length - this.CatchingFishEspressoTesting) + CatchingFishCoroutine + 1 : CatchingFishCoroutine;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r2 = r8.CatchingFishSnackbar;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        kotlin.text.CatchingFishMVVMHilt.CatchingFishParcelable(r4 + r3, r3, r5, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        kotlin.text.CatchingFishMVVMHilt.CatchingFishParcelable(r5, r5 + r4, r3 + r4, r2, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishCardViewRealm(int i) {
        CatchingFishMockkPicasso catchingFishMockkPicasso;
        int i2;
        CatchingFishMockkPicasso catchingFishMockkPicasso2;
        int i3;
        int i4;
        int i5 = this.CatchingFishViewModelFAB;
        int i6 = this.CatchingFishViewModelScope;
        if (i6 != i) {
            if (!this.CatchingFishReduxKtor.isEmpty()) {
                int CatchingFishUnitTesting = CatchingFishUnitTesting() - this.CatchingFishViewModelFAB;
                if (i6 < i) {
                    for (int CatchingFishSnackbar = CatchingFishMockkKtorGlide.CatchingFishSnackbar(this.CatchingFishReduxKtor, i6, CatchingFishUnitTesting); CatchingFishSnackbar < this.CatchingFishReduxKtor.size() && (i3 = (catchingFishMockkPicasso2 = (CatchingFishMockkPicasso) this.CatchingFishReduxKtor.get(CatchingFishSnackbar)).CatchingFishParcelableFAB) < 0 && (i4 = i3 + CatchingFishUnitTesting) < i; CatchingFishSnackbar++) {
                        catchingFishMockkPicasso2.CatchingFishParcelableFAB = i4;
                    }
                } else {
                    for (int CatchingFishSnackbar2 = CatchingFishMockkKtorGlide.CatchingFishSnackbar(this.CatchingFishReduxKtor, i, CatchingFishUnitTesting); CatchingFishSnackbar2 < this.CatchingFishReduxKtor.size() && (i2 = (catchingFishMockkPicasso = (CatchingFishMockkPicasso) this.CatchingFishReduxKtor.get(CatchingFishSnackbar2)).CatchingFishParcelableFAB) >= 0; CatchingFishSnackbar2++) {
                        catchingFishMockkPicasso.CatchingFishParcelableFAB = -(CatchingFishUnitTesting - i2);
                    }
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int CatchingFishUnitTesting2 = CatchingFishUnitTesting();
            if (i6 >= CatchingFishUnitTesting2) {
                CatchingFishUnitTestingFlux.CatchingFishCoroutine("Check failed");
            }
            while (i6 < CatchingFishUnitTesting2) {
                int i7 = (i6 * 5) + 2;
                int i8 = this.CatchingFishSnackbar[i7];
                int CatchingFishAnimationMockk = i8 > -2 ? i8 : (CatchingFishAnimationMockk() + i8) - (-2);
                if (CatchingFishAnimationMockk >= i) {
                    CatchingFishAnimationMockk = -((CatchingFishAnimationMockk() - CatchingFishAnimationMockk) - (-2));
                }
                if (CatchingFishAnimationMockk != i8) {
                    this.CatchingFishSnackbar[i7] = CatchingFishAnimationMockk;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.CatchingFishViewModelScope = i;
    }

    public final Object CatchingFishCardViewView(int i) {
        int CatchingFishRoomDatabase = CatchingFishRoomDatabase(i);
        int[] iArr = this.CatchingFishSnackbar;
        if ((iArr[(CatchingFishRoomDatabase * 5) + 1] & 1073741824) != 0) {
            return this.CatchingFishCoroutine[CatchingFishViewModelFAB(CatchingFishViewModelScope(iArr, CatchingFishRoomDatabase))];
        }
        return null;
    }

    public final void CatchingFishCloudMessaging() {
        if (this.CatchingFishUnitTesting <= 0) {
            CatchingFishMVPAndroidXKtor.CatchingFishSnackbar("Unbalanced begin/end insert");
        }
        int i = this.CatchingFishUnitTesting - 1;
        this.CatchingFishUnitTesting = i;
        if (i == 0) {
            if (this.CatchingFishNavigation.CatchingFishSnackbar != this.CatchingFishStateLiveData.CatchingFishSnackbar) {
                CatchingFishUnitTestingFlux.CatchingFishCoroutine("startGroup/endGroup mismatch while inserting");
            }
            this.CatchingFishCoroutineFlow = (CatchingFishUnitTesting() - this.CatchingFishViewModelFAB) - this.CatchingFishRoomDatabase.CatchingFishCoroutine();
        }
    }

    public final int CatchingFishCoroutine(CatchingFishMockkPicasso catchingFishMockkPicasso) {
        int i = catchingFishMockkPicasso.CatchingFishParcelableFAB;
        return i < 0 ? CatchingFishAnimationMockk() + i : i;
    }

    public final void CatchingFishCoroutineFlow(int i) {
        if (i > 0) {
            int i2 = this.CatchingFishJetpackCompose;
            CatchingFishCardViewRealm(i2);
            int i3 = this.CatchingFishViewModelScope;
            int i4 = this.CatchingFishViewModelFAB;
            int[] iArr = this.CatchingFishSnackbar;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                CatchingFishMVVMHilt.CatchingFishParcelable(0, 0, i3 * 5, iArr, iArr2);
                CatchingFishMVVMHilt.CatchingFishParcelable((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.CatchingFishSnackbar = iArr2;
                i4 = i6;
            }
            int i7 = this.CatchingFishCoroutineFlow;
            if (i7 >= i3) {
                this.CatchingFishCoroutineFlow = i7 + i;
            }
            int i8 = i3 + i;
            this.CatchingFishViewModelScope = i8;
            this.CatchingFishViewModelFAB = i4 - i;
            int CatchingFishLayout = CatchingFishLayout(i5 > 0 ? CatchingFishWorkManager(i2 + i) : 0, this.CatchingFishOkHttp >= i3 ? this.CatchingFishCloudMessaging : 0, this.CatchingFishEspressoTesting, this.CatchingFishCoroutine.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.CatchingFishSnackbar[(i9 * 5) + 4] = CatchingFishLayout;
            }
            int i10 = this.CatchingFishOkHttp;
            if (i10 >= i3) {
                this.CatchingFishOkHttp = i10 + i;
            }
        }
    }

    public final Object CatchingFishCustomView(Object obj) {
        if (this.CatchingFishUnitTesting > 0) {
            CatchingFishDaggerHiltFAB(1, this.CatchingFishDaggerHiltFAB);
        }
        Object[] objArr = this.CatchingFishCoroutine;
        int i = this.CatchingFishLayout;
        this.CatchingFishLayout = i + 1;
        Object obj2 = objArr[CatchingFishViewModelFAB(i)];
        if (this.CatchingFishLayout > this.CatchingFishFragmentHandler) {
            CatchingFishUnitTestingFlux.CatchingFishCoroutine("Writing to an invalid slot");
        }
        this.CatchingFishCoroutine[CatchingFishViewModelFAB(this.CatchingFishLayout - 1)] = obj;
        return obj2;
    }

    public final void CatchingFishDagger() {
        int i = this.CatchingFishCoroutineFlow;
        this.CatchingFishJetpackCompose = i;
        this.CatchingFishLayout = CatchingFishViewModelScope(this.CatchingFishSnackbar, CatchingFishRoomDatabase(i));
    }

    public final void CatchingFishDaggerHiltFAB(int i, int i2) {
        if (i > 0) {
            CatchingFishPayPal(this.CatchingFishLayout, i2);
            int i3 = this.CatchingFishCloudMessaging;
            int i4 = this.CatchingFishEspressoTesting;
            if (i4 < i) {
                Object[] objArr = this.CatchingFishCoroutine;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.CatchingFishCoroutine = objArr2;
                i4 = i7;
            }
            int i9 = this.CatchingFishFragmentHandler;
            if (i9 >= i3) {
                this.CatchingFishFragmentHandler = i9 + i;
            }
            this.CatchingFishCloudMessaging = i3 + i;
            this.CatchingFishEspressoTesting = i4 - i;
        }
    }

    public final void CatchingFishDaggerWebsocket(boolean z) {
        this.CatchingFishSpannableWidget = true;
        if (z && this.CatchingFishStateLiveData.CatchingFishSnackbar == 0) {
            CatchingFishCardViewRealm(CatchingFishAnimationMockk());
            CatchingFishPayPal(this.CatchingFishCoroutine.length - this.CatchingFishEspressoTesting, this.CatchingFishViewModelScope);
            int i = this.CatchingFishCloudMessaging;
            CatchingFishMVVMHilt.CatchingFishAnimation(this.CatchingFishCoroutine, i, this.CatchingFishEspressoTesting + i);
            CatchingFishFragmentFactory();
        }
        int[] iArr = this.CatchingFishSnackbar;
        int i2 = this.CatchingFishViewModelScope;
        Object[] objArr = this.CatchingFishCoroutine;
        int i3 = this.CatchingFishCloudMessaging;
        ArrayList arrayList = this.CatchingFishReduxKtor;
        HashMap hashMap = this.CatchingFishDaggerWebsocket;
        CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom = this.CatchingFishWorkManager;
        CatchingFishMVVMMVIRoom catchingFishMVVMMVIRoom = this.CatchingFishParcelableFAB;
        if (!catchingFishMVVMMVIRoom.CatchingFishFragmentHandler) {
            CatchingFishMVPAndroidXKtor.CatchingFishParcelableFAB("Unexpected writer close()");
        }
        catchingFishMVVMMVIRoom.CatchingFishFragmentHandler = false;
        catchingFishMVVMMVIRoom.CatchingFishReduxKtor = iArr;
        catchingFishMVVMMVIRoom.CatchingFishDaggerWebsocket = i2;
        catchingFishMVVMMVIRoom.CatchingFishWorkManager = objArr;
        catchingFishMVVMMVIRoom.CatchingFishViewModelScope = i3;
        catchingFishMVVMMVIRoom.CatchingFishEspressoTesting = arrayList;
        catchingFishMVVMMVIRoom.CatchingFishOkHttp = hashMap;
        catchingFishMVVMMVIRoom.CatchingFishUnitTesting = catchingFishLayoutGsonRoom;
    }

    public final int CatchingFishEspressoMockk() {
        int CatchingFishRoomDatabase = CatchingFishRoomDatabase(this.CatchingFishJetpackCompose);
        int CatchingFishParcelableFAB = CatchingFishMockkKtorGlide.CatchingFishParcelableFAB(this.CatchingFishSnackbar, CatchingFishRoomDatabase) + this.CatchingFishJetpackCompose;
        this.CatchingFishJetpackCompose = CatchingFishParcelableFAB;
        this.CatchingFishLayout = CatchingFishViewModelScope(this.CatchingFishSnackbar, CatchingFishRoomDatabase(CatchingFishParcelableFAB));
        int i = this.CatchingFishSnackbar[(CatchingFishRoomDatabase * 5) + 1];
        if ((1073741824 & i) != 0) {
            return 1;
        }
        return i & 67108863;
    }

    public final void CatchingFishEspressoTesting(int i) {
        boolean z = false;
        if (!(this.CatchingFishUnitTesting <= 0)) {
            CatchingFishUnitTestingFlux.CatchingFishCoroutine("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.CatchingFishDaggerHiltFAB;
        if (i2 != i) {
            if (i >= i2 && i < this.CatchingFishCoroutineFlow) {
                z = true;
            }
            if (!z) {
                CatchingFishUnitTestingFlux.CatchingFishCoroutine("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.CatchingFishJetpackCompose;
            int i4 = this.CatchingFishLayout;
            int i5 = this.CatchingFishFragmentHandler;
            this.CatchingFishJetpackCompose = i;
            CatchingFishPayPalLiveData();
            this.CatchingFishJetpackCompose = i3;
            this.CatchingFishLayout = i4;
            this.CatchingFishFragmentHandler = i5;
        }
    }

    public final void CatchingFishFragmentFactory() {
        int i;
        CatchingFishGsonLayout catchingFishGsonLayout = this.CatchingFishParcelableFlux;
        if (catchingFishGsonLayout != null) {
            while (catchingFishGsonLayout.CatchingFishSnackbar != 0) {
                int CatchingFishMotionLayout = CatchingFishDaggerBiometric.CatchingFishMotionLayout(catchingFishGsonLayout);
                int CatchingFishRoomDatabase = CatchingFishRoomDatabase(CatchingFishMotionLayout);
                int i2 = CatchingFishMotionLayout + 1;
                int CatchingFish = CatchingFish(CatchingFishMotionLayout) + CatchingFishMotionLayout;
                while (true) {
                    if (i2 >= CatchingFish) {
                        i = 0;
                        break;
                    } else {
                        if ((this.CatchingFishSnackbar[(CatchingFishRoomDatabase(i2) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        i2 += CatchingFish(i2);
                    }
                }
                int[] iArr = this.CatchingFishSnackbar;
                int i3 = (CatchingFishRoomDatabase * 5) + 1;
                int i4 = iArr[i3];
                if (((67108864 & i4) != 0 ? 1 : 0) != i) {
                    iArr[i3] = (i << 26) | ((-67108865) & i4);
                    int CatchingFishMVPRobolectric = CatchingFishMVPRobolectric(iArr, CatchingFishMotionLayout);
                    if (CatchingFishMVPRobolectric >= 0) {
                        CatchingFishDaggerBiometric.CatchingFishCoroutine(catchingFishGsonLayout, CatchingFishMVPRobolectric);
                    }
                }
            }
        }
    }

    public final void CatchingFishFragmentHandler() {
        CatchingFishBundleGradle catchingFishBundleGradle;
        boolean z = this.CatchingFishUnitTesting > 0;
        int i = this.CatchingFishJetpackCompose;
        int i2 = this.CatchingFishCoroutineFlow;
        int i3 = this.CatchingFishDaggerHiltFAB;
        int CatchingFishRoomDatabase = CatchingFishRoomDatabase(i3);
        int i4 = this.CatchingFishAnimationMockk;
        int i5 = i - i3;
        int i6 = CatchingFishRoomDatabase * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.CatchingFishSnackbar[i7] & 1073741824) != 0;
        CatchingFishWidgetToolbar catchingFishWidgetToolbar = this.CatchingFishNavigation;
        if (z) {
            CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom = this.CatchingFish;
            if (catchingFishLayoutGsonRoom != null && (catchingFishBundleGradle = (CatchingFishBundleGradle) catchingFishLayoutGsonRoom.CatchingFishSnackbar(i3)) != null) {
                Object[] objArr = catchingFishBundleGradle.CatchingFishParcelableFAB;
                int i8 = catchingFishBundleGradle.CatchingFishSnackbar;
                for (int i9 = 0; i9 < i8; i9++) {
                    CatchingFishCustomView(objArr[i9]);
                }
            }
            int[] iArr = this.CatchingFishSnackbar;
            iArr[i6 + 3] = i5;
            CatchingFishMockkKtorGlide.CatchingFishReduxKtor(CatchingFishRoomDatabase, i4, iArr);
            int CatchingFishCoroutine = catchingFishWidgetToolbar.CatchingFishCoroutine();
            if (z2) {
                i4 = 1;
            }
            this.CatchingFishAnimationMockk = CatchingFishCoroutine + i4;
            int CatchingFishMVPRobolectric = CatchingFishMVPRobolectric(this.CatchingFishSnackbar, i3);
            this.CatchingFishDaggerHiltFAB = CatchingFishMVPRobolectric;
            int CatchingFishAnimationMockk = CatchingFishMVPRobolectric < 0 ? CatchingFishAnimationMockk() : CatchingFishRoomDatabase(CatchingFishMVPRobolectric + 1);
            int CatchingFishViewModelScope = CatchingFishAnimationMockk >= 0 ? CatchingFishViewModelScope(this.CatchingFishSnackbar, CatchingFishAnimationMockk) : 0;
            this.CatchingFishLayout = CatchingFishViewModelScope;
            this.CatchingFishFragmentHandler = CatchingFishViewModelScope;
            return;
        }
        if (i != i2) {
            CatchingFishUnitTestingFlux.CatchingFishCoroutine("Expected to be at the end of a group");
        }
        int[] iArr2 = this.CatchingFishSnackbar;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        CatchingFishMockkKtorGlide.CatchingFishReduxKtor(CatchingFishRoomDatabase, i4, iArr2);
        int CatchingFishCoroutine2 = this.CatchingFishStateLiveData.CatchingFishCoroutine();
        this.CatchingFishCoroutineFlow = (CatchingFishUnitTesting() - this.CatchingFishViewModelFAB) - this.CatchingFishRoomDatabase.CatchingFishCoroutine();
        this.CatchingFishDaggerHiltFAB = CatchingFishCoroutine2;
        int CatchingFishMVPRobolectric2 = CatchingFishMVPRobolectric(this.CatchingFishSnackbar, i3);
        int CatchingFishCoroutine3 = catchingFishWidgetToolbar.CatchingFishCoroutine();
        this.CatchingFishAnimationMockk = CatchingFishCoroutine3;
        if (CatchingFishMVPRobolectric2 == CatchingFishCoroutine2) {
            this.CatchingFishAnimationMockk = CatchingFishCoroutine3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (CatchingFishMVPRobolectric2 != 0 && CatchingFishMVPRobolectric2 != CatchingFishCoroutine2 && (i14 != 0 || i13 != 0)) {
                int CatchingFishRoomDatabase2 = CatchingFishRoomDatabase(CatchingFishMVPRobolectric2);
                if (i13 != 0) {
                    int[] iArr3 = this.CatchingFishSnackbar;
                    int i15 = (CatchingFishRoomDatabase2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.CatchingFishSnackbar;
                    CatchingFishMockkKtorGlide.CatchingFishReduxKtor(CatchingFishRoomDatabase2, (iArr4[(CatchingFishRoomDatabase2 * 5) + 1] & 67108863) + i14, iArr4);
                }
                int[] iArr5 = this.CatchingFishSnackbar;
                if ((iArr5[(CatchingFishRoomDatabase2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                CatchingFishMVPRobolectric2 = CatchingFishMVPRobolectric(iArr5, CatchingFishMVPRobolectric2);
            }
        }
        this.CatchingFishAnimationMockk += i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void CatchingFishGradleManifest(int i, Object obj, Object obj2, boolean z) {
        int i2;
        int i3 = this.CatchingFishDaggerHiltFAB;
        Object[] objArr = this.CatchingFishUnitTesting > 0;
        this.CatchingFishNavigation.CatchingFishReduxKtor(this.CatchingFishAnimationMockk);
        CatchingFishGradleMVVM catchingFishGradleMVVM = CatchingFishGsonOkHttp.CatchingFishParcelableFAB;
        if (objArr == true) {
            int i4 = this.CatchingFishJetpackCompose;
            int CatchingFishViewModelScope = CatchingFishViewModelScope(this.CatchingFishSnackbar, CatchingFishRoomDatabase(i4));
            CatchingFishCoroutineFlow(1);
            this.CatchingFishLayout = CatchingFishViewModelScope;
            this.CatchingFishFragmentHandler = CatchingFishViewModelScope;
            int CatchingFishRoomDatabase = CatchingFishRoomDatabase(i4);
            int i5 = obj != catchingFishGradleMVVM ? 1 : 0;
            int i6 = (z || obj2 == catchingFishGradleMVVM) ? 0 : 1;
            int CatchingFishLayout = CatchingFishLayout(CatchingFishViewModelScope, this.CatchingFishCloudMessaging, this.CatchingFishEspressoTesting, this.CatchingFishCoroutine.length);
            if (CatchingFishLayout >= 0 && this.CatchingFishOkHttp < i4) {
                CatchingFishLayout = -(((this.CatchingFishCoroutine.length - this.CatchingFishEspressoTesting) - CatchingFishLayout) + 1);
            }
            int[] iArr = this.CatchingFishSnackbar;
            int i7 = this.CatchingFishDaggerHiltFAB;
            int i8 = CatchingFishRoomDatabase * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = CatchingFishLayout;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                CatchingFishDaggerHiltFAB(i9, i4);
                Object[] objArr2 = this.CatchingFishCoroutine;
                int i10 = this.CatchingFishLayout;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.CatchingFishLayout = i10;
            }
            this.CatchingFishAnimationMockk = 0;
            i2 = i4 + 1;
            this.CatchingFishDaggerHiltFAB = i4;
            this.CatchingFishJetpackCompose = i2;
            if (i3 >= 0) {
                CatchingFishHandler(i3);
            }
        } else {
            this.CatchingFishStateLiveData.CatchingFishReduxKtor(i3);
            this.CatchingFishRoomDatabase.CatchingFishReduxKtor((CatchingFishUnitTesting() - this.CatchingFishViewModelFAB) - this.CatchingFishCoroutineFlow);
            int i11 = this.CatchingFishJetpackCompose;
            int CatchingFishRoomDatabase2 = CatchingFishRoomDatabase(i11);
            if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(obj2, catchingFishGradleMVVM)) {
                if (z) {
                    CatchingFishRecyclerView(this.CatchingFishJetpackCompose, obj2);
                } else {
                    CatchingFishLayoutInflater(obj2);
                }
            }
            this.CatchingFishLayout = CatchingFishCameraXIntent(this.CatchingFishSnackbar, CatchingFishRoomDatabase2);
            this.CatchingFishFragmentHandler = CatchingFishViewModelScope(this.CatchingFishSnackbar, CatchingFishRoomDatabase(this.CatchingFishJetpackCompose + 1));
            int[] iArr2 = this.CatchingFishSnackbar;
            int i12 = CatchingFishRoomDatabase2 * 5;
            this.CatchingFishAnimationMockk = iArr2[i12 + 1] & 67108863;
            this.CatchingFishDaggerHiltFAB = i11;
            this.CatchingFishJetpackCompose = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.CatchingFishCoroutineFlow = i2;
    }

    public final void CatchingFishGsonAppCompat(CatchingFishMVVMMVIRoom catchingFishMVVMMVIRoom, int i) {
        if (this.CatchingFishUnitTesting <= 0) {
            CatchingFishUnitTestingFlux.CatchingFishCoroutine("Check failed");
        }
        if (i == 0 && this.CatchingFishJetpackCompose == 0 && this.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket == 0) {
            int[] iArr = catchingFishMVVMMVIRoom.CatchingFishReduxKtor;
            int i2 = iArr[(i * 5) + 3];
            int i3 = catchingFishMVVMMVIRoom.CatchingFishDaggerWebsocket;
            if (i2 == i3) {
                int[] iArr2 = this.CatchingFishSnackbar;
                Object[] objArr = this.CatchingFishCoroutine;
                ArrayList arrayList = this.CatchingFishReduxKtor;
                HashMap hashMap = this.CatchingFishDaggerWebsocket;
                CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom = this.CatchingFishWorkManager;
                Object[] objArr2 = catchingFishMVVMMVIRoom.CatchingFishWorkManager;
                int i4 = catchingFishMVVMMVIRoom.CatchingFishViewModelScope;
                HashMap hashMap2 = catchingFishMVVMMVIRoom.CatchingFishOkHttp;
                CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom2 = catchingFishMVVMMVIRoom.CatchingFishUnitTesting;
                this.CatchingFishSnackbar = iArr;
                this.CatchingFishCoroutine = objArr2;
                this.CatchingFishReduxKtor = catchingFishMVVMMVIRoom.CatchingFishEspressoTesting;
                this.CatchingFishViewModelScope = i3;
                this.CatchingFishViewModelFAB = (iArr.length / 5) - i3;
                this.CatchingFishCloudMessaging = i4;
                this.CatchingFishEspressoTesting = objArr2.length - i4;
                this.CatchingFishOkHttp = i3;
                this.CatchingFishDaggerWebsocket = hashMap2;
                this.CatchingFishWorkManager = catchingFishLayoutGsonRoom2;
                catchingFishMVVMMVIRoom.CatchingFishReduxKtor = iArr2;
                catchingFishMVVMMVIRoom.CatchingFishDaggerWebsocket = 0;
                catchingFishMVVMMVIRoom.CatchingFishWorkManager = objArr;
                catchingFishMVVMMVIRoom.CatchingFishViewModelScope = 0;
                catchingFishMVVMMVIRoom.CatchingFishEspressoTesting = arrayList;
                catchingFishMVVMMVIRoom.CatchingFishOkHttp = hashMap;
                catchingFishMVVMMVIRoom.CatchingFishUnitTesting = catchingFishLayoutGsonRoom;
                return;
            }
        }
        CatchingFishGoogleMapsMVP CatchingFishDaggerWebsocket = catchingFishMVVMMVIRoom.CatchingFishDaggerWebsocket();
        try {
            CatchingFishViewMVIMVVM.CatchingFishNavigation(CatchingFishDaggerWebsocket, i, this, true, true, false);
            CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket(true);
        } catch (Throwable th) {
            CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket(false);
            throw th;
        }
    }

    public final CatchingFishKtorHilt CatchingFishHandler(int i) {
        CatchingFishMockkPicasso CatchingFishMotionLayout;
        HashMap hashMap = this.CatchingFishDaggerWebsocket;
        if (hashMap == null || (CatchingFishMotionLayout = CatchingFishMotionLayout(i)) == null) {
            return null;
        }
        return (CatchingFishKtorHilt) hashMap.get(CatchingFishMotionLayout);
    }

    public final boolean CatchingFishJetpackCompose(int i, int i2) {
        int CatchingFishUnitTesting;
        int CatchingFish;
        if (i2 == this.CatchingFishDaggerHiltFAB) {
            CatchingFishUnitTesting = this.CatchingFishCoroutineFlow;
        } else {
            CatchingFishWidgetToolbar catchingFishWidgetToolbar = this.CatchingFishStateLiveData;
            if (i2 > catchingFishWidgetToolbar.CatchingFishSnackbar(0)) {
                CatchingFish = CatchingFish(i2);
            } else {
                int[] iArr = catchingFishWidgetToolbar.CatchingFishParcelableFAB;
                int min = Math.min(iArr.length, catchingFishWidgetToolbar.CatchingFishSnackbar);
                int i3 = 0;
                while (true) {
                    if (i3 >= min) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    CatchingFish = CatchingFish(i2);
                } else {
                    CatchingFishUnitTesting = (CatchingFishUnitTesting() - this.CatchingFishViewModelFAB) - this.CatchingFishRoomDatabase.CatchingFishParcelableFAB[i3];
                }
            }
            CatchingFishUnitTesting = CatchingFish + i2;
        }
        return i > i2 && i < CatchingFishUnitTesting;
    }

    public final boolean CatchingFishJobScheduler(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.CatchingFishReduxKtor;
            CatchingFishCardViewRealm(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.CatchingFishDaggerWebsocket;
                int i3 = i + i2;
                int CatchingFishSnackbar = CatchingFishMockkKtorGlide.CatchingFishSnackbar(this.CatchingFishReduxKtor, i3, CatchingFishUnitTesting() - this.CatchingFishViewModelFAB);
                if (CatchingFishSnackbar >= this.CatchingFishReduxKtor.size()) {
                    CatchingFishSnackbar--;
                }
                int i4 = CatchingFishSnackbar + 1;
                int i5 = 0;
                while (CatchingFishSnackbar >= 0) {
                    CatchingFishMockkPicasso catchingFishMockkPicasso = (CatchingFishMockkPicasso) this.CatchingFishReduxKtor.get(CatchingFishSnackbar);
                    int CatchingFishCoroutine = CatchingFishCoroutine(catchingFishMockkPicasso);
                    if (CatchingFishCoroutine < i) {
                        break;
                    }
                    if (CatchingFishCoroutine < i3) {
                        catchingFishMockkPicasso.CatchingFishParcelableFAB = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i5 == 0) {
                            i5 = CatchingFishSnackbar + 1;
                        }
                        i4 = CatchingFishSnackbar;
                    }
                    CatchingFishSnackbar--;
                }
                r0 = i4 < i5;
                if (r0) {
                    this.CatchingFishReduxKtor.subList(i4, i5).clear();
                }
            }
            this.CatchingFishViewModelScope = i;
            this.CatchingFishViewModelFAB += i2;
            int i6 = this.CatchingFishOkHttp;
            if (i6 > i) {
                this.CatchingFishOkHttp = Math.max(i, i6 - i2);
            }
            int i7 = this.CatchingFishCoroutineFlow;
            if (i7 >= this.CatchingFishViewModelScope) {
                this.CatchingFishCoroutineFlow = i7 - i2;
            }
            int i8 = this.CatchingFishDaggerHiltFAB;
            if (i8 >= 0 && (this.CatchingFishSnackbar[(CatchingFishRoomDatabase(i8) * 5) + 1] & 67108864) != 0) {
                CatchingFishParcelable(i8);
            }
        }
        return r0;
    }

    public final void CatchingFishLayoutInflater(Object obj) {
        int CatchingFishRoomDatabase = CatchingFishRoomDatabase(this.CatchingFishJetpackCompose);
        int i = (CatchingFishRoomDatabase * 5) + 1;
        if ((this.CatchingFishSnackbar[i] & 268435456) == 0) {
            CatchingFishUnitTestingFlux.CatchingFishCoroutine("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.CatchingFishCoroutine;
        int[] iArr = this.CatchingFishSnackbar;
        objArr[CatchingFishViewModelFAB(Integer.bitCount(iArr[i] >> 29) + CatchingFishViewModelScope(iArr, CatchingFishRoomDatabase))] = obj;
    }

    public final int CatchingFishMVPRobolectric(int[] iArr, int i) {
        int i2 = iArr[(CatchingFishRoomDatabase(i) * 5) + 2];
        return i2 > -2 ? i2 : (CatchingFishAnimationMockk() + i2) - (-2);
    }

    public final CatchingFishMockkPicasso CatchingFishMotionLayout(int i) {
        ArrayList arrayList;
        int CatchingFishDaggerWebsocket;
        if (i < 0 || i >= CatchingFishAnimationMockk() || (CatchingFishDaggerWebsocket = CatchingFishMockkKtorGlide.CatchingFishDaggerWebsocket((arrayList = this.CatchingFishReduxKtor), i, CatchingFishAnimationMockk())) < 0) {
            return null;
        }
        return (CatchingFishMockkPicasso) arrayList.get(CatchingFishDaggerWebsocket);
    }

    public final boolean CatchingFishMutableLiveData() {
        if (!(this.CatchingFishUnitTesting == 0)) {
            CatchingFishUnitTestingFlux.CatchingFishCoroutine("Cannot remove group while inserting");
        }
        int i = this.CatchingFishJetpackCompose;
        int i2 = this.CatchingFishLayout;
        int CatchingFishViewModelScope = CatchingFishViewModelScope(this.CatchingFishSnackbar, CatchingFishRoomDatabase(i));
        int CatchingFishEspressoMockk = CatchingFishEspressoMockk();
        CatchingFishHandler(this.CatchingFishDaggerHiltFAB);
        CatchingFishGsonLayout catchingFishGsonLayout = this.CatchingFishParcelableFlux;
        if (catchingFishGsonLayout != null) {
            while (true) {
                int i3 = catchingFishGsonLayout.CatchingFishSnackbar;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    CatchingFishHiltMVPToast.CatchingFishMotionLayout("IntList is empty.");
                    throw null;
                }
                if (catchingFishGsonLayout.CatchingFishParcelableFAB[0] < i) {
                    break;
                }
                CatchingFishDaggerBiometric.CatchingFishMotionLayout(catchingFishGsonLayout);
            }
        }
        boolean CatchingFishJobScheduler = CatchingFishJobScheduler(i, this.CatchingFishJetpackCompose - i);
        CatchingFishPayPalService(CatchingFishViewModelScope, this.CatchingFishLayout - CatchingFishViewModelScope, i - 1);
        this.CatchingFishJetpackCompose = i;
        this.CatchingFishLayout = i2;
        this.CatchingFishAnimationMockk -= CatchingFishEspressoMockk;
        return CatchingFishJobScheduler;
    }

    public final Object CatchingFishNavigation(int i) {
        int CatchingFishRoomDatabase = CatchingFishRoomDatabase(i);
        int[] iArr = this.CatchingFishSnackbar;
        int i2 = CatchingFishRoomDatabase * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.CatchingFishCoroutine[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final void CatchingFishOkHttp(int i, int i2, int i3) {
        if (i >= this.CatchingFishViewModelScope) {
            i = -((CatchingFishAnimationMockk() - i) + 2);
        }
        while (i3 < i2) {
            this.CatchingFishSnackbar[(CatchingFishRoomDatabase(i3) * 5) + 2] = i;
            int i4 = this.CatchingFishSnackbar[(CatchingFishRoomDatabase(i3) * 5) + 3] + i3;
            CatchingFishOkHttp(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final void CatchingFishParcelable(int i) {
        if (i >= 0) {
            CatchingFishGsonLayout catchingFishGsonLayout = this.CatchingFishParcelableFlux;
            if (catchingFishGsonLayout == null) {
                catchingFishGsonLayout = new CatchingFishGsonLayout();
                this.CatchingFishParcelableFlux = catchingFishGsonLayout;
            }
            CatchingFishDaggerBiometric.CatchingFishCoroutine(catchingFishGsonLayout, i);
        }
    }

    public final void CatchingFishParcelableFAB(int i) {
        boolean z = false;
        if (!(i >= 0)) {
            CatchingFishUnitTestingFlux.CatchingFishCoroutine("Cannot seek backwards");
        }
        if (!(this.CatchingFishUnitTesting <= 0)) {
            CatchingFishMVPAndroidXKtor.CatchingFishSnackbar("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.CatchingFishJetpackCompose + i;
        if (i2 >= this.CatchingFishDaggerHiltFAB && i2 <= this.CatchingFishCoroutineFlow) {
            z = true;
        }
        if (!z) {
            CatchingFishUnitTestingFlux.CatchingFishCoroutine("Cannot seek outside the current group (" + this.CatchingFishDaggerHiltFAB + '-' + this.CatchingFishCoroutineFlow + ')');
        }
        this.CatchingFishJetpackCompose = i2;
        int CatchingFishViewModelScope = CatchingFishViewModelScope(this.CatchingFishSnackbar, CatchingFishRoomDatabase(i2));
        this.CatchingFishLayout = CatchingFishViewModelScope;
        this.CatchingFishFragmentHandler = CatchingFishViewModelScope;
    }

    public final void CatchingFishPayPal(int i, int i2) {
        int i3 = this.CatchingFishEspressoTesting;
        int i4 = this.CatchingFishCloudMessaging;
        int i5 = this.CatchingFishOkHttp;
        if (i4 != i) {
            Object[] objArr = this.CatchingFishCoroutine;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int min = Math.min(i2 + 1, CatchingFishAnimationMockk());
        if (i5 != min) {
            int length = this.CatchingFishCoroutine.length - i3;
            if (min < i5) {
                int CatchingFishRoomDatabase = CatchingFishRoomDatabase(min);
                int CatchingFishRoomDatabase2 = CatchingFishRoomDatabase(i5);
                int i7 = this.CatchingFishViewModelScope;
                while (CatchingFishRoomDatabase < CatchingFishRoomDatabase2) {
                    int i8 = (CatchingFishRoomDatabase * 5) + 4;
                    int i9 = this.CatchingFishSnackbar[i8];
                    if (!(i9 >= 0)) {
                        CatchingFishUnitTestingFlux.CatchingFishCoroutine("Unexpected anchor value, expected a positive anchor");
                    }
                    this.CatchingFishSnackbar[i8] = -((length - i9) + 1);
                    CatchingFishRoomDatabase++;
                    if (CatchingFishRoomDatabase == i7) {
                        CatchingFishRoomDatabase += this.CatchingFishViewModelFAB;
                    }
                }
            } else {
                int CatchingFishRoomDatabase3 = CatchingFishRoomDatabase(i5);
                int CatchingFishRoomDatabase4 = CatchingFishRoomDatabase(min);
                while (CatchingFishRoomDatabase3 < CatchingFishRoomDatabase4) {
                    int i10 = (CatchingFishRoomDatabase3 * 5) + 4;
                    int i11 = this.CatchingFishSnackbar[i10];
                    if (!(i11 < 0)) {
                        CatchingFishUnitTestingFlux.CatchingFishCoroutine("Unexpected anchor value, expected a negative anchor");
                    }
                    this.CatchingFishSnackbar[i10] = i11 + length + 1;
                    CatchingFishRoomDatabase3++;
                    if (CatchingFishRoomDatabase3 == this.CatchingFishViewModelScope) {
                        CatchingFishRoomDatabase3 += this.CatchingFishViewModelFAB;
                    }
                }
            }
            this.CatchingFishOkHttp = min;
        }
        this.CatchingFishCloudMessaging = i;
    }

    public final void CatchingFishPayPalLiveData() {
        if (this.CatchingFishUnitTesting != 0) {
            CatchingFishUnitTestingFlux.CatchingFishCoroutine("Key must be supplied when inserting");
        }
        CatchingFishGradleMVVM catchingFishGradleMVVM = CatchingFishGsonOkHttp.CatchingFishParcelableFAB;
        CatchingFishGradleManifest(0, catchingFishGradleMVVM, catchingFishGradleMVVM, false);
    }

    public final void CatchingFishPayPalService(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.CatchingFishEspressoTesting;
            int i5 = i + i2;
            CatchingFishPayPal(i5, i3);
            this.CatchingFishCloudMessaging = i;
            this.CatchingFishEspressoTesting = i4 + i2;
            CatchingFishMVVMHilt.CatchingFishAnimation(this.CatchingFishCoroutine, i, i5);
            int i6 = this.CatchingFishFragmentHandler;
            if (i6 >= i) {
                this.CatchingFishFragmentHandler = i6 - i2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r1[(r0 * 5) + 1] & 1073741824) != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishRecyclerView(int i, Object obj) {
        int CatchingFishRoomDatabase = CatchingFishRoomDatabase(i);
        int[] iArr = this.CatchingFishSnackbar;
        boolean z = CatchingFishRoomDatabase < iArr.length;
        if (!z) {
            CatchingFishUnitTestingFlux.CatchingFishCoroutine("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.CatchingFishCoroutine[CatchingFishViewModelFAB(CatchingFishViewModelScope(this.CatchingFishSnackbar, CatchingFishRoomDatabase))] = obj;
    }

    public final void CatchingFishReduxKtor() {
        int i = this.CatchingFishUnitTesting;
        this.CatchingFishUnitTesting = i + 1;
        if (i == 0) {
            this.CatchingFishRoomDatabase.CatchingFishReduxKtor((CatchingFishUnitTesting() - this.CatchingFishViewModelFAB) - this.CatchingFishCoroutineFlow);
        }
    }

    public final int CatchingFishRoomDatabase(int i) {
        return (this.CatchingFishViewModelFAB * (i < this.CatchingFishViewModelScope ? 0 : 1)) + i;
    }

    public final Object CatchingFishSensorManager(int i, int i2, Object obj) {
        int CatchingFishCameraXIntent = CatchingFishCameraXIntent(this.CatchingFishSnackbar, CatchingFishRoomDatabase(i));
        int CatchingFishViewModelScope = CatchingFishViewModelScope(this.CatchingFishSnackbar, CatchingFishRoomDatabase(i + 1));
        int i3 = CatchingFishCameraXIntent + i2;
        if (i3 < CatchingFishCameraXIntent || i3 >= CatchingFishViewModelScope) {
            CatchingFishUnitTestingFlux.CatchingFishCoroutine("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int CatchingFishViewModelFAB = CatchingFishViewModelFAB(i3);
        Object[] objArr = this.CatchingFishCoroutine;
        Object obj2 = objArr[CatchingFishViewModelFAB];
        objArr[CatchingFishViewModelFAB] = obj;
        return obj2;
    }

    public final CatchingFishMockkPicasso CatchingFishSnackbar(int i) {
        ArrayList arrayList = this.CatchingFishReduxKtor;
        int CatchingFishDaggerWebsocket = CatchingFishMockkKtorGlide.CatchingFishDaggerWebsocket(arrayList, i, CatchingFishAnimationMockk());
        if (CatchingFishDaggerWebsocket >= 0) {
            return (CatchingFishMockkPicasso) arrayList.get(CatchingFishDaggerWebsocket);
        }
        if (i > this.CatchingFishViewModelScope) {
            i = -(CatchingFishAnimationMockk() - i);
        }
        CatchingFishMockkPicasso catchingFishMockkPicasso = new CatchingFishMockkPicasso(i);
        arrayList.add(-(CatchingFishDaggerWebsocket + 1), catchingFishMockkPicasso);
        return catchingFishMockkPicasso;
    }

    public final boolean CatchingFishSpannableWidget(int i) {
        return (this.CatchingFishSnackbar[(CatchingFishRoomDatabase(i) * 5) + 1] & 1073741824) != 0;
    }

    public final Object CatchingFishStateLiveData(int i) {
        int CatchingFishRoomDatabase = CatchingFishRoomDatabase(i);
        int[] iArr = this.CatchingFishSnackbar;
        int i2 = (CatchingFishRoomDatabase * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return CatchingFishGsonOkHttp.CatchingFishParcelableFAB;
        }
        return this.CatchingFishCoroutine[Integer.bitCount(iArr[i2] >> 29) + CatchingFishViewModelScope(iArr, CatchingFishRoomDatabase)];
    }

    public final int CatchingFishUnitTesting() {
        return this.CatchingFishSnackbar.length / 5;
    }

    public final int CatchingFishViewModelFAB(int i) {
        return (this.CatchingFishEspressoTesting * (i < this.CatchingFishCloudMessaging ? 0 : 1)) + i;
    }

    public final int CatchingFishViewModelScope(int[] iArr, int i) {
        if (i >= CatchingFishUnitTesting()) {
            return this.CatchingFishCoroutine.length - this.CatchingFishEspressoTesting;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.CatchingFishCoroutine.length - this.CatchingFishEspressoTesting) + i2 + 1 : i2;
    }

    public final int CatchingFishWorkManager(int i) {
        return CatchingFishViewModelScope(this.CatchingFishSnackbar, CatchingFishRoomDatabase(i));
    }

    public final String toString() {
        return "SlotWriter(current = " + this.CatchingFishJetpackCompose + " end=" + this.CatchingFishCoroutineFlow + " size = " + CatchingFishAnimationMockk() + " gap=" + this.CatchingFishViewModelScope + '-' + (this.CatchingFishViewModelScope + this.CatchingFishViewModelFAB) + ')';
    }
}
