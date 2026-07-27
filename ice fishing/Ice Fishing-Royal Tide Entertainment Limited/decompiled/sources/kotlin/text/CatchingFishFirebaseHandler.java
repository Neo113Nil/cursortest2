package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishFirebaseHandler extends CatchingFishContextHiltKtor {
    public final float CatchingFishCoroutine;

    public CatchingFishFirebaseHandler(float f) {
        super(3);
        this.CatchingFishCoroutine = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatchingFishFirebaseHandler) && Float.compare(this.CatchingFishCoroutine, ((CatchingFishFirebaseHandler) obj).CatchingFishCoroutine) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.CatchingFishCoroutine);
    }

    public final String toString() {
        return CatchingFishMVPLiveData.CatchingFishUnitTesting(new StringBuilder("RelativeHorizontalTo(dx="), this.CatchingFishCoroutine, ')');
    }
}
