package kotlin.text;

import java.util.Arrays;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class CatchingFishRealmFirebase extends CatchingFishParcelable {
    public final Object[] CatchingFishDaggerWebsocket;
    public final Object[] CatchingFishReduxKtor;
    public final int CatchingFishViewModelScope;
    public final int CatchingFishWorkManager;

    public CatchingFishRealmFirebase(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.CatchingFishReduxKtor = objArr;
        this.CatchingFishDaggerWebsocket = objArr2;
        this.CatchingFishWorkManager = i;
        this.CatchingFishViewModelScope = i2;
        if (!(CatchingFishParcelableFAB() > 32)) {
            CatchingFishMVPAndroidXKtor.CatchingFishParcelableFAB("Trie-based persistent vector should have at least 33 elements, got " + CatchingFishParcelableFAB());
        }
        int length = objArr2.length;
    }

    public static Object[] CatchingFishEspressoTesting(Object[] objArr, int i, int i2, CatchingFishFABFlux catchingFishFABFlux) {
        Object[] CatchingFishEspressoTesting;
        int CatchingFishNavigation = CatchingFishKtorViewModel.CatchingFishNavigation(i2, i);
        if (i == 5) {
            catchingFishFABFlux.CatchingFishReduxKtor = objArr[CatchingFishNavigation];
            CatchingFishEspressoTesting = null;
        } else {
            Object obj = objArr[CatchingFishNavigation];
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            CatchingFishEspressoTesting = CatchingFishEspressoTesting((Object[]) obj, i - 5, i2, catchingFishFABFlux);
        }
        if (CatchingFishEspressoTesting == null && CatchingFishNavigation == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
        copyOf[CatchingFishNavigation] = CatchingFishEspressoTesting;
        return copyOf;
    }

    public static Object[] CatchingFishFragmentHandler(Object[] objArr, int i, int i2, Object obj, CatchingFishFABFlux catchingFishFABFlux) {
        Object[] copyOf;
        int CatchingFishNavigation = CatchingFishKtorViewModel.CatchingFishNavigation(i2, i);
        if (i == 0) {
            if (CatchingFishNavigation == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
            }
            CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, copyOf, CatchingFishNavigation + 1, CatchingFishNavigation, 31);
            catchingFishFABFlux.CatchingFishReduxKtor = objArr[31];
            copyOf[CatchingFishNavigation] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf2, "copyOf(...)");
        int i3 = i - 5;
        Object obj2 = objArr[CatchingFishNavigation];
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[CatchingFishNavigation] = CatchingFishFragmentHandler((Object[]) obj2, i3, i2, obj, catchingFishFABFlux);
        while (true) {
            CatchingFishNavigation++;
            if (CatchingFishNavigation >= 32 || copyOf2[CatchingFishNavigation] == null) {
                break;
            }
            Object obj3 = objArr[CatchingFishNavigation];
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[CatchingFishNavigation] = CatchingFishFragmentHandler((Object[]) obj3, i3, 0, catchingFishFABFlux.CatchingFishReduxKtor, catchingFishFABFlux);
        }
        return copyOf2;
    }

    public static Object[] CatchingFishNavigation(Object[] objArr, int i, int i2, Object obj) {
        int CatchingFishNavigation = CatchingFishKtorViewModel.CatchingFishNavigation(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
        if (i == 0) {
            copyOf[CatchingFishNavigation] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[CatchingFishNavigation];
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf[CatchingFishNavigation] = CatchingFishNavigation((Object[]) obj2, i - 5, i2, obj);
        return copyOf;
    }

    public final Object[] CatchingFishAnimationMockk(Object[] objArr, int i, int i2, CatchingFishFABFlux catchingFishFABFlux) {
        Object[] copyOf;
        int CatchingFishNavigation = CatchingFishKtorViewModel.CatchingFishNavigation(i2, i);
        if (i == 0) {
            if (CatchingFishNavigation == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
            }
            CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, copyOf, CatchingFishNavigation, CatchingFishNavigation + 1, 32);
            copyOf[31] = catchingFishFABFlux.CatchingFishReduxKtor;
            catchingFishFABFlux.CatchingFishReduxKtor = objArr[CatchingFishNavigation];
            return copyOf;
        }
        int CatchingFishNavigation2 = objArr[31] == null ? CatchingFishKtorViewModel.CatchingFishNavigation(CatchingFishRoomDatabase() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf2, "copyOf(...)");
        int i3 = i - 5;
        int i4 = CatchingFishNavigation + 1;
        if (i4 <= CatchingFishNavigation2) {
            while (true) {
                Object obj = copyOf2[CatchingFishNavigation2];
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[CatchingFishNavigation2] = CatchingFishAnimationMockk((Object[]) obj, i3, 0, catchingFishFABFlux);
                if (CatchingFishNavigation2 == i4) {
                    break;
                }
                CatchingFishNavigation2--;
            }
        }
        Object obj2 = copyOf2[CatchingFishNavigation];
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[CatchingFishNavigation] = CatchingFishAnimationMockk((Object[]) obj2, i3, i2, catchingFishFABFlux);
        return copyOf2;
    }

    public final CatchingFishRealmFirebase CatchingFishCloudMessaging(Object[] objArr, int i, Object obj) {
        int CatchingFishRoomDatabase = CatchingFishRoomDatabase();
        int i2 = this.CatchingFishWorkManager;
        int i3 = i2 - CatchingFishRoomDatabase;
        Object[] objArr2 = this.CatchingFishDaggerWebsocket;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
        if (i3 < 32) {
            CatchingFishMVVMHilt.CatchingFishAppCompat(objArr2, copyOf, i + 1, i, i3);
            copyOf[i] = obj;
            return new CatchingFishRealmFirebase(objArr, copyOf, i2 + 1, this.CatchingFishViewModelScope);
        }
        Object obj2 = objArr2[31];
        CatchingFishMVVMHilt.CatchingFishAppCompat(objArr2, copyOf, i + 1, i, i3 - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return CatchingFishOkHttp(objArr, copyOf, objArr3);
    }

    @Override // kotlin.text.CatchingFishParcelable
    public final CatchingFishParcelable CatchingFishCoroutine(Object obj) {
        int CatchingFishRoomDatabase = CatchingFishRoomDatabase();
        int i = this.CatchingFishWorkManager;
        int i2 = i - CatchingFishRoomDatabase;
        Object[] objArr = this.CatchingFishReduxKtor;
        Object[] objArr2 = this.CatchingFishDaggerWebsocket;
        if (i2 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return CatchingFishOkHttp(objArr, objArr2, objArr3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
        copyOf[i2] = obj;
        return new CatchingFishRealmFirebase(objArr, copyOf, i + 1, this.CatchingFishViewModelScope);
    }

    @Override // kotlin.text.CatchingFishParcelable
    public final CatchingFishParcelable CatchingFishLayout(int i, Object obj) {
        int i2 = this.CatchingFishWorkManager;
        CatchingFishAdMobFAB.CatchingFishUnitTesting(i, i2);
        int CatchingFishRoomDatabase = CatchingFishRoomDatabase();
        Object[] objArr = this.CatchingFishReduxKtor;
        Object[] objArr2 = this.CatchingFishDaggerWebsocket;
        int i3 = this.CatchingFishViewModelScope;
        if (CatchingFishRoomDatabase > i) {
            return new CatchingFishRealmFirebase(CatchingFishNavigation(objArr, i3, i, obj), objArr2, i2, i3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
        copyOf[i & 31] = obj;
        return new CatchingFishRealmFirebase(objArr, copyOf, i2, i3);
    }

    public final CatchingFishRealmFirebase CatchingFishOkHttp(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.CatchingFishWorkManager;
        int i2 = i >> 5;
        int i3 = this.CatchingFishViewModelScope;
        if (i2 <= (1 << i3)) {
            return new CatchingFishRealmFirebase(CatchingFishUnitTesting(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new CatchingFishRealmFirebase(CatchingFishUnitTesting(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    @Override // kotlin.text.CatchingFishFirebase
    public final int CatchingFishParcelableFAB() {
        return this.CatchingFishWorkManager;
    }

    public final int CatchingFishRoomDatabase() {
        return (this.CatchingFishWorkManager - 1) & (-32);
    }

    @Override // kotlin.text.CatchingFishParcelable
    public final CatchingFishParcelable CatchingFishSnackbar(int i, Object obj) {
        int i2 = this.CatchingFishWorkManager;
        CatchingFishAdMobFAB.CatchingFishAnimationMockk(i, i2);
        if (i == i2) {
            return CatchingFishCoroutine(obj);
        }
        int CatchingFishRoomDatabase = CatchingFishRoomDatabase();
        Object[] objArr = this.CatchingFishReduxKtor;
        if (i >= CatchingFishRoomDatabase) {
            return CatchingFishCloudMessaging(objArr, i - CatchingFishRoomDatabase, obj);
        }
        CatchingFishFABFlux catchingFishFABFlux = new CatchingFishFABFlux(null);
        return CatchingFishCloudMessaging(CatchingFishFragmentHandler(objArr, this.CatchingFishViewModelScope, i, obj, catchingFishFABFlux), 0, catchingFishFABFlux.CatchingFishReduxKtor);
    }

    public final CatchingFishParcelable CatchingFishStateLiveData(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.CatchingFishWorkManager - i;
        if (i4 != 1) {
            Object[] objArr2 = this.CatchingFishDaggerWebsocket;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
            int i5 = i4 - 1;
            if (i3 < i5) {
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr2, copyOf, i3, i3 + 1, i4);
            }
            copyOf[i5] = null;
            return new CatchingFishRealmFirebase(objArr, copyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(objArr, "copyOf(...)");
            }
            return new CatchingFishFluxMoshiBundle(objArr);
        }
        CatchingFishFABFlux catchingFishFABFlux = new CatchingFishFABFlux(null);
        Object[] CatchingFishEspressoTesting = CatchingFishEspressoTesting(objArr, i2, i - 1, catchingFishFABFlux);
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(CatchingFishEspressoTesting);
        Object obj = catchingFishFABFlux.CatchingFishReduxKtor;
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (CatchingFishEspressoTesting[1] != null) {
            return new CatchingFishRealmFirebase(CatchingFishEspressoTesting, objArr3, i, i2);
        }
        Object obj2 = CatchingFishEspressoTesting[0];
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new CatchingFishRealmFirebase((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final Object[] CatchingFishUnitTesting(int i, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int CatchingFishNavigation = CatchingFishKtorViewModel.CatchingFishNavigation(CatchingFishParcelableFAB() - 1, i);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(objArr3, "copyOf(...)");
        } else {
            objArr3 = new Object[32];
        }
        if (i == 5) {
            objArr3[CatchingFishNavigation] = objArr2;
            return objArr3;
        }
        objArr3[CatchingFishNavigation] = CatchingFishUnitTesting(i - 5, (Object[]) objArr3[CatchingFishNavigation], objArr2);
        return objArr3;
    }

    @Override // kotlin.text.CatchingFishParcelable
    public final CatchingFishParcelable CatchingFishViewModelFAB(int i) {
        CatchingFishAdMobFAB.CatchingFishUnitTesting(i, this.CatchingFishWorkManager);
        int CatchingFishRoomDatabase = CatchingFishRoomDatabase();
        Object[] objArr = this.CatchingFishReduxKtor;
        int i2 = this.CatchingFishViewModelScope;
        return i >= CatchingFishRoomDatabase ? CatchingFishStateLiveData(objArr, CatchingFishRoomDatabase, i2, i - CatchingFishRoomDatabase) : CatchingFishStateLiveData(CatchingFishAnimationMockk(objArr, i2, i, new CatchingFishFABFlux(this.CatchingFishDaggerWebsocket[0])), CatchingFishRoomDatabase, i2, 0);
    }

    @Override // kotlin.text.CatchingFishParcelable
    public final CatchingFishParcelable CatchingFishViewModelScope(CatchingFishMVPPicasso catchingFishMVPPicasso) {
        CatchingFishMVPMoshi catchingFishMVPMoshi = new CatchingFishMVPMoshi(this, this.CatchingFishReduxKtor, this.CatchingFishDaggerWebsocket, this.CatchingFishViewModelScope);
        catchingFishMVPMoshi.CatchingFishCardViewRealm(catchingFishMVPPicasso);
        return catchingFishMVPMoshi.CatchingFishCoroutine();
    }

    @Override // kotlin.text.CatchingFishParcelable
    public final CatchingFishMVPMoshi CatchingFishWorkManager() {
        return new CatchingFishMVPMoshi(this, this.CatchingFishReduxKtor, this.CatchingFishDaggerWebsocket, this.CatchingFishViewModelScope);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        CatchingFishAdMobFAB.CatchingFishUnitTesting(i, CatchingFishParcelableFAB());
        if (CatchingFishRoomDatabase() <= i) {
            objArr = this.CatchingFishDaggerWebsocket;
        } else {
            objArr = this.CatchingFishReduxKtor;
            for (int i2 = this.CatchingFishViewModelScope; i2 > 0; i2 -= 5) {
                Object obj = objArr[CatchingFishKtorViewModel.CatchingFishNavigation(i, i2)];
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // kotlin.text.CatchingFishRealmHilt, java.util.List
    public final ListIterator listIterator(int i) {
        CatchingFishAdMobFAB.CatchingFishAnimationMockk(i, this.CatchingFishWorkManager);
        return new CatchingFishViewPagerGson(this.CatchingFishReduxKtor, this.CatchingFishDaggerWebsocket, i, this.CatchingFishWorkManager, (this.CatchingFishViewModelScope / 5) + 1);
    }
}
