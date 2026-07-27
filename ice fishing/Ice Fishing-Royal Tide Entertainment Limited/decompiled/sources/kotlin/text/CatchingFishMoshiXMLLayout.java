package kotlin.text;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class CatchingFishMoshiXMLLayout extends CatchingFishPicassoMVVM implements Serializable {
    public int CatchingFishDaggerWebsocket;
    public int CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public int CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    @Override // kotlin.text.CatchingFishPicassoMVVM
    public final int CatchingFishParcelableFAB(int i) {
        return ((-i) >> 31) & (CatchingFishSnackbar() >>> (32 - i));
    }

    @Override // kotlin.text.CatchingFishPicassoMVVM
    public final int CatchingFishSnackbar() {
        int i = this.CatchingFishDaggerWebsocket;
        int i2 = i ^ (i >>> 2);
        this.CatchingFishDaggerWebsocket = this.CatchingFishWorkManager;
        this.CatchingFishWorkManager = this.CatchingFishViewModelScope;
        this.CatchingFishViewModelScope = this.CatchingFishViewModelFAB;
        int i3 = this.CatchingFishLayout;
        this.CatchingFishViewModelFAB = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.CatchingFishLayout = i4;
        int i5 = this.CatchingFishFragmentHandler + 362437;
        this.CatchingFishFragmentHandler = i5;
        return i4 + i5;
    }
}
