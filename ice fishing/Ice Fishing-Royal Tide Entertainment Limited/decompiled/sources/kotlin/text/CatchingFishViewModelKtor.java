package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishViewModelKtor implements CatchingFishGradleHilt {
    public final int CatchingFishParcelableFAB;

    public CatchingFishViewModelKtor(int i) {
        this.CatchingFishParcelableFAB = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return CatchingFishGradleHilt.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishGradleHilt)) {
            return false;
        }
        CatchingFishViewModelKtor catchingFishViewModelKtor = (CatchingFishViewModelKtor) ((CatchingFishGradleHilt) obj);
        if (this.CatchingFishParcelableFAB != catchingFishViewModelKtor.CatchingFishParcelableFAB) {
            return false;
        }
        catchingFishViewModelKtor.getClass();
        Object obj2 = CatchingFishMVIMoshiLayout.CatchingFishReduxKtor;
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.CatchingFishParcelableFAB) + (CatchingFishMVIMoshiLayout.CatchingFishReduxKtor.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.CatchingFishParcelableFAB + "intEncoding=" + CatchingFishMVIMoshiLayout.CatchingFishReduxKtor + ')';
    }
}
