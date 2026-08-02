package defpackage;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class ogx extends bhx {
    public final /* synthetic */ int b;
    public final /* synthetic */ i8s c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogx(ikx ikxVar, i8s i8sVar, String str, i8s i8sVar2) {
        super(i8sVar);
        this.b = 0;
        this.e = ikxVar;
        this.d = str;
        this.c = i8sVar2;
    }

    @Override // defpackage.bhx
    public final void a() {
        switch (this.b) {
            case 0:
                i8s i8sVar = this.c;
                ikx ikxVar = (ikx) this.e;
                String str = (String) this.d;
                try {
                    ikxVar.a.m.l(ikxVar.b, ikx.a(ikxVar, str), new qjx(ikxVar, i8sVar, str));
                    return;
                } catch (RemoteException e) {
                    ikx.e.c(e, "requestUpdateInfo(%s)", str);
                    i8sVar.c(new RuntimeException(e));
                    return;
                }
            case 1:
                i8s i8sVar2 = this.c;
                ikx ikxVar2 = (ikx) this.e;
                try {
                    ikxVar2.a.m.Y(ikxVar2.b, ikx.b(), new vix(ikxVar2, new yee("OnCompleteUpdateCallback", 3), i8sVar2));
                    return;
                } catch (RemoteException e2) {
                    ikx.e.c(e2, "completeUpdate(%s)", (String) this.d);
                    i8sVar2.c(new RuntimeException(e2));
                    return;
                }
            default:
                synchronized (((hox) this.e).f) {
                    try {
                        hox hoxVar = (hox) this.e;
                        i8s i8sVar3 = this.c;
                        hoxVar.e.add(i8sVar3);
                        i8sVar3.a.addOnCompleteListener(new atn(24, hoxVar, i8sVar3));
                        if (((hox) this.e).k.getAndIncrement() > 0) {
                            ((hox) this.e).b.e("Already connected to the service.", new Object[0]);
                        }
                        hox.b((hox) this.e, (bhx) this.d);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ogx(Object obj, i8s i8sVar, i8s i8sVar2, Object obj2, int i) {
        super(i8sVar);
        this.b = i;
        this.e = obj;
        this.c = i8sVar2;
        this.d = obj2;
    }
}
