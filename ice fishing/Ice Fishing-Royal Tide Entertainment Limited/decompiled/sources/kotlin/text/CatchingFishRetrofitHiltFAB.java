package kotlin.text;

import android.net.Uri;
import com.adjust.sdk.Constants;

/* loaded from: classes.dex */
public final class CatchingFishRetrofitHiltFAB {
    public final int CatchingFishCoroutine;
    public final String CatchingFishDaggerWebsocket;
    public final Uri CatchingFishParcelableFAB;
    public final boolean CatchingFishReduxKtor;
    public final int CatchingFishSnackbar;
    public final int CatchingFishWorkManager;

    public CatchingFishRetrofitHiltFAB(Uri uri, int i, int i2, boolean z, String str, int i3) {
        uri.getClass();
        this.CatchingFishParcelableFAB = uri;
        this.CatchingFishSnackbar = i;
        this.CatchingFishCoroutine = i2;
        this.CatchingFishReduxKtor = z;
        this.CatchingFishDaggerWebsocket = str;
        this.CatchingFishWorkManager = i3;
    }

    public CatchingFishRetrofitHiltFAB(String str, String str2) {
        this.CatchingFishParcelableFAB = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.CatchingFishSnackbar = 0;
        this.CatchingFishCoroutine = Constants.MINIMAL_ERROR_STATUS_CODE;
        this.CatchingFishReduxKtor = false;
        this.CatchingFishDaggerWebsocket = str2;
        this.CatchingFishWorkManager = 0;
    }
}
