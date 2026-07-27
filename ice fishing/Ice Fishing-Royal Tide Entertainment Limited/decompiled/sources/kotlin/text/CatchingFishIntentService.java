package kotlin.text;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class CatchingFishIntentService {
    public static WeakReference CatchingFishSnackbar;
    public CatchingFishSensorManager CatchingFishParcelableFAB;

    public final synchronized CatchingFishRetrofitToast CatchingFishParcelableFAB() {
        String str;
        CatchingFishRetrofitToast catchingFishRetrofitToast;
        CatchingFishSensorManager catchingFishSensorManager = this.CatchingFishParcelableFAB;
        synchronized (((ArrayDeque) catchingFishSensorManager.CatchingFishViewModelScope)) {
            str = (String) ((ArrayDeque) catchingFishSensorManager.CatchingFishViewModelScope).peek();
        }
        Pattern pattern = CatchingFishRetrofitToast.CatchingFishReduxKtor;
        catchingFishRetrofitToast = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                catchingFishRetrofitToast = new CatchingFishRetrofitToast(split[0], split[1]);
            }
        }
        return catchingFishRetrofitToast;
    }
}
