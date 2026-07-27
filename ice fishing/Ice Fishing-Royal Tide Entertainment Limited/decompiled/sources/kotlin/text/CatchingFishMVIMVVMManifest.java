package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMVIMVVMManifest {
    public static final float CatchingFishCoroutine;
    public static final float CatchingFishReduxKtor;
    public static final float CatchingFishSnackbar;
    public final float CatchingFishParcelableFAB;

    static {
        CatchingFishParcelableFAB(0.0f);
        CatchingFishParcelableFAB(0.5f);
        CatchingFishSnackbar = 0.5f;
        CatchingFishParcelableFAB(-1.0f);
        CatchingFishCoroutine = -1.0f;
        CatchingFishParcelableFAB(1.0f);
        CatchingFishReduxKtor = 1.0f;
    }

    public static void CatchingFishParcelableFAB(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            CatchingFishReduxAsyncTask.CatchingFishSnackbar("topRatio should be in [0..1] range or -1");
        }
    }

    public static String CatchingFishSnackbar(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == CatchingFishSnackbar) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == CatchingFishCoroutine) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == CatchingFishReduxKtor) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishMVIMVVMManifest) {
            return Float.compare(this.CatchingFishParcelableFAB, ((CatchingFishMVIMVVMManifest) obj).CatchingFishParcelableFAB) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.CatchingFishParcelableFAB);
    }

    public final String toString() {
        return CatchingFishSnackbar(this.CatchingFishParcelableFAB);
    }
}
