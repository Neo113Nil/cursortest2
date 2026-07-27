package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishCoroutineRealm extends CatchingFishOkHttpViewModel {
    public final String CatchingFishParcelableFAB;
    public final CatchingFishMVIToolbarJUnit CatchingFishSnackbar;

    public CatchingFishCoroutineRealm(String str, CatchingFishMVIToolbarJUnit catchingFishMVIToolbarJUnit) {
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = catchingFishMVIToolbarJUnit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishCoroutineRealm)) {
            return false;
        }
        CatchingFishCoroutineRealm catchingFishCoroutineRealm = (CatchingFishCoroutineRealm) obj;
        if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishParcelableFAB, catchingFishCoroutineRealm.CatchingFishParcelableFAB) || !CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishSnackbar, catchingFishCoroutineRealm.CatchingFishSnackbar)) {
            return false;
        }
        catchingFishCoroutineRealm.getClass();
        return true;
    }

    public final int hashCode() {
        int hashCode = this.CatchingFishParcelableFAB.hashCode() * 31;
        CatchingFishMVIToolbarJUnit catchingFishMVIToolbarJUnit = this.CatchingFishSnackbar;
        return (hashCode + (catchingFishMVIToolbarJUnit != null ? catchingFishMVIToolbarJUnit.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Url(url=" + this.CatchingFishParcelableFAB + ')';
    }
}
