package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishWidgetRoom {
    public final int CatchingFishCoroutine;
    public final int CatchingFishParcelableFAB;
    public final int CatchingFishReduxKtor;
    public final int CatchingFishSnackbar;

    public CatchingFishWidgetRoom(int i, int i2, int i3, int i4) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = i2;
        this.CatchingFishCoroutine = i3;
        this.CatchingFishReduxKtor = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishWidgetRoom)) {
            return false;
        }
        CatchingFishWidgetRoom catchingFishWidgetRoom = (CatchingFishWidgetRoom) obj;
        return this.CatchingFishParcelableFAB == catchingFishWidgetRoom.CatchingFishParcelableFAB && this.CatchingFishSnackbar == catchingFishWidgetRoom.CatchingFishSnackbar && this.CatchingFishCoroutine == catchingFishWidgetRoom.CatchingFishCoroutine && this.CatchingFishReduxKtor == catchingFishWidgetRoom.CatchingFishReduxKtor;
    }

    public final int hashCode() {
        return (((((this.CatchingFishParcelableFAB * 31) + this.CatchingFishSnackbar) * 31) + this.CatchingFishCoroutine) * 31) + this.CatchingFishReduxKtor;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.CatchingFishParcelableFAB);
        sb.append(", top=");
        sb.append(this.CatchingFishSnackbar);
        sb.append(", right=");
        sb.append(this.CatchingFishCoroutine);
        sb.append(", bottom=");
        return CatchingFishMVPLiveData.CatchingFishAnimationMockk(sb, this.CatchingFishReduxKtor, ')');
    }
}
