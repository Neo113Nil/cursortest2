package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishIntentStripeAPI extends CatchingFishContextHiltKtor {
    public final float CatchingFishCoroutine;
    public final float CatchingFishReduxKtor;

    public CatchingFishIntentStripeAPI(float f, float f2) {
        super(3);
        this.CatchingFishCoroutine = f;
        this.CatchingFishReduxKtor = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishIntentStripeAPI)) {
            return false;
        }
        CatchingFishIntentStripeAPI catchingFishIntentStripeAPI = (CatchingFishIntentStripeAPI) obj;
        return Float.compare(this.CatchingFishCoroutine, catchingFishIntentStripeAPI.CatchingFishCoroutine) == 0 && Float.compare(this.CatchingFishReduxKtor, catchingFishIntentStripeAPI.CatchingFishReduxKtor) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.CatchingFishReduxKtor) + (Float.hashCode(this.CatchingFishCoroutine) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.CatchingFishCoroutine);
        sb.append(", dy=");
        return CatchingFishMVPLiveData.CatchingFishUnitTesting(sb, this.CatchingFishReduxKtor, ')');
    }
}
