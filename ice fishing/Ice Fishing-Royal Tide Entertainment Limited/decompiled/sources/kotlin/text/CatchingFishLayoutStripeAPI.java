package kotlin.text;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class CatchingFishLayoutStripeAPI implements CatchingFishHandlerHandler {
    public CatchingFishLayoutStripeAPI CatchingFish;
    public final CatchingFishMoshiEspresso CatchingFishAnimationMockk;
    public final CatchingFishServiceBundle CatchingFishCloudMessaging;
    public final CatchingFishMVPExoPlayer CatchingFishCoroutineFlow;
    public final CatchingFishExoPlayerBundle CatchingFishDaggerHiltFAB;
    public final CatchingFishAsyncTaskDagger CatchingFishDaggerWebsocket;
    public final CatchingFishServiceBundle CatchingFishEspressoTesting;
    public final CatchingFishPayPalService CatchingFishFragmentHandler;
    public int CatchingFishJetpackCompose;
    public final CatchingFishMVVMMVIRoom CatchingFishLayout;
    public boolean CatchingFishNavigation;
    public final CatchingFishPayPalService CatchingFishOkHttp;
    public int CatchingFishParcelableFlux;
    public final CatchingFishMVIWebSocket CatchingFishReduxKtor;
    public CatchingFishPayPalService CatchingFishRoomDatabase;
    public final CatchingFishSharedFlowMVI CatchingFishSpannableWidget;
    public final CatchingFishPayPalService CatchingFishStateLiveData;
    public final CatchingFishMoshiEspresso CatchingFishUnitTesting;
    public final CatchingFishAppCompatHilt CatchingFishViewModelFAB;
    public final AtomicReference CatchingFishWorkManager = new AtomicReference(null);
    public final Object CatchingFishViewModelScope = new Object();

    public CatchingFishLayoutStripeAPI(CatchingFishMVIWebSocket catchingFishMVIWebSocket, CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger) {
        this.CatchingFishReduxKtor = catchingFishMVIWebSocket;
        this.CatchingFishDaggerWebsocket = catchingFishAsyncTaskDagger;
        CatchingFishAppCompatHilt catchingFishAppCompatHilt = new CatchingFishAppCompatHilt(new CatchingFishServiceBundle());
        this.CatchingFishViewModelFAB = catchingFishAppCompatHilt;
        CatchingFishMVVMMVIRoom catchingFishMVVMMVIRoom = new CatchingFishMVVMMVIRoom();
        if (catchingFishMVIWebSocket.CatchingFishCoroutine()) {
            catchingFishMVVMMVIRoom.CatchingFishUnitTesting = new CatchingFishLayoutGsonRoom();
        }
        if (catchingFishMVIWebSocket.CatchingFishDaggerWebsocket()) {
            catchingFishMVVMMVIRoom.CatchingFishSnackbar();
        }
        this.CatchingFishLayout = catchingFishMVVMMVIRoom;
        this.CatchingFishFragmentHandler = CatchingFishLayoutRoom.CatchingFishFragmentHandler();
        this.CatchingFishCloudMessaging = new CatchingFishServiceBundle();
        this.CatchingFishEspressoTesting = new CatchingFishServiceBundle();
        this.CatchingFishOkHttp = CatchingFishLayoutRoom.CatchingFishFragmentHandler();
        CatchingFishMoshiEspresso catchingFishMoshiEspresso = new CatchingFishMoshiEspresso();
        this.CatchingFishUnitTesting = catchingFishMoshiEspresso;
        CatchingFishMoshiEspresso catchingFishMoshiEspresso2 = new CatchingFishMoshiEspresso();
        this.CatchingFishAnimationMockk = catchingFishMoshiEspresso2;
        this.CatchingFishStateLiveData = CatchingFishLayoutRoom.CatchingFishFragmentHandler();
        this.CatchingFishRoomDatabase = CatchingFishLayoutRoom.CatchingFishFragmentHandler();
        CatchingFishMVPExoPlayer catchingFishMVPExoPlayer = new CatchingFishMVPExoPlayer(16, catchingFishMVIWebSocket);
        this.CatchingFishCoroutineFlow = catchingFishMVPExoPlayer;
        this.CatchingFishDaggerHiltFAB = new CatchingFishExoPlayerBundle();
        CatchingFishSharedFlowMVI catchingFishSharedFlowMVI = new CatchingFishSharedFlowMVI(catchingFishAsyncTaskDagger, catchingFishMVIWebSocket, catchingFishMVVMMVIRoom, catchingFishAppCompatHilt, catchingFishMoshiEspresso, catchingFishMoshiEspresso2, catchingFishMVPExoPlayer, this);
        catchingFishMVIWebSocket.CatchingFishOkHttp(catchingFishSharedFlowMVI);
        this.CatchingFishSpannableWidget = catchingFishSharedFlowMVI;
        CatchingFishLifecycleRedux catchingFishLifecycleRedux = CatchingFishMVIRoomDatabase.CatchingFishParcelableFAB;
    }

    public final boolean CatchingFish() {
        boolean CatchingFishMVVMAppCompat;
        synchronized (this.CatchingFishViewModelScope) {
            CatchingFishFragmentHandler();
            try {
                CatchingFishPayPalService catchingFishPayPalService = this.CatchingFishRoomDatabase;
                this.CatchingFishRoomDatabase = CatchingFishLayoutRoom.CatchingFishFragmentHandler();
                try {
                    CatchingFishSharedFlowMVI catchingFishSharedFlowMVI = this.CatchingFishSpannableWidget;
                    CatchingFishMoshiEspresso catchingFishMoshiEspresso = catchingFishSharedFlowMVI.CatchingFishDaggerWebsocket;
                    if (!catchingFishMoshiEspresso.CatchingFishParcelableFAB.CatchingFishAnimation()) {
                        CatchingFishUnitTestingFlux.CatchingFishCoroutine("Expected applyChanges() to have been called");
                    }
                    if (catchingFishPayPalService.CatchingFishDaggerWebsocket > 0 || !catchingFishSharedFlowMVI.CatchingFishNavigation.isEmpty()) {
                        catchingFishSharedFlowMVI.CatchingFishUnitTesting(catchingFishPayPalService, null);
                        CatchingFishMVVMAppCompat = catchingFishMoshiEspresso.CatchingFishParcelableFAB.CatchingFishMVVMAppCompat();
                    } else {
                        CatchingFishMVVMAppCompat = false;
                    }
                    if (!CatchingFishMVVMAppCompat) {
                        CatchingFishCloudMessaging();
                    }
                } catch (Throwable th) {
                    this.CatchingFishRoomDatabase = catchingFishPayPalService;
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    if (!this.CatchingFishViewModelFAB.CatchingFishReduxKtor.CatchingFishViewModelScope()) {
                        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle = this.CatchingFishDaggerHiltFAB;
                        try {
                            catchingFishExoPlayerBundle.CatchingFishLayout(this.CatchingFishViewModelFAB, this.CatchingFishSpannableWidget.CatchingFishDaggerHiltFAB());
                            catchingFishExoPlayerBundle.CatchingFishDaggerWebsocket();
                            catchingFishExoPlayerBundle.CatchingFishSnackbar();
                        } catch (Throwable th3) {
                            catchingFishExoPlayerBundle.CatchingFishSnackbar();
                            throw th3;
                        }
                    }
                    throw th2;
                } catch (Throwable th4) {
                    CatchingFishParcelableFAB();
                    throw th4;
                }
            }
        }
        return CatchingFishMVVMAppCompat;
    }

    public final void CatchingFishAnimationMockk() {
        CatchingFishLayoutStripeAPI catchingFishLayoutStripeAPI;
        synchronized (this.CatchingFishViewModelScope) {
            try {
                for (Object obj : this.CatchingFishLayout.CatchingFishWorkManager) {
                    CatchingFishHiltFAB catchingFishHiltFAB = obj instanceof CatchingFishHiltFAB ? (CatchingFishHiltFAB) obj : null;
                    if (catchingFishHiltFAB != null && (catchingFishLayoutStripeAPI = catchingFishHiltFAB.CatchingFishParcelableFAB) != null) {
                        catchingFishLayoutStripeAPI.CatchingFishUnitTesting(catchingFishHiltFAB, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void CatchingFishCloudMessaging() {
        AtomicReference atomicReference = this.CatchingFishWorkManager;
        Object andSet = atomicReference.getAndSet(null);
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(andSet, CatchingFishFirebaseDagger.CatchingFishDaggerWebsocket)) {
            return;
        }
        if (andSet instanceof Set) {
            CatchingFishCoroutine((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                CatchingFishCoroutine(set, false);
            }
            return;
        }
        if (andSet == null) {
            CatchingFishUnitTestingFlux.CatchingFishReduxKtor("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new CatchingFishBiometricView();
        }
        CatchingFishUnitTestingFlux.CatchingFishReduxKtor("corrupt pendingModifications drain: " + atomicReference);
        throw new CatchingFishBiometricView();
    }

    public final void CatchingFishCoroutine(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        int i;
        long[] jArr;
        String str;
        long[] jArr2;
        String str2;
        long j4;
        boolean CatchingFishCoroutine;
        String str3;
        long j5;
        long[] jArr3;
        long[] jArr4;
        int i2;
        long j6;
        boolean z2;
        int i3;
        long j7;
        long[] jArr5;
        long[] jArr6;
        char c2;
        long j8;
        int i4;
        int i5;
        long[] jArr7;
        boolean z3 = set instanceof CatchingFishCardViewRealm;
        CatchingFishPayPalService catchingFishPayPalService = this.CatchingFishOkHttp;
        Object obj = null;
        int i6 = 8;
        if (z3) {
            CatchingFishServiceBundle catchingFishServiceBundle = ((CatchingFishCardViewRealm) set).CatchingFishReduxKtor;
            Object[] objArr = catchingFishServiceBundle.CatchingFishSnackbar;
            long[] jArr8 = catchingFishServiceBundle.CatchingFishParcelableFAB;
            int length = jArr8.length - 2;
            if (length >= 0) {
                int i7 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr8[i7];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        int i9 = 0;
                        while (i9 < i8) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i7 << 3) + i9];
                                c2 = c3;
                                if (obj2 instanceof CatchingFishHiltFAB) {
                                    ((CatchingFishHiltFAB) obj2).CatchingFishCoroutine(obj);
                                } else {
                                    CatchingFishSnackbar(obj2, z);
                                    Object CatchingFishViewModelScope = catchingFishPayPalService.CatchingFishViewModelScope(obj2);
                                    if (CatchingFishViewModelScope != null) {
                                        if (CatchingFishViewModelScope instanceof CatchingFishServiceBundle) {
                                            CatchingFishServiceBundle catchingFishServiceBundle2 = (CatchingFishServiceBundle) CatchingFishViewModelScope;
                                            Object[] objArr2 = catchingFishServiceBundle2.CatchingFishSnackbar;
                                            long[] jArr9 = catchingFishServiceBundle2.CatchingFishParcelableFAB;
                                            int length2 = jArr9.length - 2;
                                            if (length2 >= 0) {
                                                int i10 = i6;
                                                i4 = length;
                                                int i11 = 0;
                                                while (true) {
                                                    long j10 = jArr9[i11];
                                                    j8 = j9;
                                                    long[] jArr10 = jArr9;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                                        int i13 = 0;
                                                        while (i13 < i12) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr7 = jArr8;
                                                                CatchingFishSnackbar((CatchingFishGsonReduxPayPal) objArr2[(i11 << 3) + i13], z);
                                                            } else {
                                                                jArr7 = jArr8;
                                                            }
                                                            j10 >>= i10;
                                                            i13++;
                                                            jArr8 = jArr7;
                                                        }
                                                        jArr6 = jArr8;
                                                        if (i12 != i10) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr6 = jArr8;
                                                    }
                                                    if (i11 == length2) {
                                                        break;
                                                    }
                                                    i11++;
                                                    jArr9 = jArr10;
                                                    j9 = j8;
                                                    jArr8 = jArr6;
                                                    i10 = 8;
                                                }
                                            }
                                        } else {
                                            jArr6 = jArr8;
                                            j8 = j9;
                                            i4 = length;
                                            CatchingFishSnackbar((CatchingFishGsonReduxPayPal) CatchingFishViewModelScope, z);
                                        }
                                        i5 = 8;
                                    }
                                }
                                jArr6 = jArr8;
                                j8 = j9;
                                i4 = length;
                                i5 = 8;
                            } else {
                                jArr6 = jArr8;
                                c2 = c3;
                                j8 = j9;
                                i4 = length;
                                i5 = i6;
                            }
                            j9 = j8 >> i5;
                            i9++;
                            length = i4;
                            i6 = i5;
                            c3 = c2;
                            jArr8 = jArr6;
                            obj = null;
                        }
                        jArr5 = jArr8;
                        c = c3;
                        int i14 = length;
                        if (i8 != i6) {
                            break;
                        } else {
                            length = i14;
                        }
                    } else {
                        jArr5 = jArr8;
                        c = 7;
                    }
                    if (i7 == length) {
                        break;
                    }
                    i7++;
                    jArr8 = jArr5;
                    obj = null;
                    i6 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof CatchingFishHiltFAB) {
                    ((CatchingFishHiltFAB) obj3).CatchingFishCoroutine(null);
                } else {
                    CatchingFishSnackbar(obj3, z);
                    Object CatchingFishViewModelScope2 = catchingFishPayPalService.CatchingFishViewModelScope(obj3);
                    if (CatchingFishViewModelScope2 != null) {
                        if (CatchingFishViewModelScope2 instanceof CatchingFishServiceBundle) {
                            CatchingFishServiceBundle catchingFishServiceBundle3 = (CatchingFishServiceBundle) CatchingFishViewModelScope2;
                            Object[] objArr3 = catchingFishServiceBundle3.CatchingFishSnackbar;
                            long[] jArr11 = catchingFishServiceBundle3.CatchingFishParcelableFAB;
                            int length3 = jArr11.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j11 = jArr11[i];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i15 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            if ((j11 & 255) < 128) {
                                                CatchingFishSnackbar((CatchingFishGsonReduxPayPal) objArr3[(i << 3) + i16], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i15 != 8) {
                                            break;
                                        }
                                    }
                                    i = i != length3 ? i + 1 : 0;
                                }
                            }
                        } else {
                            CatchingFishSnackbar((CatchingFishGsonReduxPayPal) CatchingFishViewModelScope2, z);
                        }
                    }
                }
            }
        }
        String str4 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>";
        CatchingFishPayPalService catchingFishPayPalService2 = this.CatchingFishFragmentHandler;
        CatchingFishServiceBundle catchingFishServiceBundle4 = this.CatchingFishCloudMessaging;
        if (z) {
            CatchingFishServiceBundle catchingFishServiceBundle5 = this.CatchingFishEspressoTesting;
            if (catchingFishServiceBundle5.CatchingFishViewModelFAB()) {
                long[] jArr12 = catchingFishPayPalService2.CatchingFishParcelableFAB;
                int length4 = jArr12.length - 2;
                if (length4 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j12 = jArr12[i17];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i18 = 8 - ((~(i17 - length4)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j12 & j2) < j) {
                                    int i20 = (i17 << 3) + i19;
                                    Object obj4 = catchingFishPayPalService2.CatchingFishSnackbar[i20];
                                    Object obj5 = catchingFishPayPalService2.CatchingFishCoroutine[i20];
                                    if (obj5 instanceof CatchingFishServiceBundle) {
                                        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj5, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                        CatchingFishServiceBundle catchingFishServiceBundle6 = (CatchingFishServiceBundle) obj5;
                                        Object[] objArr4 = catchingFishServiceBundle6.CatchingFishSnackbar;
                                        long[] jArr13 = catchingFishServiceBundle6.CatchingFishParcelableFAB;
                                        int length5 = jArr13.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i21 = 0;
                                            while (true) {
                                                long j13 = jArr13[i21];
                                                jArr4 = jArr12;
                                                i2 = length4;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i22 = 8 - ((~(i21 - length5)) >>> 31);
                                                    for (int i23 = 0; i23 < i22; i23 = i3 + 1) {
                                                        if ((j13 & j2) < j) {
                                                            i3 = i23;
                                                            int i24 = (i21 << 3) + i3;
                                                            j7 = j13;
                                                            CatchingFishHiltFAB catchingFishHiltFAB = (CatchingFishHiltFAB) objArr4[i24];
                                                            if (catchingFishServiceBundle5.CatchingFishCoroutine(catchingFishHiltFAB) || catchingFishServiceBundle4.CatchingFishCoroutine(catchingFishHiltFAB)) {
                                                                catchingFishServiceBundle6.CatchingFishEspressoTesting(i24);
                                                            }
                                                        } else {
                                                            i3 = i23;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                    }
                                                    if (i22 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i21 == length5) {
                                                    break;
                                                }
                                                i21++;
                                                length4 = i2;
                                                jArr12 = jArr4;
                                            }
                                        } else {
                                            jArr4 = jArr12;
                                            i2 = length4;
                                            j6 = j12;
                                        }
                                        z2 = catchingFishServiceBundle6.CatchingFishViewModelScope();
                                    } else {
                                        jArr4 = jArr12;
                                        i2 = length4;
                                        j6 = j12;
                                        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        CatchingFishHiltFAB catchingFishHiltFAB2 = (CatchingFishHiltFAB) obj5;
                                        z2 = catchingFishServiceBundle5.CatchingFishCoroutine(catchingFishHiltFAB2) || catchingFishServiceBundle4.CatchingFishCoroutine(catchingFishHiltFAB2);
                                    }
                                    if (z2) {
                                        catchingFishPayPalService2.CatchingFishEspressoTesting(i20);
                                    }
                                } else {
                                    jArr4 = jArr12;
                                    i2 = length4;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i19++;
                                length4 = i2;
                                jArr12 = jArr4;
                            }
                            jArr3 = jArr12;
                            int i25 = length4;
                            if (i18 != 8) {
                                break;
                            } else {
                                length4 = i25;
                            }
                        } else {
                            jArr3 = jArr12;
                        }
                        if (i17 == length4) {
                            break;
                        }
                        i17++;
                        jArr12 = jArr3;
                    }
                }
                catchingFishServiceBundle5.CatchingFishSnackbar();
                CatchingFishViewModelFAB();
                return;
            }
        }
        if (catchingFishServiceBundle4.CatchingFishViewModelFAB()) {
            long[] jArr14 = catchingFishPayPalService2.CatchingFishParcelableFAB;
            int length6 = jArr14.length - 2;
            if (length6 >= 0) {
                int i26 = 0;
                while (true) {
                    long j14 = jArr14[i26];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i27 = 8 - ((~(i26 - length6)) >>> 31);
                        int i28 = 0;
                        while (i28 < i27) {
                            if ((j14 & j2) < j) {
                                int i29 = (i26 << 3) + i28;
                                Object obj6 = catchingFishPayPalService2.CatchingFishSnackbar[i29];
                                Object obj7 = catchingFishPayPalService2.CatchingFishCoroutine[i29];
                                if (obj7 instanceof CatchingFishServiceBundle) {
                                    CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj7, str4);
                                    CatchingFishServiceBundle catchingFishServiceBundle7 = (CatchingFishServiceBundle) obj7;
                                    Object[] objArr5 = catchingFishServiceBundle7.CatchingFishSnackbar;
                                    long[] jArr15 = catchingFishServiceBundle7.CatchingFishParcelableFAB;
                                    int length7 = jArr15.length - 2;
                                    jArr2 = jArr14;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i30 = 0;
                                        while (true) {
                                            long j15 = jArr15[i30];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr16 = jArr15;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i31 = 8 - ((~(i30 - length7)) >>> 31);
                                                int i32 = 0;
                                                while (i32 < i31) {
                                                    if ((j15 & j2) < j) {
                                                        str3 = str4;
                                                        int i33 = (i30 << 3) + i32;
                                                        j5 = j15;
                                                        if (catchingFishServiceBundle4.CatchingFishCoroutine((CatchingFishHiltFAB) objArr6[i33])) {
                                                            catchingFishServiceBundle7.CatchingFishEspressoTesting(i33);
                                                        }
                                                    } else {
                                                        str3 = str4;
                                                        j5 = j15;
                                                    }
                                                    i32++;
                                                    str4 = str3;
                                                    j15 = j5 >> 8;
                                                }
                                                str2 = str4;
                                                if (i31 != 8) {
                                                    break;
                                                }
                                            } else {
                                                str2 = str4;
                                            }
                                            if (i30 == length7) {
                                                break;
                                            }
                                            i30++;
                                            objArr5 = objArr6;
                                            jArr15 = jArr16;
                                            str4 = str2;
                                        }
                                    } else {
                                        str2 = str4;
                                        j4 = j14;
                                    }
                                    CatchingFishCoroutine = catchingFishServiceBundle7.CatchingFishViewModelScope();
                                } else {
                                    jArr2 = jArr14;
                                    str2 = str4;
                                    j4 = j14;
                                    CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    CatchingFishCoroutine = catchingFishServiceBundle4.CatchingFishCoroutine((CatchingFishHiltFAB) obj7);
                                }
                                if (CatchingFishCoroutine) {
                                    catchingFishPayPalService2.CatchingFishEspressoTesting(i29);
                                }
                            } else {
                                jArr2 = jArr14;
                                str2 = str4;
                                j4 = j14;
                            }
                            i28++;
                            j14 = j4 >> 8;
                            jArr14 = jArr2;
                            str4 = str2;
                        }
                        jArr = jArr14;
                        str = str4;
                        if (i27 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr14;
                        str = str4;
                    }
                    if (i26 == length6) {
                        break;
                    }
                    i26++;
                    jArr14 = jArr;
                    str4 = str;
                }
            }
            CatchingFishViewModelFAB();
            catchingFishServiceBundle4.CatchingFishSnackbar();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishCoroutineFlow(Object obj) {
        CatchingFishHiltFAB CatchingFishCoroutineFlow;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        CatchingFishSharedFlowMVI catchingFishSharedFlowMVI = this.CatchingFishSpannableWidget;
        if (catchingFishSharedFlowMVI.CatchingFishCardViewRealm > 0 || (CatchingFishCoroutineFlow = catchingFishSharedFlowMVI.CatchingFishCoroutineFlow()) == null) {
            return;
        }
        boolean z4 = true;
        int i3 = CatchingFishCoroutineFlow.CatchingFishSnackbar | 1;
        CatchingFishCoroutineFlow.CatchingFishSnackbar = i3;
        if ((i3 & 32) == 0) {
            CatchingFishJUnitService catchingFishJUnitService = CatchingFishCoroutineFlow.CatchingFishWorkManager;
            if (catchingFishJUnitService == null) {
                catchingFishJUnitService = new CatchingFishJUnitService();
                CatchingFishCoroutineFlow.CatchingFishWorkManager = catchingFishJUnitService;
            }
            int i4 = CatchingFishCoroutineFlow.CatchingFishDaggerWebsocket;
            int CatchingFishCoroutine = catchingFishJUnitService.CatchingFishCoroutine(obj);
            if (CatchingFishCoroutine < 0) {
                CatchingFishCoroutine = ~CatchingFishCoroutine;
                i = -1;
            } else {
                i = catchingFishJUnitService.CatchingFishCoroutine[CatchingFishCoroutine];
            }
            catchingFishJUnitService.CatchingFishSnackbar[CatchingFishCoroutine] = obj;
            catchingFishJUnitService.CatchingFishCoroutine[CatchingFishCoroutine] = i4;
            if (i == CatchingFishCoroutineFlow.CatchingFishDaggerWebsocket) {
                z = true;
                this.CatchingFishCoroutineFlow.getClass();
                if (z) {
                    if (obj instanceof CatchingFishRetrofitPayPal) {
                        ((CatchingFishRetrofitPayPal) obj).CatchingFishWorkManager(1);
                    }
                    CatchingFishLayoutRoom.CatchingFishViewModelScope(this.CatchingFishFragmentHandler, obj, CatchingFishCoroutineFlow);
                    if (obj instanceof CatchingFishGsonReduxPayPal) {
                        CatchingFishGsonReduxPayPal catchingFishGsonReduxPayPal = (CatchingFishGsonReduxPayPal) obj;
                        CatchingFishMVPParcelable CatchingFishViewModelFAB = catchingFishGsonReduxPayPal.CatchingFishViewModelFAB();
                        CatchingFishPayPalService catchingFishPayPalService = this.CatchingFishOkHttp;
                        CatchingFishLayoutRoom.CatchingFishCardViewView(catchingFishPayPalService, obj);
                        CatchingFishJUnitService catchingFishJUnitService2 = CatchingFishViewModelFAB.CatchingFishDaggerWebsocket;
                        Object[] objArr = catchingFishJUnitService2.CatchingFishSnackbar;
                        long[] jArr = catchingFishJUnitService2.CatchingFishParcelableFAB;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j = jArr[i5];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8;
                                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j & 255) < 128) {
                                            i2 = i6;
                                            CatchingFishJUnitViewPager catchingFishJUnitViewPager = (CatchingFishJUnitViewPager) objArr[(i5 << 3) + i8];
                                            if (catchingFishJUnitViewPager instanceof CatchingFishRetrofitPayPal) {
                                                z3 = true;
                                                ((CatchingFishRetrofitPayPal) catchingFishJUnitViewPager).CatchingFishWorkManager(1);
                                            } else {
                                                z3 = true;
                                            }
                                            CatchingFishLayoutRoom.CatchingFishViewModelScope(catchingFishPayPalService, catchingFishJUnitViewPager, obj);
                                        } else {
                                            z3 = z4;
                                            i2 = i6;
                                        }
                                        j >>= i2;
                                        i8++;
                                        z4 = z3;
                                        i6 = i2;
                                    }
                                    z2 = z4;
                                    if (i7 != i6) {
                                        break;
                                    }
                                } else {
                                    z2 = z4;
                                }
                                if (i5 == length) {
                                    break;
                                }
                                i5++;
                                z4 = z2;
                            }
                        }
                        Object obj2 = CatchingFishViewModelFAB.CatchingFishWorkManager;
                        CatchingFishPayPalService catchingFishPayPalService2 = CatchingFishCoroutineFlow.CatchingFishViewModelScope;
                        if (catchingFishPayPalService2 == null) {
                            catchingFishPayPalService2 = new CatchingFishPayPalService();
                            CatchingFishCoroutineFlow.CatchingFishViewModelScope = catchingFishPayPalService2;
                        }
                        catchingFishPayPalService2.CatchingFishOkHttp(catchingFishGsonReduxPayPal, obj2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z = false;
        this.CatchingFishCoroutineFlow.getClass();
        if (z) {
        }
    }

    public final void CatchingFishDaggerHiltFAB(Object obj) {
        synchronized (this.CatchingFishViewModelScope) {
            try {
                CatchingFishRoomDatabase(obj);
                Object CatchingFishViewModelScope = this.CatchingFishOkHttp.CatchingFishViewModelScope(obj);
                if (CatchingFishViewModelScope != null) {
                    if (CatchingFishViewModelScope instanceof CatchingFishServiceBundle) {
                        CatchingFishServiceBundle catchingFishServiceBundle = (CatchingFishServiceBundle) CatchingFishViewModelScope;
                        Object[] objArr = catchingFishServiceBundle.CatchingFishSnackbar;
                        long[] jArr = catchingFishServiceBundle.CatchingFishParcelableFAB;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            CatchingFishRoomDatabase((CatchingFishGsonReduxPayPal) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                }
                                if (i == length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else {
                        CatchingFishRoomDatabase((CatchingFishGsonReduxPayPal) CatchingFishViewModelScope);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x01d8 A[Catch: all -> 0x01dc, TRY_LEAVE, TryCatch #8 {all -> 0x01dc, blocks: (B:140:0x01d0, B:142:0x01d8), top: B:139:0x01d0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishDaggerWebsocket(CatchingFishMoshiEspresso catchingFishMoshiEspresso) {
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle;
        long[] jArr;
        int i;
        long[] jArr2;
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle2;
        long j;
        char c;
        long j2;
        int i2;
        boolean z;
        CatchingFishMoshiEspresso catchingFishMoshiEspresso2 = this.CatchingFishAnimationMockk;
        CatchingFishSharedFlowMVI catchingFishSharedFlowMVI = this.CatchingFishSpannableWidget;
        CatchingFishPayPalFirebase CatchingFishDaggerHiltFAB = catchingFishSharedFlowMVI.CatchingFishDaggerHiltFAB();
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle3 = this.CatchingFishDaggerHiltFAB;
        catchingFishExoPlayerBundle3.CatchingFishLayout(this.CatchingFishViewModelFAB, CatchingFishDaggerHiltFAB);
        try {
            if (catchingFishMoshiEspresso.CatchingFishParcelableFAB.CatchingFishAnimation()) {
                try {
                    if (catchingFishMoshiEspresso2.CatchingFishParcelableFAB.CatchingFishAnimation()) {
                        catchingFishExoPlayerBundle3.CatchingFishDaggerWebsocket();
                    }
                    return;
                } finally {
                }
            }
            try {
                Trace.beginSection("Compose:applyChanges");
                try {
                    CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = this.CatchingFishDaggerWebsocket;
                    CatchingFishGoogleMapsMVP CatchingFishDaggerWebsocket = this.CatchingFishLayout.CatchingFishDaggerWebsocket();
                    int i3 = 0;
                    try {
                        catchingFishMoshiEspresso.CatchingFishStateFlow(catchingFishAsyncTaskDagger, CatchingFishDaggerWebsocket, catchingFishExoPlayerBundle3, catchingFishSharedFlowMVI.CatchingFishDaggerHiltFAB());
                        CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket(true);
                        catchingFishAsyncTaskDagger.CatchingFishAppCompat();
                        Trace.endSection();
                        catchingFishExoPlayerBundle3.CatchingFishWorkManager();
                        CatchingFishFABToast catchingFishFABToast = (CatchingFishFABToast) catchingFishExoPlayerBundle3.CatchingFishViewModelFAB;
                        if (catchingFishFABToast.CatchingFishWorkManager != 0) {
                            Trace.beginSection("Compose:sideeffects");
                            try {
                                Object[] objArr = catchingFishFABToast.CatchingFishReduxKtor;
                                int i4 = catchingFishFABToast.CatchingFishWorkManager;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    ((CatchingFishJUnitGlide) objArr[i5]).CatchingFishParcelableFAB();
                                }
                                catchingFishFABToast.CatchingFishViewModelScope();
                                Trace.endSection();
                            } finally {
                                Trace.endSection();
                            }
                        }
                        if (this.CatchingFishNavigation) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.CatchingFishNavigation = false;
                                CatchingFishPayPalService catchingFishPayPalService = this.CatchingFishFragmentHandler;
                                long[] jArr3 = catchingFishPayPalService.CatchingFishParcelableFAB;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i6 = 0;
                                    while (true) {
                                        long j3 = jArr3[i6];
                                        char c2 = 7;
                                        long j4 = -9187201950435737472L;
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i7 = 8;
                                            int i8 = 8 - ((~(i6 - length)) >>> 31);
                                            int i9 = i3;
                                            while (i9 < i8) {
                                                if ((j3 & 255) < 128) {
                                                    c = c2;
                                                    int i10 = (i6 << 3) + i9;
                                                    j2 = j4;
                                                    Object obj = catchingFishPayPalService.CatchingFishSnackbar[i10];
                                                    Object obj2 = catchingFishPayPalService.CatchingFishCoroutine[i10];
                                                    if (obj2 instanceof CatchingFishServiceBundle) {
                                                        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                                        CatchingFishServiceBundle catchingFishServiceBundle = (CatchingFishServiceBundle) obj2;
                                                        Object[] objArr2 = catchingFishServiceBundle.CatchingFishSnackbar;
                                                        long[] jArr4 = catchingFishServiceBundle.CatchingFishParcelableFAB;
                                                        int i11 = i7;
                                                        int length2 = jArr4.length - 2;
                                                        i = i9;
                                                        jArr2 = jArr3;
                                                        catchingFishExoPlayerBundle2 = catchingFishExoPlayerBundle3;
                                                        if (length2 >= 0) {
                                                            int i12 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j5 = jArr4[i12];
                                                                    j = j3;
                                                                    if ((((~j5) << c) & j5 & j2) != j2) {
                                                                        int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                                        for (int i14 = 0; i14 < i13; i14++) {
                                                                            if ((j5 & 255) < 128) {
                                                                                int i15 = (i12 << 3) + i14;
                                                                                if (!((CatchingFishHiltFAB) objArr2[i15]).CatchingFishSnackbar()) {
                                                                                    catchingFishServiceBundle.CatchingFishEspressoTesting(i15);
                                                                                }
                                                                            }
                                                                            j5 >>= i11;
                                                                        }
                                                                        if (i13 != i11) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i12 == length2) {
                                                                        break;
                                                                    }
                                                                    i12++;
                                                                    i11 = 8;
                                                                    j3 = j;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j3;
                                                        }
                                                        z = catchingFishServiceBundle.CatchingFishViewModelScope();
                                                    } else {
                                                        i = i9;
                                                        jArr2 = jArr3;
                                                        catchingFishExoPlayerBundle2 = catchingFishExoPlayerBundle3;
                                                        j = j3;
                                                        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                        z = !((CatchingFishHiltFAB) obj2).CatchingFishSnackbar();
                                                    }
                                                    if (z) {
                                                        catchingFishPayPalService.CatchingFishEspressoTesting(i10);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i9;
                                                    jArr2 = jArr3;
                                                    catchingFishExoPlayerBundle2 = catchingFishExoPlayerBundle3;
                                                    j = j3;
                                                    c = c2;
                                                    j2 = j4;
                                                    i2 = i7;
                                                }
                                                j3 = j >> i2;
                                                i9 = i + 1;
                                                i7 = i2;
                                                c2 = c;
                                                j4 = j2;
                                                catchingFishExoPlayerBundle3 = catchingFishExoPlayerBundle2;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            catchingFishExoPlayerBundle = catchingFishExoPlayerBundle3;
                                            if (i8 != i7) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            catchingFishExoPlayerBundle = catchingFishExoPlayerBundle3;
                                        }
                                        if (i6 == length) {
                                            break;
                                        }
                                        i6++;
                                        catchingFishExoPlayerBundle3 = catchingFishExoPlayerBundle;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    catchingFishExoPlayerBundle = catchingFishExoPlayerBundle3;
                                }
                                CatchingFishViewModelFAB();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            catchingFishExoPlayerBundle = catchingFishExoPlayerBundle3;
                        }
                        try {
                            if (catchingFishMoshiEspresso2.CatchingFishParcelableFAB.CatchingFishAnimation()) {
                                catchingFishExoPlayerBundle.CatchingFishDaggerWebsocket();
                            }
                        } finally {
                            catchingFishExoPlayerBundle.CatchingFishSnackbar();
                        }
                    } catch (Throwable th3) {
                        try {
                            CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                try {
                    if (catchingFishMoshiEspresso2.CatchingFishParcelableFAB.CatchingFishAnimation()) {
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th7) {
            th = th7;
            if (catchingFishMoshiEspresso2.CatchingFishParcelableFAB.CatchingFishAnimation()) {
                catchingFishExoPlayerBundle3.CatchingFishDaggerWebsocket();
            }
            throw th;
        }
    }

    public final void CatchingFishEspressoTesting() {
        CatchingFishHandlerRealm catchingFishHandlerRealm = CatchingFishHandlerRealm.CatchingFishReduxKtor;
        AtomicReference atomicReference = this.CatchingFishWorkManager;
        Object andSet = atomicReference.getAndSet(catchingFishHandlerRealm);
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(andSet, CatchingFishFirebaseDagger.CatchingFishDaggerWebsocket) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            CatchingFishCoroutine((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            CatchingFishUnitTestingFlux.CatchingFishReduxKtor("corrupt pendingModifications drain: " + atomicReference);
            throw new CatchingFishBiometricView();
        }
        for (Set set : (Set[]) andSet) {
            CatchingFishCoroutine(set, false);
        }
    }

    public final void CatchingFishFragmentHandler() {
        Object obj = CatchingFishFirebaseDagger.CatchingFishDaggerWebsocket;
        AtomicReference atomicReference = this.CatchingFishWorkManager;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                CatchingFishUnitTestingFlux.CatchingFishReduxKtor("pending composition has not been applied");
                throw new CatchingFishBiometricView();
            }
            if (andSet instanceof Set) {
                CatchingFishCoroutine((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                CatchingFishUnitTestingFlux.CatchingFishReduxKtor("corrupt pendingModifications drain: " + atomicReference);
                throw new CatchingFishBiometricView();
            }
            for (Set set : (Set[]) andSet) {
                CatchingFishCoroutine(set, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Set[]] */
    public final void CatchingFishJetpackCompose(CatchingFishCardViewRealm catchingFishCardViewRealm) {
        CatchingFishCardViewRealm catchingFishCardViewRealm2;
        while (true) {
            Object obj = this.CatchingFishWorkManager.get();
            if (obj == null || obj.equals(CatchingFishFirebaseDagger.CatchingFishDaggerWebsocket)) {
                catchingFishCardViewRealm2 = catchingFishCardViewRealm;
            } else if (obj instanceof Set) {
                catchingFishCardViewRealm2 = new Set[]{obj, catchingFishCardViewRealm};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.CatchingFishWorkManager).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = catchingFishCardViewRealm;
                catchingFishCardViewRealm2 = copyOf;
            }
            AtomicReference atomicReference = this.CatchingFishWorkManager;
            while (!atomicReference.compareAndSet(obj, catchingFishCardViewRealm2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.CatchingFishViewModelScope) {
                    CatchingFishCloudMessaging();
                }
                return;
            }
            return;
        }
    }

    public final void CatchingFishLayout(CatchingFishLifecycleRedux catchingFishLifecycleRedux) {
        try {
            synchronized (this.CatchingFishViewModelScope) {
                CatchingFishFragmentHandler();
                CatchingFishPayPalService catchingFishPayPalService = this.CatchingFishRoomDatabase;
                this.CatchingFishRoomDatabase = CatchingFishLayoutRoom.CatchingFishFragmentHandler();
                try {
                    CatchingFishSharedFlowMVI catchingFishSharedFlowMVI = this.CatchingFishSpannableWidget;
                    if (!catchingFishSharedFlowMVI.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.CatchingFishAnimation()) {
                        CatchingFishUnitTestingFlux.CatchingFishCoroutine("Expected applyChanges() to have been called");
                    }
                    catchingFishSharedFlowMVI.CatchingFishUnitTesting(catchingFishPayPalService, catchingFishLifecycleRedux);
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.CatchingFishViewModelFAB.CatchingFishReduxKtor.CatchingFishViewModelScope()) {
                    CatchingFishExoPlayerBundle catchingFishExoPlayerBundle = this.CatchingFishDaggerHiltFAB;
                    try {
                        catchingFishExoPlayerBundle.CatchingFishLayout(this.CatchingFishViewModelFAB, this.CatchingFishSpannableWidget.CatchingFishDaggerHiltFAB());
                        catchingFishExoPlayerBundle.CatchingFishDaggerWebsocket();
                        catchingFishExoPlayerBundle.CatchingFishSnackbar();
                    } catch (Throwable th2) {
                        catchingFishExoPlayerBundle.CatchingFishSnackbar();
                        throw th2;
                    }
                }
                throw th;
            } catch (Throwable th3) {
                CatchingFishParcelableFAB();
                throw th3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishNavigation(Set set) {
        boolean z = set instanceof CatchingFishCardViewRealm;
        CatchingFishPayPalService catchingFishPayPalService = this.CatchingFishOkHttp;
        CatchingFishPayPalService catchingFishPayPalService2 = this.CatchingFishFragmentHandler;
        if (z) {
            CatchingFishServiceBundle catchingFishServiceBundle = ((CatchingFishCardViewRealm) set).CatchingFishReduxKtor;
            Object[] objArr = catchingFishServiceBundle.CatchingFishSnackbar;
            long[] jArr = catchingFishServiceBundle.CatchingFishParcelableFAB;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (catchingFishPayPalService2.CatchingFishCoroutine(obj) || catchingFishPayPalService.CatchingFishCoroutine(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            for (Object obj2 : set) {
                if (catchingFishPayPalService2.CatchingFishCoroutine(obj2) || catchingFishPayPalService.CatchingFishCoroutine(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void CatchingFishOkHttp(ArrayList arrayList) {
        CatchingFishAppCompatHilt catchingFishAppCompatHilt = this.CatchingFishViewModelFAB;
        CatchingFishSharedFlowMVI catchingFishSharedFlowMVI = this.CatchingFishSpannableWidget;
        if (arrayList.size() > 0) {
            ((CatchingFishHiltAdMobView) ((CatchingFishGsonWorkManager) arrayList.get(0)).CatchingFishReduxKtor).getClass();
            throw null;
        }
        try {
            catchingFishSharedFlowMVI.getClass();
            try {
                catchingFishSharedFlowMVI.CatchingFishParcelableFlux(arrayList);
                catchingFishSharedFlowMVI.CatchingFishViewModelFAB();
            } catch (Throwable th) {
                catchingFishSharedFlowMVI.CatchingFishParcelableFAB();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!catchingFishAppCompatHilt.CatchingFishReduxKtor.CatchingFishViewModelScope()) {
                    CatchingFishExoPlayerBundle catchingFishExoPlayerBundle = this.CatchingFishDaggerHiltFAB;
                    try {
                        catchingFishExoPlayerBundle.CatchingFishLayout(catchingFishAppCompatHilt, catchingFishSharedFlowMVI.CatchingFishDaggerHiltFAB());
                        catchingFishExoPlayerBundle.CatchingFishDaggerWebsocket();
                        catchingFishExoPlayerBundle.CatchingFishSnackbar();
                    } catch (Throwable th3) {
                        catchingFishExoPlayerBundle.CatchingFishSnackbar();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                CatchingFishParcelableFAB();
                throw th4;
            }
        }
    }

    public final void CatchingFishParcelableFAB() {
        this.CatchingFishWorkManager.set(null);
        this.CatchingFishUnitTesting.CatchingFishParcelableFAB.CatchingFishStateFlow();
        this.CatchingFishAnimationMockk.CatchingFishParcelableFAB.CatchingFishStateFlow();
        CatchingFishAppCompatHilt catchingFishAppCompatHilt = this.CatchingFishViewModelFAB;
        if (catchingFishAppCompatHilt.CatchingFishReduxKtor.CatchingFishViewModelScope()) {
            return;
        }
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle = this.CatchingFishDaggerHiltFAB;
        try {
            catchingFishExoPlayerBundle.CatchingFishLayout(catchingFishAppCompatHilt, this.CatchingFishSpannableWidget.CatchingFishDaggerHiltFAB());
            catchingFishExoPlayerBundle.CatchingFishDaggerWebsocket();
        } finally {
            catchingFishExoPlayerBundle.CatchingFishSnackbar();
        }
    }

    public final void CatchingFishReduxKtor() {
        synchronized (this.CatchingFishViewModelScope) {
            try {
                CatchingFishDaggerWebsocket(this.CatchingFishUnitTesting);
                CatchingFishCloudMessaging();
            } catch (Throwable th) {
                try {
                    if (!this.CatchingFishViewModelFAB.CatchingFishReduxKtor.CatchingFishViewModelScope()) {
                        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle = this.CatchingFishDaggerHiltFAB;
                        try {
                            catchingFishExoPlayerBundle.CatchingFishLayout(this.CatchingFishViewModelFAB, this.CatchingFishSpannableWidget.CatchingFishDaggerHiltFAB());
                            catchingFishExoPlayerBundle.CatchingFishDaggerWebsocket();
                            catchingFishExoPlayerBundle.CatchingFishSnackbar();
                        } catch (Throwable th2) {
                            catchingFishExoPlayerBundle.CatchingFishSnackbar();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    CatchingFishParcelableFAB();
                    throw th3;
                }
            }
        }
    }

    public final void CatchingFishRoomDatabase(Object obj) {
        Object CatchingFishViewModelScope = this.CatchingFishFragmentHandler.CatchingFishViewModelScope(obj);
        if (CatchingFishViewModelScope == null) {
            return;
        }
        boolean z = CatchingFishViewModelScope instanceof CatchingFishServiceBundle;
        CatchingFishPayPalService catchingFishPayPalService = this.CatchingFishStateLiveData;
        if (!z) {
            CatchingFishHiltFAB catchingFishHiltFAB = (CatchingFishHiltFAB) CatchingFishViewModelScope;
            if (catchingFishHiltFAB.CatchingFishCoroutine(obj) == CatchingFishXMLLayoutLayout.CatchingFishViewModelScope) {
                CatchingFishLayoutRoom.CatchingFishViewModelScope(catchingFishPayPalService, obj, catchingFishHiltFAB);
                return;
            }
            return;
        }
        CatchingFishServiceBundle catchingFishServiceBundle = (CatchingFishServiceBundle) CatchingFishViewModelScope;
        Object[] objArr = catchingFishServiceBundle.CatchingFishSnackbar;
        long[] jArr = catchingFishServiceBundle.CatchingFishParcelableFAB;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        CatchingFishHiltFAB catchingFishHiltFAB2 = (CatchingFishHiltFAB) objArr[(i << 3) + i3];
                        if (catchingFishHiltFAB2.CatchingFishCoroutine(obj) == CatchingFishXMLLayoutLayout.CatchingFishViewModelScope) {
                            CatchingFishLayoutRoom.CatchingFishViewModelScope(catchingFishPayPalService, obj, catchingFishHiltFAB2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void CatchingFishSnackbar(Object obj, boolean z) {
        int i;
        Object CatchingFishViewModelScope = this.CatchingFishFragmentHandler.CatchingFishViewModelScope(obj);
        if (CatchingFishViewModelScope == null) {
            return;
        }
        boolean z2 = CatchingFishViewModelScope instanceof CatchingFishServiceBundle;
        CatchingFishXMLLayoutLayout catchingFishXMLLayoutLayout = CatchingFishXMLLayoutLayout.CatchingFishReduxKtor;
        CatchingFishServiceBundle catchingFishServiceBundle = this.CatchingFishCloudMessaging;
        CatchingFishServiceBundle catchingFishServiceBundle2 = this.CatchingFishEspressoTesting;
        CatchingFishPayPalService catchingFishPayPalService = this.CatchingFishStateLiveData;
        if (!z2) {
            CatchingFishHiltFAB catchingFishHiltFAB = (CatchingFishHiltFAB) CatchingFishViewModelScope;
            if (CatchingFishLayoutRoom.CatchingFishPayPal(catchingFishPayPalService, obj, catchingFishHiltFAB) || catchingFishHiltFAB.CatchingFishCoroutine(obj) == catchingFishXMLLayoutLayout) {
                return;
            }
            if (catchingFishHiltFAB.CatchingFishViewModelScope == null || z) {
                catchingFishServiceBundle.CatchingFishParcelableFAB(catchingFishHiltFAB);
                return;
            } else {
                catchingFishServiceBundle2.CatchingFishParcelableFAB(catchingFishHiltFAB);
                return;
            }
        }
        CatchingFishServiceBundle catchingFishServiceBundle3 = (CatchingFishServiceBundle) CatchingFishViewModelScope;
        Object[] objArr = catchingFishServiceBundle3.CatchingFishSnackbar;
        long[] jArr = catchingFishServiceBundle3.CatchingFishParcelableFAB;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j & 255) < 128) {
                        CatchingFishHiltFAB catchingFishHiltFAB2 = (CatchingFishHiltFAB) objArr[(i2 << 3) + i5];
                        if (!CatchingFishLayoutRoom.CatchingFishPayPal(catchingFishPayPalService, obj, catchingFishHiltFAB2)) {
                            i = i3;
                            if (catchingFishHiltFAB2.CatchingFishCoroutine(obj) != catchingFishXMLLayoutLayout) {
                                if (catchingFishHiltFAB2.CatchingFishViewModelScope == null || z) {
                                    catchingFishServiceBundle.CatchingFishParcelableFAB(catchingFishHiltFAB2);
                                } else {
                                    catchingFishServiceBundle2.CatchingFishParcelableFAB(catchingFishHiltFAB2);
                                }
                            }
                            j >>= i;
                            i5++;
                            i3 = i;
                        }
                    }
                    i = i3;
                    j >>= i;
                    i5++;
                    i3 = i;
                }
                if (i4 != i3) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final CatchingFishXMLLayoutLayout CatchingFishStateLiveData(CatchingFishHiltFAB catchingFishHiltFAB, CatchingFishMockkPicasso catchingFishMockkPicasso, Object obj) {
        CatchingFishLayoutStripeAPI catchingFishLayoutStripeAPI;
        int i;
        synchronized (this.CatchingFishViewModelScope) {
            try {
                CatchingFishLayoutStripeAPI catchingFishLayoutStripeAPI2 = this.CatchingFish;
                if (catchingFishLayoutStripeAPI2 != null) {
                    CatchingFishMVVMMVIRoom catchingFishMVVMMVIRoom = this.CatchingFishLayout;
                    int i2 = this.CatchingFishJetpackCompose;
                    if (catchingFishMVVMMVIRoom.CatchingFishFragmentHandler) {
                        CatchingFishUnitTestingFlux.CatchingFishCoroutine("Writer is active");
                    }
                    if (i2 < 0 || i2 >= catchingFishMVVMMVIRoom.CatchingFishDaggerWebsocket) {
                        CatchingFishUnitTestingFlux.CatchingFishCoroutine("Invalid group index");
                    }
                    if (catchingFishMVVMMVIRoom.CatchingFishWorkManager(catchingFishMockkPicasso)) {
                        int i3 = catchingFishMVVMMVIRoom.CatchingFishReduxKtor[(i2 * 5) + 3] + i2;
                        int i4 = catchingFishMockkPicasso.CatchingFishParcelableFAB;
                        catchingFishLayoutStripeAPI = (i2 <= i4 && i4 < i3) ? catchingFishLayoutStripeAPI2 : null;
                    }
                    catchingFishLayoutStripeAPI2 = null;
                }
                if (catchingFishLayoutStripeAPI == null) {
                    CatchingFishSharedFlowMVI catchingFishSharedFlowMVI = this.CatchingFishSpannableWidget;
                    if (catchingFishSharedFlowMVI.CatchingFishFragmentFactory && catchingFishSharedFlowMVI.CatchingFishStateFlow(catchingFishHiltFAB, obj)) {
                        return CatchingFishXMLLayoutLayout.CatchingFishViewModelScope;
                    }
                    if (obj == null) {
                        this.CatchingFishRoomDatabase.CatchingFishOkHttp(catchingFishHiltFAB, CatchingFishWidgetContext.CatchingFishCloudMessaging);
                    } else if (obj instanceof CatchingFishGsonReduxPayPal) {
                        Object CatchingFishViewModelScope = this.CatchingFishRoomDatabase.CatchingFishViewModelScope(catchingFishHiltFAB);
                        if (CatchingFishViewModelScope != null) {
                            if (CatchingFishViewModelScope instanceof CatchingFishServiceBundle) {
                                CatchingFishServiceBundle catchingFishServiceBundle = (CatchingFishServiceBundle) CatchingFishViewModelScope;
                                Object[] objArr = catchingFishServiceBundle.CatchingFishSnackbar;
                                long[] jArr = catchingFishServiceBundle.CatchingFishParcelableFAB;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i5 = 0;
                                    loop0: while (true) {
                                        long j = jArr[i5];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i6 = 8;
                                            int i7 = 8 - ((~(i5 - length)) >>> 31);
                                            int i8 = 0;
                                            while (i8 < i7) {
                                                if ((j & 255) < 128) {
                                                    i = i6;
                                                    if (objArr[(i5 << 3) + i8] == CatchingFishWidgetContext.CatchingFishCloudMessaging) {
                                                        break loop0;
                                                    }
                                                } else {
                                                    i = i6;
                                                }
                                                j >>= i;
                                                i8++;
                                                i6 = i;
                                            }
                                            if (i7 != i6) {
                                                break;
                                            }
                                        }
                                        if (i5 == length) {
                                            break;
                                        }
                                        i5++;
                                    }
                                }
                            } else if (CatchingFishViewModelScope == CatchingFishWidgetContext.CatchingFishCloudMessaging) {
                            }
                        }
                        CatchingFishLayoutRoom.CatchingFishViewModelScope(this.CatchingFishRoomDatabase, catchingFishHiltFAB, obj);
                    } else {
                        this.CatchingFishRoomDatabase.CatchingFishOkHttp(catchingFishHiltFAB, CatchingFishWidgetContext.CatchingFishCloudMessaging);
                    }
                }
                if (catchingFishLayoutStripeAPI != null) {
                    return catchingFishLayoutStripeAPI.CatchingFishStateLiveData(catchingFishHiltFAB, catchingFishMockkPicasso, obj);
                }
                this.CatchingFishReduxKtor.CatchingFishFragmentHandler(this);
                return this.CatchingFishSpannableWidget.CatchingFishFragmentFactory ? CatchingFishXMLLayoutLayout.CatchingFishWorkManager : CatchingFishXMLLayoutLayout.CatchingFishDaggerWebsocket;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final CatchingFishXMLLayoutLayout CatchingFishUnitTesting(CatchingFishHiltFAB catchingFishHiltFAB, Object obj) {
        CatchingFishLayoutStripeAPI catchingFishLayoutStripeAPI;
        int i = catchingFishHiltFAB.CatchingFishSnackbar;
        if ((i & 2) != 0) {
            catchingFishHiltFAB.CatchingFishSnackbar = i | 4;
        }
        CatchingFishMockkPicasso catchingFishMockkPicasso = catchingFishHiltFAB.CatchingFishCoroutine;
        if (catchingFishMockkPicasso == null || !catchingFishMockkPicasso.CatchingFishParcelableFAB()) {
            return CatchingFishXMLLayoutLayout.CatchingFishReduxKtor;
        }
        if (this.CatchingFishLayout.CatchingFishWorkManager(catchingFishMockkPicasso)) {
            if (catchingFishHiltFAB.CatchingFishReduxKtor == null) {
                return CatchingFishXMLLayoutLayout.CatchingFishReduxKtor;
            }
            CatchingFishXMLLayoutLayout CatchingFishStateLiveData = CatchingFishStateLiveData(catchingFishHiltFAB, catchingFishMockkPicasso, obj);
            if (CatchingFishStateLiveData != CatchingFishXMLLayoutLayout.CatchingFishReduxKtor) {
                this.CatchingFishCoroutineFlow.getClass();
            }
            return CatchingFishStateLiveData;
        }
        synchronized (this.CatchingFishViewModelScope) {
            catchingFishLayoutStripeAPI = this.CatchingFish;
        }
        if (catchingFishLayoutStripeAPI != null) {
            CatchingFishSharedFlowMVI catchingFishSharedFlowMVI = catchingFishLayoutStripeAPI.CatchingFishSpannableWidget;
            if (catchingFishSharedFlowMVI.CatchingFishFragmentFactory && catchingFishSharedFlowMVI.CatchingFishStateFlow(catchingFishHiltFAB, obj)) {
                return CatchingFishXMLLayoutLayout.CatchingFishViewModelScope;
            }
        }
        return CatchingFishXMLLayoutLayout.CatchingFishReduxKtor;
    }

    public final void CatchingFishViewModelFAB() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        char c2;
        long j5;
        long j6;
        int i2;
        boolean z;
        int i3;
        long j7;
        CatchingFishPayPalService catchingFishPayPalService = this.CatchingFishOkHttp;
        long[] jArr3 = catchingFishPayPalService.CatchingFishParcelableFAB;
        int length = jArr3.length - 2;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            long j9 = 128;
            while (true) {
                long j10 = jArr3[i5];
                j2 = 255;
                if ((((~j10) << c3) & j10 & j8) != j8) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j10 & 255) < j9) {
                            c2 = c3;
                            int i8 = (i5 << 3) + i7;
                            j5 = j8;
                            Object obj = catchingFishPayPalService.CatchingFishSnackbar[i8];
                            Object obj2 = catchingFishPayPalService.CatchingFishCoroutine[i8];
                            boolean z2 = obj2 instanceof CatchingFishServiceBundle;
                            CatchingFishPayPalService catchingFishPayPalService2 = this.CatchingFishFragmentHandler;
                            if (z2) {
                                CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                CatchingFishServiceBundle catchingFishServiceBundle = (CatchingFishServiceBundle) obj2;
                                Object[] objArr = catchingFishServiceBundle.CatchingFishSnackbar;
                                long[] jArr4 = catchingFishServiceBundle.CatchingFishParcelableFAB;
                                j6 = j9;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j4 = j10;
                                    int i9 = i4;
                                    int i10 = 0;
                                    while (true) {
                                        long j11 = jArr4[i10];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j11) << c2) & j11 & j5) != j5) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                if ((j11 & 255) < j6) {
                                                    i3 = i12;
                                                    int i13 = (i10 << 3) + i3;
                                                    j7 = j11;
                                                    if (!catchingFishPayPalService2.CatchingFishCoroutine((CatchingFishGsonReduxPayPal) objArr[i13])) {
                                                        catchingFishServiceBundle.CatchingFishEspressoTesting(i13);
                                                    }
                                                } else {
                                                    i3 = i12;
                                                    j7 = j11;
                                                }
                                                j11 = j7 >> i9;
                                                i12 = i3 + 1;
                                            }
                                            if (i11 != i9) {
                                                break;
                                            }
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    j4 = j10;
                                }
                                z = catchingFishServiceBundle.CatchingFishViewModelScope();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                j4 = j10;
                                j6 = j9;
                                CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                z = !catchingFishPayPalService2.CatchingFishCoroutine((CatchingFishGsonReduxPayPal) obj2);
                            }
                            if (z) {
                                catchingFishPayPalService.CatchingFishEspressoTesting(i8);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            j4 = j10;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i2 = i4;
                        }
                        j10 = j4 >> i2;
                        i7++;
                        i4 = i2;
                        c3 = c2;
                        j8 = j5;
                        j9 = j6;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i14 = length;
                    c = c3;
                    j = j8;
                    j3 = j9;
                    if (i6 != i4) {
                        break;
                    } else {
                        length = i14;
                    }
                } else {
                    jArr = jArr3;
                    c = c3;
                    j = j8;
                    j3 = j9;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                c3 = c;
                j8 = j;
                j9 = j3;
                jArr3 = jArr;
                i4 = 8;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        CatchingFishServiceBundle catchingFishServiceBundle2 = this.CatchingFishEspressoTesting;
        if (!catchingFishServiceBundle2.CatchingFishViewModelFAB()) {
            return;
        }
        Object[] objArr2 = catchingFishServiceBundle2.CatchingFishSnackbar;
        long[] jArr5 = catchingFishServiceBundle2.CatchingFishParcelableFAB;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j12 = jArr5[i15];
            if ((((~j12) << c) & j12 & j) != j) {
                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((j12 & j2) < j3) {
                        int i18 = (i15 << 3) + i17;
                        if (!(((CatchingFishHiltFAB) objArr2[i18]).CatchingFishViewModelScope != null)) {
                            catchingFishServiceBundle2.CatchingFishEspressoTesting(i18);
                        }
                    }
                    j12 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length3) {
                return;
            } else {
                i15++;
            }
        }
    }

    public final void CatchingFishViewModelScope() {
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle;
        synchronized (this.CatchingFishViewModelScope) {
            try {
                this.CatchingFishSpannableWidget.CatchingFishCoroutineFlow = null;
                if (!this.CatchingFishViewModelFAB.CatchingFishReduxKtor.CatchingFishViewModelScope()) {
                    catchingFishExoPlayerBundle = this.CatchingFishDaggerHiltFAB;
                    try {
                        catchingFishExoPlayerBundle.CatchingFishLayout(this.CatchingFishViewModelFAB, this.CatchingFishSpannableWidget.CatchingFishDaggerHiltFAB());
                        catchingFishExoPlayerBundle.CatchingFishDaggerWebsocket();
                        catchingFishExoPlayerBundle.CatchingFishSnackbar();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.CatchingFishViewModelFAB.CatchingFishReduxKtor.CatchingFishViewModelScope()) {
                        catchingFishExoPlayerBundle = this.CatchingFishDaggerHiltFAB;
                        try {
                            catchingFishExoPlayerBundle.CatchingFishLayout(this.CatchingFishViewModelFAB, this.CatchingFishSpannableWidget.CatchingFishDaggerHiltFAB());
                            catchingFishExoPlayerBundle.CatchingFishDaggerWebsocket();
                            catchingFishExoPlayerBundle.CatchingFishSnackbar();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    CatchingFishParcelableFAB();
                    throw th2;
                }
            }
        }
    }

    public final void CatchingFishWorkManager() {
        synchronized (this.CatchingFishViewModelScope) {
            try {
                if (this.CatchingFishAnimationMockk.CatchingFishParcelableFAB.CatchingFishMVVMAppCompat()) {
                    CatchingFishDaggerWebsocket(this.CatchingFishAnimationMockk);
                }
            } catch (Throwable th) {
                try {
                    if (!this.CatchingFishViewModelFAB.CatchingFishReduxKtor.CatchingFishViewModelScope()) {
                        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle = this.CatchingFishDaggerHiltFAB;
                        try {
                            catchingFishExoPlayerBundle.CatchingFishLayout(this.CatchingFishViewModelFAB, this.CatchingFishSpannableWidget.CatchingFishDaggerHiltFAB());
                            catchingFishExoPlayerBundle.CatchingFishDaggerWebsocket();
                            catchingFishExoPlayerBundle.CatchingFishSnackbar();
                        } catch (Throwable th2) {
                            catchingFishExoPlayerBundle.CatchingFishSnackbar();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }
}
