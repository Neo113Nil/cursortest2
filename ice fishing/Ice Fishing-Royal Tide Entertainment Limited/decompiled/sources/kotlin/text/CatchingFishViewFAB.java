package kotlin.text;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishViewFAB {
    public long[] CatchingFishParcelableFAB;
    public int CatchingFishSnackbar;

    public CatchingFishViewFAB(int i) {
        this.CatchingFishParcelableFAB = i == 0 ? CatchingFishNavigationKtor.CatchingFishParcelableFAB : new long[i];
    }

    public final void CatchingFishParcelableFAB(long j) {
        int i = this.CatchingFishSnackbar + 1;
        long[] jArr = this.CatchingFishParcelableFAB;
        if (jArr.length < i) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
            this.CatchingFishParcelableFAB = copyOf;
        }
        long[] jArr2 = this.CatchingFishParcelableFAB;
        int i2 = this.CatchingFishSnackbar;
        jArr2[i2] = j;
        this.CatchingFishSnackbar = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishViewFAB) {
            CatchingFishViewFAB catchingFishViewFAB = (CatchingFishViewFAB) obj;
            int i = catchingFishViewFAB.CatchingFishSnackbar;
            int i2 = this.CatchingFishSnackbar;
            if (i == i2) {
                long[] jArr = this.CatchingFishParcelableFAB;
                long[] jArr2 = catchingFishViewFAB.CatchingFishParcelableFAB;
                CatchingFishLifecycleMoshi CatchingFishMoshiDaggerHilt = CatchingFishOkHttpFAB.CatchingFishMoshiDaggerHilt(0, i2);
                int i3 = CatchingFishMoshiDaggerHilt.CatchingFishReduxKtor;
                int i4 = CatchingFishMoshiDaggerHilt.CatchingFishDaggerWebsocket;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
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
        long[] jArr = this.CatchingFishParcelableFAB;
        int i = this.CatchingFishSnackbar;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Long.hashCode(jArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.CatchingFishParcelableFAB;
        int i = this.CatchingFishSnackbar;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
            i2++;
        }
        String sb2 = sb.toString();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(sb2, "toString(...)");
        return sb2;
    }
}
