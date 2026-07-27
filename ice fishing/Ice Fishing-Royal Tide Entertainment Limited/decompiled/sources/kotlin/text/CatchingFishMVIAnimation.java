package kotlin.text;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class CatchingFishMVIAnimation implements CatchingFishJUnitGson {
    public final CatchingFishJUnitGlide CatchingFishParcelableFAB;
    public final CatchingFishServiceHandler CatchingFishSnackbar;

    public CatchingFishMVIAnimation(CatchingFishJUnitGlide catchingFishJUnitGlide, CatchingFishServiceHandler catchingFishServiceHandler) {
        this.CatchingFishParcelableFAB = catchingFishJUnitGlide;
        this.CatchingFishSnackbar = catchingFishServiceHandler;
    }

    @Override // kotlin.text.CatchingFishJUnitGson
    public final Iterator iterator() {
        return new CatchingFishRetrofitLayout(this);
    }
}
