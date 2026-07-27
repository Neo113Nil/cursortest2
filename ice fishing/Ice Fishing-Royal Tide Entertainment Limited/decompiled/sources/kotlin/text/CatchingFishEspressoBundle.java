package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishEspressoBundle extends CatchingFishFirebaseDagger {
    public final float CatchingFishCoroutineFlow;
    public final float CatchingFishDaggerHiltFAB;
    public final int CatchingFishParcelableFlux;
    public final int CatchingFishSpannableWidget;

    public CatchingFishEspressoBundle(float f, float f2, int i, int i2) {
        this.CatchingFishCoroutineFlow = f;
        this.CatchingFishDaggerHiltFAB = f2;
        this.CatchingFishSpannableWidget = i;
        this.CatchingFishParcelableFlux = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishEspressoBundle)) {
            return false;
        }
        CatchingFishEspressoBundle catchingFishEspressoBundle = (CatchingFishEspressoBundle) obj;
        if (this.CatchingFishCoroutineFlow != catchingFishEspressoBundle.CatchingFishCoroutineFlow || this.CatchingFishDaggerHiltFAB != catchingFishEspressoBundle.CatchingFishDaggerHiltFAB || this.CatchingFishSpannableWidget != catchingFishEspressoBundle.CatchingFishSpannableWidget || this.CatchingFishParcelableFlux != catchingFishEspressoBundle.CatchingFishParcelableFlux) {
            return false;
        }
        catchingFishEspressoBundle.getClass();
        return true;
    }

    public final int hashCode() {
        return CatchingFishMVPLiveData.CatchingFishViewModelScope(this.CatchingFishParcelableFlux, CatchingFishMVPLiveData.CatchingFishViewModelScope(this.CatchingFishSpannableWidget, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishDaggerHiltFAB, Float.hashCode(this.CatchingFishCoroutineFlow) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.CatchingFishCoroutineFlow);
        sb.append(", miter=");
        sb.append(this.CatchingFishDaggerHiltFAB);
        sb.append(", cap=");
        String str = "Unknown";
        int i = this.CatchingFishSpannableWidget;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i2 = this.CatchingFishParcelableFlux;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
