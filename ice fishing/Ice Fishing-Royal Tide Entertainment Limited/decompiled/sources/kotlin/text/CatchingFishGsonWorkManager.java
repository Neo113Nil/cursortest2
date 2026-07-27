package kotlin.text;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class CatchingFishGsonWorkManager implements Serializable {
    public final Object CatchingFishDaggerWebsocket;
    public final Object CatchingFishReduxKtor;

    public CatchingFishGsonWorkManager(Object obj, Object obj2) {
        this.CatchingFishReduxKtor = obj;
        this.CatchingFishDaggerWebsocket = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishGsonWorkManager)) {
            return false;
        }
        CatchingFishGsonWorkManager catchingFishGsonWorkManager = (CatchingFishGsonWorkManager) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor, catchingFishGsonWorkManager.CatchingFishReduxKtor) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishDaggerWebsocket, catchingFishGsonWorkManager.CatchingFishDaggerWebsocket);
    }

    public final int hashCode() {
        Object obj = this.CatchingFishReduxKtor;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.CatchingFishDaggerWebsocket;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.CatchingFishReduxKtor + ", " + this.CatchingFishDaggerWebsocket + ')';
    }
}
