package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class i9x extends lex {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public i9x(fmp fmpVar, IBinder iBinder) {
        this.b = 2;
        this.d = fmpVar;
        this.c = iBinder;
    }

    @Override // defpackage.lex
    public final void a() {
        j9x f7xVar;
        int i = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                i8s i8sVar = (i8s) obj;
                ndx ndxVar = (ndx) obj2;
                try {
                    ndxVar.a.m.j(ndxVar.b, kex.a(), new ubx(ndxVar, i8sVar));
                    break;
                } catch (RemoteException e) {
                    jpc jpcVar = ndx.c;
                    Object[] objArr = {ndxVar.b};
                    jpcVar.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", jpc.g(jpcVar.b, "error requesting in-app review for %s", objArr), e);
                    }
                    i8sVar.c(new RuntimeException(e));
                    return;
                }
            case 1:
                zlx zlxVar = (zlx) obj2;
                i9x i9xVar = (i9x) obj;
                j9x j9xVar = zlxVar.m;
                jpc jpcVar2 = zlxVar.b;
                ArrayList arrayList = zlxVar.d;
                if (j9xVar == null && !zlxVar.g) {
                    jpcVar2.f("Initiate binding to the service.", new Object[0]);
                    arrayList.add(i9xVar);
                    fmp fmpVar = new fmp(2, zlxVar);
                    zlxVar.l = fmpVar;
                    zlxVar.g = true;
                    if (!zlxVar.a.bindService(zlxVar.h, fmpVar, 1)) {
                        jpcVar2.f("Failed to bind to the service.", new Object[0]);
                        zlxVar.g = false;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            lex lexVar = (lex) it.next();
                            wp3 wp3Var = new wp3("Failed to bind to the service.");
                            i8s i8sVar2 = lexVar.a;
                            if (i8sVar2 != null) {
                                i8sVar2.c(wp3Var);
                            }
                        }
                        arrayList.clear();
                        break;
                    }
                } else if (!zlxVar.g) {
                    i9xVar.run();
                    break;
                } else {
                    jpcVar2.f("Waiting to bind to the service.", new Object[0]);
                    arrayList.add(i9xVar);
                    break;
                }
                break;
            default:
                zlx zlxVar2 = (zlx) ((fmp) obj2).b;
                IBinder iBinder = (IBinder) obj;
                int i2 = n8x.h;
                if (iBinder == null) {
                    f7xVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    f7xVar = queryLocalInterface instanceof j9x ? (j9x) queryLocalInterface : new f7x(iBinder);
                }
                zlxVar2.m = f7xVar;
                zlxVar2.b.f("linkToDeath", new Object[0]);
                try {
                    zlxVar2.m.asBinder().linkToDeath(zlxVar2.j, 0);
                } catch (RemoteException e2) {
                    jpc jpcVar3 = zlxVar2.b;
                    Object[] objArr2 = new Object[0];
                    jpcVar3.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", jpc.g(jpcVar3.b, "linkToDeath failed", objArr2), e2);
                    }
                }
                zlxVar2.g = false;
                Iterator it2 = zlxVar2.d.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                zlxVar2.d.clear();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i9x(Object obj, i8s i8sVar, Object obj2, int i) {
        super(i8sVar);
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }
}
