package kotlin.text;

import java.io.Closeable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishPicassoToolbar implements Closeable {
    public boolean CatchingFishDaggerWebsocket;
    public CatchingFishWidgetGradle CatchingFishReduxKtor;
    public byte[] CatchingFishViewModelFAB;
    public CatchingFishMoshiDaggerMVP CatchingFishWorkManager;
    public long CatchingFishViewModelScope = -1;
    public int CatchingFishLayout = -1;
    public int CatchingFishFragmentHandler = -1;

    public final int CatchingFishSnackbar(long j) {
        CatchingFishWidgetGradle catchingFishWidgetGradle = this.CatchingFishReduxKtor;
        if (catchingFishWidgetGradle == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j >= -1) {
            long j2 = catchingFishWidgetGradle.CatchingFishDaggerWebsocket;
            if (j <= j2) {
                if (j == -1 || j == j2) {
                    this.CatchingFishWorkManager = null;
                    this.CatchingFishViewModelScope = j;
                    this.CatchingFishViewModelFAB = null;
                    this.CatchingFishLayout = -1;
                    this.CatchingFishFragmentHandler = -1;
                    return -1;
                }
                CatchingFishMoshiDaggerMVP catchingFishMoshiDaggerMVP = catchingFishWidgetGradle.CatchingFishReduxKtor;
                CatchingFishMoshiDaggerMVP catchingFishMoshiDaggerMVP2 = this.CatchingFishWorkManager;
                long j3 = 0;
                if (catchingFishMoshiDaggerMVP2 != null) {
                    long j4 = this.CatchingFishViewModelScope - (this.CatchingFishLayout - catchingFishMoshiDaggerMVP2.CatchingFishSnackbar);
                    if (j4 > j) {
                        catchingFishMoshiDaggerMVP2 = catchingFishMoshiDaggerMVP;
                        catchingFishMoshiDaggerMVP = catchingFishMoshiDaggerMVP2;
                        j2 = j4;
                    } else {
                        j3 = j4;
                    }
                } else {
                    catchingFishMoshiDaggerMVP2 = catchingFishMoshiDaggerMVP;
                }
                if (j2 - j > j - j3) {
                    while (true) {
                        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishMoshiDaggerMVP2);
                        long j5 = (catchingFishMoshiDaggerMVP2.CatchingFishCoroutine - catchingFishMoshiDaggerMVP2.CatchingFishSnackbar) + j3;
                        if (j < j5) {
                            break;
                        }
                        catchingFishMoshiDaggerMVP2 = catchingFishMoshiDaggerMVP2.CatchingFishWorkManager;
                        j3 = j5;
                    }
                } else {
                    while (j2 > j) {
                        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishMoshiDaggerMVP);
                        catchingFishMoshiDaggerMVP = catchingFishMoshiDaggerMVP.CatchingFishViewModelScope;
                        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishMoshiDaggerMVP);
                        j2 -= catchingFishMoshiDaggerMVP.CatchingFishCoroutine - catchingFishMoshiDaggerMVP.CatchingFishSnackbar;
                    }
                    catchingFishMoshiDaggerMVP2 = catchingFishMoshiDaggerMVP;
                    j3 = j2;
                }
                if (this.CatchingFishDaggerWebsocket) {
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishMoshiDaggerMVP2);
                    if (catchingFishMoshiDaggerMVP2.CatchingFishReduxKtor) {
                        byte[] bArr = catchingFishMoshiDaggerMVP2.CatchingFishParcelableFAB;
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(this, size)");
                        CatchingFishMoshiDaggerMVP catchingFishMoshiDaggerMVP3 = new CatchingFishMoshiDaggerMVP(copyOf, catchingFishMoshiDaggerMVP2.CatchingFishSnackbar, catchingFishMoshiDaggerMVP2.CatchingFishCoroutine, false, true);
                        if (catchingFishWidgetGradle.CatchingFishReduxKtor == catchingFishMoshiDaggerMVP2) {
                            catchingFishWidgetGradle.CatchingFishReduxKtor = catchingFishMoshiDaggerMVP3;
                        }
                        catchingFishMoshiDaggerMVP2.CatchingFishSnackbar(catchingFishMoshiDaggerMVP3);
                        CatchingFishMoshiDaggerMVP catchingFishMoshiDaggerMVP4 = catchingFishMoshiDaggerMVP3.CatchingFishViewModelScope;
                        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishMoshiDaggerMVP4);
                        catchingFishMoshiDaggerMVP4.CatchingFishParcelableFAB();
                        catchingFishMoshiDaggerMVP2 = catchingFishMoshiDaggerMVP3;
                    }
                }
                this.CatchingFishWorkManager = catchingFishMoshiDaggerMVP2;
                this.CatchingFishViewModelScope = j;
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishMoshiDaggerMVP2);
                this.CatchingFishViewModelFAB = catchingFishMoshiDaggerMVP2.CatchingFishParcelableFAB;
                int i = catchingFishMoshiDaggerMVP2.CatchingFishSnackbar + ((int) (j - j3));
                this.CatchingFishLayout = i;
                int i2 = catchingFishMoshiDaggerMVP2.CatchingFishCoroutine;
                this.CatchingFishFragmentHandler = i2;
                return i2 - i;
            }
        }
        throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + catchingFishWidgetGradle.CatchingFishDaggerWebsocket);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.CatchingFishReduxKtor == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.CatchingFishReduxKtor = null;
        this.CatchingFishWorkManager = null;
        this.CatchingFishViewModelScope = -1L;
        this.CatchingFishViewModelFAB = null;
        this.CatchingFishLayout = -1;
        this.CatchingFishFragmentHandler = -1;
    }
}
