package kotlin.text;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class CatchingFishGraphQLRealmFAB {
    public Object[] CatchingFishDaggerWebsocket;
    public int[] CatchingFishReduxKtor;
    public int CatchingFishWorkManager;

    public CatchingFishGraphQLRealmFAB(int i) {
        this.CatchingFishReduxKtor = i == 0 ? CatchingFishAdMobFAB.CatchingFishSnackbar : new int[i];
        this.CatchingFishDaggerWebsocket = i == 0 ? CatchingFishAdMobFAB.CatchingFishReduxKtor : new Object[i << 1];
    }

    public final int CatchingFishCoroutine(int i, Object obj) {
        int i2 = this.CatchingFishWorkManager;
        if (i2 == 0) {
            return -1;
        }
        int CatchingFishLayout = CatchingFishAdMobFAB.CatchingFishLayout(i2, i, this.CatchingFishReduxKtor);
        if (CatchingFishLayout < 0 || CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, this.CatchingFishDaggerWebsocket[CatchingFishLayout << 1])) {
            return CatchingFishLayout;
        }
        int i3 = CatchingFishLayout + 1;
        while (i3 < i2 && this.CatchingFishReduxKtor[i3] == i) {
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, this.CatchingFishDaggerWebsocket[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = CatchingFishLayout - 1; i4 >= 0 && this.CatchingFishReduxKtor[i4] == i; i4--) {
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, this.CatchingFishDaggerWebsocket[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int CatchingFishDaggerWebsocket() {
        int i = this.CatchingFishWorkManager;
        if (i == 0) {
            return -1;
        }
        int CatchingFishLayout = CatchingFishAdMobFAB.CatchingFishLayout(i, 0, this.CatchingFishReduxKtor);
        if (CatchingFishLayout < 0 || this.CatchingFishDaggerWebsocket[CatchingFishLayout << 1] == null) {
            return CatchingFishLayout;
        }
        int i2 = CatchingFishLayout + 1;
        while (i2 < i && this.CatchingFishReduxKtor[i2] == 0) {
            if (this.CatchingFishDaggerWebsocket[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = CatchingFishLayout - 1; i3 >= 0 && this.CatchingFishReduxKtor[i3] == 0; i3--) {
            if (this.CatchingFishDaggerWebsocket[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final Object CatchingFishLayout(int i) {
        boolean z = false;
        if (i >= 0 && i < this.CatchingFishWorkManager) {
            z = true;
        }
        if (z) {
            return this.CatchingFishDaggerWebsocket[(i << 1) + 1];
        }
        CatchingFishHiltMVPToast.CatchingFishPayPalLiveData("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final int CatchingFishParcelableFAB(Object obj) {
        int i = this.CatchingFishWorkManager * 2;
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final int CatchingFishReduxKtor(Object obj) {
        return obj == null ? CatchingFishDaggerWebsocket() : CatchingFishCoroutine(obj.hashCode(), obj);
    }

    public final void CatchingFishSnackbar(int i) {
        int i2 = this.CatchingFishWorkManager;
        int[] iArr = this.CatchingFishReduxKtor;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
            this.CatchingFishReduxKtor = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.CatchingFishDaggerWebsocket, i * 2);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf2, "copyOf(...)");
            this.CatchingFishDaggerWebsocket = copyOf2;
        }
        if (this.CatchingFishWorkManager != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final Object CatchingFishViewModelFAB(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.CatchingFishWorkManager) {
            z = true;
        }
        if (!z) {
            CatchingFishHiltMVPToast.CatchingFishPayPalLiveData("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final Object CatchingFishViewModelScope(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.CatchingFishWorkManager)) {
            CatchingFishHiltMVPToast.CatchingFishPayPalLiveData("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.CatchingFishReduxKtor;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                CatchingFishMVVMHilt.CatchingFishParcelable(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.CatchingFishDaggerWebsocket;
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.CatchingFishDaggerWebsocket;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i7);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
            this.CatchingFishReduxKtor = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.CatchingFishDaggerWebsocket, i7 << 1);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf2, "copyOf(...)");
            this.CatchingFishDaggerWebsocket = copyOf2;
            if (i2 != this.CatchingFishWorkManager) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                CatchingFishMVVMHilt.CatchingFishParcelable(0, 0, i, iArr, this.CatchingFishReduxKtor);
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, this.CatchingFishDaggerWebsocket, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                CatchingFishMVVMHilt.CatchingFishParcelable(i, i8, i2, iArr, this.CatchingFishReduxKtor);
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, this.CatchingFishDaggerWebsocket, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.CatchingFishWorkManager) {
            throw new ConcurrentModificationException();
        }
        this.CatchingFishWorkManager = i4;
        return obj;
    }

    public final Object CatchingFishWorkManager(int i) {
        boolean z = false;
        if (i >= 0 && i < this.CatchingFishWorkManager) {
            z = true;
        }
        if (z) {
            return this.CatchingFishDaggerWebsocket[i << 1];
        }
        CatchingFishHiltMVPToast.CatchingFishPayPalLiveData("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final void clear() {
        if (this.CatchingFishWorkManager > 0) {
            this.CatchingFishReduxKtor = CatchingFishAdMobFAB.CatchingFishSnackbar;
            this.CatchingFishDaggerWebsocket = CatchingFishAdMobFAB.CatchingFishReduxKtor;
            this.CatchingFishWorkManager = 0;
        }
        if (this.CatchingFishWorkManager > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return CatchingFishReduxKtor(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return CatchingFishParcelableFAB(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof CatchingFishGraphQLRealmFAB) {
                int i = this.CatchingFishWorkManager;
                if (i != ((CatchingFishGraphQLRealmFAB) obj).CatchingFishWorkManager) {
                    return false;
                }
                CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB = (CatchingFishGraphQLRealmFAB) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object CatchingFishWorkManager = CatchingFishWorkManager(i2);
                    Object CatchingFishLayout = CatchingFishLayout(i2);
                    Object obj2 = catchingFishGraphQLRealmFAB.get(CatchingFishWorkManager);
                    if (CatchingFishLayout == null) {
                        if (obj2 != null || !catchingFishGraphQLRealmFAB.containsKey(CatchingFishWorkManager)) {
                            return false;
                        }
                    } else if (!CatchingFishLayout.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.CatchingFishWorkManager != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.CatchingFishWorkManager;
            for (int i4 = 0; i4 < i3; i4++) {
                Object CatchingFishWorkManager2 = CatchingFishWorkManager(i4);
                Object CatchingFishLayout2 = CatchingFishLayout(i4);
                Object obj3 = ((Map) obj).get(CatchingFishWorkManager2);
                if (CatchingFishLayout2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(CatchingFishWorkManager2)) {
                        return false;
                    }
                } else if (!CatchingFishLayout2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int CatchingFishReduxKtor = CatchingFishReduxKtor(obj);
        if (CatchingFishReduxKtor >= 0) {
            return this.CatchingFishDaggerWebsocket[(CatchingFishReduxKtor << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int CatchingFishReduxKtor = CatchingFishReduxKtor(obj);
        return CatchingFishReduxKtor >= 0 ? this.CatchingFishDaggerWebsocket[(CatchingFishReduxKtor << 1) + 1] : obj2;
    }

    public final int hashCode() {
        int[] iArr = this.CatchingFishReduxKtor;
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        int i = this.CatchingFishWorkManager;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final boolean isEmpty() {
        return this.CatchingFishWorkManager <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.CatchingFishWorkManager;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int CatchingFishCoroutine = obj != null ? CatchingFishCoroutine(hashCode, obj) : CatchingFishDaggerWebsocket();
        if (CatchingFishCoroutine >= 0) {
            int i2 = (CatchingFishCoroutine << 1) + 1;
            Object[] objArr = this.CatchingFishDaggerWebsocket;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~CatchingFishCoroutine;
        int[] iArr = this.CatchingFishReduxKtor;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
            this.CatchingFishReduxKtor = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.CatchingFishDaggerWebsocket, i4 << 1);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf2, "copyOf(...)");
            this.CatchingFishDaggerWebsocket = copyOf2;
            if (i != this.CatchingFishWorkManager) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.CatchingFishReduxKtor;
            int i5 = i3 + 1;
            CatchingFishMVVMHilt.CatchingFishParcelable(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.CatchingFishDaggerWebsocket;
            CatchingFishMVVMHilt.CatchingFishAppCompat(objArr2, objArr2, i5 << 1, i3 << 1, this.CatchingFishWorkManager << 1);
        }
        int i6 = this.CatchingFishWorkManager;
        if (i == i6) {
            int[] iArr3 = this.CatchingFishReduxKtor;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.CatchingFishDaggerWebsocket;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.CatchingFishWorkManager = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int CatchingFishReduxKtor = CatchingFishReduxKtor(obj);
        if (CatchingFishReduxKtor >= 0) {
            return CatchingFishViewModelScope(CatchingFishReduxKtor);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int CatchingFishReduxKtor = CatchingFishReduxKtor(obj);
        if (CatchingFishReduxKtor >= 0) {
            return CatchingFishViewModelFAB(CatchingFishReduxKtor, obj2);
        }
        return null;
    }

    public final int size() {
        return this.CatchingFishWorkManager;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.CatchingFishWorkManager * 28);
        sb.append('{');
        int i = this.CatchingFishWorkManager;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object CatchingFishWorkManager = CatchingFishWorkManager(i2);
            if (CatchingFishWorkManager != sb) {
                sb.append(CatchingFishWorkManager);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object CatchingFishLayout = CatchingFishLayout(i2);
            if (CatchingFishLayout != sb) {
                sb.append(CatchingFishLayout);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(sb2, "toString(...)");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int CatchingFishReduxKtor = CatchingFishReduxKtor(obj);
        if (CatchingFishReduxKtor < 0 || !CatchingFishFirebaseDagger.CatchingFishOkHttp(obj2, CatchingFishLayout(CatchingFishReduxKtor))) {
            return false;
        }
        CatchingFishViewModelScope(CatchingFishReduxKtor);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int CatchingFishReduxKtor = CatchingFishReduxKtor(obj);
        if (CatchingFishReduxKtor < 0 || !CatchingFishFirebaseDagger.CatchingFishOkHttp(obj2, CatchingFishLayout(CatchingFishReduxKtor))) {
            return false;
        }
        CatchingFishViewModelFAB(CatchingFishReduxKtor, obj3);
        return true;
    }
}
