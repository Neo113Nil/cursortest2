package kotlin.text;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class CatchingFishLayoutGlide {
    public final CatchingFishEspressoMVPGson CatchingFishParcelableFAB = new CatchingFishEspressoMVPGson();

    public final void CatchingFishParcelableFAB() {
        CatchingFishEspressoMVPGson catchingFishEspressoMVPGson = this.CatchingFishParcelableFAB;
        if (catchingFishEspressoMVPGson != null && !catchingFishEspressoMVPGson.CatchingFishReduxKtor) {
            catchingFishEspressoMVPGson.CatchingFishReduxKtor = true;
            synchronized (catchingFishEspressoMVPGson.CatchingFishParcelableFAB) {
                try {
                    Iterator it = catchingFishEspressoMVPGson.CatchingFishSnackbar.values().iterator();
                    while (it.hasNext()) {
                        CatchingFishEspressoMVPGson.CatchingFishParcelableFAB((AutoCloseable) it.next());
                    }
                    Iterator it2 = catchingFishEspressoMVPGson.CatchingFishCoroutine.iterator();
                    while (it2.hasNext()) {
                        CatchingFishEspressoMVPGson.CatchingFishParcelableFAB((AutoCloseable) it2.next());
                    }
                    catchingFishEspressoMVPGson.CatchingFishCoroutine.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        CatchingFishSnackbar();
    }

    public void CatchingFishSnackbar() {
    }
}
