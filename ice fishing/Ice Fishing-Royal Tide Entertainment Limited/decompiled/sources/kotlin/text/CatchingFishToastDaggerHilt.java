package kotlin.text;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishToastDaggerHilt {
    public static final CatchingFishToastDaggerHilt CatchingFishWorkManager = new CatchingFishToastDaggerHilt(0, new int[0], new Object[0], false);
    public Object[] CatchingFishCoroutine;
    public boolean CatchingFishDaggerWebsocket;
    public int CatchingFishParcelableFAB;
    public int CatchingFishReduxKtor = -1;
    public int[] CatchingFishSnackbar;

    public CatchingFishToastDaggerHilt(int i, int[] iArr, Object[] objArr, boolean z) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = iArr;
        this.CatchingFishCoroutine = objArr;
        this.CatchingFishDaggerWebsocket = z;
    }

    public final void CatchingFishCoroutine(int i, Object obj) {
        if (!this.CatchingFishDaggerWebsocket) {
            throw new UnsupportedOperationException();
        }
        CatchingFishParcelableFAB(this.CatchingFishParcelableFAB + 1);
        int[] iArr = this.CatchingFishSnackbar;
        int i2 = this.CatchingFishParcelableFAB;
        iArr[i2] = i;
        this.CatchingFishCoroutine[i2] = obj;
        this.CatchingFishParcelableFAB = i2 + 1;
    }

    public final void CatchingFishParcelableFAB(int i) {
        int[] iArr = this.CatchingFishSnackbar;
        if (i > iArr.length) {
            int i2 = this.CatchingFishParcelableFAB;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.CatchingFishSnackbar = Arrays.copyOf(iArr, i);
            this.CatchingFishCoroutine = Arrays.copyOf(this.CatchingFishCoroutine, i);
        }
    }

    public final void CatchingFishReduxKtor(CatchingFishServiceHilt catchingFishServiceHilt) {
        if (this.CatchingFishParcelableFAB == 0) {
            return;
        }
        catchingFishServiceHilt.getClass();
        CatchingFishViewSnackbar catchingFishViewSnackbar = (CatchingFishViewSnackbar) catchingFishServiceHilt.CatchingFishDaggerWebsocket;
        for (int i = 0; i < this.CatchingFishParcelableFAB; i++) {
            int i2 = this.CatchingFishSnackbar[i];
            Object obj = this.CatchingFishCoroutine[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                catchingFishViewSnackbar.CatchingFishKtor(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                catchingFishViewSnackbar.CatchingFishWidget(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                catchingFishViewSnackbar.CatchingFishGlideWidgetKtor(i3, (CatchingFishCameraXRealm) obj);
            } else if (i4 == 3) {
                catchingFishViewSnackbar.CatchingFishSharedFlow(i3, 3);
                ((CatchingFishToastDaggerHilt) obj).CatchingFishReduxKtor(catchingFishServiceHilt);
                catchingFishViewSnackbar.CatchingFishSharedFlow(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(CatchingFishKtorMVPAndroidX.CatchingFishSnackbar());
                }
                catchingFishViewSnackbar.CatchingFishGraphQLGlide(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final int CatchingFishSnackbar() {
        int CatchingFishReduxMoshi;
        int CatchingFishFirebase;
        int CatchingFishReduxMoshi2;
        int i = this.CatchingFishReduxKtor;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.CatchingFishParcelableFAB; i3++) {
            int i4 = this.CatchingFishSnackbar[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.CatchingFishCoroutine[i3]).getClass();
                    CatchingFishReduxMoshi2 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i5) + 8;
                } else if (i6 == 2) {
                    CatchingFishReduxMoshi2 = CatchingFishViewSnackbar.CatchingFishDaggerMVVM(i5, (CatchingFishCameraXRealm) this.CatchingFishCoroutine[i3]);
                } else if (i6 == 3) {
                    CatchingFishReduxMoshi = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i5) * 2;
                    CatchingFishFirebase = ((CatchingFishToastDaggerHilt) this.CatchingFishCoroutine[i3]).CatchingFishSnackbar();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(CatchingFishKtorMVPAndroidX.CatchingFishSnackbar());
                    }
                    ((Integer) this.CatchingFishCoroutine[i3]).getClass();
                    CatchingFishReduxMoshi2 = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i5) + 4;
                }
                i2 = CatchingFishReduxMoshi2 + i2;
            } else {
                long longValue = ((Long) this.CatchingFishCoroutine[i3]).longValue();
                CatchingFishReduxMoshi = CatchingFishViewSnackbar.CatchingFishReduxMoshi(i5);
                CatchingFishFirebase = CatchingFishViewSnackbar.CatchingFishFirebase(longValue);
            }
            i2 = CatchingFishFirebase + CatchingFishReduxMoshi + i2;
        }
        this.CatchingFishReduxKtor = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CatchingFishToastDaggerHilt)) {
            return false;
        }
        CatchingFishToastDaggerHilt catchingFishToastDaggerHilt = (CatchingFishToastDaggerHilt) obj;
        int i = this.CatchingFishParcelableFAB;
        if (i == catchingFishToastDaggerHilt.CatchingFishParcelableFAB) {
            int[] iArr = this.CatchingFishSnackbar;
            int[] iArr2 = catchingFishToastDaggerHilt.CatchingFishSnackbar;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.CatchingFishCoroutine;
                    Object[] objArr2 = catchingFishToastDaggerHilt.CatchingFishCoroutine;
                    int i3 = this.CatchingFishParcelableFAB;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.CatchingFishParcelableFAB;
        int i2 = (527 + i) * 31;
        int[] iArr = this.CatchingFishSnackbar;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.CatchingFishCoroutine;
        int i7 = this.CatchingFishParcelableFAB;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
