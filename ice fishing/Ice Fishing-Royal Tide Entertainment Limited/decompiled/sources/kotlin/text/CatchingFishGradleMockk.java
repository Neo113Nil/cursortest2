package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishGradleMockk {
    public long CatchingFishParcelableFAB = 0;
    public CatchingFishGradleMockk CatchingFishSnackbar;

    public final void CatchingFishCoroutine() {
        if (this.CatchingFishSnackbar == null) {
            this.CatchingFishSnackbar = new CatchingFishGradleMockk();
        }
    }

    public final void CatchingFishDaggerWebsocket(int i, boolean z) {
        if (i >= 64) {
            CatchingFishCoroutine();
            this.CatchingFishSnackbar.CatchingFishDaggerWebsocket(i - 64, z);
            return;
        }
        long j = this.CatchingFishParcelableFAB;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.CatchingFishParcelableFAB = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            CatchingFishViewModelFAB(i);
        } else {
            CatchingFishParcelableFAB(i);
        }
        if (z2 || this.CatchingFishSnackbar != null) {
            CatchingFishCoroutine();
            this.CatchingFishSnackbar.CatchingFishDaggerWebsocket(0, z2);
        }
    }

    public final void CatchingFishParcelableFAB(int i) {
        if (i < 64) {
            this.CatchingFishParcelableFAB &= ~(1 << i);
            return;
        }
        CatchingFishGradleMockk catchingFishGradleMockk = this.CatchingFishSnackbar;
        if (catchingFishGradleMockk != null) {
            catchingFishGradleMockk.CatchingFishParcelableFAB(i - 64);
        }
    }

    public final boolean CatchingFishReduxKtor(int i) {
        if (i < 64) {
            return (this.CatchingFishParcelableFAB & (1 << i)) != 0;
        }
        CatchingFishCoroutine();
        return this.CatchingFishSnackbar.CatchingFishReduxKtor(i - 64);
    }

    public final int CatchingFishSnackbar(int i) {
        CatchingFishGradleMockk catchingFishGradleMockk = this.CatchingFishSnackbar;
        if (catchingFishGradleMockk == null) {
            return i >= 64 ? Long.bitCount(this.CatchingFishParcelableFAB) : Long.bitCount(this.CatchingFishParcelableFAB & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.CatchingFishParcelableFAB & ((1 << i) - 1));
        }
        return Long.bitCount(this.CatchingFishParcelableFAB) + catchingFishGradleMockk.CatchingFishSnackbar(i - 64);
    }

    public final void CatchingFishViewModelFAB(int i) {
        if (i < 64) {
            this.CatchingFishParcelableFAB |= 1 << i;
        } else {
            CatchingFishCoroutine();
            this.CatchingFishSnackbar.CatchingFishViewModelFAB(i - 64);
        }
    }

    public final void CatchingFishViewModelScope() {
        this.CatchingFishParcelableFAB = 0L;
        CatchingFishGradleMockk catchingFishGradleMockk = this.CatchingFishSnackbar;
        if (catchingFishGradleMockk != null) {
            catchingFishGradleMockk.CatchingFishViewModelScope();
        }
    }

    public final boolean CatchingFishWorkManager(int i) {
        if (i >= 64) {
            CatchingFishCoroutine();
            return this.CatchingFishSnackbar.CatchingFishWorkManager(i - 64);
        }
        long j = 1 << i;
        long j2 = this.CatchingFishParcelableFAB;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.CatchingFishParcelableFAB = j3;
        long j4 = j - 1;
        this.CatchingFishParcelableFAB = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        CatchingFishGradleMockk catchingFishGradleMockk = this.CatchingFishSnackbar;
        if (catchingFishGradleMockk != null) {
            if (catchingFishGradleMockk.CatchingFishReduxKtor(0)) {
                CatchingFishViewModelFAB(63);
            }
            this.CatchingFishSnackbar.CatchingFishWorkManager(0);
        }
        return z;
    }

    public final String toString() {
        if (this.CatchingFishSnackbar == null) {
            return Long.toBinaryString(this.CatchingFishParcelableFAB);
        }
        return this.CatchingFishSnackbar.toString() + "xx" + Long.toBinaryString(this.CatchingFishParcelableFAB);
    }
}
