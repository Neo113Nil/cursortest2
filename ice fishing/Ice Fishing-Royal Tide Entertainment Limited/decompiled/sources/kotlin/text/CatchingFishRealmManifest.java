package kotlin.text;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishRealmManifest {
    public final CatchingFishAsyncTaskDagger CatchingFishCoroutine;
    public final CatchingFishLayoutExoPlayer CatchingFishSnackbar;
    public int CatchingFishParcelableFAB = 0;
    public int CatchingFishReduxKtor = 8;
    public int[] CatchingFishDaggerWebsocket = new int[8];
    public int[] CatchingFishWorkManager = new int[8];
    public float[] CatchingFishViewModelScope = new float[8];
    public int CatchingFishViewModelFAB = -1;
    public int CatchingFishLayout = -1;
    public boolean CatchingFishFragmentHandler = false;

    public CatchingFishRealmManifest(CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer, CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger) {
        this.CatchingFishSnackbar = catchingFishLayoutExoPlayer;
        this.CatchingFishCoroutine = catchingFishAsyncTaskDagger;
    }

    public final float CatchingFishCoroutine(CatchingFishHandlerGson catchingFishHandlerGson) {
        int i = this.CatchingFishViewModelFAB;
        for (int i2 = 0; i != -1 && i2 < this.CatchingFishParcelableFAB; i2++) {
            if (this.CatchingFishDaggerWebsocket[i] == catchingFishHandlerGson.CatchingFishDaggerWebsocket) {
                return this.CatchingFishViewModelScope[i];
            }
            i = this.CatchingFishWorkManager[i];
        }
        return 0.0f;
    }

    public final CatchingFishHandlerGson CatchingFishDaggerWebsocket(int i) {
        int i2 = this.CatchingFishViewModelFAB;
        for (int i3 = 0; i2 != -1 && i3 < this.CatchingFishParcelableFAB; i3++) {
            if (i3 == i) {
                return ((CatchingFishHandlerGson[]) this.CatchingFishCoroutine.CatchingFishViewModelScope)[this.CatchingFishDaggerWebsocket[i2]];
            }
            i2 = this.CatchingFishWorkManager[i2];
        }
        return null;
    }

    public final void CatchingFishParcelableFAB(CatchingFishHandlerGson catchingFishHandlerGson, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.CatchingFishViewModelFAB;
            CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer = this.CatchingFishSnackbar;
            if (i == -1) {
                this.CatchingFishViewModelFAB = 0;
                this.CatchingFishViewModelScope[0] = f;
                this.CatchingFishDaggerWebsocket[0] = catchingFishHandlerGson.CatchingFishDaggerWebsocket;
                this.CatchingFishWorkManager[0] = -1;
                catchingFishHandlerGson.CatchingFishUnitTesting++;
                catchingFishHandlerGson.CatchingFishParcelableFAB(catchingFishLayoutExoPlayer);
                this.CatchingFishParcelableFAB++;
                if (this.CatchingFishFragmentHandler) {
                    return;
                }
                int i2 = this.CatchingFishLayout + 1;
                this.CatchingFishLayout = i2;
                int[] iArr = this.CatchingFishDaggerWebsocket;
                if (i2 >= iArr.length) {
                    this.CatchingFishFragmentHandler = true;
                    this.CatchingFishLayout = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.CatchingFishParcelableFAB; i4++) {
                int i5 = this.CatchingFishDaggerWebsocket[i];
                int i6 = catchingFishHandlerGson.CatchingFishDaggerWebsocket;
                if (i5 == i6) {
                    float[] fArr = this.CatchingFishViewModelScope;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.CatchingFishViewModelFAB) {
                            this.CatchingFishViewModelFAB = this.CatchingFishWorkManager[i];
                        } else {
                            int[] iArr2 = this.CatchingFishWorkManager;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            catchingFishHandlerGson.CatchingFishSnackbar(catchingFishLayoutExoPlayer);
                        }
                        if (this.CatchingFishFragmentHandler) {
                            this.CatchingFishLayout = i;
                        }
                        catchingFishHandlerGson.CatchingFishUnitTesting--;
                        this.CatchingFishParcelableFAB--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.CatchingFishWorkManager[i];
            }
            int i7 = this.CatchingFishLayout;
            int i8 = i7 + 1;
            if (this.CatchingFishFragmentHandler) {
                int[] iArr3 = this.CatchingFishDaggerWebsocket;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.CatchingFishDaggerWebsocket;
            if (i7 >= iArr4.length && this.CatchingFishParcelableFAB < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.CatchingFishDaggerWebsocket;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.CatchingFishDaggerWebsocket;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.CatchingFishReduxKtor * 2;
                this.CatchingFishReduxKtor = i10;
                this.CatchingFishFragmentHandler = false;
                this.CatchingFishLayout = i7 - 1;
                this.CatchingFishViewModelScope = Arrays.copyOf(this.CatchingFishViewModelScope, i10);
                this.CatchingFishDaggerWebsocket = Arrays.copyOf(this.CatchingFishDaggerWebsocket, this.CatchingFishReduxKtor);
                this.CatchingFishWorkManager = Arrays.copyOf(this.CatchingFishWorkManager, this.CatchingFishReduxKtor);
            }
            this.CatchingFishDaggerWebsocket[i7] = catchingFishHandlerGson.CatchingFishDaggerWebsocket;
            this.CatchingFishViewModelScope[i7] = f;
            if (i3 != -1) {
                int[] iArr7 = this.CatchingFishWorkManager;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.CatchingFishWorkManager[i7] = this.CatchingFishViewModelFAB;
                this.CatchingFishViewModelFAB = i7;
            }
            catchingFishHandlerGson.CatchingFishUnitTesting++;
            catchingFishHandlerGson.CatchingFishParcelableFAB(catchingFishLayoutExoPlayer);
            this.CatchingFishParcelableFAB++;
            if (!this.CatchingFishFragmentHandler) {
                this.CatchingFishLayout++;
            }
            int i11 = this.CatchingFishLayout;
            int[] iArr8 = this.CatchingFishDaggerWebsocket;
            if (i11 >= iArr8.length) {
                this.CatchingFishFragmentHandler = true;
                this.CatchingFishLayout = iArr8.length - 1;
            }
        }
    }

    public final int CatchingFishReduxKtor() {
        return this.CatchingFishParcelableFAB;
    }

    public final void CatchingFishSnackbar() {
        int i = this.CatchingFishViewModelFAB;
        for (int i2 = 0; i != -1 && i2 < this.CatchingFishParcelableFAB; i2++) {
            CatchingFishHandlerGson catchingFishHandlerGson = ((CatchingFishHandlerGson[]) this.CatchingFishCoroutine.CatchingFishViewModelScope)[this.CatchingFishDaggerWebsocket[i]];
            if (catchingFishHandlerGson != null) {
                catchingFishHandlerGson.CatchingFishSnackbar(this.CatchingFishSnackbar);
            }
            i = this.CatchingFishWorkManager[i];
        }
        this.CatchingFishViewModelFAB = -1;
        this.CatchingFishLayout = -1;
        this.CatchingFishFragmentHandler = false;
        this.CatchingFishParcelableFAB = 0;
    }

    public final float CatchingFishViewModelFAB(CatchingFishHandlerGson catchingFishHandlerGson, boolean z) {
        int i = this.CatchingFishViewModelFAB;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.CatchingFishParcelableFAB) {
            if (this.CatchingFishDaggerWebsocket[i] == catchingFishHandlerGson.CatchingFishDaggerWebsocket) {
                if (i == this.CatchingFishViewModelFAB) {
                    this.CatchingFishViewModelFAB = this.CatchingFishWorkManager[i];
                } else {
                    int[] iArr = this.CatchingFishWorkManager;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    catchingFishHandlerGson.CatchingFishSnackbar(this.CatchingFishSnackbar);
                }
                catchingFishHandlerGson.CatchingFishUnitTesting--;
                this.CatchingFishParcelableFAB--;
                this.CatchingFishDaggerWebsocket[i] = -1;
                if (this.CatchingFishFragmentHandler) {
                    this.CatchingFishLayout = i;
                }
                return this.CatchingFishViewModelScope[i];
            }
            i2++;
            i3 = i;
            i = this.CatchingFishWorkManager[i];
        }
        return 0.0f;
    }

    public final void CatchingFishViewModelScope(CatchingFishHandlerGson catchingFishHandlerGson, float f) {
        if (f == 0.0f) {
            CatchingFishViewModelFAB(catchingFishHandlerGson, true);
            return;
        }
        int i = this.CatchingFishViewModelFAB;
        CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer = this.CatchingFishSnackbar;
        if (i == -1) {
            this.CatchingFishViewModelFAB = 0;
            this.CatchingFishViewModelScope[0] = f;
            this.CatchingFishDaggerWebsocket[0] = catchingFishHandlerGson.CatchingFishDaggerWebsocket;
            this.CatchingFishWorkManager[0] = -1;
            catchingFishHandlerGson.CatchingFishUnitTesting++;
            catchingFishHandlerGson.CatchingFishParcelableFAB(catchingFishLayoutExoPlayer);
            this.CatchingFishParcelableFAB++;
            if (this.CatchingFishFragmentHandler) {
                return;
            }
            int i2 = this.CatchingFishLayout + 1;
            this.CatchingFishLayout = i2;
            int[] iArr = this.CatchingFishDaggerWebsocket;
            if (i2 >= iArr.length) {
                this.CatchingFishFragmentHandler = true;
                this.CatchingFishLayout = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.CatchingFishParcelableFAB; i4++) {
            int i5 = this.CatchingFishDaggerWebsocket[i];
            int i6 = catchingFishHandlerGson.CatchingFishDaggerWebsocket;
            if (i5 == i6) {
                this.CatchingFishViewModelScope[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.CatchingFishWorkManager[i];
        }
        int i7 = this.CatchingFishLayout;
        int i8 = i7 + 1;
        if (this.CatchingFishFragmentHandler) {
            int[] iArr2 = this.CatchingFishDaggerWebsocket;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.CatchingFishDaggerWebsocket;
        if (i7 >= iArr3.length && this.CatchingFishParcelableFAB < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.CatchingFishDaggerWebsocket;
                if (i9 >= iArr4.length) {
                    break;
                }
                if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr5 = this.CatchingFishDaggerWebsocket;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.CatchingFishReduxKtor * 2;
            this.CatchingFishReduxKtor = i10;
            this.CatchingFishFragmentHandler = false;
            this.CatchingFishLayout = i7 - 1;
            this.CatchingFishViewModelScope = Arrays.copyOf(this.CatchingFishViewModelScope, i10);
            this.CatchingFishDaggerWebsocket = Arrays.copyOf(this.CatchingFishDaggerWebsocket, this.CatchingFishReduxKtor);
            this.CatchingFishWorkManager = Arrays.copyOf(this.CatchingFishWorkManager, this.CatchingFishReduxKtor);
        }
        this.CatchingFishDaggerWebsocket[i7] = catchingFishHandlerGson.CatchingFishDaggerWebsocket;
        this.CatchingFishViewModelScope[i7] = f;
        if (i3 != -1) {
            int[] iArr6 = this.CatchingFishWorkManager;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.CatchingFishWorkManager[i7] = this.CatchingFishViewModelFAB;
            this.CatchingFishViewModelFAB = i7;
        }
        catchingFishHandlerGson.CatchingFishUnitTesting++;
        catchingFishHandlerGson.CatchingFishParcelableFAB(catchingFishLayoutExoPlayer);
        int i11 = this.CatchingFishParcelableFAB + 1;
        this.CatchingFishParcelableFAB = i11;
        if (!this.CatchingFishFragmentHandler) {
            this.CatchingFishLayout++;
        }
        int[] iArr7 = this.CatchingFishDaggerWebsocket;
        if (i11 >= iArr7.length) {
            this.CatchingFishFragmentHandler = true;
        }
        if (this.CatchingFishLayout >= iArr7.length) {
            this.CatchingFishFragmentHandler = true;
            this.CatchingFishLayout = iArr7.length - 1;
        }
    }

    public final float CatchingFishWorkManager(int i) {
        int i2 = this.CatchingFishViewModelFAB;
        for (int i3 = 0; i2 != -1 && i3 < this.CatchingFishParcelableFAB; i3++) {
            if (i3 == i) {
                return this.CatchingFishViewModelScope[i2];
            }
            i2 = this.CatchingFishWorkManager[i2];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.CatchingFishViewModelFAB;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.CatchingFishParcelableFAB; i2++) {
            str = (CatchingFishMVPLiveData.CatchingFishEspressoTesting(str, " -> ") + this.CatchingFishViewModelScope[i] + " : ") + ((CatchingFishHandlerGson[]) this.CatchingFishCoroutine.CatchingFishViewModelScope)[this.CatchingFishDaggerWebsocket[i]];
            i = this.CatchingFishWorkManager[i];
        }
        return str;
    }
}
