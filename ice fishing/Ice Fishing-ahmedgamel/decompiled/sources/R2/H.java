package R2;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public final class H implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I f2761n;

    public /* synthetic */ H(I i) {
        Objects.requireNonNull(i);
        this.f2761n = i;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            I i4 = this.f2761n;
            synchronized (i4.f2764a) {
                try {
                    F f2 = (F) message.obj;
                    G g9 = (G) i4.f2764a.get(f2);
                    if (g9 != null && g9.f2754n.isEmpty()) {
                        if (g9.f2756v) {
                            F f9 = g9.f2758x;
                            I i6 = g9.f2760z;
                            i6.f2766c.removeMessages(1, f9);
                            i6.f2767d.b(i6.f2765b, g9);
                            g9.f2756v = false;
                            g9.f2755u = 2;
                        }
                        i4.f2764a.remove(f2);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        I i9 = this.f2761n;
        synchronized (i9.f2764a) {
            try {
                F f10 = (F) message.obj;
                G g10 = (G) i9.f2764a.get(f10);
                if (g10 != null && g10.f2755u == 3) {
                    String valueOf = String.valueOf(f10);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = g10.f2759y;
                    if (componentName == null) {
                        f10.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = f10.f2752b;
                        w.h(str);
                        componentName = new ComponentName(str, com.anythink.core.common.v.m.f17596e);
                    }
                    g10.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
