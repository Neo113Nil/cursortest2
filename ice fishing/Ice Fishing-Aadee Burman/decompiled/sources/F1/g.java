package F1;

import L2.k;
import L2.l;
import L2.m;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class g implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f929n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f930u;

    public /* synthetic */ g(int i, Object obj) {
        this.f929n = i;
        this.f930u = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f929n) {
            case 0:
                int i = message.what;
                h hVar = (h) this.f930u;
                if (i == 1) {
                    hVar.b((e) message.obj);
                    return true;
                }
                if (i == 2) {
                    hVar.f934d.i((e) message.obj);
                }
                return false;
            case 1:
                if (message.what != 0) {
                    return false;
                }
                G3.e eVar = (G3.e) this.f930u;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (eVar.f1072n) {
                    throw null;
                }
            default:
                int i6 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i6);
                }
                k kVar = (k) this.f930u;
                synchronized (kVar) {
                    try {
                        l lVar = (l) kVar.f1651x.get(i6);
                        if (lVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i6);
                            return true;
                        }
                        kVar.f1651x.remove(i6);
                        kVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            lVar.b(new m("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (lVar.f1657e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    lVar.c(null);
                                    return true;
                                }
                                lVar.b(new m("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                lVar.c(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
        }
    }
}
