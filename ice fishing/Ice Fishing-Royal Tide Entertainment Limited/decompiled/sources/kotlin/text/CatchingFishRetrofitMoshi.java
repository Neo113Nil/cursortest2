package kotlin.text;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class CatchingFishRetrofitMoshi extends CatchingFishRealmHilt implements CatchingFishIntentMoshiMVI, Serializable {
    public final Enum[] CatchingFishReduxKtor;

    public CatchingFishRetrofitMoshi(Enum[] enumArr) {
        this.CatchingFishReduxKtor = enumArr;
    }

    @Override // kotlin.text.CatchingFishFirebase
    public final int CatchingFishParcelableFAB() {
        return this.CatchingFishReduxKtor.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d A[RETURN] */
    @Override // kotlin.text.CatchingFishFirebase, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        Enum r0;
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        CatchingFishFirebaseDagger.CatchingFishNavigation(r4, "element");
        int ordinal = r4.ordinal();
        if (ordinal >= 0) {
            Enum[] enumArr = this.CatchingFishReduxKtor;
            if (ordinal < enumArr.length) {
                r0 = enumArr[ordinal];
                return r0 != r4;
            }
        }
        r0 = null;
        if (r0 != r4) {
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.CatchingFishReduxKtor;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, length, "index: ", ", size: "));
        }
        return enumArr[i];
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d A[RETURN] */
    @Override // kotlin.text.CatchingFishRealmHilt, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int indexOf(Object obj) {
        Enum r1;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        CatchingFishFirebaseDagger.CatchingFishNavigation(r4, "element");
        int ordinal = r4.ordinal();
        if (ordinal >= 0) {
            Enum[] enumArr = this.CatchingFishReduxKtor;
            if (ordinal < enumArr.length) {
                r1 = enumArr[ordinal];
                if (r1 != r4) {
                    return ordinal;
                }
                return -1;
            }
        }
        r1 = null;
        if (r1 != r4) {
        }
    }

    @Override // kotlin.text.CatchingFishRealmHilt, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        CatchingFishFirebaseDagger.CatchingFishNavigation(r2, "element");
        return indexOf(r2);
    }
}
