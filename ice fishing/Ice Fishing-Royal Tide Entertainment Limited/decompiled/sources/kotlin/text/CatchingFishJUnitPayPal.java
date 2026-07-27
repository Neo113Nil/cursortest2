package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishJUnitPayPal extends CatchingFishContextHiltKtor {
    public final float CatchingFishCoroutine;

    public CatchingFishJUnitPayPal(float f) {
        super(3);
        this.CatchingFishCoroutine = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatchingFishJUnitPayPal) && Float.compare(this.CatchingFishCoroutine, ((CatchingFishJUnitPayPal) obj).CatchingFishCoroutine) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.CatchingFishCoroutine);
    }

    public final String toString() {
        return CatchingFishMVPLiveData.CatchingFishUnitTesting(new StringBuilder("HorizontalTo(x="), this.CatchingFishCoroutine, ')');
    }
}
