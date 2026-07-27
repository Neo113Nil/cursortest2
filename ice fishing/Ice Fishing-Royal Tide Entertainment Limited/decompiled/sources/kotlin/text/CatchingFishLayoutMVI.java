package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishLayoutMVI extends CatchingFishContextHiltKtor {
    public final float CatchingFishCoroutine;
    public final float CatchingFishReduxKtor;

    public CatchingFishLayoutMVI(float f, float f2) {
        super(3);
        this.CatchingFishCoroutine = f;
        this.CatchingFishReduxKtor = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishLayoutMVI)) {
            return false;
        }
        CatchingFishLayoutMVI catchingFishLayoutMVI = (CatchingFishLayoutMVI) obj;
        return Float.compare(this.CatchingFishCoroutine, catchingFishLayoutMVI.CatchingFishCoroutine) == 0 && Float.compare(this.CatchingFishReduxKtor, catchingFishLayoutMVI.CatchingFishReduxKtor) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.CatchingFishReduxKtor) + (Float.hashCode(this.CatchingFishCoroutine) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.CatchingFishCoroutine);
        sb.append(", dy=");
        return CatchingFishMVPLiveData.CatchingFishUnitTesting(sb, this.CatchingFishReduxKtor, ')');
    }
}
