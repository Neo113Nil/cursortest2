package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishHiltKtor extends CatchingFishBundleAppCompat {
    public final CatchingFishIntentWebsocket CatchingFishParcelableFAB;
    public final CatchingFishDataStoreRealm CatchingFishSnackbar;

    public CatchingFishHiltKtor(CatchingFishIntentWebsocket catchingFishIntentWebsocket, CatchingFishDataStoreRealm catchingFishDataStoreRealm) {
        this.CatchingFishParcelableFAB = catchingFishIntentWebsocket;
        this.CatchingFishSnackbar = catchingFishDataStoreRealm;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CatchingFishBundleAppCompat) {
            CatchingFishBundleAppCompat catchingFishBundleAppCompat = (CatchingFishBundleAppCompat) obj;
            CatchingFishIntentWebsocket catchingFishIntentWebsocket = this.CatchingFishParcelableFAB;
            if (catchingFishIntentWebsocket != null ? catchingFishIntentWebsocket.equals(((CatchingFishHiltKtor) catchingFishBundleAppCompat).CatchingFishParcelableFAB) : ((CatchingFishHiltKtor) catchingFishBundleAppCompat).CatchingFishParcelableFAB == null) {
                CatchingFishDataStoreRealm catchingFishDataStoreRealm = this.CatchingFishSnackbar;
                if (catchingFishDataStoreRealm != null ? catchingFishDataStoreRealm.equals(((CatchingFishHiltKtor) catchingFishBundleAppCompat).CatchingFishSnackbar) : ((CatchingFishHiltKtor) catchingFishBundleAppCompat).CatchingFishSnackbar == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        CatchingFishIntentWebsocket catchingFishIntentWebsocket = this.CatchingFishParcelableFAB;
        int hashCode = ((catchingFishIntentWebsocket == null ? 0 : catchingFishIntentWebsocket.hashCode()) ^ 1000003) * 1000003;
        CatchingFishDataStoreRealm catchingFishDataStoreRealm = this.CatchingFishSnackbar;
        return (catchingFishDataStoreRealm != null ? catchingFishDataStoreRealm.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.CatchingFishParcelableFAB + ", mobileSubtype=" + this.CatchingFishSnackbar + "}";
    }
}
