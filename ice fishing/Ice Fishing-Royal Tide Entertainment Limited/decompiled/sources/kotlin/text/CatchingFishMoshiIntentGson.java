package kotlin.text;

import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class CatchingFishMoshiIntentGson {
    public boolean CatchingFishCoroutine;
    public ArrayList CatchingFishDaggerWebsocket;
    public CatchingFishGsonAppCompat CatchingFishParcelableFAB;
    public CatchingFishGsonAppCompat CatchingFishReduxKtor;
    public boolean CatchingFishSnackbar;
    public ArrayList CatchingFishViewModelFAB;
    public CatchingFishGsonBiometric CatchingFishViewModelScope;
    public CatchingFishRetrofitDagger CatchingFishWorkManager;

    public final void CatchingFishCoroutine() {
        CatchingFishGsonAppCompat catchingFishGsonAppCompat = this.CatchingFishParcelableFAB;
        ArrayList arrayList = this.CatchingFishViewModelFAB;
        ArrayList arrayList2 = this.CatchingFishDaggerWebsocket;
        arrayList2.clear();
        CatchingFishGsonAppCompat catchingFishGsonAppCompat2 = this.CatchingFishReduxKtor;
        catchingFishGsonAppCompat2.CatchingFishReduxKtor.CatchingFishWorkManager();
        catchingFishGsonAppCompat2.CatchingFishDaggerWebsocket.CatchingFishWorkManager();
        arrayList2.add(catchingFishGsonAppCompat2.CatchingFishReduxKtor);
        arrayList2.add(catchingFishGsonAppCompat2.CatchingFishDaggerWebsocket);
        ArrayList arrayList3 = catchingFishGsonAppCompat2.CatchingFishFABLayout;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit = (CatchingFishDaggerRetrofit) obj;
            if (catchingFishDaggerRetrofit instanceof CatchingFishViewModelMockk) {
                CatchingFishFirebaseKtor catchingFishFirebaseKtor = new CatchingFishFirebaseKtor(catchingFishDaggerRetrofit);
                catchingFishDaggerRetrofit.CatchingFishReduxKtor.CatchingFishWorkManager();
                catchingFishDaggerRetrofit.CatchingFishDaggerWebsocket.CatchingFishWorkManager();
                catchingFishFirebaseKtor.CatchingFishWorkManager = ((CatchingFishViewModelMockk) catchingFishDaggerRetrofit).CatchingFishKtorService;
                arrayList2.add(catchingFishFirebaseKtor);
            } else {
                if (catchingFishDaggerRetrofit.CatchingFishParcelableFlux()) {
                    if (catchingFishDaggerRetrofit.CatchingFishSnackbar == null) {
                        catchingFishDaggerRetrofit.CatchingFishSnackbar = new CatchingFishEspressoIntent(catchingFishDaggerRetrofit, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(catchingFishDaggerRetrofit.CatchingFishSnackbar);
                } else {
                    arrayList2.add(catchingFishDaggerRetrofit.CatchingFishReduxKtor);
                }
                if (catchingFishDaggerRetrofit.CatchingFishGsonAppCompat()) {
                    if (catchingFishDaggerRetrofit.CatchingFishCoroutine == null) {
                        catchingFishDaggerRetrofit.CatchingFishCoroutine = new CatchingFishEspressoIntent(catchingFishDaggerRetrofit, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(catchingFishDaggerRetrofit.CatchingFishCoroutine);
                } else {
                    arrayList2.add(catchingFishDaggerRetrofit.CatchingFishDaggerWebsocket);
                }
                if (catchingFishDaggerRetrofit instanceof CatchingFishRetrofitHandler) {
                    arrayList2.add(new CatchingFishFluxGson(catchingFishDaggerRetrofit));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ((CatchingFishDataStorePayPal) obj2).CatchingFishWorkManager();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            CatchingFishDataStorePayPal catchingFishDataStorePayPal = (CatchingFishDataStorePayPal) obj3;
            if (catchingFishDataStorePayPal.CatchingFishSnackbar != catchingFishGsonAppCompat2) {
                catchingFishDataStorePayPal.CatchingFishReduxKtor();
            }
        }
        arrayList.clear();
        CatchingFishDaggerWebsocket(catchingFishGsonAppCompat.CatchingFishReduxKtor, 0, arrayList);
        CatchingFishDaggerWebsocket(catchingFishGsonAppCompat.CatchingFishDaggerWebsocket, 1, arrayList);
        this.CatchingFishSnackbar = false;
    }

    public final void CatchingFishDaggerWebsocket(CatchingFishDataStorePayPal catchingFishDataStorePayPal, int i, ArrayList arrayList) {
        CatchingFishUnitTestingMVI catchingFishUnitTestingMVI = catchingFishDataStorePayPal.CatchingFishViewModelFAB;
        CatchingFishUnitTestingMVI catchingFishUnitTestingMVI2 = catchingFishDataStorePayPal.CatchingFishLayout;
        ArrayList arrayList2 = catchingFishUnitTestingMVI.CatchingFishCloudMessaging;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            CatchingFishGlideRedux catchingFishGlideRedux = (CatchingFishGlideRedux) obj;
            if (catchingFishGlideRedux instanceof CatchingFishUnitTestingMVI) {
                CatchingFishParcelableFAB((CatchingFishUnitTestingMVI) catchingFishGlideRedux, i, arrayList, null);
            } else if (catchingFishGlideRedux instanceof CatchingFishDataStorePayPal) {
                CatchingFishParcelableFAB(((CatchingFishDataStorePayPal) catchingFishGlideRedux).CatchingFishViewModelFAB, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = catchingFishUnitTestingMVI2.CatchingFishCloudMessaging;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            CatchingFishGlideRedux catchingFishGlideRedux2 = (CatchingFishGlideRedux) obj2;
            if (catchingFishGlideRedux2 instanceof CatchingFishUnitTestingMVI) {
                CatchingFishParcelableFAB((CatchingFishUnitTestingMVI) catchingFishGlideRedux2, i, arrayList, null);
            } else if (catchingFishGlideRedux2 instanceof CatchingFishDataStorePayPal) {
                CatchingFishParcelableFAB(((CatchingFishDataStorePayPal) catchingFishGlideRedux2).CatchingFishLayout, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((CatchingFishMVPCardView) catchingFishDataStorePayPal).CatchingFishCloudMessaging.CatchingFishCloudMessaging;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                CatchingFishGlideRedux catchingFishGlideRedux3 = (CatchingFishGlideRedux) obj3;
                if (catchingFishGlideRedux3 instanceof CatchingFishUnitTestingMVI) {
                    CatchingFishParcelableFAB((CatchingFishUnitTestingMVI) catchingFishGlideRedux3, i, arrayList, null);
                }
            }
        }
    }

    public final void CatchingFishParcelableFAB(CatchingFishUnitTestingMVI catchingFishUnitTestingMVI, int i, ArrayList arrayList, CatchingFishAnimationToast catchingFishAnimationToast) {
        CatchingFishDataStorePayPal catchingFishDataStorePayPal = catchingFishUnitTestingMVI.CatchingFishReduxKtor;
        CatchingFishAnimationToast catchingFishAnimationToast2 = catchingFishDataStorePayPal.CatchingFishCoroutine;
        CatchingFishUnitTestingMVI catchingFishUnitTestingMVI2 = catchingFishDataStorePayPal.CatchingFishLayout;
        CatchingFishUnitTestingMVI catchingFishUnitTestingMVI3 = catchingFishDataStorePayPal.CatchingFishViewModelFAB;
        if (catchingFishAnimationToast2 == null) {
            CatchingFishGsonAppCompat catchingFishGsonAppCompat = this.CatchingFishParcelableFAB;
            if (catchingFishDataStorePayPal == catchingFishGsonAppCompat.CatchingFishReduxKtor || catchingFishDataStorePayPal == catchingFishGsonAppCompat.CatchingFishDaggerWebsocket) {
                return;
            }
            if (catchingFishAnimationToast == null) {
                catchingFishAnimationToast = new CatchingFishAnimationToast();
                catchingFishAnimationToast.CatchingFishParcelableFAB = null;
                catchingFishAnimationToast.CatchingFishSnackbar = new ArrayList();
                catchingFishAnimationToast.CatchingFishParcelableFAB = catchingFishDataStorePayPal;
                arrayList.add(catchingFishAnimationToast);
            }
            catchingFishDataStorePayPal.CatchingFishCoroutine = catchingFishAnimationToast;
            catchingFishAnimationToast.CatchingFishSnackbar.add(catchingFishDataStorePayPal);
            ArrayList arrayList2 = catchingFishUnitTestingMVI3.CatchingFishCloudMessaging;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                CatchingFishGlideRedux catchingFishGlideRedux = (CatchingFishGlideRedux) obj;
                if (catchingFishGlideRedux instanceof CatchingFishUnitTestingMVI) {
                    CatchingFishParcelableFAB((CatchingFishUnitTestingMVI) catchingFishGlideRedux, i, arrayList, catchingFishAnimationToast);
                }
            }
            ArrayList arrayList3 = catchingFishUnitTestingMVI2.CatchingFishCloudMessaging;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                CatchingFishGlideRedux catchingFishGlideRedux2 = (CatchingFishGlideRedux) obj2;
                if (catchingFishGlideRedux2 instanceof CatchingFishUnitTestingMVI) {
                    CatchingFishParcelableFAB((CatchingFishUnitTestingMVI) catchingFishGlideRedux2, i, arrayList, catchingFishAnimationToast);
                }
            }
            if (i == 1 && (catchingFishDataStorePayPal instanceof CatchingFishMVPCardView)) {
                ArrayList arrayList4 = ((CatchingFishMVPCardView) catchingFishDataStorePayPal).CatchingFishCloudMessaging.CatchingFishCloudMessaging;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    CatchingFishGlideRedux catchingFishGlideRedux3 = (CatchingFishGlideRedux) obj3;
                    if (catchingFishGlideRedux3 instanceof CatchingFishUnitTestingMVI) {
                        CatchingFishParcelableFAB((CatchingFishUnitTestingMVI) catchingFishGlideRedux3, i, arrayList, catchingFishAnimationToast);
                    }
                }
            }
            ArrayList arrayList5 = catchingFishUnitTestingMVI3.CatchingFishEspressoTesting;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                CatchingFishParcelableFAB((CatchingFishUnitTestingMVI) obj4, i, arrayList, catchingFishAnimationToast);
            }
            ArrayList arrayList6 = catchingFishUnitTestingMVI2.CatchingFishEspressoTesting;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                CatchingFishParcelableFAB((CatchingFishUnitTestingMVI) obj5, i, arrayList, catchingFishAnimationToast);
            }
            if (i == 1 && (catchingFishDataStorePayPal instanceof CatchingFishMVPCardView)) {
                ArrayList arrayList7 = ((CatchingFishMVPCardView) catchingFishDataStorePayPal).CatchingFishCloudMessaging.CatchingFishEspressoTesting;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    CatchingFishParcelableFAB((CatchingFishUnitTestingMVI) obj6, i, arrayList, catchingFishAnimationToast);
                }
            }
        }
    }

    public final int CatchingFishReduxKtor(CatchingFishGsonAppCompat catchingFishGsonAppCompat, int i) {
        ArrayList arrayList;
        int i2;
        long max;
        float f;
        CatchingFishGsonAppCompat catchingFishGsonAppCompat2 = catchingFishGsonAppCompat;
        ArrayList arrayList2 = this.CatchingFishViewModelFAB;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long j2 = 0;
        while (i3 < size) {
            CatchingFishDataStorePayPal catchingFishDataStorePayPal = ((CatchingFishAnimationToast) arrayList2.get(i3)).CatchingFishParcelableFAB;
            if (!(catchingFishDataStorePayPal instanceof CatchingFishEspressoIntent) ? !(i != 0 ? (catchingFishDataStorePayPal instanceof CatchingFishMVPCardView) : (catchingFishDataStorePayPal instanceof CatchingFishCameraXBundle)) : ((CatchingFishEspressoIntent) catchingFishDataStorePayPal).CatchingFishWorkManager != i) {
                CatchingFishUnitTestingMVI catchingFishUnitTestingMVI = (i == 0 ? catchingFishGsonAppCompat2.CatchingFishReduxKtor : catchingFishGsonAppCompat2.CatchingFishDaggerWebsocket).CatchingFishViewModelFAB;
                CatchingFishUnitTestingMVI catchingFishUnitTestingMVI2 = (i == 0 ? catchingFishGsonAppCompat2.CatchingFishReduxKtor : catchingFishGsonAppCompat2.CatchingFishDaggerWebsocket).CatchingFishLayout;
                CatchingFishUnitTestingMVI catchingFishUnitTestingMVI3 = catchingFishDataStorePayPal.CatchingFishViewModelFAB;
                CatchingFishUnitTestingMVI catchingFishUnitTestingMVI4 = catchingFishDataStorePayPal.CatchingFishLayout;
                boolean contains = catchingFishUnitTestingMVI3.CatchingFishEspressoTesting.contains(catchingFishUnitTestingMVI);
                boolean contains2 = catchingFishUnitTestingMVI4.CatchingFishEspressoTesting.contains(catchingFishUnitTestingMVI2);
                long CatchingFishFragmentHandler = catchingFishDataStorePayPal.CatchingFishFragmentHandler();
                if (contains && contains2) {
                    long CatchingFishSnackbar = CatchingFishAnimationToast.CatchingFishSnackbar(catchingFishUnitTestingMVI3, j);
                    long CatchingFishParcelableFAB = CatchingFishAnimationToast.CatchingFishParcelableFAB(catchingFishUnitTestingMVI4, j);
                    long j3 = CatchingFishSnackbar - CatchingFishFragmentHandler;
                    int i4 = catchingFishUnitTestingMVI4.CatchingFishWorkManager;
                    arrayList = arrayList2;
                    i2 = size;
                    if (j3 >= (-i4)) {
                        j3 += i4;
                    }
                    long j4 = catchingFishUnitTestingMVI3.CatchingFishWorkManager;
                    long j5 = ((-CatchingFishParcelableFAB) - CatchingFishFragmentHandler) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    CatchingFishDaggerRetrofit catchingFishDaggerRetrofit = catchingFishDataStorePayPal.CatchingFishSnackbar;
                    if (i == 0) {
                        f = catchingFishDaggerRetrofit.CatchingFishRedux;
                    } else if (i == 1) {
                        f = catchingFishDaggerRetrofit.CatchingFishCustomViewJUnit;
                    } else {
                        catchingFishDaggerRetrofit.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j3 / (1.0f - f)) + (j5 / f)) : 0L;
                    max = (catchingFishUnitTestingMVI3.CatchingFishWorkManager + ((((long) ((f2 * f) + 0.5f)) + CatchingFishFragmentHandler) + ((long) (((1.0f - f) * f2) + 0.5f)))) - catchingFishUnitTestingMVI4.CatchingFishWorkManager;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    max = contains ? Math.max(CatchingFishAnimationToast.CatchingFishSnackbar(catchingFishUnitTestingMVI3, catchingFishUnitTestingMVI3.CatchingFishWorkManager), catchingFishUnitTestingMVI3.CatchingFishWorkManager + CatchingFishFragmentHandler) : contains2 ? Math.max(-CatchingFishAnimationToast.CatchingFishParcelableFAB(catchingFishUnitTestingMVI4, catchingFishUnitTestingMVI4.CatchingFishWorkManager), (-catchingFishUnitTestingMVI4.CatchingFishWorkManager) + CatchingFishFragmentHandler) : (catchingFishDataStorePayPal.CatchingFishFragmentHandler() + catchingFishUnitTestingMVI3.CatchingFishWorkManager) - catchingFishUnitTestingMVI4.CatchingFishWorkManager;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                max = j;
            }
            j2 = Math.max(j2, max);
            i3++;
            catchingFishGsonAppCompat2 = catchingFishGsonAppCompat;
            arrayList2 = arrayList;
            size = i2;
            j = 0;
        }
        return (int) j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0274, code lost:
    
        r6 = 1;
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0277, code lost:
    
        CatchingFishWorkManager(r11, 0, r10, 0, r12);
        r12.CatchingFishReduxKtor.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(r12.CatchingFishRoomDatabase());
        r12.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(r12.CatchingFishCloudMessaging());
        r12.CatchingFishParcelableFAB = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x029a, code lost:
    
        r7 = r10;
        r0 = r13;
        r10 = r8;
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00e8, code lost:
    
        if (r15 != 3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00ea, code lost:
    
        if (r6 != r0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00ec, code lost:
    
        CatchingFishWorkManager(r0, 0, r0, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00f5, code lost:
    
        r11 = r12.CatchingFishCloudMessaging();
        CatchingFishWorkManager(1, (int) ((r11 * r12.CatchingFishJUnitRealm) + 0.5f), 1, r11, r12);
        r12.CatchingFishReduxKtor.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(r12.CatchingFishRoomDatabase());
        r12.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(r12.CatchingFishCloudMessaging());
        r12.CatchingFishParcelableFAB = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x012c, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x012f, code lost:
    
        if (r15 != 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0131, code lost:
    
        CatchingFishWorkManager(r8, 0, r6, 0, r12);
        r12.CatchingFishReduxKtor.CatchingFishDaggerWebsocket.CatchingFishOkHttp = r12.CatchingFishRoomDatabase();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0145, code lost:
    
        if (r15 != 2) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0147, code lost:
    
        r0 = r2[r16];
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0149, code lost:
    
        if (r0 == 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x014c, code lost:
    
        if (r0 != 4) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x014f, code lost:
    
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0152, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0154, code lost:
    
        CatchingFishWorkManager(1, (int) ((r4 * r25.CatchingFishRoomDatabase()) + 0.5f), r6, r12.CatchingFishCloudMessaging(), r12);
        r12.CatchingFishReduxKtor.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(r12.CatchingFishRoomDatabase());
        r12.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(r12.CatchingFishCloudMessaging());
        r12.CatchingFishParcelableFAB = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0182, code lost:
    
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x018a, code lost:
    
        if (r7[r16].CatchingFishWorkManager == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0190, code lost:
    
        if (r7[1].CatchingFishWorkManager != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0192, code lost:
    
        CatchingFishWorkManager(r8, 0, r10, 0, r12);
        r12.CatchingFishReduxKtor.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(r12.CatchingFishRoomDatabase());
        r12.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(r12.CatchingFishCloudMessaging());
        r12.CatchingFishParcelableFAB = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01b4, code lost:
    
        r8 = r0;
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00c9, code lost:
    
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c0, code lost:
    
        if (r13 == 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d4, code lost:
    
        if (r13 != 3) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d6, code lost:
    
        if (r6 == r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r6 != 1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dc, code lost:
    
        r8 = r0;
        r0 = 3;
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b8, code lost:
    
        if (r10 != r0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ba, code lost:
    
        if (r13 == r8) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01bc, code lost:
    
        if (r13 != r6) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01bf, code lost:
    
        r9 = r0;
        r7 = r10;
        r0 = r13;
        r10 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c3, code lost:
    
        r8 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x029f, code lost:
    
        if (r0 != r9) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02a1, code lost:
    
        if (r7 != r9) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02a3, code lost:
    
        if (r15 == r6) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02a5, code lost:
    
        if (r1 != r6) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02a9, code lost:
    
        if (r1 != 2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02ab, code lost:
    
        if (r15 != 2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02af, code lost:
    
        if (r2[r16] != r8) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02b3, code lost:
    
        if (r2[r6] != r8) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02b5, code lost:
    
        CatchingFishWorkManager(r8, (int) ((r4 * r25.CatchingFishRoomDatabase()) + 0.5f), r8, (int) ((r14 * r25.CatchingFishCloudMessaging()) + 0.5f), r12);
        r12.CatchingFishReduxKtor.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(r12.CatchingFishRoomDatabase());
        r12.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(r12.CatchingFishCloudMessaging());
        r12.CatchingFishParcelableFAB = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02e8, code lost:
    
        CatchingFishWorkManager(r10, 0, r10, 0, r12);
        r12.CatchingFishReduxKtor.CatchingFishDaggerWebsocket.CatchingFishOkHttp = r12.CatchingFishRoomDatabase();
        r12.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.CatchingFishOkHttp = r12.CatchingFishCloudMessaging();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c7, code lost:
    
        if (r1 != r0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c9, code lost:
    
        if (r13 != r8) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01cb, code lost:
    
        CatchingFishWorkManager(r8, 0, r8, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d3, code lost:
    
        r9 = r12.CatchingFishRoomDatabase();
        r0 = r12.CatchingFishJUnitRealm;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01dc, code lost:
    
        if (r12.CatchingFishAnimation != (-1)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01de, code lost:
    
        r0 = 1.0f / r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e0, code lost:
    
        CatchingFishWorkManager(r6, r9, r6, (int) ((r9 * r0) + 0.5f), r12);
        r12.CatchingFishReduxKtor.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(r12.CatchingFishRoomDatabase());
        r12.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(r12.CatchingFishCloudMessaging());
        r12.CatchingFishParcelableFAB = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0208, code lost:
    
        if (r1 != 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020a, code lost:
    
        CatchingFishWorkManager(r13, 0, r8, 0, r12);
        r12.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.CatchingFishOkHttp = r12.CatchingFishCloudMessaging();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x021f, code lost:
    
        r11 = r8;
        r8 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0222, code lost:
    
        if (r1 != 2) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0224, code lost:
    
        r7 = r2[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0226, code lost:
    
        if (r7 == r6) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0229, code lost:
    
        if (r7 != 4) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x022c, code lost:
    
        r0 = r8;
        r7 = r10;
        r10 = r11;
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0231, code lost:
    
        CatchingFishWorkManager(r8, r12.CatchingFishRoomDatabase(), r6, (int) ((r14 * r25.CatchingFishCloudMessaging()) + 0.5f), r12);
        r12.CatchingFishReduxKtor.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(r12.CatchingFishRoomDatabase());
        r12.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(r12.CatchingFishCloudMessaging());
        r12.CatchingFishParcelableFAB = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x025f, code lost:
    
        r0 = r8;
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0267, code lost:
    
        if (r7[2].CatchingFishWorkManager == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
    
        if (r7[3].CatchingFishWorkManager != null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0272, code lost:
    
        r7 = r10;
        r10 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0337  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishSnackbar(CatchingFishGsonAppCompat catchingFishGsonAppCompat) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        CatchingFishMoshiIntentGson catchingFishMoshiIntentGson;
        int i9;
        ArrayList arrayList = catchingFishGsonAppCompat.CatchingFishFABLayout;
        int[] iArr = catchingFishGsonAppCompat.CatchingFishGlideWidgetKtor;
        int size = arrayList.size();
        char c = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit = (CatchingFishDaggerRetrofit) obj;
            int[] iArr2 = catchingFishDaggerRetrofit.CatchingFishGlideWidgetKtor;
            CatchingFishStripeAPIJUnit[] catchingFishStripeAPIJUnitArr = catchingFishDaggerRetrofit.CatchingFishLayoutInflater;
            CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit = catchingFishDaggerRetrofit.CatchingFishCameraXIntent;
            CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit2 = catchingFishDaggerRetrofit.CatchingFishEspressoMockk;
            CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit3 = catchingFishDaggerRetrofit.CatchingFishDagger;
            CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit4 = catchingFishDaggerRetrofit.CatchingFishSensorManager;
            int i11 = iArr2[c];
            int i12 = iArr2[1];
            char c2 = c;
            if (catchingFishDaggerRetrofit.CatchingFishMockkOkHttp == 8) {
                catchingFishDaggerRetrofit.CatchingFishParcelableFAB = true;
                c = c2;
            } else {
                float f = catchingFishDaggerRetrofit.CatchingFishSpannableWidget;
                if (f < 1.0f && i11 == 3) {
                    catchingFishDaggerRetrofit.CatchingFishNavigation = 2;
                }
                float f2 = catchingFishDaggerRetrofit.CatchingFishCardViewRealm;
                if (f2 < 1.0f && i12 == 3) {
                    catchingFishDaggerRetrofit.CatchingFish = 2;
                }
                if (catchingFishDaggerRetrofit.CatchingFishJUnitRealm > 0.0f) {
                    if (i11 == 3) {
                        i9 = 2;
                        if (i12 == 2 || i12 == 1) {
                            i = 3;
                            catchingFishDaggerRetrofit.CatchingFishNavigation = 3;
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 3;
                        i9 = 2;
                    }
                    if (i12 == i && (i11 == i9 || i11 == 1)) {
                        catchingFishDaggerRetrofit.CatchingFish = i;
                    } else if (i11 == i && i12 == i) {
                        if (catchingFishDaggerRetrofit.CatchingFishNavigation == 0) {
                            catchingFishDaggerRetrofit.CatchingFishNavigation = i;
                        }
                        if (catchingFishDaggerRetrofit.CatchingFish == 0) {
                            catchingFishDaggerRetrofit.CatchingFish = i;
                        }
                    }
                } else {
                    i = 3;
                }
                if (i11 == i && catchingFishDaggerRetrofit.CatchingFishNavigation == 1 && (catchingFishStripeAPIJUnit4.CatchingFishWorkManager == null || catchingFishStripeAPIJUnit3.CatchingFishWorkManager == null)) {
                    i11 = 2;
                }
                if (i12 == 3 && catchingFishDaggerRetrofit.CatchingFish == 1 && (catchingFishStripeAPIJUnit2.CatchingFishWorkManager == null || catchingFishStripeAPIJUnit.CatchingFishWorkManager == null)) {
                    i12 = 2;
                }
                CatchingFishCameraXBundle catchingFishCameraXBundle = catchingFishDaggerRetrofit.CatchingFishReduxKtor;
                catchingFishCameraXBundle.CatchingFishReduxKtor = i11;
                int i13 = catchingFishDaggerRetrofit.CatchingFishNavigation;
                catchingFishCameraXBundle.CatchingFishParcelableFAB = i13;
                CatchingFishMVPCardView catchingFishMVPCardView = catchingFishDaggerRetrofit.CatchingFishDaggerWebsocket;
                catchingFishMVPCardView.CatchingFishReduxKtor = i12;
                ArrayList arrayList2 = arrayList;
                int i14 = catchingFishDaggerRetrofit.CatchingFish;
                catchingFishMVPCardView.CatchingFishParcelableFAB = i14;
                int i15 = (i11 == 4 || i11 == 1) ? 2 : 2;
                if (i12 != 4) {
                    if (i12 == 1) {
                        i4 = 1;
                        i2 = i12;
                        i3 = i11;
                        int CatchingFishRoomDatabase = catchingFishDaggerRetrofit.CatchingFishRoomDatabase();
                        if (i3 == 4) {
                            CatchingFishRoomDatabase = (catchingFishGsonAppCompat.CatchingFishRoomDatabase() - catchingFishStripeAPIJUnit4.CatchingFishViewModelScope) - catchingFishStripeAPIJUnit3.CatchingFishViewModelScope;
                            i3 = i4;
                        }
                        int CatchingFishCloudMessaging = catchingFishDaggerRetrofit.CatchingFishCloudMessaging();
                        if (i2 != 4) {
                            int CatchingFishCloudMessaging2 = (catchingFishGsonAppCompat.CatchingFishCloudMessaging() - catchingFishStripeAPIJUnit2.CatchingFishViewModelScope) - catchingFishStripeAPIJUnit.CatchingFishViewModelScope;
                            i5 = i4;
                            catchingFishMoshiIntentGson = this;
                            i6 = i3;
                            i7 = CatchingFishRoomDatabase;
                            i8 = CatchingFishCloudMessaging2;
                        } else {
                            i5 = i2;
                            i6 = i3;
                            i7 = CatchingFishRoomDatabase;
                            i8 = CatchingFishCloudMessaging;
                            catchingFishMoshiIntentGson = this;
                        }
                        catchingFishMoshiIntentGson.CatchingFishWorkManager(i6, i7, i5, i8, catchingFishDaggerRetrofit);
                        catchingFishDaggerRetrofit.CatchingFishReduxKtor.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(catchingFishDaggerRetrofit.CatchingFishRoomDatabase());
                        catchingFishDaggerRetrofit.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(catchingFishDaggerRetrofit.CatchingFishCloudMessaging());
                        catchingFishDaggerRetrofit.CatchingFishParcelableFAB = true;
                        c = c2;
                        arrayList = arrayList2;
                    }
                }
                i2 = i12;
                i3 = i11;
                i4 = 1;
                int CatchingFishRoomDatabase2 = catchingFishDaggerRetrofit.CatchingFishRoomDatabase();
                if (i3 == 4) {
                }
                int CatchingFishCloudMessaging3 = catchingFishDaggerRetrofit.CatchingFishCloudMessaging();
                if (i2 != 4) {
                }
                catchingFishMoshiIntentGson.CatchingFishWorkManager(i6, i7, i5, i8, catchingFishDaggerRetrofit);
                catchingFishDaggerRetrofit.CatchingFishReduxKtor.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(catchingFishDaggerRetrofit.CatchingFishRoomDatabase());
                catchingFishDaggerRetrofit.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(catchingFishDaggerRetrofit.CatchingFishCloudMessaging());
                catchingFishDaggerRetrofit.CatchingFishParcelableFAB = true;
                c = c2;
                arrayList = arrayList2;
            }
        }
    }

    public final void CatchingFishViewModelScope() {
        CatchingFishViewGsonView catchingFishViewGsonView;
        CatchingFishMoshiIntentGson catchingFishMoshiIntentGson = this;
        ArrayList arrayList = catchingFishMoshiIntentGson.CatchingFishParcelableFAB.CatchingFishFABLayout;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit = (CatchingFishDaggerRetrofit) arrayList.get(i);
            if (!catchingFishDaggerRetrofit.CatchingFishParcelableFAB) {
                int[] iArr = catchingFishDaggerRetrofit.CatchingFishGlideWidgetKtor;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = catchingFishDaggerRetrofit.CatchingFishNavigation;
                int i6 = catchingFishDaggerRetrofit.CatchingFish;
                boolean z = i3 == 2 || (i3 == 3 && i5 == 1);
                boolean z2 = i4 == 2 || (i4 == 3 && i6 == 1);
                CatchingFishAndroidXKtor catchingFishAndroidXKtor = catchingFishDaggerRetrofit.CatchingFishReduxKtor.CatchingFishDaggerWebsocket;
                boolean z3 = catchingFishAndroidXKtor.CatchingFishFragmentHandler;
                CatchingFishAndroidXKtor catchingFishAndroidXKtor2 = catchingFishDaggerRetrofit.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket;
                boolean z4 = catchingFishAndroidXKtor2.CatchingFishFragmentHandler;
                boolean z5 = z;
                if (z3 && z4) {
                    catchingFishMoshiIntentGson.CatchingFishWorkManager(1, catchingFishAndroidXKtor.CatchingFishViewModelScope, 1, catchingFishAndroidXKtor2.CatchingFishViewModelScope, catchingFishDaggerRetrofit);
                    catchingFishDaggerRetrofit.CatchingFishParcelableFAB = true;
                } else if (z3 && z2) {
                    CatchingFishWorkManager(1, catchingFishAndroidXKtor.CatchingFishViewModelScope, 2, catchingFishAndroidXKtor2.CatchingFishViewModelScope, catchingFishDaggerRetrofit);
                    if (i4 == 3) {
                        catchingFishDaggerRetrofit.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.CatchingFishOkHttp = catchingFishDaggerRetrofit.CatchingFishCloudMessaging();
                    } else {
                        catchingFishDaggerRetrofit.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(catchingFishDaggerRetrofit.CatchingFishCloudMessaging());
                        catchingFishDaggerRetrofit.CatchingFishParcelableFAB = true;
                    }
                } else if (z4 && z5) {
                    CatchingFishWorkManager(2, catchingFishAndroidXKtor.CatchingFishViewModelScope, 1, catchingFishAndroidXKtor2.CatchingFishViewModelScope, catchingFishDaggerRetrofit);
                    if (i3 == 3) {
                        catchingFishDaggerRetrofit.CatchingFishReduxKtor.CatchingFishDaggerWebsocket.CatchingFishOkHttp = catchingFishDaggerRetrofit.CatchingFishRoomDatabase();
                    } else {
                        catchingFishDaggerRetrofit.CatchingFishReduxKtor.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(catchingFishDaggerRetrofit.CatchingFishRoomDatabase());
                        catchingFishDaggerRetrofit.CatchingFishParcelableFAB = true;
                    }
                }
                if (catchingFishDaggerRetrofit.CatchingFishParcelableFAB && (catchingFishViewGsonView = catchingFishDaggerRetrofit.CatchingFishDaggerWebsocket.CatchingFishEspressoTesting) != null) {
                    catchingFishViewGsonView.CatchingFishReduxKtor(catchingFishDaggerRetrofit.CatchingFishMoshiDaggerHilt);
                }
                catchingFishMoshiIntentGson = this;
            }
            i = i2;
        }
    }

    public final void CatchingFishWorkManager(int i, int i2, int i3, int i4, CatchingFishDaggerRetrofit catchingFishDaggerRetrofit) {
        CatchingFishGsonBiometric catchingFishGsonBiometric = this.CatchingFishViewModelScope;
        catchingFishGsonBiometric.CatchingFishParcelableFAB = i;
        catchingFishGsonBiometric.CatchingFishSnackbar = i3;
        catchingFishGsonBiometric.CatchingFishCoroutine = i2;
        catchingFishGsonBiometric.CatchingFishReduxKtor = i4;
        this.CatchingFishWorkManager.CatchingFishSnackbar(catchingFishDaggerRetrofit, catchingFishGsonBiometric);
        catchingFishDaggerRetrofit.CatchingFishGradleManifest(catchingFishGsonBiometric.CatchingFishDaggerWebsocket);
        catchingFishDaggerRetrofit.CatchingFishCameraXIntent(catchingFishGsonBiometric.CatchingFishWorkManager);
        catchingFishDaggerRetrofit.CatchingFishFragmentFactory = catchingFishGsonBiometric.CatchingFishViewModelFAB;
        catchingFishDaggerRetrofit.CatchingFishSensorManager(catchingFishGsonBiometric.CatchingFishViewModelScope);
    }
}
