package defpackage;

import android.util.Log;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes3.dex */
public final class e4e implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public e4e(f4e f4eVar, rv8 rv8Var, ArrayList arrayList, int i) {
        this.a = 0;
        this.c = f4eVar;
        this.d = rv8Var;
        this.e = arrayList;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                f4e f4eVar = (f4e) this.c;
                gc8 gc8Var = f4eVar.a;
                gc8Var.y();
                rv8 rv8Var = (rv8) obj2;
                gc8Var.M(rv8Var, new dw8(UUID.randomUUID().toString()));
                dfb b = gc8Var.getViewComponent$div_release().i().b(rv8Var, gc8Var.getDataTag());
                if (b != null) {
                    b.c();
                }
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    f4eVar.a((Throwable) it.next());
                }
                f4eVar.g = this.b;
                f4eVar.b(g4e.a);
                int i2 = i9f.a;
                break;
            default:
                try {
                    int i3 = this.b;
                    this.b = i3 + 1;
                    if (i3 < 3) {
                        ((MulticastSocket) obj2).send((DatagramPacket) obj);
                    } else {
                        ((ScheduledFuture) this.c).cancel(false);
                    }
                    break;
                } catch (IOException e) {
                    Log.e("MSFDSearchProvider", Log.getStackTraceString(e));
                    return;
                }
        }
    }

    public e4e(MulticastSocket multicastSocket, DatagramPacket datagramPacket) {
        this.a = 1;
        this.d = multicastSocket;
        this.e = datagramPacket;
        this.b = 0;
    }
}
