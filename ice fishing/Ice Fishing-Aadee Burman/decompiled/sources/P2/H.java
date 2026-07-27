package P2;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public final class H implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I f2440n;

    public /* synthetic */ H(I i) {
        Objects.requireNonNull(i);
        this.f2440n = i;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            I i6 = this.f2440n;
            synchronized (i6.f2443a) {
                try {
                    F f3 = (F) message.obj;
                    G g4 = (G) i6.f2443a.get(f3);
                    if (g4 != null && g4.f2433n.isEmpty()) {
                        if (g4.f2435v) {
                            F f9 = g4.f2437x;
                            I i9 = g4.f2439z;
                            i9.f2445c.removeMessages(1, f9);
                            i9.f2446d.b(i9.f2444b, g4);
                            g4.f2435v = false;
                            g4.f2434u = 2;
                        }
                        i6.f2443a.remove(f3);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        I i10 = this.f2440n;
        synchronized (i10.f2443a) {
            try {
                F f10 = (F) message.obj;
                G g9 = (G) i10.f2443a.get(f10);
                if (g9 != null && g9.f2434u == 3) {
                    String valueOf = String.valueOf(f10);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = g9.f2438y;
                    if (componentName == null) {
                        f10.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = f10.f2431b;
                        w.h(str);
                        componentName = new ComponentName(str, com.anythink.core.common.v.m.f16809e);
                    }
                    g9.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
