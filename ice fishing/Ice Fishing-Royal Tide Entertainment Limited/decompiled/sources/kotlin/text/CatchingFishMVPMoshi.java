package kotlin.text;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class CatchingFishMVPMoshi extends CatchingFishKtorViewPager implements Collection, CatchingFishViewAndroidX {
    public int CatchingFishCloudMessaging;
    public Object[] CatchingFishDaggerWebsocket;
    public Object[] CatchingFishFragmentHandler;
    public Object[] CatchingFishLayout;
    public CatchingFishParcelable CatchingFishReduxKtor;
    public CatchingFishWidgetContext CatchingFishViewModelFAB = new CatchingFishWidgetContext();
    public int CatchingFishViewModelScope;
    public Object[] CatchingFishWorkManager;

    public CatchingFishMVPMoshi(CatchingFishParcelable catchingFishParcelable, Object[] objArr, Object[] objArr2, int i) {
        this.CatchingFishReduxKtor = catchingFishParcelable;
        this.CatchingFishDaggerWebsocket = objArr;
        this.CatchingFishWorkManager = objArr2;
        this.CatchingFishViewModelScope = i;
        this.CatchingFishLayout = objArr;
        this.CatchingFishFragmentHandler = objArr2;
        this.CatchingFishCloudMessaging = catchingFishParcelable.CatchingFishParcelableFAB();
    }

    public static void CatchingFishDaggerWebsocket(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] CatchingFish(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            CatchingFishMVPAndroidXKtor.CatchingFishParcelableFAB("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            CatchingFishMVPAndroidXKtor.CatchingFishParcelableFAB("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] CatchingFishEspressoTesting = CatchingFishEspressoTesting(objArr);
        int CatchingFishNavigation = CatchingFishKtorViewModel.CatchingFishNavigation(i, i2);
        int i3 = i2 - 5;
        CatchingFishEspressoTesting[CatchingFishNavigation] = CatchingFish((Object[]) CatchingFishEspressoTesting[CatchingFishNavigation], i, i3, it);
        while (true) {
            CatchingFishNavigation++;
            if (CatchingFishNavigation >= 32 || !it.hasNext()) {
                break;
            }
            CatchingFishEspressoTesting[CatchingFishNavigation] = CatchingFish((Object[]) CatchingFishEspressoTesting[CatchingFishNavigation], 0, i3, it);
        }
        return CatchingFishEspressoTesting;
    }

    public final Object[] CatchingFishAnimationMockk(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.CatchingFishViewModelFAB;
        return objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (CatchingFishGsonAppCompat(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishCardViewRealm(CatchingFishServiceHandler catchingFishServiceHandler) {
        Object[] CatchingFish;
        int i;
        CatchingFishServiceHandler catchingFishServiceHandler2 = catchingFishServiceHandler;
        int CatchingFishMutableLiveData = CatchingFishMutableLiveData();
        Object[] objArr = null;
        CatchingFishFABFlux catchingFishFABFlux = new CatchingFishFABFlux(objArr);
        boolean z = false;
        if (this.CatchingFishLayout != null) {
            CatchingFishRealm CatchingFishCloudMessaging = CatchingFishCloudMessaging(0);
            int i2 = 32;
            while (i2 == 32 && CatchingFishCloudMessaging.hasNext()) {
                i2 = CatchingFishParcelableFlux(catchingFishServiceHandler2, (Object[]) CatchingFishCloudMessaging.next(), 32, catchingFishFABFlux);
            }
            if (i2 == 32) {
                int CatchingFishGsonAppCompat = CatchingFishGsonAppCompat(catchingFishServiceHandler2, CatchingFishMutableLiveData, catchingFishFABFlux);
                if (CatchingFishGsonAppCompat == 0) {
                    CatchingFishNavigation(this.CatchingFishLayout, this.CatchingFishCloudMessaging, this.CatchingFishViewModelScope);
                }
            } else {
                int i3 = (CatchingFishCloudMessaging.CatchingFishReduxKtor - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i4 = i2;
                while (CatchingFishCloudMessaging.hasNext()) {
                    i4 = CatchingFishSpannableWidget(catchingFishServiceHandler2, (Object[]) CatchingFishCloudMessaging.next(), 32, i4, catchingFishFABFlux, arrayList2, arrayList);
                    catchingFishServiceHandler2 = catchingFishServiceHandler;
                }
                int CatchingFishSpannableWidget = CatchingFishSpannableWidget(catchingFishServiceHandler, this.CatchingFishFragmentHandler, CatchingFishMutableLiveData, i4, catchingFishFABFlux, arrayList2, arrayList);
                Object obj = catchingFishFABFlux.CatchingFishReduxKtor;
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, CatchingFishSpannableWidget, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    CatchingFish = this.CatchingFishLayout;
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(CatchingFish);
                } else {
                    CatchingFish = CatchingFish(this.CatchingFishLayout, i3, this.CatchingFishViewModelScope, arrayList.iterator());
                }
                int size = i3 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    CatchingFishMVPAndroidXKtor.CatchingFishParcelableFAB("invalid size");
                }
                if (size == 0) {
                    this.CatchingFishViewModelScope = 0;
                } else {
                    int i5 = size - 1;
                    while (true) {
                        i = this.CatchingFishViewModelScope;
                        if ((i5 >> i) != 0) {
                            break;
                        }
                        this.CatchingFishViewModelScope = i - 5;
                        Object[] objArr3 = CatchingFish[0];
                        CatchingFishFirebaseDagger.CatchingFishStateLiveData(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        CatchingFish = objArr3;
                    }
                    objArr = CatchingFishStateLiveData(CatchingFish, i5, i);
                }
                this.CatchingFishLayout = objArr;
                this.CatchingFishFragmentHandler = objArr2;
                this.CatchingFishCloudMessaging = size + CatchingFishSpannableWidget;
            }
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object CatchingFishCardViewView(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.CatchingFishCloudMessaging - i;
        if (i4 == 1) {
            Object obj = this.CatchingFishFragmentHandler[0];
            CatchingFishNavigation(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.CatchingFishFragmentHandler;
        Object obj2 = objArr2[i3];
        Object[] CatchingFishEspressoTesting = CatchingFishEspressoTesting(objArr2);
        CatchingFishMVVMHilt.CatchingFishAppCompat(objArr2, CatchingFishEspressoTesting, i3, i3 + 1, i4);
        CatchingFishEspressoTesting[i4 - 1] = null;
        this.CatchingFishLayout = objArr;
        this.CatchingFishFragmentHandler = CatchingFishEspressoTesting;
        this.CatchingFishCloudMessaging = (i + i4) - 1;
        this.CatchingFishViewModelScope = i2;
        return obj2;
    }

    public final CatchingFishRealm CatchingFishCloudMessaging(int i) {
        Object[] objArr = this.CatchingFishLayout;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int CatchingFishMVPRobolectric = CatchingFishMVPRobolectric() >> 5;
        CatchingFishAdMobFAB.CatchingFishAnimationMockk(i, CatchingFishMVPRobolectric);
        int i2 = this.CatchingFishViewModelScope;
        return i2 == 0 ? new CatchingFishReduxCustomView(i, objArr) : new CatchingFishLayoutDataStore(objArr, i, CatchingFishMVPRobolectric, i2 / 5);
    }

    public final CatchingFishParcelable CatchingFishCoroutine() {
        CatchingFishParcelable catchingFishRealmFirebase;
        Object[] objArr = this.CatchingFishLayout;
        if (objArr == this.CatchingFishDaggerWebsocket && this.CatchingFishFragmentHandler == this.CatchingFishWorkManager) {
            catchingFishRealmFirebase = this.CatchingFishReduxKtor;
        } else {
            this.CatchingFishViewModelFAB = new CatchingFishWidgetContext();
            this.CatchingFishDaggerWebsocket = objArr;
            Object[] objArr2 = this.CatchingFishFragmentHandler;
            this.CatchingFishWorkManager = objArr2;
            if (objArr != null) {
                catchingFishRealmFirebase = new CatchingFishRealmFirebase(objArr, objArr2, this.CatchingFishCloudMessaging, this.CatchingFishViewModelScope);
            } else if (objArr2.length == 0) {
                catchingFishRealmFirebase = CatchingFishFluxMoshiBundle.CatchingFishDaggerWebsocket;
            } else {
                Object[] copyOf = Arrays.copyOf(objArr2, this.CatchingFishCloudMessaging);
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
                catchingFishRealmFirebase = new CatchingFishFluxMoshiBundle(copyOf);
            }
        }
        this.CatchingFishReduxKtor = catchingFishRealmFirebase;
        return catchingFishRealmFirebase;
    }

    public final void CatchingFishCoroutineFlow(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.CatchingFishCloudMessaging;
        int i2 = i >> 5;
        int i3 = this.CatchingFishViewModelScope;
        if (i2 > (1 << i3)) {
            this.CatchingFishLayout = CatchingFishDaggerHiltFAB(this.CatchingFishViewModelScope + 5, CatchingFishAnimationMockk(objArr), objArr2);
            this.CatchingFishFragmentHandler = objArr3;
            this.CatchingFishViewModelScope += 5;
            this.CatchingFishCloudMessaging++;
            return;
        }
        if (objArr == null) {
            this.CatchingFishLayout = objArr2;
            this.CatchingFishFragmentHandler = objArr3;
            this.CatchingFishCloudMessaging = i + 1;
        } else {
            this.CatchingFishLayout = CatchingFishDaggerHiltFAB(i3, objArr, objArr2);
            this.CatchingFishFragmentHandler = objArr3;
            this.CatchingFishCloudMessaging++;
        }
    }

    public final Object[] CatchingFishCustomView(Object[] objArr, int i, int i2, Object obj, CatchingFishFABFlux catchingFishFABFlux) {
        int CatchingFishNavigation = CatchingFishKtorViewModel.CatchingFishNavigation(i2, i);
        Object[] CatchingFishEspressoTesting = CatchingFishEspressoTesting(objArr);
        if (i != 0) {
            Object obj2 = CatchingFishEspressoTesting[CatchingFishNavigation];
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            CatchingFishEspressoTesting[CatchingFishNavigation] = CatchingFishCustomView((Object[]) obj2, i - 5, i2, obj, catchingFishFABFlux);
            return CatchingFishEspressoTesting;
        }
        if (CatchingFishEspressoTesting != objArr) {
            ((AbstractList) this).modCount++;
        }
        catchingFishFABFlux.CatchingFishReduxKtor = CatchingFishEspressoTesting[CatchingFishNavigation];
        CatchingFishEspressoTesting[CatchingFishNavigation] = obj;
        return CatchingFishEspressoTesting;
    }

    public final Object[] CatchingFishDaggerHiltFAB(int i, Object[] objArr, Object[] objArr2) {
        int CatchingFishNavigation = CatchingFishKtorViewModel.CatchingFishNavigation(CatchingFishParcelableFAB() - 1, i);
        Object[] CatchingFishEspressoTesting = CatchingFishEspressoTesting(objArr);
        if (i == 5) {
            CatchingFishEspressoTesting[CatchingFishNavigation] = objArr2;
            return CatchingFishEspressoTesting;
        }
        CatchingFishEspressoTesting[CatchingFishNavigation] = CatchingFishDaggerHiltFAB(i - 5, (Object[]) CatchingFishEspressoTesting[CatchingFishNavigation], objArr2);
        return CatchingFishEspressoTesting;
    }

    public final Object[] CatchingFishEspressoTesting(Object[] objArr) {
        if (objArr == null) {
            return CatchingFishUnitTesting();
        }
        if (CatchingFishFragmentHandler(objArr)) {
            return objArr;
        }
        Object[] CatchingFishUnitTesting = CatchingFishUnitTesting();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        CatchingFishMVVMHilt.CatchingFishStateFlow(objArr, CatchingFishUnitTesting, 0, length, 6);
        return CatchingFishUnitTesting;
    }

    public final void CatchingFishFragmentFactory(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] CatchingFishUnitTesting;
        if (i3 < 1) {
            CatchingFishMVPAndroidXKtor.CatchingFishParcelableFAB("requires at least one nullBuffer");
        }
        Object[] CatchingFishEspressoTesting = CatchingFishEspressoTesting(objArr);
        objArr2[0] = CatchingFishEspressoTesting;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            CatchingFishMVVMHilt.CatchingFishAppCompat(CatchingFishEspressoTesting, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                CatchingFishUnitTesting = CatchingFishEspressoTesting;
            } else {
                CatchingFishUnitTesting = CatchingFishUnitTesting();
                i3--;
                objArr2[i3] = CatchingFishUnitTesting;
            }
            int i7 = i2 - i6;
            CatchingFishMVVMHilt.CatchingFishAppCompat(CatchingFishEspressoTesting, objArr3, 0, i7, i2);
            CatchingFishMVVMHilt.CatchingFishAppCompat(CatchingFishEspressoTesting, CatchingFishUnitTesting, size + 1, i4, i7);
            objArr3 = CatchingFishUnitTesting;
        }
        Iterator it = collection.iterator();
        CatchingFishDaggerWebsocket(CatchingFishEspressoTesting, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] CatchingFishUnitTesting2 = CatchingFishUnitTesting();
            CatchingFishDaggerWebsocket(CatchingFishUnitTesting2, 0, it);
            objArr2[i8] = CatchingFishUnitTesting2;
        }
        CatchingFishDaggerWebsocket(objArr3, 0, it);
    }

    public final boolean CatchingFishFragmentHandler(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.CatchingFishViewModelFAB;
    }

    public final int CatchingFishGsonAppCompat(CatchingFishServiceHandler catchingFishServiceHandler, int i, CatchingFishFABFlux catchingFishFABFlux) {
        int CatchingFishParcelableFlux = CatchingFishParcelableFlux(catchingFishServiceHandler, this.CatchingFishFragmentHandler, i, catchingFishFABFlux);
        if (CatchingFishParcelableFlux == i) {
            return i;
        }
        Object obj = catchingFishFABFlux.CatchingFishReduxKtor;
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, CatchingFishParcelableFlux, i, (Object) null);
        this.CatchingFishFragmentHandler = objArr;
        this.CatchingFishCloudMessaging -= i - CatchingFishParcelableFlux;
        return CatchingFishParcelableFlux;
    }

    public final Object[] CatchingFishJetpackCompose(Object[] objArr, int i, Object[][] objArr2) {
        CatchingFishMultiplatform catchingFishMultiplatform = new CatchingFishMultiplatform(objArr2);
        int i2 = i >> 5;
        int i3 = this.CatchingFishViewModelScope;
        Object[] CatchingFish = i2 < (1 << i3) ? CatchingFish(objArr, i, i3, catchingFishMultiplatform) : CatchingFishEspressoTesting(objArr);
        while (catchingFishMultiplatform.hasNext()) {
            this.CatchingFishViewModelScope += 5;
            CatchingFish = CatchingFishAnimationMockk(CatchingFish);
            int i4 = this.CatchingFishViewModelScope;
            CatchingFish(CatchingFish, 1 << i4, i4, catchingFishMultiplatform);
        }
        return CatchingFish;
    }

    public final void CatchingFishLayout(Object[] objArr, int i, Object obj) {
        int CatchingFishMutableLiveData = CatchingFishMutableLiveData();
        Object[] CatchingFishEspressoTesting = CatchingFishEspressoTesting(this.CatchingFishFragmentHandler);
        if (CatchingFishMutableLiveData < 32) {
            CatchingFishMVVMHilt.CatchingFishAppCompat(this.CatchingFishFragmentHandler, CatchingFishEspressoTesting, i + 1, i, CatchingFishMutableLiveData);
            CatchingFishEspressoTesting[i] = obj;
            this.CatchingFishLayout = objArr;
            this.CatchingFishFragmentHandler = CatchingFishEspressoTesting;
            this.CatchingFishCloudMessaging++;
            return;
        }
        Object[] objArr2 = this.CatchingFishFragmentHandler;
        Object obj2 = objArr2[31];
        CatchingFishMVVMHilt.CatchingFishAppCompat(objArr2, CatchingFishEspressoTesting, i + 1, i, 31);
        CatchingFishEspressoTesting[i] = obj;
        CatchingFishCoroutineFlow(objArr, CatchingFishEspressoTesting, CatchingFishAnimationMockk(obj2));
    }

    public final int CatchingFishMVPRobolectric() {
        int i = this.CatchingFishCloudMessaging;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final int CatchingFishMutableLiveData() {
        int i = this.CatchingFishCloudMessaging;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    public final void CatchingFishNavigation(Object[] objArr, int i, int i2) {
        Object obj = null;
        if (i2 == 0) {
            this.CatchingFishLayout = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.CatchingFishFragmentHandler = objArr;
            this.CatchingFishCloudMessaging = i;
            this.CatchingFishViewModelScope = i2;
            return;
        }
        CatchingFishFABFlux catchingFishFABFlux = new CatchingFishFABFlux(obj);
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(objArr);
        Object[] CatchingFishRoomDatabase = CatchingFishRoomDatabase(objArr, i2, i, catchingFishFABFlux);
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(CatchingFishRoomDatabase);
        Object obj2 = catchingFishFABFlux.CatchingFishReduxKtor;
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.CatchingFishFragmentHandler = (Object[]) obj2;
        this.CatchingFishCloudMessaging = i;
        if (CatchingFishRoomDatabase[1] == null) {
            this.CatchingFishLayout = (Object[]) CatchingFishRoomDatabase[0];
            this.CatchingFishViewModelScope = i2 - 5;
        } else {
            this.CatchingFishLayout = CatchingFishRoomDatabase;
            this.CatchingFishViewModelScope = i2;
        }
    }

    public final Object[] CatchingFishOkHttp(int i, Object[] objArr) {
        if (CatchingFishFragmentHandler(objArr)) {
            CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] CatchingFishUnitTesting = CatchingFishUnitTesting();
        CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, CatchingFishUnitTesting, i, 0, 32 - i);
        return CatchingFishUnitTesting;
    }

    @Override // kotlin.text.CatchingFishKtorViewPager
    public final int CatchingFishParcelableFAB() {
        return this.CatchingFishCloudMessaging;
    }

    public final int CatchingFishParcelableFlux(CatchingFishServiceHandler catchingFishServiceHandler, Object[] objArr, int i, CatchingFishFABFlux catchingFishFABFlux) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) catchingFishServiceHandler.CatchingFishFragmentHandler(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = CatchingFishEspressoTesting(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        catchingFishFABFlux.CatchingFishReduxKtor = objArr2;
        return i2;
    }

    public final Object[] CatchingFishPayPal(Object[] objArr, int i, int i2, CatchingFishFABFlux catchingFishFABFlux) {
        int CatchingFishNavigation = CatchingFishKtorViewModel.CatchingFishNavigation(i2, i);
        if (i == 0) {
            Object obj = objArr[CatchingFishNavigation];
            Object[] CatchingFishEspressoTesting = CatchingFishEspressoTesting(objArr);
            CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, CatchingFishEspressoTesting, CatchingFishNavigation, CatchingFishNavigation + 1, 32);
            CatchingFishEspressoTesting[31] = catchingFishFABFlux.CatchingFishReduxKtor;
            catchingFishFABFlux.CatchingFishReduxKtor = obj;
            return CatchingFishEspressoTesting;
        }
        int CatchingFishNavigation2 = objArr[31] == null ? CatchingFishKtorViewModel.CatchingFishNavigation(CatchingFishMVPRobolectric() - 1, i) : 31;
        Object[] CatchingFishEspressoTesting2 = CatchingFishEspressoTesting(objArr);
        int i3 = i - 5;
        int i4 = CatchingFishNavigation + 1;
        if (i4 <= CatchingFishNavigation2) {
            while (true) {
                Object obj2 = CatchingFishEspressoTesting2[CatchingFishNavigation2];
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                CatchingFishEspressoTesting2[CatchingFishNavigation2] = CatchingFishPayPal((Object[]) obj2, i3, 0, catchingFishFABFlux);
                if (CatchingFishNavigation2 == i4) {
                    break;
                }
                CatchingFishNavigation2--;
            }
        }
        Object obj3 = CatchingFishEspressoTesting2[CatchingFishNavigation];
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        CatchingFishEspressoTesting2[CatchingFishNavigation] = CatchingFishPayPal((Object[]) obj3, i3, i2, catchingFishFABFlux);
        return CatchingFishEspressoTesting2;
    }

    public final Object[] CatchingFishRoomDatabase(Object[] objArr, int i, int i2, CatchingFishFABFlux catchingFishFABFlux) {
        Object[] CatchingFishRoomDatabase;
        int CatchingFishNavigation = CatchingFishKtorViewModel.CatchingFishNavigation(i2 - 1, i);
        if (i == 5) {
            catchingFishFABFlux.CatchingFishReduxKtor = objArr[CatchingFishNavigation];
            CatchingFishRoomDatabase = null;
        } else {
            Object obj = objArr[CatchingFishNavigation];
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            CatchingFishRoomDatabase = CatchingFishRoomDatabase((Object[]) obj, i - 5, i2, catchingFishFABFlux);
        }
        if (CatchingFishRoomDatabase == null && CatchingFishNavigation == 0) {
            return null;
        }
        Object[] CatchingFishEspressoTesting = CatchingFishEspressoTesting(objArr);
        CatchingFishEspressoTesting[CatchingFishNavigation] = CatchingFishRoomDatabase;
        return CatchingFishEspressoTesting;
    }

    @Override // kotlin.text.CatchingFishKtorViewPager
    public final Object CatchingFishSnackbar(int i) {
        CatchingFishAdMobFAB.CatchingFishUnitTesting(i, CatchingFishParcelableFAB());
        ((AbstractList) this).modCount++;
        int CatchingFishMVPRobolectric = CatchingFishMVPRobolectric();
        if (i >= CatchingFishMVPRobolectric) {
            return CatchingFishCardViewView(this.CatchingFishLayout, CatchingFishMVPRobolectric, this.CatchingFishViewModelScope, i - CatchingFishMVPRobolectric);
        }
        CatchingFishFABFlux catchingFishFABFlux = new CatchingFishFABFlux(this.CatchingFishFragmentHandler[0]);
        Object[] objArr = this.CatchingFishLayout;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(objArr);
        CatchingFishCardViewView(CatchingFishPayPal(objArr, this.CatchingFishViewModelScope, i, catchingFishFABFlux), CatchingFishMVPRobolectric, this.CatchingFishViewModelScope, 0);
        return catchingFishFABFlux.CatchingFishReduxKtor;
    }

    public final int CatchingFishSpannableWidget(CatchingFishServiceHandler catchingFishServiceHandler, Object[] objArr, int i, int i2, CatchingFishFABFlux catchingFishFABFlux, ArrayList arrayList, ArrayList arrayList2) {
        if (CatchingFishFragmentHandler(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = catchingFishFABFlux.CatchingFishReduxKtor;
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) catchingFishServiceHandler.CatchingFishFragmentHandler(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : CatchingFishUnitTesting();
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        catchingFishFABFlux.CatchingFishReduxKtor = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final Object[] CatchingFishStateLiveData(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            CatchingFishMVPAndroidXKtor.CatchingFishParcelableFAB("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int CatchingFishNavigation = CatchingFishKtorViewModel.CatchingFishNavigation(i, i2);
        Object obj = objArr[CatchingFishNavigation];
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object CatchingFishStateLiveData = CatchingFishStateLiveData((Object[]) obj, i, i2 - 5);
        if (CatchingFishNavigation < 31) {
            int i3 = CatchingFishNavigation + 1;
            if (objArr[i3] != null) {
                if (CatchingFishFragmentHandler(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] CatchingFishUnitTesting = CatchingFishUnitTesting();
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, CatchingFishUnitTesting, 0, 0, i3);
                objArr = CatchingFishUnitTesting;
            }
        }
        if (CatchingFishStateLiveData == objArr[CatchingFishNavigation]) {
            return objArr;
        }
        Object[] CatchingFishEspressoTesting = CatchingFishEspressoTesting(objArr);
        CatchingFishEspressoTesting[CatchingFishNavigation] = CatchingFishStateLiveData;
        return CatchingFishEspressoTesting;
    }

    public final Object[] CatchingFishUnitTesting() {
        Object[] objArr = new Object[33];
        objArr[32] = this.CatchingFishViewModelFAB;
        return objArr;
    }

    public final Object[] CatchingFishViewModelFAB(Object[] objArr, int i, int i2, Object obj, CatchingFishFABFlux catchingFishFABFlux) {
        Object obj2;
        int CatchingFishNavigation = CatchingFishKtorViewModel.CatchingFishNavigation(i2, i);
        if (i == 0) {
            catchingFishFABFlux.CatchingFishReduxKtor = objArr[31];
            Object[] CatchingFishEspressoTesting = CatchingFishEspressoTesting(objArr);
            CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, CatchingFishEspressoTesting, CatchingFishNavigation + 1, CatchingFishNavigation, 31);
            CatchingFishEspressoTesting[CatchingFishNavigation] = obj;
            return CatchingFishEspressoTesting;
        }
        Object[] CatchingFishEspressoTesting2 = CatchingFishEspressoTesting(objArr);
        int i3 = i - 5;
        Object obj3 = CatchingFishEspressoTesting2[CatchingFishNavigation];
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        CatchingFishEspressoTesting2[CatchingFishNavigation] = CatchingFishViewModelFAB((Object[]) obj3, i3, i2, obj, catchingFishFABFlux);
        while (true) {
            CatchingFishNavigation++;
            if (CatchingFishNavigation >= 32 || (obj2 = CatchingFishEspressoTesting2[CatchingFishNavigation]) == null) {
                break;
            }
            CatchingFishEspressoTesting2[CatchingFishNavigation] = CatchingFishViewModelFAB((Object[]) obj2, i3, 0, catchingFishFABFlux.CatchingFishReduxKtor, catchingFishFABFlux);
        }
        return CatchingFishEspressoTesting2;
    }

    public final void CatchingFishViewModelScope(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.CatchingFishLayout == null) {
            throw new IllegalStateException("root is null");
        }
        int i4 = i >> 5;
        CatchingFishRealm CatchingFishCloudMessaging = CatchingFishCloudMessaging(CatchingFishMVPRobolectric() >> 5);
        int i5 = i3;
        Object[] objArr3 = objArr2;
        while (CatchingFishCloudMessaging.CatchingFishReduxKtor - 1 != i4) {
            Object[] objArr4 = (Object[]) CatchingFishCloudMessaging.previous();
            CatchingFishMVVMHilt.CatchingFishAppCompat(objArr4, objArr3, 0, 32 - i2, 32);
            objArr3 = CatchingFishOkHttp(i2, objArr4);
            i5--;
            objArr[i5] = objArr3;
        }
        Object[] objArr5 = (Object[]) CatchingFishCloudMessaging.previous();
        int CatchingFishMVPRobolectric = i3 - (((CatchingFishMVPRobolectric() >> 5) - 1) - i4);
        if (CatchingFishMVPRobolectric < i3) {
            objArr2 = objArr[CatchingFishMVPRobolectric];
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(objArr2);
        }
        CatchingFishFragmentFactory(collection, i, objArr5, 32, objArr, CatchingFishMVPRobolectric, objArr2);
    }

    public final int CatchingFishWorkManager() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        CatchingFishAdMobFAB.CatchingFishAnimationMockk(i, CatchingFishParcelableFAB());
        if (i == CatchingFishParcelableFAB()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int CatchingFishMVPRobolectric = CatchingFishMVPRobolectric();
        if (i >= CatchingFishMVPRobolectric) {
            CatchingFishLayout(this.CatchingFishLayout, i - CatchingFishMVPRobolectric, obj);
            return;
        }
        CatchingFishFABFlux catchingFishFABFlux = new CatchingFishFABFlux(null);
        Object[] objArr = this.CatchingFishLayout;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(objArr);
        CatchingFishLayout(CatchingFishViewModelFAB(objArr, this.CatchingFishViewModelScope, i, obj, catchingFishFABFlux), 0, catchingFishFABFlux.CatchingFishReduxKtor);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        CatchingFishMVPMoshi catchingFishMVPMoshi;
        Object[] CatchingFishUnitTesting;
        CatchingFishAdMobFAB.CatchingFishAnimationMockk(i, this.CatchingFishCloudMessaging);
        if (i == this.CatchingFishCloudMessaging) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.CatchingFishCloudMessaging - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.CatchingFishFragmentHandler;
            Object[] CatchingFishEspressoTesting = CatchingFishEspressoTesting(objArr);
            CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, CatchingFishEspressoTesting, size2 + 1, i3, CatchingFishMutableLiveData());
            CatchingFishDaggerWebsocket(CatchingFishEspressoTesting, i3, collection.iterator());
            this.CatchingFishFragmentHandler = CatchingFishEspressoTesting;
            this.CatchingFishCloudMessaging = collection.size() + this.CatchingFishCloudMessaging;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int CatchingFishMutableLiveData = CatchingFishMutableLiveData();
        int size3 = collection.size() + this.CatchingFishCloudMessaging;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= CatchingFishMVPRobolectric()) {
            CatchingFishUnitTesting = CatchingFishUnitTesting();
            collection2 = collection;
            CatchingFishFragmentFactory(collection2, i, this.CatchingFishFragmentHandler, CatchingFishMutableLiveData, objArr2, size, CatchingFishUnitTesting);
            catchingFishMVPMoshi = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            catchingFishMVPMoshi = this;
            if (size3 > CatchingFishMutableLiveData) {
                int i4 = size3 - CatchingFishMutableLiveData;
                Object[] CatchingFishOkHttp = CatchingFishOkHttp(i4, catchingFishMVPMoshi.CatchingFishFragmentHandler);
                catchingFishMVPMoshi.CatchingFishViewModelScope(collection2, i, i4, objArr2, size, CatchingFishOkHttp);
                objArr2 = objArr2;
                CatchingFishUnitTesting = CatchingFishOkHttp;
            } else {
                Object[] objArr3 = catchingFishMVPMoshi.CatchingFishFragmentHandler;
                CatchingFishUnitTesting = CatchingFishUnitTesting();
                int i5 = CatchingFishMutableLiveData - size3;
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr3, CatchingFishUnitTesting, 0, i5, CatchingFishMutableLiveData);
                int i6 = 32 - i5;
                Object[] CatchingFishOkHttp2 = CatchingFishOkHttp(i6, catchingFishMVPMoshi.CatchingFishFragmentHandler);
                int i7 = size - 1;
                objArr2[i7] = CatchingFishOkHttp2;
                catchingFishMVPMoshi.CatchingFishViewModelScope(collection2, i, i6, objArr2, i7, CatchingFishOkHttp2);
                collection2 = collection2;
            }
        }
        catchingFishMVPMoshi.CatchingFishLayout = CatchingFishJetpackCompose(catchingFishMVPMoshi.CatchingFishLayout, i2, objArr2);
        catchingFishMVPMoshi.CatchingFishFragmentHandler = CatchingFishUnitTesting;
        catchingFishMVPMoshi.CatchingFishCloudMessaging = collection2.size() + catchingFishMVPMoshi.CatchingFishCloudMessaging;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        CatchingFishAdMobFAB.CatchingFishUnitTesting(i, CatchingFishParcelableFAB());
        if (CatchingFishMVPRobolectric() <= i) {
            objArr = this.CatchingFishFragmentHandler;
        } else {
            objArr = this.CatchingFishLayout;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(objArr);
            for (int i2 = this.CatchingFishViewModelScope; i2 > 0; i2 -= 5) {
                Object obj = objArr[CatchingFishKtorViewModel.CatchingFishNavigation(i, i2)];
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        CatchingFishAdMobFAB.CatchingFishAnimationMockk(i, this.CatchingFishCloudMessaging);
        return new CatchingFishFragmentRoom(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return CatchingFishCardViewRealm(new CatchingFishMVPPicasso(1, collection));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        CatchingFishAdMobFAB.CatchingFishUnitTesting(i, CatchingFishParcelableFAB());
        if (CatchingFishMVPRobolectric() > i) {
            CatchingFishFABFlux catchingFishFABFlux = new CatchingFishFABFlux(null);
            Object[] objArr = this.CatchingFishLayout;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(objArr);
            this.CatchingFishLayout = CatchingFishCustomView(objArr, this.CatchingFishViewModelScope, i, obj, catchingFishFABFlux);
            return catchingFishFABFlux.CatchingFishReduxKtor;
        }
        Object[] CatchingFishEspressoTesting = CatchingFishEspressoTesting(this.CatchingFishFragmentHandler);
        if (CatchingFishEspressoTesting != this.CatchingFishFragmentHandler) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = CatchingFishEspressoTesting[i2];
        CatchingFishEspressoTesting[i2] = obj;
        this.CatchingFishFragmentHandler = CatchingFishEspressoTesting;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int CatchingFishMutableLiveData = CatchingFishMutableLiveData();
        if (CatchingFishMutableLiveData < 32) {
            Object[] CatchingFishEspressoTesting = CatchingFishEspressoTesting(this.CatchingFishFragmentHandler);
            CatchingFishEspressoTesting[CatchingFishMutableLiveData] = obj;
            this.CatchingFishFragmentHandler = CatchingFishEspressoTesting;
            this.CatchingFishCloudMessaging = CatchingFishParcelableFAB() + 1;
        } else {
            CatchingFishCoroutineFlow(this.CatchingFishLayout, this.CatchingFishFragmentHandler, CatchingFishAnimationMockk(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int CatchingFishMutableLiveData = CatchingFishMutableLiveData();
        Iterator it = collection.iterator();
        if (32 - CatchingFishMutableLiveData >= collection.size()) {
            Object[] CatchingFishEspressoTesting = CatchingFishEspressoTesting(this.CatchingFishFragmentHandler);
            CatchingFishDaggerWebsocket(CatchingFishEspressoTesting, CatchingFishMutableLiveData, it);
            this.CatchingFishFragmentHandler = CatchingFishEspressoTesting;
            this.CatchingFishCloudMessaging = collection.size() + this.CatchingFishCloudMessaging;
            return true;
        }
        int size = ((collection.size() + CatchingFishMutableLiveData) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] CatchingFishEspressoTesting2 = CatchingFishEspressoTesting(this.CatchingFishFragmentHandler);
        CatchingFishDaggerWebsocket(CatchingFishEspressoTesting2, CatchingFishMutableLiveData, it);
        objArr[0] = CatchingFishEspressoTesting2;
        for (int i = 1; i < size; i++) {
            Object[] CatchingFishUnitTesting = CatchingFishUnitTesting();
            CatchingFishDaggerWebsocket(CatchingFishUnitTesting, 0, it);
            objArr[i] = CatchingFishUnitTesting;
        }
        this.CatchingFishLayout = CatchingFishJetpackCompose(this.CatchingFishLayout, CatchingFishMVPRobolectric(), objArr);
        Object[] CatchingFishUnitTesting2 = CatchingFishUnitTesting();
        CatchingFishDaggerWebsocket(CatchingFishUnitTesting2, 0, it);
        this.CatchingFishFragmentHandler = CatchingFishUnitTesting2;
        this.CatchingFishCloudMessaging = collection.size() + this.CatchingFishCloudMessaging;
        return true;
    }
}
