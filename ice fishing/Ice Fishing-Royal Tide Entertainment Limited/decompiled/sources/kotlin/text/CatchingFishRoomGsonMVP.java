package kotlin.text;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishRoomGsonMVP {
    public final CatchingFishExoPlayerRoom CatchingFishParcelableFAB;
    public final CatchingFishAppCompatPayPal CatchingFishSnackbar;

    public /* synthetic */ CatchingFishRoomGsonMVP(CatchingFishExoPlayerRoom catchingFishExoPlayerRoom, CatchingFishAppCompatPayPal catchingFishAppCompatPayPal) {
        this.CatchingFishParcelableFAB = catchingFishExoPlayerRoom;
        this.CatchingFishSnackbar = catchingFishAppCompatPayPal;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishRoomGsonMVP) {
            CatchingFishRoomGsonMVP catchingFishRoomGsonMVP = (CatchingFishRoomGsonMVP) obj;
            if (CatchingFishLayoutRoom.CatchingFishOkHttp(this.CatchingFishParcelableFAB, catchingFishRoomGsonMVP.CatchingFishParcelableFAB) && CatchingFishLayoutRoom.CatchingFishOkHttp(this.CatchingFishSnackbar, catchingFishRoomGsonMVP.CatchingFishSnackbar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.CatchingFishParcelableFAB, this.CatchingFishSnackbar});
    }

    public final String toString() {
        CatchingFishViewModelIntent catchingFishViewModelIntent = new CatchingFishViewModelIntent(this);
        catchingFishViewModelIntent.CatchingFishSnackbar(this.CatchingFishParcelableFAB, "key");
        catchingFishViewModelIntent.CatchingFishSnackbar(this.CatchingFishSnackbar, "feature");
        return catchingFishViewModelIntent.toString();
    }
}
