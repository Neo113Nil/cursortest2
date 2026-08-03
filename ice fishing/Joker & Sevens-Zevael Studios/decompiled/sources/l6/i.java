package l6;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import d8.r;
import p6.b0;
import p6.c0;
import p6.d0;
import p6.u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4185b;

    public /* synthetic */ i(int i10, Object obj) {
        this.f4184a = i10;
        this.f4185b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f4184a) {
            case 0:
                int i10 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i10);
                }
                j jVar = (j) this.f4185b;
                synchronized (jVar) {
                    try {
                        k kVar = (k) jVar.f4190e.get(i10);
                        if (kVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                            return true;
                        }
                        jVar.f4190e.remove(i10);
                        jVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            kVar.b(new r("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (kVar.f4196e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    kVar.c(null);
                                    return true;
                                }
                                kVar.b(new r("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                kVar.c(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            default:
                int i11 = message.what;
                if (i11 == 0) {
                    synchronized (((d0) this.f4185b).f5565a) {
                        try {
                            b0 b0Var = (b0) message.obj;
                            c0 c0Var = (c0) ((d0) this.f4185b).f5565a.get(b0Var);
                            if (c0Var != null && c0Var.f5548a.isEmpty()) {
                                if (c0Var.f5550c) {
                                    c0Var.f5554g.f5567c.removeMessages(1, c0Var.f5552e);
                                    d0 d0Var = c0Var.f5554g;
                                    d0Var.f5568d.b(d0Var.f5566b, c0Var);
                                    c0Var.f5550c = false;
                                    c0Var.f5549b = 2;
                                }
                                ((d0) this.f4185b).f5565a.remove(b0Var);
                            }
                        } finally {
                        }
                    }
                } else {
                    if (i11 != 1) {
                        return false;
                    }
                    synchronized (((d0) this.f4185b).f5565a) {
                        try {
                            b0 b0Var2 = (b0) message.obj;
                            c0 c0Var2 = (c0) ((d0) this.f4185b).f5565a.get(b0Var2);
                            if (c0Var2 != null && c0Var2.f5549b == 3) {
                                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(b0Var2)), new Exception());
                                ComponentName componentName = c0Var2.f5553f;
                                if (componentName == null) {
                                    b0Var2.getClass();
                                    componentName = null;
                                }
                                if (componentName == null) {
                                    String str = b0Var2.f5545b;
                                    u.g(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                c0Var2.onServiceDisconnected(componentName);
                            }
                        } finally {
                        }
                    }
                }
                return true;
        }
    }
}
