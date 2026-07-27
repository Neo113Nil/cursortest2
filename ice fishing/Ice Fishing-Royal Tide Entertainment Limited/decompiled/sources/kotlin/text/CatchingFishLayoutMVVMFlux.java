package kotlin.text;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishLayoutMVVMFlux implements Cloneable {
    public /* synthetic */ long[] CatchingFishDaggerWebsocket;
    public /* synthetic */ boolean CatchingFishReduxKtor;
    public /* synthetic */ int CatchingFishViewModelScope;
    public /* synthetic */ Object[] CatchingFishWorkManager;

    public CatchingFishLayoutMVVMFlux(int i) {
        if (i == 0) {
            this.CatchingFishDaggerWebsocket = CatchingFishAdMobFAB.CatchingFishCoroutine;
            this.CatchingFishWorkManager = CatchingFishAdMobFAB.CatchingFishReduxKtor;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.CatchingFishDaggerWebsocket = new long[i5];
        this.CatchingFishWorkManager = new Object[i5];
    }

    public final int CatchingFishCoroutine(long j) {
        if (this.CatchingFishReduxKtor) {
            int i = this.CatchingFishViewModelScope;
            long[] jArr = this.CatchingFishDaggerWebsocket;
            Object[] objArr = this.CatchingFishWorkManager;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != CatchingFishBiometricBundle.CatchingFishWorkManager) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.CatchingFishReduxKtor = false;
            this.CatchingFishViewModelScope = i2;
        }
        return CatchingFishAdMobFAB.CatchingFishFragmentHandler(this.CatchingFishDaggerWebsocket, this.CatchingFishViewModelScope, j);
    }

    public final void CatchingFishDaggerWebsocket(long j, Object obj) {
        Object obj2 = CatchingFishBiometricBundle.CatchingFishWorkManager;
        int CatchingFishFragmentHandler = CatchingFishAdMobFAB.CatchingFishFragmentHandler(this.CatchingFishDaggerWebsocket, this.CatchingFishViewModelScope, j);
        if (CatchingFishFragmentHandler >= 0) {
            this.CatchingFishWorkManager[CatchingFishFragmentHandler] = obj;
            return;
        }
        int i = ~CatchingFishFragmentHandler;
        int i2 = this.CatchingFishViewModelScope;
        if (i < i2) {
            Object[] objArr = this.CatchingFishWorkManager;
            if (objArr[i] == obj2) {
                this.CatchingFishDaggerWebsocket[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.CatchingFishReduxKtor) {
            long[] jArr = this.CatchingFishDaggerWebsocket;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.CatchingFishWorkManager;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.CatchingFishReduxKtor = false;
                this.CatchingFishViewModelScope = i3;
                i = ~CatchingFishAdMobFAB.CatchingFishFragmentHandler(this.CatchingFishDaggerWebsocket, i3, j);
            }
        }
        int i5 = this.CatchingFishViewModelScope;
        if (i5 >= this.CatchingFishDaggerWebsocket.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            long[] copyOf = Arrays.copyOf(this.CatchingFishDaggerWebsocket, i9);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
            this.CatchingFishDaggerWebsocket = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.CatchingFishWorkManager, i9);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf2, "copyOf(...)");
            this.CatchingFishWorkManager = copyOf2;
        }
        int i10 = this.CatchingFishViewModelScope;
        if (i10 - i != 0) {
            long[] jArr2 = this.CatchingFishDaggerWebsocket;
            int i11 = i + 1;
            CatchingFishMVVMHilt.CatchingFishRecyclerView(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.CatchingFishWorkManager;
            CatchingFishMVVMHilt.CatchingFishAppCompat(objArr3, objArr3, i11, i, this.CatchingFishViewModelScope);
        }
        this.CatchingFishDaggerWebsocket[i] = j;
        this.CatchingFishWorkManager[i] = obj;
        this.CatchingFishViewModelScope++;
    }

    public final void CatchingFishParcelableFAB() {
        int i = this.CatchingFishViewModelScope;
        Object[] objArr = this.CatchingFishWorkManager;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.CatchingFishViewModelScope = 0;
        this.CatchingFishReduxKtor = false;
    }

    public final long CatchingFishReduxKtor(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.CatchingFishViewModelScope)) {
            CatchingFishHiltMVPToast.CatchingFishPayPalLiveData("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.CatchingFishReduxKtor) {
            long[] jArr = this.CatchingFishDaggerWebsocket;
            Object[] objArr = this.CatchingFishWorkManager;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != CatchingFishBiometricBundle.CatchingFishWorkManager) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.CatchingFishReduxKtor = false;
            this.CatchingFishViewModelScope = i3;
        }
        return this.CatchingFishDaggerWebsocket[i];
    }

    public final Object CatchingFishSnackbar(long j) {
        Object obj;
        int CatchingFishFragmentHandler = CatchingFishAdMobFAB.CatchingFishFragmentHandler(this.CatchingFishDaggerWebsocket, this.CatchingFishViewModelScope, j);
        if (CatchingFishFragmentHandler < 0 || (obj = this.CatchingFishWorkManager[CatchingFishFragmentHandler]) == CatchingFishBiometricBundle.CatchingFishWorkManager) {
            return null;
        }
        return obj;
    }

    public final Object CatchingFishViewModelFAB(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.CatchingFishViewModelScope)) {
            CatchingFishHiltMVPToast.CatchingFishPayPalLiveData("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.CatchingFishReduxKtor) {
            long[] jArr = this.CatchingFishDaggerWebsocket;
            Object[] objArr = this.CatchingFishWorkManager;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != CatchingFishBiometricBundle.CatchingFishWorkManager) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.CatchingFishReduxKtor = false;
            this.CatchingFishViewModelScope = i3;
        }
        return this.CatchingFishWorkManager[i];
    }

    public final int CatchingFishViewModelScope() {
        if (this.CatchingFishReduxKtor) {
            int i = this.CatchingFishViewModelScope;
            long[] jArr = this.CatchingFishDaggerWebsocket;
            Object[] objArr = this.CatchingFishWorkManager;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != CatchingFishBiometricBundle.CatchingFishWorkManager) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.CatchingFishReduxKtor = false;
            this.CatchingFishViewModelScope = i2;
        }
        return this.CatchingFishViewModelScope;
    }

    public final void CatchingFishWorkManager(long j) {
        int CatchingFishFragmentHandler = CatchingFishAdMobFAB.CatchingFishFragmentHandler(this.CatchingFishDaggerWebsocket, this.CatchingFishViewModelScope, j);
        if (CatchingFishFragmentHandler >= 0) {
            Object[] objArr = this.CatchingFishWorkManager;
            Object obj = objArr[CatchingFishFragmentHandler];
            Object obj2 = CatchingFishBiometricBundle.CatchingFishWorkManager;
            if (obj != obj2) {
                objArr[CatchingFishFragmentHandler] = obj2;
                this.CatchingFishReduxKtor = true;
            }
        }
    }

    public final Object clone() {
        Object clone = super.clone();
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        CatchingFishLayoutMVVMFlux catchingFishLayoutMVVMFlux = (CatchingFishLayoutMVVMFlux) clone;
        catchingFishLayoutMVVMFlux.CatchingFishDaggerWebsocket = (long[]) this.CatchingFishDaggerWebsocket.clone();
        catchingFishLayoutMVVMFlux.CatchingFishWorkManager = (Object[]) this.CatchingFishWorkManager.clone();
        return catchingFishLayoutMVVMFlux;
    }

    public final String toString() {
        if (CatchingFishViewModelScope() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.CatchingFishViewModelScope * 28);
        sb.append('{');
        int i = this.CatchingFishViewModelScope;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(CatchingFishReduxKtor(i2));
            sb.append('=');
            Object CatchingFishViewModelFAB = CatchingFishViewModelFAB(i2);
            if (CatchingFishViewModelFAB != sb) {
                sb.append(CatchingFishViewModelFAB);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ CatchingFishLayoutMVVMFlux(Object obj) {
        this(10);
    }
}
