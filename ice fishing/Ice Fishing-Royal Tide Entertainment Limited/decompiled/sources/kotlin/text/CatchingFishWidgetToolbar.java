package kotlin.text;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishWidgetToolbar {
    public int[] CatchingFishParcelableFAB;
    public int CatchingFishSnackbar;

    public CatchingFishWidgetToolbar(int i, boolean z) {
        switch (i) {
            case 2:
                this.CatchingFishParcelableFAB = new int[10];
                break;
            default:
                this.CatchingFishParcelableFAB = new int[10];
                break;
        }
    }

    public int CatchingFishCoroutine() {
        int[] iArr = this.CatchingFishParcelableFAB;
        int i = this.CatchingFishSnackbar - 1;
        this.CatchingFishSnackbar = i;
        return iArr[i];
    }

    public void CatchingFishDaggerWebsocket(int i, int i2, int i3) {
        int i4 = this.CatchingFishSnackbar;
        int[] iArr = this.CatchingFishParcelableFAB;
        int i5 = i4 + 3;
        if (i5 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(iArr, "copyOf(...)");
            this.CatchingFishParcelableFAB = iArr;
        }
        iArr[i4] = i + i3;
        iArr[i4 + 1] = i2 + i3;
        iArr[i4 + 2] = i3;
        this.CatchingFishSnackbar = i5;
    }

    public void CatchingFishLayout(int i, int i2) {
        int[] iArr = this.CatchingFishParcelableFAB;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    public int CatchingFishParcelableFAB() {
        if ((this.CatchingFishSnackbar & 128) != 0) {
            return this.CatchingFishParcelableFAB[7];
        }
        return 65535;
    }

    public void CatchingFishReduxKtor(int i) {
        int[] iArr = this.CatchingFishParcelableFAB;
        if (this.CatchingFishSnackbar >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(iArr, "copyOf(...)");
            this.CatchingFishParcelableFAB = iArr;
        }
        int i2 = this.CatchingFishSnackbar;
        this.CatchingFishSnackbar = i2 + 1;
        iArr[i2] = i;
    }

    public int CatchingFishSnackbar(int i) {
        int i2 = this.CatchingFishSnackbar - 1;
        return i2 >= 0 ? this.CatchingFishParcelableFAB[i2] : i;
    }

    public void CatchingFishViewModelFAB(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.CatchingFishParcelableFAB;
            if (i >= iArr.length) {
                return;
            }
            this.CatchingFishSnackbar = (1 << i) | this.CatchingFishSnackbar;
            iArr[i] = i2;
        }
    }

    public void CatchingFishViewModelScope(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.CatchingFishParcelableFAB;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    CatchingFishLayout(i3, i4);
                }
            }
            CatchingFishLayout(i3 + 3, i2);
            CatchingFishViewModelScope(i, i3);
            CatchingFishViewModelScope(i3 + 6, i2);
        }
    }

    public void CatchingFishWorkManager(int i, int i2, int i3, int i4) {
        int i5 = this.CatchingFishSnackbar;
        int[] iArr = this.CatchingFishParcelableFAB;
        int i6 = i5 + 4;
        if (i6 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(iArr, "copyOf(...)");
            this.CatchingFishParcelableFAB = iArr;
        }
        iArr[i5] = i;
        iArr[i5 + 1] = i2;
        iArr[i5 + 2] = i3;
        iArr[i5 + 3] = i4;
        this.CatchingFishSnackbar = i6;
    }

    public CatchingFishWidgetToolbar(int i) {
        this.CatchingFishParcelableFAB = new int[i];
    }
}
