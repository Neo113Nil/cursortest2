package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishGlideRetrofit implements CatchingFishHandlerMVP {
    public static final Object CatchingFishWorkManager = new Object();
    public volatile Object CatchingFishDaggerWebsocket;
    public volatile CatchingFishMVIGoogleMaps CatchingFishReduxKtor;

    public static CatchingFishHandlerMVP CatchingFishParcelableFAB(CatchingFishMVIGoogleMaps catchingFishMVIGoogleMaps) {
        if (catchingFishMVIGoogleMaps instanceof CatchingFishGlideRetrofit) {
            return catchingFishMVIGoogleMaps;
        }
        CatchingFishGlideRetrofit catchingFishGlideRetrofit = new CatchingFishGlideRetrofit();
        catchingFishGlideRetrofit.CatchingFishDaggerWebsocket = CatchingFishWorkManager;
        catchingFishGlideRetrofit.CatchingFishReduxKtor = catchingFishMVIGoogleMaps;
        return catchingFishGlideRetrofit;
    }

    @Override // kotlin.text.CatchingFishHandlerMVP
    public final Object get() {
        Object obj;
        Object obj2 = this.CatchingFishDaggerWebsocket;
        Object obj3 = CatchingFishWorkManager;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.CatchingFishDaggerWebsocket;
                if (obj == obj3) {
                    obj = this.CatchingFishReduxKtor.get();
                    Object obj4 = this.CatchingFishDaggerWebsocket;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.CatchingFishDaggerWebsocket = obj;
                    this.CatchingFishReduxKtor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
