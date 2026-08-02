package defpackage;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes.dex */
public final class ws2 extends fsn {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("BasePendingResult", k5r.i(i, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).d(Status.h);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        try {
            ((b8o) pair.first).a((a8o) pair.second);
        } catch (RuntimeException e) {
            mo moVar = BasePendingResult.n;
            throw e;
        }
    }
}
