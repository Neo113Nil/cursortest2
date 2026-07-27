package kotlin.text;

import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishMockkMockk extends CatchingFishRealmHilt {
    public final int CatchingFishDaggerWebsocket;
    public final CatchingFishParcelable CatchingFishReduxKtor;
    public final int CatchingFishWorkManager;

    public CatchingFishMockkMockk(CatchingFishParcelable catchingFishParcelable, int i, int i2) {
        this.CatchingFishReduxKtor = catchingFishParcelable;
        this.CatchingFishDaggerWebsocket = i;
        CatchingFishAdMobFAB.CatchingFishStateLiveData(i, i2, catchingFishParcelable.CatchingFishParcelableFAB());
        this.CatchingFishWorkManager = i2 - i;
    }

    @Override // kotlin.text.CatchingFishFirebase
    public final int CatchingFishParcelableFAB() {
        return this.CatchingFishWorkManager;
    }

    @Override // java.util.List
    public final Object get(int i) {
        CatchingFishAdMobFAB.CatchingFishUnitTesting(i, this.CatchingFishWorkManager);
        return this.CatchingFishReduxKtor.get(this.CatchingFishDaggerWebsocket + i);
    }

    @Override // kotlin.text.CatchingFishRealmHilt, java.util.List
    public final List subList(int i, int i2) {
        CatchingFishAdMobFAB.CatchingFishStateLiveData(i, i2, this.CatchingFishWorkManager);
        int i3 = this.CatchingFishDaggerWebsocket;
        return new CatchingFishMockkMockk(this.CatchingFishReduxKtor, i + i3, i3 + i2);
    }
}
