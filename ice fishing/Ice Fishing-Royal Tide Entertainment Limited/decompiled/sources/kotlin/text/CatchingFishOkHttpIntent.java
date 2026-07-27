package kotlin.text;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishOkHttpIntent {
    public static final CatchingFishOkHttpIntent CatchingFishDaggerWebsocket = new CatchingFishOkHttpIntent(0, 0, new Object[0], null);
    public final CatchingFishWidgetContext CatchingFishCoroutine;
    public int CatchingFishParcelableFAB;
    public Object[] CatchingFishReduxKtor;
    public int CatchingFishSnackbar;

    public CatchingFishOkHttpIntent(int i, int i2, Object[] objArr, CatchingFishWidgetContext catchingFishWidgetContext) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = i2;
        this.CatchingFishCoroutine = catchingFishWidgetContext;
        this.CatchingFishReduxKtor = objArr;
    }

    public static CatchingFishOkHttpIntent CatchingFishFragmentHandler(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, CatchingFishWidgetContext catchingFishWidgetContext) {
        if (i3 > 30) {
            return new CatchingFishOkHttpIntent(0, 0, new Object[]{obj, obj2, obj3, obj4}, catchingFishWidgetContext);
        }
        int CatchingFishDaggerHiltFAB = CatchingFishLayoutRoom.CatchingFishDaggerHiltFAB(i, i3);
        int CatchingFishDaggerHiltFAB2 = CatchingFishLayoutRoom.CatchingFishDaggerHiltFAB(i2, i3);
        if (CatchingFishDaggerHiltFAB != CatchingFishDaggerHiltFAB2) {
            return new CatchingFishOkHttpIntent((1 << CatchingFishDaggerHiltFAB) | (1 << CatchingFishDaggerHiltFAB2), 0, CatchingFishDaggerHiltFAB < CatchingFishDaggerHiltFAB2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, catchingFishWidgetContext);
        }
        return new CatchingFishOkHttpIntent(0, 1 << CatchingFishDaggerHiltFAB, new Object[]{CatchingFishFragmentHandler(i, obj, obj2, i2, obj3, obj4, i3 + 5, catchingFishWidgetContext)}, catchingFishWidgetContext);
    }

    public final CatchingFishOkHttpIntent CatchingFish(int i) {
        Object obj = this.CatchingFishReduxKtor[i];
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (CatchingFishOkHttpIntent) obj;
    }

    public final CatchingFishOkHttpIntent CatchingFishAnimationMockk(int i, Object obj, Object obj2, int i2, CatchingFishHiltGraphQL catchingFishHiltGraphQL) {
        CatchingFishOkHttpIntent catchingFishOkHttpIntent;
        CatchingFishOkHttpIntent CatchingFishAnimationMockk;
        int CatchingFishDaggerHiltFAB = 1 << CatchingFishLayoutRoom.CatchingFishDaggerHiltFAB(i, i2);
        if (CatchingFishViewModelFAB(CatchingFishDaggerHiltFAB)) {
            int CatchingFishWorkManager = CatchingFishWorkManager(CatchingFishDaggerHiltFAB);
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, this.CatchingFishReduxKtor[CatchingFishWorkManager]) && CatchingFishFirebaseDagger.CatchingFishOkHttp(obj2, CatchingFishParcelableFlux(CatchingFishWorkManager))) {
                return CatchingFishStateLiveData(CatchingFishWorkManager, CatchingFishDaggerHiltFAB, catchingFishHiltGraphQL);
            }
        } else if (CatchingFishLayout(CatchingFishDaggerHiltFAB)) {
            int CatchingFishJetpackCompose = CatchingFishJetpackCompose(CatchingFishDaggerHiltFAB);
            CatchingFishOkHttpIntent CatchingFish = CatchingFish(CatchingFishJetpackCompose);
            if (i2 == 30) {
                CatchingFishRetrofitService CatchingFishStateFlow = CatchingFishOkHttpFAB.CatchingFishStateFlow(CatchingFishOkHttpFAB.CatchingFishMoshiDaggerHilt(0, CatchingFish.CatchingFishReduxKtor.length));
                int i3 = CatchingFishStateFlow.CatchingFishReduxKtor;
                int i4 = CatchingFishStateFlow.CatchingFishDaggerWebsocket;
                int i5 = CatchingFishStateFlow.CatchingFishWorkManager;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, CatchingFish.CatchingFishReduxKtor[i3]) || !CatchingFishFirebaseDagger.CatchingFishOkHttp(obj2, CatchingFish.CatchingFishParcelableFlux(i3))) {
                            if (i3 == i4) {
                                break;
                            }
                            i3 += i5;
                        } else {
                            CatchingFishAnimationMockk = CatchingFish.CatchingFishCloudMessaging(i3, catchingFishHiltGraphQL);
                            break;
                        }
                    }
                }
                CatchingFishAnimationMockk = CatchingFish;
                catchingFishOkHttpIntent = CatchingFish;
            } else {
                catchingFishOkHttpIntent = CatchingFish;
                CatchingFishAnimationMockk = catchingFishOkHttpIntent.CatchingFishAnimationMockk(i, obj, obj2, i2 + 5, catchingFishHiltGraphQL);
            }
            return CatchingFishRoomDatabase(catchingFishOkHttpIntent, CatchingFishAnimationMockk, CatchingFishJetpackCompose, CatchingFishDaggerHiltFAB, catchingFishHiltGraphQL.CatchingFishReduxKtor);
        }
        return this;
    }

    public final CatchingFishOkHttpIntent CatchingFishCloudMessaging(int i, CatchingFishHiltGraphQL catchingFishHiltGraphQL) {
        catchingFishHiltGraphQL.CatchingFishDaggerWebsocket(catchingFishHiltGraphQL.CatchingFishViewModelFAB - 1);
        catchingFishHiltGraphQL.CatchingFishWorkManager = CatchingFishParcelableFlux(i);
        Object[] objArr = this.CatchingFishReduxKtor;
        if (objArr.length == 2) {
            return null;
        }
        if (this.CatchingFishCoroutine != catchingFishHiltGraphQL.CatchingFishReduxKtor) {
            return new CatchingFishOkHttpIntent(0, 0, CatchingFishLayoutRoom.CatchingFishDaggerWebsocket(i, objArr), catchingFishHiltGraphQL.CatchingFishReduxKtor);
        }
        this.CatchingFishReduxKtor = CatchingFishLayoutRoom.CatchingFishDaggerWebsocket(i, objArr);
        return this;
    }

    public final boolean CatchingFishCoroutine(Object obj) {
        CatchingFishRetrofitService CatchingFishStateFlow = CatchingFishOkHttpFAB.CatchingFishStateFlow(CatchingFishOkHttpFAB.CatchingFishMoshiDaggerHilt(0, this.CatchingFishReduxKtor.length));
        int i = CatchingFishStateFlow.CatchingFishReduxKtor;
        int i2 = CatchingFishStateFlow.CatchingFishDaggerWebsocket;
        int i3 = CatchingFishStateFlow.CatchingFishWorkManager;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, this.CatchingFishReduxKtor[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d0, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dc, code lost:
    
        r14.CatchingFishDaggerWebsocket = CatchingFishSpannableWidget(r12, r4, (kotlin.text.CatchingFishOkHttpIntent) r14.CatchingFishDaggerWebsocket);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e6, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d9, code lost:
    
        if (r14 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CatchingFishRoomManifest CatchingFishCoroutineFlow(int i, int i2, Object obj, Object obj2) {
        CatchingFishRoomManifest CatchingFishCoroutineFlow;
        int i3 = 1;
        int CatchingFishDaggerHiltFAB = 1 << CatchingFishLayoutRoom.CatchingFishDaggerHiltFAB(i, i2);
        int i4 = 0;
        if (CatchingFishViewModelFAB(CatchingFishDaggerHiltFAB)) {
            int CatchingFishWorkManager = CatchingFishWorkManager(CatchingFishDaggerHiltFAB);
            if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, this.CatchingFishReduxKtor[CatchingFishWorkManager])) {
                return new CatchingFishRoomManifest(i3, new CatchingFishOkHttpIntent(this.CatchingFishParcelableFAB ^ CatchingFishDaggerHiltFAB, this.CatchingFishSnackbar | CatchingFishDaggerHiltFAB, CatchingFishParcelableFAB(CatchingFishWorkManager, CatchingFishDaggerHiltFAB, i, obj, obj2, i2, null), null));
            }
            if (CatchingFishParcelableFlux(CatchingFishWorkManager) != obj2) {
                Object[] objArr = this.CatchingFishReduxKtor;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
                copyOf[CatchingFishWorkManager + 1] = obj2;
                return new CatchingFishRoomManifest(i4, new CatchingFishOkHttpIntent(this.CatchingFishParcelableFAB, this.CatchingFishSnackbar, copyOf, null));
            }
        } else {
            if (!CatchingFishLayout(CatchingFishDaggerHiltFAB)) {
                return new CatchingFishRoomManifest(i3, new CatchingFishOkHttpIntent(this.CatchingFishParcelableFAB | CatchingFishDaggerHiltFAB, this.CatchingFishSnackbar, CatchingFishLayoutRoom.CatchingFishSnackbar(this.CatchingFishReduxKtor, CatchingFishWorkManager(CatchingFishDaggerHiltFAB), obj, obj2), null));
            }
            int CatchingFishJetpackCompose = CatchingFishJetpackCompose(CatchingFishDaggerHiltFAB);
            CatchingFishOkHttpIntent CatchingFish = CatchingFish(CatchingFishJetpackCompose);
            if (i2 == 30) {
                CatchingFishRetrofitService CatchingFishStateFlow = CatchingFishOkHttpFAB.CatchingFishStateFlow(CatchingFishOkHttpFAB.CatchingFishMoshiDaggerHilt(0, CatchingFish.CatchingFishReduxKtor.length));
                int i5 = CatchingFishStateFlow.CatchingFishReduxKtor;
                int i6 = CatchingFishStateFlow.CatchingFishDaggerWebsocket;
                int i7 = CatchingFishStateFlow.CatchingFishWorkManager;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (!CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, CatchingFish.CatchingFishReduxKtor[i5])) {
                        if (i5 != i6) {
                            i5 += i7;
                        }
                    }
                    if (obj2 == CatchingFish.CatchingFishParcelableFlux(i5)) {
                        CatchingFishCoroutineFlow = null;
                    } else {
                        Object[] objArr2 = CatchingFish.CatchingFishReduxKtor;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf2, "copyOf(...)");
                        copyOf2[i5 + 1] = obj2;
                        CatchingFishCoroutineFlow = new CatchingFishRoomManifest(i4, new CatchingFishOkHttpIntent(0, 0, copyOf2, null));
                    }
                }
                CatchingFishCoroutineFlow = new CatchingFishRoomManifest(i3, new CatchingFishOkHttpIntent(0, 0, CatchingFishLayoutRoom.CatchingFishSnackbar(CatchingFish.CatchingFishReduxKtor, 0, obj, obj2), null));
                break;
            }
            CatchingFishCoroutineFlow = CatchingFish.CatchingFishCoroutineFlow(i, i2 + 5, obj, obj2);
        }
        return null;
    }

    public final CatchingFishOkHttpIntent CatchingFishDaggerHiltFAB(int i, int i2, Object obj) {
        CatchingFishOkHttpIntent CatchingFishDaggerHiltFAB;
        int CatchingFishDaggerHiltFAB2 = 1 << CatchingFishLayoutRoom.CatchingFishDaggerHiltFAB(i, i2);
        if (CatchingFishViewModelFAB(CatchingFishDaggerHiltFAB2)) {
            int CatchingFishWorkManager = CatchingFishWorkManager(CatchingFishDaggerHiltFAB2);
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, this.CatchingFishReduxKtor[CatchingFishWorkManager])) {
                Object[] objArr = this.CatchingFishReduxKtor;
                if (objArr.length != 2) {
                    return new CatchingFishOkHttpIntent(this.CatchingFishParcelableFAB ^ CatchingFishDaggerHiltFAB2, this.CatchingFishSnackbar, CatchingFishLayoutRoom.CatchingFishDaggerWebsocket(CatchingFishWorkManager, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (CatchingFishLayout(CatchingFishDaggerHiltFAB2)) {
            int CatchingFishJetpackCompose = CatchingFishJetpackCompose(CatchingFishDaggerHiltFAB2);
            CatchingFishOkHttpIntent CatchingFish = CatchingFish(CatchingFishJetpackCompose);
            if (i2 == 30) {
                CatchingFishRetrofitService CatchingFishStateFlow = CatchingFishOkHttpFAB.CatchingFishStateFlow(CatchingFishOkHttpFAB.CatchingFishMoshiDaggerHilt(0, CatchingFish.CatchingFishReduxKtor.length));
                int i3 = CatchingFishStateFlow.CatchingFishReduxKtor;
                int i4 = CatchingFishStateFlow.CatchingFishDaggerWebsocket;
                int i5 = CatchingFishStateFlow.CatchingFishWorkManager;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, CatchingFish.CatchingFishReduxKtor[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = CatchingFish.CatchingFishReduxKtor;
                    CatchingFishDaggerHiltFAB = objArr2.length == 2 ? null : new CatchingFishOkHttpIntent(0, 0, CatchingFishLayoutRoom.CatchingFishDaggerWebsocket(i3, objArr2), null);
                }
                CatchingFishDaggerHiltFAB = CatchingFish;
                break;
            }
            CatchingFishDaggerHiltFAB = CatchingFish.CatchingFishDaggerHiltFAB(i, i2 + 5, obj);
            if (CatchingFishDaggerHiltFAB == null) {
                Object[] objArr3 = this.CatchingFishReduxKtor;
                if (objArr3.length != 1) {
                    return new CatchingFishOkHttpIntent(this.CatchingFishParcelableFAB, CatchingFishDaggerHiltFAB2 ^ this.CatchingFishSnackbar, CatchingFishLayoutRoom.CatchingFishWorkManager(CatchingFishJetpackCompose, objArr3), null);
                }
                return null;
            }
            if (CatchingFish != CatchingFishDaggerHiltFAB) {
                return CatchingFishSpannableWidget(CatchingFishJetpackCompose, CatchingFishDaggerHiltFAB2, CatchingFishDaggerHiltFAB);
            }
        }
        return this;
    }

    public final boolean CatchingFishDaggerWebsocket(CatchingFishOkHttpIntent catchingFishOkHttpIntent) {
        if (this == catchingFishOkHttpIntent) {
            return true;
        }
        if (this.CatchingFishSnackbar == catchingFishOkHttpIntent.CatchingFishSnackbar && this.CatchingFishParcelableFAB == catchingFishOkHttpIntent.CatchingFishParcelableFAB) {
            int length = this.CatchingFishReduxKtor.length;
            for (int i = 0; i < length; i++) {
                if (this.CatchingFishReduxKtor[i] == catchingFishOkHttpIntent.CatchingFishReduxKtor[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final CatchingFishOkHttpIntent CatchingFishEspressoTesting(int i, Object obj, Object obj2, int i2, CatchingFishHiltGraphQL catchingFishHiltGraphQL) {
        CatchingFishHiltGraphQL catchingFishHiltGraphQL2;
        CatchingFishOkHttpIntent CatchingFishEspressoTesting;
        int CatchingFishDaggerHiltFAB = 1 << CatchingFishLayoutRoom.CatchingFishDaggerHiltFAB(i, i2);
        boolean CatchingFishViewModelFAB = CatchingFishViewModelFAB(CatchingFishDaggerHiltFAB);
        CatchingFishWidgetContext catchingFishWidgetContext = this.CatchingFishCoroutine;
        if (CatchingFishViewModelFAB) {
            int CatchingFishWorkManager = CatchingFishWorkManager(CatchingFishDaggerHiltFAB);
            if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, this.CatchingFishReduxKtor[CatchingFishWorkManager])) {
                catchingFishHiltGraphQL.CatchingFishDaggerWebsocket(catchingFishHiltGraphQL.CatchingFishViewModelFAB + 1);
                CatchingFishWidgetContext catchingFishWidgetContext2 = catchingFishHiltGraphQL.CatchingFishReduxKtor;
                if (catchingFishWidgetContext != catchingFishWidgetContext2) {
                    return new CatchingFishOkHttpIntent(this.CatchingFishParcelableFAB ^ CatchingFishDaggerHiltFAB, this.CatchingFishSnackbar | CatchingFishDaggerHiltFAB, CatchingFishParcelableFAB(CatchingFishWorkManager, CatchingFishDaggerHiltFAB, i, obj, obj2, i2, catchingFishWidgetContext2), catchingFishWidgetContext2);
                }
                this.CatchingFishReduxKtor = CatchingFishParcelableFAB(CatchingFishWorkManager, CatchingFishDaggerHiltFAB, i, obj, obj2, i2, catchingFishWidgetContext2);
                this.CatchingFishParcelableFAB ^= CatchingFishDaggerHiltFAB;
                this.CatchingFishSnackbar |= CatchingFishDaggerHiltFAB;
                return this;
            }
            catchingFishHiltGraphQL.CatchingFishWorkManager = CatchingFishParcelableFlux(CatchingFishWorkManager);
            if (CatchingFishParcelableFlux(CatchingFishWorkManager) == obj2) {
                return this;
            }
            if (catchingFishWidgetContext == catchingFishHiltGraphQL.CatchingFishReduxKtor) {
                this.CatchingFishReduxKtor[CatchingFishWorkManager + 1] = obj2;
                return this;
            }
            catchingFishHiltGraphQL.CatchingFishViewModelScope++;
            Object[] objArr = this.CatchingFishReduxKtor;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
            copyOf[CatchingFishWorkManager + 1] = obj2;
            return new CatchingFishOkHttpIntent(this.CatchingFishParcelableFAB, this.CatchingFishSnackbar, copyOf, catchingFishHiltGraphQL.CatchingFishReduxKtor);
        }
        if (!CatchingFishLayout(CatchingFishDaggerHiltFAB)) {
            catchingFishHiltGraphQL.CatchingFishDaggerWebsocket(catchingFishHiltGraphQL.CatchingFishViewModelFAB + 1);
            CatchingFishWidgetContext catchingFishWidgetContext3 = catchingFishHiltGraphQL.CatchingFishReduxKtor;
            int CatchingFishWorkManager2 = CatchingFishWorkManager(CatchingFishDaggerHiltFAB);
            if (catchingFishWidgetContext != catchingFishWidgetContext3) {
                return new CatchingFishOkHttpIntent(this.CatchingFishParcelableFAB | CatchingFishDaggerHiltFAB, this.CatchingFishSnackbar, CatchingFishLayoutRoom.CatchingFishSnackbar(this.CatchingFishReduxKtor, CatchingFishWorkManager2, obj, obj2), catchingFishWidgetContext3);
            }
            this.CatchingFishReduxKtor = CatchingFishLayoutRoom.CatchingFishSnackbar(this.CatchingFishReduxKtor, CatchingFishWorkManager2, obj, obj2);
            this.CatchingFishParcelableFAB |= CatchingFishDaggerHiltFAB;
            return this;
        }
        int CatchingFishJetpackCompose = CatchingFishJetpackCompose(CatchingFishDaggerHiltFAB);
        CatchingFishOkHttpIntent CatchingFish = CatchingFish(CatchingFishJetpackCompose);
        if (i2 == 30) {
            CatchingFishRetrofitService CatchingFishStateFlow = CatchingFishOkHttpFAB.CatchingFishStateFlow(CatchingFishOkHttpFAB.CatchingFishMoshiDaggerHilt(0, CatchingFish.CatchingFishReduxKtor.length));
            int i3 = CatchingFishStateFlow.CatchingFishReduxKtor;
            int i4 = CatchingFishStateFlow.CatchingFishDaggerWebsocket;
            int i5 = CatchingFishStateFlow.CatchingFishWorkManager;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (!CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, CatchingFish.CatchingFishReduxKtor[i3])) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                catchingFishHiltGraphQL.CatchingFishWorkManager = CatchingFish.CatchingFishParcelableFlux(i3);
                if (CatchingFish.CatchingFishCoroutine == catchingFishHiltGraphQL.CatchingFishReduxKtor) {
                    CatchingFish.CatchingFishReduxKtor[i3 + 1] = obj2;
                    CatchingFishEspressoTesting = CatchingFish;
                } else {
                    catchingFishHiltGraphQL.CatchingFishViewModelScope++;
                    Object[] objArr2 = CatchingFish.CatchingFishReduxKtor;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf2, "copyOf(...)");
                    copyOf2[i3 + 1] = obj2;
                    CatchingFishEspressoTesting = new CatchingFishOkHttpIntent(0, 0, copyOf2, catchingFishHiltGraphQL.CatchingFishReduxKtor);
                }
                catchingFishHiltGraphQL2 = catchingFishHiltGraphQL;
            }
            catchingFishHiltGraphQL.CatchingFishDaggerWebsocket(catchingFishHiltGraphQL.CatchingFishViewModelFAB + 1);
            CatchingFishEspressoTesting = new CatchingFishOkHttpIntent(0, 0, CatchingFishLayoutRoom.CatchingFishSnackbar(CatchingFish.CatchingFishReduxKtor, 0, obj, obj2), catchingFishHiltGraphQL.CatchingFishReduxKtor);
            catchingFishHiltGraphQL2 = catchingFishHiltGraphQL;
        } else {
            catchingFishHiltGraphQL2 = catchingFishHiltGraphQL;
            CatchingFishEspressoTesting = CatchingFish.CatchingFishEspressoTesting(i, obj, obj2, i2 + 5, catchingFishHiltGraphQL2);
        }
        return CatchingFish == CatchingFishEspressoTesting ? this : CatchingFishNavigation(CatchingFishJetpackCompose, CatchingFishEspressoTesting, catchingFishHiltGraphQL2.CatchingFishReduxKtor);
    }

    public final int CatchingFishJetpackCompose(int i) {
        return (this.CatchingFishReduxKtor.length - 1) - Integer.bitCount((i - 1) & this.CatchingFishSnackbar);
    }

    public final boolean CatchingFishLayout(int i) {
        return (i & this.CatchingFishSnackbar) != 0;
    }

    public final CatchingFishOkHttpIntent CatchingFishNavigation(int i, CatchingFishOkHttpIntent catchingFishOkHttpIntent, CatchingFishWidgetContext catchingFishWidgetContext) {
        Object[] objArr = this.CatchingFishReduxKtor;
        if (objArr.length == 1 && catchingFishOkHttpIntent.CatchingFishReduxKtor.length == 2 && catchingFishOkHttpIntent.CatchingFishSnackbar == 0) {
            catchingFishOkHttpIntent.CatchingFishParcelableFAB = this.CatchingFishSnackbar;
            return catchingFishOkHttpIntent;
        }
        if (this.CatchingFishCoroutine == catchingFishWidgetContext) {
            objArr[i] = catchingFishOkHttpIntent;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
        copyOf[i] = catchingFishOkHttpIntent;
        return new CatchingFishOkHttpIntent(this.CatchingFishParcelableFAB, this.CatchingFishSnackbar, copyOf, catchingFishWidgetContext);
    }

    public final CatchingFishOkHttpIntent CatchingFishOkHttp(CatchingFishOkHttpIntent catchingFishOkHttpIntent, int i, CatchingFishRetrofitRedux catchingFishRetrofitRedux, CatchingFishHiltGraphQL catchingFishHiltGraphQL) {
        Object[] objArr;
        CatchingFishOkHttpIntent CatchingFishFragmentHandler;
        if (this == catchingFishOkHttpIntent) {
            catchingFishRetrofitRedux.CatchingFishParcelableFAB += CatchingFishSnackbar();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            CatchingFishWidgetContext catchingFishWidgetContext = catchingFishHiltGraphQL.CatchingFishReduxKtor;
            int i3 = catchingFishOkHttpIntent.CatchingFishSnackbar;
            Object[] objArr2 = this.CatchingFishReduxKtor;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + catchingFishOkHttpIntent.CatchingFishReduxKtor.length);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
            int length = this.CatchingFishReduxKtor.length;
            CatchingFishRetrofitService CatchingFishStateFlow = CatchingFishOkHttpFAB.CatchingFishStateFlow(CatchingFishOkHttpFAB.CatchingFishMoshiDaggerHilt(0, catchingFishOkHttpIntent.CatchingFishReduxKtor.length));
            int i4 = CatchingFishStateFlow.CatchingFishReduxKtor;
            int i5 = CatchingFishStateFlow.CatchingFishDaggerWebsocket;
            int i6 = CatchingFishStateFlow.CatchingFishWorkManager;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (CatchingFishCoroutine(catchingFishOkHttpIntent.CatchingFishReduxKtor[i4])) {
                        catchingFishRetrofitRedux.CatchingFishParcelableFAB++;
                    } else {
                        Object[] objArr3 = catchingFishOkHttpIntent.CatchingFishReduxKtor;
                        copyOf[length] = objArr3[i4];
                        copyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.CatchingFishReduxKtor.length) {
                if (length == catchingFishOkHttpIntent.CatchingFishReduxKtor.length) {
                    return catchingFishOkHttpIntent;
                }
                if (length == copyOf.length) {
                    return new CatchingFishOkHttpIntent(0, 0, copyOf, catchingFishWidgetContext);
                }
                Object[] copyOf2 = Arrays.copyOf(copyOf, length);
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf2, "copyOf(...)");
                return new CatchingFishOkHttpIntent(0, 0, copyOf2, catchingFishWidgetContext);
            }
        } else {
            int i7 = this.CatchingFishSnackbar | catchingFishOkHttpIntent.CatchingFishSnackbar;
            int i8 = this.CatchingFishParcelableFAB;
            int i9 = catchingFishOkHttpIntent.CatchingFishParcelableFAB;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i11);
                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor[CatchingFishWorkManager(lowestOneBit)], catchingFishOkHttpIntent.CatchingFishReduxKtor[catchingFishOkHttpIntent.CatchingFishWorkManager(lowestOneBit)])) {
                    i12 |= lowestOneBit;
                } else {
                    i7 |= lowestOneBit;
                }
                i11 ^= lowestOneBit;
            }
            if ((i7 & i12) != 0) {
                CatchingFishMVPAndroidXKtor.CatchingFishSnackbar("Check failed.");
            }
            CatchingFishOkHttpIntent catchingFishOkHttpIntent2 = (CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishCoroutine, catchingFishHiltGraphQL.CatchingFishReduxKtor) && this.CatchingFishParcelableFAB == i12 && this.CatchingFishSnackbar == i7) ? this : new CatchingFishOkHttpIntent(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = catchingFishOkHttpIntent2.CatchingFishReduxKtor;
                int length2 = (objArr4.length - 1) - i14;
                if (CatchingFishLayout(lowestOneBit2)) {
                    CatchingFishFragmentHandler = CatchingFish(CatchingFishJetpackCompose(lowestOneBit2));
                    if (catchingFishOkHttpIntent.CatchingFishLayout(lowestOneBit2)) {
                        CatchingFishFragmentHandler = CatchingFishFragmentHandler.CatchingFishOkHttp(catchingFishOkHttpIntent.CatchingFish(catchingFishOkHttpIntent.CatchingFishJetpackCompose(lowestOneBit2)), i + 5, catchingFishRetrofitRedux, catchingFishHiltGraphQL);
                        objArr = objArr4;
                    } else if (catchingFishOkHttpIntent.CatchingFishViewModelFAB(lowestOneBit2)) {
                        int CatchingFishWorkManager = catchingFishOkHttpIntent.CatchingFishWorkManager(lowestOneBit2);
                        Object obj = catchingFishOkHttpIntent.CatchingFishReduxKtor[CatchingFishWorkManager];
                        Object CatchingFishParcelableFlux = catchingFishOkHttpIntent.CatchingFishParcelableFlux(CatchingFishWorkManager);
                        int i15 = catchingFishHiltGraphQL.CatchingFishViewModelFAB;
                        objArr = objArr4;
                        CatchingFishFragmentHandler = CatchingFishFragmentHandler.CatchingFishEspressoTesting(obj != null ? obj.hashCode() : i2, obj, CatchingFishParcelableFlux, i + 5, catchingFishHiltGraphQL);
                        if (catchingFishHiltGraphQL.CatchingFishViewModelFAB == i15) {
                            catchingFishRetrofitRedux.CatchingFishParcelableFAB++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (catchingFishOkHttpIntent.CatchingFishLayout(lowestOneBit2)) {
                        CatchingFishOkHttpIntent CatchingFish = catchingFishOkHttpIntent.CatchingFish(catchingFishOkHttpIntent.CatchingFishJetpackCompose(lowestOneBit2));
                        if (CatchingFishViewModelFAB(lowestOneBit2)) {
                            int CatchingFishWorkManager2 = CatchingFishWorkManager(lowestOneBit2);
                            Object obj2 = this.CatchingFishReduxKtor[CatchingFishWorkManager2];
                            int i16 = i + 5;
                            if (CatchingFish.CatchingFishReduxKtor(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                catchingFishRetrofitRedux.CatchingFishParcelableFAB++;
                            } else {
                                CatchingFishFragmentHandler = CatchingFish.CatchingFishEspressoTesting(obj2 != null ? obj2.hashCode() : 0, obj2, CatchingFishParcelableFlux(CatchingFishWorkManager2), i16, catchingFishHiltGraphQL);
                            }
                        }
                        CatchingFishFragmentHandler = CatchingFish;
                    } else {
                        int CatchingFishWorkManager3 = CatchingFishWorkManager(lowestOneBit2);
                        Object obj3 = this.CatchingFishReduxKtor[CatchingFishWorkManager3];
                        Object CatchingFishParcelableFlux2 = CatchingFishParcelableFlux(CatchingFishWorkManager3);
                        int CatchingFishWorkManager4 = catchingFishOkHttpIntent.CatchingFishWorkManager(lowestOneBit2);
                        Object obj4 = catchingFishOkHttpIntent.CatchingFishReduxKtor[CatchingFishWorkManager4];
                        CatchingFishFragmentHandler = CatchingFishFragmentHandler(obj3 != null ? obj3.hashCode() : 0, obj3, CatchingFishParcelableFlux2, obj4 != null ? obj4.hashCode() : 0, obj4, catchingFishOkHttpIntent.CatchingFishParcelableFlux(CatchingFishWorkManager4), i + 5, catchingFishHiltGraphQL.CatchingFishReduxKtor);
                    }
                }
                objArr[length2] = CatchingFishFragmentHandler;
                i14++;
                i13 ^= lowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (catchingFishOkHttpIntent.CatchingFishViewModelFAB(lowestOneBit3)) {
                    int CatchingFishWorkManager5 = catchingFishOkHttpIntent.CatchingFishWorkManager(lowestOneBit3);
                    Object[] objArr5 = catchingFishOkHttpIntent2.CatchingFishReduxKtor;
                    objArr5[i18] = catchingFishOkHttpIntent.CatchingFishReduxKtor[CatchingFishWorkManager5];
                    objArr5[i18 + 1] = catchingFishOkHttpIntent.CatchingFishParcelableFlux(CatchingFishWorkManager5);
                    if (CatchingFishViewModelFAB(lowestOneBit3)) {
                        catchingFishRetrofitRedux.CatchingFishParcelableFAB++;
                    }
                } else {
                    int CatchingFishWorkManager6 = CatchingFishWorkManager(lowestOneBit3);
                    Object[] objArr6 = catchingFishOkHttpIntent2.CatchingFishReduxKtor;
                    objArr6[i18] = this.CatchingFishReduxKtor[CatchingFishWorkManager6];
                    objArr6[i18 + 1] = CatchingFishParcelableFlux(CatchingFishWorkManager6);
                }
                i17++;
                i12 ^= lowestOneBit3;
            }
            if (!CatchingFishDaggerWebsocket(catchingFishOkHttpIntent2)) {
                return catchingFishOkHttpIntent.CatchingFishDaggerWebsocket(catchingFishOkHttpIntent2) ? catchingFishOkHttpIntent : catchingFishOkHttpIntent2;
            }
        }
        return this;
    }

    public final Object[] CatchingFishParcelableFAB(int i, int i2, int i3, Object obj, Object obj2, int i4, CatchingFishWidgetContext catchingFishWidgetContext) {
        Object obj3 = this.CatchingFishReduxKtor[i];
        CatchingFishOkHttpIntent CatchingFishFragmentHandler = CatchingFishFragmentHandler(obj3 != null ? obj3.hashCode() : 0, obj3, CatchingFishParcelableFlux(i), i3, obj, obj2, i4 + 5, catchingFishWidgetContext);
        int CatchingFishJetpackCompose = CatchingFishJetpackCompose(i2);
        int i5 = CatchingFishJetpackCompose + 1;
        Object[] objArr = this.CatchingFishReduxKtor;
        Object[] objArr2 = new Object[objArr.length - 1];
        CatchingFishMVVMHilt.CatchingFishStateFlow(objArr, objArr2, 0, i, 6);
        CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, objArr2, i, i + 2, i5);
        objArr2[CatchingFishJetpackCompose - 1] = CatchingFishFragmentHandler;
        CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, objArr2, CatchingFishJetpackCompose, i5, objArr.length);
        return objArr2;
    }

    public final Object CatchingFishParcelableFlux(int i) {
        return this.CatchingFishReduxKtor[i + 1];
    }

    public final boolean CatchingFishReduxKtor(int i, int i2, Object obj) {
        int CatchingFishDaggerHiltFAB = 1 << CatchingFishLayoutRoom.CatchingFishDaggerHiltFAB(i, i2);
        if (CatchingFishViewModelFAB(CatchingFishDaggerHiltFAB)) {
            return CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, this.CatchingFishReduxKtor[CatchingFishWorkManager(CatchingFishDaggerHiltFAB)]);
        }
        if (!CatchingFishLayout(CatchingFishDaggerHiltFAB)) {
            return false;
        }
        CatchingFishOkHttpIntent CatchingFish = CatchingFish(CatchingFishJetpackCompose(CatchingFishDaggerHiltFAB));
        return i2 == 30 ? CatchingFish.CatchingFishCoroutine(obj) : CatchingFish.CatchingFishReduxKtor(i, i2 + 5, obj);
    }

    public final CatchingFishOkHttpIntent CatchingFishRoomDatabase(CatchingFishOkHttpIntent catchingFishOkHttpIntent, CatchingFishOkHttpIntent catchingFishOkHttpIntent2, int i, int i2, CatchingFishWidgetContext catchingFishWidgetContext) {
        CatchingFishWidgetContext catchingFishWidgetContext2 = this.CatchingFishCoroutine;
        if (catchingFishOkHttpIntent2 != null) {
            return (catchingFishWidgetContext2 == catchingFishWidgetContext || catchingFishOkHttpIntent != catchingFishOkHttpIntent2) ? CatchingFishNavigation(i, catchingFishOkHttpIntent2, catchingFishWidgetContext) : this;
        }
        Object[] objArr = this.CatchingFishReduxKtor;
        if (objArr.length == 1) {
            return null;
        }
        if (catchingFishWidgetContext2 != catchingFishWidgetContext) {
            return new CatchingFishOkHttpIntent(this.CatchingFishParcelableFAB, i2 ^ this.CatchingFishSnackbar, CatchingFishLayoutRoom.CatchingFishWorkManager(i, objArr), catchingFishWidgetContext);
        }
        this.CatchingFishReduxKtor = CatchingFishLayoutRoom.CatchingFishWorkManager(i, objArr);
        this.CatchingFishSnackbar ^= i2;
        return this;
    }

    public final int CatchingFishSnackbar() {
        if (this.CatchingFishSnackbar == 0) {
            return this.CatchingFishReduxKtor.length / 2;
        }
        int bitCount = Integer.bitCount(this.CatchingFishParcelableFAB);
        int length = this.CatchingFishReduxKtor.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += CatchingFish(i).CatchingFishSnackbar();
        }
        return bitCount;
    }

    public final CatchingFishOkHttpIntent CatchingFishSpannableWidget(int i, int i2, CatchingFishOkHttpIntent catchingFishOkHttpIntent) {
        Object[] objArr = catchingFishOkHttpIntent.CatchingFishReduxKtor;
        if (objArr.length != 2 || catchingFishOkHttpIntent.CatchingFishSnackbar != 0) {
            Object[] objArr2 = this.CatchingFishReduxKtor;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
            copyOf[i] = catchingFishOkHttpIntent;
            return new CatchingFishOkHttpIntent(this.CatchingFishParcelableFAB, this.CatchingFishSnackbar, copyOf, null);
        }
        if (this.CatchingFishReduxKtor.length == 1) {
            catchingFishOkHttpIntent.CatchingFishParcelableFAB = this.CatchingFishSnackbar;
            return catchingFishOkHttpIntent;
        }
        int CatchingFishWorkManager = CatchingFishWorkManager(i2);
        Object[] objArr3 = this.CatchingFishReduxKtor;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf2, "copyOf(...)");
        CatchingFishMVVMHilt.CatchingFishAppCompat(copyOf2, copyOf2, i + 2, i + 1, objArr3.length);
        CatchingFishMVVMHilt.CatchingFishAppCompat(copyOf2, copyOf2, CatchingFishWorkManager + 2, CatchingFishWorkManager, i);
        copyOf2[CatchingFishWorkManager] = obj;
        copyOf2[CatchingFishWorkManager + 1] = obj2;
        return new CatchingFishOkHttpIntent(this.CatchingFishParcelableFAB ^ i2, i2 ^ this.CatchingFishSnackbar, copyOf2, null);
    }

    public final CatchingFishOkHttpIntent CatchingFishStateLiveData(int i, int i2, CatchingFishHiltGraphQL catchingFishHiltGraphQL) {
        catchingFishHiltGraphQL.CatchingFishDaggerWebsocket(catchingFishHiltGraphQL.CatchingFishViewModelFAB - 1);
        catchingFishHiltGraphQL.CatchingFishWorkManager = CatchingFishParcelableFlux(i);
        Object[] objArr = this.CatchingFishReduxKtor;
        if (objArr.length == 2) {
            return null;
        }
        if (this.CatchingFishCoroutine != catchingFishHiltGraphQL.CatchingFishReduxKtor) {
            return new CatchingFishOkHttpIntent(i2 ^ this.CatchingFishParcelableFAB, this.CatchingFishSnackbar, CatchingFishLayoutRoom.CatchingFishDaggerWebsocket(i, objArr), catchingFishHiltGraphQL.CatchingFishReduxKtor);
        }
        this.CatchingFishReduxKtor = CatchingFishLayoutRoom.CatchingFishDaggerWebsocket(i, objArr);
        this.CatchingFishParcelableFAB ^= i2;
        return this;
    }

    public final CatchingFishOkHttpIntent CatchingFishUnitTesting(int i, Object obj, int i2, CatchingFishHiltGraphQL catchingFishHiltGraphQL) {
        CatchingFishOkHttpIntent CatchingFishUnitTesting;
        int CatchingFishDaggerHiltFAB = 1 << CatchingFishLayoutRoom.CatchingFishDaggerHiltFAB(i, i2);
        if (CatchingFishViewModelFAB(CatchingFishDaggerHiltFAB)) {
            int CatchingFishWorkManager = CatchingFishWorkManager(CatchingFishDaggerHiltFAB);
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, this.CatchingFishReduxKtor[CatchingFishWorkManager])) {
                return CatchingFishStateLiveData(CatchingFishWorkManager, CatchingFishDaggerHiltFAB, catchingFishHiltGraphQL);
            }
        } else if (CatchingFishLayout(CatchingFishDaggerHiltFAB)) {
            int CatchingFishJetpackCompose = CatchingFishJetpackCompose(CatchingFishDaggerHiltFAB);
            CatchingFishOkHttpIntent CatchingFish = CatchingFish(CatchingFishJetpackCompose);
            if (i2 == 30) {
                CatchingFishRetrofitService CatchingFishStateFlow = CatchingFishOkHttpFAB.CatchingFishStateFlow(CatchingFishOkHttpFAB.CatchingFishMoshiDaggerHilt(0, CatchingFish.CatchingFishReduxKtor.length));
                int i3 = CatchingFishStateFlow.CatchingFishReduxKtor;
                int i4 = CatchingFishStateFlow.CatchingFishDaggerWebsocket;
                int i5 = CatchingFishStateFlow.CatchingFishWorkManager;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, CatchingFish.CatchingFishReduxKtor[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    CatchingFishUnitTesting = CatchingFish.CatchingFishCloudMessaging(i3, catchingFishHiltGraphQL);
                }
                CatchingFishUnitTesting = CatchingFish;
                break;
            }
            CatchingFishUnitTesting = CatchingFish.CatchingFishUnitTesting(i, obj, i2 + 5, catchingFishHiltGraphQL);
            return CatchingFishRoomDatabase(CatchingFish, CatchingFishUnitTesting, CatchingFishJetpackCompose, CatchingFishDaggerHiltFAB, catchingFishHiltGraphQL.CatchingFishReduxKtor);
        }
        return this;
    }

    public final boolean CatchingFishViewModelFAB(int i) {
        return (i & this.CatchingFishParcelableFAB) != 0;
    }

    public final Object CatchingFishViewModelScope(int i, int i2, Object obj) {
        int CatchingFishDaggerHiltFAB = 1 << CatchingFishLayoutRoom.CatchingFishDaggerHiltFAB(i, i2);
        if (CatchingFishViewModelFAB(CatchingFishDaggerHiltFAB)) {
            int CatchingFishWorkManager = CatchingFishWorkManager(CatchingFishDaggerHiltFAB);
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, this.CatchingFishReduxKtor[CatchingFishWorkManager])) {
                return CatchingFishParcelableFlux(CatchingFishWorkManager);
            }
            return null;
        }
        if (!CatchingFishLayout(CatchingFishDaggerHiltFAB)) {
            return null;
        }
        CatchingFishOkHttpIntent CatchingFish = CatchingFish(CatchingFishJetpackCompose(CatchingFishDaggerHiltFAB));
        if (i2 != 30) {
            return CatchingFish.CatchingFishViewModelScope(i, i2 + 5, obj);
        }
        CatchingFishRetrofitService CatchingFishStateFlow = CatchingFishOkHttpFAB.CatchingFishStateFlow(CatchingFishOkHttpFAB.CatchingFishMoshiDaggerHilt(0, CatchingFish.CatchingFishReduxKtor.length));
        int i3 = CatchingFishStateFlow.CatchingFishReduxKtor;
        int i4 = CatchingFishStateFlow.CatchingFishDaggerWebsocket;
        int i5 = CatchingFishStateFlow.CatchingFishWorkManager;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, CatchingFish.CatchingFishReduxKtor[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return CatchingFish.CatchingFishParcelableFlux(i3);
    }

    public final int CatchingFishWorkManager(int i) {
        return Integer.bitCount((i - 1) & this.CatchingFishParcelableFAB) * 2;
    }
}
