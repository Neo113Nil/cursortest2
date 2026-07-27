package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishWidgetOkHttp extends CatchingFishContextHiltKtor {
    public final float CatchingFishCoroutine;

    public CatchingFishWidgetOkHttp(float f) {
        super(3);
        this.CatchingFishCoroutine = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatchingFishWidgetOkHttp) && Float.compare(this.CatchingFishCoroutine, ((CatchingFishWidgetOkHttp) obj).CatchingFishCoroutine) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.CatchingFishCoroutine);
    }

    public final String toString() {
        return CatchingFishMVPLiveData.CatchingFishUnitTesting(new StringBuilder("RelativeVerticalTo(dy="), this.CatchingFishCoroutine, ')');
    }
}
