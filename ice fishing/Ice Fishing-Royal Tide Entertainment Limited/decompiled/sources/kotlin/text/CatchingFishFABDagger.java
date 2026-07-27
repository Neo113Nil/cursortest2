package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishFABDagger {
    public final Class CatchingFishParcelableFAB;
    public final Class CatchingFishSnackbar;

    public CatchingFishFABDagger(Class cls, Class cls2) {
        this.CatchingFishParcelableFAB = cls;
        this.CatchingFishSnackbar = cls2;
    }

    public static CatchingFishFABDagger CatchingFishParcelableFAB(Class cls) {
        return new CatchingFishFABDagger(CatchingFishKtorExoPlayer.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CatchingFishFABDagger.class != obj.getClass()) {
            return false;
        }
        CatchingFishFABDagger catchingFishFABDagger = (CatchingFishFABDagger) obj;
        if (this.CatchingFishSnackbar.equals(catchingFishFABDagger.CatchingFishSnackbar)) {
            return this.CatchingFishParcelableFAB.equals(catchingFishFABDagger.CatchingFishParcelableFAB);
        }
        return false;
    }

    public final int hashCode() {
        return this.CatchingFishParcelableFAB.hashCode() + (this.CatchingFishSnackbar.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.CatchingFishSnackbar;
        Class cls2 = this.CatchingFishParcelableFAB;
        if (cls2 == CatchingFishKtorExoPlayer.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
