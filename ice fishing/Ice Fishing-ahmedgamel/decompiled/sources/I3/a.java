package I3;

import D.x;
import android.os.Handler;
import android.os.Message;
import w1.w;

/* loaded from: classes2.dex */
public final class a implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1311n;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f1311n) {
            case 0:
                int i = message.what;
                if (i == 0) {
                    throw x.h(message.obj);
                }
                if (i != 1) {
                    return false;
                }
                throw x.h(message.obj);
            default:
                if (message.what != 1) {
                    return false;
                }
                ((w) message.obj).a();
                return true;
        }
    }
}
