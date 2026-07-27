package kotlin.text;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class CatchingFishWidgetRedux {
    public static Handler CatchingFishParcelableFAB(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
