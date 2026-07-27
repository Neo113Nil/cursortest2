package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class CatchingFishReduxSpannable implements Iterable, CatchingFishCardViewFAB {
    public static final CatchingFishReduxSpannable CatchingFishViewModelFAB = new CatchingFishReduxSpannable(0, 0, 0, null);
    public final long CatchingFishDaggerWebsocket;
    public final long CatchingFishReduxKtor;
    public final long[] CatchingFishViewModelScope;
    public final long CatchingFishWorkManager;

    public CatchingFishReduxSpannable(long j, long j2, long j3, long[] jArr) {
        this.CatchingFishReduxKtor = j;
        this.CatchingFishDaggerWebsocket = j2;
        this.CatchingFishWorkManager = j3;
        this.CatchingFishViewModelScope = jArr;
    }

    public final boolean CatchingFishCoroutine(long j) {
        long[] jArr;
        long j2 = j - this.CatchingFishWorkManager;
        long j3 = 0;
        return (CatchingFishFirebaseDagger.CatchingFishCoroutineFlow(j2, j3) < 0 || CatchingFishFirebaseDagger.CatchingFishCoroutineFlow(j2, (long) 64) >= 0) ? (CatchingFishFirebaseDagger.CatchingFishCoroutineFlow(j2, (long) 64) < 0 || CatchingFishFirebaseDagger.CatchingFishCoroutineFlow(j2, (long) 128) >= 0) ? CatchingFishFirebaseDagger.CatchingFishCoroutineFlow(j2, j3) <= 0 && (jArr = this.CatchingFishViewModelScope) != null && CatchingFishToastHiltBundle.CatchingFishLayout(jArr, j) >= 0 : ((1 << (((int) j2) - 64)) & this.CatchingFishReduxKtor) != 0 : ((1 << ((int) j2)) & this.CatchingFishDaggerWebsocket) != 0;
    }

    public final CatchingFishReduxSpannable CatchingFishDaggerWebsocket(CatchingFishReduxSpannable catchingFishReduxSpannable) {
        CatchingFishReduxSpannable catchingFishReduxSpannable2;
        CatchingFishReduxSpannable catchingFishReduxSpannable3;
        long[] jArr;
        CatchingFishReduxSpannable catchingFishReduxSpannable4 = CatchingFishViewModelFAB;
        if (catchingFishReduxSpannable == catchingFishReduxSpannable4) {
            return this;
        }
        if (this == catchingFishReduxSpannable4) {
            return catchingFishReduxSpannable;
        }
        long j = catchingFishReduxSpannable.CatchingFishWorkManager;
        long j2 = catchingFishReduxSpannable.CatchingFishWorkManager;
        long[] jArr2 = catchingFishReduxSpannable.CatchingFishViewModelScope;
        long j3 = catchingFishReduxSpannable.CatchingFishDaggerWebsocket;
        long j4 = catchingFishReduxSpannable.CatchingFishReduxKtor;
        long j5 = this.CatchingFishWorkManager;
        long j6 = this.CatchingFishDaggerWebsocket;
        long j7 = this.CatchingFishReduxKtor;
        if (j == j5 && jArr2 == (jArr = this.CatchingFishViewModelScope)) {
            return new CatchingFishReduxSpannable(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = this.CatchingFishViewModelScope;
        if (jArr3 != null) {
            if (jArr2 != null) {
                catchingFishReduxSpannable2 = this;
                for (long j8 : jArr2) {
                    catchingFishReduxSpannable2 = catchingFishReduxSpannable2.CatchingFishWorkManager(j8);
                }
            } else {
                catchingFishReduxSpannable2 = this;
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        catchingFishReduxSpannable2 = catchingFishReduxSpannable2.CatchingFishWorkManager(i2 + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        catchingFishReduxSpannable2 = catchingFishReduxSpannable2.CatchingFishWorkManager(i + j2 + 64);
                    }
                    i++;
                }
            }
            return catchingFishReduxSpannable2;
        }
        if (jArr3 != null) {
            catchingFishReduxSpannable3 = catchingFishReduxSpannable;
            for (long j9 : jArr3) {
                catchingFishReduxSpannable3 = catchingFishReduxSpannable3.CatchingFishWorkManager(j9);
            }
        } else {
            catchingFishReduxSpannable3 = catchingFishReduxSpannable;
        }
        long j10 = this.CatchingFishWorkManager;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    catchingFishReduxSpannable3 = catchingFishReduxSpannable3.CatchingFishWorkManager(i3 + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    catchingFishReduxSpannable3 = catchingFishReduxSpannable3.CatchingFishWorkManager(i + j10 + 64);
                }
                i++;
            }
        }
        return catchingFishReduxSpannable3;
    }

    public final CatchingFishReduxSpannable CatchingFishParcelableFAB(CatchingFishReduxSpannable catchingFishReduxSpannable) {
        CatchingFishReduxSpannable catchingFishReduxSpannable2;
        long j;
        long[] jArr;
        CatchingFishReduxSpannable catchingFishReduxSpannable3 = CatchingFishViewModelFAB;
        if (catchingFishReduxSpannable == catchingFishReduxSpannable3) {
            return this;
        }
        if (this == catchingFishReduxSpannable3) {
            return catchingFishReduxSpannable3;
        }
        long j2 = catchingFishReduxSpannable.CatchingFishWorkManager;
        long j3 = catchingFishReduxSpannable.CatchingFishWorkManager;
        long[] jArr2 = catchingFishReduxSpannable.CatchingFishViewModelScope;
        long j4 = catchingFishReduxSpannable.CatchingFishDaggerWebsocket;
        long j5 = catchingFishReduxSpannable.CatchingFishReduxKtor;
        long j6 = this.CatchingFishWorkManager;
        if (j2 == j6 && jArr2 == (jArr = this.CatchingFishViewModelScope)) {
            return new CatchingFishReduxSpannable(this.CatchingFishReduxKtor & (~j5), this.CatchingFishDaggerWebsocket & (~j4), j6, jArr);
        }
        if (jArr2 != null) {
            catchingFishReduxSpannable2 = this;
            for (long j7 : jArr2) {
                catchingFishReduxSpannable2 = catchingFishReduxSpannable2.CatchingFishSnackbar(j7);
            }
        } else {
            catchingFishReduxSpannable2 = this;
        }
        long j8 = 0;
        if (j4 != 0) {
            int i = 0;
            while (i < 64) {
                if (((1 << i) & j4) != j8) {
                    j = j8;
                    catchingFishReduxSpannable2 = catchingFishReduxSpannable2.CatchingFishSnackbar(i + j3);
                } else {
                    j = j8;
                }
                i++;
                j8 = j;
            }
        }
        long j9 = j8;
        if (j5 != j9) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j5) != j9) {
                    catchingFishReduxSpannable2 = catchingFishReduxSpannable2.CatchingFishSnackbar(i2 + j3 + 64);
                }
            }
        }
        return catchingFishReduxSpannable2;
    }

    public final CatchingFishReduxSpannable CatchingFishSnackbar(long j) {
        long[] jArr;
        int CatchingFishLayout;
        long[] jArr2;
        long j2 = j - this.CatchingFishWorkManager;
        long j3 = 0;
        if (CatchingFishFirebaseDagger.CatchingFishCoroutineFlow(j2, j3) >= 0 && CatchingFishFirebaseDagger.CatchingFishCoroutineFlow(j2, 64) < 0) {
            long j4 = 1 << ((int) j2);
            long j5 = this.CatchingFishDaggerWebsocket;
            if ((j5 & j4) != 0) {
                return new CatchingFishReduxSpannable(this.CatchingFishReduxKtor, j5 & (~j4), this.CatchingFishWorkManager, this.CatchingFishViewModelScope);
            }
        } else if (CatchingFishFirebaseDagger.CatchingFishCoroutineFlow(j2, 64) >= 0 && CatchingFishFirebaseDagger.CatchingFishCoroutineFlow(j2, 128) < 0) {
            long j6 = 1 << (((int) j2) - 64);
            long j7 = this.CatchingFishReduxKtor;
            if ((j7 & j6) != 0) {
                return new CatchingFishReduxSpannable(j7 & (~j6), this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager, this.CatchingFishViewModelScope);
            }
        } else if (CatchingFishFirebaseDagger.CatchingFishCoroutineFlow(j2, j3) < 0 && (jArr = this.CatchingFishViewModelScope) != null && (CatchingFishLayout = CatchingFishToastHiltBundle.CatchingFishLayout(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (CatchingFishLayout > 0) {
                    CatchingFishMVVMHilt.CatchingFishRecyclerView(jArr, jArr3, 0, 0, CatchingFishLayout);
                }
                if (CatchingFishLayout < i) {
                    CatchingFishMVVMHilt.CatchingFishRecyclerView(jArr, jArr3, CatchingFishLayout, CatchingFishLayout + 1, length);
                }
                jArr2 = jArr3;
            }
            return new CatchingFishReduxSpannable(this.CatchingFishReduxKtor, this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager, jArr2);
        }
        return this;
    }

    public final CatchingFishReduxSpannable CatchingFishWorkManager(long j) {
        long[] jArr;
        long j2;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long j3 = this.CatchingFishWorkManager;
        long j4 = j - j3;
        long j5 = 0;
        int CatchingFishCoroutineFlow = CatchingFishFirebaseDagger.CatchingFishCoroutineFlow(j4, j5);
        long j6 = this.CatchingFishDaggerWebsocket;
        int i = 64;
        long j7 = 0;
        if (CatchingFishCoroutineFlow < 0 || CatchingFishFirebaseDagger.CatchingFishCoroutineFlow(j4, 64) >= 0) {
            long j8 = 64;
            int CatchingFishCoroutineFlow2 = CatchingFishFirebaseDagger.CatchingFishCoroutineFlow(j4, j8);
            long j9 = this.CatchingFishReduxKtor;
            if (CatchingFishCoroutineFlow2 < 0 || CatchingFishFirebaseDagger.CatchingFishCoroutineFlow(j4, 128) >= 0) {
                long j10 = 128;
                int CatchingFishCoroutineFlow3 = CatchingFishFirebaseDagger.CatchingFishCoroutineFlow(j4, j10);
                long[] jArr5 = this.CatchingFishViewModelScope;
                if (CatchingFishCoroutineFlow3 < 0) {
                    if (jArr5 == null) {
                        return new CatchingFishReduxSpannable(this.CatchingFishReduxKtor, this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager, new long[]{j});
                    }
                    int CatchingFishLayout = CatchingFishToastHiltBundle.CatchingFishLayout(jArr5, j);
                    if (CatchingFishLayout < 0) {
                        int i2 = -(CatchingFishLayout + 1);
                        int length = jArr5.length;
                        long[] jArr6 = new long[length + 1];
                        CatchingFishMVVMHilt.CatchingFishRecyclerView(jArr5, jArr6, 0, 0, i2);
                        CatchingFishMVVMHilt.CatchingFishRecyclerView(jArr5, jArr6, i2 + 1, i2, length);
                        jArr6[i2] = j;
                        return new CatchingFishReduxSpannable(this.CatchingFishReduxKtor, this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager, jArr6);
                    }
                } else if (!CatchingFishCoroutine(j)) {
                    long j11 = 1;
                    long j12 = ((j + j11) / j8) * j8;
                    if (CatchingFishFirebaseDagger.CatchingFishCoroutineFlow(j12, j5) < 0) {
                        j12 = (Long.MAX_VALUE - j10) + j11;
                    }
                    long j13 = j3;
                    long j14 = j9;
                    CatchingFishEspressoPayPal catchingFishEspressoPayPal = null;
                    while (true) {
                        if (CatchingFishFirebaseDagger.CatchingFishCoroutineFlow(j13, j12) >= 0) {
                            jArr = jArr5;
                            j2 = j13;
                            j7 = j6;
                            break;
                        }
                        if (j6 != 0) {
                            if (catchingFishEspressoPayPal == null) {
                                catchingFishEspressoPayPal = new CatchingFishEspressoPayPal(jArr5);
                            }
                            int i3 = 0;
                            while (i3 < i) {
                                if ((j6 & (1 << i3)) != 0) {
                                    jArr4 = jArr5;
                                    ((CatchingFishViewFAB) catchingFishEspressoPayPal.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB(i3 + j13);
                                } else {
                                    jArr4 = jArr5;
                                }
                                i3++;
                                jArr5 = jArr4;
                                i = 64;
                            }
                        }
                        long[] jArr7 = jArr5;
                        if (j14 == 0) {
                            j2 = j12;
                            jArr = jArr7;
                            break;
                        }
                        j13 += j8;
                        jArr5 = jArr7;
                        j6 = j14;
                        i = 64;
                        j14 = 0;
                    }
                    if (catchingFishEspressoPayPal != null) {
                        CatchingFishViewFAB catchingFishViewFAB = (CatchingFishViewFAB) catchingFishEspressoPayPal.CatchingFishDaggerWebsocket;
                        int i4 = catchingFishViewFAB.CatchingFishSnackbar;
                        if (i4 == 0) {
                            jArr3 = null;
                        } else {
                            long[] jArr8 = new long[i4];
                            long[] jArr9 = catchingFishViewFAB.CatchingFishParcelableFAB;
                            for (int i5 = 0; i5 < i4; i5++) {
                                jArr8[i5] = jArr9[i5];
                            }
                            jArr3 = jArr8;
                        }
                        if (jArr3 != null) {
                            jArr2 = jArr3;
                            return new CatchingFishReduxSpannable(j14, j7, j2, jArr2).CatchingFishWorkManager(j);
                        }
                    }
                    jArr2 = jArr;
                    return new CatchingFishReduxSpannable(j14, j7, j2, jArr2).CatchingFishWorkManager(j);
                }
            } else {
                long j15 = 1 << (((int) j4) - 64);
                if ((j9 & j15) == 0) {
                    return new CatchingFishReduxSpannable(j9 | j15, this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager, this.CatchingFishViewModelScope);
                }
            }
        } else {
            long j16 = 1 << ((int) j4);
            if ((j6 & j16) == 0) {
                return new CatchingFishReduxSpannable(this.CatchingFishReduxKtor, j6 | j16, this.CatchingFishWorkManager, this.CatchingFishViewModelScope);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return CatchingFishToastHiltBundle.CatchingFishGsonAppCompat(new CatchingFishGsonRedux(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(CatchingFishLayoutToast.CatchingFishParcelable(this));
        Iterator it = iterator();
        while (true) {
            CatchingFishViewDagger catchingFishViewDagger = (CatchingFishViewDagger) it;
            if (!catchingFishViewDagger.hasNext()) {
                break;
            }
            arrayList.add(String.valueOf(((Number) catchingFishViewDagger.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
