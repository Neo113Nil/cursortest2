package kotlin.text;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class CatchingFishCardViewView extends CatchingFishMVIBundle implements CatchingFishJobSchedulerMVP {
    public CatchingFishServiceBundle CatchingFishAnimationMockk;
    public CatchingFishServiceBundle CatchingFishCloudMessaging;
    public CatchingFishServiceBundle CatchingFishEspressoTesting;
    public List CatchingFishFragmentHandler;
    public List CatchingFishLayout;
    public final /* synthetic */ CatchingFishMVIHandlerHilt CatchingFishNavigation;
    public CatchingFishServiceBundle CatchingFishOkHttp;
    public /* synthetic */ CatchingFishNavigationRedux CatchingFishRoomDatabase;
    public int CatchingFishStateLiveData;
    public Set CatchingFishUnitTesting;
    public List CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishCardViewView(CatchingFishMVIHandlerHilt catchingFishMVIHandlerHilt, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(3, catchingFishWebsocketGradle);
        this.CatchingFishNavigation = catchingFishMVIHandlerHilt;
    }

    public static final void CatchingFishAnimationMockk(CatchingFishMVIHandlerHilt catchingFishMVIHandlerHilt, List list, List list2, List list3, CatchingFishServiceBundle catchingFishServiceBundle, CatchingFishServiceBundle catchingFishServiceBundle2, CatchingFishServiceBundle catchingFishServiceBundle3, CatchingFishServiceBundle catchingFishServiceBundle4) {
        char c;
        long j;
        long j2;
        synchronized (catchingFishMVIHandlerHilt.CatchingFishSnackbar) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    CatchingFishLayoutStripeAPI catchingFishLayoutStripeAPI = (CatchingFishLayoutStripeAPI) list3.get(i);
                    catchingFishLayoutStripeAPI.CatchingFishParcelableFAB();
                    catchingFishMVIHandlerHilt.CatchingFishMVPRobolectric(catchingFishLayoutStripeAPI);
                }
                list3.clear();
                Object[] objArr = catchingFishServiceBundle.CatchingFishSnackbar;
                long[] jArr = catchingFishServiceBundle.CatchingFishParcelableFAB;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    CatchingFishLayoutStripeAPI catchingFishLayoutStripeAPI2 = (CatchingFishLayoutStripeAPI) objArr[(i2 << 3) + i4];
                                    catchingFishLayoutStripeAPI2.CatchingFishParcelableFAB();
                                    catchingFishMVIHandlerHilt.CatchingFishMVPRobolectric(catchingFishLayoutStripeAPI2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                catchingFishServiceBundle.CatchingFishSnackbar();
                Object[] objArr2 = catchingFishServiceBundle2.CatchingFishSnackbar;
                long[] jArr2 = catchingFishServiceBundle2.CatchingFishParcelableFAB;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((CatchingFishLayoutStripeAPI) objArr2[(i5 << 3) + i7]).CatchingFishViewModelScope();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                catchingFishServiceBundle2.CatchingFishSnackbar();
                catchingFishServiceBundle3.CatchingFishSnackbar();
                Object[] objArr3 = catchingFishServiceBundle4.CatchingFishSnackbar;
                long[] jArr3 = catchingFishServiceBundle4.CatchingFishParcelableFAB;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    CatchingFishLayoutStripeAPI catchingFishLayoutStripeAPI3 = (CatchingFishLayoutStripeAPI) objArr3[(i8 << 3) + i10];
                                    catchingFishLayoutStripeAPI3.CatchingFishParcelableFAB();
                                    catchingFishMVIHandlerHilt.CatchingFishMVPRobolectric(catchingFishLayoutStripeAPI3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                catchingFishServiceBundle4.CatchingFishSnackbar();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void CatchingFishStateLiveData(List list, CatchingFishMVIHandlerHilt catchingFishMVIHandlerHilt) {
        list.clear();
        synchronized (catchingFishMVIHandlerHilt.CatchingFishSnackbar) {
            try {
                ArrayList arrayList = catchingFishMVIHandlerHilt.CatchingFishFragmentHandler;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((CatchingFishHiltAdMobView) arrayList.get(i));
                }
                catchingFishMVIHandlerHilt.CatchingFishFragmentHandler.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0123 -> B:6:0x012b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01c3 -> B:20:0x0094). Please report as a decompilation issue!!! */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishOkHttp(Object obj) {
        CatchingFishNavigationRedux catchingFishNavigationRedux;
        CatchingFishServiceBundle catchingFishServiceBundle;
        CatchingFishServiceBundle catchingFishServiceBundle2;
        List list;
        Set set;
        final List list2;
        CatchingFishServiceBundle catchingFishServiceBundle3;
        List list3;
        CatchingFishServiceBundle catchingFishServiceBundle4;
        final List list4;
        final CatchingFishServiceBundle catchingFishServiceBundle5;
        final List list5;
        final CatchingFishServiceBundle catchingFishServiceBundle6;
        Object obj2;
        CatchingFishKtorMockk catchingFishKtorMockk;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk;
        CatchingFishNavigationRedux catchingFishNavigationRedux2;
        CatchingFishBundleGradle catchingFishBundleGradle;
        CatchingFishCardViewView catchingFishCardViewView = this;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk2 = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        int i = catchingFishCardViewView.CatchingFishStateLiveData;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            catchingFishNavigationRedux = catchingFishCardViewView.CatchingFishRoomDatabase;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i4 = CatchingFishHiltCameraX.CatchingFishParcelableFAB;
            catchingFishServiceBundle = new CatchingFishServiceBundle();
            CatchingFishServiceBundle catchingFishServiceBundle7 = new CatchingFishServiceBundle();
            CatchingFishServiceBundle catchingFishServiceBundle8 = new CatchingFishServiceBundle();
            CatchingFishCardViewRealm catchingFishCardViewRealm = new CatchingFishCardViewRealm(catchingFishServiceBundle8);
            catchingFishServiceBundle2 = new CatchingFishServiceBundle();
            list = arrayList;
            set = catchingFishCardViewRealm;
            list2 = arrayList2;
            catchingFishServiceBundle3 = catchingFishServiceBundle8;
            list3 = arrayList3;
            catchingFishServiceBundle4 = catchingFishServiceBundle7;
            synchronized (catchingFishCardViewView.CatchingFishNavigation.CatchingFishSnackbar) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CatchingFishServiceBundle catchingFishServiceBundle9 = catchingFishCardViewView.CatchingFishAnimationMockk;
                set = catchingFishCardViewView.CatchingFishUnitTesting;
                catchingFishServiceBundle3 = catchingFishCardViewView.CatchingFishOkHttp;
                catchingFishServiceBundle4 = catchingFishCardViewView.CatchingFishEspressoTesting;
                catchingFishServiceBundle = catchingFishCardViewView.CatchingFishCloudMessaging;
                list3 = catchingFishCardViewView.CatchingFishFragmentHandler;
                list2 = catchingFishCardViewView.CatchingFishLayout;
                list = catchingFishCardViewView.CatchingFishViewModelFAB;
                CatchingFishNavigationRedux catchingFishNavigationRedux3 = catchingFishCardViewView.CatchingFishRoomDatabase;
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                catchingFishServiceBundle2 = catchingFishServiceBundle9;
                catchingFishNavigationRedux = catchingFishNavigationRedux3;
                CatchingFishMVIHandlerHilt catchingFishMVIHandlerHilt = catchingFishCardViewView.CatchingFishNavigation;
                synchronized (catchingFishMVIHandlerHilt.CatchingFishSnackbar) {
                    try {
                        if (catchingFishMVIHandlerHilt.CatchingFishCloudMessaging.CatchingFishFragmentHandler()) {
                            CatchingFishBundleGradle CatchingFishSnackbar = CatchingFishLayoutMockk.CatchingFishSnackbar(catchingFishMVIHandlerHilt.CatchingFishCloudMessaging);
                            catchingFishMVIHandlerHilt.CatchingFishCloudMessaging.CatchingFishParcelableFAB();
                            CatchingFishViewModelIntent catchingFishViewModelIntent = catchingFishMVIHandlerHilt.CatchingFishEspressoTesting;
                            ((CatchingFishPayPalService) catchingFishViewModelIntent.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB();
                            ((CatchingFishPayPalService) catchingFishViewModelIntent.CatchingFishWorkManager).CatchingFishParcelableFAB();
                            catchingFishMVIHandlerHilt.CatchingFishUnitTesting.CatchingFishParcelableFAB();
                            catchingFishBundleGradle = new CatchingFishBundleGradle(CatchingFishSnackbar.CatchingFishSnackbar);
                            Object[] objArr = CatchingFishSnackbar.CatchingFishParcelableFAB;
                            int i5 = CatchingFishSnackbar.CatchingFishSnackbar;
                            catchingFishXMLLayoutMockk = catchingFishXMLLayoutMockk2;
                            int i6 = 0;
                            while (i6 < i5) {
                                int i7 = i6;
                                CatchingFishHiltAdMobView catchingFishHiltAdMobView = (CatchingFishHiltAdMobView) objArr[i6];
                                catchingFishBundleGradle.CatchingFishParcelableFAB(new CatchingFishGsonWorkManager(catchingFishHiltAdMobView, catchingFishMVIHandlerHilt.CatchingFishOkHttp.CatchingFishViewModelScope(catchingFishHiltAdMobView)));
                                i6 = i7 + 1;
                                catchingFishNavigationRedux = catchingFishNavigationRedux;
                            }
                            catchingFishNavigationRedux2 = catchingFishNavigationRedux;
                            catchingFishMVIHandlerHilt.CatchingFishOkHttp.CatchingFishParcelableFAB();
                        } else {
                            catchingFishXMLLayoutMockk = catchingFishXMLLayoutMockk2;
                            catchingFishNavigationRedux2 = catchingFishNavigationRedux;
                            catchingFishBundleGradle = CatchingFishHandlerLayout.CatchingFishSnackbar;
                            CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishBundleGradle, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr2 = catchingFishBundleGradle.CatchingFishParcelableFAB;
                int i8 = catchingFishBundleGradle.CatchingFishSnackbar;
                for (int i9 = 0; i9 < i8; i9++) {
                    CatchingFishGsonWorkManager catchingFishGsonWorkManager = (CatchingFishGsonWorkManager) objArr2[i9];
                }
                i2 = 2;
                i3 = 1;
                catchingFishCardViewView = this;
                catchingFishXMLLayoutMockk2 = catchingFishXMLLayoutMockk;
                catchingFishNavigationRedux = catchingFishNavigationRedux2;
                synchronized (catchingFishCardViewView.CatchingFishNavigation.CatchingFishSnackbar) {
                }
                CatchingFishMVIHandlerHilt catchingFishMVIHandlerHilt2 = catchingFishCardViewView.CatchingFishNavigation;
                catchingFishCardViewView.CatchingFishRoomDatabase = catchingFishNavigationRedux;
                catchingFishCardViewView.CatchingFishViewModelFAB = list;
                catchingFishCardViewView.CatchingFishLayout = list2;
                catchingFishCardViewView.CatchingFishFragmentHandler = list3;
                catchingFishCardViewView.CatchingFishCloudMessaging = catchingFishServiceBundle;
                catchingFishCardViewView.CatchingFishEspressoTesting = catchingFishServiceBundle4;
                catchingFishCardViewView.CatchingFishOkHttp = catchingFishServiceBundle3;
                catchingFishCardViewView.CatchingFishUnitTesting = set;
                catchingFishCardViewView.CatchingFishAnimationMockk = catchingFishServiceBundle2;
                catchingFishCardViewView.CatchingFishStateLiveData = i3;
                if (catchingFishMVIHandlerHilt2.CatchingFishParcelableFlux()) {
                    obj2 = CatchingFishRealmContext.CatchingFishParcelableFAB;
                } else {
                    CatchingFishKtorMockk catchingFishKtorMockk2 = new CatchingFishKtorMockk(i3, CatchingFishBiometricBundle.CatchingFishParcelableFlux(catchingFishCardViewView));
                    catchingFishKtorMockk2.CatchingFish();
                    synchronized (catchingFishMVIHandlerHilt2.CatchingFishSnackbar) {
                        if (catchingFishMVIHandlerHilt2.CatchingFishParcelableFlux()) {
                            catchingFishKtorMockk = catchingFishKtorMockk2;
                        } else {
                            catchingFishMVIHandlerHilt2.CatchingFishRoomDatabase = catchingFishKtorMockk2;
                            catchingFishKtorMockk = null;
                        }
                    }
                    if (catchingFishKtorMockk != null) {
                        catchingFishKtorMockk.CatchingFishViewModelFAB(CatchingFishRealmContext.CatchingFishParcelableFAB);
                    }
                    obj2 = catchingFishKtorMockk2.CatchingFishNavigation();
                    if (obj2 != CatchingFishXMLLayoutMockk.CatchingFishReduxKtor) {
                        obj2 = CatchingFishRealmContext.CatchingFishParcelableFAB;
                    }
                }
                if (obj2 != catchingFishXMLLayoutMockk2) {
                    List list6 = list;
                    catchingFishServiceBundle5 = catchingFishServiceBundle;
                    catchingFishServiceBundle6 = catchingFishServiceBundle2;
                    list4 = list3;
                    list5 = list6;
                    final Set set2 = set;
                    final CatchingFishServiceBundle catchingFishServiceBundle10 = catchingFishServiceBundle4;
                    final CatchingFishServiceBundle catchingFishServiceBundle11 = catchingFishServiceBundle3;
                    if (CatchingFishMVIHandlerHilt.CatchingFish(catchingFishCardViewView.CatchingFishNavigation)) {
                        List list7 = list4;
                        catchingFishServiceBundle2 = catchingFishServiceBundle6;
                        catchingFishServiceBundle = catchingFishServiceBundle5;
                        list = list5;
                        list3 = list7;
                        catchingFishCardViewView = this;
                        catchingFishServiceBundle3 = catchingFishServiceBundle11;
                        catchingFishServiceBundle4 = catchingFishServiceBundle10;
                        set = set2;
                        synchronized (catchingFishCardViewView.CatchingFishNavigation.CatchingFishSnackbar) {
                        }
                    } else {
                        final CatchingFishMVIHandlerHilt catchingFishMVIHandlerHilt3 = catchingFishCardViewView.CatchingFishNavigation;
                        CatchingFishServiceHandler catchingFishServiceHandler = new CatchingFishServiceHandler() { // from class: kotlin.text.CatchingFishRoomFirebase
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.text.CatchingFishServiceHandler
                            public final Object CatchingFishFragmentHandler(Object obj3) {
                                boolean CatchingFishSpannableWidget;
                                boolean z;
                                CatchingFishMVIHandlerHilt catchingFishMVIHandlerHilt4 = CatchingFishMVIHandlerHilt.this;
                                CatchingFishServiceBundle catchingFishServiceBundle12 = catchingFishServiceBundle11;
                                CatchingFishServiceBundle catchingFishServiceBundle13 = catchingFishServiceBundle6;
                                List list8 = list5;
                                List list9 = list2;
                                CatchingFishServiceBundle catchingFishServiceBundle14 = catchingFishServiceBundle5;
                                List list10 = list4;
                                CatchingFishServiceBundle catchingFishServiceBundle15 = catchingFishServiceBundle10;
                                Set set3 = set2;
                                long longValue = ((Long) obj3).longValue();
                                synchronized (catchingFishMVIHandlerHilt4.CatchingFishSnackbar) {
                                    CatchingFishSpannableWidget = catchingFishMVIHandlerHilt4.CatchingFishSpannableWidget();
                                }
                                boolean z2 = 0;
                                if (CatchingFishSpannableWidget) {
                                    Trace.beginSection("Recomposer:animation");
                                    try {
                                        catchingFishMVIHandlerHilt4.CatchingFishParcelableFAB.CatchingFishParcelableFAB(longValue);
                                        synchronized (CatchingFishIntentBundle.CatchingFishCoroutine) {
                                            CatchingFishServiceBundle catchingFishServiceBundle16 = CatchingFishIntentBundle.CatchingFishFragmentHandler.CatchingFishViewModelFAB;
                                            if (catchingFishServiceBundle16 != null) {
                                                z = catchingFishServiceBundle16.CatchingFishViewModelFAB();
                                            }
                                        }
                                        if (z) {
                                            CatchingFishIntentBundle.CatchingFishParcelableFAB();
                                        }
                                    } finally {
                                        Trace.endSection();
                                    }
                                }
                                Trace.beginSection("Recomposer:recompose");
                                try {
                                    CatchingFishMVIHandlerHilt.CatchingFish(catchingFishMVIHandlerHilt4);
                                    synchronized (catchingFishMVIHandlerHilt4.CatchingFishSnackbar) {
                                        try {
                                            CatchingFishFABToast catchingFishFABToast = catchingFishMVIHandlerHilt4.CatchingFishViewModelFAB;
                                            Object[] objArr3 = catchingFishFABToast.CatchingFishReduxKtor;
                                            int i10 = catchingFishFABToast.CatchingFishWorkManager;
                                            for (int i11 = 0; i11 < i10; i11++) {
                                                list8.add((CatchingFishLayoutStripeAPI) objArr3[i11]);
                                            }
                                            catchingFishMVIHandlerHilt4.CatchingFishViewModelFAB.CatchingFishViewModelScope();
                                        } finally {
                                        }
                                    }
                                    catchingFishServiceBundle12.CatchingFishSnackbar();
                                    catchingFishServiceBundle13.CatchingFishSnackbar();
                                    while (true) {
                                        if (list8.isEmpty() && list9.isEmpty()) {
                                            break;
                                        }
                                        try {
                                            int size = list8.size();
                                            for (int i12 = 0; i12 < size; i12++) {
                                                CatchingFishLayoutStripeAPI catchingFishLayoutStripeAPI = (CatchingFishLayoutStripeAPI) list8.get(i12);
                                                CatchingFishLayoutStripeAPI CatchingFishNavigation = CatchingFishMVIHandlerHilt.CatchingFishNavigation(catchingFishMVIHandlerHilt4, catchingFishLayoutStripeAPI, catchingFishServiceBundle12);
                                                if (CatchingFishNavigation != null) {
                                                    list10.add(CatchingFishNavigation);
                                                }
                                                catchingFishServiceBundle13.CatchingFishParcelableFAB(catchingFishLayoutStripeAPI);
                                            }
                                            list8.clear();
                                            if (catchingFishServiceBundle12.CatchingFishViewModelFAB() || catchingFishMVIHandlerHilt4.CatchingFishViewModelFAB.CatchingFishWorkManager != 0) {
                                                synchronized (catchingFishMVIHandlerHilt4.CatchingFishSnackbar) {
                                                    try {
                                                        List CatchingFishGsonAppCompat = catchingFishMVIHandlerHilt4.CatchingFishGsonAppCompat();
                                                        int size2 = CatchingFishGsonAppCompat.size();
                                                        for (int i13 = 0; i13 < size2; i13++) {
                                                            CatchingFishLayoutStripeAPI catchingFishLayoutStripeAPI2 = (CatchingFishLayoutStripeAPI) CatchingFishGsonAppCompat.get(i13);
                                                            if (!catchingFishServiceBundle13.CatchingFishCoroutine(catchingFishLayoutStripeAPI2) && catchingFishLayoutStripeAPI2.CatchingFishNavigation(set3)) {
                                                                list8.add(catchingFishLayoutStripeAPI2);
                                                            }
                                                        }
                                                        CatchingFishFABToast catchingFishFABToast2 = catchingFishMVIHandlerHilt4.CatchingFishViewModelFAB;
                                                        int i14 = catchingFishFABToast2.CatchingFishWorkManager;
                                                        int i15 = 0;
                                                        for (int i16 = 0; i16 < i14; i16++) {
                                                            CatchingFishLayoutStripeAPI catchingFishLayoutStripeAPI3 = (CatchingFishLayoutStripeAPI) catchingFishFABToast2.CatchingFishReduxKtor[i16];
                                                            if (!catchingFishServiceBundle13.CatchingFishCoroutine(catchingFishLayoutStripeAPI3) && !list8.contains(catchingFishLayoutStripeAPI3)) {
                                                                list8.add(catchingFishLayoutStripeAPI3);
                                                                i15++;
                                                            } else if (i15 > 0) {
                                                                Object[] objArr4 = catchingFishFABToast2.CatchingFishReduxKtor;
                                                                objArr4[i16 - i15] = objArr4[i16];
                                                            }
                                                        }
                                                        int i17 = i14 - i15;
                                                        CatchingFishMVVMHilt.CatchingFishAnimation(catchingFishFABToast2.CatchingFishReduxKtor, i17, i14);
                                                        catchingFishFABToast2.CatchingFishWorkManager = i17;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            if (list8.isEmpty()) {
                                                try {
                                                    CatchingFishCardViewView.CatchingFishStateLiveData(list9, catchingFishMVIHandlerHilt4);
                                                    while (!list9.isEmpty()) {
                                                        List CatchingFishPayPal = catchingFishMVIHandlerHilt4.CatchingFishPayPal(list9, catchingFishServiceBundle12);
                                                        catchingFishServiceBundle14.getClass();
                                                        Iterator it = CatchingFishPayPal.iterator();
                                                        while (it.hasNext()) {
                                                            catchingFishServiceBundle14.CatchingFishLayout(it.next());
                                                        }
                                                        CatchingFishCardViewView.CatchingFishStateLiveData(list9, catchingFishMVIHandlerHilt4);
                                                    }
                                                } catch (Throwable th2) {
                                                    catchingFishMVIHandlerHilt4.CatchingFishCardViewView(th2, null);
                                                    CatchingFishCardViewView.CatchingFishAnimationMockk(catchingFishMVIHandlerHilt4, list8, list9, list10, catchingFishServiceBundle14, catchingFishServiceBundle15, catchingFishServiceBundle12, catchingFishServiceBundle13);
                                                }
                                            }
                                            z2 = 0;
                                        } catch (Throwable th3) {
                                            try {
                                                catchingFishMVIHandlerHilt4.CatchingFishCardViewView(th3, null);
                                                CatchingFishCardViewView.CatchingFishAnimationMockk(catchingFishMVIHandlerHilt4, list8, list9, list10, catchingFishServiceBundle14, catchingFishServiceBundle15, catchingFishServiceBundle12, catchingFishServiceBundle13);
                                            } finally {
                                                list8.clear();
                                            }
                                        }
                                    }
                                    CatchingFishOkHttpStripeAPI CatchingFishCloudMessaging = CatchingFishIntentBundle.CatchingFishCloudMessaging();
                                    CatchingFishOkHttpStripeAPI catchingFishDatabindingRoom = CatchingFishCloudMessaging instanceof CatchingFishMockkAnimation ? new CatchingFishDatabindingRoom((CatchingFishMockkAnimation) CatchingFishCloudMessaging, null, null, true, false) : new CatchingFishGlideMockk(CatchingFishCloudMessaging, null, true, z2);
                                    try {
                                        CatchingFishOkHttpStripeAPI CatchingFishFragmentHandler = catchingFishDatabindingRoom.CatchingFishFragmentHandler();
                                        try {
                                            if (!list10.isEmpty()) {
                                                try {
                                                    int size3 = list10.size();
                                                    for (int i18 = z2; i18 < size3; i18++) {
                                                        catchingFishServiceBundle15.CatchingFishParcelableFAB((CatchingFishLayoutStripeAPI) list10.get(i18));
                                                    }
                                                    int size4 = list10.size();
                                                    for (int i19 = z2; i19 < size4; i19++) {
                                                        ((CatchingFishLayoutStripeAPI) list10.get(i19)).CatchingFishReduxKtor();
                                                    }
                                                } catch (Throwable th4) {
                                                    try {
                                                        catchingFishMVIHandlerHilt4.CatchingFishCardViewView(th4, null);
                                                        CatchingFishCardViewView.CatchingFishAnimationMockk(catchingFishMVIHandlerHilt4, list8, list9, list10, catchingFishServiceBundle14, catchingFishServiceBundle15, catchingFishServiceBundle12, catchingFishServiceBundle13);
                                                        return CatchingFishRealmContext.CatchingFishParcelableFAB;
                                                    } finally {
                                                        list10.clear();
                                                    }
                                                }
                                            }
                                            if (catchingFishServiceBundle14.CatchingFishViewModelFAB()) {
                                                try {
                                                    catchingFishServiceBundle15.CatchingFishFragmentHandler(catchingFishServiceBundle14);
                                                    Object[] objArr5 = catchingFishServiceBundle14.CatchingFishSnackbar;
                                                    long[] jArr = catchingFishServiceBundle14.CatchingFishParcelableFAB;
                                                    int length = jArr.length - 2;
                                                    if (length >= 0) {
                                                        int i20 = 0;
                                                        while (true) {
                                                            long j = jArr[i20];
                                                            Object[] objArr6 = objArr5;
                                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i21 = 8 - ((~(i20 - length)) >>> 31);
                                                                for (int i22 = 0; i22 < i21; i22++) {
                                                                    if ((j & 255) < 128) {
                                                                        ((CatchingFishLayoutStripeAPI) objArr6[(i20 << 3) + i22]).CatchingFishWorkManager();
                                                                    }
                                                                    j >>= 8;
                                                                }
                                                                if (i21 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i20 == length) {
                                                                break;
                                                            }
                                                            i20++;
                                                            objArr5 = objArr6;
                                                        }
                                                    }
                                                } catch (Throwable th5) {
                                                    try {
                                                        catchingFishMVIHandlerHilt4.CatchingFishCardViewView(th5, null);
                                                        CatchingFishCardViewView.CatchingFishAnimationMockk(catchingFishMVIHandlerHilt4, list8, list9, list10, catchingFishServiceBundle14, catchingFishServiceBundle15, catchingFishServiceBundle12, catchingFishServiceBundle13);
                                                        CatchingFishOkHttpStripeAPI.CatchingFishRoomDatabase(CatchingFishFragmentHandler);
                                                        return CatchingFishRealmContext.CatchingFishParcelableFAB;
                                                    } finally {
                                                        catchingFishServiceBundle14.CatchingFishSnackbar();
                                                    }
                                                }
                                            }
                                            if (catchingFishServiceBundle15.CatchingFishViewModelFAB()) {
                                                try {
                                                    Object[] objArr7 = catchingFishServiceBundle15.CatchingFishSnackbar;
                                                    long[] jArr2 = catchingFishServiceBundle15.CatchingFishParcelableFAB;
                                                    int length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        int i23 = 0;
                                                        while (true) {
                                                            long j2 = jArr2[i23];
                                                            Object[] objArr8 = objArr7;
                                                            long[] jArr3 = jArr2;
                                                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i24 = 8 - ((~(i23 - length2)) >>> 31);
                                                                for (int i25 = 0; i25 < i24; i25++) {
                                                                    if ((j2 & 255) < 128) {
                                                                        ((CatchingFishLayoutStripeAPI) objArr8[(i23 << 3) + i25]).CatchingFishViewModelScope();
                                                                    }
                                                                    j2 >>= 8;
                                                                }
                                                                if (i24 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i23 == length2) {
                                                                break;
                                                            }
                                                            i23++;
                                                            objArr7 = objArr8;
                                                            jArr2 = jArr3;
                                                        }
                                                    }
                                                } catch (Throwable th6) {
                                                    try {
                                                        catchingFishMVIHandlerHilt4.CatchingFishCardViewView(th6, null);
                                                        CatchingFishCardViewView.CatchingFishAnimationMockk(catchingFishMVIHandlerHilt4, list8, list9, list10, catchingFishServiceBundle14, catchingFishServiceBundle15, catchingFishServiceBundle12, catchingFishServiceBundle13);
                                                        CatchingFishOkHttpStripeAPI.CatchingFishRoomDatabase(CatchingFishFragmentHandler);
                                                        return CatchingFishRealmContext.CatchingFishParcelableFAB;
                                                    } finally {
                                                        catchingFishServiceBundle15.CatchingFishSnackbar();
                                                    }
                                                }
                                            }
                                            catchingFishDatabindingRoom.CatchingFishCoroutine();
                                            synchronized (catchingFishMVIHandlerHilt4.CatchingFishSnackbar) {
                                                catchingFishMVIHandlerHilt4.CatchingFishDaggerHiltFAB();
                                            }
                                            CatchingFishIntentBundle.CatchingFishCloudMessaging().CatchingFishOkHttp();
                                            catchingFishServiceBundle13.CatchingFishSnackbar();
                                            catchingFishServiceBundle12.CatchingFishSnackbar();
                                            catchingFishMVIHandlerHilt4.CatchingFishStateLiveData = null;
                                            return CatchingFishRealmContext.CatchingFishParcelableFAB;
                                        } finally {
                                            CatchingFishOkHttpStripeAPI.CatchingFishRoomDatabase(CatchingFishFragmentHandler);
                                        }
                                    } finally {
                                        catchingFishDatabindingRoom.CatchingFishCoroutine();
                                    }
                                } catch (Throwable th7) {
                                    throw th7;
                                }
                            }
                        };
                        catchingFishCardViewView.CatchingFishRoomDatabase = catchingFishNavigationRedux;
                        catchingFishCardViewView.CatchingFishViewModelFAB = list5;
                        catchingFishCardViewView.CatchingFishLayout = list2;
                        catchingFishCardViewView.CatchingFishFragmentHandler = list4;
                        catchingFishCardViewView.CatchingFishCloudMessaging = catchingFishServiceBundle5;
                        catchingFishCardViewView.CatchingFishEspressoTesting = catchingFishServiceBundle10;
                        catchingFishCardViewView.CatchingFishOkHttp = catchingFishServiceBundle11;
                        catchingFishCardViewView.CatchingFishUnitTesting = set2;
                        catchingFishCardViewView.CatchingFishAnimationMockk = catchingFishServiceBundle6;
                        catchingFishCardViewView.CatchingFishStateLiveData = i2;
                        if (catchingFishNavigationRedux.CatchingFishOkHttp(catchingFishServiceHandler, catchingFishCardViewView) != catchingFishXMLLayoutMockk2) {
                            List list8 = list4;
                            catchingFishServiceBundle2 = catchingFishServiceBundle6;
                            catchingFishServiceBundle = catchingFishServiceBundle5;
                            list = list5;
                            list3 = list8;
                            catchingFishServiceBundle3 = catchingFishServiceBundle11;
                            catchingFishServiceBundle4 = catchingFishServiceBundle10;
                            set = set2;
                            CatchingFishMVIHandlerHilt catchingFishMVIHandlerHilt4 = catchingFishCardViewView.CatchingFishNavigation;
                            synchronized (catchingFishMVIHandlerHilt4.CatchingFishSnackbar) {
                            }
                        }
                    }
                }
                return catchingFishXMLLayoutMockk2;
            }
            CatchingFishServiceBundle catchingFishServiceBundle12 = catchingFishCardViewView.CatchingFishAnimationMockk;
            set = catchingFishCardViewView.CatchingFishUnitTesting;
            catchingFishServiceBundle3 = catchingFishCardViewView.CatchingFishOkHttp;
            catchingFishServiceBundle4 = catchingFishCardViewView.CatchingFishEspressoTesting;
            CatchingFishServiceBundle catchingFishServiceBundle13 = catchingFishCardViewView.CatchingFishCloudMessaging;
            List list9 = catchingFishCardViewView.CatchingFishFragmentHandler;
            list2 = catchingFishCardViewView.CatchingFishLayout;
            List list10 = catchingFishCardViewView.CatchingFishViewModelFAB;
            CatchingFishNavigationRedux catchingFishNavigationRedux4 = catchingFishCardViewView.CatchingFishRoomDatabase;
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            catchingFishServiceBundle6 = catchingFishServiceBundle12;
            catchingFishNavigationRedux = catchingFishNavigationRedux4;
            list4 = list9;
            list5 = list10;
            catchingFishServiceBundle5 = catchingFishServiceBundle13;
            final Set set22 = set;
            final CatchingFishServiceBundle catchingFishServiceBundle102 = catchingFishServiceBundle4;
            final CatchingFishServiceBundle catchingFishServiceBundle112 = catchingFishServiceBundle3;
            if (CatchingFishMVIHandlerHilt.CatchingFish(catchingFishCardViewView.CatchingFishNavigation)) {
            }
        }
    }

    @Override // kotlin.text.CatchingFishJobSchedulerMVP
    public final Object CatchingFishReduxKtor(Object obj, Object obj2, Object obj3) {
        CatchingFishCardViewView catchingFishCardViewView = new CatchingFishCardViewView(this.CatchingFishNavigation, (CatchingFishWebsocketGradle) obj3);
        catchingFishCardViewView.CatchingFishRoomDatabase = (CatchingFishNavigationRedux) obj2;
        catchingFishCardViewView.CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
        return CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
    }
}
