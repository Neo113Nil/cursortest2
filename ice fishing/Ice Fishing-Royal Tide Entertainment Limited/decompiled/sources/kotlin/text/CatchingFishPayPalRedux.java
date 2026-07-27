package kotlin.text;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class CatchingFishPayPalRedux extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishPayPalRedux(Looper looper, int i) {
        super(looper);
        switch (i) {
            case 3:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}
