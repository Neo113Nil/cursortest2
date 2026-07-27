package kotlin.text;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class CatchingFishHandlerRedux {
    public CatchingFishJUnitService CatchingFishCoroutine;
    public int CatchingFishFragmentHandler;
    public final CatchingFishServiceHandler CatchingFishParcelableFAB;
    public Object CatchingFishSnackbar;
    public int CatchingFishReduxKtor = -1;
    public final CatchingFishPayPalService CatchingFishDaggerWebsocket = CatchingFishLayoutRoom.CatchingFishFragmentHandler();
    public final CatchingFishPayPalService CatchingFishWorkManager = new CatchingFishPayPalService();
    public final CatchingFishServiceBundle CatchingFishViewModelScope = new CatchingFishServiceBundle();
    public final CatchingFishFABToast CatchingFishViewModelFAB = new CatchingFishFABToast(new CatchingFishGsonReduxPayPal[16]);
    public final CatchingFishDaggerMVP CatchingFishLayout = new CatchingFishDaggerMVP(1, this);
    public final CatchingFishPayPalService CatchingFishCloudMessaging = CatchingFishLayoutRoom.CatchingFishFragmentHandler();
    public final HashMap CatchingFishEspressoTesting = new HashMap();

    public CatchingFishHandlerRedux(CatchingFishServiceHandler catchingFishServiceHandler) {
        this.CatchingFishParcelableFAB = catchingFishServiceHandler;
    }

    public final void CatchingFishCoroutine(Object obj, int i, Object obj2, CatchingFishJUnitService catchingFishJUnitService) {
        int i2;
        if (this.CatchingFishFragmentHandler > 0) {
            return;
        }
        int CatchingFishCoroutine = catchingFishJUnitService.CatchingFishCoroutine(obj);
        if (CatchingFishCoroutine < 0) {
            CatchingFishCoroutine = ~CatchingFishCoroutine;
            i2 = -1;
        } else {
            i2 = catchingFishJUnitService.CatchingFishCoroutine[CatchingFishCoroutine];
        }
        catchingFishJUnitService.CatchingFishSnackbar[CatchingFishCoroutine] = obj;
        catchingFishJUnitService.CatchingFishCoroutine[CatchingFishCoroutine] = i;
        if ((obj instanceof CatchingFishGsonReduxPayPal) && i2 != i) {
            CatchingFishMVPParcelable CatchingFishViewModelFAB = ((CatchingFishGsonReduxPayPal) obj).CatchingFishViewModelFAB();
            this.CatchingFishEspressoTesting.put(obj, CatchingFishViewModelFAB.CatchingFishWorkManager);
            CatchingFishJUnitService catchingFishJUnitService2 = CatchingFishViewModelFAB.CatchingFishDaggerWebsocket;
            CatchingFishPayPalService catchingFishPayPalService = this.CatchingFishCloudMessaging;
            CatchingFishLayoutRoom.CatchingFishCardViewView(catchingFishPayPalService, obj);
            Object[] objArr = catchingFishJUnitService2.CatchingFishSnackbar;
            long[] jArr = catchingFishJUnitService2.CatchingFishParcelableFAB;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                CatchingFishJUnitViewPager catchingFishJUnitViewPager = (CatchingFishJUnitViewPager) objArr[(i3 << 3) + i5];
                                if (catchingFishJUnitViewPager instanceof CatchingFishRetrofitPayPal) {
                                    ((CatchingFishRetrofitPayPal) catchingFishJUnitViewPager).CatchingFishWorkManager(2);
                                }
                                CatchingFishLayoutRoom.CatchingFishViewModelScope(catchingFishPayPalService, catchingFishJUnitViewPager, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof CatchingFishRetrofitPayPal) {
                ((CatchingFishRetrofitPayPal) obj).CatchingFishWorkManager(2);
            }
            CatchingFishLayoutRoom.CatchingFishViewModelScope(this.CatchingFishDaggerWebsocket, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishDaggerWebsocket() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        long j3;
        CatchingFishPayPalService catchingFishPayPalService = this.CatchingFishWorkManager;
        long[] jArr3 = catchingFishPayPalService.CatchingFishParcelableFAB;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j4 = jArr3[i2];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j4 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = catchingFishPayPalService.CatchingFishSnackbar[i6];
                        j2 = j5;
                        CatchingFishJUnitService catchingFishJUnitService = (CatchingFishJUnitService) catchingFishPayPalService.CatchingFishCoroutine[i6];
                        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                        boolean CatchingFishUnitTesting = ((CatchingFishHiltDatabinding) obj).CatchingFishUnitTesting();
                        if (!CatchingFishUnitTesting) {
                            Object[] objArr = catchingFishJUnitService.CatchingFishSnackbar;
                            int[] iArr = catchingFishJUnitService.CatchingFishCoroutine;
                            long[] jArr4 = catchingFishJUnitService.CatchingFishParcelableFAB;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j4;
                                int i8 = 0;
                                while (true) {
                                    long j6 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    z = CatchingFishUnitTesting;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j6 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                j3 = j6;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                CatchingFishReduxKtor(obj, obj2);
                                            } else {
                                                j3 = j6;
                                            }
                                            j6 = j3 >> i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                    }
                                    if (i8 == length2) {
                                        break;
                                    }
                                    i8++;
                                    CatchingFishUnitTesting = z;
                                    jArr4 = jArr5;
                                    i7 = 8;
                                }
                                if (!z) {
                                    catchingFishPayPalService.CatchingFishEspressoTesting(i6);
                                }
                                i = 8;
                            }
                        }
                        jArr2 = jArr3;
                        j = j4;
                        z = CatchingFishUnitTesting;
                        if (!z) {
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j4 = j >> i;
                    c2 = c;
                    j5 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }

    public final void CatchingFishParcelableFAB(CatchingFishHiltDatabinding catchingFishHiltDatabinding, CatchingFishFragmentFactory catchingFishFragmentFactory, CatchingFishJUnitGlide catchingFishJUnitGlide) {
        boolean z;
        int i;
        int i2;
        Object obj = this.CatchingFishSnackbar;
        CatchingFishJUnitService catchingFishJUnitService = this.CatchingFishCoroutine;
        int i3 = this.CatchingFishReduxKtor;
        this.CatchingFishSnackbar = catchingFishHiltDatabinding;
        this.CatchingFishCoroutine = (CatchingFishJUnitService) this.CatchingFishWorkManager.CatchingFishViewModelScope(catchingFishHiltDatabinding);
        if (this.CatchingFishReduxKtor == -1) {
            this.CatchingFishReduxKtor = Long.hashCode(CatchingFishIntentBundle.CatchingFishCloudMessaging().CatchingFishViewModelScope());
        }
        CatchingFishDaggerMVP catchingFishDaggerMVP = this.CatchingFishLayout;
        CatchingFishFABToast CatchingFishEspressoTesting = CatchingFishLayoutRoom.CatchingFishEspressoTesting();
        boolean z2 = true;
        try {
            CatchingFishEspressoTesting.CatchingFishSnackbar(catchingFishDaggerMVP);
            CatchingFishDaggerBiometric.CatchingFishCustomView(catchingFishJUnitGlide, catchingFishFragmentFactory);
            CatchingFishEspressoTesting.CatchingFishFragmentHandler(CatchingFishEspressoTesting.CatchingFishWorkManager - 1);
            Object obj2 = this.CatchingFishSnackbar;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(obj2);
            int i4 = this.CatchingFishReduxKtor;
            CatchingFishJUnitService catchingFishJUnitService2 = this.CatchingFishCoroutine;
            if (catchingFishJUnitService2 != null) {
                long[] jArr = catchingFishJUnitService2.CatchingFishParcelableFAB;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8;
                            int i7 = 8 - ((~(i5 - length)) >>> 31);
                            z = z2;
                            int i8 = 0;
                            while (i8 < i7) {
                                if ((j & 255) < 128) {
                                    int i9 = (i5 << 3) + i8;
                                    i2 = i6;
                                    Object obj3 = catchingFishJUnitService2.CatchingFishSnackbar[i9];
                                    i = i8;
                                    boolean z3 = catchingFishJUnitService2.CatchingFishCoroutine[i9] != i4 ? z : false;
                                    if (z3) {
                                        CatchingFishReduxKtor(obj2, obj3);
                                    }
                                    if (z3) {
                                        catchingFishJUnitService2.CatchingFishViewModelScope(i9);
                                    }
                                } else {
                                    i = i8;
                                    i2 = i6;
                                }
                                j >>= i2;
                                i8 = i + 1;
                                i6 = i2;
                            }
                            if (i7 != i6) {
                                break;
                            }
                        } else {
                            z = z2;
                        }
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                        z2 = z;
                    }
                }
            }
            this.CatchingFishSnackbar = obj;
            this.CatchingFishCoroutine = catchingFishJUnitService;
            this.CatchingFishReduxKtor = i3;
        } catch (Throwable th) {
            CatchingFishEspressoTesting.CatchingFishFragmentHandler(CatchingFishEspressoTesting.CatchingFishWorkManager - 1);
            throw th;
        }
    }

    public final void CatchingFishReduxKtor(Object obj, Object obj2) {
        CatchingFishPayPalService catchingFishPayPalService = this.CatchingFishDaggerWebsocket;
        CatchingFishLayoutRoom.CatchingFishPayPal(catchingFishPayPalService, obj2, obj);
        if (!(obj2 instanceof CatchingFishGsonReduxPayPal) || catchingFishPayPalService.CatchingFishCoroutine(obj2)) {
            return;
        }
        CatchingFishLayoutRoom.CatchingFishCardViewView(this.CatchingFishCloudMessaging, obj2);
        this.CatchingFishEspressoTesting.remove(obj2);
    }

    public final boolean CatchingFishSnackbar(Set set) {
        char c;
        long j;
        boolean z;
        Iterator it;
        String str;
        CatchingFishPayPalService catchingFishPayPalService;
        Object obj;
        int i;
        Object obj2;
        Iterator it2;
        Object obj3;
        String str2;
        CatchingFishPayPalService catchingFishPayPalService2;
        long j2;
        int i2;
        Object[] objArr;
        int i3;
        int i4;
        int i5;
        CatchingFishJUnitService catchingFishJUnitService;
        long[] jArr;
        Object[] objArr2;
        long[] jArr2;
        Object[] objArr3;
        int i6;
        int i7;
        int i8;
        long j3;
        int i9;
        Object obj4;
        Object obj5;
        int i10;
        int i11;
        long j4;
        Object obj6;
        int i12;
        long j5;
        boolean z2 = set instanceof CatchingFishCardViewRealm;
        String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
        CatchingFishFABToast catchingFishFABToast = this.CatchingFishViewModelFAB;
        int i13 = 8;
        CatchingFishPayPalService catchingFishPayPalService3 = this.CatchingFishCloudMessaging;
        HashMap hashMap = this.CatchingFishEspressoTesting;
        CatchingFishPayPalService catchingFishPayPalService4 = this.CatchingFishDaggerWebsocket;
        CatchingFishServiceBundle catchingFishServiceBundle = this.CatchingFishViewModelScope;
        if (z2) {
            CatchingFishServiceBundle catchingFishServiceBundle2 = ((CatchingFishCardViewRealm) set).CatchingFishReduxKtor;
            Object[] objArr4 = catchingFishServiceBundle2.CatchingFishSnackbar;
            long[] jArr3 = catchingFishServiceBundle2.CatchingFishParcelableFAB;
            c = 7;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i14 = 0;
                z = false;
                j = -9187201950435737472L;
                while (true) {
                    long j6 = jArr3[i14];
                    int i15 = i14;
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j6 & 255) < 128) {
                                int i18 = i13;
                                Object obj7 = objArr4[(i15 << 3) + i17];
                                jArr2 = jArr3;
                                if (obj7 instanceof CatchingFishRetrofitPayPal) {
                                    objArr3 = objArr4;
                                    if (!((CatchingFishRetrofitPayPal) obj7).CatchingFishDaggerWebsocket(2)) {
                                        i6 = length;
                                        i7 = i16;
                                        i8 = i17;
                                        j3 = j6;
                                        i9 = 8;
                                    }
                                } else {
                                    objArr3 = objArr4;
                                }
                                if (catchingFishPayPalService3.CatchingFishCoroutine(obj7)) {
                                    Object CatchingFishViewModelScope = catchingFishPayPalService3.CatchingFishViewModelScope(obj7);
                                    if (CatchingFishViewModelScope != null) {
                                        if (CatchingFishViewModelScope instanceof CatchingFishServiceBundle) {
                                            CatchingFishServiceBundle catchingFishServiceBundle3 = (CatchingFishServiceBundle) CatchingFishViewModelScope;
                                            Object[] objArr5 = catchingFishServiceBundle3.CatchingFishSnackbar;
                                            long[] jArr4 = catchingFishServiceBundle3.CatchingFishParcelableFAB;
                                            int length2 = jArr4.length - 2;
                                            if (length2 >= 0) {
                                                i8 = i17;
                                                boolean z3 = z;
                                                int i19 = 0;
                                                while (true) {
                                                    long j7 = jArr4[i19];
                                                    j3 = j6;
                                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                                        int i21 = 0;
                                                        while (i21 < i20) {
                                                            if ((j7 & 255) < 128) {
                                                                j4 = j7;
                                                                CatchingFishGsonReduxPayPal catchingFishGsonReduxPayPal = (CatchingFishGsonReduxPayPal) objArr5[(i19 << 3) + i21];
                                                                CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishGsonReduxPayPal, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                                i12 = i21;
                                                                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGsonReduxPayPal.CatchingFishViewModelFAB().CatchingFishWorkManager, hashMap.get(catchingFishGsonReduxPayPal))) {
                                                                    i10 = length;
                                                                    i11 = i16;
                                                                    obj6 = obj7;
                                                                    catchingFishFABToast.CatchingFishSnackbar(catchingFishGsonReduxPayPal);
                                                                } else {
                                                                    Object CatchingFishViewModelScope2 = catchingFishPayPalService4.CatchingFishViewModelScope(catchingFishGsonReduxPayPal);
                                                                    if (CatchingFishViewModelScope2 != null) {
                                                                        if (CatchingFishViewModelScope2 instanceof CatchingFishServiceBundle) {
                                                                            CatchingFishServiceBundle catchingFishServiceBundle4 = (CatchingFishServiceBundle) CatchingFishViewModelScope2;
                                                                            Object[] objArr6 = catchingFishServiceBundle4.CatchingFishSnackbar;
                                                                            long[] jArr5 = catchingFishServiceBundle4.CatchingFishParcelableFAB;
                                                                            int length3 = jArr5.length - 2;
                                                                            if (length3 >= 0) {
                                                                                i10 = length;
                                                                                i11 = i16;
                                                                                int i22 = 0;
                                                                                while (true) {
                                                                                    long j8 = jArr5[i22];
                                                                                    Object[] objArr7 = objArr6;
                                                                                    obj6 = obj7;
                                                                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                        int i23 = 8 - ((~(i22 - length3)) >>> 31);
                                                                                        for (int i24 = 0; i24 < i23; i24++) {
                                                                                            if ((j8 & 255) < 128) {
                                                                                                j5 = j8;
                                                                                                catchingFishServiceBundle.CatchingFishParcelableFAB(objArr7[(i22 << 3) + i24]);
                                                                                                z3 = true;
                                                                                            } else {
                                                                                                j5 = j8;
                                                                                            }
                                                                                            j8 = j5 >> i18;
                                                                                        }
                                                                                        if (i23 != i18) {
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (i22 == length3) {
                                                                                        break;
                                                                                    }
                                                                                    i22++;
                                                                                    obj7 = obj6;
                                                                                    objArr6 = objArr7;
                                                                                    i18 = 8;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            i10 = length;
                                                                            i11 = i16;
                                                                            obj6 = obj7;
                                                                            catchingFishServiceBundle.CatchingFishParcelableFAB(CatchingFishViewModelScope2);
                                                                            z3 = true;
                                                                        }
                                                                    }
                                                                    i10 = length;
                                                                    i11 = i16;
                                                                    obj6 = obj7;
                                                                }
                                                            } else {
                                                                i10 = length;
                                                                i11 = i16;
                                                                j4 = j7;
                                                                obj6 = obj7;
                                                                i12 = i21;
                                                            }
                                                            j7 = j4 >> 8;
                                                            i21 = i12 + 1;
                                                            i18 = 8;
                                                            length = i10;
                                                            i16 = i11;
                                                            obj7 = obj6;
                                                        }
                                                        i6 = length;
                                                        i7 = i16;
                                                        obj5 = obj7;
                                                        if (i20 != i18) {
                                                            break;
                                                        }
                                                    } else {
                                                        i6 = length;
                                                        i7 = i16;
                                                        obj5 = obj7;
                                                    }
                                                    if (i19 == length2) {
                                                        break;
                                                    }
                                                    i19++;
                                                    j6 = j3;
                                                    length = i6;
                                                    i16 = i7;
                                                    obj7 = obj5;
                                                    i18 = 8;
                                                }
                                                z = z3;
                                            }
                                        } else {
                                            i6 = length;
                                            i7 = i16;
                                            i8 = i17;
                                            obj5 = obj7;
                                            j3 = j6;
                                            CatchingFishGsonReduxPayPal catchingFishGsonReduxPayPal2 = (CatchingFishGsonReduxPayPal) CatchingFishViewModelScope;
                                            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGsonReduxPayPal2.CatchingFishViewModelFAB().CatchingFishWorkManager, hashMap.get(catchingFishGsonReduxPayPal2))) {
                                                catchingFishFABToast.CatchingFishSnackbar(catchingFishGsonReduxPayPal2);
                                            } else {
                                                Object CatchingFishViewModelScope3 = catchingFishPayPalService4.CatchingFishViewModelScope(catchingFishGsonReduxPayPal2);
                                                if (CatchingFishViewModelScope3 != null) {
                                                    if (CatchingFishViewModelScope3 instanceof CatchingFishServiceBundle) {
                                                        CatchingFishServiceBundle catchingFishServiceBundle5 = (CatchingFishServiceBundle) CatchingFishViewModelScope3;
                                                        Object[] objArr8 = catchingFishServiceBundle5.CatchingFishSnackbar;
                                                        long[] jArr6 = catchingFishServiceBundle5.CatchingFishParcelableFAB;
                                                        int length4 = jArr6.length - 2;
                                                        if (length4 >= 0) {
                                                            int i25 = 0;
                                                            while (true) {
                                                                long j9 = jArr6[i25];
                                                                long[] jArr7 = jArr6;
                                                                Object[] objArr9 = objArr8;
                                                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i26 = 8 - ((~(i25 - length4)) >>> 31);
                                                                    for (int i27 = 0; i27 < i26; i27++) {
                                                                        if ((j9 & 255) < 128) {
                                                                            catchingFishServiceBundle.CatchingFishParcelableFAB(objArr9[(i25 << 3) + i27]);
                                                                            z = true;
                                                                        }
                                                                        j9 >>= 8;
                                                                    }
                                                                    if (i26 != 8) {
                                                                        break;
                                                                    }
                                                                }
                                                                if (i25 == length4) {
                                                                    break;
                                                                }
                                                                i25++;
                                                                objArr8 = objArr9;
                                                                jArr6 = jArr7;
                                                            }
                                                        }
                                                    } else {
                                                        catchingFishServiceBundle.CatchingFishParcelableFAB(CatchingFishViewModelScope3);
                                                        z = true;
                                                    }
                                                }
                                            }
                                        }
                                        obj4 = obj5;
                                    }
                                    i6 = length;
                                    i7 = i16;
                                    i8 = i17;
                                    obj5 = obj7;
                                    j3 = j6;
                                    obj4 = obj5;
                                } else {
                                    i6 = length;
                                    i7 = i16;
                                    i8 = i17;
                                    j3 = j6;
                                    obj4 = obj7;
                                }
                                Object CatchingFishViewModelScope4 = catchingFishPayPalService4.CatchingFishViewModelScope(obj4);
                                if (CatchingFishViewModelScope4 != null) {
                                    if (CatchingFishViewModelScope4 instanceof CatchingFishServiceBundle) {
                                        CatchingFishServiceBundle catchingFishServiceBundle6 = (CatchingFishServiceBundle) CatchingFishViewModelScope4;
                                        Object[] objArr10 = catchingFishServiceBundle6.CatchingFishSnackbar;
                                        long[] jArr8 = catchingFishServiceBundle6.CatchingFishParcelableFAB;
                                        int length5 = jArr8.length - 2;
                                        if (length5 >= 0) {
                                            int i28 = 0;
                                            while (true) {
                                                long j10 = jArr8[i28];
                                                long[] jArr9 = jArr8;
                                                Object[] objArr11 = objArr10;
                                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i29 = 8 - ((~(i28 - length5)) >>> 31);
                                                    for (int i30 = 0; i30 < i29; i30++) {
                                                        if ((j10 & 255) < 128) {
                                                            catchingFishServiceBundle.CatchingFishParcelableFAB(objArr11[(i28 << 3) + i30]);
                                                            z = true;
                                                        }
                                                        j10 >>= 8;
                                                    }
                                                    if (i29 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i28 == length5) {
                                                    break;
                                                }
                                                i28++;
                                                objArr10 = objArr11;
                                                jArr8 = jArr9;
                                            }
                                        }
                                    } else {
                                        catchingFishServiceBundle.CatchingFishParcelableFAB(CatchingFishViewModelScope4);
                                        z = true;
                                    }
                                }
                                i9 = 8;
                            } else {
                                jArr2 = jArr3;
                                objArr3 = objArr4;
                                i6 = length;
                                i7 = i16;
                                i8 = i17;
                                j3 = j6;
                                i9 = i13;
                            }
                            j6 = j3 >> i9;
                            i17 = i8 + 1;
                            i13 = i9;
                            jArr3 = jArr2;
                            objArr4 = objArr3;
                            length = i6;
                            i16 = i7;
                        }
                        jArr = jArr3;
                        objArr2 = objArr4;
                        int i31 = length;
                        if (i16 != i13) {
                            break;
                        }
                        length = i31;
                    } else {
                        jArr = jArr3;
                        objArr2 = objArr4;
                    }
                    if (i15 == length) {
                        break;
                    }
                    i14 = i15 + 1;
                    jArr3 = jArr;
                    objArr4 = objArr2;
                    i13 = 8;
                }
            } else {
                j = -9187201950435737472L;
                z = false;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            Iterator it3 = set.iterator();
            z = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(next instanceof CatchingFishRetrofitPayPal) || ((CatchingFishRetrofitPayPal) next).CatchingFishDaggerWebsocket(2)) {
                    if (catchingFishPayPalService3.CatchingFishCoroutine(next)) {
                        Object CatchingFishViewModelScope5 = catchingFishPayPalService3.CatchingFishViewModelScope(next);
                        if (CatchingFishViewModelScope5 != null) {
                            if (CatchingFishViewModelScope5 instanceof CatchingFishServiceBundle) {
                                CatchingFishServiceBundle catchingFishServiceBundle7 = (CatchingFishServiceBundle) CatchingFishViewModelScope5;
                                Object[] objArr12 = catchingFishServiceBundle7.CatchingFishSnackbar;
                                long[] jArr10 = catchingFishServiceBundle7.CatchingFishParcelableFAB;
                                int length6 = jArr10.length - 2;
                                if (length6 >= 0) {
                                    int i32 = 0;
                                    while (true) {
                                        long j11 = jArr10[i32];
                                        long[] jArr11 = jArr10;
                                        Object[] objArr13 = objArr12;
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i33 = 8 - ((~(i32 - length6)) >>> 31);
                                            int i34 = 0;
                                            while (i34 < i33) {
                                                if ((j11 & 255) < 128) {
                                                    it2 = it3;
                                                    CatchingFishGsonReduxPayPal catchingFishGsonReduxPayPal3 = (CatchingFishGsonReduxPayPal) objArr13[(i32 << 3) + i34];
                                                    CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishGsonReduxPayPal3, str3);
                                                    str2 = str3;
                                                    catchingFishPayPalService2 = catchingFishPayPalService3;
                                                    if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGsonReduxPayPal3.CatchingFishViewModelFAB().CatchingFishWorkManager, hashMap.get(catchingFishGsonReduxPayPal3))) {
                                                        obj3 = next;
                                                        j2 = j11;
                                                        catchingFishFABToast.CatchingFishSnackbar(catchingFishGsonReduxPayPal3);
                                                    } else {
                                                        Object CatchingFishViewModelScope6 = catchingFishPayPalService4.CatchingFishViewModelScope(catchingFishGsonReduxPayPal3);
                                                        if (CatchingFishViewModelScope6 != null) {
                                                            if (CatchingFishViewModelScope6 instanceof CatchingFishServiceBundle) {
                                                                CatchingFishServiceBundle catchingFishServiceBundle8 = (CatchingFishServiceBundle) CatchingFishViewModelScope6;
                                                                Object[] objArr14 = catchingFishServiceBundle8.CatchingFishSnackbar;
                                                                long[] jArr12 = catchingFishServiceBundle8.CatchingFishParcelableFAB;
                                                                int length7 = jArr12.length - 2;
                                                                if (length7 >= 0) {
                                                                    j2 = j11;
                                                                    int i35 = 0;
                                                                    while (true) {
                                                                        long j12 = jArr12[i35];
                                                                        obj3 = next;
                                                                        Object[] objArr15 = objArr14;
                                                                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                            int i36 = 8 - ((~(i35 - length7)) >>> 31);
                                                                            for (int i37 = 0; i37 < i36; i37++) {
                                                                                if ((j12 & 255) < 128) {
                                                                                    catchingFishServiceBundle.CatchingFishParcelableFAB(objArr15[(i35 << 3) + i37]);
                                                                                    z = true;
                                                                                }
                                                                                j12 >>= 8;
                                                                            }
                                                                            if (i36 != 8) {
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (i35 == length7) {
                                                                            break;
                                                                        }
                                                                        i35++;
                                                                        next = obj3;
                                                                        objArr14 = objArr15;
                                                                    }
                                                                }
                                                            } else {
                                                                obj3 = next;
                                                                j2 = j11;
                                                                catchingFishServiceBundle.CatchingFishParcelableFAB(CatchingFishViewModelScope6);
                                                                z = true;
                                                            }
                                                        }
                                                        obj3 = next;
                                                    }
                                                    j11 = j2 >> 8;
                                                    i34++;
                                                    it3 = it2;
                                                    str3 = str2;
                                                    catchingFishPayPalService3 = catchingFishPayPalService2;
                                                    next = obj3;
                                                } else {
                                                    it2 = it3;
                                                    obj3 = next;
                                                    str2 = str3;
                                                    catchingFishPayPalService2 = catchingFishPayPalService3;
                                                }
                                                j2 = j11;
                                                j11 = j2 >> 8;
                                                i34++;
                                                it3 = it2;
                                                str3 = str2;
                                                catchingFishPayPalService3 = catchingFishPayPalService2;
                                                next = obj3;
                                            }
                                            it = it3;
                                            obj2 = next;
                                            str = str3;
                                            catchingFishPayPalService = catchingFishPayPalService3;
                                            if (i33 != 8) {
                                                break;
                                            }
                                        } else {
                                            it = it3;
                                            obj2 = next;
                                            str = str3;
                                            catchingFishPayPalService = catchingFishPayPalService3;
                                        }
                                        if (i32 == length6) {
                                            break;
                                        }
                                        i32++;
                                        it3 = it;
                                        objArr12 = objArr13;
                                        jArr10 = jArr11;
                                        str3 = str;
                                        catchingFishPayPalService3 = catchingFishPayPalService;
                                        next = obj2;
                                    }
                                }
                            } else {
                                it = it3;
                                obj2 = next;
                                str = str3;
                                catchingFishPayPalService = catchingFishPayPalService3;
                                CatchingFishGsonReduxPayPal catchingFishGsonReduxPayPal4 = (CatchingFishGsonReduxPayPal) CatchingFishViewModelScope5;
                                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGsonReduxPayPal4.CatchingFishViewModelFAB().CatchingFishWorkManager, hashMap.get(catchingFishGsonReduxPayPal4))) {
                                    catchingFishFABToast.CatchingFishSnackbar(catchingFishGsonReduxPayPal4);
                                } else {
                                    Object CatchingFishViewModelScope7 = catchingFishPayPalService4.CatchingFishViewModelScope(catchingFishGsonReduxPayPal4);
                                    if (CatchingFishViewModelScope7 != null) {
                                        if (CatchingFishViewModelScope7 instanceof CatchingFishServiceBundle) {
                                            CatchingFishServiceBundle catchingFishServiceBundle9 = (CatchingFishServiceBundle) CatchingFishViewModelScope7;
                                            Object[] objArr16 = catchingFishServiceBundle9.CatchingFishSnackbar;
                                            long[] jArr13 = catchingFishServiceBundle9.CatchingFishParcelableFAB;
                                            int length8 = jArr13.length - 2;
                                            if (length8 >= 0) {
                                                int i38 = 0;
                                                while (true) {
                                                    long j13 = jArr13[i38];
                                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i39 = 8 - ((~(i38 - length8)) >>> 31);
                                                        for (int i40 = 0; i40 < i39; i40++) {
                                                            if ((j13 & 255) < 128) {
                                                                catchingFishServiceBundle.CatchingFishParcelableFAB(objArr16[(i38 << 3) + i40]);
                                                                z = true;
                                                            }
                                                            j13 >>= 8;
                                                        }
                                                        if (i39 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i38 == length8) {
                                                        break;
                                                    }
                                                    i38++;
                                                }
                                            }
                                        } else {
                                            catchingFishServiceBundle.CatchingFishParcelableFAB(CatchingFishViewModelScope7);
                                            z = true;
                                        }
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        it = it3;
                        obj2 = next;
                        str = str3;
                        catchingFishPayPalService = catchingFishPayPalService3;
                        obj = obj2;
                    } else {
                        it = it3;
                        str = str3;
                        catchingFishPayPalService = catchingFishPayPalService3;
                        obj = next;
                    }
                    Object CatchingFishViewModelScope8 = catchingFishPayPalService4.CatchingFishViewModelScope(obj);
                    if (CatchingFishViewModelScope8 != null) {
                        if (CatchingFishViewModelScope8 instanceof CatchingFishServiceBundle) {
                            CatchingFishServiceBundle catchingFishServiceBundle10 = (CatchingFishServiceBundle) CatchingFishViewModelScope8;
                            Object[] objArr17 = catchingFishServiceBundle10.CatchingFishSnackbar;
                            long[] jArr14 = catchingFishServiceBundle10.CatchingFishParcelableFAB;
                            int length9 = jArr14.length - 2;
                            if (length9 >= 0) {
                                while (true) {
                                    long j14 = jArr14[i];
                                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i41 = 8 - ((~(i - length9)) >>> 31);
                                        for (int i42 = 0; i42 < i41; i42++) {
                                            if ((j14 & 255) < 128) {
                                                catchingFishServiceBundle.CatchingFishParcelableFAB(objArr17[(i << 3) + i42]);
                                                z = true;
                                            }
                                            j14 >>= 8;
                                        }
                                        if (i41 != 8) {
                                            break;
                                        }
                                    }
                                    i = i != length9 ? i + 1 : 0;
                                }
                            }
                        } else {
                            catchingFishServiceBundle.CatchingFishParcelableFAB(CatchingFishViewModelScope8);
                            z = true;
                        }
                    }
                } else {
                    it = it3;
                    str = str3;
                    catchingFishPayPalService = catchingFishPayPalService3;
                }
                it3 = it;
                str3 = str;
                catchingFishPayPalService3 = catchingFishPayPalService;
            }
        }
        int i43 = catchingFishFABToast.CatchingFishWorkManager;
        if (i43 != 0) {
            Object[] objArr18 = catchingFishFABToast.CatchingFishReduxKtor;
            int i44 = 0;
            while (i44 < i43) {
                CatchingFishGsonReduxPayPal catchingFishGsonReduxPayPal5 = (CatchingFishGsonReduxPayPal) objArr18[i44];
                int hashCode = Long.hashCode(CatchingFishIntentBundle.CatchingFishCloudMessaging().CatchingFishViewModelScope());
                Object CatchingFishViewModelScope9 = catchingFishPayPalService4.CatchingFishViewModelScope(catchingFishGsonReduxPayPal5);
                if (CatchingFishViewModelScope9 != null) {
                    boolean z4 = CatchingFishViewModelScope9 instanceof CatchingFishServiceBundle;
                    CatchingFishPayPalService catchingFishPayPalService5 = this.CatchingFishWorkManager;
                    if (z4) {
                        CatchingFishServiceBundle catchingFishServiceBundle11 = (CatchingFishServiceBundle) CatchingFishViewModelScope9;
                        Object[] objArr19 = catchingFishServiceBundle11.CatchingFishSnackbar;
                        long[] jArr15 = catchingFishServiceBundle11.CatchingFishParcelableFAB;
                        int length10 = jArr15.length - 2;
                        if (length10 >= 0) {
                            int i45 = 0;
                            while (true) {
                                long j15 = jArr15[i45];
                                i2 = i43;
                                objArr = objArr18;
                                if ((((~j15) << c) & j15 & j) != j) {
                                    int i46 = 8 - ((~(i45 - length10)) >>> 31);
                                    int i47 = 0;
                                    while (i47 < i46) {
                                        if ((j15 & 255) < 128) {
                                            i4 = i47;
                                            Object obj8 = objArr19[(i45 << 3) + i47];
                                            CatchingFishJUnitService catchingFishJUnitService2 = (CatchingFishJUnitService) catchingFishPayPalService5.CatchingFishViewModelScope(obj8);
                                            i5 = i44;
                                            if (catchingFishJUnitService2 == null) {
                                                catchingFishJUnitService = new CatchingFishJUnitService();
                                                catchingFishPayPalService5.CatchingFishOkHttp(obj8, catchingFishJUnitService);
                                            } else {
                                                catchingFishJUnitService = catchingFishJUnitService2;
                                            }
                                            CatchingFishCoroutine(catchingFishGsonReduxPayPal5, hashCode, obj8, catchingFishJUnitService);
                                        } else {
                                            i4 = i47;
                                            i5 = i44;
                                        }
                                        j15 >>= 8;
                                        i47 = i4 + 1;
                                        i44 = i5;
                                    }
                                    i3 = i44;
                                    if (i46 != 8) {
                                        break;
                                    }
                                } else {
                                    i3 = i44;
                                }
                                if (i45 != length10) {
                                    i45++;
                                    i43 = i2;
                                    objArr18 = objArr;
                                    i44 = i3;
                                }
                            }
                        } else {
                            i2 = i43;
                            objArr = objArr18;
                            i3 = i44;
                        }
                    } else {
                        i2 = i43;
                        objArr = objArr18;
                        i3 = i44;
                        CatchingFishJUnitService catchingFishJUnitService3 = (CatchingFishJUnitService) catchingFishPayPalService5.CatchingFishViewModelScope(CatchingFishViewModelScope9);
                        if (catchingFishJUnitService3 == null) {
                            catchingFishJUnitService3 = new CatchingFishJUnitService();
                            catchingFishPayPalService5.CatchingFishOkHttp(CatchingFishViewModelScope9, catchingFishJUnitService3);
                        }
                        CatchingFishCoroutine(catchingFishGsonReduxPayPal5, hashCode, CatchingFishViewModelScope9, catchingFishJUnitService3);
                    }
                } else {
                    i2 = i43;
                    objArr = objArr18;
                    i3 = i44;
                }
                i44 = i3 + 1;
                i43 = i2;
                objArr18 = objArr;
            }
            catchingFishFABToast.CatchingFishViewModelScope();
        }
        return z;
    }
}
