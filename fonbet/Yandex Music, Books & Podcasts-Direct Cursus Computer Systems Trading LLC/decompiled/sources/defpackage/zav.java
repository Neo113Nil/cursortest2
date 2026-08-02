package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class zav extends Handler {
    public final WeakReference a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zav(Looper looper, uo7 uo7Var) {
        super(looper);
        looper.getClass();
        this.a = new WeakReference(uo7Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        message.getClass();
        xav xavVar = (xav) this.a.get();
        if (xavVar == null) {
            return;
        }
        xavVar.handleMessage(message);
    }

    public zav(xav xavVar) {
        this.a = new WeakReference(xavVar);
    }
}
