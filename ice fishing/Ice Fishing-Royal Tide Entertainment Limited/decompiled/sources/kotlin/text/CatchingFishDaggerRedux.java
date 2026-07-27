package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishDaggerRedux extends CatchingFishContextHiltKtor {
    public final float CatchingFishCoroutine;
    public final float CatchingFishReduxKtor;

    public CatchingFishDaggerRedux(float f, float f2) {
        super(1);
        this.CatchingFishCoroutine = f;
        this.CatchingFishReduxKtor = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishDaggerRedux)) {
            return false;
        }
        CatchingFishDaggerRedux catchingFishDaggerRedux = (CatchingFishDaggerRedux) obj;
        return Float.compare(this.CatchingFishCoroutine, catchingFishDaggerRedux.CatchingFishCoroutine) == 0 && Float.compare(this.CatchingFishReduxKtor, catchingFishDaggerRedux.CatchingFishReduxKtor) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.CatchingFishReduxKtor) + (Float.hashCode(this.CatchingFishCoroutine) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.CatchingFishCoroutine);
        sb.append(", y=");
        return CatchingFishMVPLiveData.CatchingFishUnitTesting(sb, this.CatchingFishReduxKtor, ')');
    }
}
