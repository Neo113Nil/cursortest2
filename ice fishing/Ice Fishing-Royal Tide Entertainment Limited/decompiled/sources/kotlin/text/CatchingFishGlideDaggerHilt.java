package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishGlideDaggerHilt {
    public final int CatchingFishCoroutine;
    public final CatchingFishFABDagger CatchingFishParcelableFAB;
    public final int CatchingFishSnackbar;

    public CatchingFishGlideDaggerHilt(int i, int i2, Class cls) {
        this(CatchingFishFABDagger.CatchingFishParcelableFAB(cls), i, i2);
    }

    public static CatchingFishGlideDaggerHilt CatchingFishParcelableFAB(Class cls) {
        return new CatchingFishGlideDaggerHilt(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CatchingFishGlideDaggerHilt)) {
            return false;
        }
        CatchingFishGlideDaggerHilt catchingFishGlideDaggerHilt = (CatchingFishGlideDaggerHilt) obj;
        return this.CatchingFishParcelableFAB.equals(catchingFishGlideDaggerHilt.CatchingFishParcelableFAB) && this.CatchingFishSnackbar == catchingFishGlideDaggerHilt.CatchingFishSnackbar && this.CatchingFishCoroutine == catchingFishGlideDaggerHilt.CatchingFishCoroutine;
    }

    public final int hashCode() {
        return ((((this.CatchingFishParcelableFAB.hashCode() ^ 1000003) * 1000003) ^ this.CatchingFishSnackbar) * 1000003) ^ this.CatchingFishCoroutine;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.CatchingFishParcelableFAB);
        sb.append(", type=");
        int i = this.CatchingFishSnackbar;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.CatchingFishCoroutine;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(CatchingFishMVPLiveData.CatchingFishCloudMessaging("Unsupported injection: ", i2));
            }
            str = "deferred";
        }
        return CatchingFishMVPLiveData.CatchingFishStateLiveData(sb, str, "}");
    }

    public CatchingFishGlideDaggerHilt(CatchingFishFABDagger catchingFishFABDagger, int i, int i2) {
        this.CatchingFishParcelableFAB = catchingFishFABDagger;
        this.CatchingFishSnackbar = i;
        this.CatchingFishCoroutine = i2;
    }
}
