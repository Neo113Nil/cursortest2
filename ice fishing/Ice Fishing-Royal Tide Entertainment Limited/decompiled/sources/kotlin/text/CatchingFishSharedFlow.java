package kotlin.text;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class CatchingFishSharedFlow extends CatchingFishRealmHilt implements RandomAccess {
    public final int CatchingFishDaggerWebsocket;
    public final CatchingFishRealmHilt CatchingFishReduxKtor;
    public final int CatchingFishWorkManager;

    public CatchingFishSharedFlow(CatchingFishRealmHilt catchingFishRealmHilt, int i, int i2) {
        this.CatchingFishReduxKtor = catchingFishRealmHilt;
        this.CatchingFishDaggerWebsocket = i;
        CatchingFishLayoutRoomFAB.CatchingFishUnitTesting(i, i2, catchingFishRealmHilt.CatchingFishParcelableFAB());
        this.CatchingFishWorkManager = i2 - i;
    }

    @Override // kotlin.text.CatchingFishFirebase
    public final int CatchingFishParcelableFAB() {
        return this.CatchingFishWorkManager;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.CatchingFishWorkManager;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, i2, "index: ", ", size: "));
        }
        return this.CatchingFishReduxKtor.get(this.CatchingFishDaggerWebsocket + i);
    }
}
