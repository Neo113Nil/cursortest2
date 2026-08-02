package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class fsn extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsn(Looper looper, int i) {
        super(looper);
        switch (i) {
            case 3:
                super(looper);
                Looper.getMainLooper();
                break;
            case 6:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }

    public fsn(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
