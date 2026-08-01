package L3;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1734n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ y f1735u;

    public /* synthetic */ t(y yVar, int i) {
        this.f1734n = i;
        this.f1735u = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1734n) {
            case 0:
                y yVar = this.f1735u;
                if (yVar.f1751k != null) {
                    if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                        Log.i("ServiceConnMgrImpl", "Unbind from service.");
                    }
                    Context context = yVar.f1743b;
                    x xVar = yVar.f1750j;
                    xVar.getClass();
                    context.unbindService(xVar);
                    yVar.f1747f = false;
                    yVar.f1751k = null;
                    yVar.f1750j = null;
                    ArrayList arrayList = yVar.f1745d;
                    synchronized (arrayList) {
                        arrayList.clear();
                    }
                    Log.i("ServiceConnMgrImpl", "notifyOnDisconnected in unbind()");
                    yVar.b();
                    return;
                }
                return;
            default:
                y yVar2 = this.f1735u;
                if (yVar2.f1751k != null) {
                    yVar2.f1751k = null;
                    Log.i("ServiceConnMgrImpl", "notifyOnDisconnected in reportBinderDeath()");
                    yVar2.b();
                    return;
                }
                return;
        }
    }
}
