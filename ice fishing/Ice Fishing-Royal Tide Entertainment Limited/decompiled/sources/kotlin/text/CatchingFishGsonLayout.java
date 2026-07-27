package kotlin.text;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishGsonLayout {
    public int[] CatchingFishParcelableFAB;
    public int CatchingFishSnackbar;

    public CatchingFishGsonLayout(int i) {
        this.CatchingFishParcelableFAB = i == 0 ? CatchingFishJUnitEspresso.CatchingFishParcelableFAB : new int[i];
    }

    public final void CatchingFishCoroutine(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.CatchingFishSnackbar)) {
            CatchingFishHiltMVPToast.CatchingFishGradleManifest("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.CatchingFishParcelableFAB;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            CatchingFishMVVMHilt.CatchingFishParcelable(i, i + 1, i2, iArr, iArr);
        }
        this.CatchingFishSnackbar--;
    }

    public final void CatchingFishParcelableFAB(int i) {
        int i2 = this.CatchingFishSnackbar + 1;
        int[] iArr = this.CatchingFishParcelableFAB;
        if (iArr.length < i2) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
            this.CatchingFishParcelableFAB = copyOf;
        }
        int[] iArr2 = this.CatchingFishParcelableFAB;
        int i3 = this.CatchingFishSnackbar;
        iArr2[i3] = i;
        this.CatchingFishSnackbar = i3 + 1;
    }

    public final void CatchingFishReduxKtor(int i, int i2) {
        if (i < 0 || i >= this.CatchingFishSnackbar) {
            CatchingFishHiltMVPToast.CatchingFishGradleManifest("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.CatchingFishParcelableFAB;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final int CatchingFishSnackbar(int i) {
        if (i >= 0 && i < this.CatchingFishSnackbar) {
            return this.CatchingFishParcelableFAB[i];
        }
        CatchingFishHiltMVPToast.CatchingFishGradleManifest("Index must be between 0 and size");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishGsonLayout) {
            CatchingFishGsonLayout catchingFishGsonLayout = (CatchingFishGsonLayout) obj;
            int i = catchingFishGsonLayout.CatchingFishSnackbar;
            int i2 = this.CatchingFishSnackbar;
            if (i == i2) {
                int[] iArr = this.CatchingFishParcelableFAB;
                int[] iArr2 = catchingFishGsonLayout.CatchingFishParcelableFAB;
                CatchingFishLifecycleMoshi CatchingFishMoshiDaggerHilt = CatchingFishOkHttpFAB.CatchingFishMoshiDaggerHilt(0, i2);
                int i3 = CatchingFishMoshiDaggerHilt.CatchingFishReduxKtor;
                int i4 = CatchingFishMoshiDaggerHilt.CatchingFishDaggerWebsocket;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
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
        int[] iArr = this.CatchingFishParcelableFAB;
        int i = this.CatchingFishSnackbar;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Integer.hashCode(iArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.CatchingFishParcelableFAB;
        int i = this.CatchingFishSnackbar;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        String sb2 = sb.toString();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ CatchingFishGsonLayout() {
        this(16);
    }
}
