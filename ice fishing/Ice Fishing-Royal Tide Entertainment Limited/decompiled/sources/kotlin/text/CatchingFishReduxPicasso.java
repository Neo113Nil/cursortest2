package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishReduxPicasso extends CatchingFishContextHiltKtor {
    public final float CatchingFishCoroutine;
    public final float CatchingFishDaggerWebsocket;
    public final float CatchingFishLayout;
    public final float CatchingFishReduxKtor;
    public final float CatchingFishViewModelFAB;
    public final boolean CatchingFishViewModelScope;
    public final boolean CatchingFishWorkManager;

    public CatchingFishReduxPicasso(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.CatchingFishCoroutine = f;
        this.CatchingFishReduxKtor = f2;
        this.CatchingFishDaggerWebsocket = f3;
        this.CatchingFishWorkManager = z;
        this.CatchingFishViewModelScope = z2;
        this.CatchingFishViewModelFAB = f4;
        this.CatchingFishLayout = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishReduxPicasso)) {
            return false;
        }
        CatchingFishReduxPicasso catchingFishReduxPicasso = (CatchingFishReduxPicasso) obj;
        return Float.compare(this.CatchingFishCoroutine, catchingFishReduxPicasso.CatchingFishCoroutine) == 0 && Float.compare(this.CatchingFishReduxKtor, catchingFishReduxPicasso.CatchingFishReduxKtor) == 0 && Float.compare(this.CatchingFishDaggerWebsocket, catchingFishReduxPicasso.CatchingFishDaggerWebsocket) == 0 && this.CatchingFishWorkManager == catchingFishReduxPicasso.CatchingFishWorkManager && this.CatchingFishViewModelScope == catchingFishReduxPicasso.CatchingFishViewModelScope && Float.compare(this.CatchingFishViewModelFAB, catchingFishReduxPicasso.CatchingFishViewModelFAB) == 0 && Float.compare(this.CatchingFishLayout, catchingFishReduxPicasso.CatchingFishLayout) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.CatchingFishLayout) + CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishViewModelFAB, (Boolean.hashCode(this.CatchingFishViewModelScope) + ((Boolean.hashCode(this.CatchingFishWorkManager) + CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishDaggerWebsocket, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishReduxKtor, Float.hashCode(this.CatchingFishCoroutine) * 31, 31), 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.CatchingFishCoroutine);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.CatchingFishReduxKtor);
        sb.append(", theta=");
        sb.append(this.CatchingFishDaggerWebsocket);
        sb.append(", isMoreThanHalf=");
        sb.append(this.CatchingFishWorkManager);
        sb.append(", isPositiveArc=");
        sb.append(this.CatchingFishViewModelScope);
        sb.append(", arcStartDx=");
        sb.append(this.CatchingFishViewModelFAB);
        sb.append(", arcStartDy=");
        return CatchingFishMVPLiveData.CatchingFishUnitTesting(sb, this.CatchingFishLayout, ')');
    }
}
