package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishSpannableRealm extends CatchingFishContextHiltKtor {
    public final float CatchingFishCoroutine;
    public final float CatchingFishDaggerWebsocket;
    public final float CatchingFishReduxKtor;
    public final float CatchingFishWorkManager;

    public CatchingFishSpannableRealm(float f, float f2, float f3, float f4) {
        super(1);
        this.CatchingFishCoroutine = f;
        this.CatchingFishReduxKtor = f2;
        this.CatchingFishDaggerWebsocket = f3;
        this.CatchingFishWorkManager = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishSpannableRealm)) {
            return false;
        }
        CatchingFishSpannableRealm catchingFishSpannableRealm = (CatchingFishSpannableRealm) obj;
        return Float.compare(this.CatchingFishCoroutine, catchingFishSpannableRealm.CatchingFishCoroutine) == 0 && Float.compare(this.CatchingFishReduxKtor, catchingFishSpannableRealm.CatchingFishReduxKtor) == 0 && Float.compare(this.CatchingFishDaggerWebsocket, catchingFishSpannableRealm.CatchingFishDaggerWebsocket) == 0 && Float.compare(this.CatchingFishWorkManager, catchingFishSpannableRealm.CatchingFishWorkManager) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.CatchingFishWorkManager) + CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishDaggerWebsocket, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishReduxKtor, Float.hashCode(this.CatchingFishCoroutine) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.CatchingFishCoroutine);
        sb.append(", dy1=");
        sb.append(this.CatchingFishReduxKtor);
        sb.append(", dx2=");
        sb.append(this.CatchingFishDaggerWebsocket);
        sb.append(", dy2=");
        return CatchingFishMVPLiveData.CatchingFishUnitTesting(sb, this.CatchingFishWorkManager, ')');
    }
}
