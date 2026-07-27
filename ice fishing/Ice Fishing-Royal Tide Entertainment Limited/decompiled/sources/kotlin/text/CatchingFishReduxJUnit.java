package kotlin.text;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class CatchingFishReduxJUnit implements CatchingFishJUnitGson {
    public final /* synthetic */ Iterator CatchingFishParcelableFAB;

    public CatchingFishReduxJUnit(Iterator it) {
        this.CatchingFishParcelableFAB = it;
    }

    @Override // kotlin.text.CatchingFishJUnitGson
    public final Iterator iterator() {
        return this.CatchingFishParcelableFAB;
    }
}
