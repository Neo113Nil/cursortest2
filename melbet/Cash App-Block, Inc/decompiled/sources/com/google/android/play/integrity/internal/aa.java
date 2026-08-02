package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class aa extends t {
    public final /* synthetic */ IBinder a;
    public final /* synthetic */ ac b;

    public aa(ac acVar, IBinder iBinder) {
        this.a = iBinder;
        this.b = acVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        ae aeVar = this.b.a;
        z zVar = aeVar.j;
        ArrayList arrayList = aeVar.e;
        aeVar.o = (IInterface) zVar.a(this.a);
        s sVar = aeVar.c;
        sVar.d("linkToDeath", new Object[0]);
        try {
            aeVar.o.asBinder().linkToDeath(aeVar.l, 0);
        } catch (RemoteException e) {
            sVar.c(e, "linkToDeath failed", new Object[0]);
        }
        aeVar.h = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        arrayList.clear();
    }
}
