package kotlin.text;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class CatchingFishRealmGraphQL extends CatchingFishAdMobLiveData {
    public float CatchingFishCloudMessaging;
    public String CatchingFishCoroutine;
    public final CatchingFishFluxFragment CatchingFishDaggerWebsocket;
    public float CatchingFishEspressoTesting;
    public long CatchingFishFragmentHandler;
    public final CatchingFishAsyncTaskIntent CatchingFishLayout;
    public final CatchingFishDataStoreRoom CatchingFishOkHttp;
    public boolean CatchingFishReduxKtor;
    public final CatchingFishGlideRoom CatchingFishSnackbar;
    public CatchingFishFluxIntent CatchingFishViewModelFAB;
    public final CatchingFishAsyncTaskIntent CatchingFishViewModelScope;
    public CatchingFishViewWebsocket CatchingFishWorkManager;

    public CatchingFishRealmGraphQL(CatchingFishGlideRoom catchingFishGlideRoom) {
        this.CatchingFishSnackbar = catchingFishGlideRoom;
        catchingFishGlideRoom.CatchingFishLayout = new CatchingFishDataStoreRoom(this, 0);
        this.CatchingFishCoroutine = "";
        this.CatchingFishReduxKtor = true;
        this.CatchingFishDaggerWebsocket = new CatchingFishFluxFragment();
        this.CatchingFishWorkManager = CatchingFishLayoutAnimation.CatchingFishSpannableWidget;
        this.CatchingFishViewModelScope = CatchingFishLayoutRoom.CatchingFishGsonAppCompat(null);
        this.CatchingFishLayout = CatchingFishLayoutRoom.CatchingFishGsonAppCompat(new CatchingFishMVPCameraX(0L));
        this.CatchingFishFragmentHandler = 9205357640488583168L;
        this.CatchingFishCloudMessaging = 1.0f;
        this.CatchingFishEspressoTesting = 1.0f;
        this.CatchingFishOkHttp = new CatchingFishDataStoreRoom(this, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0074, code lost:
    
        if (r9 == r13) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0134, code lost:
    
        if (r11.CatchingFishReduxKtor == r3) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishDaggerWebsocket(CatchingFishPicassoManifest catchingFishPicassoManifest, float f, CatchingFishFluxIntent catchingFishFluxIntent) {
        int i;
        boolean z;
        CatchingFishFluxFragment catchingFishFluxFragment;
        CatchingFishFluxIntent catchingFishFluxIntent2;
        CatchingFishWidgetWebSocket catchingFishWidgetWebSocket;
        char c;
        CatchingFishGradleMVPKtor catchingFishGradleMVPKtor;
        Bitmap createBitmap;
        CatchingFishPicassoManifest catchingFishPicassoManifest2;
        CatchingFishFluxIntent catchingFishFluxIntent3;
        CatchingFishWidgetWebSocket catchingFishWidgetWebSocket2;
        CatchingFishWidgetWebSocket catchingFishWidgetWebSocket3;
        Bitmap.Config config;
        Bitmap.Config config2;
        int i2;
        int i3;
        CatchingFishGlideRoom catchingFishGlideRoom = this.CatchingFishSnackbar;
        boolean z2 = catchingFishGlideRoom.CatchingFishReduxKtor;
        int i4 = 3;
        CatchingFishAsyncTaskIntent catchingFishAsyncTaskIntent = this.CatchingFishViewModelScope;
        if (z2 && catchingFishGlideRoom.CatchingFishDaggerWebsocket != 16) {
            CatchingFishFluxIntent catchingFishFluxIntent4 = (CatchingFishFluxIntent) catchingFishAsyncTaskIntent.getValue();
            int i5 = CatchingFishFragmentToast.CatchingFishParcelableFAB;
            if (catchingFishFluxIntent4 == null ? catchingFishFluxIntent4 == null : !((i3 = catchingFishFluxIntent4.CatchingFishCoroutine) != 5 && i3 != 3)) {
                if (catchingFishFluxIntent == null ? catchingFishFluxIntent == null : !((i2 = catchingFishFluxIntent.CatchingFishCoroutine) != 5 && i2 != 3)) {
                    i = 1;
                    z = this.CatchingFishReduxKtor;
                    catchingFishFluxFragment = this.CatchingFishDaggerWebsocket;
                    if (!z && CatchingFishMVPCameraX.CatchingFishParcelableFAB(this.CatchingFishFragmentHandler, catchingFishPicassoManifest.CatchingFishNavigation())) {
                        catchingFishWidgetWebSocket3 = catchingFishFluxFragment.CatchingFishParcelableFAB;
                        if (catchingFishWidgetWebSocket3 != null) {
                            Bitmap.Config config3 = catchingFishWidgetWebSocket3.CatchingFishParcelableFAB.getConfig();
                            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(config3);
                            if (config3 == Bitmap.Config.ALPHA_8) {
                                i4 = 1;
                            } else if (config3 == Bitmap.Config.RGB_565) {
                                i4 = 2;
                            } else if (config3 != Bitmap.Config.ARGB_4444) {
                                int i6 = Build.VERSION.SDK_INT;
                                if (i6 >= 26) {
                                    config2 = Bitmap.Config.RGBA_F16;
                                }
                                if (i6 >= 26) {
                                    config = Bitmap.Config.HARDWARE;
                                    if (config3 == config) {
                                        i4 = 4;
                                    }
                                }
                            }
                            if (i == i4) {
                                catchingFishPicassoManifest2 = catchingFishPicassoManifest;
                                if (catchingFishFluxIntent == null) {
                                    catchingFishFluxIntent3 = catchingFishFluxIntent;
                                } else {
                                    catchingFishFluxIntent3 = ((CatchingFishFluxIntent) catchingFishAsyncTaskIntent.getValue()) != null ? (CatchingFishFluxIntent) catchingFishAsyncTaskIntent.getValue() : this.CatchingFishViewModelFAB;
                                }
                                catchingFishWidgetWebSocket2 = catchingFishFluxFragment.CatchingFishParcelableFAB;
                                if (catchingFishWidgetWebSocket2 == null) {
                                    CatchingFishFluxGradle.CatchingFishSnackbar("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                                }
                                CatchingFishPicassoManifest.CatchingFish(catchingFishPicassoManifest2, catchingFishWidgetWebSocket2, catchingFishFluxFragment.CatchingFishCoroutine, 0L, f, catchingFishFluxIntent3, 0, 858);
                            }
                        }
                        i4 = 0;
                        if (i == i4) {
                        }
                    }
                    if (i != 1) {
                        long j = catchingFishGlideRoom.CatchingFishDaggerWebsocket;
                        int i7 = CatchingFishFragmentToast.CatchingFishParcelableFAB;
                        if (CatchingFishToastFragment.CatchingFishReduxKtor(j) != 1.0f) {
                            j = CatchingFishToastFragment.CatchingFishSnackbar(j, 1.0f);
                        }
                        catchingFishFluxIntent2 = new CatchingFishFluxIntent(5, j);
                    } else {
                        catchingFishFluxIntent2 = null;
                    }
                    this.CatchingFishViewModelFAB = catchingFishFluxIntent2;
                    float intBitsToFloat = Float.intBitsToFloat((int) (catchingFishPicassoManifest.CatchingFishNavigation() >> 32));
                    CatchingFishAsyncTaskIntent catchingFishAsyncTaskIntent2 = this.CatchingFishLayout;
                    this.CatchingFishCloudMessaging = intBitsToFloat / Float.intBitsToFloat((int) (((CatchingFishMVPCameraX) catchingFishAsyncTaskIntent2.getValue()).CatchingFishParcelableFAB >> 32));
                    this.CatchingFishEspressoTesting = Float.intBitsToFloat((int) (catchingFishPicassoManifest.CatchingFishNavigation() & 4294967295L)) / Float.intBitsToFloat((int) (((CatchingFishMVPCameraX) catchingFishAsyncTaskIntent2.getValue()).CatchingFishParcelableFAB & 4294967295L));
                    long ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (catchingFishPicassoManifest.CatchingFishNavigation() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (catchingFishPicassoManifest.CatchingFishNavigation() & 4294967295L)))) & 4294967295L);
                    CatchingFishGradleMVPKtor layoutDirection = catchingFishPicassoManifest.getLayoutDirection();
                    catchingFishWidgetWebSocket = catchingFishFluxFragment.CatchingFishParcelableFAB;
                    CatchingFishRoom catchingFishRoom = catchingFishFluxFragment.CatchingFishSnackbar;
                    if (catchingFishWidgetWebSocket != null || catchingFishRoom == null) {
                        c = ' ';
                    } else {
                        int i8 = (int) (ceil >> 32);
                        Bitmap bitmap = catchingFishWidgetWebSocket.CatchingFishParcelableFAB;
                        c = ' ';
                        if (i8 <= bitmap.getWidth()) {
                            catchingFishGradleMVPKtor = layoutDirection;
                            if (((int) (ceil & 4294967295L)) <= bitmap.getHeight()) {
                            }
                            int i9 = (int) (ceil >> c);
                            int i10 = (int) (ceil & 4294967295L);
                            CatchingFishMVIFragment catchingFishMVIFragment = CatchingFishSnackbarGlide.CatchingFishDaggerWebsocket;
                            Bitmap.Config CatchingFishAppCompat = CatchingFishRobolectricHilt.CatchingFishAppCompat(i);
                            if (Build.VERSION.SDK_INT >= 26) {
                                createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i9, i10, CatchingFishRobolectricHilt.CatchingFishAppCompat(i), true, CatchingFishJUnitMVVM.CatchingFishParcelableFAB(catchingFishMVIFragment));
                            } else {
                                createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i9, i10, CatchingFishAppCompat);
                                createBitmap.setHasAlpha(true);
                            }
                            catchingFishWidgetWebSocket = new CatchingFishWidgetWebSocket(createBitmap);
                            Canvas canvas = CatchingFishLayout.CatchingFishParcelableFAB;
                            catchingFishRoom = new CatchingFishRoom();
                            catchingFishRoom.CatchingFishParcelableFAB = new Canvas(createBitmap);
                            catchingFishFluxFragment.CatchingFishParcelableFAB = catchingFishWidgetWebSocket;
                            catchingFishFluxFragment.CatchingFishSnackbar = catchingFishRoom;
                            catchingFishFluxFragment.CatchingFishReduxKtor = i;
                            catchingFishFluxFragment.CatchingFishCoroutine = ceil;
                            CatchingFishEspressoMoshi catchingFishEspressoMoshi = catchingFishFluxFragment.CatchingFishDaggerWebsocket;
                            long CatchingFishCameraXIntent = CatchingFishXMLLayoutGlide.CatchingFishCameraXIntent(ceil);
                            CatchingFishJUnitDataStore catchingFishJUnitDataStore = catchingFishEspressoMoshi.CatchingFishReduxKtor;
                            CatchingFishOkHttpFlux catchingFishOkHttpFlux = catchingFishJUnitDataStore.CatchingFishParcelableFAB;
                            CatchingFishGradleMVPKtor catchingFishGradleMVPKtor2 = catchingFishJUnitDataStore.CatchingFishSnackbar;
                            CatchingFishOkHttpHandler catchingFishOkHttpHandler = catchingFishJUnitDataStore.CatchingFishCoroutine;
                            long j2 = catchingFishJUnitDataStore.CatchingFishReduxKtor;
                            catchingFishPicassoManifest2 = catchingFishPicassoManifest;
                            catchingFishJUnitDataStore.CatchingFishParcelableFAB = catchingFishPicassoManifest2;
                            catchingFishJUnitDataStore.CatchingFishSnackbar = catchingFishGradleMVPKtor;
                            catchingFishJUnitDataStore.CatchingFishCoroutine = catchingFishRoom;
                            catchingFishJUnitDataStore.CatchingFishReduxKtor = CatchingFishCameraXIntent;
                            catchingFishRoom.CatchingFishCloudMessaging();
                            CatchingFishPicassoManifest.CatchingFishViewModelScope(catchingFishEspressoMoshi, CatchingFishToastFragment.CatchingFishSnackbar, 0L, 0L, 62);
                            this.CatchingFishOkHttp.CatchingFishFragmentHandler(catchingFishEspressoMoshi);
                            catchingFishRoom.CatchingFishLayout();
                            CatchingFishJUnitDataStore catchingFishJUnitDataStore2 = catchingFishEspressoMoshi.CatchingFishReduxKtor;
                            catchingFishJUnitDataStore2.CatchingFishParcelableFAB = catchingFishOkHttpFlux;
                            catchingFishJUnitDataStore2.CatchingFishSnackbar = catchingFishGradleMVPKtor2;
                            catchingFishJUnitDataStore2.CatchingFishCoroutine = catchingFishOkHttpHandler;
                            catchingFishJUnitDataStore2.CatchingFishReduxKtor = j2;
                            catchingFishWidgetWebSocket.CatchingFishParcelableFAB.prepareToDraw();
                            this.CatchingFishReduxKtor = false;
                            this.CatchingFishFragmentHandler = catchingFishPicassoManifest2.CatchingFishNavigation();
                            if (catchingFishFluxIntent == null) {
                            }
                            catchingFishWidgetWebSocket2 = catchingFishFluxFragment.CatchingFishParcelableFAB;
                            if (catchingFishWidgetWebSocket2 == null) {
                            }
                            CatchingFishPicassoManifest.CatchingFish(catchingFishPicassoManifest2, catchingFishWidgetWebSocket2, catchingFishFluxFragment.CatchingFishCoroutine, 0L, f, catchingFishFluxIntent3, 0, 858);
                        }
                    }
                    catchingFishGradleMVPKtor = layoutDirection;
                    int i92 = (int) (ceil >> c);
                    int i102 = (int) (ceil & 4294967295L);
                    CatchingFishMVIFragment catchingFishMVIFragment2 = CatchingFishSnackbarGlide.CatchingFishDaggerWebsocket;
                    Bitmap.Config CatchingFishAppCompat2 = CatchingFishRobolectricHilt.CatchingFishAppCompat(i);
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    catchingFishWidgetWebSocket = new CatchingFishWidgetWebSocket(createBitmap);
                    Canvas canvas2 = CatchingFishLayout.CatchingFishParcelableFAB;
                    catchingFishRoom = new CatchingFishRoom();
                    catchingFishRoom.CatchingFishParcelableFAB = new Canvas(createBitmap);
                    catchingFishFluxFragment.CatchingFishParcelableFAB = catchingFishWidgetWebSocket;
                    catchingFishFluxFragment.CatchingFishSnackbar = catchingFishRoom;
                    catchingFishFluxFragment.CatchingFishReduxKtor = i;
                    catchingFishFluxFragment.CatchingFishCoroutine = ceil;
                    CatchingFishEspressoMoshi catchingFishEspressoMoshi2 = catchingFishFluxFragment.CatchingFishDaggerWebsocket;
                    long CatchingFishCameraXIntent2 = CatchingFishXMLLayoutGlide.CatchingFishCameraXIntent(ceil);
                    CatchingFishJUnitDataStore catchingFishJUnitDataStore3 = catchingFishEspressoMoshi2.CatchingFishReduxKtor;
                    CatchingFishOkHttpFlux catchingFishOkHttpFlux2 = catchingFishJUnitDataStore3.CatchingFishParcelableFAB;
                    CatchingFishGradleMVPKtor catchingFishGradleMVPKtor22 = catchingFishJUnitDataStore3.CatchingFishSnackbar;
                    CatchingFishOkHttpHandler catchingFishOkHttpHandler2 = catchingFishJUnitDataStore3.CatchingFishCoroutine;
                    long j22 = catchingFishJUnitDataStore3.CatchingFishReduxKtor;
                    catchingFishPicassoManifest2 = catchingFishPicassoManifest;
                    catchingFishJUnitDataStore3.CatchingFishParcelableFAB = catchingFishPicassoManifest2;
                    catchingFishJUnitDataStore3.CatchingFishSnackbar = catchingFishGradleMVPKtor;
                    catchingFishJUnitDataStore3.CatchingFishCoroutine = catchingFishRoom;
                    catchingFishJUnitDataStore3.CatchingFishReduxKtor = CatchingFishCameraXIntent2;
                    catchingFishRoom.CatchingFishCloudMessaging();
                    CatchingFishPicassoManifest.CatchingFishViewModelScope(catchingFishEspressoMoshi2, CatchingFishToastFragment.CatchingFishSnackbar, 0L, 0L, 62);
                    this.CatchingFishOkHttp.CatchingFishFragmentHandler(catchingFishEspressoMoshi2);
                    catchingFishRoom.CatchingFishLayout();
                    CatchingFishJUnitDataStore catchingFishJUnitDataStore22 = catchingFishEspressoMoshi2.CatchingFishReduxKtor;
                    catchingFishJUnitDataStore22.CatchingFishParcelableFAB = catchingFishOkHttpFlux2;
                    catchingFishJUnitDataStore22.CatchingFishSnackbar = catchingFishGradleMVPKtor22;
                    catchingFishJUnitDataStore22.CatchingFishCoroutine = catchingFishOkHttpHandler2;
                    catchingFishJUnitDataStore22.CatchingFishReduxKtor = j22;
                    catchingFishWidgetWebSocket.CatchingFishParcelableFAB.prepareToDraw();
                    this.CatchingFishReduxKtor = false;
                    this.CatchingFishFragmentHandler = catchingFishPicassoManifest2.CatchingFishNavigation();
                    if (catchingFishFluxIntent == null) {
                    }
                    catchingFishWidgetWebSocket2 = catchingFishFluxFragment.CatchingFishParcelableFAB;
                    if (catchingFishWidgetWebSocket2 == null) {
                    }
                    CatchingFishPicassoManifest.CatchingFish(catchingFishPicassoManifest2, catchingFishWidgetWebSocket2, catchingFishFluxFragment.CatchingFishCoroutine, 0L, f, catchingFishFluxIntent3, 0, 858);
                }
            }
        }
        i = 0;
        z = this.CatchingFishReduxKtor;
        catchingFishFluxFragment = this.CatchingFishDaggerWebsocket;
        if (!z) {
            catchingFishWidgetWebSocket3 = catchingFishFluxFragment.CatchingFishParcelableFAB;
            if (catchingFishWidgetWebSocket3 != null) {
            }
            i4 = 0;
            if (i == i4) {
            }
        }
        if (i != 1) {
        }
        this.CatchingFishViewModelFAB = catchingFishFluxIntent2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (catchingFishPicassoManifest.CatchingFishNavigation() >> 32));
        CatchingFishAsyncTaskIntent catchingFishAsyncTaskIntent22 = this.CatchingFishLayout;
        this.CatchingFishCloudMessaging = intBitsToFloat2 / Float.intBitsToFloat((int) (((CatchingFishMVPCameraX) catchingFishAsyncTaskIntent22.getValue()).CatchingFishParcelableFAB >> 32));
        this.CatchingFishEspressoTesting = Float.intBitsToFloat((int) (catchingFishPicassoManifest.CatchingFishNavigation() & 4294967295L)) / Float.intBitsToFloat((int) (((CatchingFishMVPCameraX) catchingFishAsyncTaskIntent22.getValue()).CatchingFishParcelableFAB & 4294967295L));
        long ceil2 = (((int) Math.ceil(Float.intBitsToFloat((int) (catchingFishPicassoManifest.CatchingFishNavigation() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (catchingFishPicassoManifest.CatchingFishNavigation() & 4294967295L)))) & 4294967295L);
        CatchingFishGradleMVPKtor layoutDirection2 = catchingFishPicassoManifest.getLayoutDirection();
        catchingFishWidgetWebSocket = catchingFishFluxFragment.CatchingFishParcelableFAB;
        CatchingFishRoom catchingFishRoom2 = catchingFishFluxFragment.CatchingFishSnackbar;
        if (catchingFishWidgetWebSocket != null) {
        }
        c = ' ';
        catchingFishGradleMVPKtor = layoutDirection2;
        int i922 = (int) (ceil2 >> c);
        int i1022 = (int) (ceil2 & 4294967295L);
        CatchingFishMVIFragment catchingFishMVIFragment22 = CatchingFishSnackbarGlide.CatchingFishDaggerWebsocket;
        Bitmap.Config CatchingFishAppCompat22 = CatchingFishRobolectricHilt.CatchingFishAppCompat(i);
        if (Build.VERSION.SDK_INT >= 26) {
        }
        catchingFishWidgetWebSocket = new CatchingFishWidgetWebSocket(createBitmap);
        Canvas canvas22 = CatchingFishLayout.CatchingFishParcelableFAB;
        catchingFishRoom2 = new CatchingFishRoom();
        catchingFishRoom2.CatchingFishParcelableFAB = new Canvas(createBitmap);
        catchingFishFluxFragment.CatchingFishParcelableFAB = catchingFishWidgetWebSocket;
        catchingFishFluxFragment.CatchingFishSnackbar = catchingFishRoom2;
        catchingFishFluxFragment.CatchingFishReduxKtor = i;
        catchingFishFluxFragment.CatchingFishCoroutine = ceil2;
        CatchingFishEspressoMoshi catchingFishEspressoMoshi22 = catchingFishFluxFragment.CatchingFishDaggerWebsocket;
        long CatchingFishCameraXIntent22 = CatchingFishXMLLayoutGlide.CatchingFishCameraXIntent(ceil2);
        CatchingFishJUnitDataStore catchingFishJUnitDataStore32 = catchingFishEspressoMoshi22.CatchingFishReduxKtor;
        CatchingFishOkHttpFlux catchingFishOkHttpFlux22 = catchingFishJUnitDataStore32.CatchingFishParcelableFAB;
        CatchingFishGradleMVPKtor catchingFishGradleMVPKtor222 = catchingFishJUnitDataStore32.CatchingFishSnackbar;
        CatchingFishOkHttpHandler catchingFishOkHttpHandler22 = catchingFishJUnitDataStore32.CatchingFishCoroutine;
        long j222 = catchingFishJUnitDataStore32.CatchingFishReduxKtor;
        catchingFishPicassoManifest2 = catchingFishPicassoManifest;
        catchingFishJUnitDataStore32.CatchingFishParcelableFAB = catchingFishPicassoManifest2;
        catchingFishJUnitDataStore32.CatchingFishSnackbar = catchingFishGradleMVPKtor;
        catchingFishJUnitDataStore32.CatchingFishCoroutine = catchingFishRoom2;
        catchingFishJUnitDataStore32.CatchingFishReduxKtor = CatchingFishCameraXIntent22;
        catchingFishRoom2.CatchingFishCloudMessaging();
        CatchingFishPicassoManifest.CatchingFishViewModelScope(catchingFishEspressoMoshi22, CatchingFishToastFragment.CatchingFishSnackbar, 0L, 0L, 62);
        this.CatchingFishOkHttp.CatchingFishFragmentHandler(catchingFishEspressoMoshi22);
        catchingFishRoom2.CatchingFishLayout();
        CatchingFishJUnitDataStore catchingFishJUnitDataStore222 = catchingFishEspressoMoshi22.CatchingFishReduxKtor;
        catchingFishJUnitDataStore222.CatchingFishParcelableFAB = catchingFishOkHttpFlux22;
        catchingFishJUnitDataStore222.CatchingFishSnackbar = catchingFishGradleMVPKtor222;
        catchingFishJUnitDataStore222.CatchingFishCoroutine = catchingFishOkHttpHandler22;
        catchingFishJUnitDataStore222.CatchingFishReduxKtor = j222;
        catchingFishWidgetWebSocket.CatchingFishParcelableFAB.prepareToDraw();
        this.CatchingFishReduxKtor = false;
        this.CatchingFishFragmentHandler = catchingFishPicassoManifest2.CatchingFishNavigation();
        if (catchingFishFluxIntent == null) {
        }
        catchingFishWidgetWebSocket2 = catchingFishFluxFragment.CatchingFishParcelableFAB;
        if (catchingFishWidgetWebSocket2 == null) {
        }
        CatchingFishPicassoManifest.CatchingFish(catchingFishPicassoManifest2, catchingFishWidgetWebSocket2, catchingFishFluxFragment.CatchingFishCoroutine, 0L, f, catchingFishFluxIntent3, 0, 858);
    }

    @Override // kotlin.text.CatchingFishAdMobLiveData
    public final void CatchingFishParcelableFAB(CatchingFishPicassoManifest catchingFishPicassoManifest) {
        CatchingFishDaggerWebsocket(catchingFishPicassoManifest, 1.0f, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.CatchingFishCoroutine);
        sb.append("\n\tviewportWidth: ");
        CatchingFishAsyncTaskIntent catchingFishAsyncTaskIntent = this.CatchingFishLayout;
        sb.append(Float.intBitsToFloat((int) (((CatchingFishMVPCameraX) catchingFishAsyncTaskIntent.getValue()).CatchingFishParcelableFAB >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((CatchingFishMVPCameraX) catchingFishAsyncTaskIntent.getValue()).CatchingFishParcelableFAB & 4294967295L)));
        sb.append("\n");
        String sb2 = sb.toString();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(sb2, "toString(...)");
        return sb2;
    }
}
