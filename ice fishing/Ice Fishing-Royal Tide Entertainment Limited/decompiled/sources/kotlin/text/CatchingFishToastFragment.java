package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishToastFragment {
    public static final long CatchingFishCoroutine;
    public static final long CatchingFishDaggerWebsocket;
    public static final long CatchingFishReduxKtor;
    public static final long CatchingFishSnackbar = CatchingFishFirebaseDagger.CatchingFishCoroutine(4278190080L);
    public static final /* synthetic */ int CatchingFishViewModelScope = 0;
    public static final long CatchingFishWorkManager;
    public final long CatchingFishParcelableFAB;

    static {
        CatchingFishFirebaseDagger.CatchingFishCoroutine(4282664004L);
        CatchingFishFirebaseDagger.CatchingFishCoroutine(4287137928L);
        CatchingFishFirebaseDagger.CatchingFishCoroutine(4291611852L);
        CatchingFishFirebaseDagger.CatchingFishCoroutine(4294967295L);
        CatchingFishCoroutine = CatchingFishFirebaseDagger.CatchingFishCoroutine(4294901760L);
        CatchingFishFirebaseDagger.CatchingFishCoroutine(4278255360L);
        CatchingFishReduxKtor = CatchingFishFirebaseDagger.CatchingFishCoroutine(4278190335L);
        CatchingFishFirebaseDagger.CatchingFishCoroutine(4294967040L);
        CatchingFishFirebaseDagger.CatchingFishCoroutine(4278255615L);
        CatchingFishFirebaseDagger.CatchingFishCoroutine(4294902015L);
        CatchingFishDaggerWebsocket = CatchingFishFirebaseDagger.CatchingFishSnackbar(0);
        CatchingFishWorkManager = CatchingFishFirebaseDagger.CatchingFishParcelableFAB(0.0f, 0.0f, 0.0f, 0.0f, CatchingFishSnackbarGlide.CatchingFishCoroutineFlow);
    }

    public static final boolean CatchingFishCoroutine(long j, long j2) {
        return j == j2;
    }

    public static final float CatchingFishDaggerWebsocket(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) CatchingFishHiltMVPToast.CatchingFishLayoutInflater((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - CatchingFishIntentPayPal.CatchingFishParcelableFAB;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final long CatchingFishParcelableFAB(long j, CatchingFishEspressoHilt catchingFishEspressoHilt) {
        CatchingFishServiceFAB catchingFishServiceFAB;
        CatchingFishEspressoHilt catchingFishEspressoHilt2 = CatchingFishSnackbarGlide.CatchingFishGsonAppCompat[(int) (63 & j)];
        int i = catchingFishEspressoHilt2.CatchingFishCoroutine;
        int i2 = catchingFishEspressoHilt.CatchingFishCoroutine;
        if ((i | i2) < 0) {
            catchingFishServiceFAB = CatchingFishLayoutRoomFAB.CatchingFishDaggerHiltFAB(catchingFishEspressoHilt2, catchingFishEspressoHilt);
        } else {
            CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom = CatchingFishAppCompatBundle.CatchingFishParcelableFAB;
            int i3 = i | (i2 << 6);
            Object CatchingFishSnackbar2 = catchingFishLayoutGsonRoom.CatchingFishSnackbar(i3);
            if (CatchingFishSnackbar2 == null) {
                CatchingFishSnackbar2 = CatchingFishLayoutRoomFAB.CatchingFishDaggerHiltFAB(catchingFishEspressoHilt2, catchingFishEspressoHilt);
                catchingFishLayoutGsonRoom.CatchingFishViewModelFAB(i3, CatchingFishSnackbar2);
            }
            catchingFishServiceFAB = (CatchingFishServiceFAB) CatchingFishSnackbar2;
        }
        return catchingFishServiceFAB.CatchingFishParcelableFAB(j);
    }

    public static final float CatchingFishReduxKtor(long j) {
        float CatchingFishLayoutInflater;
        float f;
        if ((63 & j) == 0) {
            CatchingFishLayoutInflater = (float) CatchingFishHiltMVPToast.CatchingFishLayoutInflater((j >>> 56) & 255);
            f = 255.0f;
        } else {
            CatchingFishLayoutInflater = (float) CatchingFishHiltMVPToast.CatchingFishLayoutInflater((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return CatchingFishLayoutInflater / f;
    }

    public static long CatchingFishSnackbar(long j, float f) {
        return CatchingFishFirebaseDagger.CatchingFishParcelableFAB(CatchingFishViewModelScope(j), CatchingFishWorkManager(j), CatchingFishDaggerWebsocket(j), f, CatchingFishSnackbarGlide.CatchingFishGsonAppCompat[(int) (j & 63)]);
    }

    public static String CatchingFishViewModelFAB(long j) {
        return "Color(" + CatchingFishViewModelScope(j) + ", " + CatchingFishWorkManager(j) + ", " + CatchingFishDaggerWebsocket(j) + ", " + CatchingFishReduxKtor(j) + ", " + CatchingFishSnackbarGlide.CatchingFishGsonAppCompat[(int) (j & 63)].CatchingFishParcelableFAB + ')';
    }

    public static final float CatchingFishViewModelScope(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) CatchingFishHiltMVPToast.CatchingFishLayoutInflater((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - CatchingFishIntentPayPal.CatchingFishParcelableFAB;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float CatchingFishWorkManager(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) CatchingFishHiltMVPToast.CatchingFishLayoutInflater((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - CatchingFishIntentPayPal.CatchingFishParcelableFAB;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishToastFragment) {
            return this.CatchingFishParcelableFAB == ((CatchingFishToastFragment) obj).CatchingFishParcelableFAB;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.CatchingFishParcelableFAB);
    }

    public final String toString() {
        return CatchingFishViewModelFAB(this.CatchingFishParcelableFAB);
    }
}
