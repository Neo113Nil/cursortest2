package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final /* synthetic */ class wfx implements IBinder.DeathRecipient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wfx(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.a) {
            case 0:
                zlx zlxVar = (zlx) this.b;
                String str = zlxVar.c;
                jpc jpcVar = zlxVar.b;
                jpcVar.f("reportBinderDeath", new Object[0]);
                if (zlxVar.i.get() != null) {
                    l1j.f();
                    return;
                }
                jpcVar.f("%s : Binder has died.", str);
                ArrayList arrayList = zlxVar.d;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    lex lexVar = (lex) it.next();
                    RemoteException remoteException = new RemoteException(String.valueOf(str).concat(" : Binder has died."));
                    i8s i8sVar = lexVar.a;
                    if (i8sVar != null) {
                        i8sVar.c(remoteException);
                    }
                }
                arrayList.clear();
                zlxVar.b();
                return;
            default:
                hox hoxVar = (hox) this.b;
                hoxVar.b.e("reportBinderDeath", new Object[0]);
                if (hoxVar.i.get() != null) {
                    l1j.f();
                    return;
                }
                hoxVar.b.e("%s : Binder has died.", hoxVar.c);
                Iterator it2 = hoxVar.d.iterator();
                while (it2.hasNext()) {
                    bhx bhxVar = (bhx) it2.next();
                    RemoteException remoteException2 = new RemoteException(String.valueOf(hoxVar.c).concat(" : Binder has died."));
                    i8s i8sVar2 = bhxVar.a;
                    if (i8sVar2 != null) {
                        i8sVar2.c(remoteException2);
                    }
                }
                hoxVar.d.clear();
                synchronized (hoxVar.f) {
                    hoxVar.d();
                }
                return;
        }
    }
}
