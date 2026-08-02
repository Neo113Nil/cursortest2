package defpackage;

import android.os.Handler;
import com.yandex.messaging.internal.net.file.FileProgressObservable$Listener$Status;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final /* synthetic */ class v0r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1r b;
    public final /* synthetic */ String c;

    public /* synthetic */ v0r(a1r a1rVar, String str, int i) {
        this.a = i;
        this.b = a1rVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        a1r a1rVar = this.b;
        switch (i) {
            case 0:
                qzt0 qzt0Var = a1rVar.g;
                ((Handler) qzt0Var.x).removeCallbacksAndMessages(null);
                qzt0Var.c = false;
                qzt0Var.b = -1L;
                a1rVar.b.remove(str);
                zq60 zq60Var = (zq60) a1rVar.a.get(str);
                if (zq60Var != null) {
                    Iterator it = zq60Var.iterator();
                    while (true) {
                        sq60 sq60Var = (sq60) it;
                        if (!sq60Var.hasNext()) {
                            break;
                        } else {
                            ((z0r) sq60Var.next()).a(FileProgressObservable$Listener$Status.CANCELED);
                        }
                    }
                }
                break;
            case 1:
                qzt0 qzt0Var2 = a1rVar.g;
                ((Handler) qzt0Var2.x).removeCallbacksAndMessages(null);
                qzt0Var2.c = false;
                qzt0Var2.b = -1L;
                a1rVar.b.remove(str);
                zq60 zq60Var2 = (zq60) a1rVar.a.get(str);
                if (zq60Var2 != null) {
                    Iterator it2 = zq60Var2.iterator();
                    while (true) {
                        sq60 sq60Var2 = (sq60) it2;
                        if (!sq60Var2.hasNext()) {
                            break;
                        } else {
                            ((z0r) sq60Var2.next()).a(FileProgressObservable$Listener$Status.FINISHED);
                        }
                    }
                }
                break;
            default:
                qzt0 qzt0Var3 = a1rVar.g;
                ((Handler) qzt0Var3.x).removeCallbacksAndMessages(null);
                qzt0Var3.c = false;
                qzt0Var3.b = -1L;
                w53 w53Var = a1rVar.b;
                x0r x0rVar = new x0r();
                x0rVar.a = -1L;
                x0rVar.b = -1L;
                w53Var.put(str, x0rVar);
                zq60 zq60Var3 = (zq60) a1rVar.a.get(str);
                if (zq60Var3 != null) {
                    Iterator it3 = zq60Var3.iterator();
                    while (true) {
                        sq60 sq60Var3 = (sq60) it3;
                        if (!sq60Var3.hasNext()) {
                            break;
                        } else {
                            ((z0r) sq60Var3.next()).a(FileProgressObservable$Listener$Status.STARTED);
                        }
                    }
                }
                break;
        }
    }
}
