package kotlin.text;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class CatchingFishLiveDataToolbar implements Serializable {
    public final Throwable CatchingFishReduxKtor;

    public CatchingFishLiveDataToolbar(Throwable th) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(th, "exception");
        this.CatchingFishReduxKtor = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishLiveDataToolbar) {
            return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor, ((CatchingFishLiveDataToolbar) obj).CatchingFishReduxKtor);
        }
        return false;
    }

    public final int hashCode() {
        return this.CatchingFishReduxKtor.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.CatchingFishReduxKtor + ')';
    }
}
