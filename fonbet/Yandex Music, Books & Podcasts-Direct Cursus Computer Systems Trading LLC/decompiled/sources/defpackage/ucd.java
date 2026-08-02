package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class ucd implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ucd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                vcd vcdVar = (vcd) this.b;
                int i = message.what;
                if (i == 1) {
                    vcdVar.b((tcd) message.obj);
                    return true;
                }
                if (i == 2) {
                    vcdVar.d.j((tcd) message.obj);
                }
                return false;
            case 1:
                if (message.what != 0) {
                    return false;
                }
                x3n x3nVar = (x3n) this.b;
                m1r m1rVar = (m1r) message.obj;
                synchronized (x3nVar.a) {
                    if (((m1r) x3nVar.c) == m1rVar || ((m1r) x3nVar.d) == m1rVar) {
                        x3nVar.X(m1rVar, 2);
                    }
                }
                return true;
            case 2:
                int i2 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i2);
                }
                wix wixVar = (wix) this.b;
                synchronized (wixVar) {
                    try {
                        lkx lkxVar = (lkx) wixVar.e.get(i2);
                        if (lkxVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i2);
                            return true;
                        }
                        wixVar.e.remove(i2);
                        wixVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            lkxVar.b(new my1("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (lkxVar.e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    lkxVar.c(null);
                                    return true;
                                }
                                lkxVar.b(new my1("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                lkxVar.c(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            default:
                int i3 = message.what;
                if (i3 == 0) {
                    synchronized (((ilx) this.b).a) {
                        try {
                            eix eixVar = (eix) message.obj;
                            xix xixVar = (xix) ((ilx) this.b).a.get(eixVar);
                            if (xixVar != null && xixVar.a.isEmpty()) {
                                if (xixVar.c) {
                                    xixVar.g.c.removeMessages(1, xixVar.e);
                                    ilx ilxVar = xixVar.g;
                                    ilxVar.d.b(ilxVar.b, xixVar);
                                    xixVar.c = false;
                                    xixVar.b = 2;
                                }
                                ((ilx) this.b).a.remove(eixVar);
                            }
                        } finally {
                        }
                    }
                } else {
                    if (i3 != 1) {
                        return false;
                    }
                    synchronized (((ilx) this.b).a) {
                        try {
                            eix eixVar2 = (eix) message.obj;
                            xix xixVar2 = (xix) ((ilx) this.b).a.get(eixVar2);
                            if (xixVar2 != null && xixVar2.b == 3) {
                                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(eixVar2)), new Exception());
                                ComponentName componentName = xixVar2.f;
                                if (componentName == null) {
                                    eixVar2.getClass();
                                    componentName = null;
                                }
                                if (componentName == null) {
                                    String str = eixVar2.b;
                                    y1g.G(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                xixVar2.onServiceDisconnected(componentName);
                            }
                        } finally {
                        }
                    }
                }
                return true;
        }
    }
}
