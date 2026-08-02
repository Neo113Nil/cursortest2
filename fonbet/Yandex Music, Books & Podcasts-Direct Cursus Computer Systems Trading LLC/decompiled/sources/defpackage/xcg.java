package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class xcg implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xcg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                bdg bdgVar = (bdg) obj;
                Iterator it = bdgVar.d.iterator();
                while (it.hasNext()) {
                    adg adgVar = (adg) it.next();
                    zcg zcgVar = bdgVar.c;
                    if (!adgVar.d && adgVar.c) {
                        xgc q = adgVar.b.q();
                        adgVar.b = new bz2(11);
                        adgVar.c = false;
                        zcgVar.c(adgVar.a, q);
                    }
                    if (bdgVar.b.a.hasMessages(1)) {
                        break;
                    }
                }
                break;
            case 1:
                j6e j6eVar = (j6e) obj;
                if (message.what == 1) {
                    try {
                        ulh ulhVar = (ulh) j6eVar.b;
                        ulhVar.C.I(ulhVar.c);
                        break;
                    } catch (RemoteException unused) {
                        vq1.n0("MCImplBase", "Error in sending flushCommandQueue");
                        break;
                    }
                }
                break;
            case 2:
                zlh zlhVar = (zlh) obj;
                if (message.what == 1) {
                    bmh bmhVar = zlhVar.e;
                    bmhVar.S0(false, bmhVar.n);
                    break;
                }
                break;
            default:
                a9w a9wVar = (a9w) obj;
                b9w b9wVar = a9wVar.b;
                boolean z = a9wVar.j;
                if (!z) {
                    int i2 = message.what;
                    if (i2 == 1) {
                        try {
                            b9w.a(b9wVar);
                        } catch (pqb e) {
                            a9wVar.e.obtainMessage(2, new IOException(e)).sendToTarget();
                        }
                    } else if (i2 == 2) {
                        if (!z) {
                            a9wVar.j = true;
                            a9wVar.g.sendEmptyMessage(4);
                        }
                        Object obj2 = message.obj;
                        int i3 = dvt.a;
                        Handler handler = b9wVar.e;
                        handler.getClass();
                        handler.post(new xlr(27, b9wVar, (IOException) obj2));
                    }
                    break;
                }
                break;
        }
        return true;
        return true;
    }
}
