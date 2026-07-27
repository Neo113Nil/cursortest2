package kotlin.text;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class CatchingFishHiltMVIEspresso {
    public final InetSocketAddress CatchingFishCoroutine;
    public final CatchingFishRoomCardView CatchingFishParcelableFAB;
    public final Proxy CatchingFishSnackbar;

    public CatchingFishHiltMVIEspresso(CatchingFishRoomCardView catchingFishRoomCardView, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (catchingFishRoomCardView == null) {
            throw new NullPointerException("address == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.CatchingFishParcelableFAB = catchingFishRoomCardView;
        this.CatchingFishSnackbar = proxy;
        this.CatchingFishCoroutine = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CatchingFishHiltMVIEspresso)) {
            return false;
        }
        CatchingFishHiltMVIEspresso catchingFishHiltMVIEspresso = (CatchingFishHiltMVIEspresso) obj;
        return catchingFishHiltMVIEspresso.CatchingFishParcelableFAB.equals(this.CatchingFishParcelableFAB) && catchingFishHiltMVIEspresso.CatchingFishSnackbar.equals(this.CatchingFishSnackbar) && catchingFishHiltMVIEspresso.CatchingFishCoroutine.equals(this.CatchingFishCoroutine);
    }

    public final int hashCode() {
        return this.CatchingFishCoroutine.hashCode() + ((this.CatchingFishSnackbar.hashCode() + ((this.CatchingFishParcelableFAB.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.CatchingFishCoroutine + "}";
    }
}
