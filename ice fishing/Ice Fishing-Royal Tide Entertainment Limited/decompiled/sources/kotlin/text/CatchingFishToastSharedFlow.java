package kotlin.text;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class CatchingFishToastSharedFlow {
    public int CatchingFish;
    public final CatchingFishMVPWorkManager CatchingFishAnimationMockk;
    public CatchingFishRetrofitFAB CatchingFishCameraXIntent;
    public CatchingFishMoshiFABMVVM CatchingFishCardViewRealm;
    public CatchingFishMoshiFABMVVM CatchingFishCardViewView;
    public CatchingFishRobolectricHilt CatchingFishCoroutineFlow;
    public boolean CatchingFishCustomView;
    public ArrayList CatchingFishDagger;
    public CatchingFishGoogleMapsMoshi CatchingFishDaggerHiltFAB;
    public ArrayList CatchingFishDaggerWebsocket;
    public ArrayList CatchingFishEspressoMockk;
    public final CatchingFishBundleGlide CatchingFishEspressoTesting;
    public boolean CatchingFishFragmentFactory;
    public final CatchingFishGradleMVVM CatchingFishGsonAppCompat;
    public final CatchingFishGsonRealm CatchingFishHandler;
    public CatchingFishMVIPicasso CatchingFishJetpackCompose;
    public boolean CatchingFishJobScheduler;
    public ArrayDeque CatchingFishMVPRobolectric;
    public boolean CatchingFishMutableLiveData;
    public final CatchingFishLiveDataToast CatchingFishNavigation;
    public final CopyOnWriteArrayList CatchingFishOkHttp;
    public final CatchingFishFABStateFlow CatchingFishParcelableFlux;
    public CatchingFishMoshiFABMVVM CatchingFishPayPal;
    public boolean CatchingFishPayPalService;
    public ArrayList CatchingFishReduxKtor;
    public final CatchingFishMVPWorkManager CatchingFishRoomDatabase;
    public ArrayList CatchingFishSensorManager;
    public boolean CatchingFishSnackbar;
    public CatchingFishGoogleMapsMoshi CatchingFishSpannableWidget;
    public final CatchingFishMVPWorkManager CatchingFishStateLiveData;
    public final CatchingFishMVPWorkManager CatchingFishUnitTesting;
    public CatchingFishFluxCameraX CatchingFishViewModelScope;
    public final ArrayList CatchingFishParcelableFAB = new ArrayList();
    public final CatchingFishFluxFluxBundle CatchingFishCoroutine = new CatchingFishFluxFluxBundle(9);
    public final CatchingFishBundleViewModel CatchingFishWorkManager = new CatchingFishBundleViewModel(this);
    public final CatchingFishViewPagerRealm CatchingFishViewModelFAB = new CatchingFishViewPagerRealm(this);
    public final AtomicInteger CatchingFishLayout = new AtomicInteger();
    public final Map CatchingFishFragmentHandler = Collections.synchronizedMap(new HashMap());
    public final Map CatchingFishCloudMessaging = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [kotlin.text.CatchingFishMVPWorkManager] */
    /* JADX WARN: Type inference failed for: r0v13, types: [kotlin.text.CatchingFishMVPWorkManager] */
    /* JADX WARN: Type inference failed for: r0v14, types: [kotlin.text.CatchingFishMVPWorkManager] */
    /* JADX WARN: Type inference failed for: r0v15, types: [kotlin.text.CatchingFishMVPWorkManager] */
    public CatchingFishToastSharedFlow() {
        Collections.synchronizedMap(new HashMap());
        this.CatchingFishEspressoTesting = new CatchingFishBundleGlide(this);
        this.CatchingFishOkHttp = new CopyOnWriteArrayList();
        final int i = 0;
        this.CatchingFishUnitTesting = new CatchingFishKtorKtorPayPal(this) { // from class: kotlin.text.CatchingFishMVPWorkManager
            public final /* synthetic */ CatchingFishToastSharedFlow CatchingFishSnackbar;

            {
                this.CatchingFishSnackbar = this;
            }

            @Override // kotlin.text.CatchingFishKtorKtorPayPal
            public final void accept(Object obj) {
                switch (i) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        CatchingFishToastSharedFlow catchingFishToastSharedFlow = this.CatchingFishSnackbar;
                        if (catchingFishToastSharedFlow.CatchingFishJobScheduler()) {
                            catchingFishToastSharedFlow.CatchingFishViewModelFAB(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        CatchingFishToastSharedFlow catchingFishToastSharedFlow2 = this.CatchingFishSnackbar;
                        if (catchingFishToastSharedFlow2.CatchingFishJobScheduler() && num.intValue() == 80) {
                            catchingFishToastSharedFlow2.CatchingFishEspressoTesting(false);
                            break;
                        }
                        break;
                    case 2:
                        CatchingFishViewHiltContext catchingFishViewHiltContext = (CatchingFishViewHiltContext) obj;
                        CatchingFishToastSharedFlow catchingFishToastSharedFlow3 = this.CatchingFishSnackbar;
                        if (catchingFishToastSharedFlow3.CatchingFishJobScheduler()) {
                            boolean z = catchingFishViewHiltContext.CatchingFishParcelableFAB;
                            catchingFishToastSharedFlow3.CatchingFishOkHttp(false);
                            break;
                        }
                        break;
                    default:
                        CatchingFishPayPalMVPMVP catchingFishPayPalMVPMVP = (CatchingFishPayPalMVPMVP) obj;
                        CatchingFishToastSharedFlow catchingFishToastSharedFlow4 = this.CatchingFishSnackbar;
                        if (catchingFishToastSharedFlow4.CatchingFishJobScheduler()) {
                            boolean z2 = catchingFishPayPalMVPMVP.CatchingFishParcelableFAB;
                            catchingFishToastSharedFlow4.CatchingFishNavigation(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.CatchingFishAnimationMockk = new CatchingFishKtorKtorPayPal(this) { // from class: kotlin.text.CatchingFishMVPWorkManager
            public final /* synthetic */ CatchingFishToastSharedFlow CatchingFishSnackbar;

            {
                this.CatchingFishSnackbar = this;
            }

            @Override // kotlin.text.CatchingFishKtorKtorPayPal
            public final void accept(Object obj) {
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        CatchingFishToastSharedFlow catchingFishToastSharedFlow = this.CatchingFishSnackbar;
                        if (catchingFishToastSharedFlow.CatchingFishJobScheduler()) {
                            catchingFishToastSharedFlow.CatchingFishViewModelFAB(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        CatchingFishToastSharedFlow catchingFishToastSharedFlow2 = this.CatchingFishSnackbar;
                        if (catchingFishToastSharedFlow2.CatchingFishJobScheduler() && num.intValue() == 80) {
                            catchingFishToastSharedFlow2.CatchingFishEspressoTesting(false);
                            break;
                        }
                        break;
                    case 2:
                        CatchingFishViewHiltContext catchingFishViewHiltContext = (CatchingFishViewHiltContext) obj;
                        CatchingFishToastSharedFlow catchingFishToastSharedFlow3 = this.CatchingFishSnackbar;
                        if (catchingFishToastSharedFlow3.CatchingFishJobScheduler()) {
                            boolean z = catchingFishViewHiltContext.CatchingFishParcelableFAB;
                            catchingFishToastSharedFlow3.CatchingFishOkHttp(false);
                            break;
                        }
                        break;
                    default:
                        CatchingFishPayPalMVPMVP catchingFishPayPalMVPMVP = (CatchingFishPayPalMVPMVP) obj;
                        CatchingFishToastSharedFlow catchingFishToastSharedFlow4 = this.CatchingFishSnackbar;
                        if (catchingFishToastSharedFlow4.CatchingFishJobScheduler()) {
                            boolean z2 = catchingFishPayPalMVPMVP.CatchingFishParcelableFAB;
                            catchingFishToastSharedFlow4.CatchingFishNavigation(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.CatchingFishStateLiveData = new CatchingFishKtorKtorPayPal(this) { // from class: kotlin.text.CatchingFishMVPWorkManager
            public final /* synthetic */ CatchingFishToastSharedFlow CatchingFishSnackbar;

            {
                this.CatchingFishSnackbar = this;
            }

            @Override // kotlin.text.CatchingFishKtorKtorPayPal
            public final void accept(Object obj) {
                switch (i3) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        CatchingFishToastSharedFlow catchingFishToastSharedFlow = this.CatchingFishSnackbar;
                        if (catchingFishToastSharedFlow.CatchingFishJobScheduler()) {
                            catchingFishToastSharedFlow.CatchingFishViewModelFAB(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        CatchingFishToastSharedFlow catchingFishToastSharedFlow2 = this.CatchingFishSnackbar;
                        if (catchingFishToastSharedFlow2.CatchingFishJobScheduler() && num.intValue() == 80) {
                            catchingFishToastSharedFlow2.CatchingFishEspressoTesting(false);
                            break;
                        }
                        break;
                    case 2:
                        CatchingFishViewHiltContext catchingFishViewHiltContext = (CatchingFishViewHiltContext) obj;
                        CatchingFishToastSharedFlow catchingFishToastSharedFlow3 = this.CatchingFishSnackbar;
                        if (catchingFishToastSharedFlow3.CatchingFishJobScheduler()) {
                            boolean z = catchingFishViewHiltContext.CatchingFishParcelableFAB;
                            catchingFishToastSharedFlow3.CatchingFishOkHttp(false);
                            break;
                        }
                        break;
                    default:
                        CatchingFishPayPalMVPMVP catchingFishPayPalMVPMVP = (CatchingFishPayPalMVPMVP) obj;
                        CatchingFishToastSharedFlow catchingFishToastSharedFlow4 = this.CatchingFishSnackbar;
                        if (catchingFishToastSharedFlow4.CatchingFishJobScheduler()) {
                            boolean z2 = catchingFishPayPalMVPMVP.CatchingFishParcelableFAB;
                            catchingFishToastSharedFlow4.CatchingFishNavigation(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.CatchingFishRoomDatabase = new CatchingFishKtorKtorPayPal(this) { // from class: kotlin.text.CatchingFishMVPWorkManager
            public final /* synthetic */ CatchingFishToastSharedFlow CatchingFishSnackbar;

            {
                this.CatchingFishSnackbar = this;
            }

            @Override // kotlin.text.CatchingFishKtorKtorPayPal
            public final void accept(Object obj) {
                switch (i4) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        CatchingFishToastSharedFlow catchingFishToastSharedFlow = this.CatchingFishSnackbar;
                        if (catchingFishToastSharedFlow.CatchingFishJobScheduler()) {
                            catchingFishToastSharedFlow.CatchingFishViewModelFAB(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        CatchingFishToastSharedFlow catchingFishToastSharedFlow2 = this.CatchingFishSnackbar;
                        if (catchingFishToastSharedFlow2.CatchingFishJobScheduler() && num.intValue() == 80) {
                            catchingFishToastSharedFlow2.CatchingFishEspressoTesting(false);
                            break;
                        }
                        break;
                    case 2:
                        CatchingFishViewHiltContext catchingFishViewHiltContext = (CatchingFishViewHiltContext) obj;
                        CatchingFishToastSharedFlow catchingFishToastSharedFlow3 = this.CatchingFishSnackbar;
                        if (catchingFishToastSharedFlow3.CatchingFishJobScheduler()) {
                            boolean z = catchingFishViewHiltContext.CatchingFishParcelableFAB;
                            catchingFishToastSharedFlow3.CatchingFishOkHttp(false);
                            break;
                        }
                        break;
                    default:
                        CatchingFishPayPalMVPMVP catchingFishPayPalMVPMVP = (CatchingFishPayPalMVPMVP) obj;
                        CatchingFishToastSharedFlow catchingFishToastSharedFlow4 = this.CatchingFishSnackbar;
                        if (catchingFishToastSharedFlow4.CatchingFishJobScheduler()) {
                            boolean z2 = catchingFishPayPalMVPMVP.CatchingFishParcelableFAB;
                            catchingFishToastSharedFlow4.CatchingFishNavigation(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.CatchingFishNavigation = new CatchingFishLiveDataToast(this);
        this.CatchingFish = -1;
        this.CatchingFishParcelableFlux = new CatchingFishFABStateFlow(this);
        this.CatchingFishGsonAppCompat = new CatchingFishGradleMVVM(20);
        this.CatchingFishMVPRobolectric = new ArrayDeque();
        this.CatchingFishHandler = new CatchingFishGsonRealm(9, this);
    }

    public static boolean CatchingFishFragmentFactory(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean CatchingFishMutableLiveData(CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi) {
        catchingFishGoogleMapsMoshi.getClass();
        ArrayList CatchingFishAnimationMockk = catchingFishGoogleMapsMoshi.CatchingFishSpannableWidget.CatchingFishCoroutine.CatchingFishAnimationMockk();
        int size = CatchingFishAnimationMockk.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = CatchingFishAnimationMockk.get(i);
            i++;
            CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi2 = (CatchingFishGoogleMapsMoshi) obj;
            if (catchingFishGoogleMapsMoshi2 != null) {
                z = CatchingFishMutableLiveData(catchingFishGoogleMapsMoshi2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean CatchingFishPayPalService(CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi) {
        if (catchingFishGoogleMapsMoshi == null) {
            return true;
        }
        if (catchingFishGoogleMapsMoshi.CatchingFishFragmentFactory) {
            return catchingFishGoogleMapsMoshi.CatchingFishCoroutineFlow == null || CatchingFishPayPalService(catchingFishGoogleMapsMoshi.CatchingFishParcelableFlux);
        }
        return false;
    }

    public static boolean CatchingFishSensorManager(CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi) {
        if (catchingFishGoogleMapsMoshi == null) {
            return true;
        }
        CatchingFishToastSharedFlow catchingFishToastSharedFlow = catchingFishGoogleMapsMoshi.CatchingFishCoroutineFlow;
        return catchingFishGoogleMapsMoshi.equals(catchingFishToastSharedFlow.CatchingFishSpannableWidget) && CatchingFishSensorManager(catchingFishToastSharedFlow.CatchingFishDaggerHiltFAB);
    }

    public final boolean CatchingFish() {
        if (this.CatchingFish < 1) {
            return false;
        }
        boolean z = false;
        for (CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi : this.CatchingFishCoroutine.CatchingFishStateLiveData()) {
            if (catchingFishGoogleMapsMoshi != null && CatchingFishPayPalService(catchingFishGoogleMapsMoshi)) {
                if (!catchingFishGoogleMapsMoshi.CatchingFishCardViewView ? catchingFishGoogleMapsMoshi.CatchingFishSpannableWidget.CatchingFish() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void CatchingFishAnimation() {
        ArrayList CatchingFishUnitTesting = this.CatchingFishCoroutine.CatchingFishUnitTesting();
        int size = CatchingFishUnitTesting.size();
        int i = 0;
        while (i < size) {
            Object obj = CatchingFishUnitTesting.get(i);
            i++;
            CatchingFishStateFlowMockk catchingFishStateFlowMockk = (CatchingFishStateFlowMockk) obj;
            CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = catchingFishStateFlowMockk.CatchingFishCoroutine;
            if (catchingFishGoogleMapsMoshi.CatchingFishSensorManager) {
                if (this.CatchingFishSnackbar) {
                    this.CatchingFishPayPalService = true;
                } else {
                    catchingFishGoogleMapsMoshi.CatchingFishSensorManager = false;
                    catchingFishStateFlowMockk.CatchingFishCloudMessaging();
                }
            }
        }
    }

    public final boolean CatchingFishAnimationMockk() {
        if (this.CatchingFish >= 1) {
            for (CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi : this.CatchingFishCoroutine.CatchingFishStateLiveData()) {
                if (catchingFishGoogleMapsMoshi != null) {
                    if (!catchingFishGoogleMapsMoshi.CatchingFishCardViewView ? catchingFishGoogleMapsMoshi.CatchingFishSpannableWidget.CatchingFishAnimationMockk() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void CatchingFishAppCompat(CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi, boolean z) {
        ViewGroup CatchingFishCardViewView = CatchingFishCardViewView(catchingFishGoogleMapsMoshi);
        if (CatchingFishCardViewView == null || !(CatchingFishCardViewView instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) CatchingFishCardViewView).setDrawDisappearingViewsLast(!z);
    }

    public final boolean CatchingFishCameraXIntent() {
        return CatchingFishHandler(-1, 0);
    }

    public final void CatchingFishCardViewRealm(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        int i6;
        int i7;
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = this.CatchingFishCoroutine;
        boolean z5 = ((CatchingFishCameraXEspresso) arrayList.get(i)).CatchingFishAnimationMockk;
        ArrayList arrayList3 = this.CatchingFishDagger;
        if (arrayList3 == null) {
            this.CatchingFishDagger = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.CatchingFishDagger.addAll(catchingFishFluxFluxBundle.CatchingFishStateLiveData());
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = this.CatchingFishSpannableWidget;
        int i8 = i;
        boolean z6 = false;
        while (true) {
            int i9 = 1;
            if (i8 >= i2) {
                boolean z7 = z5;
                this.CatchingFishDagger.clear();
                if (!z7 && this.CatchingFish >= 1) {
                    for (int i10 = i; i10 < i2; i10++) {
                        ArrayList arrayList4 = ((CatchingFishCameraXEspresso) arrayList.get(i10)).CatchingFishParcelableFAB;
                        int size = arrayList4.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList4.get(i11);
                            i11++;
                            CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi2 = ((CatchingFishPicassoFAB) obj).CatchingFishSnackbar;
                            if (catchingFishGoogleMapsMoshi2 != null && catchingFishGoogleMapsMoshi2.CatchingFishCoroutineFlow != null) {
                                catchingFishFluxFluxBundle.CatchingFishCoroutineFlow(CatchingFishWorkManager(catchingFishGoogleMapsMoshi2));
                            }
                        }
                    }
                }
                for (int i12 = i; i12 < i2; i12++) {
                    CatchingFishCameraXEspresso catchingFishCameraXEspresso = (CatchingFishCameraXEspresso) arrayList.get(i12);
                    if (((Boolean) arrayList2.get(i12)).booleanValue()) {
                        catchingFishCameraXEspresso.CatchingFishCoroutine(-1);
                        CatchingFishToastSharedFlow catchingFishToastSharedFlow = catchingFishCameraXEspresso.CatchingFishStateLiveData;
                        ArrayList arrayList5 = catchingFishCameraXEspresso.CatchingFishParcelableFAB;
                        boolean z8 = true;
                        for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                            CatchingFishPicassoFAB catchingFishPicassoFAB = (CatchingFishPicassoFAB) arrayList5.get(size2);
                            CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi3 = catchingFishPicassoFAB.CatchingFishSnackbar;
                            if (catchingFishGoogleMapsMoshi3 != null) {
                                if (catchingFishGoogleMapsMoshi3.CatchingFishDagger != null) {
                                    catchingFishGoogleMapsMoshi3.CatchingFishWorkManager().CatchingFishParcelableFAB = z8;
                                }
                                int i13 = catchingFishCameraXEspresso.CatchingFishWorkManager;
                                int i14 = 8194;
                                int i15 = 4097;
                                if (i13 != 4097) {
                                    if (i13 != 8194) {
                                        i14 = 4100;
                                        i15 = 8197;
                                        if (i13 != 8197) {
                                            if (i13 == 4099) {
                                                i14 = 4099;
                                            } else if (i13 != 4100) {
                                                i14 = 0;
                                            }
                                        }
                                    }
                                    i14 = i15;
                                }
                                if (catchingFishGoogleMapsMoshi3.CatchingFishDagger != null || i14 != 0) {
                                    catchingFishGoogleMapsMoshi3.CatchingFishWorkManager();
                                    catchingFishGoogleMapsMoshi3.CatchingFishDagger.CatchingFishWorkManager = i14;
                                }
                                catchingFishGoogleMapsMoshi3.CatchingFishWorkManager();
                                catchingFishGoogleMapsMoshi3.CatchingFishDagger.getClass();
                            }
                            switch (catchingFishPicassoFAB.CatchingFishParcelableFAB) {
                                case 1:
                                    catchingFishGoogleMapsMoshi3.CatchingFishCustomView(catchingFishPicassoFAB.CatchingFishReduxKtor, catchingFishPicassoFAB.CatchingFishDaggerWebsocket, catchingFishPicassoFAB.CatchingFishWorkManager, catchingFishPicassoFAB.CatchingFishViewModelScope);
                                    z8 = true;
                                    catchingFishToastSharedFlow.CatchingFishAppCompat(catchingFishGoogleMapsMoshi3, true);
                                    catchingFishToastSharedFlow.CatchingFishGradleManifest(catchingFishGoogleMapsMoshi3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + catchingFishPicassoFAB.CatchingFishParcelableFAB);
                                case 3:
                                    catchingFishGoogleMapsMoshi3.CatchingFishCustomView(catchingFishPicassoFAB.CatchingFishReduxKtor, catchingFishPicassoFAB.CatchingFishDaggerWebsocket, catchingFishPicassoFAB.CatchingFishWorkManager, catchingFishPicassoFAB.CatchingFishViewModelScope);
                                    catchingFishToastSharedFlow.CatchingFishParcelableFAB(catchingFishGoogleMapsMoshi3);
                                    z8 = true;
                                case 4:
                                    catchingFishGoogleMapsMoshi3.CatchingFishCustomView(catchingFishPicassoFAB.CatchingFishReduxKtor, catchingFishPicassoFAB.CatchingFishDaggerWebsocket, catchingFishPicassoFAB.CatchingFishWorkManager, catchingFishPicassoFAB.CatchingFishViewModelScope);
                                    catchingFishToastSharedFlow.getClass();
                                    if (CatchingFishFragmentFactory(2)) {
                                        Objects.toString(catchingFishGoogleMapsMoshi3);
                                    }
                                    if (catchingFishGoogleMapsMoshi3.CatchingFishCardViewView) {
                                        catchingFishGoogleMapsMoshi3.CatchingFishCardViewView = false;
                                        catchingFishGoogleMapsMoshi3.CatchingFishCameraXIntent = !catchingFishGoogleMapsMoshi3.CatchingFishCameraXIntent;
                                    }
                                    z8 = true;
                                case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                                    catchingFishGoogleMapsMoshi3.CatchingFishCustomView(catchingFishPicassoFAB.CatchingFishReduxKtor, catchingFishPicassoFAB.CatchingFishDaggerWebsocket, catchingFishPicassoFAB.CatchingFishWorkManager, catchingFishPicassoFAB.CatchingFishViewModelScope);
                                    catchingFishToastSharedFlow.CatchingFishAppCompat(catchingFishGoogleMapsMoshi3, true);
                                    if (CatchingFishFragmentFactory(2)) {
                                        Objects.toString(catchingFishGoogleMapsMoshi3);
                                    }
                                    if (!catchingFishGoogleMapsMoshi3.CatchingFishCardViewView) {
                                        catchingFishGoogleMapsMoshi3.CatchingFishCardViewView = true;
                                        catchingFishGoogleMapsMoshi3.CatchingFishCameraXIntent = !catchingFishGoogleMapsMoshi3.CatchingFishCameraXIntent;
                                        catchingFishToastSharedFlow.CatchingFishJUnitRealm(catchingFishGoogleMapsMoshi3);
                                    }
                                    z8 = true;
                                case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                                    catchingFishGoogleMapsMoshi3.CatchingFishCustomView(catchingFishPicassoFAB.CatchingFishReduxKtor, catchingFishPicassoFAB.CatchingFishDaggerWebsocket, catchingFishPicassoFAB.CatchingFishWorkManager, catchingFishPicassoFAB.CatchingFishViewModelScope);
                                    catchingFishToastSharedFlow.CatchingFishCoroutine(catchingFishGoogleMapsMoshi3);
                                    z8 = true;
                                case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                                    catchingFishGoogleMapsMoshi3.CatchingFishCustomView(catchingFishPicassoFAB.CatchingFishReduxKtor, catchingFishPicassoFAB.CatchingFishDaggerWebsocket, catchingFishPicassoFAB.CatchingFishWorkManager, catchingFishPicassoFAB.CatchingFishViewModelScope);
                                    catchingFishToastSharedFlow.CatchingFishAppCompat(catchingFishGoogleMapsMoshi3, true);
                                    catchingFishToastSharedFlow.CatchingFishViewModelScope(catchingFishGoogleMapsMoshi3);
                                    z8 = true;
                                case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                                    catchingFishToastSharedFlow.CatchingFishStateFlow(null);
                                    z8 = true;
                                case 9:
                                    catchingFishToastSharedFlow.CatchingFishStateFlow(catchingFishGoogleMapsMoshi3);
                                    z8 = true;
                                case 10:
                                    catchingFishToastSharedFlow.CatchingFishDataStoreIntent(catchingFishGoogleMapsMoshi3, catchingFishPicassoFAB.CatchingFishViewModelFAB);
                                    z8 = true;
                            }
                        }
                    } else {
                        catchingFishCameraXEspresso.CatchingFishCoroutine(1);
                        CatchingFishToastSharedFlow catchingFishToastSharedFlow2 = catchingFishCameraXEspresso.CatchingFishStateLiveData;
                        ArrayList arrayList6 = catchingFishCameraXEspresso.CatchingFishParcelableFAB;
                        int size3 = arrayList6.size();
                        for (int i16 = 0; i16 < size3; i16++) {
                            CatchingFishPicassoFAB catchingFishPicassoFAB2 = (CatchingFishPicassoFAB) arrayList6.get(i16);
                            CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi4 = catchingFishPicassoFAB2.CatchingFishSnackbar;
                            if (catchingFishGoogleMapsMoshi4 != null) {
                                if (catchingFishGoogleMapsMoshi4.CatchingFishDagger != null) {
                                    catchingFishGoogleMapsMoshi4.CatchingFishWorkManager().CatchingFishParcelableFAB = false;
                                }
                                int i17 = catchingFishCameraXEspresso.CatchingFishWorkManager;
                                if (catchingFishGoogleMapsMoshi4.CatchingFishDagger != null || i17 != 0) {
                                    catchingFishGoogleMapsMoshi4.CatchingFishWorkManager();
                                    catchingFishGoogleMapsMoshi4.CatchingFishDagger.CatchingFishWorkManager = i17;
                                }
                                catchingFishGoogleMapsMoshi4.CatchingFishWorkManager();
                                catchingFishGoogleMapsMoshi4.CatchingFishDagger.getClass();
                            }
                            switch (catchingFishPicassoFAB2.CatchingFishParcelableFAB) {
                                case 1:
                                    catchingFishGoogleMapsMoshi4.CatchingFishCustomView(catchingFishPicassoFAB2.CatchingFishReduxKtor, catchingFishPicassoFAB2.CatchingFishDaggerWebsocket, catchingFishPicassoFAB2.CatchingFishWorkManager, catchingFishPicassoFAB2.CatchingFishViewModelScope);
                                    catchingFishToastSharedFlow2.CatchingFishAppCompat(catchingFishGoogleMapsMoshi4, false);
                                    catchingFishToastSharedFlow2.CatchingFishParcelableFAB(catchingFishGoogleMapsMoshi4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + catchingFishPicassoFAB2.CatchingFishParcelableFAB);
                                case 3:
                                    catchingFishGoogleMapsMoshi4.CatchingFishCustomView(catchingFishPicassoFAB2.CatchingFishReduxKtor, catchingFishPicassoFAB2.CatchingFishDaggerWebsocket, catchingFishPicassoFAB2.CatchingFishWorkManager, catchingFishPicassoFAB2.CatchingFishViewModelScope);
                                    catchingFishToastSharedFlow2.CatchingFishGradleManifest(catchingFishGoogleMapsMoshi4);
                                case 4:
                                    catchingFishGoogleMapsMoshi4.CatchingFishCustomView(catchingFishPicassoFAB2.CatchingFishReduxKtor, catchingFishPicassoFAB2.CatchingFishDaggerWebsocket, catchingFishPicassoFAB2.CatchingFishWorkManager, catchingFishPicassoFAB2.CatchingFishViewModelScope);
                                    catchingFishToastSharedFlow2.getClass();
                                    if (CatchingFishFragmentFactory(2)) {
                                        Objects.toString(catchingFishGoogleMapsMoshi4);
                                    }
                                    if (!catchingFishGoogleMapsMoshi4.CatchingFishCardViewView) {
                                        catchingFishGoogleMapsMoshi4.CatchingFishCardViewView = true;
                                        catchingFishGoogleMapsMoshi4.CatchingFishCameraXIntent = !catchingFishGoogleMapsMoshi4.CatchingFishCameraXIntent;
                                        catchingFishToastSharedFlow2.CatchingFishJUnitRealm(catchingFishGoogleMapsMoshi4);
                                    }
                                case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                                    catchingFishGoogleMapsMoshi4.CatchingFishCustomView(catchingFishPicassoFAB2.CatchingFishReduxKtor, catchingFishPicassoFAB2.CatchingFishDaggerWebsocket, catchingFishPicassoFAB2.CatchingFishWorkManager, catchingFishPicassoFAB2.CatchingFishViewModelScope);
                                    catchingFishToastSharedFlow2.CatchingFishAppCompat(catchingFishGoogleMapsMoshi4, false);
                                    if (CatchingFishFragmentFactory(2)) {
                                        Objects.toString(catchingFishGoogleMapsMoshi4);
                                    }
                                    if (catchingFishGoogleMapsMoshi4.CatchingFishCardViewView) {
                                        catchingFishGoogleMapsMoshi4.CatchingFishCardViewView = false;
                                        catchingFishGoogleMapsMoshi4.CatchingFishCameraXIntent = !catchingFishGoogleMapsMoshi4.CatchingFishCameraXIntent;
                                    }
                                case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                                    catchingFishGoogleMapsMoshi4.CatchingFishCustomView(catchingFishPicassoFAB2.CatchingFishReduxKtor, catchingFishPicassoFAB2.CatchingFishDaggerWebsocket, catchingFishPicassoFAB2.CatchingFishWorkManager, catchingFishPicassoFAB2.CatchingFishViewModelScope);
                                    catchingFishToastSharedFlow2.CatchingFishViewModelScope(catchingFishGoogleMapsMoshi4);
                                case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                                    catchingFishGoogleMapsMoshi4.CatchingFishCustomView(catchingFishPicassoFAB2.CatchingFishReduxKtor, catchingFishPicassoFAB2.CatchingFishDaggerWebsocket, catchingFishPicassoFAB2.CatchingFishWorkManager, catchingFishPicassoFAB2.CatchingFishViewModelScope);
                                    catchingFishToastSharedFlow2.CatchingFishAppCompat(catchingFishGoogleMapsMoshi4, false);
                                    catchingFishToastSharedFlow2.CatchingFishCoroutine(catchingFishGoogleMapsMoshi4);
                                case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                                    catchingFishToastSharedFlow2.CatchingFishStateFlow(catchingFishGoogleMapsMoshi4);
                                case 9:
                                    catchingFishToastSharedFlow2.CatchingFishStateFlow(null);
                                case 10:
                                    catchingFishToastSharedFlow2.CatchingFishDataStoreIntent(catchingFishGoogleMapsMoshi4, catchingFishPicassoFAB2.CatchingFishLayout);
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i18 = i; i18 < i2; i18++) {
                    CatchingFishCameraXEspresso catchingFishCameraXEspresso2 = (CatchingFishCameraXEspresso) arrayList.get(i18);
                    if (booleanValue) {
                        for (int size4 = catchingFishCameraXEspresso2.CatchingFishParcelableFAB.size() - 1; size4 >= 0; size4--) {
                            CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi5 = ((CatchingFishPicassoFAB) catchingFishCameraXEspresso2.CatchingFishParcelableFAB.get(size4)).CatchingFishSnackbar;
                            if (catchingFishGoogleMapsMoshi5 != null) {
                                CatchingFishWorkManager(catchingFishGoogleMapsMoshi5).CatchingFishCloudMessaging();
                            }
                        }
                    } else {
                        ArrayList arrayList7 = catchingFishCameraXEspresso2.CatchingFishParcelableFAB;
                        int size5 = arrayList7.size();
                        int i19 = 0;
                        while (i19 < size5) {
                            Object obj2 = arrayList7.get(i19);
                            i19++;
                            CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi6 = ((CatchingFishPicassoFAB) obj2).CatchingFishSnackbar;
                            if (catchingFishGoogleMapsMoshi6 != null) {
                                CatchingFishWorkManager(catchingFishGoogleMapsMoshi6).CatchingFishCloudMessaging();
                            }
                        }
                    }
                }
                CatchingFishEspressoMockk(this.CatchingFish, true);
                HashSet hashSet = new HashSet();
                for (int i20 = i; i20 < i2; i20++) {
                    ArrayList arrayList8 = ((CatchingFishCameraXEspresso) arrayList.get(i20)).CatchingFishParcelableFAB;
                    int size6 = arrayList8.size();
                    int i21 = 0;
                    while (i21 < size6) {
                        Object obj3 = arrayList8.get(i21);
                        i21++;
                        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi7 = ((CatchingFishPicassoFAB) obj3).CatchingFishSnackbar;
                        if (catchingFishGoogleMapsMoshi7 != null && (viewGroup = catchingFishGoogleMapsMoshi7.CatchingFishJobScheduler) != null) {
                            hashSet.add(CatchingFishMoshiGraphQL.CatchingFishWorkManager(viewGroup, CatchingFishCustomView()));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    CatchingFishMoshiGraphQL catchingFishMoshiGraphQL = (CatchingFishMoshiGraphQL) it.next();
                    catchingFishMoshiGraphQL.CatchingFishReduxKtor = booleanValue;
                    synchronized (catchingFishMoshiGraphQL.CatchingFishSnackbar) {
                        try {
                            catchingFishMoshiGraphQL.CatchingFishViewModelScope();
                            catchingFishMoshiGraphQL.CatchingFishDaggerWebsocket = false;
                            int size7 = catchingFishMoshiGraphQL.CatchingFishSnackbar.size() - 1;
                            while (true) {
                                if (size7 >= 0) {
                                    CatchingFishMVPDatabinding catchingFishMVPDatabinding = (CatchingFishMVPDatabinding) catchingFishMoshiGraphQL.CatchingFishSnackbar.get(size7);
                                    int CatchingFishCoroutine = CatchingFishMVPLiveData.CatchingFishCoroutine(catchingFishMVPDatabinding.CatchingFishCoroutine.CatchingFishPayPalService);
                                    if (catchingFishMVPDatabinding.CatchingFishParcelableFAB != 2 || CatchingFishCoroutine == 2) {
                                        size7--;
                                    } else {
                                        CatchingFishGradleEspresso catchingFishGradleEspresso = catchingFishMVPDatabinding.CatchingFishCoroutine.CatchingFishDagger;
                                        catchingFishMoshiGraphQL.CatchingFishDaggerWebsocket = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    catchingFishMoshiGraphQL.CatchingFishCoroutine();
                }
                for (int i22 = i; i22 < i2; i22++) {
                    CatchingFishCameraXEspresso catchingFishCameraXEspresso3 = (CatchingFishCameraXEspresso) arrayList.get(i22);
                    if (((Boolean) arrayList2.get(i22)).booleanValue() && catchingFishCameraXEspresso3.CatchingFishNavigation >= 0) {
                        catchingFishCameraXEspresso3.CatchingFishNavigation = -1;
                    }
                    catchingFishCameraXEspresso3.getClass();
                }
                return;
            }
            CatchingFishCameraXEspresso catchingFishCameraXEspresso4 = (CatchingFishCameraXEspresso) arrayList.get(i8);
            if (((Boolean) arrayList2.get(i8)).booleanValue()) {
                z = z5;
                i3 = i8;
                z2 = z6;
                int i23 = 1;
                ArrayList arrayList9 = this.CatchingFishDagger;
                ArrayList arrayList10 = catchingFishCameraXEspresso4.CatchingFishParcelableFAB;
                int size8 = arrayList10.size() - 1;
                while (size8 >= 0) {
                    CatchingFishPicassoFAB catchingFishPicassoFAB3 = (CatchingFishPicassoFAB) arrayList10.get(size8);
                    int i24 = catchingFishPicassoFAB3.CatchingFishParcelableFAB;
                    if (i24 != i23) {
                        if (i24 != 3) {
                            switch (i24) {
                                case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                                    catchingFishGoogleMapsMoshi = null;
                                    break;
                                case 9:
                                    catchingFishGoogleMapsMoshi = catchingFishPicassoFAB3.CatchingFishSnackbar;
                                    break;
                                case 10:
                                    catchingFishPicassoFAB3.CatchingFishLayout = catchingFishPicassoFAB3.CatchingFishViewModelFAB;
                                    break;
                            }
                            size8--;
                            i23 = 1;
                        }
                        arrayList9.add(catchingFishPicassoFAB3.CatchingFishSnackbar);
                        size8--;
                        i23 = 1;
                    }
                    arrayList9.remove(catchingFishPicassoFAB3.CatchingFishSnackbar);
                    size8--;
                    i23 = 1;
                }
            } else {
                ArrayList arrayList11 = this.CatchingFishDagger;
                ArrayList arrayList12 = catchingFishCameraXEspresso4.CatchingFishParcelableFAB;
                int i25 = 0;
                while (i25 < arrayList12.size()) {
                    CatchingFishPicassoFAB catchingFishPicassoFAB4 = (CatchingFishPicassoFAB) arrayList12.get(i25);
                    int i26 = catchingFishPicassoFAB4.CatchingFishParcelableFAB;
                    if (i26 != i9) {
                        if (i26 != 2) {
                            if (i26 == 3 || i26 == 6) {
                                z3 = z5;
                                arrayList11.remove(catchingFishPicassoFAB4.CatchingFishSnackbar);
                                CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi8 = catchingFishPicassoFAB4.CatchingFishSnackbar;
                                if (catchingFishGoogleMapsMoshi8 == catchingFishGoogleMapsMoshi) {
                                    arrayList12.add(i25, new CatchingFishPicassoFAB(9, catchingFishGoogleMapsMoshi8));
                                    i25++;
                                    i5 = i8;
                                    z4 = z6;
                                    i4 = 1;
                                    catchingFishGoogleMapsMoshi = null;
                                }
                            } else if (i26 == 7) {
                                z3 = z5;
                                i4 = 1;
                            } else if (i26 != 8) {
                                z3 = z5;
                            } else {
                                z3 = z5;
                                arrayList12.add(i25, new CatchingFishPicassoFAB(9, catchingFishGoogleMapsMoshi, 0));
                                catchingFishPicassoFAB4.CatchingFishCoroutine = true;
                                i25++;
                                catchingFishGoogleMapsMoshi = catchingFishPicassoFAB4.CatchingFishSnackbar;
                            }
                            i5 = i8;
                            z4 = z6;
                            i4 = 1;
                        } else {
                            z3 = z5;
                            CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi9 = catchingFishPicassoFAB4.CatchingFishSnackbar;
                            int i27 = catchingFishGoogleMapsMoshi9.CatchingFishCardViewRealm;
                            int size9 = arrayList11.size() - 1;
                            boolean z9 = false;
                            while (size9 >= 0) {
                                int i28 = i8;
                                CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi10 = (CatchingFishGoogleMapsMoshi) arrayList11.get(size9);
                                boolean z10 = z6;
                                if (catchingFishGoogleMapsMoshi10.CatchingFishCardViewRealm != i27) {
                                    i6 = i27;
                                } else if (catchingFishGoogleMapsMoshi10 == catchingFishGoogleMapsMoshi9) {
                                    i6 = i27;
                                    z9 = true;
                                } else {
                                    if (catchingFishGoogleMapsMoshi10 == catchingFishGoogleMapsMoshi) {
                                        i6 = i27;
                                        i7 = 0;
                                        arrayList12.add(i25, new CatchingFishPicassoFAB(9, catchingFishGoogleMapsMoshi10, 0));
                                        i25++;
                                        catchingFishGoogleMapsMoshi = null;
                                    } else {
                                        i6 = i27;
                                        i7 = 0;
                                    }
                                    CatchingFishPicassoFAB catchingFishPicassoFAB5 = new CatchingFishPicassoFAB(3, catchingFishGoogleMapsMoshi10, i7);
                                    catchingFishPicassoFAB5.CatchingFishReduxKtor = catchingFishPicassoFAB4.CatchingFishReduxKtor;
                                    catchingFishPicassoFAB5.CatchingFishWorkManager = catchingFishPicassoFAB4.CatchingFishWorkManager;
                                    catchingFishPicassoFAB5.CatchingFishDaggerWebsocket = catchingFishPicassoFAB4.CatchingFishDaggerWebsocket;
                                    catchingFishPicassoFAB5.CatchingFishViewModelScope = catchingFishPicassoFAB4.CatchingFishViewModelScope;
                                    arrayList12.add(i25, catchingFishPicassoFAB5);
                                    arrayList11.remove(catchingFishGoogleMapsMoshi10);
                                    i25++;
                                    catchingFishGoogleMapsMoshi = catchingFishGoogleMapsMoshi;
                                }
                                size9--;
                                i27 = i6;
                                z6 = z10;
                                i8 = i28;
                            }
                            i5 = i8;
                            z4 = z6;
                            i4 = 1;
                            if (z9) {
                                arrayList12.remove(i25);
                                i25--;
                            } else {
                                catchingFishPicassoFAB4.CatchingFishParcelableFAB = 1;
                                catchingFishPicassoFAB4.CatchingFishCoroutine = true;
                                arrayList11.add(catchingFishGoogleMapsMoshi9);
                            }
                        }
                        i25 += i4;
                        i9 = i4;
                        z5 = z3;
                        z6 = z4;
                        i8 = i5;
                    } else {
                        z3 = z5;
                        i4 = i9;
                    }
                    i5 = i8;
                    z4 = z6;
                    arrayList11.add(catchingFishPicassoFAB4.CatchingFishSnackbar);
                    i25 += i4;
                    i9 = i4;
                    z5 = z3;
                    z6 = z4;
                    i8 = i5;
                }
                z = z5;
                i3 = i8;
                z2 = z6;
            }
            z6 = z2 || catchingFishCameraXEspresso4.CatchingFishViewModelScope;
            i8 = i3 + 1;
            z5 = z;
        }
    }

    public final ViewGroup CatchingFishCardViewView(CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi) {
        ViewGroup viewGroup = catchingFishGoogleMapsMoshi.CatchingFishJobScheduler;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (catchingFishGoogleMapsMoshi.CatchingFishCardViewRealm <= 0 || !this.CatchingFishCoroutineFlow.CatchingFishDagger()) {
            return null;
        }
        View CatchingFishEspressoMockk = this.CatchingFishCoroutineFlow.CatchingFishEspressoMockk(catchingFishGoogleMapsMoshi.CatchingFishCardViewRealm);
        if (CatchingFishEspressoMockk instanceof ViewGroup) {
            return (ViewGroup) CatchingFishEspressoMockk;
        }
        return null;
    }

    public final void CatchingFishCloudMessaging() {
        boolean z;
        boolean isTerminated;
        this.CatchingFishJobScheduler = true;
        CatchingFishGsonAppCompat(true);
        Iterator it = CatchingFishDaggerWebsocket().iterator();
        while (it.hasNext()) {
            ((CatchingFishMoshiGraphQL) it.next()).CatchingFishDaggerWebsocket();
        }
        CatchingFishMVIPicasso catchingFishMVIPicasso = this.CatchingFishJetpackCompose;
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = this.CatchingFishCoroutine;
        if (catchingFishMVIPicasso != null) {
            z = ((CatchingFishRetrofitFAB) catchingFishFluxFluxBundle.CatchingFishViewModelScope).CatchingFishWorkManager;
        } else {
            z = catchingFishMVIPicasso.CatchingFishCoroutineFlow != null ? !r1.isChangingConfigurations() : true;
        }
        int i = 0;
        if (z) {
            Iterator it2 = this.CatchingFishFragmentHandler.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((CatchingFishFragmentGradle) it2.next()).CatchingFishReduxKtor;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((CatchingFishRetrofitFAB) catchingFishFluxFluxBundle.CatchingFishViewModelScope).CatchingFishCoroutine((String) obj);
                }
            }
        }
        CatchingFishJetpackCompose(-1);
        CatchingFishMVIPicasso catchingFishMVIPicasso2 = this.CatchingFishJetpackCompose;
        if (catchingFishMVIPicasso2 != null) {
            FragmentActivity fragmentActivity = catchingFishMVIPicasso2.CatchingFishParcelableFlux;
            fragmentActivity.getClass();
            CatchingFishMVPWorkManager catchingFishMVPWorkManager = this.CatchingFishAnimationMockk;
            CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMVPWorkManager, "listener");
            fragmentActivity.CatchingFishUnitTesting.remove(catchingFishMVPWorkManager);
        }
        CatchingFishMVIPicasso catchingFishMVIPicasso3 = this.CatchingFishJetpackCompose;
        if (catchingFishMVIPicasso3 != null) {
            FragmentActivity fragmentActivity2 = catchingFishMVIPicasso3.CatchingFishParcelableFlux;
            fragmentActivity2.getClass();
            CatchingFishMVPWorkManager catchingFishMVPWorkManager2 = this.CatchingFishUnitTesting;
            CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMVPWorkManager2, "listener");
            fragmentActivity2.CatchingFishOkHttp.remove(catchingFishMVPWorkManager2);
        }
        CatchingFishMVIPicasso catchingFishMVIPicasso4 = this.CatchingFishJetpackCompose;
        if (catchingFishMVIPicasso4 != null) {
            FragmentActivity fragmentActivity3 = catchingFishMVIPicasso4.CatchingFishParcelableFlux;
            fragmentActivity3.getClass();
            CatchingFishMVPWorkManager catchingFishMVPWorkManager3 = this.CatchingFishStateLiveData;
            CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMVPWorkManager3, "listener");
            fragmentActivity3.CatchingFishStateLiveData.remove(catchingFishMVPWorkManager3);
        }
        CatchingFishMVIPicasso catchingFishMVIPicasso5 = this.CatchingFishJetpackCompose;
        if (catchingFishMVIPicasso5 != null) {
            FragmentActivity fragmentActivity4 = catchingFishMVIPicasso5.CatchingFishParcelableFlux;
            fragmentActivity4.getClass();
            CatchingFishMVPWorkManager catchingFishMVPWorkManager4 = this.CatchingFishRoomDatabase;
            CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMVPWorkManager4, "listener");
            fragmentActivity4.CatchingFishRoomDatabase.remove(catchingFishMVPWorkManager4);
        }
        CatchingFishMVIPicasso catchingFishMVIPicasso6 = this.CatchingFishJetpackCompose;
        if (catchingFishMVIPicasso6 != null) {
            FragmentActivity fragmentActivity5 = catchingFishMVIPicasso6.CatchingFishParcelableFlux;
            fragmentActivity5.getClass();
            CatchingFishLiveDataToast catchingFishLiveDataToast = this.CatchingFishNavigation;
            CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishLiveDataToast, "provider");
            CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = fragmentActivity5.CatchingFishWorkManager;
            ((CopyOnWriteArrayList) catchingFishAsyncTaskDagger.CatchingFishViewModelScope).remove(catchingFishLiveDataToast);
            if (((HashMap) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket).remove(catchingFishLiveDataToast) != null) {
                throw new ClassCastException();
            }
            ((Runnable) catchingFishAsyncTaskDagger.CatchingFishWorkManager).run();
        }
        this.CatchingFishJetpackCompose = null;
        this.CatchingFishCoroutineFlow = null;
        this.CatchingFishDaggerHiltFAB = null;
        if (this.CatchingFishViewModelScope != null) {
            CatchingFishViewPagerRealm catchingFishViewPagerRealm = this.CatchingFishViewModelFAB;
            ArrayList arrayList2 = catchingFishViewPagerRealm.CatchingFishParcelableFAB;
            CopyOnWriteArrayList copyOnWriteArrayList = catchingFishViewPagerRealm.CatchingFishCoroutine;
            Iterator it3 = copyOnWriteArrayList.iterator();
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(it3, "iterator(...)");
            while (it3.hasNext()) {
                AutoCloseable autoCloseable = (AutoCloseable) it3.next();
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z2 = false;
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z2) {
                                    executorService.shutdownNow();
                                    z2 = true;
                                }
                            }
                        }
                        if (z2) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                } else {
                    if (!(autoCloseable instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) autoCloseable).release();
                }
            }
            copyOnWriteArrayList.clear();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((CatchingFishViewFABEspresso) obj2).CatchingFishParcelableFAB();
            }
            arrayList2.clear();
            this.CatchingFishViewModelScope = null;
        }
        CatchingFishMoshiFABMVVM catchingFishMoshiFABMVVM = this.CatchingFishCardViewRealm;
        if (catchingFishMoshiFABMVVM != null) {
            catchingFishMoshiFABMVVM.CatchingFishSnackbar.CatchingFishDaggerWebsocket(catchingFishMoshiFABMVVM.CatchingFishCoroutine);
            CatchingFishMoshiFABMVVM catchingFishMoshiFABMVVM2 = this.CatchingFishPayPal;
            catchingFishMoshiFABMVVM2.CatchingFishSnackbar.CatchingFishDaggerWebsocket(catchingFishMoshiFABMVVM2.CatchingFishCoroutine);
            CatchingFishMoshiFABMVVM catchingFishMoshiFABMVVM3 = this.CatchingFishCardViewView;
            catchingFishMoshiFABMVVM3.CatchingFishSnackbar.CatchingFishDaggerWebsocket(catchingFishMoshiFABMVVM3.CatchingFishCoroutine);
        }
    }

    public final void CatchingFishCoroutine(CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi) {
        if (CatchingFishFragmentFactory(2)) {
            Objects.toString(catchingFishGoogleMapsMoshi);
        }
        if (catchingFishGoogleMapsMoshi.CatchingFishMVPRobolectric) {
            catchingFishGoogleMapsMoshi.CatchingFishMVPRobolectric = false;
            if (catchingFishGoogleMapsMoshi.CatchingFishUnitTesting) {
                return;
            }
            this.CatchingFishCoroutine.CatchingFishParcelableFAB(catchingFishGoogleMapsMoshi);
            if (CatchingFishFragmentFactory(2)) {
                catchingFishGoogleMapsMoshi.toString();
            }
            if (CatchingFishMutableLiveData(catchingFishGoogleMapsMoshi)) {
                this.CatchingFishCustomView = true;
            }
        }
    }

    public final void CatchingFishCoroutineFlow() {
        if (this.CatchingFishPayPalService) {
            this.CatchingFishPayPalService = false;
            CatchingFishAnimation();
        }
    }

    public final CatchingFishGradleMVVM CatchingFishCustomView() {
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = this.CatchingFishDaggerHiltFAB;
        return catchingFishGoogleMapsMoshi != null ? catchingFishGoogleMapsMoshi.CatchingFishCoroutineFlow.CatchingFishCustomView() : this.CatchingFishGsonAppCompat;
    }

    public final void CatchingFishDagger() {
        if (this.CatchingFishJetpackCompose == null) {
            return;
        }
        this.CatchingFishFragmentFactory = false;
        this.CatchingFishMutableLiveData = false;
        this.CatchingFishCameraXIntent.CatchingFishViewModelScope = false;
        for (CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi : this.CatchingFishCoroutine.CatchingFishStateLiveData()) {
            if (catchingFishGoogleMapsMoshi != null) {
                catchingFishGoogleMapsMoshi.CatchingFishSpannableWidget.CatchingFishDagger();
            }
        }
    }

    public final void CatchingFishDaggerHiltFAB(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String CatchingFishEspressoTesting = CatchingFishMVPLiveData.CatchingFishEspressoTesting(str, "    ");
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = this.CatchingFishCoroutine;
        ArrayList arrayList = (ArrayList) catchingFishFluxFluxBundle.CatchingFishReduxKtor;
        String CatchingFishEspressoTesting2 = CatchingFishMVPLiveData.CatchingFishEspressoTesting(str, "    ");
        HashMap hashMap = (HashMap) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (CatchingFishStateFlowMockk catchingFishStateFlowMockk : hashMap.values()) {
                printWriter.print(str);
                if (catchingFishStateFlowMockk != null) {
                    CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = catchingFishStateFlowMockk.CatchingFishCoroutine;
                    printWriter.println(catchingFishGoogleMapsMoshi);
                    catchingFishGoogleMapsMoshi.getClass();
                    printWriter.print(CatchingFishEspressoTesting2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(catchingFishGoogleMapsMoshi.CatchingFishGsonAppCompat));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(catchingFishGoogleMapsMoshi.CatchingFishCardViewRealm));
                    printWriter.print(" mTag=");
                    printWriter.println(catchingFishGoogleMapsMoshi.CatchingFishPayPal);
                    printWriter.print(CatchingFishEspressoTesting2);
                    printWriter.print("mState=");
                    printWriter.print(catchingFishGoogleMapsMoshi.CatchingFishReduxKtor);
                    printWriter.print(" mWho=");
                    printWriter.print(catchingFishGoogleMapsMoshi.CatchingFishViewModelFAB);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(catchingFishGoogleMapsMoshi.CatchingFishJetpackCompose);
                    printWriter.print(CatchingFishEspressoTesting2);
                    printWriter.print("mAdded=");
                    printWriter.print(catchingFishGoogleMapsMoshi.CatchingFishUnitTesting);
                    printWriter.print(" mRemoving=");
                    printWriter.print(catchingFishGoogleMapsMoshi.CatchingFishAnimationMockk);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(catchingFishGoogleMapsMoshi.CatchingFishStateLiveData);
                    printWriter.print(" mInLayout=");
                    printWriter.println(catchingFishGoogleMapsMoshi.CatchingFishRoomDatabase);
                    printWriter.print(CatchingFishEspressoTesting2);
                    printWriter.print("mHidden=");
                    printWriter.print(catchingFishGoogleMapsMoshi.CatchingFishCardViewView);
                    printWriter.print(" mDetached=");
                    printWriter.print(catchingFishGoogleMapsMoshi.CatchingFishMVPRobolectric);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(catchingFishGoogleMapsMoshi.CatchingFishFragmentFactory);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(CatchingFishEspressoTesting2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(catchingFishGoogleMapsMoshi.CatchingFishCustomView);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(catchingFishGoogleMapsMoshi.CatchingFishEspressoMockk);
                    if (catchingFishGoogleMapsMoshi.CatchingFishCoroutineFlow != null) {
                        printWriter.print(CatchingFishEspressoTesting2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(catchingFishGoogleMapsMoshi.CatchingFishCoroutineFlow);
                    }
                    if (catchingFishGoogleMapsMoshi.CatchingFishDaggerHiltFAB != null) {
                        printWriter.print(CatchingFishEspressoTesting2);
                        printWriter.print("mHost=");
                        printWriter.println(catchingFishGoogleMapsMoshi.CatchingFishDaggerHiltFAB);
                    }
                    if (catchingFishGoogleMapsMoshi.CatchingFishParcelableFlux != null) {
                        printWriter.print(CatchingFishEspressoTesting2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(catchingFishGoogleMapsMoshi.CatchingFishParcelableFlux);
                    }
                    if (catchingFishGoogleMapsMoshi.CatchingFishLayout != null) {
                        printWriter.print(CatchingFishEspressoTesting2);
                        printWriter.print("mArguments=");
                        printWriter.println(catchingFishGoogleMapsMoshi.CatchingFishLayout);
                    }
                    if (catchingFishGoogleMapsMoshi.CatchingFishDaggerWebsocket != null) {
                        printWriter.print(CatchingFishEspressoTesting2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(catchingFishGoogleMapsMoshi.CatchingFishDaggerWebsocket);
                    }
                    if (catchingFishGoogleMapsMoshi.CatchingFishWorkManager != null) {
                        printWriter.print(CatchingFishEspressoTesting2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(catchingFishGoogleMapsMoshi.CatchingFishWorkManager);
                    }
                    if (catchingFishGoogleMapsMoshi.CatchingFishViewModelScope != null) {
                        printWriter.print(CatchingFishEspressoTesting2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(catchingFishGoogleMapsMoshi.CatchingFishViewModelScope);
                    }
                    Object obj = catchingFishGoogleMapsMoshi.CatchingFishFragmentHandler;
                    if (obj == null) {
                        CatchingFishToastSharedFlow catchingFishToastSharedFlow = catchingFishGoogleMapsMoshi.CatchingFishCoroutineFlow;
                        obj = (catchingFishToastSharedFlow == null || (str2 = catchingFishGoogleMapsMoshi.CatchingFishCloudMessaging) == null) ? null : catchingFishToastSharedFlow.CatchingFishCoroutine.CatchingFishFragmentHandler(str2);
                    }
                    if (obj != null) {
                        printWriter.print(CatchingFishEspressoTesting2);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(catchingFishGoogleMapsMoshi.CatchingFishEspressoTesting);
                    }
                    printWriter.print(CatchingFishEspressoTesting2);
                    printWriter.print("mPopDirection=");
                    CatchingFishGradleEspresso catchingFishGradleEspresso = catchingFishGoogleMapsMoshi.CatchingFishDagger;
                    printWriter.println(catchingFishGradleEspresso == null ? false : catchingFishGradleEspresso.CatchingFishParcelableFAB);
                    CatchingFishGradleEspresso catchingFishGradleEspresso2 = catchingFishGoogleMapsMoshi.CatchingFishDagger;
                    if ((catchingFishGradleEspresso2 == null ? 0 : catchingFishGradleEspresso2.CatchingFishSnackbar) != 0) {
                        printWriter.print(CatchingFishEspressoTesting2);
                        printWriter.print("getEnterAnim=");
                        CatchingFishGradleEspresso catchingFishGradleEspresso3 = catchingFishGoogleMapsMoshi.CatchingFishDagger;
                        printWriter.println(catchingFishGradleEspresso3 == null ? 0 : catchingFishGradleEspresso3.CatchingFishSnackbar);
                    }
                    CatchingFishGradleEspresso catchingFishGradleEspresso4 = catchingFishGoogleMapsMoshi.CatchingFishDagger;
                    if ((catchingFishGradleEspresso4 == null ? 0 : catchingFishGradleEspresso4.CatchingFishCoroutine) != 0) {
                        printWriter.print(CatchingFishEspressoTesting2);
                        printWriter.print("getExitAnim=");
                        CatchingFishGradleEspresso catchingFishGradleEspresso5 = catchingFishGoogleMapsMoshi.CatchingFishDagger;
                        printWriter.println(catchingFishGradleEspresso5 == null ? 0 : catchingFishGradleEspresso5.CatchingFishCoroutine);
                    }
                    CatchingFishGradleEspresso catchingFishGradleEspresso6 = catchingFishGoogleMapsMoshi.CatchingFishDagger;
                    if ((catchingFishGradleEspresso6 == null ? 0 : catchingFishGradleEspresso6.CatchingFishReduxKtor) != 0) {
                        printWriter.print(CatchingFishEspressoTesting2);
                        printWriter.print("getPopEnterAnim=");
                        CatchingFishGradleEspresso catchingFishGradleEspresso7 = catchingFishGoogleMapsMoshi.CatchingFishDagger;
                        printWriter.println(catchingFishGradleEspresso7 == null ? 0 : catchingFishGradleEspresso7.CatchingFishReduxKtor);
                    }
                    CatchingFishGradleEspresso catchingFishGradleEspresso8 = catchingFishGoogleMapsMoshi.CatchingFishDagger;
                    if ((catchingFishGradleEspresso8 == null ? 0 : catchingFishGradleEspresso8.CatchingFishDaggerWebsocket) != 0) {
                        printWriter.print(CatchingFishEspressoTesting2);
                        printWriter.print("getPopExitAnim=");
                        CatchingFishGradleEspresso catchingFishGradleEspresso9 = catchingFishGoogleMapsMoshi.CatchingFishDagger;
                        printWriter.println(catchingFishGradleEspresso9 == null ? 0 : catchingFishGradleEspresso9.CatchingFishDaggerWebsocket);
                    }
                    if (catchingFishGoogleMapsMoshi.CatchingFishJobScheduler != null) {
                        printWriter.print(CatchingFishEspressoTesting2);
                        printWriter.print("mContainer=");
                        printWriter.println(catchingFishGoogleMapsMoshi.CatchingFishJobScheduler);
                    }
                    if (catchingFishGoogleMapsMoshi.CatchingFishPayPalService != null) {
                        printWriter.print(CatchingFishEspressoTesting2);
                        printWriter.print("mView=");
                        printWriter.println(catchingFishGoogleMapsMoshi.CatchingFishPayPalService);
                    }
                    if (catchingFishGoogleMapsMoshi.CatchingFishViewModelFAB() != null) {
                        CatchingFishGsonAsyncTask catchingFishGsonAsyncTask = ((CatchingFishSnackbarFlux) new CatchingFishServiceHilt(catchingFishGoogleMapsMoshi.CatchingFishReduxKtor(), CatchingFishSnackbarFlux.CatchingFishCoroutine).CatchingFishCoroutineFlow(CatchingFishSnackbarFlux.class)).CatchingFishSnackbar;
                        if (catchingFishGsonAsyncTask.CatchingFishWorkManager > 0) {
                            printWriter.print(CatchingFishEspressoTesting2);
                            printWriter.println("Loaders:");
                            if (catchingFishGsonAsyncTask.CatchingFishWorkManager > 0) {
                                if (catchingFishGsonAsyncTask.CatchingFishDaggerWebsocket(0) != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(CatchingFishEspressoTesting2);
                                printWriter.print("  #");
                                printWriter.print(catchingFishGsonAsyncTask.CatchingFishReduxKtor[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(CatchingFishEspressoTesting2);
                    printWriter.println("Child " + catchingFishGoogleMapsMoshi.CatchingFishSpannableWidget + ":");
                    catchingFishGoogleMapsMoshi.CatchingFishSpannableWidget.CatchingFishDaggerHiltFAB(CatchingFishMVPLiveData.CatchingFishEspressoTesting(CatchingFishEspressoTesting2, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi2 = (CatchingFishGoogleMapsMoshi) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(catchingFishGoogleMapsMoshi2.toString());
            }
        }
        ArrayList arrayList2 = this.CatchingFishDaggerWebsocket;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi3 = (CatchingFishGoogleMapsMoshi) this.CatchingFishDaggerWebsocket.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(catchingFishGoogleMapsMoshi3.toString());
            }
        }
        ArrayList arrayList3 = this.CatchingFishReduxKtor;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                CatchingFishCameraXEspresso catchingFishCameraXEspresso = (CatchingFishCameraXEspresso) this.CatchingFishReduxKtor.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(catchingFishCameraXEspresso.toString());
                catchingFishCameraXEspresso.CatchingFishWorkManager(CatchingFishEspressoTesting, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.CatchingFishLayout.get());
        synchronized (this.CatchingFishParcelableFAB) {
            try {
                int size4 = this.CatchingFishParcelableFAB.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj2 = (CatchingFishReduxView) this.CatchingFishParcelableFAB.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.CatchingFishJetpackCompose);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.CatchingFishCoroutineFlow);
        if (this.CatchingFishDaggerHiltFAB != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.CatchingFishDaggerHiltFAB);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.CatchingFish);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.CatchingFishFragmentFactory);
        printWriter.print(" mStopped=");
        printWriter.print(this.CatchingFishMutableLiveData);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.CatchingFishJobScheduler);
        if (this.CatchingFishCustomView) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.CatchingFishCustomView);
        }
    }

    public final HashSet CatchingFishDaggerWebsocket() {
        HashSet hashSet = new HashSet();
        ArrayList CatchingFishUnitTesting = this.CatchingFishCoroutine.CatchingFishUnitTesting();
        int size = CatchingFishUnitTesting.size();
        int i = 0;
        while (i < size) {
            Object obj = CatchingFishUnitTesting.get(i);
            i++;
            ViewGroup viewGroup = ((CatchingFishStateFlowMockk) obj).CatchingFishCoroutine.CatchingFishJobScheduler;
            if (viewGroup != null) {
                hashSet.add(CatchingFishMoshiGraphQL.CatchingFishWorkManager(viewGroup, CatchingFishCustomView()));
            }
        }
        return hashSet;
    }

    public final void CatchingFishDataStoreIntent(CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi, CatchingFishMockkFirebase catchingFishMockkFirebase) {
        if (catchingFishGoogleMapsMoshi.equals(this.CatchingFishCoroutine.CatchingFishFragmentHandler(catchingFishGoogleMapsMoshi.CatchingFishViewModelFAB)) && (catchingFishGoogleMapsMoshi.CatchingFishDaggerHiltFAB == null || catchingFishGoogleMapsMoshi.CatchingFishCoroutineFlow == this)) {
            catchingFishGoogleMapsMoshi.CatchingFishGradleManifest = catchingFishMockkFirebase;
            return;
        }
        throw new IllegalArgumentException("Fragment " + catchingFishGoogleMapsMoshi + " is not an active fragment of FragmentManager " + this);
    }

    public final void CatchingFishEspressoMockk(int i, boolean z) {
        CatchingFishMVIPicasso catchingFishMVIPicasso;
        if (this.CatchingFishJetpackCompose == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.CatchingFish) {
            this.CatchingFish = i;
            CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = this.CatchingFishCoroutine;
            HashMap hashMap = (HashMap) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket;
            ArrayList arrayList = (ArrayList) catchingFishFluxFluxBundle.CatchingFishReduxKtor;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                CatchingFishStateFlowMockk catchingFishStateFlowMockk = (CatchingFishStateFlowMockk) hashMap.get(((CatchingFishGoogleMapsMoshi) obj).CatchingFishViewModelFAB);
                if (catchingFishStateFlowMockk != null) {
                    catchingFishStateFlowMockk.CatchingFishCloudMessaging();
                }
            }
            for (CatchingFishStateFlowMockk catchingFishStateFlowMockk2 : hashMap.values()) {
                if (catchingFishStateFlowMockk2 != null) {
                    catchingFishStateFlowMockk2.CatchingFishCloudMessaging();
                    CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = catchingFishStateFlowMockk2.CatchingFishCoroutine;
                    if (catchingFishGoogleMapsMoshi.CatchingFishAnimationMockk && !catchingFishGoogleMapsMoshi.CatchingFishUnitTesting()) {
                        catchingFishFluxFluxBundle.CatchingFishDaggerHiltFAB(catchingFishStateFlowMockk2);
                    }
                }
            }
            CatchingFishAnimation();
            if (this.CatchingFishCustomView && (catchingFishMVIPicasso = this.CatchingFishJetpackCompose) != null && this.CatchingFish == 7) {
                catchingFishMVIPicasso.CatchingFishParcelableFlux.invalidateOptionsMenu();
                this.CatchingFishCustomView = false;
            }
        }
    }

    public final void CatchingFishEspressoTesting(boolean z) {
        if (z && this.CatchingFishJetpackCompose != null) {
            CatchingFishMVVMAppCompat(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi : this.CatchingFishCoroutine.CatchingFishStateLiveData()) {
            if (catchingFishGoogleMapsMoshi != null) {
                catchingFishGoogleMapsMoshi.CatchingFishMutableLiveData = true;
                if (z) {
                    catchingFishGoogleMapsMoshi.CatchingFishSpannableWidget.CatchingFishEspressoTesting(true);
                }
            }
        }
    }

    public final boolean CatchingFishFragmentHandler() {
        if (this.CatchingFish < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi : this.CatchingFishCoroutine.CatchingFishStateLiveData()) {
            if (catchingFishGoogleMapsMoshi != null && CatchingFishPayPalService(catchingFishGoogleMapsMoshi)) {
                if (!catchingFishGoogleMapsMoshi.CatchingFishCardViewView ? catchingFishGoogleMapsMoshi.CatchingFishSpannableWidget.CatchingFishFragmentHandler() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(catchingFishGoogleMapsMoshi);
                    z = true;
                }
            }
        }
        if (this.CatchingFishDaggerWebsocket != null) {
            for (int i = 0; i < this.CatchingFishDaggerWebsocket.size(); i++) {
                CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi2 = (CatchingFishGoogleMapsMoshi) this.CatchingFishDaggerWebsocket.get(i);
                if (arrayList == null || !arrayList.contains(catchingFishGoogleMapsMoshi2)) {
                    catchingFishGoogleMapsMoshi2.getClass();
                }
            }
        }
        this.CatchingFishDaggerWebsocket = arrayList;
        return z;
    }

    public final void CatchingFishGradleManifest(CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi) {
        if (CatchingFishFragmentFactory(2)) {
            Objects.toString(catchingFishGoogleMapsMoshi);
        }
        boolean CatchingFishUnitTesting = catchingFishGoogleMapsMoshi.CatchingFishUnitTesting();
        if (catchingFishGoogleMapsMoshi.CatchingFishMVPRobolectric && CatchingFishUnitTesting) {
            return;
        }
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = this.CatchingFishCoroutine;
        synchronized (((ArrayList) catchingFishFluxFluxBundle.CatchingFishReduxKtor)) {
            ((ArrayList) catchingFishFluxFluxBundle.CatchingFishReduxKtor).remove(catchingFishGoogleMapsMoshi);
        }
        catchingFishGoogleMapsMoshi.CatchingFishUnitTesting = false;
        if (CatchingFishMutableLiveData(catchingFishGoogleMapsMoshi)) {
            this.CatchingFishCustomView = true;
        }
        catchingFishGoogleMapsMoshi.CatchingFishAnimationMockk = true;
        CatchingFishJUnitRealm(catchingFishGoogleMapsMoshi);
    }

    public final boolean CatchingFishGsonAppCompat(boolean z) {
        boolean z2;
        CatchingFishParcelableFlux(z);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.CatchingFishSensorManager;
            ArrayList arrayList2 = this.CatchingFishEspressoMockk;
            synchronized (this.CatchingFishParcelableFAB) {
                if (this.CatchingFishParcelableFAB.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.CatchingFishParcelableFAB.size();
                        z2 = false;
                        for (int i = 0; i < size; i++) {
                            z2 |= ((CatchingFishReduxView) this.CatchingFishParcelableFAB.get(i)).CatchingFishParcelableFAB(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z2) {
                CatchingFishStripeAPI();
                CatchingFishCoroutineFlow();
                ((HashMap) this.CatchingFishCoroutine.CatchingFishDaggerWebsocket).values().removeAll(Collections.singleton(null));
                return z3;
            }
            z3 = true;
            this.CatchingFishSnackbar = true;
            try {
                CatchingFishMotionLayout(this.CatchingFishSensorManager, this.CatchingFishEspressoMockk);
            } finally {
                CatchingFishReduxKtor();
            }
        }
    }

    public final boolean CatchingFishHandler(int i, int i2) {
        CatchingFishGsonAppCompat(false);
        CatchingFishParcelableFlux(true);
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = this.CatchingFishSpannableWidget;
        if (catchingFishGoogleMapsMoshi != null && i < 0 && catchingFishGoogleMapsMoshi.CatchingFishViewModelScope().CatchingFishCameraXIntent()) {
            return true;
        }
        boolean CatchingFishPayPalLiveData = CatchingFishPayPalLiveData(this.CatchingFishSensorManager, this.CatchingFishEspressoMockk, i, i2);
        if (CatchingFishPayPalLiveData) {
            this.CatchingFishSnackbar = true;
            try {
                CatchingFishMotionLayout(this.CatchingFishSensorManager, this.CatchingFishEspressoMockk);
            } finally {
                CatchingFishReduxKtor();
            }
        }
        CatchingFishStripeAPI();
        CatchingFishCoroutineFlow();
        ((HashMap) this.CatchingFishCoroutine.CatchingFishDaggerWebsocket).values().removeAll(Collections.singleton(null));
        return CatchingFishPayPalLiveData;
    }

    public final void CatchingFishJUnitRealm(CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi) {
        ViewGroup CatchingFishCardViewView = CatchingFishCardViewView(catchingFishGoogleMapsMoshi);
        if (CatchingFishCardViewView != null) {
            CatchingFishGradleEspresso catchingFishGradleEspresso = catchingFishGoogleMapsMoshi.CatchingFishDagger;
            if ((catchingFishGradleEspresso == null ? 0 : catchingFishGradleEspresso.CatchingFishDaggerWebsocket) + (catchingFishGradleEspresso == null ? 0 : catchingFishGradleEspresso.CatchingFishReduxKtor) + (catchingFishGradleEspresso == null ? 0 : catchingFishGradleEspresso.CatchingFishCoroutine) + (catchingFishGradleEspresso == null ? 0 : catchingFishGradleEspresso.CatchingFishSnackbar) > 0) {
                if (CatchingFishCardViewView.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    CatchingFishCardViewView.setTag(R.id.visible_removing_fragment_view_tag, catchingFishGoogleMapsMoshi);
                }
                CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi2 = (CatchingFishGoogleMapsMoshi) CatchingFishCardViewView.getTag(R.id.visible_removing_fragment_view_tag);
                CatchingFishGradleEspresso catchingFishGradleEspresso2 = catchingFishGoogleMapsMoshi.CatchingFishDagger;
                boolean z = catchingFishGradleEspresso2 != null ? catchingFishGradleEspresso2.CatchingFishParcelableFAB : false;
                if (catchingFishGoogleMapsMoshi2.CatchingFishDagger == null) {
                    return;
                }
                catchingFishGoogleMapsMoshi2.CatchingFishWorkManager().CatchingFishParcelableFAB = z;
            }
        }
    }

    public final void CatchingFishJetpackCompose(int i) {
        try {
            this.CatchingFishSnackbar = true;
            for (CatchingFishStateFlowMockk catchingFishStateFlowMockk : ((HashMap) this.CatchingFishCoroutine.CatchingFishDaggerWebsocket).values()) {
                if (catchingFishStateFlowMockk != null) {
                    catchingFishStateFlowMockk.CatchingFishDaggerWebsocket = i;
                }
            }
            CatchingFishEspressoMockk(i, false);
            Iterator it = CatchingFishDaggerWebsocket().iterator();
            while (it.hasNext()) {
                ((CatchingFishMoshiGraphQL) it.next()).CatchingFishDaggerWebsocket();
            }
            this.CatchingFishSnackbar = false;
            CatchingFishGsonAppCompat(true);
        } catch (Throwable th) {
            this.CatchingFishSnackbar = false;
            throw th;
        }
    }

    public final boolean CatchingFishJobScheduler() {
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = this.CatchingFishDaggerHiltFAB;
        if (catchingFishGoogleMapsMoshi == null) {
            return true;
        }
        return catchingFishGoogleMapsMoshi.CatchingFishDaggerHiltFAB != null && catchingFishGoogleMapsMoshi.CatchingFishUnitTesting && catchingFishGoogleMapsMoshi.CatchingFishFragmentHandler().CatchingFishJobScheduler();
    }

    public final boolean CatchingFishLayout() {
        if (this.CatchingFish >= 1) {
            for (CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi : this.CatchingFishCoroutine.CatchingFishStateLiveData()) {
                if (catchingFishGoogleMapsMoshi != null) {
                    if (!catchingFishGoogleMapsMoshi.CatchingFishCardViewView ? catchingFishGoogleMapsMoshi.CatchingFishSpannableWidget.CatchingFishLayout() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void CatchingFishLayoutInflater(Parcelable parcelable) {
        CatchingFishBundleGlide catchingFishBundleGlide;
        int i;
        int i2;
        CatchingFishStateFlowMockk catchingFishStateFlowMockk;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.CatchingFishJetpackCompose.CatchingFishCoroutineFlow.getClassLoader());
                this.CatchingFishCloudMessaging.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.CatchingFishJetpackCompose.CatchingFishCoroutineFlow.getClassLoader());
                arrayList.add((CatchingFishHiltGson) bundle.getParcelable("state"));
            }
        }
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = this.CatchingFishCoroutine;
        HashMap hashMap = (HashMap) catchingFishFluxFluxBundle.CatchingFishWorkManager;
        HashMap hashMap2 = (HashMap) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket;
        hashMap.clear();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            CatchingFishHiltGson catchingFishHiltGson = (CatchingFishHiltGson) obj;
            hashMap.put(catchingFishHiltGson.CatchingFishDaggerWebsocket, catchingFishHiltGson);
        }
        CatchingFishDataStoreLayout catchingFishDataStoreLayout = (CatchingFishDataStoreLayout) bundle3.getParcelable("state");
        if (catchingFishDataStoreLayout == null) {
            return;
        }
        hashMap2.clear();
        ArrayList arrayList2 = catchingFishDataStoreLayout.CatchingFishReduxKtor;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (true) {
            catchingFishBundleGlide = this.CatchingFishEspressoTesting;
            i = 2;
            if (i4 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i4);
            i4++;
            CatchingFishHiltGson catchingFishHiltGson2 = (CatchingFishHiltGson) ((HashMap) catchingFishFluxFluxBundle.CatchingFishWorkManager).remove((String) obj2);
            if (catchingFishHiltGson2 != null) {
                CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = (CatchingFishGoogleMapsMoshi) this.CatchingFishCameraXIntent.CatchingFishSnackbar.get(catchingFishHiltGson2.CatchingFishDaggerWebsocket);
                if (catchingFishGoogleMapsMoshi != null) {
                    if (CatchingFishFragmentFactory(2)) {
                        catchingFishGoogleMapsMoshi.toString();
                    }
                    catchingFishStateFlowMockk = new CatchingFishStateFlowMockk(catchingFishBundleGlide, catchingFishFluxFluxBundle, catchingFishGoogleMapsMoshi, catchingFishHiltGson2);
                } else {
                    catchingFishStateFlowMockk = new CatchingFishStateFlowMockk(this.CatchingFishEspressoTesting, this.CatchingFishCoroutine, this.CatchingFishJetpackCompose.CatchingFishCoroutineFlow.getClassLoader(), CatchingFishMVPRobolectric(), catchingFishHiltGson2);
                }
                CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi2 = catchingFishStateFlowMockk.CatchingFishCoroutine;
                catchingFishGoogleMapsMoshi2.CatchingFishCoroutineFlow = this;
                if (CatchingFishFragmentFactory(2)) {
                    catchingFishGoogleMapsMoshi2.toString();
                }
                catchingFishStateFlowMockk.CatchingFishOkHttp(this.CatchingFishJetpackCompose.CatchingFishCoroutineFlow.getClassLoader());
                catchingFishFluxFluxBundle.CatchingFishCoroutineFlow(catchingFishStateFlowMockk);
                catchingFishStateFlowMockk.CatchingFishDaggerWebsocket = this.CatchingFish;
            }
        }
        CatchingFishRetrofitFAB catchingFishRetrofitFAB = this.CatchingFishCameraXIntent;
        catchingFishRetrofitFAB.getClass();
        ArrayList arrayList3 = new ArrayList(catchingFishRetrofitFAB.CatchingFishSnackbar.values());
        int size3 = arrayList3.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList3.get(i5);
            i5++;
            CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi3 = (CatchingFishGoogleMapsMoshi) obj3;
            if (hashMap2.get(catchingFishGoogleMapsMoshi3.CatchingFishViewModelFAB) == null) {
                if (CatchingFishFragmentFactory(2)) {
                    catchingFishGoogleMapsMoshi3.toString();
                    Objects.toString(catchingFishDataStoreLayout.CatchingFishReduxKtor);
                }
                this.CatchingFishCameraXIntent.CatchingFishReduxKtor(catchingFishGoogleMapsMoshi3);
                catchingFishGoogleMapsMoshi3.CatchingFishCoroutineFlow = this;
                CatchingFishStateFlowMockk catchingFishStateFlowMockk2 = new CatchingFishStateFlowMockk(catchingFishBundleGlide, catchingFishFluxFluxBundle, catchingFishGoogleMapsMoshi3);
                catchingFishStateFlowMockk2.CatchingFishDaggerWebsocket = 1;
                catchingFishStateFlowMockk2.CatchingFishCloudMessaging();
                catchingFishGoogleMapsMoshi3.CatchingFishAnimationMockk = true;
                catchingFishStateFlowMockk2.CatchingFishCloudMessaging();
            }
        }
        ArrayList arrayList4 = catchingFishDataStoreLayout.CatchingFishDaggerWebsocket;
        ((ArrayList) catchingFishFluxFluxBundle.CatchingFishReduxKtor).clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList4.get(i6);
                i6++;
                String str3 = (String) obj4;
                CatchingFishGoogleMapsMoshi CatchingFishFragmentHandler = catchingFishFluxFluxBundle.CatchingFishFragmentHandler(str3);
                if (CatchingFishFragmentHandler == null) {
                    throw new IllegalStateException(CatchingFishMVPLiveData.CatchingFishOkHttp("No instantiated fragment for (", str3, ")"));
                }
                if (CatchingFishFragmentFactory(2)) {
                    CatchingFishFragmentHandler.toString();
                }
                catchingFishFluxFluxBundle.CatchingFishParcelableFAB(CatchingFishFragmentHandler);
            }
        }
        if (catchingFishDataStoreLayout.CatchingFishWorkManager != null) {
            this.CatchingFishReduxKtor = new ArrayList(catchingFishDataStoreLayout.CatchingFishWorkManager.length);
            int i7 = 0;
            while (true) {
                CatchingFishViewUnitTesting[] catchingFishViewUnitTestingArr = catchingFishDataStoreLayout.CatchingFishWorkManager;
                if (i7 >= catchingFishViewUnitTestingArr.length) {
                    break;
                }
                CatchingFishViewUnitTesting catchingFishViewUnitTesting = catchingFishViewUnitTestingArr[i7];
                ArrayList arrayList5 = catchingFishViewUnitTesting.CatchingFishDaggerWebsocket;
                CatchingFishCameraXEspresso catchingFishCameraXEspresso = new CatchingFishCameraXEspresso(this);
                int[] iArr = catchingFishViewUnitTesting.CatchingFishReduxKtor;
                int i8 = 0;
                int i9 = 0;
                while (i8 < iArr.length) {
                    CatchingFishPicassoFAB catchingFishPicassoFAB = new CatchingFishPicassoFAB();
                    int i10 = i8 + 1;
                    catchingFishPicassoFAB.CatchingFishParcelableFAB = iArr[i8];
                    if (CatchingFishFragmentFactory(i)) {
                        Objects.toString(catchingFishCameraXEspresso);
                        int i11 = iArr[i10];
                    }
                    int i12 = i;
                    catchingFishPicassoFAB.CatchingFishViewModelFAB = CatchingFishMockkFirebase.values()[catchingFishViewUnitTesting.CatchingFishWorkManager[i9]];
                    catchingFishPicassoFAB.CatchingFishLayout = CatchingFishMockkFirebase.values()[catchingFishViewUnitTesting.CatchingFishViewModelScope[i9]];
                    int i13 = i8 + 2;
                    catchingFishPicassoFAB.CatchingFishCoroutine = iArr[i10] != 0;
                    int i14 = iArr[i13];
                    catchingFishPicassoFAB.CatchingFishReduxKtor = i14;
                    int i15 = iArr[i8 + 3];
                    catchingFishPicassoFAB.CatchingFishDaggerWebsocket = i15;
                    int i16 = i8 + 5;
                    int i17 = iArr[i8 + 4];
                    catchingFishPicassoFAB.CatchingFishWorkManager = i17;
                    i8 += 6;
                    int i18 = iArr[i16];
                    catchingFishPicassoFAB.CatchingFishViewModelScope = i18;
                    catchingFishCameraXEspresso.CatchingFishSnackbar = i14;
                    catchingFishCameraXEspresso.CatchingFishCoroutine = i15;
                    catchingFishCameraXEspresso.CatchingFishReduxKtor = i17;
                    catchingFishCameraXEspresso.CatchingFishDaggerWebsocket = i18;
                    catchingFishCameraXEspresso.CatchingFishSnackbar(catchingFishPicassoFAB);
                    i9++;
                    i = i12;
                }
                int i19 = i;
                catchingFishCameraXEspresso.CatchingFishWorkManager = catchingFishViewUnitTesting.CatchingFishViewModelFAB;
                catchingFishCameraXEspresso.CatchingFishViewModelFAB = catchingFishViewUnitTesting.CatchingFishLayout;
                catchingFishCameraXEspresso.CatchingFishViewModelScope = true;
                catchingFishCameraXEspresso.CatchingFishLayout = catchingFishViewUnitTesting.CatchingFishCloudMessaging;
                catchingFishCameraXEspresso.CatchingFishFragmentHandler = catchingFishViewUnitTesting.CatchingFishEspressoTesting;
                catchingFishCameraXEspresso.CatchingFishCloudMessaging = catchingFishViewUnitTesting.CatchingFishOkHttp;
                catchingFishCameraXEspresso.CatchingFishEspressoTesting = catchingFishViewUnitTesting.CatchingFishUnitTesting;
                catchingFishCameraXEspresso.CatchingFishOkHttp = catchingFishViewUnitTesting.CatchingFishAnimationMockk;
                catchingFishCameraXEspresso.CatchingFishUnitTesting = catchingFishViewUnitTesting.CatchingFishStateLiveData;
                catchingFishCameraXEspresso.CatchingFishAnimationMockk = catchingFishViewUnitTesting.CatchingFishRoomDatabase;
                catchingFishCameraXEspresso.CatchingFishNavigation = catchingFishViewUnitTesting.CatchingFishFragmentHandler;
                for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                    String str4 = (String) arrayList5.get(i20);
                    if (str4 != null) {
                        ((CatchingFishPicassoFAB) catchingFishCameraXEspresso.CatchingFishParcelableFAB.get(i20)).CatchingFishSnackbar = catchingFishFluxFluxBundle.CatchingFishFragmentHandler(str4);
                    }
                }
                catchingFishCameraXEspresso.CatchingFishCoroutine(1);
                if (CatchingFishFragmentFactory(i19)) {
                    catchingFishCameraXEspresso.toString();
                    PrintWriter printWriter = new PrintWriter(new CatchingFishViewPagerMVP());
                    catchingFishCameraXEspresso.CatchingFishWorkManager("  ", printWriter, false);
                    printWriter.close();
                }
                this.CatchingFishReduxKtor.add(catchingFishCameraXEspresso);
                i7++;
                i = i19;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.CatchingFishReduxKtor = null;
        }
        this.CatchingFishLayout.set(catchingFishDataStoreLayout.CatchingFishViewModelScope);
        String str5 = catchingFishDataStoreLayout.CatchingFishViewModelFAB;
        if (str5 != null) {
            CatchingFishGoogleMapsMoshi CatchingFishFragmentHandler2 = catchingFishFluxFluxBundle.CatchingFishFragmentHandler(str5);
            this.CatchingFishSpannableWidget = CatchingFishFragmentHandler2;
            CatchingFishRoomDatabase(CatchingFishFragmentHandler2);
        }
        ArrayList arrayList6 = catchingFishDataStoreLayout.CatchingFishLayout;
        if (arrayList6 != null) {
            for (int i21 = i2; i21 < arrayList6.size(); i21++) {
                this.CatchingFishFragmentHandler.put((String) arrayList6.get(i21), (CatchingFishFragmentGradle) catchingFishDataStoreLayout.CatchingFishFragmentHandler.get(i21));
            }
        }
        this.CatchingFishMVPRobolectric = new ArrayDeque(catchingFishDataStoreLayout.CatchingFishCloudMessaging);
    }

    public final CatchingFishFABStateFlow CatchingFishMVPRobolectric() {
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = this.CatchingFishDaggerHiltFAB;
        return catchingFishGoogleMapsMoshi != null ? catchingFishGoogleMapsMoshi.CatchingFishCoroutineFlow.CatchingFishMVPRobolectric() : this.CatchingFishParcelableFlux;
    }

    public final void CatchingFishMVVMAppCompat(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new CatchingFishViewPagerMVP());
        CatchingFishMVIPicasso catchingFishMVIPicasso = this.CatchingFishJetpackCompose;
        try {
            if (catchingFishMVIPicasso != null) {
                catchingFishMVIPicasso.CatchingFishParcelableFlux.dump("  ", null, printWriter, new String[0]);
            } else {
                CatchingFishDaggerHiltFAB("  ", null, printWriter, new String[0]);
            }
            throw illegalStateException;
        } catch (Exception unused) {
            throw illegalStateException;
        }
    }

    public final void CatchingFishMotionLayout(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((CatchingFishCameraXEspresso) arrayList.get(i)).CatchingFishAnimationMockk) {
                if (i2 != i) {
                    CatchingFishCardViewRealm(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((CatchingFishCameraXEspresso) arrayList.get(i2)).CatchingFishAnimationMockk) {
                        i2++;
                    }
                }
                CatchingFishCardViewRealm(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            CatchingFishCardViewRealm(arrayList, arrayList2, i2, size);
        }
    }

    public final void CatchingFishNavigation(boolean z) {
        if (z && this.CatchingFishJetpackCompose != null) {
            CatchingFishMVVMAppCompat(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi : this.CatchingFishCoroutine.CatchingFishStateLiveData()) {
            if (catchingFishGoogleMapsMoshi != null && z) {
                catchingFishGoogleMapsMoshi.CatchingFishSpannableWidget.CatchingFishNavigation(true);
            }
        }
    }

    public final void CatchingFishOkHttp(boolean z) {
        if (z && this.CatchingFishJetpackCompose != null) {
            CatchingFishMVVMAppCompat(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi : this.CatchingFishCoroutine.CatchingFishStateLiveData()) {
            if (catchingFishGoogleMapsMoshi != null && z) {
                catchingFishGoogleMapsMoshi.CatchingFishSpannableWidget.CatchingFishOkHttp(true);
            }
        }
    }

    public final Bundle CatchingFishParcelable() {
        int i;
        ArrayList arrayList;
        CatchingFishViewUnitTesting[] catchingFishViewUnitTestingArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = CatchingFishDaggerWebsocket().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            CatchingFishMoshiGraphQL catchingFishMoshiGraphQL = (CatchingFishMoshiGraphQL) it.next();
            if (catchingFishMoshiGraphQL.CatchingFishDaggerWebsocket) {
                catchingFishMoshiGraphQL.CatchingFishDaggerWebsocket = false;
                catchingFishMoshiGraphQL.CatchingFishCoroutine();
            }
        }
        Iterator it2 = CatchingFishDaggerWebsocket().iterator();
        while (it2.hasNext()) {
            ((CatchingFishMoshiGraphQL) it2.next()).CatchingFishDaggerWebsocket();
        }
        CatchingFishGsonAppCompat(true);
        this.CatchingFishFragmentFactory = true;
        this.CatchingFishCameraXIntent.CatchingFishViewModelScope = true;
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = this.CatchingFishCoroutine;
        catchingFishFluxFluxBundle.getClass();
        HashMap hashMap = (HashMap) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it3 = hashMap.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            CatchingFishStateFlowMockk catchingFishStateFlowMockk = (CatchingFishStateFlowMockk) it3.next();
            if (catchingFishStateFlowMockk != null) {
                CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = catchingFishStateFlowMockk.CatchingFishCoroutine;
                CatchingFishHiltGson catchingFishHiltGson = new CatchingFishHiltGson(catchingFishGoogleMapsMoshi);
                if (catchingFishGoogleMapsMoshi.CatchingFishReduxKtor <= -1 || catchingFishHiltGson.CatchingFishStateLiveData != null) {
                    catchingFishHiltGson.CatchingFishStateLiveData = catchingFishGoogleMapsMoshi.CatchingFishDaggerWebsocket;
                } else {
                    Bundle bundle2 = new Bundle();
                    catchingFishGoogleMapsMoshi.CatchingFishSpannableWidget(bundle2);
                    catchingFishGoogleMapsMoshi.CatchingFishRecyclerView.CatchingFishSpannableWidget(bundle2);
                    bundle2.putParcelable("android:support:fragments", catchingFishGoogleMapsMoshi.CatchingFishSpannableWidget.CatchingFishParcelable());
                    catchingFishStateFlowMockk.CatchingFishParcelableFAB.CatchingFishStateLiveData(false);
                    Bundle bundle3 = bundle2.isEmpty() ? null : bundle2;
                    if (catchingFishGoogleMapsMoshi.CatchingFishPayPalService != null) {
                        catchingFishStateFlowMockk.CatchingFishAnimationMockk();
                    }
                    if (catchingFishGoogleMapsMoshi.CatchingFishWorkManager != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putSparseParcelableArray("android:view_state", catchingFishGoogleMapsMoshi.CatchingFishWorkManager);
                    }
                    if (catchingFishGoogleMapsMoshi.CatchingFishViewModelScope != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBundle("android:view_registry_state", catchingFishGoogleMapsMoshi.CatchingFishViewModelScope);
                    }
                    if (!catchingFishGoogleMapsMoshi.CatchingFishEspressoMockk) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBoolean("android:user_visible_hint", catchingFishGoogleMapsMoshi.CatchingFishEspressoMockk);
                    }
                    catchingFishHiltGson.CatchingFishStateLiveData = bundle3;
                    if (catchingFishGoogleMapsMoshi.CatchingFishCloudMessaging != null) {
                        if (bundle3 == null) {
                            catchingFishHiltGson.CatchingFishStateLiveData = new Bundle();
                        }
                        catchingFishHiltGson.CatchingFishStateLiveData.putString("android:target_state", catchingFishGoogleMapsMoshi.CatchingFishCloudMessaging);
                        int i2 = catchingFishGoogleMapsMoshi.CatchingFishEspressoTesting;
                        if (i2 != 0) {
                            catchingFishHiltGson.CatchingFishStateLiveData.putInt("android:target_req_state", i2);
                        }
                    }
                }
                arrayList2.add(catchingFishGoogleMapsMoshi.CatchingFishViewModelFAB);
                if (CatchingFishFragmentFactory(2)) {
                    catchingFishGoogleMapsMoshi.toString();
                    Objects.toString(catchingFishGoogleMapsMoshi.CatchingFishDaggerWebsocket);
                }
            }
        }
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle2 = this.CatchingFishCoroutine;
        catchingFishFluxFluxBundle2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) catchingFishFluxFluxBundle2.CatchingFishWorkManager).values());
        if (!arrayList3.isEmpty()) {
            CatchingFishFluxFluxBundle catchingFishFluxFluxBundle3 = this.CatchingFishCoroutine;
            synchronized (((ArrayList) catchingFishFluxFluxBundle3.CatchingFishReduxKtor)) {
                try {
                    if (((ArrayList) catchingFishFluxFluxBundle3.CatchingFishReduxKtor).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) catchingFishFluxFluxBundle3.CatchingFishReduxKtor).size());
                        ArrayList arrayList4 = (ArrayList) catchingFishFluxFluxBundle3.CatchingFishReduxKtor;
                        int size2 = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj = arrayList4.get(i3);
                            i3++;
                            CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi2 = (CatchingFishGoogleMapsMoshi) obj;
                            arrayList.add(catchingFishGoogleMapsMoshi2.CatchingFishViewModelFAB);
                            if (CatchingFishFragmentFactory(2)) {
                                catchingFishGoogleMapsMoshi2.toString();
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList5 = this.CatchingFishReduxKtor;
            if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
                catchingFishViewUnitTestingArr = null;
            } else {
                catchingFishViewUnitTestingArr = new CatchingFishViewUnitTesting[size];
                for (int i4 = 0; i4 < size; i4++) {
                    catchingFishViewUnitTestingArr[i4] = new CatchingFishViewUnitTesting((CatchingFishCameraXEspresso) this.CatchingFishReduxKtor.get(i4));
                    if (CatchingFishFragmentFactory(2)) {
                        Objects.toString(this.CatchingFishReduxKtor.get(i4));
                    }
                }
            }
            CatchingFishDataStoreLayout catchingFishDataStoreLayout = new CatchingFishDataStoreLayout();
            catchingFishDataStoreLayout.CatchingFishViewModelFAB = null;
            ArrayList arrayList6 = new ArrayList();
            catchingFishDataStoreLayout.CatchingFishLayout = arrayList6;
            ArrayList arrayList7 = new ArrayList();
            catchingFishDataStoreLayout.CatchingFishFragmentHandler = arrayList7;
            catchingFishDataStoreLayout.CatchingFishReduxKtor = arrayList2;
            catchingFishDataStoreLayout.CatchingFishDaggerWebsocket = arrayList;
            catchingFishDataStoreLayout.CatchingFishWorkManager = catchingFishViewUnitTestingArr;
            catchingFishDataStoreLayout.CatchingFishViewModelScope = this.CatchingFishLayout.get();
            CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi3 = this.CatchingFishSpannableWidget;
            if (catchingFishGoogleMapsMoshi3 != null) {
                catchingFishDataStoreLayout.CatchingFishViewModelFAB = catchingFishGoogleMapsMoshi3.CatchingFishViewModelFAB;
            }
            arrayList6.addAll(this.CatchingFishFragmentHandler.keySet());
            arrayList7.addAll(this.CatchingFishFragmentHandler.values());
            catchingFishDataStoreLayout.CatchingFishCloudMessaging = new ArrayList(this.CatchingFishMVPRobolectric);
            bundle.putParcelable("state", catchingFishDataStoreLayout);
            for (String str : this.CatchingFishCloudMessaging.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.CatchingFishCloudMessaging.get(str));
            }
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj2 = arrayList3.get(i);
                i++;
                CatchingFishHiltGson catchingFishHiltGson2 = (CatchingFishHiltGson) obj2;
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", catchingFishHiltGson2);
                bundle.putBundle("fragment_" + catchingFishHiltGson2.CatchingFishDaggerWebsocket, bundle4);
            }
        }
        return bundle;
    }

    public final CatchingFishStateFlowMockk CatchingFishParcelableFAB(CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi) {
        String str = catchingFishGoogleMapsMoshi.CatchingFishPayPalLiveData;
        if (str != null) {
            CatchingFishCoroutineGlide.CatchingFishSnackbar(catchingFishGoogleMapsMoshi, str);
        }
        if (CatchingFishFragmentFactory(2)) {
            catchingFishGoogleMapsMoshi.toString();
        }
        CatchingFishStateFlowMockk CatchingFishWorkManager = CatchingFishWorkManager(catchingFishGoogleMapsMoshi);
        catchingFishGoogleMapsMoshi.CatchingFishCoroutineFlow = this;
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = this.CatchingFishCoroutine;
        catchingFishFluxFluxBundle.CatchingFishCoroutineFlow(CatchingFishWorkManager);
        if (!catchingFishGoogleMapsMoshi.CatchingFishMVPRobolectric) {
            catchingFishFluxFluxBundle.CatchingFishParcelableFAB(catchingFishGoogleMapsMoshi);
            catchingFishGoogleMapsMoshi.CatchingFishAnimationMockk = false;
            if (catchingFishGoogleMapsMoshi.CatchingFishPayPalService == null) {
                catchingFishGoogleMapsMoshi.CatchingFishCameraXIntent = false;
            }
            if (CatchingFishMutableLiveData(catchingFishGoogleMapsMoshi)) {
                this.CatchingFishCustomView = true;
            }
        }
        return CatchingFishWorkManager;
    }

    public final void CatchingFishParcelableFlux(boolean z) {
        if (this.CatchingFishSnackbar) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.CatchingFishJetpackCompose == null) {
            if (!this.CatchingFishJobScheduler) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.CatchingFishJetpackCompose.CatchingFishDaggerHiltFAB.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && (this.CatchingFishFragmentFactory || this.CatchingFishMutableLiveData)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.CatchingFishSensorManager == null) {
            this.CatchingFishSensorManager = new ArrayList();
            this.CatchingFishEspressoMockk = new ArrayList();
        }
    }

    public final CatchingFishGoogleMapsMoshi CatchingFishPayPal(int i) {
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = this.CatchingFishCoroutine;
        ArrayList arrayList = (ArrayList) catchingFishFluxFluxBundle.CatchingFishReduxKtor;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = (CatchingFishGoogleMapsMoshi) arrayList.get(size);
            if (catchingFishGoogleMapsMoshi != null && catchingFishGoogleMapsMoshi.CatchingFishGsonAppCompat == i) {
                return catchingFishGoogleMapsMoshi;
            }
        }
        for (CatchingFishStateFlowMockk catchingFishStateFlowMockk : ((HashMap) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).values()) {
            if (catchingFishStateFlowMockk != null) {
                CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi2 = catchingFishStateFlowMockk.CatchingFishCoroutine;
                if (catchingFishGoogleMapsMoshi2.CatchingFishGsonAppCompat == i) {
                    return catchingFishGoogleMapsMoshi2;
                }
            }
        }
        return null;
    }

    public final boolean CatchingFishPayPalLiveData(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.CatchingFishReduxKtor;
        int i3 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                i3 = z ? 0 : this.CatchingFishReduxKtor.size() - 1;
            } else {
                int size = this.CatchingFishReduxKtor.size() - 1;
                while (size >= 0) {
                    CatchingFishCameraXEspresso catchingFishCameraXEspresso = (CatchingFishCameraXEspresso) this.CatchingFishReduxKtor.get(size);
                    if (i >= 0 && i == catchingFishCameraXEspresso.CatchingFishNavigation) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i3 = size;
                } else if (z) {
                    i3 = size;
                    while (i3 > 0) {
                        CatchingFishCameraXEspresso catchingFishCameraXEspresso2 = (CatchingFishCameraXEspresso) this.CatchingFishReduxKtor.get(i3 - 1);
                        if (i < 0 || i != catchingFishCameraXEspresso2.CatchingFishNavigation) {
                            break;
                        }
                        i3--;
                    }
                } else if (size != this.CatchingFishReduxKtor.size() - 1) {
                    i3 = size + 1;
                }
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.CatchingFishReduxKtor.size() - 1; size2 >= i3; size2--) {
            arrayList.add((CatchingFishCameraXEspresso) this.CatchingFishReduxKtor.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void CatchingFishRecyclerView() {
        synchronized (this.CatchingFishParcelableFAB) {
            try {
                if (this.CatchingFishParcelableFAB.size() == 1) {
                    this.CatchingFishJetpackCompose.CatchingFishDaggerHiltFAB.removeCallbacks(this.CatchingFishHandler);
                    this.CatchingFishJetpackCompose.CatchingFishDaggerHiltFAB.post(this.CatchingFishHandler);
                    CatchingFishStripeAPI();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void CatchingFishReduxKtor() {
        this.CatchingFishSnackbar = false;
        this.CatchingFishEspressoMockk.clear();
        this.CatchingFishSensorManager.clear();
    }

    public final void CatchingFishRoomDatabase(CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi) {
        if (catchingFishGoogleMapsMoshi != null) {
            if (catchingFishGoogleMapsMoshi.equals(this.CatchingFishCoroutine.CatchingFishFragmentHandler(catchingFishGoogleMapsMoshi.CatchingFishViewModelFAB))) {
                catchingFishGoogleMapsMoshi.CatchingFishCoroutineFlow.getClass();
                boolean CatchingFishSensorManager = CatchingFishSensorManager(catchingFishGoogleMapsMoshi);
                Boolean bool = catchingFishGoogleMapsMoshi.CatchingFishOkHttp;
                if (bool == null || bool.booleanValue() != CatchingFishSensorManager) {
                    catchingFishGoogleMapsMoshi.CatchingFishOkHttp = Boolean.valueOf(CatchingFishSensorManager);
                    CatchingFishToastSharedFlow catchingFishToastSharedFlow = catchingFishGoogleMapsMoshi.CatchingFishSpannableWidget;
                    catchingFishToastSharedFlow.CatchingFishStripeAPI();
                    catchingFishToastSharedFlow.CatchingFishRoomDatabase(catchingFishToastSharedFlow.CatchingFishSpannableWidget);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void CatchingFishSnackbar(CatchingFishMVIPicasso catchingFishMVIPicasso, CatchingFishRobolectricHilt catchingFishRobolectricHilt, CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi) {
        if (this.CatchingFishJetpackCompose != null) {
            throw new IllegalStateException("Already attached");
        }
        this.CatchingFishJetpackCompose = catchingFishMVIPicasso;
        this.CatchingFishCoroutineFlow = catchingFishRobolectricHilt;
        this.CatchingFishDaggerHiltFAB = catchingFishGoogleMapsMoshi;
        CopyOnWriteArrayList copyOnWriteArrayList = this.CatchingFishOkHttp;
        if (catchingFishGoogleMapsMoshi != 0) {
            copyOnWriteArrayList.add(new CatchingFishCardViewBundle(catchingFishGoogleMapsMoshi));
        } else if (catchingFishMVIPicasso != null) {
            copyOnWriteArrayList.add(catchingFishMVIPicasso);
        }
        if (this.CatchingFishDaggerHiltFAB != null) {
            CatchingFishStripeAPI();
        }
        if (catchingFishMVIPicasso != null) {
            CatchingFishFluxCameraX CatchingFishLayout = catchingFishMVIPicasso.CatchingFishParcelableFlux.CatchingFishLayout();
            this.CatchingFishViewModelScope = CatchingFishLayout;
            CatchingFishLayout.CatchingFishParcelableFAB(this.CatchingFishViewModelFAB, catchingFishGoogleMapsMoshi != 0 ? catchingFishGoogleMapsMoshi : catchingFishMVIPicasso);
        }
        if (catchingFishGoogleMapsMoshi != 0) {
            CatchingFishRetrofitFAB catchingFishRetrofitFAB = catchingFishGoogleMapsMoshi.CatchingFishCoroutineFlow.CatchingFishCameraXIntent;
            HashMap hashMap = catchingFishRetrofitFAB.CatchingFishCoroutine;
            CatchingFishRetrofitFAB catchingFishRetrofitFAB2 = (CatchingFishRetrofitFAB) hashMap.get(catchingFishGoogleMapsMoshi.CatchingFishViewModelFAB);
            if (catchingFishRetrofitFAB2 == null) {
                catchingFishRetrofitFAB2 = new CatchingFishRetrofitFAB(catchingFishRetrofitFAB.CatchingFishDaggerWebsocket);
                hashMap.put(catchingFishGoogleMapsMoshi.CatchingFishViewModelFAB, catchingFishRetrofitFAB2);
            }
            this.CatchingFishCameraXIntent = catchingFishRetrofitFAB2;
        } else if (catchingFishMVIPicasso != null) {
            this.CatchingFishCameraXIntent = (CatchingFishRetrofitFAB) new CatchingFishServiceHilt(catchingFishMVIPicasso.CatchingFishParcelableFlux.CatchingFishReduxKtor(), CatchingFishRetrofitFAB.CatchingFishViewModelFAB).CatchingFishCoroutineFlow(CatchingFishRetrofitFAB.class);
        } else {
            this.CatchingFishCameraXIntent = new CatchingFishRetrofitFAB(false);
        }
        CatchingFishRetrofitFAB catchingFishRetrofitFAB3 = this.CatchingFishCameraXIntent;
        catchingFishRetrofitFAB3.CatchingFishViewModelScope = this.CatchingFishFragmentFactory || this.CatchingFishMutableLiveData;
        this.CatchingFishCoroutine.CatchingFishViewModelScope = catchingFishRetrofitFAB3;
        CatchingFishMVIPicasso catchingFishMVIPicasso2 = this.CatchingFishJetpackCompose;
        if (catchingFishMVIPicasso2 != null && catchingFishGoogleMapsMoshi == 0) {
            CatchingFishViewModelIntent CatchingFishParcelableFAB = catchingFishMVIPicasso2.CatchingFishParcelableFAB();
            CatchingFishParcelableFAB.CatchingFishCardViewRealm("android:support:fragments", new CatchingFishViewCardView(3, this));
            Bundle CatchingFishDaggerWebsocket = CatchingFishParcelableFAB.CatchingFishDaggerWebsocket("android:support:fragments");
            if (CatchingFishDaggerWebsocket != null) {
                CatchingFishLayoutInflater(CatchingFishDaggerWebsocket);
            }
        }
        CatchingFishMVIPicasso catchingFishMVIPicasso3 = this.CatchingFishJetpackCompose;
        if (catchingFishMVIPicasso3 != null) {
            CatchingFishGoogleMapsGson catchingFishGoogleMapsGson = catchingFishMVIPicasso3.CatchingFishParcelableFlux.CatchingFishEspressoTesting;
            String str = "FragmentManager:" + (catchingFishGoogleMapsMoshi != 0 ? CatchingFishMVPLiveData.CatchingFishStateLiveData(new StringBuilder(), catchingFishGoogleMapsMoshi.CatchingFishViewModelFAB, ":") : "");
            this.CatchingFishCardViewRealm = catchingFishGoogleMapsGson.CatchingFishCoroutine(CatchingFishMVPLiveData.CatchingFishEspressoTesting(str, "StartActivityForResult"), new CatchingFishMVIFABLayout(2), new CatchingFishWebSocketAdMob(this, 1));
            this.CatchingFishPayPal = catchingFishGoogleMapsGson.CatchingFishCoroutine(CatchingFishMVPLiveData.CatchingFishEspressoTesting(str, "StartIntentSenderForResult"), new CatchingFishMVIFABLayout(3), new CatchingFishWebSocketAdMob(this, 2));
            this.CatchingFishCardViewView = catchingFishGoogleMapsGson.CatchingFishCoroutine(CatchingFishMVPLiveData.CatchingFishEspressoTesting(str, "RequestPermissions"), new CatchingFishMVIFABLayout(0), new CatchingFishWebSocketAdMob(this, 0));
        }
        CatchingFishMVIPicasso catchingFishMVIPicasso4 = this.CatchingFishJetpackCompose;
        if (catchingFishMVIPicasso4 != null) {
            catchingFishMVIPicasso4.CatchingFishParcelableFlux.CatchingFishViewModelScope(this.CatchingFishUnitTesting);
        }
        CatchingFishMVIPicasso catchingFishMVIPicasso5 = this.CatchingFishJetpackCompose;
        if (catchingFishMVIPicasso5 != null) {
            FragmentActivity fragmentActivity = catchingFishMVIPicasso5.CatchingFishParcelableFlux;
            fragmentActivity.getClass();
            CatchingFishMVPWorkManager catchingFishMVPWorkManager = this.CatchingFishAnimationMockk;
            CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMVPWorkManager, "listener");
            fragmentActivity.CatchingFishUnitTesting.add(catchingFishMVPWorkManager);
        }
        CatchingFishMVIPicasso catchingFishMVIPicasso6 = this.CatchingFishJetpackCompose;
        if (catchingFishMVIPicasso6 != null) {
            FragmentActivity fragmentActivity2 = catchingFishMVIPicasso6.CatchingFishParcelableFlux;
            fragmentActivity2.getClass();
            CatchingFishMVPWorkManager catchingFishMVPWorkManager2 = this.CatchingFishStateLiveData;
            CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMVPWorkManager2, "listener");
            fragmentActivity2.CatchingFishStateLiveData.add(catchingFishMVPWorkManager2);
        }
        CatchingFishMVIPicasso catchingFishMVIPicasso7 = this.CatchingFishJetpackCompose;
        if (catchingFishMVIPicasso7 != null) {
            FragmentActivity fragmentActivity3 = catchingFishMVIPicasso7.CatchingFishParcelableFlux;
            fragmentActivity3.getClass();
            CatchingFishMVPWorkManager catchingFishMVPWorkManager3 = this.CatchingFishRoomDatabase;
            CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMVPWorkManager3, "listener");
            fragmentActivity3.CatchingFishRoomDatabase.add(catchingFishMVPWorkManager3);
        }
        CatchingFishMVIPicasso catchingFishMVIPicasso8 = this.CatchingFishJetpackCompose;
        if (catchingFishMVIPicasso8 == null || catchingFishGoogleMapsMoshi != 0) {
            return;
        }
        FragmentActivity fragmentActivity4 = catchingFishMVIPicasso8.CatchingFishParcelableFlux;
        fragmentActivity4.getClass();
        CatchingFishLiveDataToast catchingFishLiveDataToast = this.CatchingFishNavigation;
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishLiveDataToast, "provider");
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = fragmentActivity4.CatchingFishWorkManager;
        ((CopyOnWriteArrayList) catchingFishAsyncTaskDagger.CatchingFishViewModelScope).add(catchingFishLiveDataToast);
        ((Runnable) catchingFishAsyncTaskDagger.CatchingFishWorkManager).run();
    }

    public final void CatchingFishSpannableWidget(CatchingFishReduxView catchingFishReduxView, boolean z) {
        if (!z) {
            if (this.CatchingFishJetpackCompose == null) {
                if (!this.CatchingFishJobScheduler) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.CatchingFishFragmentFactory || this.CatchingFishMutableLiveData) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.CatchingFishParcelableFAB) {
            try {
                if (this.CatchingFishJetpackCompose == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.CatchingFishParcelableFAB.add(catchingFishReduxView);
                    CatchingFishRecyclerView();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void CatchingFishStateFlow(CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi) {
        if (catchingFishGoogleMapsMoshi != null) {
            if (!catchingFishGoogleMapsMoshi.equals(this.CatchingFishCoroutine.CatchingFishFragmentHandler(catchingFishGoogleMapsMoshi.CatchingFishViewModelFAB)) || (catchingFishGoogleMapsMoshi.CatchingFishDaggerHiltFAB != null && catchingFishGoogleMapsMoshi.CatchingFishCoroutineFlow != this)) {
                throw new IllegalArgumentException("Fragment " + catchingFishGoogleMapsMoshi + " is not an active fragment of FragmentManager " + this);
            }
        }
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi2 = this.CatchingFishSpannableWidget;
        this.CatchingFishSpannableWidget = catchingFishGoogleMapsMoshi;
        CatchingFishRoomDatabase(catchingFishGoogleMapsMoshi2);
        CatchingFishRoomDatabase(this.CatchingFishSpannableWidget);
    }

    public final void CatchingFishStateLiveData() {
        if (this.CatchingFish < 1) {
            return;
        }
        for (CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi : this.CatchingFishCoroutine.CatchingFishStateLiveData()) {
            if (catchingFishGoogleMapsMoshi != null && !catchingFishGoogleMapsMoshi.CatchingFishCardViewView) {
                catchingFishGoogleMapsMoshi.CatchingFishSpannableWidget.CatchingFishStateLiveData();
            }
        }
    }

    public final void CatchingFishStripeAPI() {
        synchronized (this.CatchingFishParcelableFAB) {
            try {
                if (!this.CatchingFishParcelableFAB.isEmpty()) {
                    this.CatchingFishViewModelFAB.CatchingFishParcelableFAB(true);
                    return;
                }
                CatchingFishViewPagerRealm catchingFishViewPagerRealm = this.CatchingFishViewModelFAB;
                ArrayList arrayList = this.CatchingFishReduxKtor;
                catchingFishViewPagerRealm.CatchingFishParcelableFAB((arrayList != null ? arrayList.size() : 0) > 0 && CatchingFishSensorManager(this.CatchingFishDaggerHiltFAB));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void CatchingFishUnitTesting() {
        ArrayList CatchingFishAnimationMockk = this.CatchingFishCoroutine.CatchingFishAnimationMockk();
        int size = CatchingFishAnimationMockk.size();
        int i = 0;
        while (i < size) {
            Object obj = CatchingFishAnimationMockk.get(i);
            i++;
            CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = (CatchingFishGoogleMapsMoshi) obj;
            if (catchingFishGoogleMapsMoshi != null) {
                catchingFishGoogleMapsMoshi.CatchingFishOkHttp();
                catchingFishGoogleMapsMoshi.CatchingFishSpannableWidget.CatchingFishUnitTesting();
            }
        }
    }

    public final void CatchingFishViewModelFAB(boolean z) {
        if (z && this.CatchingFishJetpackCompose != null) {
            CatchingFishMVVMAppCompat(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi : this.CatchingFishCoroutine.CatchingFishStateLiveData()) {
            if (catchingFishGoogleMapsMoshi != null) {
                catchingFishGoogleMapsMoshi.CatchingFishMutableLiveData = true;
                if (z) {
                    catchingFishGoogleMapsMoshi.CatchingFishSpannableWidget.CatchingFishViewModelFAB(true);
                }
            }
        }
    }

    public final void CatchingFishViewModelScope(CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi) {
        if (CatchingFishFragmentFactory(2)) {
            Objects.toString(catchingFishGoogleMapsMoshi);
        }
        if (catchingFishGoogleMapsMoshi.CatchingFishMVPRobolectric) {
            return;
        }
        catchingFishGoogleMapsMoshi.CatchingFishMVPRobolectric = true;
        if (catchingFishGoogleMapsMoshi.CatchingFishUnitTesting) {
            if (CatchingFishFragmentFactory(2)) {
                catchingFishGoogleMapsMoshi.toString();
            }
            CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = this.CatchingFishCoroutine;
            synchronized (((ArrayList) catchingFishFluxFluxBundle.CatchingFishReduxKtor)) {
                ((ArrayList) catchingFishFluxFluxBundle.CatchingFishReduxKtor).remove(catchingFishGoogleMapsMoshi);
            }
            catchingFishGoogleMapsMoshi.CatchingFishUnitTesting = false;
            if (CatchingFishMutableLiveData(catchingFishGoogleMapsMoshi)) {
                this.CatchingFishCustomView = true;
            }
            CatchingFishJUnitRealm(catchingFishGoogleMapsMoshi);
        }
    }

    public final CatchingFishStateFlowMockk CatchingFishWorkManager(CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi) {
        String str = catchingFishGoogleMapsMoshi.CatchingFishViewModelFAB;
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = this.CatchingFishCoroutine;
        CatchingFishStateFlowMockk catchingFishStateFlowMockk = (CatchingFishStateFlowMockk) ((HashMap) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).get(str);
        if (catchingFishStateFlowMockk != null) {
            return catchingFishStateFlowMockk;
        }
        CatchingFishStateFlowMockk catchingFishStateFlowMockk2 = new CatchingFishStateFlowMockk(this.CatchingFishEspressoTesting, catchingFishFluxFluxBundle, catchingFishGoogleMapsMoshi);
        catchingFishStateFlowMockk2.CatchingFishOkHttp(this.CatchingFishJetpackCompose.CatchingFishCoroutineFlow.getClassLoader());
        catchingFishStateFlowMockk2.CatchingFishDaggerWebsocket = this.CatchingFish;
        return catchingFishStateFlowMockk2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = this.CatchingFishDaggerHiltFAB;
        if (catchingFishGoogleMapsMoshi != null) {
            sb.append(catchingFishGoogleMapsMoshi.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.CatchingFishDaggerHiltFAB)));
            sb.append("}");
        } else {
            CatchingFishMVIPicasso catchingFishMVIPicasso = this.CatchingFishJetpackCompose;
            if (catchingFishMVIPicasso != null) {
                sb.append(catchingFishMVIPicasso.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.CatchingFishJetpackCompose)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }
}
