package com.gamericefishpro.space.sa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends p {
    public final /* synthetic */ IBinder e;
    public final /* synthetic */ c i;

    public a(c cVar, IBinder iBinder) {
        this.i = cVar;
        this.e = iBinder;
    }

    @Override // com.gamericefishpro.space.sa.p
    public final void b() {
        n lVar;
        d dVar = this.i.d;
        dVar.i.getClass();
        int i = m.e;
        IBinder iBinder = this.e;
        if (iBinder == null) {
            lVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
            lVar = iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new l(iBinder);
        }
        dVar.n = lVar;
        o oVar = dVar.b;
        int i2 = 0;
        oVar.a("linkToDeath", new Object[0]);
        try {
            ((l) dVar.n).d.linkToDeath(dVar.k, 0);
        } catch (RemoteException e) {
            Object[] objArr = new Object[0];
            oVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", o.b(oVar.a, "linkToDeath failed", objArr), e);
            }
        }
        dVar.g = false;
        ArrayList arrayList = dVar.d;
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((Runnable) obj).run();
        }
        dVar.d.clear();
    }
}
