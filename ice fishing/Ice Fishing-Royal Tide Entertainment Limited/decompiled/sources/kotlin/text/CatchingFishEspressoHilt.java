package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishEspressoHilt {
    public final int CatchingFishCoroutine;
    public final String CatchingFishParcelableFAB;
    public final long CatchingFishSnackbar;

    public CatchingFishEspressoHilt(String str, long j, int i) {
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = j;
        this.CatchingFishCoroutine = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public boolean CatchingFishCoroutine() {
        return false;
    }

    public abstract float CatchingFishDaggerWebsocket(float f, float f2, float f3);

    public abstract float CatchingFishParcelableFAB(int i);

    public abstract long CatchingFishReduxKtor(float f, float f2, float f3);

    public abstract float CatchingFishSnackbar(int i);

    public abstract long CatchingFishWorkManager(float f, float f2, float f3, float f4, CatchingFishEspressoHilt catchingFishEspressoHilt);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CatchingFishEspressoHilt catchingFishEspressoHilt = (CatchingFishEspressoHilt) obj;
        if (this.CatchingFishCoroutine == catchingFishEspressoHilt.CatchingFishCoroutine && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishParcelableFAB, catchingFishEspressoHilt.CatchingFishParcelableFAB)) {
            return CatchingFishMockkSharedFlow.CatchingFishParcelableFAB(this.CatchingFishSnackbar, catchingFishEspressoHilt.CatchingFishSnackbar);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.CatchingFishParcelableFAB.hashCode() * 31;
        int i = CatchingFishMockkSharedFlow.CatchingFishDaggerWebsocket;
        return CatchingFishMVPLiveData.CatchingFishViewModelFAB(hashCode, 31, this.CatchingFishSnackbar) + this.CatchingFishCoroutine;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.CatchingFishParcelableFAB);
        sb.append(" (id=");
        sb.append(this.CatchingFishCoroutine);
        sb.append(", model=");
        long j = CatchingFishMockkSharedFlow.CatchingFishParcelableFAB;
        long j2 = this.CatchingFishSnackbar;
        sb.append((Object) (CatchingFishMockkSharedFlow.CatchingFishParcelableFAB(j2, j) ? "Rgb" : CatchingFishMockkSharedFlow.CatchingFishParcelableFAB(j2, CatchingFishMockkSharedFlow.CatchingFishSnackbar) ? "Xyz" : CatchingFishMockkSharedFlow.CatchingFishParcelableFAB(j2, CatchingFishMockkSharedFlow.CatchingFishCoroutine) ? "Lab" : CatchingFishMockkSharedFlow.CatchingFishParcelableFAB(j2, CatchingFishMockkSharedFlow.CatchingFishReduxKtor) ? "Cmyk" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
