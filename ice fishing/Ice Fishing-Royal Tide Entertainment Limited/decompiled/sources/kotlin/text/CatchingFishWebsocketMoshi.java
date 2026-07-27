package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishWebsocketMoshi {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public static final CatchingFishWebsocketMoshi CatchingFishSnackbar = new CatchingFishWebsocketMoshi(0);
    public static final CatchingFishWebsocketMoshi CatchingFishCoroutine = new CatchingFishWebsocketMoshi(1);

    public /* synthetic */ CatchingFishWebsocketMoshi(int i) {
        this.CatchingFishParcelableFAB = i;
    }

    public final String toString() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "FontFamily.Default";
            default:
                return "FontFamily.SansSerif";
        }
    }
}
