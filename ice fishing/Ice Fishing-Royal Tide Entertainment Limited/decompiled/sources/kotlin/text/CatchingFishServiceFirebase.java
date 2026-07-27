package kotlin.text;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class CatchingFishServiceFirebase {
    public final Resources.Theme CatchingFishParcelableFAB;
    public final int CatchingFishSnackbar;

    public CatchingFishServiceFirebase(Resources.Theme theme, int i) {
        this.CatchingFishParcelableFAB = theme;
        this.CatchingFishSnackbar = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishServiceFirebase)) {
            return false;
        }
        CatchingFishServiceFirebase catchingFishServiceFirebase = (CatchingFishServiceFirebase) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishParcelableFAB, catchingFishServiceFirebase.CatchingFishParcelableFAB) && this.CatchingFishSnackbar == catchingFishServiceFirebase.CatchingFishSnackbar;
    }

    public final int hashCode() {
        return Integer.hashCode(this.CatchingFishSnackbar) + (this.CatchingFishParcelableFAB.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.CatchingFishParcelableFAB);
        sb.append(", id=");
        return CatchingFishMVPLiveData.CatchingFishAnimationMockk(sb, this.CatchingFishSnackbar, ')');
    }
}
