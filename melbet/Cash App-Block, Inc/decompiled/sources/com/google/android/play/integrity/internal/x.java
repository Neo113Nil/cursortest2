package com.google.android.play.integrity.internal;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class x extends t {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object a;

    public x(ae aeVar) {
        Objects.requireNonNull(aeVar);
        this.a = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        switch (this.$r8$classId) {
            case 0:
                ae aeVar = (ae) this.a;
                synchronized (aeVar.g) {
                    try {
                        if (aeVar.m.get() > 0 && aeVar.m.decrementAndGet() > 0) {
                            aeVar.c.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        if (aeVar.o != null) {
                            aeVar.c.d("Unbind from service.", new Object[0]);
                            aeVar.b.unbindService(aeVar.n);
                            aeVar.h = false;
                            aeVar.o = null;
                            aeVar.n = null;
                        }
                        HashSet hashSet = aeVar.f;
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(aeVar.d).concat(" : Binder has died.")));
                        }
                        hashSet.clear();
                        return;
                    } finally {
                    }
                }
            default:
                ae aeVar2 = ((ac) this.a).a;
                aeVar2.c.d("unlinkToDeath", new Object[0]);
                aeVar2.o.asBinder().unlinkToDeath(aeVar2.l, 0);
                aeVar2.o = null;
                aeVar2.h = false;
                return;
        }
    }

    public x(ac acVar) {
        this.a = acVar;
    }
}
