package kotlin.text;

import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class CatchingFishRetrofitToast {
    public static final Pattern CatchingFishReduxKtor = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String CatchingFishCoroutine;
    public final String CatchingFishParcelableFAB;
    public final String CatchingFishSnackbar;

    public CatchingFishRetrofitToast(String str, String str2) {
        String substring = (str2 == null || !str2.startsWith("/topics/")) ? str2 : str2.substring(8);
        if (substring == null || !CatchingFishReduxKtor.matcher(substring).matches()) {
            throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishOkHttp("Invalid topic name: ", substring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.CatchingFishParcelableFAB = substring;
        this.CatchingFishSnackbar = str;
        this.CatchingFishCoroutine = str + "!" + str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CatchingFishRetrofitToast)) {
            return false;
        }
        CatchingFishRetrofitToast catchingFishRetrofitToast = (CatchingFishRetrofitToast) obj;
        return this.CatchingFishParcelableFAB.equals(catchingFishRetrofitToast.CatchingFishParcelableFAB) && this.CatchingFishSnackbar.equals(catchingFishRetrofitToast.CatchingFishSnackbar);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.CatchingFishSnackbar, this.CatchingFishParcelableFAB});
    }
}
