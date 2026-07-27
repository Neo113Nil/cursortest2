package kotlin.text;

import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishBundleGradle {
    public Object[] CatchingFishParcelableFAB;
    public int CatchingFishSnackbar;

    public CatchingFishBundleGradle(int i) {
        this.CatchingFishParcelableFAB = i == 0 ? CatchingFishHandlerLayout.CatchingFishParcelableFAB : new Object[i];
    }

    public final void CatchingFishCloudMessaging(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.CatchingFishSnackbar) || i2 < 0 || i2 > i3) {
            CatchingFishHiltMVPToast.CatchingFishGradleManifest("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.CatchingFishSnackbar);
            throw null;
        }
        if (i2 < i) {
            CatchingFishHiltMVPToast.CatchingFishPayPalLiveData("Start (" + i + ") is more than end (" + i2 + ')');
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.CatchingFishParcelableFAB;
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, objArr, i, i2, i3);
            }
            int i4 = this.CatchingFishSnackbar;
            int i5 = i4 - (i2 - i);
            CatchingFishMVVMHilt.CatchingFishAnimation(this.CatchingFishParcelableFAB, i5, i4);
            this.CatchingFishSnackbar = i5;
        }
    }

    public final void CatchingFishCoroutine() {
        CatchingFishMVVMHilt.CatchingFishAnimation(this.CatchingFishParcelableFAB, 0, this.CatchingFishSnackbar);
        this.CatchingFishSnackbar = 0;
    }

    public final Object CatchingFishDaggerWebsocket(int i) {
        if (i >= 0 && i < this.CatchingFishSnackbar) {
            return this.CatchingFishParcelableFAB[i];
        }
        CatchingFishOkHttp(i);
        throw null;
    }

    public final void CatchingFishEspressoTesting(int i, Object[] objArr) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "oldContent");
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, objArr2, 0, 0, length);
        this.CatchingFishParcelableFAB = objArr2;
    }

    public final Object CatchingFishFragmentHandler(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.CatchingFishSnackbar)) {
            CatchingFishOkHttp(i);
            throw null;
        }
        Object[] objArr = this.CatchingFishParcelableFAB;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, objArr, i, i + 1, i2);
        }
        int i3 = this.CatchingFishSnackbar - 1;
        this.CatchingFishSnackbar = i3;
        objArr[i3] = null;
        return obj;
    }

    public final boolean CatchingFishLayout(Object obj) {
        int CatchingFishWorkManager = CatchingFishWorkManager(obj);
        if (CatchingFishWorkManager < 0) {
            return false;
        }
        CatchingFishFragmentHandler(CatchingFishWorkManager);
        return true;
    }

    public final void CatchingFishOkHttp(int i) {
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(i);
        sb.append(" must be in 0..");
        sb.append(this.CatchingFishSnackbar - 1);
        CatchingFishHiltMVPToast.CatchingFishGradleManifest(sb.toString());
        throw null;
    }

    public final void CatchingFishParcelableFAB(Object obj) {
        int i = this.CatchingFishSnackbar + 1;
        Object[] objArr = this.CatchingFishParcelableFAB;
        if (objArr.length < i) {
            CatchingFishEspressoTesting(i, objArr);
        }
        Object[] objArr2 = this.CatchingFishParcelableFAB;
        int i2 = this.CatchingFishSnackbar;
        objArr2[i2] = obj;
        this.CatchingFishSnackbar = i2 + 1;
    }

    public final Object CatchingFishReduxKtor() {
        if (!CatchingFishViewModelScope()) {
            return this.CatchingFishParcelableFAB[0];
        }
        CatchingFishHiltMVPToast.CatchingFishMotionLayout("ObjectList is empty.");
        throw null;
    }

    public final void CatchingFishSnackbar(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.CatchingFishSnackbar;
        int size = list.size() + i;
        Object[] objArr = this.CatchingFishParcelableFAB;
        if (objArr.length < size) {
            CatchingFishEspressoTesting(size, objArr);
        }
        Object[] objArr2 = this.CatchingFishParcelableFAB;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.CatchingFishSnackbar = list.size() + this.CatchingFishSnackbar;
    }

    public final boolean CatchingFishViewModelFAB() {
        return this.CatchingFishSnackbar != 0;
    }

    public final boolean CatchingFishViewModelScope() {
        return this.CatchingFishSnackbar == 0;
    }

    public final int CatchingFishWorkManager(Object obj) {
        int i = 0;
        if (obj == null) {
            Object[] objArr = this.CatchingFishParcelableFAB;
            int i2 = this.CatchingFishSnackbar;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.CatchingFishParcelableFAB;
        int i3 = this.CatchingFishSnackbar;
        while (i < i3) {
            if (obj.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishBundleGradle) {
            CatchingFishBundleGradle catchingFishBundleGradle = (CatchingFishBundleGradle) obj;
            int i = catchingFishBundleGradle.CatchingFishSnackbar;
            int i2 = this.CatchingFishSnackbar;
            if (i == i2) {
                Object[] objArr = this.CatchingFishParcelableFAB;
                Object[] objArr2 = catchingFishBundleGradle.CatchingFishParcelableFAB;
                CatchingFishLifecycleMoshi CatchingFishMoshiDaggerHilt = CatchingFishOkHttpFAB.CatchingFishMoshiDaggerHilt(0, i2);
                int i3 = CatchingFishMoshiDaggerHilt.CatchingFishReduxKtor;
                int i4 = CatchingFishMoshiDaggerHilt.CatchingFishDaggerWebsocket;
                if (i3 > i4) {
                    return true;
                }
                while (CatchingFishFirebaseDagger.CatchingFishOkHttp(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.CatchingFishParcelableFAB;
        int i = this.CatchingFishSnackbar;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.CatchingFishParcelableFAB;
        int i = this.CatchingFishSnackbar;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i2++;
        }
        String sb2 = sb.toString();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ CatchingFishBundleGradle() {
        this(16);
    }
}
