package k2;

/* renamed from: k2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4642m {
    public static final int ERROR_CODE_AD_REUSED = 1;
    public static final int ERROR_CODE_APP_NOT_FOREGROUND = 3;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_MEDIATION_SHOW_ERROR = 4;
    public static final int ERROR_CODE_NOT_READY = 2;

    public abstract void onAdDismissedFullScreenContent();

    public abstract void onAdShowedFullScreenContent();

    public void onAdClicked() {
    }

    public void onAdImpression() {
    }

    public void onAdFailedToShowFullScreenContent(C4630a c4630a) {
    }
}
