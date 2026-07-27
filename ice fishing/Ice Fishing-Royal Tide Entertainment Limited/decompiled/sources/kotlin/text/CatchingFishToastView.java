package kotlin.text;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class CatchingFishToastView implements Map, Serializable, CatchingFishSnackbarMVP {
    public static final CatchingFishToastView CatchingFishRoomDatabase;
    public CatchingFishBundleLiveData CatchingFishAnimationMockk;
    public int CatchingFishCloudMessaging;
    public Object[] CatchingFishDaggerWebsocket;
    public int CatchingFishEspressoTesting;
    public int CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public CatchingFishBundleLiveData CatchingFishOkHttp;
    public Object[] CatchingFishReduxKtor;
    public boolean CatchingFishStateLiveData;
    public CatchingFishFABGradle CatchingFishUnitTesting;
    public int CatchingFishViewModelFAB;
    public int[] CatchingFishViewModelScope;
    public int[] CatchingFishWorkManager;

    static {
        CatchingFishToastView catchingFishToastView = new CatchingFishToastView(0);
        catchingFishToastView.CatchingFishStateLiveData = true;
        CatchingFishRoomDatabase = catchingFishToastView;
    }

    public CatchingFishToastView(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.CatchingFishReduxKtor = objArr;
        this.CatchingFishDaggerWebsocket = null;
        this.CatchingFishWorkManager = iArr;
        this.CatchingFishViewModelScope = new int[highestOneBit];
        this.CatchingFishViewModelFAB = 2;
        this.CatchingFishLayout = 0;
        this.CatchingFishFragmentHandler = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishCloudMessaging(int i) {
        Object[] objArr = this.CatchingFishReduxKtor;
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "<this>");
        objArr[i] = null;
        Object[] objArr2 = this.CatchingFishDaggerWebsocket;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i2 = this.CatchingFishWorkManager[i];
        int i3 = this.CatchingFishViewModelFAB * 2;
        int length = this.CatchingFishViewModelScope.length / 2;
        if (i3 > length) {
            i3 = length;
        }
        int i4 = i3;
        int i5 = 0;
        int i6 = i2;
        while (true) {
            i2 = i2 == 0 ? this.CatchingFishViewModelScope.length - 1 : i2 - 1;
            i5++;
            if (i5 > this.CatchingFishViewModelFAB) {
                this.CatchingFishViewModelScope[i6] = 0;
                break;
            }
            int[] iArr = this.CatchingFishViewModelScope;
            int i7 = iArr[i2];
            if (i7 == 0) {
                iArr[i6] = 0;
                break;
            }
            if (i7 < 0) {
                iArr[i6] = -1;
            } else {
                int i8 = i7 - 1;
                int CatchingFishLayout = CatchingFishLayout(this.CatchingFishReduxKtor[i8]) - i2;
                int[] iArr2 = this.CatchingFishViewModelScope;
                if ((CatchingFishLayout & (iArr2.length - 1)) >= i5) {
                    iArr2[i6] = i7;
                    this.CatchingFishWorkManager[i8] = i6;
                }
                i4--;
                if (i4 >= 0) {
                    this.CatchingFishViewModelScope[i6] = -1;
                    break;
                }
            }
            i6 = i2;
            i5 = 0;
            i4--;
            if (i4 >= 0) {
            }
        }
        this.CatchingFishWorkManager[i] = -1;
        this.CatchingFishEspressoTesting--;
        this.CatchingFishCloudMessaging++;
    }

    public final void CatchingFishCoroutine(boolean z) {
        int i;
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.CatchingFishLayout;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.CatchingFishWorkManager;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.CatchingFishReduxKtor;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.CatchingFishViewModelScope[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        CatchingFishLayoutRoomFAB.CatchingFishAnimation(this.CatchingFishReduxKtor, i3, i);
        if (objArr != null) {
            CatchingFishLayoutRoomFAB.CatchingFishAnimation(objArr, i3, this.CatchingFishLayout);
        }
        this.CatchingFishLayout = i3;
    }

    public final boolean CatchingFishDaggerWebsocket(Map.Entry entry) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(entry, "entry");
        int CatchingFishViewModelScope = CatchingFishViewModelScope(entry.getKey());
        if (CatchingFishViewModelScope < 0) {
            return false;
        }
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(objArr);
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(objArr[CatchingFishViewModelScope], entry.getValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.CatchingFishWorkManager[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishFragmentHandler(int i) {
        this.CatchingFishCloudMessaging++;
        int i2 = 0;
        if (this.CatchingFishLayout > this.CatchingFishEspressoTesting) {
            CatchingFishCoroutine(false);
        }
        this.CatchingFishViewModelScope = new int[i];
        this.CatchingFishFragmentHandler = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.CatchingFishLayout) {
            int i3 = i2 + 1;
            int CatchingFishLayout = CatchingFishLayout(this.CatchingFishReduxKtor[i2]);
            int i4 = this.CatchingFishViewModelFAB;
            while (true) {
                int[] iArr = this.CatchingFishViewModelScope;
                if (iArr[CatchingFishLayout] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                CatchingFishLayout = CatchingFishLayout == 0 ? iArr.length - 1 : CatchingFishLayout - 1;
            }
        }
    }

    public final int CatchingFishLayout(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.CatchingFishFragmentHandler;
    }

    public final int CatchingFishParcelableFAB(Object obj) {
        CatchingFishSnackbar();
        while (true) {
            int CatchingFishLayout = CatchingFishLayout(obj);
            int i = this.CatchingFishViewModelFAB * 2;
            int length = this.CatchingFishViewModelScope.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.CatchingFishViewModelScope;
                int i3 = iArr[CatchingFishLayout];
                if (i3 <= 0) {
                    int i4 = this.CatchingFishLayout;
                    Object[] objArr = this.CatchingFishReduxKtor;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.CatchingFishLayout = i5;
                        objArr[i4] = obj;
                        this.CatchingFishWorkManager[i4] = CatchingFishLayout;
                        iArr[CatchingFishLayout] = i5;
                        this.CatchingFishEspressoTesting++;
                        this.CatchingFishCloudMessaging++;
                        if (i2 > this.CatchingFishViewModelFAB) {
                            this.CatchingFishViewModelFAB = i2;
                        }
                        return i4;
                    }
                    CatchingFishWorkManager(1);
                } else {
                    if (CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        CatchingFishFragmentHandler(this.CatchingFishViewModelScope.length * 2);
                        break;
                    }
                    CatchingFishLayout = CatchingFishLayout == 0 ? this.CatchingFishViewModelScope.length - 1 : CatchingFishLayout - 1;
                }
            }
        }
    }

    public final boolean CatchingFishReduxKtor(Collection collection) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!CatchingFishDaggerWebsocket((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void CatchingFishSnackbar() {
        if (this.CatchingFishStateLiveData) {
            throw new UnsupportedOperationException();
        }
    }

    public final int CatchingFishViewModelFAB(Object obj) {
        int i = this.CatchingFishLayout;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.CatchingFishWorkManager[i] >= 0) {
                Object[] objArr = this.CatchingFishDaggerWebsocket;
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(objArr);
                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final int CatchingFishViewModelScope(Object obj) {
        int CatchingFishLayout = CatchingFishLayout(obj);
        int i = this.CatchingFishViewModelFAB;
        while (true) {
            int i2 = this.CatchingFishViewModelScope[CatchingFishLayout];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            CatchingFishLayout = CatchingFishLayout == 0 ? this.CatchingFishViewModelScope.length - 1 : CatchingFishLayout - 1;
        }
    }

    public final void CatchingFishWorkManager(int i) {
        Object[] objArr;
        Object[] objArr2 = this.CatchingFishReduxKtor;
        int length = objArr2.length;
        int i2 = this.CatchingFishLayout;
        int i3 = length - i2;
        int i4 = i2 - this.CatchingFishEspressoTesting;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr2.length / 4) {
            CatchingFishCoroutine(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr2.length) {
            int length2 = objArr2.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr2, i6);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
            this.CatchingFishReduxKtor = copyOf;
            Object[] objArr3 = this.CatchingFishDaggerWebsocket;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i6);
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.CatchingFishDaggerWebsocket = objArr;
            int[] copyOf2 = Arrays.copyOf(this.CatchingFishWorkManager, i6);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf2, "copyOf(...)");
            this.CatchingFishWorkManager = copyOf2;
            int highestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (highestOneBit > this.CatchingFishViewModelScope.length) {
                CatchingFishFragmentHandler(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        CatchingFishSnackbar();
        int i = this.CatchingFishLayout - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.CatchingFishWorkManager;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.CatchingFishViewModelScope[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        CatchingFishLayoutRoomFAB.CatchingFishAnimation(this.CatchingFishReduxKtor, 0, this.CatchingFishLayout);
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        if (objArr != null) {
            CatchingFishLayoutRoomFAB.CatchingFishAnimation(objArr, 0, this.CatchingFishLayout);
        }
        this.CatchingFishEspressoTesting = 0;
        this.CatchingFishLayout = 0;
        this.CatchingFishCloudMessaging++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return CatchingFishViewModelScope(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return CatchingFishViewModelFAB(obj) >= 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        CatchingFishBundleLiveData catchingFishBundleLiveData = this.CatchingFishAnimationMockk;
        if (catchingFishBundleLiveData != null) {
            return catchingFishBundleLiveData;
        }
        CatchingFishBundleLiveData catchingFishBundleLiveData2 = new CatchingFishBundleLiveData(this, 0);
        this.CatchingFishAnimationMockk = catchingFishBundleLiveData2;
        return catchingFishBundleLiveData2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.CatchingFishEspressoTesting == map.size() && CatchingFishReduxKtor(map.entrySet());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int CatchingFishViewModelScope = CatchingFishViewModelScope(obj);
        if (CatchingFishViewModelScope < 0) {
            return null;
        }
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(objArr);
        return objArr[CatchingFishViewModelScope];
    }

    @Override // java.util.Map
    public final int hashCode() {
        CatchingFishFABFABGradle catchingFishFABFABGradle = new CatchingFishFABFABGradle(this, 0);
        int i = 0;
        while (catchingFishFABFABGradle.hasNext()) {
            int i2 = catchingFishFABFABGradle.CatchingFishReduxKtor;
            CatchingFishToastView catchingFishToastView = (CatchingFishToastView) catchingFishFABFABGradle.CatchingFishViewModelScope;
            if (i2 >= catchingFishToastView.CatchingFishLayout) {
                throw new NoSuchElementException();
            }
            catchingFishFABFABGradle.CatchingFishReduxKtor = i2 + 1;
            catchingFishFABFABGradle.CatchingFishDaggerWebsocket = i2;
            Object obj = catchingFishToastView.CatchingFishReduxKtor[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = catchingFishToastView.CatchingFishDaggerWebsocket;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(objArr);
            Object obj2 = objArr[catchingFishFABFABGradle.CatchingFishDaggerWebsocket];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            catchingFishFABFABGradle.CatchingFishDaggerWebsocket();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.CatchingFishEspressoTesting == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        CatchingFishBundleLiveData catchingFishBundleLiveData = this.CatchingFishOkHttp;
        if (catchingFishBundleLiveData != null) {
            return catchingFishBundleLiveData;
        }
        CatchingFishBundleLiveData catchingFishBundleLiveData2 = new CatchingFishBundleLiveData(this, 1);
        this.CatchingFishOkHttp = catchingFishBundleLiveData2;
        return catchingFishBundleLiveData2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        CatchingFishSnackbar();
        int CatchingFishParcelableFAB = CatchingFishParcelableFAB(obj);
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        if (objArr == null) {
            int length = this.CatchingFishReduxKtor.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.CatchingFishDaggerWebsocket = objArr;
        }
        if (CatchingFishParcelableFAB >= 0) {
            objArr[CatchingFishParcelableFAB] = obj2;
            return null;
        }
        int i = (-CatchingFishParcelableFAB) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(map, "from");
        CatchingFishSnackbar();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        CatchingFishWorkManager(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int CatchingFishParcelableFAB = CatchingFishParcelableFAB(entry.getKey());
            Object[] objArr = this.CatchingFishDaggerWebsocket;
            if (objArr == null) {
                int length = this.CatchingFishReduxKtor.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.CatchingFishDaggerWebsocket = objArr;
            }
            if (CatchingFishParcelableFAB >= 0) {
                objArr[CatchingFishParcelableFAB] = entry.getValue();
            } else {
                int i = (-CatchingFishParcelableFAB) - 1;
                if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        CatchingFishSnackbar();
        int CatchingFishViewModelScope = CatchingFishViewModelScope(obj);
        if (CatchingFishViewModelScope < 0) {
            return null;
        }
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(objArr);
        Object obj2 = objArr[CatchingFishViewModelScope];
        CatchingFishCloudMessaging(CatchingFishViewModelScope);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.CatchingFishEspressoTesting;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.CatchingFishEspressoTesting * 3) + 2);
        sb.append("{");
        int i = 0;
        CatchingFishFABFABGradle catchingFishFABFABGradle = new CatchingFishFABFABGradle(this, 0);
        while (catchingFishFABFABGradle.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = catchingFishFABFABGradle.CatchingFishReduxKtor;
            CatchingFishToastView catchingFishToastView = (CatchingFishToastView) catchingFishFABFABGradle.CatchingFishViewModelScope;
            if (i2 >= catchingFishToastView.CatchingFishLayout) {
                throw new NoSuchElementException();
            }
            catchingFishFABFABGradle.CatchingFishReduxKtor = i2 + 1;
            catchingFishFABFABGradle.CatchingFishDaggerWebsocket = i2;
            Object obj = catchingFishToastView.CatchingFishReduxKtor[i2];
            if (obj == catchingFishToastView) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = catchingFishToastView.CatchingFishDaggerWebsocket;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(objArr);
            Object obj2 = objArr[catchingFishFABFABGradle.CatchingFishDaggerWebsocket];
            if (obj2 == catchingFishToastView) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            catchingFishFABFABGradle.CatchingFishDaggerWebsocket();
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        CatchingFishFABGradle catchingFishFABGradle = this.CatchingFishUnitTesting;
        if (catchingFishFABGradle != null) {
            return catchingFishFABGradle;
        }
        CatchingFishFABGradle catchingFishFABGradle2 = new CatchingFishFABGradle(0, this);
        this.CatchingFishUnitTesting = catchingFishFABGradle2;
        return catchingFishFABGradle2;
    }
}
