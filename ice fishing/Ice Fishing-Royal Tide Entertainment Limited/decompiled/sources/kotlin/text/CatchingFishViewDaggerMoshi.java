package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishViewDaggerMoshi extends CatchingFishContextHiltKtor {
    public final float CatchingFishCoroutine;
    public final float CatchingFishReduxKtor;

    public CatchingFishViewDaggerMoshi(float f, float f2) {
        super(3);
        this.CatchingFishCoroutine = f;
        this.CatchingFishReduxKtor = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishViewDaggerMoshi)) {
            return false;
        }
        CatchingFishViewDaggerMoshi catchingFishViewDaggerMoshi = (CatchingFishViewDaggerMoshi) obj;
        return Float.compare(this.CatchingFishCoroutine, catchingFishViewDaggerMoshi.CatchingFishCoroutine) == 0 && Float.compare(this.CatchingFishReduxKtor, catchingFishViewDaggerMoshi.CatchingFishReduxKtor) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.CatchingFishReduxKtor) + (Float.hashCode(this.CatchingFishCoroutine) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.CatchingFishCoroutine);
        sb.append(", y=");
        return CatchingFishMVPLiveData.CatchingFishUnitTesting(sb, this.CatchingFishReduxKtor, ')');
    }
}
