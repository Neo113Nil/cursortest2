package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishLifecycleMoshi extends CatchingFishRetrofitService {
    public static final CatchingFishLifecycleMoshi CatchingFishViewModelScope = new CatchingFishLifecycleMoshi(1, 0, 1);

    @Override // kotlin.text.CatchingFishRetrofitService
    public final boolean equals(Object obj) {
        if (!(obj instanceof CatchingFishLifecycleMoshi)) {
            return false;
        }
        if (isEmpty() && ((CatchingFishLifecycleMoshi) obj).isEmpty()) {
            return true;
        }
        CatchingFishLifecycleMoshi catchingFishLifecycleMoshi = (CatchingFishLifecycleMoshi) obj;
        return this.CatchingFishReduxKtor == catchingFishLifecycleMoshi.CatchingFishReduxKtor && this.CatchingFishDaggerWebsocket == catchingFishLifecycleMoshi.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishRetrofitService
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.CatchingFishReduxKtor * 31) + this.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishRetrofitService
    public final boolean isEmpty() {
        return this.CatchingFishReduxKtor > this.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishRetrofitService
    public final String toString() {
        return this.CatchingFishReduxKtor + ".." + this.CatchingFishDaggerWebsocket;
    }
}
