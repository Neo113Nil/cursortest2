package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMVIRedux {
    public final String CatchingFishCoroutine;
    public final String CatchingFishDaggerWebsocket;
    public final String CatchingFishParcelableFAB;
    public final String CatchingFishReduxKtor;
    public final String CatchingFishSnackbar;

    public CatchingFishMVIRedux(String str, String str2, String str3, String str4, String str5) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "advertisingId");
        CatchingFishFirebaseDagger.CatchingFishNavigation(str2, "messagingToken");
        CatchingFishFirebaseDagger.CatchingFishNavigation(str3, "installReferrer");
        CatchingFishFirebaseDagger.CatchingFishNavigation(str4, "adjustId");
        CatchingFishFirebaseDagger.CatchingFishNavigation(str5, "attributionJson");
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = str2;
        this.CatchingFishCoroutine = str3;
        this.CatchingFishReduxKtor = str4;
        this.CatchingFishDaggerWebsocket = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishMVIRedux)) {
            return false;
        }
        CatchingFishMVIRedux catchingFishMVIRedux = (CatchingFishMVIRedux) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishParcelableFAB, catchingFishMVIRedux.CatchingFishParcelableFAB) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishSnackbar, catchingFishMVIRedux.CatchingFishSnackbar) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishCoroutine, catchingFishMVIRedux.CatchingFishCoroutine) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor, catchingFishMVIRedux.CatchingFishReduxKtor) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishDaggerWebsocket, catchingFishMVIRedux.CatchingFishDaggerWebsocket);
    }

    public final int hashCode() {
        return this.CatchingFishDaggerWebsocket.hashCode() + ((this.CatchingFishReduxKtor.hashCode() + ((this.CatchingFishCoroutine.hashCode() + ((this.CatchingFishSnackbar.hashCode() + (this.CatchingFishParcelableFAB.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LaunchSignals(advertisingId=");
        sb.append(this.CatchingFishParcelableFAB);
        sb.append(", messagingToken=");
        sb.append(this.CatchingFishSnackbar);
        sb.append(", installReferrer=");
        sb.append(this.CatchingFishCoroutine);
        sb.append(", adjustId=");
        sb.append(this.CatchingFishReduxKtor);
        sb.append(", attributionJson=");
        return CatchingFishMVPLiveData.CatchingFishStateLiveData(sb, this.CatchingFishDaggerWebsocket, ")");
    }
}
