package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishAdMobRoomToast extends CatchingFishContextHiltKtor {
    public final float CatchingFishCoroutine;
    public final float CatchingFishReduxKtor;

    public CatchingFishAdMobRoomToast(float f, float f2) {
        super(3);
        this.CatchingFishCoroutine = f;
        this.CatchingFishReduxKtor = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishAdMobRoomToast)) {
            return false;
        }
        CatchingFishAdMobRoomToast catchingFishAdMobRoomToast = (CatchingFishAdMobRoomToast) obj;
        return Float.compare(this.CatchingFishCoroutine, catchingFishAdMobRoomToast.CatchingFishCoroutine) == 0 && Float.compare(this.CatchingFishReduxKtor, catchingFishAdMobRoomToast.CatchingFishReduxKtor) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.CatchingFishReduxKtor) + (Float.hashCode(this.CatchingFishCoroutine) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.CatchingFishCoroutine);
        sb.append(", y=");
        return CatchingFishMVPLiveData.CatchingFishUnitTesting(sb, this.CatchingFishReduxKtor, ')');
    }
}
