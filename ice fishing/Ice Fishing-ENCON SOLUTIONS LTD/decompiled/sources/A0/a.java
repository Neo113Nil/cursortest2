package A0;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class a extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Looper looper, int i2) {
        super(looper);
        switch (i2) {
            case 2:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}
