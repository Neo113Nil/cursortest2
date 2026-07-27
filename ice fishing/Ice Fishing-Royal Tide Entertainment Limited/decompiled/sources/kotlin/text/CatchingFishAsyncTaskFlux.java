package kotlin.text;

import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishAsyncTaskFlux {
    public final int CatchingFishCoroutine;
    public final byte[] CatchingFishDaggerWebsocket;
    public final String CatchingFishParcelableFAB;
    public final int CatchingFishReduxKtor;
    public final char[] CatchingFishSnackbar;

    public CatchingFishAsyncTaskFlux(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        while (true) {
            if (i >= cArr.length) {
                this.CatchingFishParcelableFAB = str;
                this.CatchingFishSnackbar = cArr;
                try {
                    int length = cArr.length;
                    RoundingMode roundingMode = RoundingMode.UNNECESSARY;
                    int CatchingFishMutableLiveData = CatchingFishGsonCardView.CatchingFishMutableLiveData(length);
                    this.CatchingFishCoroutine = CatchingFishMutableLiveData;
                    int numberOfTrailingZeros = Integer.numberOfTrailingZeros(CatchingFishMutableLiveData);
                    this.CatchingFishReduxKtor = CatchingFishMutableLiveData >> numberOfTrailingZeros;
                    this.CatchingFishDaggerWebsocket = bArr;
                    boolean[] zArr = new boolean[1 << (3 - numberOfTrailingZeros)];
                    for (int i2 = 0; i2 < this.CatchingFishReduxKtor; i2++) {
                        int i3 = i2 * 8;
                        int i4 = this.CatchingFishCoroutine;
                        RoundingMode roundingMode2 = RoundingMode.CEILING;
                        roundingMode2.getClass();
                        if (i4 == 0) {
                            throw new ArithmeticException("/ by zero");
                        }
                        int i5 = i3 / i4;
                        int i6 = i3 - (i4 * i5);
                        if (i6 != 0) {
                            int i7 = ((i3 ^ i4) >> 31) | 1;
                            switch (CatchingFishFABSnackbar.CatchingFishParcelableFAB[roundingMode2.ordinal()]) {
                                case 1:
                                    if (i6 != 0) {
                                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                    }
                                    continue;
                                case 2:
                                    break;
                                case 3:
                                    if (i7 >= 0) {
                                        continue;
                                    }
                                    break;
                                case 4:
                                    break;
                                case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                                    if (i7 <= 0) {
                                        continue;
                                    }
                                    break;
                                case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                                case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                                case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                                    int abs = Math.abs(i6);
                                    int abs2 = abs - (Math.abs(i4) - abs);
                                    if (abs2 == 0) {
                                        RoundingMode roundingMode3 = RoundingMode.HALF_UP;
                                        RoundingMode roundingMode4 = RoundingMode.HALF_EVEN;
                                        break;
                                    } else if (abs2 <= 0) {
                                        break;
                                    }
                                    break;
                                default:
                                    throw new AssertionError();
                            }
                            i5 += i7;
                        }
                        zArr[i5] = true;
                    }
                    return;
                } catch (ArithmeticException e) {
                    throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
                }
            }
            char c = cArr[i];
            if (!(c < 128)) {
                throw new IllegalArgumentException(CatchingFishKtorViewModel.CatchingFish("Non-ASCII character: %s", Character.valueOf(c)));
            }
            if (!(bArr[c] == -1)) {
                throw new IllegalArgumentException(CatchingFishKtorViewModel.CatchingFish("Duplicate character: %s", Character.valueOf(c)));
            }
            bArr[c] = (byte) i;
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CatchingFishAsyncTaskFlux)) {
            return false;
        }
        CatchingFishAsyncTaskFlux catchingFishAsyncTaskFlux = (CatchingFishAsyncTaskFlux) obj;
        catchingFishAsyncTaskFlux.getClass();
        return Arrays.equals(this.CatchingFishSnackbar, catchingFishAsyncTaskFlux.CatchingFishSnackbar);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.CatchingFishSnackbar) + 1237;
    }

    public final String toString() {
        return this.CatchingFishParcelableFAB;
    }
}
