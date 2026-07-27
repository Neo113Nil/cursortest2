package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishCameraXFirebase extends CatchingFishContextHiltKtor {
    public final float CatchingFishCoroutine;
    public final float CatchingFishReduxKtor;

    public CatchingFishCameraXFirebase(float f, float f2) {
        super(1);
        this.CatchingFishCoroutine = f;
        this.CatchingFishReduxKtor = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishCameraXFirebase)) {
            return false;
        }
        CatchingFishCameraXFirebase catchingFishCameraXFirebase = (CatchingFishCameraXFirebase) obj;
        return Float.compare(this.CatchingFishCoroutine, catchingFishCameraXFirebase.CatchingFishCoroutine) == 0 && Float.compare(this.CatchingFishReduxKtor, catchingFishCameraXFirebase.CatchingFishReduxKtor) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.CatchingFishReduxKtor) + (Float.hashCode(this.CatchingFishCoroutine) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.CatchingFishCoroutine);
        sb.append(", dy=");
        return CatchingFishMVPLiveData.CatchingFishUnitTesting(sb, this.CatchingFishReduxKtor, ')');
    }
}
