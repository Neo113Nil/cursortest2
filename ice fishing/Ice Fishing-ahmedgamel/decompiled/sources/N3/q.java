package N3;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2007n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ v f2008u;

    public /* synthetic */ q(v vVar, int i) {
        this.f2007n = i;
        this.f2008u = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2007n) {
            case 0:
                v vVar = this.f2008u;
                if (vVar.f2023k != null) {
                    if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                        Log.i("ServiceConnMgrImpl", "Unbind from service.");
                    }
                    Context context = vVar.f2015b;
                    u uVar = vVar.f2022j;
                    uVar.getClass();
                    context.unbindService(uVar);
                    vVar.f2019f = false;
                    vVar.f2023k = null;
                    vVar.f2022j = null;
                    ArrayList arrayList = vVar.f2017d;
                    synchronized (arrayList) {
                        arrayList.clear();
                    }
                    Log.i("ServiceConnMgrImpl", "notifyOnDisconnected in unbind()");
                    vVar.b();
                    return;
                }
                return;
            default:
                v vVar2 = this.f2008u;
                if (vVar2.f2023k != null) {
                    vVar2.f2023k = null;
                    Log.i("ServiceConnMgrImpl", "notifyOnDisconnected in reportBinderDeath()");
                    vVar2.b();
                    return;
                }
                return;
        }
    }
}
