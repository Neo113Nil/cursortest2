package U0;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class d implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B.b f1202a;

    public d(B.b bVar) {
        this.f1202a = bVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        B.b bVar = this.f1202a;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (bVar.f10b) {
            throw null;
        }
    }
}
