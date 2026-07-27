package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishWebsocketOkHttp implements CatchingFishLiveDataHandler {
    public static final Object CatchingFishCoroutine = new Object();
    public volatile Object CatchingFishParcelableFAB = CatchingFishCoroutine;
    public volatile CatchingFishLiveDataHandler CatchingFishSnackbar;

    public CatchingFishWebsocketOkHttp(CatchingFishLiveDataHandler catchingFishLiveDataHandler) {
        this.CatchingFishSnackbar = catchingFishLiveDataHandler;
    }

    @Override // kotlin.text.CatchingFishLiveDataHandler
    public final Object get() {
        Object obj;
        Object obj2 = this.CatchingFishParcelableFAB;
        Object obj3 = CatchingFishCoroutine;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.CatchingFishParcelableFAB;
                if (obj == obj3) {
                    obj = this.CatchingFishSnackbar.get();
                    this.CatchingFishParcelableFAB = obj;
                    this.CatchingFishSnackbar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
