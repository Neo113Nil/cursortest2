package a7;

import android.os.Handler;
import android.os.Looper;
import com.onesignal.core.activities.PermissionsActivity;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class c extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Looper looper, int i10) {
        super(looper);
        switch (i10) {
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }

    public c(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
