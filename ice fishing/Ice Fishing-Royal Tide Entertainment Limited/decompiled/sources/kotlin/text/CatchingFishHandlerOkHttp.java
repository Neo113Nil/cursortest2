package kotlin.text;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishHandlerOkHttp {
    public static boolean CatchingFishRoomDatabase = false;
    public final CatchingFishAsyncTaskDagger CatchingFishOkHttp;
    public final CatchingFishRoomServiceRoom CatchingFishReduxKtor;
    public CatchingFishLayoutExoPlayer CatchingFishStateLiveData;
    public int CatchingFishParcelableFAB = 1000;
    public boolean CatchingFishSnackbar = false;
    public int CatchingFishCoroutine = 0;
    public int CatchingFishDaggerWebsocket = 32;
    public int CatchingFishWorkManager = 32;
    public boolean CatchingFishViewModelFAB = false;
    public boolean[] CatchingFishLayout = new boolean[32];
    public int CatchingFishFragmentHandler = 1;
    public int CatchingFishCloudMessaging = 0;
    public int CatchingFishEspressoTesting = 32;
    public CatchingFishHandlerGson[] CatchingFishUnitTesting = new CatchingFishHandlerGson[1000];
    public int CatchingFishAnimationMockk = 0;
    public CatchingFishLayoutExoPlayer[] CatchingFishViewModelScope = new CatchingFishLayoutExoPlayer[32];

    public CatchingFishHandlerOkHttp() {
        CatchingFish();
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = new CatchingFishAsyncTaskDagger(4, false);
        catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket = new CatchingFishBundleAsyncTask();
        catchingFishAsyncTaskDagger.CatchingFishWorkManager = new CatchingFishBundleAsyncTask();
        catchingFishAsyncTaskDagger.CatchingFishViewModelScope = new CatchingFishHandlerGson[32];
        this.CatchingFishOkHttp = catchingFishAsyncTaskDagger;
        CatchingFishRoomServiceRoom catchingFishRoomServiceRoom = new CatchingFishRoomServiceRoom(catchingFishAsyncTaskDagger);
        catchingFishRoomServiceRoom.CatchingFishWorkManager = new CatchingFishHandlerGson[128];
        catchingFishRoomServiceRoom.CatchingFishViewModelScope = new CatchingFishHandlerGson[128];
        catchingFishRoomServiceRoom.CatchingFishViewModelFAB = 0;
        catchingFishRoomServiceRoom.CatchingFishLayout = new CatchingFishViewModelIntent(9, catchingFishRoomServiceRoom);
        this.CatchingFishReduxKtor = catchingFishRoomServiceRoom;
        this.CatchingFishStateLiveData = new CatchingFishLayoutExoPlayer(catchingFishAsyncTaskDagger);
    }

    public static int CatchingFishUnitTesting(Object obj) {
        CatchingFishHandlerGson catchingFishHandlerGson = ((CatchingFishStripeAPIJUnit) obj).CatchingFishLayout;
        if (catchingFishHandlerGson != null) {
            return (int) (catchingFishHandlerGson.CatchingFishViewModelFAB + 0.5f);
        }
        return 0;
    }

    public final void CatchingFish() {
        for (int i = 0; i < this.CatchingFishCloudMessaging; i++) {
            CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer = this.CatchingFishViewModelScope[i];
            if (catchingFishLayoutExoPlayer != null) {
                ((CatchingFishBundleAsyncTask) this.CatchingFishOkHttp.CatchingFishDaggerWebsocket).CatchingFishSnackbar(catchingFishLayoutExoPlayer);
            }
            this.CatchingFishViewModelScope[i] = null;
        }
    }

    public final void CatchingFishAnimationMockk() {
        int i = this.CatchingFishDaggerWebsocket * 2;
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishViewModelScope = (CatchingFishLayoutExoPlayer[]) Arrays.copyOf(this.CatchingFishViewModelScope, i);
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = this.CatchingFishOkHttp;
        catchingFishAsyncTaskDagger.CatchingFishViewModelScope = (CatchingFishHandlerGson[]) Arrays.copyOf((CatchingFishHandlerGson[]) catchingFishAsyncTaskDagger.CatchingFishViewModelScope, this.CatchingFishDaggerWebsocket);
        int i2 = this.CatchingFishDaggerWebsocket;
        this.CatchingFishLayout = new boolean[i2];
        this.CatchingFishWorkManager = i2;
        this.CatchingFishEspressoTesting = i2;
    }

    public final CatchingFishHandlerGson CatchingFishCloudMessaging(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.CatchingFishFragmentHandler + 1 >= this.CatchingFishWorkManager) {
            CatchingFishAnimationMockk();
        }
        if (!(obj instanceof CatchingFishStripeAPIJUnit)) {
            return null;
        }
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit = (CatchingFishStripeAPIJUnit) obj;
        CatchingFishHandlerGson catchingFishHandlerGson = catchingFishStripeAPIJUnit.CatchingFishLayout;
        if (catchingFishHandlerGson == null) {
            catchingFishStripeAPIJUnit.CatchingFishCloudMessaging();
            catchingFishHandlerGson = catchingFishStripeAPIJUnit.CatchingFishLayout;
        }
        int i = catchingFishHandlerGson.CatchingFishDaggerWebsocket;
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = this.CatchingFishOkHttp;
        if (i != -1 && i <= this.CatchingFishCoroutine && ((CatchingFishHandlerGson[]) catchingFishAsyncTaskDagger.CatchingFishViewModelScope)[i] != null) {
            return catchingFishHandlerGson;
        }
        if (i != -1) {
            catchingFishHandlerGson.CatchingFishCoroutine();
        }
        int i2 = this.CatchingFishCoroutine + 1;
        this.CatchingFishCoroutine = i2;
        this.CatchingFishFragmentHandler++;
        catchingFishHandlerGson.CatchingFishDaggerWebsocket = i2;
        catchingFishHandlerGson.CatchingFishAnimationMockk = 1;
        ((CatchingFishHandlerGson[]) catchingFishAsyncTaskDagger.CatchingFishViewModelScope)[i2] = catchingFishHandlerGson;
        return catchingFishHandlerGson;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
    
        if (r4.CatchingFishUnitTesting <= 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d6, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e0, code lost:
    
        if (r4.CatchingFishUnitTesting <= 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f5, code lost:
    
        if (r4.CatchingFishUnitTesting <= 1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f8, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0102, code lost:
    
        if (r4.CatchingFishUnitTesting <= 1) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishCoroutine(CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer) {
        boolean z;
        boolean z2;
        CatchingFishHandlerGson catchingFishHandlerGson;
        CatchingFishHandlerGson CatchingFishWorkManager;
        if (this.CatchingFishCloudMessaging + 1 >= this.CatchingFishEspressoTesting || this.CatchingFishFragmentHandler + 1 >= this.CatchingFishWorkManager) {
            CatchingFishAnimationMockk();
        }
        if (catchingFishLayoutExoPlayer.CatchingFishDaggerWebsocket) {
            z = false;
        } else {
            ArrayList arrayList = catchingFishLayoutExoPlayer.CatchingFishCoroutine;
            if (this.CatchingFishViewModelScope.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int CatchingFishReduxKtor = catchingFishLayoutExoPlayer.CatchingFishReduxKtor.CatchingFishReduxKtor();
                    for (int i = 0; i < CatchingFishReduxKtor; i++) {
                        CatchingFishHandlerGson CatchingFishDaggerWebsocket = catchingFishLayoutExoPlayer.CatchingFishReduxKtor.CatchingFishDaggerWebsocket(i);
                        if (CatchingFishDaggerWebsocket.CatchingFishWorkManager != -1 || CatchingFishDaggerWebsocket.CatchingFishLayout) {
                            arrayList.add(CatchingFishDaggerWebsocket);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            CatchingFishHandlerGson catchingFishHandlerGson2 = (CatchingFishHandlerGson) arrayList.get(i2);
                            if (catchingFishHandlerGson2.CatchingFishLayout) {
                                catchingFishLayoutExoPlayer.CatchingFishViewModelFAB(this, catchingFishHandlerGson2, true);
                            } else {
                                catchingFishLayoutExoPlayer.CatchingFishLayout(this, this.CatchingFishViewModelScope[catchingFishHandlerGson2.CatchingFishWorkManager], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (catchingFishLayoutExoPlayer.CatchingFishParcelableFAB != null && catchingFishLayoutExoPlayer.CatchingFishReduxKtor.CatchingFishReduxKtor() == 0) {
                    catchingFishLayoutExoPlayer.CatchingFishDaggerWebsocket = true;
                    this.CatchingFishSnackbar = true;
                }
            }
            if (catchingFishLayoutExoPlayer.CatchingFishDaggerWebsocket()) {
                return;
            }
            float f = catchingFishLayoutExoPlayer.CatchingFishSnackbar;
            float f2 = 0.0f;
            if (f < 0.0f) {
                catchingFishLayoutExoPlayer.CatchingFishSnackbar = f * (-1.0f);
                CatchingFishRealmManifest catchingFishRealmManifest = catchingFishLayoutExoPlayer.CatchingFishReduxKtor;
                int i3 = catchingFishRealmManifest.CatchingFishViewModelFAB;
                for (int i4 = 0; i3 != -1 && i4 < catchingFishRealmManifest.CatchingFishParcelableFAB; i4++) {
                    float[] fArr = catchingFishRealmManifest.CatchingFishViewModelScope;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = catchingFishRealmManifest.CatchingFishWorkManager[i3];
                }
            }
            int CatchingFishReduxKtor2 = catchingFishLayoutExoPlayer.CatchingFishReduxKtor.CatchingFishReduxKtor();
            float f3 = 0.0f;
            float f4 = 0.0f;
            CatchingFishHandlerGson catchingFishHandlerGson3 = null;
            CatchingFishHandlerGson catchingFishHandlerGson4 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < CatchingFishReduxKtor2) {
                float CatchingFishWorkManager2 = catchingFishLayoutExoPlayer.CatchingFishReduxKtor.CatchingFishWorkManager(i5);
                CatchingFishHandlerGson CatchingFishDaggerWebsocket2 = catchingFishLayoutExoPlayer.CatchingFishReduxKtor.CatchingFishDaggerWebsocket(i5);
                float f5 = f2;
                if (CatchingFishDaggerWebsocket2.CatchingFishAnimationMockk == 1) {
                    if (catchingFishHandlerGson3 != null) {
                        if (f3 <= CatchingFishWorkManager2) {
                            if (!z4) {
                                if (CatchingFishDaggerWebsocket2.CatchingFishUnitTesting > 1) {
                                }
                            }
                        }
                        z4 = true;
                    }
                    catchingFishHandlerGson3 = CatchingFishDaggerWebsocket2;
                    f3 = CatchingFishWorkManager2;
                } else if (catchingFishHandlerGson3 == null && CatchingFishWorkManager2 < f5) {
                    if (catchingFishHandlerGson4 != null) {
                        if (f4 <= CatchingFishWorkManager2) {
                            if (!z5) {
                                if (CatchingFishDaggerWebsocket2.CatchingFishUnitTesting > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    catchingFishHandlerGson4 = CatchingFishDaggerWebsocket2;
                    f4 = CatchingFishWorkManager2;
                }
                i5++;
                f2 = f5;
            }
            float f6 = f2;
            if (catchingFishHandlerGson3 == null) {
                catchingFishHandlerGson3 = catchingFishHandlerGson4;
            }
            if (catchingFishHandlerGson3 == null) {
                z2 = true;
            } else {
                catchingFishLayoutExoPlayer.CatchingFishViewModelScope(catchingFishHandlerGson3);
                z2 = false;
            }
            if (catchingFishLayoutExoPlayer.CatchingFishReduxKtor.CatchingFishReduxKtor() == 0) {
                catchingFishLayoutExoPlayer.CatchingFishDaggerWebsocket = true;
            }
            if (z2) {
                if (this.CatchingFishFragmentHandler + 1 >= this.CatchingFishWorkManager) {
                    CatchingFishAnimationMockk();
                }
                CatchingFishHandlerGson CatchingFishParcelableFAB = CatchingFishParcelableFAB(3);
                int i6 = this.CatchingFishCoroutine + 1;
                this.CatchingFishCoroutine = i6;
                this.CatchingFishFragmentHandler++;
                CatchingFishParcelableFAB.CatchingFishDaggerWebsocket = i6;
                CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = this.CatchingFishOkHttp;
                ((CatchingFishHandlerGson[]) catchingFishAsyncTaskDagger.CatchingFishViewModelScope)[i6] = CatchingFishParcelableFAB;
                catchingFishLayoutExoPlayer.CatchingFishParcelableFAB = CatchingFishParcelableFAB;
                int i7 = this.CatchingFishCloudMessaging;
                CatchingFishViewModelFAB(catchingFishLayoutExoPlayer);
                if (this.CatchingFishCloudMessaging == i7 + 1) {
                    CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer2 = this.CatchingFishStateLiveData;
                    catchingFishLayoutExoPlayer2.CatchingFishParcelableFAB = null;
                    catchingFishLayoutExoPlayer2.CatchingFishReduxKtor.CatchingFishSnackbar();
                    for (int i8 = 0; i8 < catchingFishLayoutExoPlayer.CatchingFishReduxKtor.CatchingFishReduxKtor(); i8++) {
                        catchingFishLayoutExoPlayer2.CatchingFishReduxKtor.CatchingFishParcelableFAB(catchingFishLayoutExoPlayer.CatchingFishReduxKtor.CatchingFishDaggerWebsocket(i8), catchingFishLayoutExoPlayer.CatchingFishReduxKtor.CatchingFishWorkManager(i8), true);
                    }
                    CatchingFishNavigation(this.CatchingFishStateLiveData);
                    if (CatchingFishParcelableFAB.CatchingFishWorkManager == -1) {
                        if (catchingFishLayoutExoPlayer.CatchingFishParcelableFAB == CatchingFishParcelableFAB && (CatchingFishWorkManager = catchingFishLayoutExoPlayer.CatchingFishWorkManager(null, CatchingFishParcelableFAB)) != null) {
                            catchingFishLayoutExoPlayer.CatchingFishViewModelScope(CatchingFishWorkManager);
                        }
                        if (!catchingFishLayoutExoPlayer.CatchingFishDaggerWebsocket) {
                            catchingFishLayoutExoPlayer.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket(this, catchingFishLayoutExoPlayer);
                        }
                        ((CatchingFishBundleAsyncTask) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket).CatchingFishSnackbar(catchingFishLayoutExoPlayer);
                        this.CatchingFishCloudMessaging--;
                    }
                    z = true;
                    catchingFishHandlerGson = catchingFishLayoutExoPlayer.CatchingFishParcelableFAB;
                    if (catchingFishHandlerGson != null) {
                        return;
                    }
                    if (catchingFishHandlerGson.CatchingFishAnimationMockk != 1 && catchingFishLayoutExoPlayer.CatchingFishSnackbar < f6) {
                        return;
                    }
                }
            }
            z = false;
            catchingFishHandlerGson = catchingFishLayoutExoPlayer.CatchingFishParcelableFAB;
            if (catchingFishHandlerGson != null) {
            }
        }
        if (z) {
            return;
        }
        CatchingFishViewModelFAB(catchingFishLayoutExoPlayer);
    }

    public final void CatchingFishDaggerWebsocket(CatchingFishHandlerGson catchingFishHandlerGson, CatchingFishHandlerGson catchingFishHandlerGson2, int i, int i2) {
        if (i2 == 8 && catchingFishHandlerGson2.CatchingFishLayout && catchingFishHandlerGson.CatchingFishWorkManager == -1) {
            catchingFishHandlerGson.CatchingFishReduxKtor(this, catchingFishHandlerGson2.CatchingFishViewModelFAB + i);
            return;
        }
        CatchingFishLayoutExoPlayer CatchingFishEspressoTesting = CatchingFishEspressoTesting();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            CatchingFishEspressoTesting.CatchingFishSnackbar = i;
        }
        if (z) {
            CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson, 1.0f);
            CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson2, -1.0f);
        } else {
            CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson, -1.0f);
            CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson2, 1.0f);
        }
        if (i2 != 8) {
            CatchingFishEspressoTesting.CatchingFishParcelableFAB(this, i2);
        }
        CatchingFishCoroutine(CatchingFishEspressoTesting);
    }

    public final CatchingFishLayoutExoPlayer CatchingFishEspressoTesting() {
        Object obj;
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = this.CatchingFishOkHttp;
        CatchingFishBundleAsyncTask catchingFishBundleAsyncTask = (CatchingFishBundleAsyncTask) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket;
        int i = catchingFishBundleAsyncTask.CatchingFishSnackbar;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = catchingFishBundleAsyncTask.CatchingFishParcelableFAB;
            obj = objArr[i2];
            objArr[i2] = null;
            catchingFishBundleAsyncTask.CatchingFishSnackbar = i2;
        } else {
            obj = null;
        }
        CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer = (CatchingFishLayoutExoPlayer) obj;
        if (catchingFishLayoutExoPlayer == null) {
            return new CatchingFishLayoutExoPlayer(catchingFishAsyncTaskDagger);
        }
        catchingFishLayoutExoPlayer.CatchingFishParcelableFAB = null;
        catchingFishLayoutExoPlayer.CatchingFishReduxKtor.CatchingFishSnackbar();
        catchingFishLayoutExoPlayer.CatchingFishSnackbar = 0.0f;
        catchingFishLayoutExoPlayer.CatchingFishDaggerWebsocket = false;
        return catchingFishLayoutExoPlayer;
    }

    public final CatchingFishHandlerGson CatchingFishFragmentHandler(int i) {
        if (this.CatchingFishFragmentHandler + 1 >= this.CatchingFishWorkManager) {
            CatchingFishAnimationMockk();
        }
        CatchingFishHandlerGson CatchingFishParcelableFAB = CatchingFishParcelableFAB(4);
        float[] fArr = CatchingFishParcelableFAB.CatchingFishCloudMessaging;
        int i2 = this.CatchingFishCoroutine + 1;
        this.CatchingFishCoroutine = i2;
        this.CatchingFishFragmentHandler++;
        CatchingFishParcelableFAB.CatchingFishDaggerWebsocket = i2;
        CatchingFishParcelableFAB.CatchingFishViewModelScope = i;
        ((CatchingFishHandlerGson[]) this.CatchingFishOkHttp.CatchingFishViewModelScope)[i2] = CatchingFishParcelableFAB;
        CatchingFishRoomServiceRoom catchingFishRoomServiceRoom = this.CatchingFishReduxKtor;
        catchingFishRoomServiceRoom.CatchingFishLayout.CatchingFishDaggerWebsocket = CatchingFishParcelableFAB;
        Arrays.fill(fArr, 0.0f);
        fArr[CatchingFishParcelableFAB.CatchingFishViewModelScope] = 1.0f;
        catchingFishRoomServiceRoom.CatchingFishFragmentHandler(CatchingFishParcelableFAB);
        return CatchingFishParcelableFAB;
    }

    public final void CatchingFishJetpackCompose() {
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger;
        int i = 0;
        while (true) {
            catchingFishAsyncTaskDagger = this.CatchingFishOkHttp;
            CatchingFishHandlerGson[] catchingFishHandlerGsonArr = (CatchingFishHandlerGson[]) catchingFishAsyncTaskDagger.CatchingFishViewModelScope;
            if (i >= catchingFishHandlerGsonArr.length) {
                break;
            }
            CatchingFishHandlerGson catchingFishHandlerGson = catchingFishHandlerGsonArr[i];
            if (catchingFishHandlerGson != null) {
                catchingFishHandlerGson.CatchingFishCoroutine();
            }
            i++;
        }
        CatchingFishBundleAsyncTask catchingFishBundleAsyncTask = (CatchingFishBundleAsyncTask) catchingFishAsyncTaskDagger.CatchingFishWorkManager;
        CatchingFishHandlerGson[] catchingFishHandlerGsonArr2 = this.CatchingFishUnitTesting;
        int i2 = this.CatchingFishAnimationMockk;
        catchingFishBundleAsyncTask.getClass();
        if (i2 > catchingFishHandlerGsonArr2.length) {
            i2 = catchingFishHandlerGsonArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            CatchingFishHandlerGson catchingFishHandlerGson2 = catchingFishHandlerGsonArr2[i3];
            int i4 = catchingFishBundleAsyncTask.CatchingFishSnackbar;
            Object[] objArr = catchingFishBundleAsyncTask.CatchingFishParcelableFAB;
            if (i4 < objArr.length) {
                objArr[i4] = catchingFishHandlerGson2;
                catchingFishBundleAsyncTask.CatchingFishSnackbar = i4 + 1;
            }
        }
        this.CatchingFishAnimationMockk = 0;
        Arrays.fill((CatchingFishHandlerGson[]) catchingFishAsyncTaskDagger.CatchingFishViewModelScope, (Object) null);
        this.CatchingFishCoroutine = 0;
        CatchingFishRoomServiceRoom catchingFishRoomServiceRoom = this.CatchingFishReduxKtor;
        catchingFishRoomServiceRoom.CatchingFishViewModelFAB = 0;
        catchingFishRoomServiceRoom.CatchingFishSnackbar = 0.0f;
        this.CatchingFishFragmentHandler = 1;
        for (int i5 = 0; i5 < this.CatchingFishCloudMessaging; i5++) {
            CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer = this.CatchingFishViewModelScope[i5];
        }
        CatchingFish();
        this.CatchingFishCloudMessaging = 0;
        this.CatchingFishStateLiveData = new CatchingFishLayoutExoPlayer(catchingFishAsyncTaskDagger);
    }

    public final void CatchingFishLayout() {
        for (int i = 0; i < this.CatchingFishCloudMessaging; i++) {
            CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer = this.CatchingFishViewModelScope[i];
            catchingFishLayoutExoPlayer.CatchingFishParcelableFAB.CatchingFishViewModelFAB = catchingFishLayoutExoPlayer.CatchingFishSnackbar;
        }
    }

    public final void CatchingFishNavigation(CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.CatchingFishFragmentHandler; i2++) {
            this.CatchingFishLayout[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            int i4 = 1;
            i3++;
            if (i3 >= this.CatchingFishFragmentHandler * 2) {
                return;
            }
            CatchingFishHandlerGson catchingFishHandlerGson = catchingFishLayoutExoPlayer.CatchingFishParcelableFAB;
            if (catchingFishHandlerGson != null) {
                this.CatchingFishLayout[catchingFishHandlerGson.CatchingFishDaggerWebsocket] = true;
            }
            CatchingFishHandlerGson CatchingFishReduxKtor = catchingFishLayoutExoPlayer.CatchingFishReduxKtor(this.CatchingFishLayout);
            if (CatchingFishReduxKtor != null) {
                boolean[] zArr = this.CatchingFishLayout;
                int i5 = CatchingFishReduxKtor.CatchingFishDaggerWebsocket;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (CatchingFishReduxKtor != null) {
                float f = Float.MAX_VALUE;
                int i6 = i;
                int i7 = -1;
                while (i6 < this.CatchingFishCloudMessaging) {
                    CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer2 = this.CatchingFishViewModelScope[i6];
                    if (catchingFishLayoutExoPlayer2.CatchingFishParcelableFAB.CatchingFishAnimationMockk != i4 && !catchingFishLayoutExoPlayer2.CatchingFishDaggerWebsocket) {
                        CatchingFishRealmManifest catchingFishRealmManifest = catchingFishLayoutExoPlayer2.CatchingFishReduxKtor;
                        int i8 = catchingFishRealmManifest.CatchingFishViewModelFAB;
                        if (i8 != -1) {
                            for (int i9 = 0; i8 != -1 && i9 < catchingFishRealmManifest.CatchingFishParcelableFAB; i9++) {
                                if (catchingFishRealmManifest.CatchingFishDaggerWebsocket[i8] == CatchingFishReduxKtor.CatchingFishDaggerWebsocket) {
                                    z = true;
                                    break;
                                }
                                i8 = catchingFishRealmManifest.CatchingFishWorkManager[i8];
                            }
                        }
                        z = false;
                        if (z) {
                            float CatchingFishCoroutine = catchingFishLayoutExoPlayer2.CatchingFishReduxKtor.CatchingFishCoroutine(CatchingFishReduxKtor);
                            if (CatchingFishCoroutine < 0.0f) {
                                float f2 = (-catchingFishLayoutExoPlayer2.CatchingFishSnackbar) / CatchingFishCoroutine;
                                if (f2 < f) {
                                    f = f2;
                                    i7 = i6;
                                }
                            }
                        }
                    }
                    i6++;
                    i4 = 1;
                }
                if (i7 > -1) {
                    CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer3 = this.CatchingFishViewModelScope[i7];
                    catchingFishLayoutExoPlayer3.CatchingFishParcelableFAB.CatchingFishWorkManager = -1;
                    catchingFishLayoutExoPlayer3.CatchingFishViewModelScope(CatchingFishReduxKtor);
                    CatchingFishHandlerGson catchingFishHandlerGson2 = catchingFishLayoutExoPlayer3.CatchingFishParcelableFAB;
                    catchingFishHandlerGson2.CatchingFishWorkManager = i7;
                    catchingFishHandlerGson2.CatchingFishDaggerWebsocket(this, catchingFishLayoutExoPlayer3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final CatchingFishHandlerGson CatchingFishOkHttp() {
        if (this.CatchingFishFragmentHandler + 1 >= this.CatchingFishWorkManager) {
            CatchingFishAnimationMockk();
        }
        CatchingFishHandlerGson CatchingFishParcelableFAB = CatchingFishParcelableFAB(3);
        int i = this.CatchingFishCoroutine + 1;
        this.CatchingFishCoroutine = i;
        this.CatchingFishFragmentHandler++;
        CatchingFishParcelableFAB.CatchingFishDaggerWebsocket = i;
        ((CatchingFishHandlerGson[]) this.CatchingFishOkHttp.CatchingFishViewModelScope)[i] = CatchingFishParcelableFAB;
        return CatchingFishParcelableFAB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final CatchingFishHandlerGson CatchingFishParcelableFAB(int i) {
        CatchingFishBundleAsyncTask catchingFishBundleAsyncTask = (CatchingFishBundleAsyncTask) this.CatchingFishOkHttp.CatchingFishWorkManager;
        int i2 = catchingFishBundleAsyncTask.CatchingFishSnackbar;
        CatchingFishHandlerGson catchingFishHandlerGson = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = catchingFishBundleAsyncTask.CatchingFishParcelableFAB;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            catchingFishBundleAsyncTask.CatchingFishSnackbar = i3;
            catchingFishHandlerGson = r4;
        }
        CatchingFishHandlerGson catchingFishHandlerGson2 = catchingFishHandlerGson;
        if (catchingFishHandlerGson2 == null) {
            catchingFishHandlerGson2 = new CatchingFishHandlerGson(i);
            catchingFishHandlerGson2.CatchingFishAnimationMockk = i;
        } else {
            catchingFishHandlerGson2.CatchingFishCoroutine();
            catchingFishHandlerGson2.CatchingFishAnimationMockk = i;
        }
        int i4 = this.CatchingFishAnimationMockk;
        int i5 = this.CatchingFishParcelableFAB;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.CatchingFishParcelableFAB = i6;
            this.CatchingFishUnitTesting = (CatchingFishHandlerGson[]) Arrays.copyOf(this.CatchingFishUnitTesting, i6);
        }
        CatchingFishHandlerGson[] catchingFishHandlerGsonArr = this.CatchingFishUnitTesting;
        int i7 = this.CatchingFishAnimationMockk;
        this.CatchingFishAnimationMockk = i7 + 1;
        catchingFishHandlerGsonArr[i7] = catchingFishHandlerGson2;
        return catchingFishHandlerGson2;
    }

    public final void CatchingFishReduxKtor(CatchingFishHandlerGson catchingFishHandlerGson, int i) {
        int i2 = catchingFishHandlerGson.CatchingFishWorkManager;
        if (i2 == -1) {
            catchingFishHandlerGson.CatchingFishReduxKtor(this, i);
            for (int i3 = 0; i3 < this.CatchingFishCoroutine + 1; i3++) {
                CatchingFishHandlerGson catchingFishHandlerGson2 = ((CatchingFishHandlerGson[]) this.CatchingFishOkHttp.CatchingFishViewModelScope)[i3];
            }
            return;
        }
        if (i2 == -1) {
            CatchingFishLayoutExoPlayer CatchingFishEspressoTesting = CatchingFishEspressoTesting();
            CatchingFishEspressoTesting.CatchingFishParcelableFAB = catchingFishHandlerGson;
            float f = i;
            catchingFishHandlerGson.CatchingFishViewModelFAB = f;
            CatchingFishEspressoTesting.CatchingFishSnackbar = f;
            CatchingFishEspressoTesting.CatchingFishDaggerWebsocket = true;
            CatchingFishCoroutine(CatchingFishEspressoTesting);
            return;
        }
        CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer = this.CatchingFishViewModelScope[i2];
        if (catchingFishLayoutExoPlayer.CatchingFishDaggerWebsocket) {
            catchingFishLayoutExoPlayer.CatchingFishSnackbar = i;
            return;
        }
        if (catchingFishLayoutExoPlayer.CatchingFishReduxKtor.CatchingFishReduxKtor() == 0) {
            catchingFishLayoutExoPlayer.CatchingFishDaggerWebsocket = true;
            catchingFishLayoutExoPlayer.CatchingFishSnackbar = i;
            return;
        }
        CatchingFishLayoutExoPlayer CatchingFishEspressoTesting2 = CatchingFishEspressoTesting();
        if (i < 0) {
            CatchingFishEspressoTesting2.CatchingFishSnackbar = i * (-1);
            CatchingFishEspressoTesting2.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson, 1.0f);
        } else {
            CatchingFishEspressoTesting2.CatchingFishSnackbar = i;
            CatchingFishEspressoTesting2.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson, -1.0f);
        }
        CatchingFishCoroutine(CatchingFishEspressoTesting2);
    }

    public final void CatchingFishRoomDatabase(CatchingFishRoomServiceRoom catchingFishRoomServiceRoom) {
        int i = 0;
        while (true) {
            if (i >= this.CatchingFishCloudMessaging) {
                break;
            }
            CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer = this.CatchingFishViewModelScope[i];
            int i2 = 1;
            if (catchingFishLayoutExoPlayer.CatchingFishParcelableFAB.CatchingFishAnimationMockk != 1) {
                float f = 0.0f;
                if (catchingFishLayoutExoPlayer.CatchingFishSnackbar < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.CatchingFishCloudMessaging) {
                            CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer2 = this.CatchingFishViewModelScope[i6];
                            if (catchingFishLayoutExoPlayer2.CatchingFishParcelableFAB.CatchingFishAnimationMockk != i2 && !catchingFishLayoutExoPlayer2.CatchingFishDaggerWebsocket && catchingFishLayoutExoPlayer2.CatchingFishSnackbar < f) {
                                int CatchingFishReduxKtor = catchingFishLayoutExoPlayer2.CatchingFishReduxKtor.CatchingFishReduxKtor();
                                int i8 = 0;
                                while (i8 < CatchingFishReduxKtor) {
                                    CatchingFishHandlerGson CatchingFishDaggerWebsocket = catchingFishLayoutExoPlayer2.CatchingFishReduxKtor.CatchingFishDaggerWebsocket(i8);
                                    float CatchingFishCoroutine = catchingFishLayoutExoPlayer2.CatchingFishReduxKtor.CatchingFishCoroutine(CatchingFishDaggerWebsocket);
                                    if (CatchingFishCoroutine > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = CatchingFishDaggerWebsocket.CatchingFishFragmentHandler[i9] / CatchingFishCoroutine;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer3 = this.CatchingFishViewModelScope[i4];
                            catchingFishLayoutExoPlayer3.CatchingFishParcelableFAB.CatchingFishWorkManager = -1;
                            catchingFishLayoutExoPlayer3.CatchingFishViewModelScope(((CatchingFishHandlerGson[]) this.CatchingFishOkHttp.CatchingFishViewModelScope)[i5]);
                            CatchingFishHandlerGson catchingFishHandlerGson = catchingFishLayoutExoPlayer3.CatchingFishParcelableFAB;
                            catchingFishHandlerGson.CatchingFishWorkManager = i4;
                            catchingFishHandlerGson.CatchingFishDaggerWebsocket(this, catchingFishLayoutExoPlayer3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.CatchingFishFragmentHandler / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        CatchingFishNavigation(catchingFishRoomServiceRoom);
        CatchingFishLayout();
    }

    public final void CatchingFishSnackbar(CatchingFishHandlerGson catchingFishHandlerGson, CatchingFishHandlerGson catchingFishHandlerGson2, int i, float f, CatchingFishHandlerGson catchingFishHandlerGson3, CatchingFishHandlerGson catchingFishHandlerGson4, int i2, int i3) {
        CatchingFishLayoutExoPlayer CatchingFishEspressoTesting = CatchingFishEspressoTesting();
        if (catchingFishHandlerGson2 == catchingFishHandlerGson3) {
            CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson, 1.0f);
            CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson4, 1.0f);
            CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson2, -2.0f);
        } else if (f == 0.5f) {
            CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson, 1.0f);
            CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson2, -1.0f);
            CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson3, -1.0f);
            CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson4, 1.0f);
            if (i > 0 || i2 > 0) {
                CatchingFishEspressoTesting.CatchingFishSnackbar = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson, -1.0f);
            CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson2, 1.0f);
            CatchingFishEspressoTesting.CatchingFishSnackbar = i;
        } else if (f >= 1.0f) {
            CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson4, -1.0f);
            CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson3, 1.0f);
            CatchingFishEspressoTesting.CatchingFishSnackbar = -i2;
        } else {
            float f2 = 1.0f - f;
            CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson, f2 * 1.0f);
            CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson2, f2 * (-1.0f));
            CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson3, (-1.0f) * f);
            CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                CatchingFishEspressoTesting.CatchingFishSnackbar = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            CatchingFishEspressoTesting.CatchingFishParcelableFAB(this, i3);
        }
        CatchingFishCoroutine(CatchingFishEspressoTesting);
    }

    public final void CatchingFishStateLiveData() {
        CatchingFishRoomServiceRoom catchingFishRoomServiceRoom = this.CatchingFishReduxKtor;
        if (catchingFishRoomServiceRoom.CatchingFishDaggerWebsocket()) {
            CatchingFishLayout();
            return;
        }
        if (!this.CatchingFishViewModelFAB) {
            CatchingFishRoomDatabase(catchingFishRoomServiceRoom);
            return;
        }
        for (int i = 0; i < this.CatchingFishCloudMessaging; i++) {
            if (!this.CatchingFishViewModelScope[i].CatchingFishDaggerWebsocket) {
                CatchingFishRoomDatabase(catchingFishRoomServiceRoom);
                return;
            }
        }
        CatchingFishLayout();
    }

    public final void CatchingFishViewModelFAB(CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer) {
        int i;
        if (catchingFishLayoutExoPlayer.CatchingFishDaggerWebsocket) {
            catchingFishLayoutExoPlayer.CatchingFishParcelableFAB.CatchingFishReduxKtor(this, catchingFishLayoutExoPlayer.CatchingFishSnackbar);
        } else {
            CatchingFishLayoutExoPlayer[] catchingFishLayoutExoPlayerArr = this.CatchingFishViewModelScope;
            int i2 = this.CatchingFishCloudMessaging;
            catchingFishLayoutExoPlayerArr[i2] = catchingFishLayoutExoPlayer;
            CatchingFishHandlerGson catchingFishHandlerGson = catchingFishLayoutExoPlayer.CatchingFishParcelableFAB;
            catchingFishHandlerGson.CatchingFishWorkManager = i2;
            this.CatchingFishCloudMessaging = i2 + 1;
            catchingFishHandlerGson.CatchingFishDaggerWebsocket(this, catchingFishLayoutExoPlayer);
        }
        if (this.CatchingFishSnackbar) {
            int i3 = 0;
            while (i3 < this.CatchingFishCloudMessaging) {
                if (this.CatchingFishViewModelScope[i3] == null) {
                    System.out.println("WTF");
                }
                CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer2 = this.CatchingFishViewModelScope[i3];
                if (catchingFishLayoutExoPlayer2 != null && catchingFishLayoutExoPlayer2.CatchingFishDaggerWebsocket) {
                    catchingFishLayoutExoPlayer2.CatchingFishParcelableFAB.CatchingFishReduxKtor(this, catchingFishLayoutExoPlayer2.CatchingFishSnackbar);
                    ((CatchingFishBundleAsyncTask) this.CatchingFishOkHttp.CatchingFishDaggerWebsocket).CatchingFishSnackbar(catchingFishLayoutExoPlayer2);
                    this.CatchingFishViewModelScope[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.CatchingFishCloudMessaging;
                        if (i4 >= i) {
                            break;
                        }
                        CatchingFishLayoutExoPlayer[] catchingFishLayoutExoPlayerArr2 = this.CatchingFishViewModelScope;
                        int i6 = i4 - 1;
                        CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer3 = catchingFishLayoutExoPlayerArr2[i4];
                        catchingFishLayoutExoPlayerArr2[i6] = catchingFishLayoutExoPlayer3;
                        CatchingFishHandlerGson catchingFishHandlerGson2 = catchingFishLayoutExoPlayer3.CatchingFishParcelableFAB;
                        if (catchingFishHandlerGson2.CatchingFishWorkManager == i4) {
                            catchingFishHandlerGson2.CatchingFishWorkManager = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.CatchingFishViewModelScope[i5] = null;
                    }
                    this.CatchingFishCloudMessaging = i - 1;
                    i3--;
                }
                i3++;
            }
            this.CatchingFishSnackbar = false;
        }
    }

    public final void CatchingFishViewModelScope(CatchingFishHandlerGson catchingFishHandlerGson, CatchingFishHandlerGson catchingFishHandlerGson2, int i, int i2) {
        CatchingFishLayoutExoPlayer CatchingFishEspressoTesting = CatchingFishEspressoTesting();
        CatchingFishHandlerGson CatchingFishOkHttp = CatchingFishOkHttp();
        CatchingFishOkHttp.CatchingFishViewModelScope = 0;
        CatchingFishEspressoTesting.CatchingFishCoroutine(catchingFishHandlerGson, catchingFishHandlerGson2, CatchingFishOkHttp, i);
        if (i2 != 8) {
            CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishFragmentHandler(i2), (int) (CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishCoroutine(CatchingFishOkHttp) * (-1.0f)));
        }
        CatchingFishCoroutine(CatchingFishEspressoTesting);
    }

    public final void CatchingFishWorkManager(CatchingFishHandlerGson catchingFishHandlerGson, CatchingFishHandlerGson catchingFishHandlerGson2, int i, int i2) {
        CatchingFishLayoutExoPlayer CatchingFishEspressoTesting = CatchingFishEspressoTesting();
        CatchingFishHandlerGson CatchingFishOkHttp = CatchingFishOkHttp();
        CatchingFishOkHttp.CatchingFishViewModelScope = 0;
        CatchingFishEspressoTesting.CatchingFishSnackbar(catchingFishHandlerGson, catchingFishHandlerGson2, CatchingFishOkHttp, i);
        if (i2 != 8) {
            CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishFragmentHandler(i2), (int) (CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishCoroutine(CatchingFishOkHttp) * (-1.0f)));
        }
        CatchingFishCoroutine(CatchingFishEspressoTesting);
    }
}
