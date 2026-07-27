package kotlin.text;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class CatchingFishMVIManifest implements CatchingFishJUnitGson {
    public final AtomicReference CatchingFishParcelableFAB;

    public CatchingFishMVIManifest(CatchingFishJUnitGson catchingFishJUnitGson) {
        this.CatchingFishParcelableFAB = new AtomicReference(catchingFishJUnitGson);
    }

    @Override // kotlin.text.CatchingFishJUnitGson
    public final Iterator iterator() {
        CatchingFishJUnitGson catchingFishJUnitGson = (CatchingFishJUnitGson) this.CatchingFishParcelableFAB.getAndSet(null);
        if (catchingFishJUnitGson != null) {
            return catchingFishJUnitGson.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
