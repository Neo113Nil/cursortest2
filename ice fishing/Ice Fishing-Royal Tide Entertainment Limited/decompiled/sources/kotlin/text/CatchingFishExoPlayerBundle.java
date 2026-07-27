package kotlin.text;

import android.os.Trace;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class CatchingFishExoPlayerBundle {
    public Object CatchingFishCloudMessaging;
    public CatchingFishFABToast CatchingFishCoroutine;
    public Object CatchingFishDaggerWebsocket;
    public Object CatchingFishFragmentHandler;
    public Object CatchingFishLayout;
    public final /* synthetic */ int CatchingFishParcelableFAB = 1;
    public final CatchingFishFABToast CatchingFishReduxKtor;
    public CatchingFishFABToast CatchingFishSnackbar;
    public Object CatchingFishViewModelFAB;
    public final Object CatchingFishViewModelScope;
    public Object CatchingFishWorkManager;

    public CatchingFishExoPlayerBundle(CatchingFishBiometricRoom catchingFishBiometricRoom) {
        this.CatchingFishDaggerWebsocket = catchingFishBiometricRoom;
        CatchingFishFABHandlerAdMob catchingFishFABHandlerAdMob = new CatchingFishFABHandlerAdMob();
        catchingFishFABHandlerAdMob.CatchingFishViewModelScope = -1;
        this.CatchingFishWorkManager = catchingFishFABHandlerAdMob;
        CatchingFishGlideHandler catchingFishGlideHandler = new CatchingFishGlideHandler(catchingFishBiometricRoom);
        this.CatchingFishViewModelScope = catchingFishGlideHandler;
        this.CatchingFishViewModelFAB = catchingFishGlideHandler;
        CatchingFishNavigationToast catchingFishNavigationToast = catchingFishGlideHandler.CatchingFishMotionLayout;
        this.CatchingFishLayout = catchingFishNavigationToast;
        this.CatchingFishFragmentHandler = catchingFishNavigationToast;
        this.CatchingFishReduxKtor = new CatchingFishFABToast(new CatchingFishBundleAnimation[16]);
    }

    public static CatchingFishFABStripeAPIFAB CatchingFishCoroutine(CatchingFishJUnitLayout catchingFishJUnitLayout, CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2;
        if (catchingFishJUnitLayout instanceof CatchingFishAppCompatMVVM) {
            catchingFishFABStripeAPIFAB2 = ((CatchingFishAppCompatMVVM) catchingFishJUnitLayout).CatchingFishReduxKtor();
            CatchingFishJUnitService catchingFishJUnitService = CatchingFishJUnitJUnit.CatchingFishParcelableFAB;
            int i = catchingFishFABStripeAPIFAB2.CatchingFishWorkManager;
            if (i == 0) {
                CatchingFishJUnitService catchingFishJUnitService2 = CatchingFishJUnitJUnit.CatchingFishParcelableFAB;
                Class<?> cls = catchingFishFABStripeAPIFAB2.getClass();
                int CatchingFishReduxKtor = catchingFishJUnitService2.CatchingFishReduxKtor(cls);
                if (CatchingFishReduxKtor >= 0) {
                    i = catchingFishJUnitService2.CatchingFishCoroutine[CatchingFishReduxKtor];
                } else {
                    int i2 = catchingFishFABStripeAPIFAB2 instanceof CatchingFishMVIAndroidX ? 3 : 1;
                    if (catchingFishFABStripeAPIFAB2 instanceof CatchingFishFABWorkManager) {
                        i2 |= 4;
                    }
                    if (catchingFishFABStripeAPIFAB2 instanceof CatchingFishCameraXService) {
                        i2 |= 8;
                    }
                    if (catchingFishFABStripeAPIFAB2 instanceof CatchingFishAdMobPicasso) {
                        i2 |= 16;
                    }
                    if (catchingFishFABStripeAPIFAB2 instanceof CatchingFishRobolectricFAB) {
                        i2 |= 32;
                    }
                    if (catchingFishFABStripeAPIFAB2 instanceof CatchingFishToolbarCardView) {
                        i2 |= 64;
                    }
                    if (catchingFishFABStripeAPIFAB2 instanceof CatchingFishLayoutAsyncTask) {
                        i2 |= 128;
                    }
                    if (catchingFishFABStripeAPIFAB2 instanceof CatchingFishMVVMDagger) {
                        i2 |= 256;
                    }
                    if (catchingFishFABStripeAPIFAB2 instanceof CatchingFishAppCompatWidget) {
                        i2 |= 1024;
                    }
                    if (catchingFishFABStripeAPIFAB2 instanceof CatchingFishToastLayoutMVVM) {
                        i2 |= 2048;
                    }
                    if (catchingFishFABStripeAPIFAB2 instanceof CatchingFishAdMobPicasso) {
                        i2 |= 4096;
                    }
                    if (catchingFishFABStripeAPIFAB2 instanceof CatchingFishLayoutIntent) {
                        i2 |= 8192;
                    }
                    if (catchingFishFABStripeAPIFAB2 instanceof CatchingFishGlideContext) {
                        i2 |= 16384;
                    }
                    if (catchingFishFABStripeAPIFAB2 instanceof CatchingFishAppCompatWidget) {
                        i2 |= 32768;
                    }
                    if (catchingFishFABStripeAPIFAB2 instanceof CatchingFishIntentSpannable) {
                        i2 |= 262144;
                    }
                    if (catchingFishFABStripeAPIFAB2 instanceof CatchingFishRoomAnimation) {
                        i2 |= 524288;
                    }
                    catchingFishJUnitService2.CatchingFishViewModelFAB(i2, cls);
                    i = i2;
                }
            }
            catchingFishFABStripeAPIFAB2.CatchingFishWorkManager = i;
        } else {
            CatchingFishAdMobPicasso catchingFishAdMobPicasso = new CatchingFishAdMobPicasso();
            catchingFishAdMobPicasso.CatchingFishWorkManager = CatchingFishJUnitJUnit.CatchingFishCoroutine(catchingFishJUnitLayout);
            catchingFishAdMobPicasso.CatchingFishNavigation = catchingFishJUnitLayout;
            catchingFishAdMobPicasso.CatchingFishJetpackCompose = new HashSet();
            catchingFishFABStripeAPIFAB2 = catchingFishAdMobPicasso;
        }
        if (catchingFishFABStripeAPIFAB2.CatchingFishRoomDatabase) {
            CatchingFishFluxGradle.CatchingFishSnackbar("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        catchingFishFABStripeAPIFAB2.CatchingFishEspressoTesting = true;
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB3 = catchingFishFABStripeAPIFAB.CatchingFishLayout;
        if (catchingFishFABStripeAPIFAB3 != null) {
            catchingFishFABStripeAPIFAB3.CatchingFishViewModelFAB = catchingFishFABStripeAPIFAB2;
            catchingFishFABStripeAPIFAB2.CatchingFishLayout = catchingFishFABStripeAPIFAB3;
        }
        catchingFishFABStripeAPIFAB.CatchingFishLayout = catchingFishFABStripeAPIFAB2;
        catchingFishFABStripeAPIFAB2.CatchingFishViewModelFAB = catchingFishFABStripeAPIFAB;
        return catchingFishFABStripeAPIFAB2;
    }

    public static void CatchingFishEspressoTesting(CatchingFishJUnitLayout catchingFishJUnitLayout, CatchingFishJUnitLayout catchingFishJUnitLayout2, CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
        if ((catchingFishJUnitLayout instanceof CatchingFishAppCompatMVVM) && (catchingFishJUnitLayout2 instanceof CatchingFishAppCompatMVVM)) {
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishFABStripeAPIFAB, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((CatchingFishAppCompatMVVM) catchingFishJUnitLayout2).CatchingFishDaggerWebsocket(catchingFishFABStripeAPIFAB);
            if (catchingFishFABStripeAPIFAB.CatchingFishRoomDatabase) {
                CatchingFishJUnitJUnit.CatchingFishSnackbar(catchingFishFABStripeAPIFAB);
                return;
            } else {
                catchingFishFABStripeAPIFAB.CatchingFishOkHttp = true;
                return;
            }
        }
        if (!(catchingFishFABStripeAPIFAB instanceof CatchingFishAdMobPicasso)) {
            CatchingFishFluxGradle.CatchingFishSnackbar("Unknown Modifier.Node type");
            return;
        }
        CatchingFishAdMobPicasso catchingFishAdMobPicasso = (CatchingFishAdMobPicasso) catchingFishFABStripeAPIFAB;
        if (catchingFishAdMobPicasso.CatchingFishRoomDatabase) {
            catchingFishAdMobPicasso.CatchingFishFragmentFactory();
        }
        catchingFishAdMobPicasso.CatchingFishNavigation = catchingFishJUnitLayout2;
        catchingFishAdMobPicasso.CatchingFishWorkManager = CatchingFishJUnitJUnit.CatchingFishCoroutine(catchingFishJUnitLayout2);
        if (catchingFishAdMobPicasso.CatchingFishRoomDatabase) {
            catchingFishAdMobPicasso.CatchingFishPayPal(false);
        }
        if (catchingFishFABStripeAPIFAB.CatchingFishRoomDatabase) {
            CatchingFishJUnitJUnit.CatchingFishSnackbar(catchingFishFABStripeAPIFAB);
        } else {
            catchingFishFABStripeAPIFAB.CatchingFishOkHttp = true;
        }
    }

    public static final void CatchingFishParcelableFAB(CatchingFishExoPlayerBundle catchingFishExoPlayerBundle, CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB, CatchingFishDaggerToolbar catchingFishDaggerToolbar) {
        for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2 = catchingFishFABStripeAPIFAB.CatchingFishViewModelFAB; catchingFishFABStripeAPIFAB2 != null; catchingFishFABStripeAPIFAB2 = catchingFishFABStripeAPIFAB2.CatchingFishViewModelFAB) {
            if (catchingFishFABStripeAPIFAB2 == ((CatchingFishFABHandlerAdMob) catchingFishExoPlayerBundle.CatchingFishWorkManager)) {
                CatchingFishBiometricRoom CatchingFishRoomDatabase = ((CatchingFishBiometricRoom) catchingFishExoPlayerBundle.CatchingFishDaggerWebsocket).CatchingFishRoomDatabase();
                catchingFishDaggerToolbar.CatchingFish = CatchingFishRoomDatabase != null ? (CatchingFishGlideHandler) CatchingFishRoomDatabase.CatchingFishJobScheduler.CatchingFishViewModelScope : null;
                catchingFishExoPlayerBundle.CatchingFishViewModelFAB = catchingFishDaggerToolbar;
                return;
            } else {
                if ((catchingFishFABStripeAPIFAB2.CatchingFishWorkManager & 2) != 0) {
                    return;
                }
                catchingFishFABStripeAPIFAB2.CatchingFishCloudMessaging = catchingFishDaggerToolbar;
            }
        }
    }

    public static CatchingFishFABStripeAPIFAB CatchingFishReduxKtor(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
        boolean z = catchingFishFABStripeAPIFAB.CatchingFishRoomDatabase;
        if (z) {
            CatchingFishJUnitService catchingFishJUnitService = CatchingFishJUnitJUnit.CatchingFishParcelableFAB;
            if (!z) {
                CatchingFishFluxGradle.CatchingFishSnackbar("autoInvalidateRemovedNode called on unattached node");
            }
            CatchingFishJUnitJUnit.CatchingFishParcelableFAB(catchingFishFABStripeAPIFAB, catchingFishFABStripeAPIFAB.CatchingFishWorkManager, 2);
            catchingFishFABStripeAPIFAB.CatchingFishCardViewRealm();
            catchingFishFABStripeAPIFAB.CatchingFishCoroutineFlow();
        }
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2 = catchingFishFABStripeAPIFAB.CatchingFishLayout;
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB3 = catchingFishFABStripeAPIFAB.CatchingFishViewModelFAB;
        if (catchingFishFABStripeAPIFAB2 != null) {
            catchingFishFABStripeAPIFAB2.CatchingFishViewModelFAB = catchingFishFABStripeAPIFAB3;
            catchingFishFABStripeAPIFAB.CatchingFishLayout = null;
        }
        if (catchingFishFABStripeAPIFAB3 != null) {
            catchingFishFABStripeAPIFAB3.CatchingFishLayout = catchingFishFABStripeAPIFAB2;
            catchingFishFABStripeAPIFAB.CatchingFishViewModelFAB = null;
        }
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishFABStripeAPIFAB3);
        return catchingFishFABStripeAPIFAB3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0191, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0196, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a0, code lost:
    
        if (r14 <= r7) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a2, code lost:
    
        if (r11 <= r15) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a4, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b0, code lost:
    
        if (r0.CatchingFishParcelableFAB(r14 - 1, r27 - 1) == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b2, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bd, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c1, code lost:
    
        if (r24 == 0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c3, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c5, code lost:
    
        if (r11 < r12) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c7, code lost:
    
        if (r11 > r3) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cd, code lost:
    
        if (r16[r17 + r11] < r14) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cf, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0264, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01b9, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0194, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x018d, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x017b, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x016e, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0179, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x026a, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0154, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d0, code lost:
    
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0150, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0152, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0157, code lost:
    
        if (r13 > r3) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0159, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015b, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015d, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016b, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0170, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0182, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0188, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018a, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018f, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void CatchingFishCloudMessaging(int i, CatchingFishFABToast catchingFishFABToast, CatchingFishFABToast catchingFishFABToast2, CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB, boolean z) {
        int i2;
        CatchingFishFABToast catchingFishFABToast3;
        CatchingFishFABToast catchingFishFABToast4;
        int i3;
        int[] iArr;
        int[] iArr2;
        char c;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        CatchingFishDatabindingView catchingFishDatabindingView = (CatchingFishDatabindingView) this.CatchingFishCloudMessaging;
        if (catchingFishDatabindingView == null) {
            i2 = i;
            catchingFishFABToast3 = catchingFishFABToast;
            catchingFishFABToast4 = catchingFishFABToast2;
            catchingFishDatabindingView = new CatchingFishDatabindingView(this, catchingFishFABStripeAPIFAB, i2, catchingFishFABToast3, catchingFishFABToast4, z);
            this.CatchingFishCloudMessaging = catchingFishDatabindingView;
        } else {
            i2 = i;
            catchingFishFABToast3 = catchingFishFABToast;
            catchingFishFABToast4 = catchingFishFABToast2;
            catchingFishDatabindingView.CatchingFishParcelableFAB = catchingFishFABStripeAPIFAB;
            catchingFishDatabindingView.CatchingFishSnackbar = i2;
            catchingFishDatabindingView.CatchingFishCoroutine = catchingFishFABToast3;
            catchingFishDatabindingView.CatchingFishReduxKtor = catchingFishFABToast4;
            catchingFishDatabindingView.CatchingFishDaggerWebsocket = z;
        }
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle = catchingFishDatabindingView.CatchingFishWorkManager;
        int i9 = catchingFishFABToast3.CatchingFishWorkManager - i2;
        int i10 = catchingFishFABToast4.CatchingFishWorkManager - i2;
        char c3 = 2;
        int i11 = ((i9 + i10) + 1) / 2;
        CatchingFishWidgetToolbar catchingFishWidgetToolbar = new CatchingFishWidgetToolbar(i11 * 3);
        CatchingFishWidgetToolbar catchingFishWidgetToolbar2 = new CatchingFishWidgetToolbar(i11 * 4);
        int i12 = 0;
        catchingFishWidgetToolbar2.CatchingFishWorkManager(0, i9, 0, i10);
        int i13 = (i11 * 2) + 1;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[5];
        while (true) {
            int i14 = catchingFishWidgetToolbar2.CatchingFishSnackbar;
            if (i14 == 0) {
                break;
            }
            char c4 = c3;
            int[] iArr6 = catchingFishWidgetToolbar2.CatchingFishParcelableFAB;
            int i15 = i12;
            int i16 = i14 - 1;
            catchingFishWidgetToolbar2.CatchingFishSnackbar = i16;
            int i17 = iArr6[i16];
            int i18 = i14 - 2;
            catchingFishWidgetToolbar2.CatchingFishSnackbar = i18;
            int i19 = iArr6[i18];
            int i20 = i14 - 3;
            catchingFishWidgetToolbar2.CatchingFishSnackbar = i20;
            int i21 = iArr6[i20];
            int i22 = i14 - 4;
            catchingFishWidgetToolbar2.CatchingFishSnackbar = i22;
            int i23 = iArr6[i22];
            int i24 = i21 - i23;
            int i25 = i13;
            int i26 = i17 - i19;
            int[] iArr7 = iArr3;
            if (i24 >= 1 && i26 >= 1) {
                int i27 = 1;
                int i28 = ((i24 + i26) + 1) / 2;
                int i29 = i25 / 2;
                int i30 = i29 + 1;
                iArr7[i30] = i23;
                iArr4[i30] = i21;
                int i31 = i15;
                while (i31 < i28) {
                    int i32 = i24 - i26;
                    int i33 = i28;
                    iArr = iArr4;
                    int i34 = -i31;
                    int i35 = (Math.abs(i32) & 1) == i27 ? 1 : i15;
                    int i36 = i34;
                    while (true) {
                        if (i36 > i31) {
                            break;
                        }
                        if (i36 != i34) {
                            if (i36 != i31) {
                                i4 = i36;
                                iArr2 = iArr5;
                            } else {
                                i4 = i36;
                                iArr2 = iArr5;
                            }
                            i5 = iArr7[(i4 - 1) + i29];
                            i6 = i5 + 1;
                            int i37 = ((i6 - i23) + i19) - i4;
                            int i38 = i37 - ((i31 == 0 ? 1 : i15) & (i6 != i5 ? 1 : i15));
                            int i39 = i5;
                            i7 = i37;
                            while (i6 < i21 && i7 < i17 && catchingFishDatabindingView.CatchingFishParcelableFAB(i6, i7)) {
                                i6++;
                                i7++;
                            }
                            iArr7[i29 + i4] = i6;
                            if (i35 == 0) {
                                int i40 = i7;
                                int i41 = i32 - i4;
                                i8 = i24;
                                if (i41 >= i34 + 1 && i41 <= i31 - 1 && iArr[i29 + i41] <= i6) {
                                    iArr2[i15] = i39;
                                    iArr2[1] = i38;
                                    iArr2[c4] = i6;
                                    iArr2[3] = i40;
                                    iArr2[4] = i15;
                                    c = 1;
                                    break;
                                }
                            } else {
                                i8 = i24;
                            }
                            i36 = i4 + 2;
                            iArr5 = iArr2;
                            i24 = i8;
                        } else {
                            i4 = i36;
                            iArr2 = iArr5;
                        }
                        i5 = iArr7[i4 + 1 + i29];
                        i6 = i5;
                        int i372 = ((i6 - i23) + i19) - i4;
                        int i382 = i372 - ((i31 == 0 ? 1 : i15) & (i6 != i5 ? 1 : i15));
                        int i392 = i5;
                        i7 = i372;
                        while (i6 < i21) {
                            i6++;
                            i7++;
                        }
                        iArr7[i29 + i4] = i6;
                        if (i35 == 0) {
                        }
                        i36 = i4 + 2;
                        iArr5 = iArr2;
                        i24 = i8;
                    }
                    if (Math.min(iArr2[c4] - iArr2[i15], iArr2[3] - iArr2[c]) > 0) {
                        int i42 = iArr2[i15];
                        int i43 = iArr2[c];
                        int i44 = iArr2[3] - i43;
                        int i45 = iArr2[c4] - i42;
                        if (i44 != i45) {
                            i45 = Math.min(i45, i44);
                            int i46 = iArr2[4];
                            int i47 = i46 != 0 ? 1 : i15;
                            int i48 = iArr2[3];
                            c2 = 1;
                            int i49 = iArr2[1];
                            int i50 = i48 - i49;
                            int i51 = iArr2[c4];
                            int i52 = iArr2[i15];
                            int i53 = i42 + (((i50 > i51 - i52 ? 1 : i15) | i47) ^ 1);
                            i43 += (((i48 - i49 > i51 - i52 ? 1 : i15) ^ 1) | (i46 != 0 ? 1 : i15)) ^ 1;
                            i42 = i53;
                        } else {
                            c2 = 1;
                        }
                        catchingFishWidgetToolbar.CatchingFishDaggerWebsocket(i42, i43, i45);
                    } else {
                        c2 = c;
                    }
                    catchingFishWidgetToolbar2.CatchingFishWorkManager(i23, iArr2[i15], i19, iArr2[c2]);
                    catchingFishWidgetToolbar2.CatchingFishWorkManager(iArr2[c4], i21, iArr2[3], i17);
                    c3 = c4;
                    i12 = i15;
                    i13 = i25;
                    iArr3 = iArr7;
                    iArr4 = iArr;
                    iArr5 = iArr2;
                }
            }
            iArr = iArr4;
            iArr2 = iArr5;
            c3 = c4;
            i12 = i15;
            i13 = i25;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i54 = i12;
        int i55 = catchingFishWidgetToolbar.CatchingFishSnackbar;
        if (i55 % 3 != 0) {
            CatchingFishFluxGradle.CatchingFishSnackbar("Array size not a multiple of 3");
        }
        if (i55 > 3) {
            i3 = i54;
            catchingFishWidgetToolbar.CatchingFishViewModelScope(i3, i55 - 3);
        } else {
            i3 = i54;
        }
        catchingFishWidgetToolbar.CatchingFishDaggerWebsocket(i9, i10, i3);
        int i56 = i3;
        int i57 = i56;
        int i58 = i57;
        while (i56 < catchingFishWidgetToolbar.CatchingFishSnackbar) {
            int[] iArr8 = catchingFishWidgetToolbar.CatchingFishParcelableFAB;
            int i59 = iArr8[i56];
            int i60 = iArr8[i56 + 2];
            int i61 = i59 - i60;
            int i62 = iArr8[i56 + 1] - i60;
            i56 += 3;
            while (i57 < i61) {
                CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2 = catchingFishDatabindingView.CatchingFishParcelableFAB.CatchingFishLayout;
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishFABStripeAPIFAB2);
                if ((catchingFishFABStripeAPIFAB2.CatchingFishWorkManager & 2) != 0) {
                    CatchingFishDaggerToolbar catchingFishDaggerToolbar = catchingFishFABStripeAPIFAB2.CatchingFishCloudMessaging;
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishDaggerToolbar);
                    CatchingFishDaggerToolbar catchingFishDaggerToolbar2 = catchingFishDaggerToolbar.CatchingFish;
                    CatchingFishDaggerToolbar catchingFishDaggerToolbar3 = catchingFishDaggerToolbar.CatchingFishNavigation;
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishDaggerToolbar3);
                    if (catchingFishDaggerToolbar2 != null) {
                        catchingFishDaggerToolbar2.CatchingFishNavigation = catchingFishDaggerToolbar3;
                    }
                    catchingFishDaggerToolbar3.CatchingFish = catchingFishDaggerToolbar2;
                    CatchingFishParcelableFAB(catchingFishExoPlayerBundle, catchingFishDatabindingView.CatchingFishParcelableFAB, catchingFishDaggerToolbar3);
                }
                catchingFishDatabindingView.CatchingFishParcelableFAB = CatchingFishReduxKtor(catchingFishFABStripeAPIFAB2);
                i57++;
            }
            while (i58 < i62) {
                CatchingFishFABStripeAPIFAB CatchingFishCoroutine = CatchingFishCoroutine((CatchingFishJUnitLayout) catchingFishDatabindingView.CatchingFishReduxKtor.CatchingFishReduxKtor[catchingFishDatabindingView.CatchingFishSnackbar + i58], catchingFishDatabindingView.CatchingFishParcelableFAB);
                catchingFishDatabindingView.CatchingFishParcelableFAB = CatchingFishCoroutine;
                if (catchingFishDatabindingView.CatchingFishDaggerWebsocket) {
                    CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB3 = CatchingFishCoroutine.CatchingFishLayout;
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishFABStripeAPIFAB3);
                    CatchingFishDaggerToolbar catchingFishDaggerToolbar4 = catchingFishFABStripeAPIFAB3.CatchingFishCloudMessaging;
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishDaggerToolbar4);
                    CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB4 = catchingFishDatabindingView.CatchingFishParcelableFAB;
                    CatchingFishMVIAndroidX catchingFishMVIAndroidX = null;
                    if ((catchingFishFABStripeAPIFAB4.CatchingFishWorkManager & 2) != 0 && (catchingFishFABStripeAPIFAB4 instanceof CatchingFishMVIAndroidX)) {
                        catchingFishMVIAndroidX = (CatchingFishMVIAndroidX) catchingFishFABStripeAPIFAB4;
                    }
                    if (catchingFishMVIAndroidX != null) {
                        CatchingFishIntentViewPager catchingFishIntentViewPager = new CatchingFishIntentViewPager((CatchingFishBiometricRoom) catchingFishExoPlayerBundle.CatchingFishDaggerWebsocket, catchingFishMVIAndroidX);
                        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB5 = catchingFishDatabindingView.CatchingFishParcelableFAB;
                        catchingFishFABStripeAPIFAB5.CatchingFishCloudMessaging = catchingFishIntentViewPager;
                        CatchingFishParcelableFAB(catchingFishExoPlayerBundle, catchingFishFABStripeAPIFAB5, catchingFishIntentViewPager);
                        catchingFishIntentViewPager.CatchingFish = catchingFishDaggerToolbar4.CatchingFish;
                        catchingFishIntentViewPager.CatchingFishNavigation = catchingFishDaggerToolbar4;
                        catchingFishDaggerToolbar4.CatchingFish = catchingFishIntentViewPager;
                    } else {
                        catchingFishFABStripeAPIFAB4.CatchingFishCloudMessaging = catchingFishDaggerToolbar4;
                    }
                    catchingFishDatabindingView.CatchingFishParcelableFAB.CatchingFishJetpackCompose();
                    catchingFishDatabindingView.CatchingFishParcelableFAB.CatchingFishGsonAppCompat();
                    CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB6 = catchingFishDatabindingView.CatchingFishParcelableFAB;
                    CatchingFishJUnitService catchingFishJUnitService = CatchingFishJUnitJUnit.CatchingFishParcelableFAB;
                    if (!catchingFishFABStripeAPIFAB6.CatchingFishRoomDatabase) {
                        CatchingFishFluxGradle.CatchingFishSnackbar("autoInvalidateInsertedNode called on unattached node");
                    }
                    CatchingFishJUnitJUnit.CatchingFishParcelableFAB(catchingFishFABStripeAPIFAB6, catchingFishFABStripeAPIFAB6.CatchingFishWorkManager, 1);
                } else {
                    CatchingFishCoroutine.CatchingFishEspressoTesting = true;
                }
                i58++;
            }
            while (true) {
                int i63 = i60 - 1;
                if (i60 > 0) {
                    CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB7 = catchingFishDatabindingView.CatchingFishParcelableFAB.CatchingFishLayout;
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishFABStripeAPIFAB7);
                    catchingFishDatabindingView.CatchingFishParcelableFAB = catchingFishFABStripeAPIFAB7;
                    CatchingFishFABToast catchingFishFABToast5 = catchingFishDatabindingView.CatchingFishCoroutine;
                    int i64 = catchingFishDatabindingView.CatchingFishSnackbar;
                    CatchingFishJUnitLayout catchingFishJUnitLayout = (CatchingFishJUnitLayout) catchingFishFABToast5.CatchingFishReduxKtor[i64 + i57];
                    CatchingFishJUnitLayout catchingFishJUnitLayout2 = (CatchingFishJUnitLayout) catchingFishDatabindingView.CatchingFishReduxKtor.CatchingFishReduxKtor[i64 + i58];
                    if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishJUnitLayout, catchingFishJUnitLayout2)) {
                        CatchingFishEspressoTesting(catchingFishJUnitLayout, catchingFishJUnitLayout2, catchingFishDatabindingView.CatchingFishParcelableFAB);
                    }
                    i57++;
                    i58++;
                    i60 = i63;
                }
            }
        }
        int i65 = i3;
        for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB8 = ((CatchingFishNavigationToast) this.CatchingFishLayout).CatchingFishViewModelFAB; catchingFishFABStripeAPIFAB8 != null && catchingFishFABStripeAPIFAB8 != ((CatchingFishFABHandlerAdMob) this.CatchingFishWorkManager); catchingFishFABStripeAPIFAB8 = catchingFishFABStripeAPIFAB8.CatchingFishViewModelFAB) {
            i65 |= catchingFishFABStripeAPIFAB8.CatchingFishWorkManager;
            catchingFishFABStripeAPIFAB8.CatchingFishViewModelScope = i65;
        }
    }

    public void CatchingFishDaggerWebsocket() {
        Set set = (Set) this.CatchingFishDaggerWebsocket;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                CatchingFishManifestToast catchingFishManifestToast = (CatchingFishManifestToast) it.next();
                it.remove();
                catchingFishManifestToast.CatchingFishWorkManager();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void CatchingFishFragmentHandler() {
        for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = (CatchingFishFABStripeAPIFAB) this.CatchingFishFragmentHandler; catchingFishFABStripeAPIFAB != null; catchingFishFABStripeAPIFAB = catchingFishFABStripeAPIFAB.CatchingFishLayout) {
            catchingFishFABStripeAPIFAB.CatchingFishGsonAppCompat();
            if (catchingFishFABStripeAPIFAB.CatchingFishEspressoTesting) {
                CatchingFishJUnitService catchingFishJUnitService = CatchingFishJUnitJUnit.CatchingFishParcelableFAB;
                if (!catchingFishFABStripeAPIFAB.CatchingFishRoomDatabase) {
                    CatchingFishFluxGradle.CatchingFishSnackbar("autoInvalidateInsertedNode called on unattached node");
                }
                CatchingFishJUnitJUnit.CatchingFishParcelableFAB(catchingFishFABStripeAPIFAB, catchingFishFABStripeAPIFAB.CatchingFishWorkManager, 1);
            }
            if (catchingFishFABStripeAPIFAB.CatchingFishOkHttp) {
                CatchingFishJUnitJUnit.CatchingFishSnackbar(catchingFishFABStripeAPIFAB);
            }
            catchingFishFABStripeAPIFAB.CatchingFishEspressoTesting = false;
            catchingFishFABStripeAPIFAB.CatchingFishOkHttp = false;
        }
    }

    public void CatchingFishLayout(Set set, CatchingFishPayPalFirebase catchingFishPayPalFirebase) {
        CatchingFishSnackbar();
        this.CatchingFishDaggerWebsocket = set;
        this.CatchingFishWorkManager = catchingFishPayPalFirebase;
    }

    public void CatchingFishSnackbar() {
        this.CatchingFishDaggerWebsocket = null;
        this.CatchingFishWorkManager = null;
        CatchingFishFABToast catchingFishFABToast = this.CatchingFishSnackbar;
        catchingFishFABToast.CatchingFishViewModelScope();
        ((CatchingFishServiceBundle) this.CatchingFishViewModelScope).CatchingFishSnackbar();
        this.CatchingFishCoroutine = catchingFishFABToast;
        this.CatchingFishReduxKtor.CatchingFishViewModelScope();
        ((CatchingFishFABToast) this.CatchingFishViewModelFAB).CatchingFishViewModelScope();
        this.CatchingFishLayout = null;
        this.CatchingFishFragmentHandler = null;
        this.CatchingFishCloudMessaging = null;
    }

    public boolean CatchingFishViewModelFAB(int i) {
        return (i & ((CatchingFishFABStripeAPIFAB) this.CatchingFishFragmentHandler).CatchingFishViewModelScope) != 0;
    }

    public void CatchingFishViewModelScope(CatchingFishContextJUnit catchingFishContextJUnit) {
        CatchingFishFABToast catchingFishFABToast = this.CatchingFishSnackbar;
        CatchingFishServiceBundle catchingFishServiceBundle = (CatchingFishServiceBundle) this.CatchingFishViewModelScope;
        if (catchingFishServiceBundle.CatchingFishCoroutine(catchingFishContextJUnit)) {
            catchingFishServiceBundle.CatchingFishCloudMessaging(catchingFishContextJUnit);
            if (!this.CatchingFishCoroutine.CatchingFishLayout(catchingFishContextJUnit) && !catchingFishFABToast.CatchingFishLayout(catchingFishContextJUnit)) {
                Object[] objArr = catchingFishFABToast.CatchingFishReduxKtor;
                int i = catchingFishFABToast.CatchingFishWorkManager;
                for (int i2 = 0; i2 < i; i2++) {
                    CatchingFishManifestToast catchingFishManifestToast = ((CatchingFishContextJUnit) objArr[i2]).CatchingFishParcelableFAB;
                    if (catchingFishManifestToast instanceof CatchingFishFragmentContext) {
                        ((CatchingFishFragmentContext) catchingFishManifestToast).getClass();
                        throw null;
                    }
                }
            }
            Set set = (Set) this.CatchingFishDaggerWebsocket;
            if (set == null) {
                return;
            } else {
                set.add(catchingFishContextJUnit.CatchingFishParcelableFAB);
            }
        }
        this.CatchingFishReduxKtor.CatchingFishSnackbar(catchingFishContextJUnit);
    }

    public void CatchingFishWorkManager() {
        CatchingFishFABToast catchingFishFABToast = this.CatchingFishSnackbar;
        Set set = (Set) this.CatchingFishDaggerWebsocket;
        if (set == null) {
            return;
        }
        CatchingFishFABToast catchingFishFABToast2 = this.CatchingFishReduxKtor;
        if (catchingFishFABToast2.CatchingFishWorkManager != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                CatchingFishServiceBundle catchingFishServiceBundle = (CatchingFishServiceBundle) this.CatchingFishLayout;
                int i = catchingFishFABToast2.CatchingFishWorkManager;
                while (true) {
                    i--;
                    if (-1 >= i) {
                        break;
                    }
                    Object obj = catchingFishFABToast2.CatchingFishReduxKtor[i];
                    try {
                        if (obj instanceof CatchingFishContextJUnit) {
                            CatchingFishManifestToast catchingFishManifestToast = ((CatchingFishContextJUnit) obj).CatchingFishParcelableFAB;
                            set.remove(catchingFishManifestToast);
                            catchingFishManifestToast.CatchingFishViewModelScope();
                        }
                        if (obj instanceof CatchingFishRealmWebSocket) {
                            if (catchingFishServiceBundle == null || !catchingFishServiceBundle.CatchingFishCoroutine(obj)) {
                                ((CatchingFishRealmWebSocket) obj).CatchingFishDaggerWebsocket();
                            } else {
                                ((CatchingFishRealmWebSocket) obj).CatchingFishReduxKtor();
                            }
                        }
                    } catch (Throwable th) {
                        CatchingFishPayPalFirebase catchingFishPayPalFirebase = (CatchingFishPayPalFirebase) this.CatchingFishWorkManager;
                        if (catchingFishPayPalFirebase != null) {
                            CatchingFishFirebaseDagger.CatchingFishAnimation(th, new CatchingFishGraphQLFirebase(0, catchingFishPayPalFirebase, obj));
                        }
                        throw th;
                    }
                }
            } finally {
                Trace.endSection();
            }
        }
        if (catchingFishFABToast.CatchingFishWorkManager != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.CatchingFishDaggerWebsocket;
                if (set2 != null) {
                    Object[] objArr = catchingFishFABToast.CatchingFishReduxKtor;
                    int i2 = catchingFishFABToast.CatchingFishWorkManager;
                    for (int i3 = 0; i3 < i2; i3++) {
                        CatchingFishContextJUnit catchingFishContextJUnit = (CatchingFishContextJUnit) objArr[i3];
                        CatchingFishManifestToast catchingFishManifestToast2 = catchingFishContextJUnit.CatchingFishParcelableFAB;
                        set2.remove(catchingFishManifestToast2);
                        try {
                            catchingFishManifestToast2.CatchingFishParcelableFAB();
                        } catch (Throwable th2) {
                            CatchingFishPayPalFirebase catchingFishPayPalFirebase2 = (CatchingFishPayPalFirebase) this.CatchingFishWorkManager;
                            if (catchingFishPayPalFirebase2 != null) {
                                CatchingFishFirebaseDagger.CatchingFishAnimation(th2, new CatchingFishGraphQLFirebase(0, catchingFishPayPalFirebase2, catchingFishContextJUnit));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public String toString() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                StringBuilder sb = new StringBuilder("[");
                CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = (CatchingFishFABStripeAPIFAB) this.CatchingFishFragmentHandler;
                CatchingFishNavigationToast catchingFishNavigationToast = (CatchingFishNavigationToast) this.CatchingFishLayout;
                if (catchingFishFABStripeAPIFAB == catchingFishNavigationToast) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (catchingFishFABStripeAPIFAB != null && catchingFishFABStripeAPIFAB != catchingFishNavigationToast) {
                            sb.append(String.valueOf(catchingFishFABStripeAPIFAB));
                            if (catchingFishFABStripeAPIFAB.CatchingFishLayout == catchingFishNavigationToast) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                catchingFishFABStripeAPIFAB = catchingFishFABStripeAPIFAB.CatchingFishLayout;
                            }
                        }
                    }
                }
                String sb2 = sb.toString();
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(sb2, "toString(...)");
                return sb2;
            default:
                return super.toString();
        }
    }

    public CatchingFishExoPlayerBundle() {
        CatchingFishFABToast catchingFishFABToast = new CatchingFishFABToast(new CatchingFishContextJUnit[16]);
        this.CatchingFishSnackbar = catchingFishFABToast;
        int i = CatchingFishHiltCameraX.CatchingFishParcelableFAB;
        this.CatchingFishViewModelScope = new CatchingFishServiceBundle();
        this.CatchingFishCoroutine = catchingFishFABToast;
        this.CatchingFishReduxKtor = new CatchingFishFABToast(new Object[16]);
        this.CatchingFishViewModelFAB = new CatchingFishFABToast(new CatchingFishJUnitGlide[16]);
    }
}
