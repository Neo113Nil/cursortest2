package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishDataStoreGson implements CatchingFishToolbarOkHttp {
    public final float CatchingFishParcelableFAB;

    public CatchingFishDataStoreGson(float f) {
        this.CatchingFishParcelableFAB = f;
    }

    @Override // kotlin.text.CatchingFishToolbarOkHttp
    public final float CatchingFishParcelableFAB(float f) {
        return f * this.CatchingFishParcelableFAB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatchingFishDataStoreGson) && Float.compare(this.CatchingFishParcelableFAB, ((CatchingFishDataStoreGson) obj).CatchingFishParcelableFAB) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.CatchingFishParcelableFAB);
    }

    public final String toString() {
        return CatchingFishMVPLiveData.CatchingFishUnitTesting(new StringBuilder("LinearFontScaleConverter(fontScale="), this.CatchingFishParcelableFAB, ')');
    }
}
