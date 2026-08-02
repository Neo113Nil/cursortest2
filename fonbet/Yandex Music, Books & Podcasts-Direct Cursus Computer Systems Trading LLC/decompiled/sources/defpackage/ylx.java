package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ylx extends bhx {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ fmp c;

    public ylx(fmp fmpVar, IBinder iBinder) {
        this.c = fmpVar;
        this.b = iBinder;
    }

    @Override // defpackage.bhx
    public final void a() {
        h9x d7xVar;
        hox hoxVar = (hox) this.c.b;
        int i = m8x.h;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            d7xVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            d7xVar = queryLocalInterface instanceof h9x ? (h9x) queryLocalInterface : new d7x(iBinder);
        }
        hoxVar.m = d7xVar;
        yee yeeVar = hoxVar.b;
        yeeVar.e("linkToDeath", new Object[0]);
        try {
            hoxVar.m.asBinder().linkToDeath(hoxVar.j, 0);
        } catch (RemoteException e) {
            yeeVar.c(e, "linkToDeath failed", new Object[0]);
        }
        hoxVar.g = false;
        Iterator it = hoxVar.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        hoxVar.d.clear();
    }
}
