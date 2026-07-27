package kotlin.text;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class CatchingFishDataStoreFAB implements CatchingFishGlideDataStore, CatchingFishMoshiRedux {
    public final CatchingFishMVVMMVIGson CatchingFishCoroutine;
    public final HashMap CatchingFishParcelableFAB;
    public ArrayDeque CatchingFishSnackbar;

    public CatchingFishDataStoreFAB() {
        CatchingFishMVVMMVIGson catchingFishMVVMMVIGson = CatchingFishMVVMMVIGson.CatchingFishReduxKtor;
        this.CatchingFishParcelableFAB = new HashMap();
        this.CatchingFishSnackbar = new ArrayDeque();
        this.CatchingFishCoroutine = catchingFishMVVMMVIGson;
    }

    public final void CatchingFishParcelableFAB(CatchingFishLayoutLayout catchingFishLayoutLayout) {
        CatchingFishMVVMMVIGson catchingFishMVVMMVIGson = this.CatchingFishCoroutine;
        synchronized (this) {
            try {
                catchingFishMVVMMVIGson.getClass();
                if (!this.CatchingFishParcelableFAB.containsKey(CatchingFishXMLLayoutGlide.class)) {
                    this.CatchingFishParcelableFAB.put(CatchingFishXMLLayoutGlide.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.CatchingFishParcelableFAB.get(CatchingFishXMLLayoutGlide.class)).put(catchingFishLayoutLayout, catchingFishMVVMMVIGson);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
