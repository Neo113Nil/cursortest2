package kotlin.text;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishExoPlayerRoom {
    public final CatchingFishFABMVICardView CatchingFishCoroutine;
    public final int CatchingFishParcelableFAB;
    public final String CatchingFishReduxKtor;
    public final CatchingFishBundleGlide CatchingFishSnackbar;

    public CatchingFishExoPlayerRoom(CatchingFishBundleGlide catchingFishBundleGlide, CatchingFishFABMVICardView catchingFishFABMVICardView, String str) {
        this.CatchingFishSnackbar = catchingFishBundleGlide;
        this.CatchingFishCoroutine = catchingFishFABMVICardView;
        this.CatchingFishReduxKtor = str;
        this.CatchingFishParcelableFAB = Arrays.hashCode(new Object[]{catchingFishBundleGlide, catchingFishFABMVICardView, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatchingFishExoPlayerRoom)) {
            return false;
        }
        CatchingFishExoPlayerRoom catchingFishExoPlayerRoom = (CatchingFishExoPlayerRoom) obj;
        return CatchingFishLayoutRoom.CatchingFishOkHttp(this.CatchingFishSnackbar, catchingFishExoPlayerRoom.CatchingFishSnackbar) && CatchingFishLayoutRoom.CatchingFishOkHttp(this.CatchingFishCoroutine, catchingFishExoPlayerRoom.CatchingFishCoroutine) && CatchingFishLayoutRoom.CatchingFishOkHttp(this.CatchingFishReduxKtor, catchingFishExoPlayerRoom.CatchingFishReduxKtor);
    }

    public final int hashCode() {
        return this.CatchingFishParcelableFAB;
    }
}
