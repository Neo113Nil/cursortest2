package kotlin.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CatchingFishFAB implements CatchingFishCoroutineWidget, View.OnAttachStateChangeListener {
    public final CatchingFishLayoutGsonRoom CatchingFishAnimationMockk;
    public final CatchingFishCustomViewKtor CatchingFishDaggerWebsocket;
    public final CatchingFishMVPLayout CatchingFishNavigation;
    public CatchingFishLayoutGsonRoom CatchingFishOkHttp;
    public final CatchingFishGradleCameraX CatchingFishReduxKtor;
    public boolean CatchingFishRoomDatabase;
    public CatchingFishHiltGlideRoom CatchingFishStateLiveData;
    public long CatchingFishUnitTesting;
    public CatchingFishCameraXJUnit CatchingFishWorkManager;
    public final ArrayList CatchingFishViewModelScope = new ArrayList();
    public final long CatchingFishViewModelFAB = 100;
    public CatchingFishHandlerFAB CatchingFishLayout = CatchingFishHandlerFAB.CatchingFishReduxKtor;
    public boolean CatchingFishFragmentHandler = true;
    public final CatchingFishPicassoCameraX CatchingFishCloudMessaging = CatchingFishAdMobFAB.CatchingFishParcelableFAB(1, null, 6);
    public final Handler CatchingFishEspressoTesting = new Handler(Looper.getMainLooper());

    public CatchingFishFAB(CatchingFishGradleCameraX catchingFishGradleCameraX, CatchingFishCustomViewKtor catchingFishCustomViewKtor) {
        this.CatchingFishReduxKtor = catchingFishGradleCameraX;
        this.CatchingFishDaggerWebsocket = catchingFishCustomViewKtor;
        CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom = CatchingFishFluxCardView.CatchingFishParcelableFAB;
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishLayoutGsonRoom, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.CatchingFishOkHttp = catchingFishLayoutGsonRoom;
        this.CatchingFishAnimationMockk = new CatchingFishLayoutGsonRoom();
        CatchingFishMVIGraphQLHilt CatchingFishParcelableFAB = catchingFishGradleCameraX.getSemanticsOwner().CatchingFishParcelableFAB();
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishLayoutGsonRoom, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.CatchingFishStateLiveData = new CatchingFishHiltGlideRoom(CatchingFishParcelableFAB, catchingFishLayoutGsonRoom);
        this.CatchingFishNavigation = new CatchingFishMVPLayout(3, this);
    }

    public final void CatchingFishCloudMessaging(String str, int i) {
        CatchingFishCameraXJUnit catchingFishCameraXJUnit;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (catchingFishCameraXJUnit = this.CatchingFishWorkManager) != null) {
            AutofillId CatchingFishParcelableFAB = catchingFishCameraXJUnit.CatchingFishParcelableFAB(i);
            if (CatchingFishParcelableFAB == null) {
                throw CatchingFishMVPLiveData.CatchingFish("Invalid content capture ID");
            }
            if (i2 >= 29) {
                CatchingFishJUnitFlux.CatchingFishViewModelScope(CatchingFishLifecycle.CatchingFishViewModelScope(catchingFishCameraXJUnit.CatchingFishParcelableFAB), CatchingFishParcelableFAB, str);
            }
        }
    }

    @Override // kotlin.text.CatchingFishCoroutineWidget
    public final void CatchingFishDaggerWebsocket(CatchingFishToastFlux catchingFishToastFlux) {
        this.CatchingFishWorkManager = (CatchingFishCameraXJUnit) this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB();
        CatchingFishEspressoTesting(-1, this.CatchingFishReduxKtor.getSemanticsOwner().CatchingFishParcelableFAB());
        CatchingFishLayout();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v10 android.view.autofill.AutofillId, still in use, count: 2, list:
          (r7v10 android.view.autofill.AutofillId) from 0x0096: IF  (r7v10 android.view.autofill.AutofillId) == (null android.view.autofill.AutofillId)  -> B:22:0x0074 A[HIDDEN] (LINE:151)
          (r7v10 android.view.autofill.AutofillId) from 0x009f: PHI (r7v4 android.view.autofill.AutofillId) = (r7v3 android.view.autofill.AutofillId), (r7v10 android.view.autofill.AutofillId) binds: [B:98:0x0099, B:42:0x0096] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishEspressoTesting(int r18, kotlin.text.CatchingFishMVIGraphQLHilt r19) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.CatchingFishFAB.CatchingFishEspressoTesting(int, kotlin.text.CatchingFishMVIGraphQLHilt):void");
    }

    public final void CatchingFishFragmentHandler(CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt, CatchingFishHiltGlideRoom catchingFishHiltGlideRoom) {
        CatchingFishWidgetCardView catchingFishWidgetCardView = new CatchingFishWidgetCardView(1, catchingFishHiltGlideRoom, this);
        catchingFishMVIGraphQLHilt.getClass();
        List CatchingFishFragmentHandler = CatchingFishMVIGraphQLHilt.CatchingFishFragmentHandler(4, catchingFishMVIGraphQLHilt);
        int size = CatchingFishFragmentHandler.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = CatchingFishFragmentHandler.get(i2);
            if (CatchingFishViewModelScope().CatchingFishParcelableFAB(((CatchingFishMVIGraphQLHilt) obj).CatchingFishViewModelScope)) {
                catchingFishWidgetCardView.CatchingFishDaggerWebsocket(Integer.valueOf(i), obj);
                i++;
            }
        }
        List CatchingFishFragmentHandler2 = CatchingFishMVIGraphQLHilt.CatchingFishFragmentHandler(4, catchingFishMVIGraphQLHilt);
        int size2 = CatchingFishFragmentHandler2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt2 = (CatchingFishMVIGraphQLHilt) CatchingFishFragmentHandler2.get(i3);
            CatchingFishReduxLifecycle CatchingFishViewModelScope = CatchingFishViewModelScope();
            int i4 = catchingFishMVIGraphQLHilt2.CatchingFishViewModelScope;
            if (CatchingFishViewModelScope.CatchingFishParcelableFAB(i4)) {
                CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom = this.CatchingFishAnimationMockk;
                if (catchingFishLayoutGsonRoom.CatchingFishParcelableFAB(i4)) {
                    Object CatchingFishSnackbar = catchingFishLayoutGsonRoom.CatchingFishSnackbar(i4);
                    if (CatchingFishSnackbar == null) {
                        throw CatchingFishMVPLiveData.CatchingFish("node not present in pruned tree before this change");
                    }
                    CatchingFishFragmentHandler(catchingFishMVIGraphQLHilt2, (CatchingFishHiltGlideRoom) CatchingFishSnackbar);
                } else {
                    continue;
                }
            }
        }
    }

    public final void CatchingFishLayout() {
        CatchingFishCameraXJUnit catchingFishCameraXJUnit = this.CatchingFishWorkManager;
        if (catchingFishCameraXJUnit == null) {
            return;
        }
        Object obj = catchingFishCameraXJUnit.CatchingFishParcelableFAB;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.CatchingFishViewModelScope;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            CatchingFishSharedFlowFlux catchingFishSharedFlowFlux = (CatchingFishSharedFlowFlux) arrayList.get(i);
            int ordinal = catchingFishSharedFlowFlux.CatchingFishCoroutine.ordinal();
            if (ordinal == 0) {
                CatchingFishEspressoPayPal catchingFishEspressoPayPal = catchingFishSharedFlowFlux.CatchingFishReduxKtor;
                if (catchingFishEspressoPayPal != null) {
                    ViewStructure viewStructure = (ViewStructure) catchingFishEspressoPayPal.CatchingFishDaggerWebsocket;
                    if (Build.VERSION.SDK_INT >= 29) {
                        CatchingFishJUnitFlux.CatchingFishDaggerWebsocket(CatchingFishLifecycle.CatchingFishViewModelScope(obj), viewStructure);
                    }
                }
            } else {
                if (ordinal != 1) {
                    throw new CatchingFishBiometricView();
                }
                AutofillId CatchingFishParcelableFAB = catchingFishCameraXJUnit.CatchingFishParcelableFAB(catchingFishSharedFlowFlux.CatchingFishParcelableFAB);
                if (CatchingFishParcelableFAB != null && Build.VERSION.SDK_INT >= 29) {
                    CatchingFishJUnitFlux.CatchingFishWorkManager(CatchingFishLifecycle.CatchingFishViewModelScope(obj), CatchingFishParcelableFAB);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession CatchingFishViewModelScope = CatchingFishLifecycle.CatchingFishViewModelScope(obj);
            CatchingFishFABFlux CatchingFishSpannableWidget = CatchingFishOkHttpFAB.CatchingFishSpannableWidget(catchingFishCameraXJUnit.CatchingFishSnackbar);
            Objects.requireNonNull(CatchingFishSpannableWidget);
            CatchingFishJUnitFlux.CatchingFishViewModelFAB(CatchingFishViewModelScope, CatchingFishLifecycleJUnit.CatchingFishLayout(CatchingFishSpannableWidget.CatchingFishReduxKtor), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    public final void CatchingFishOkHttp(CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt) {
        if (CatchingFishViewModelFAB()) {
            this.CatchingFishViewModelScope.add(new CatchingFishSharedFlowFlux(catchingFishMVIGraphQLHilt.CatchingFishViewModelScope, this.CatchingFishUnitTesting, CatchingFishXMLLayoutFlux.CatchingFishDaggerWebsocket, null));
            List CatchingFishFragmentHandler = CatchingFishMVIGraphQLHilt.CatchingFishFragmentHandler(4, catchingFishMVIGraphQLHilt);
            int size = CatchingFishFragmentHandler.size();
            for (int i = 0; i < size; i++) {
                CatchingFishOkHttp((CatchingFishMVIGraphQLHilt) CatchingFishFragmentHandler.get(i));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r8 != r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (kotlin.text.CatchingFishRobolectricHilt.CatchingFishStateLiveData(r7.CatchingFishViewModelFAB, r0) == r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007d -> B:11:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishParcelableFAB(CatchingFishStateFlowGson catchingFishStateFlowGson) {
        CatchingFishMVPRedux catchingFishMVPRedux;
        int i;
        CatchingFishMVVMCardView catchingFishMVVMCardView;
        if (catchingFishStateFlowGson instanceof CatchingFishMVPRedux) {
            catchingFishMVPRedux = (CatchingFishMVPRedux) catchingFishStateFlowGson;
            int i2 = catchingFishMVPRedux.CatchingFishFragmentHandler;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                catchingFishMVPRedux.CatchingFishFragmentHandler = i2 - Integer.MIN_VALUE;
                Object obj = catchingFishMVPRedux.CatchingFishViewModelFAB;
                i = catchingFishMVPRedux.CatchingFishFragmentHandler;
                CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                if (i != 0) {
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    CatchingFishPicassoCameraX catchingFishPicassoCameraX = this.CatchingFishCloudMessaging;
                    catchingFishPicassoCameraX.getClass();
                    catchingFishMVVMCardView = new CatchingFishMVVMCardView(catchingFishPicassoCameraX);
                } else if (i == 1) {
                    catchingFishMVVMCardView = catchingFishMVPRedux.CatchingFishViewModelScope;
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return CatchingFishRealmContext.CatchingFishParcelableFAB;
                    }
                    catchingFishMVVMCardView.CatchingFishCoroutine();
                    if (CatchingFishViewModelFAB()) {
                        CatchingFishLayout();
                    }
                    if (!this.CatchingFishRoomDatabase) {
                        this.CatchingFishRoomDatabase = true;
                        this.CatchingFishEspressoTesting.post(this.CatchingFishNavigation);
                    }
                    catchingFishMVPRedux.CatchingFishViewModelScope = catchingFishMVVMCardView;
                    catchingFishMVPRedux.CatchingFishFragmentHandler = 2;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    catchingFishMVVMCardView = catchingFishMVPRedux.CatchingFishViewModelScope;
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                }
                catchingFishMVPRedux.CatchingFishViewModelScope = catchingFishMVVMCardView;
                catchingFishMVPRedux.CatchingFishFragmentHandler = 1;
                obj = catchingFishMVVMCardView.CatchingFishSnackbar(catchingFishMVPRedux);
            }
        }
        catchingFishMVPRedux = new CatchingFishMVPRedux(this, catchingFishStateFlowGson);
        Object obj2 = catchingFishMVPRedux.CatchingFishViewModelFAB;
        i = catchingFishMVPRedux.CatchingFishFragmentHandler;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk2 = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        if (i != 0) {
        }
        catchingFishMVPRedux.CatchingFishViewModelScope = catchingFishMVVMCardView;
        catchingFishMVPRedux.CatchingFishFragmentHandler = 1;
        obj2 = catchingFishMVVMCardView.CatchingFishSnackbar(catchingFishMVPRedux);
    }

    @Override // kotlin.text.CatchingFishCoroutineWidget
    public final void CatchingFishReduxKtor(CatchingFishToastFlux catchingFishToastFlux) {
        CatchingFishOkHttp(this.CatchingFishReduxKtor.getSemanticsOwner().CatchingFishParcelableFAB());
        CatchingFishLayout();
        this.CatchingFishWorkManager = null;
    }

    public final void CatchingFishUnitTesting() {
        CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom = this.CatchingFishAnimationMockk;
        catchingFishLayoutGsonRoom.CatchingFishCoroutine();
        CatchingFishReduxLifecycle CatchingFishViewModelScope = CatchingFishViewModelScope();
        int[] iArr = CatchingFishViewModelScope.CatchingFishSnackbar;
        Object[] objArr = CatchingFishViewModelScope.CatchingFishCoroutine;
        long[] jArr = CatchingFishViewModelScope.CatchingFishParcelableFAB;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            catchingFishLayoutGsonRoom.CatchingFishViewModelFAB(iArr[i4], new CatchingFishHiltGlideRoom(((CatchingFishMoshiKtor) objArr[i4]).CatchingFishParcelableFAB, CatchingFishViewModelScope()));
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
        this.CatchingFishStateLiveData = new CatchingFishHiltGlideRoom(this.CatchingFishReduxKtor.getSemanticsOwner().CatchingFishParcelableFAB(), CatchingFishViewModelScope());
    }

    public final boolean CatchingFishViewModelFAB() {
        return this.CatchingFishWorkManager != null;
    }

    public final CatchingFishReduxLifecycle CatchingFishViewModelScope() {
        if (this.CatchingFishFragmentHandler) {
            this.CatchingFishFragmentHandler = false;
            this.CatchingFishOkHttp = CatchingFishAdMobFAB.CatchingFishDaggerHiltFAB(this.CatchingFishReduxKtor.getSemanticsOwner());
            this.CatchingFishUnitTesting = System.currentTimeMillis();
        }
        return this.CatchingFishOkHttp;
    }

    public final void CatchingFishWorkManager(CatchingFishReduxLifecycle catchingFishReduxLifecycle) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        long[] jArr3;
        long[] jArr4;
        long j3;
        long j4;
        CatchingFishReduxLifecycle catchingFishReduxLifecycle2 = catchingFishReduxLifecycle;
        int[] iArr3 = catchingFishReduxLifecycle2.CatchingFishSnackbar;
        long[] jArr5 = catchingFishReduxLifecycle2.CatchingFishParcelableFAB;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j5 = jArr5[i2];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j5 & 255) < 128) {
                        int i6 = iArr3[(i2 << 3) + i5];
                        c = c2;
                        CatchingFishHiltGlideRoom catchingFishHiltGlideRoom = (CatchingFishHiltGlideRoom) this.CatchingFishAnimationMockk.CatchingFishSnackbar(i6);
                        CatchingFishMoshiKtor catchingFishMoshiKtor = (CatchingFishMoshiKtor) catchingFishReduxLifecycle2.CatchingFishSnackbar(i6);
                        CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt = catchingFishMoshiKtor != null ? catchingFishMoshiKtor.CatchingFishParcelableFAB : null;
                        if (catchingFishMVIGraphQLHilt == null) {
                            throw CatchingFishMVPLiveData.CatchingFish("no value for specified key");
                        }
                        j2 = j6;
                        int i7 = catchingFishMVIGraphQLHilt.CatchingFishViewModelScope;
                        CatchingFishMVPMotionLayout catchingFishMVPMotionLayout = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor;
                        if (catchingFishHiltGlideRoom == null) {
                            CatchingFishPayPalService catchingFishPayPalService = catchingFishMVPMotionLayout.CatchingFishReduxKtor;
                            Object[] objArr = catchingFishPayPalService.CatchingFishSnackbar;
                            long[] jArr6 = catchingFishPayPalService.CatchingFishParcelableFAB;
                            int length2 = jArr6.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i8 = i3;
                                int i9 = 0;
                                while (true) {
                                    long j7 = jArr6[i9];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                        for (int i11 = 0; i11 < i10; i11++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                CatchingFishGraphQLLayout catchingFishGraphQLLayout = (CatchingFishGraphQLLayout) objArr[(i9 << 3) + i11];
                                                CatchingFishGraphQLLayout catchingFishGraphQLLayout2 = CatchingFishServiceMVI.CatchingFishParcelableFAB;
                                                CatchingFishGraphQLLayout catchingFishGraphQLLayout3 = CatchingFishServiceMVI.CatchingFishParcelableFlux;
                                                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout, catchingFishGraphQLLayout3)) {
                                                    List list = (List) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout, catchingFishGraphQLLayout3);
                                                    CatchingFishCloudMessaging(String.valueOf(list != null ? (CatchingFishWebsocketDagger) CatchingFishCameraXCameraX.CatchingFishJUnitRealm(list) : null), i7);
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i8;
                                        }
                                        if (i10 != i8) {
                                            break;
                                        }
                                    }
                                    if (i9 == length2) {
                                        break;
                                    }
                                    i9++;
                                    j5 = j;
                                    i8 = 8;
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            CatchingFishPayPalService catchingFishPayPalService2 = catchingFishMVPMotionLayout.CatchingFishReduxKtor;
                            Object[] objArr2 = catchingFishPayPalService2.CatchingFishSnackbar;
                            long[] jArr7 = catchingFishPayPalService2.CatchingFishParcelableFAB;
                            int length3 = jArr7.length - 2;
                            if (length3 >= 0) {
                                Object[] objArr3 = objArr2;
                                jArr2 = jArr5;
                                int i12 = 0;
                                while (true) {
                                    long j8 = jArr7[i12];
                                    Object[] objArr4 = objArr3;
                                    i = i5;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        int i14 = 0;
                                        while (i14 < i13) {
                                            if ((j8 & 255) < 128) {
                                                jArr4 = jArr7;
                                                CatchingFishGraphQLLayout catchingFishGraphQLLayout4 = (CatchingFishGraphQLLayout) objArr4[(i12 << 3) + i14];
                                                CatchingFishGraphQLLayout catchingFishGraphQLLayout5 = CatchingFishServiceMVI.CatchingFishParcelableFAB;
                                                j3 = j8;
                                                CatchingFishGraphQLLayout catchingFishGraphQLLayout6 = CatchingFishServiceMVI.CatchingFishParcelableFlux;
                                                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishGraphQLLayout4, catchingFishGraphQLLayout6)) {
                                                    List list2 = (List) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishHiltGlideRoom.CatchingFishParcelableFAB, catchingFishGraphQLLayout6);
                                                    CatchingFishWebsocketDagger catchingFishWebsocketDagger = list2 != null ? (CatchingFishWebsocketDagger) CatchingFishCameraXCameraX.CatchingFishJUnitRealm(list2) : null;
                                                    List list3 = (List) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout, catchingFishGraphQLLayout6);
                                                    CatchingFishWebsocketDagger catchingFishWebsocketDagger2 = list3 != null ? (CatchingFishWebsocketDagger) CatchingFishCameraXCameraX.CatchingFishJUnitRealm(list3) : null;
                                                    if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishWebsocketDagger, catchingFishWebsocketDagger2)) {
                                                        CatchingFishCloudMessaging(String.valueOf(catchingFishWebsocketDagger2), i7);
                                                    }
                                                }
                                            } else {
                                                jArr4 = jArr7;
                                                j3 = j8;
                                            }
                                            j8 = j3 >> 8;
                                            i14++;
                                            jArr7 = jArr4;
                                        }
                                        jArr3 = jArr7;
                                        if (i13 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = jArr7;
                                    }
                                    if (i12 == length3) {
                                        break;
                                    }
                                    i12++;
                                    i5 = i;
                                    objArr3 = objArr4;
                                    jArr7 = jArr3;
                                }
                                j5 = j >> 8;
                                i5 = i + 1;
                                jArr5 = jArr2;
                                c2 = c;
                                j6 = j2;
                                iArr3 = iArr2;
                                i3 = 8;
                                catchingFishReduxLifecycle2 = catchingFishReduxLifecycle;
                            }
                        }
                        jArr2 = jArr5;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr5;
                        j = j5;
                        c = c2;
                        j2 = j6;
                    }
                    i = i5;
                    j5 = j >> 8;
                    i5 = i + 1;
                    jArr5 = jArr2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    i3 = 8;
                    catchingFishReduxLifecycle2 = catchingFishReduxLifecycle;
                }
                iArr = iArr3;
                int i15 = i3;
                jArr = jArr5;
                if (i4 != i15) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr5;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            catchingFishReduxLifecycle2 = catchingFishReduxLifecycle;
            jArr5 = jArr;
            iArr3 = iArr;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.CatchingFishEspressoTesting.removeCallbacks(this.CatchingFishNavigation);
        this.CatchingFishWorkManager = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
