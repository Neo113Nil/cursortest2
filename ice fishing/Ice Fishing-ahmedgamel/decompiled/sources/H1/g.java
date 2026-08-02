package H1;

import N2.l;
import N2.m;
import N2.n;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class g implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1214n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1215u;

    public /* synthetic */ g(int i, Object obj) {
        this.f1214n = i;
        this.f1215u = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f1214n) {
            case 0:
                int i = message.what;
                h hVar = (h) this.f1215u;
                if (i == 1) {
                    hVar.b((e) message.obj);
                    return true;
                }
                if (i == 2) {
                    hVar.f1219d.i((e) message.obj);
                }
                return false;
            case 1:
                if (message.what != 0) {
                    return false;
                }
                I0.j jVar = (I0.j) this.f1215u;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (jVar.f1291u) {
                    throw null;
                }
            default:
                int i4 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i4);
                }
                l lVar = (l) this.f1215u;
                synchronized (lVar) {
                    try {
                        m mVar = (m) lVar.f1941x.get(i4);
                        if (mVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i4);
                            return true;
                        }
                        lVar.f1941x.remove(i4);
                        lVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            mVar.b(new n("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (mVar.f1947e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    mVar.c(null);
                                    return true;
                                }
                                mVar.b(new n("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                mVar.c(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
        }
    }
}
