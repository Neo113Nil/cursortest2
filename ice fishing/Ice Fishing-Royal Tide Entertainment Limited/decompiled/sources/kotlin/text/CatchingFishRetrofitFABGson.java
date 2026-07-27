package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishRetrofitFABGson {
    public final CatchingFishJobSchedulerMVP CatchingFishCoroutine;
    public final Throwable CatchingFishDaggerWebsocket;
    public final Object CatchingFishParcelableFAB;
    public final Object CatchingFishReduxKtor;
    public final CatchingFishDaggerKtor CatchingFishSnackbar;

    public CatchingFishRetrofitFABGson(Object obj, CatchingFishDaggerKtor catchingFishDaggerKtor, CatchingFishJobSchedulerMVP catchingFishJobSchedulerMVP, Object obj2, Throwable th) {
        this.CatchingFishParcelableFAB = obj;
        this.CatchingFishSnackbar = catchingFishDaggerKtor;
        this.CatchingFishCoroutine = catchingFishJobSchedulerMVP;
        this.CatchingFishReduxKtor = obj2;
        this.CatchingFishDaggerWebsocket = th;
    }

    public static CatchingFishRetrofitFABGson CatchingFishParcelableFAB(CatchingFishRetrofitFABGson catchingFishRetrofitFABGson, CatchingFishDaggerKtor catchingFishDaggerKtor, Throwable th, int i) {
        Object obj = catchingFishRetrofitFABGson.CatchingFishParcelableFAB;
        if ((i & 2) != 0) {
            catchingFishDaggerKtor = catchingFishRetrofitFABGson.CatchingFishSnackbar;
        }
        CatchingFishDaggerKtor catchingFishDaggerKtor2 = catchingFishDaggerKtor;
        CatchingFishJobSchedulerMVP catchingFishJobSchedulerMVP = catchingFishRetrofitFABGson.CatchingFishCoroutine;
        Object obj2 = catchingFishRetrofitFABGson.CatchingFishReduxKtor;
        if ((i & 16) != 0) {
            th = catchingFishRetrofitFABGson.CatchingFishDaggerWebsocket;
        }
        catchingFishRetrofitFABGson.getClass();
        return new CatchingFishRetrofitFABGson(obj, catchingFishDaggerKtor2, catchingFishJobSchedulerMVP, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishRetrofitFABGson)) {
            return false;
        }
        CatchingFishRetrofitFABGson catchingFishRetrofitFABGson = (CatchingFishRetrofitFABGson) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishParcelableFAB, catchingFishRetrofitFABGson.CatchingFishParcelableFAB) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishSnackbar, catchingFishRetrofitFABGson.CatchingFishSnackbar) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishCoroutine, catchingFishRetrofitFABGson.CatchingFishCoroutine) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor, catchingFishRetrofitFABGson.CatchingFishReduxKtor) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishDaggerWebsocket, catchingFishRetrofitFABGson.CatchingFishDaggerWebsocket);
    }

    public final int hashCode() {
        Object obj = this.CatchingFishParcelableFAB;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        CatchingFishDaggerKtor catchingFishDaggerKtor = this.CatchingFishSnackbar;
        int hashCode2 = (hashCode + (catchingFishDaggerKtor == null ? 0 : catchingFishDaggerKtor.hashCode())) * 31;
        CatchingFishJobSchedulerMVP catchingFishJobSchedulerMVP = this.CatchingFishCoroutine;
        int hashCode3 = (hashCode2 + (catchingFishJobSchedulerMVP == null ? 0 : catchingFishJobSchedulerMVP.hashCode())) * 31;
        Object obj2 = this.CatchingFishReduxKtor;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.CatchingFishDaggerWebsocket;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.CatchingFishParcelableFAB + ", cancelHandler=" + this.CatchingFishSnackbar + ", onCancellation=" + this.CatchingFishCoroutine + ", idempotentResume=" + this.CatchingFishReduxKtor + ", cancelCause=" + this.CatchingFishDaggerWebsocket + ')';
    }

    public /* synthetic */ CatchingFishRetrofitFABGson(Object obj, CatchingFishDaggerKtor catchingFishDaggerKtor, CatchingFishJobSchedulerMVP catchingFishJobSchedulerMVP, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : catchingFishDaggerKtor, (i & 4) != 0 ? null : catchingFishJobSchedulerMVP, (Object) null, (i & 16) != 0 ? null : th);
    }
}
