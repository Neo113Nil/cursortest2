package p0;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;

/* renamed from: p0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1001A implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1002B f8331a;

    public /* synthetic */ C1001A(C1002B c1002b) {
        this.f8331a = c1002b;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (this.f8331a.f8335a) {
                try {
                    C1028y c1028y = (C1028y) message.obj;
                    ServiceConnectionC1029z serviceConnectionC1029z = (ServiceConnectionC1029z) this.f8331a.f8335a.get(c1028y);
                    if (serviceConnectionC1029z != null && serviceConnectionC1029z.f8425a.isEmpty()) {
                        if (serviceConnectionC1029z.f8427c) {
                            serviceConnectionC1029z.f8431g.f8337c.removeMessages(1, serviceConnectionC1029z.f8429e);
                            C1002B c1002b = serviceConnectionC1029z.f8431g;
                            c1002b.f8338d.b(c1002b.f8336b, serviceConnectionC1029z);
                            serviceConnectionC1029z.f8427c = false;
                            serviceConnectionC1029z.f8426b = 2;
                        }
                        this.f8331a.f8335a.remove(c1028y);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        synchronized (this.f8331a.f8335a) {
            try {
                C1028y c1028y2 = (C1028y) message.obj;
                ServiceConnectionC1029z serviceConnectionC1029z2 = (ServiceConnectionC1029z) this.f8331a.f8335a.get(c1028y2);
                if (serviceConnectionC1029z2 != null && serviceConnectionC1029z2.f8426b == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(c1028y2)), new Exception());
                    ComponentName componentName = serviceConnectionC1029z2.f8430f;
                    if (componentName == null) {
                        c1028y2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = c1028y2.f8423b;
                        AbstractC1021r.c(str);
                        componentName = new ComponentName(str, CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);
                    }
                    serviceConnectionC1029z2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
