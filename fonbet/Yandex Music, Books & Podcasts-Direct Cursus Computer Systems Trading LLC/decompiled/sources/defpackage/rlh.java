package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Process;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class rlh implements ServiceConnection {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rlh(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public void a(uz2 uz2Var) {
        synchronized (((qz2) this.c).a) {
            try {
                if (((qz2) this.c).b == 3) {
                    return;
                }
                ((rz2) this.b).onBillingSetupFinished(uz2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z;
        switch (this.a) {
            case 0:
                kkh kkhVar = ((ulh) this.c).a;
                Objects.requireNonNull(kkhVar);
                kkhVar.j1(new dyg(5, kkhVar));
                return;
            default:
                l8x.g("BillingClient", "Billing service died.");
                try {
                    qz2 qz2Var = (qz2) this.c;
                    synchronized (qz2Var.a) {
                        z = true;
                        if (qz2Var.b != 1) {
                            z = false;
                        }
                    }
                    atn atnVar = ((qz2) this.c).g;
                    if (z) {
                        afx q = bfx.q();
                        q.d();
                        bfx.p((bfx) q.b, 6);
                        lfx r = mfx.r();
                        r.e(122);
                        q.e(r);
                        atnVar.V((bfx) q.c());
                    } else {
                        atnVar.Y(ofx.n());
                    }
                } catch (Throwable th) {
                    l8x.h("BillingClient", "Unable to log.", th);
                }
                synchronized (((qz2) this.c).a) {
                    if (((qz2) this.c).b != 3 && ((qz2) this.c).b != 0) {
                        ((qz2) this.c).o(0);
                        ((qz2) this.c).p();
                        ((rz2) this.b).onBillingServiceDisconnected();
                        return;
                    }
                    return;
                }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        dyg dygVar;
        q1x l1xVar;
        switch (this.a) {
            case 0:
                ulh ulhVar = (ulh) this.c;
                bnp bnpVar = ulhVar.e;
                kkh kkhVar = ulhVar.a;
                int i = 5;
                try {
                    try {
                        if (bnpVar.a.w().equals(componentName.getPackageName())) {
                            g9e R = muh.R(iBinder);
                            if (R != null) {
                                String packageName = ulhVar.d.getPackageName();
                                int myPid = Process.myPid();
                                Bundle bundle = (Bundle) this.b;
                                kkhVar.getClass();
                                R.w0(ulhVar.c, new g66(packageName, myPid, bundle).b());
                                return;
                            }
                            vq1.K("MCImplBase", "Service interface is missing.");
                            Objects.requireNonNull(kkhVar);
                            dygVar = new dyg(i, kkhVar);
                        } else {
                            vq1.K("MCImplBase", "Expected connection to " + bnpVar.a.w() + " but is connected to " + componentName);
                            Objects.requireNonNull(kkhVar);
                            dygVar = new dyg(i, kkhVar);
                        }
                    } catch (RemoteException unused) {
                        vq1.n0("MCImplBase", "Service " + componentName + " has died prematurely");
                        Objects.requireNonNull(kkhVar);
                        dygVar = new dyg(i, kkhVar);
                    }
                    kkhVar.j1(dygVar);
                    return;
                } catch (Throwable th) {
                    Objects.requireNonNull(kkhVar);
                    kkhVar.j1(new dyg(i, kkhVar));
                    throw th;
                }
            default:
                l8x.f("BillingClient", "Billing service connected.");
                synchronized (((qz2) this.c).a) {
                    try {
                        if (((qz2) this.c).b == 3) {
                            return;
                        }
                        qz2 qz2Var = (qz2) this.c;
                        int i2 = n1x.h;
                        if (iBinder == null) {
                            l1xVar = null;
                        } else {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                            l1xVar = queryLocalInterface instanceof q1x ? (q1x) queryLocalInterface : new l1x(iBinder, "com.android.vending.billing.IInAppBillingService", 4);
                        }
                        qz2Var.h = l1xVar;
                        qz2 qz2Var2 = (qz2) this.c;
                        if (qz2.i(new z68(4, this), 30000L, new yyo(20, this), qz2Var2.v(), qz2Var2.m()) == null) {
                            qz2 qz2Var3 = (qz2) this.c;
                            uz2 j = qz2Var3.j();
                            qz2Var3.y(25, 6, j);
                            a(j);
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z;
        switch (this.a) {
            case 0:
                kkh kkhVar = ((ulh) this.c).a;
                Objects.requireNonNull(kkhVar);
                kkhVar.j1(new dyg(5, kkhVar));
                return;
            default:
                l8x.g("BillingClient", "Billing service disconnected.");
                try {
                    qz2 qz2Var = (qz2) this.c;
                    synchronized (qz2Var.a) {
                        z = true;
                        if (qz2Var.b != 1) {
                            z = false;
                        }
                    }
                    atn atnVar = ((qz2) this.c).g;
                    if (z) {
                        afx q = bfx.q();
                        q.d();
                        bfx.p((bfx) q.b, 6);
                        lfx r = mfx.r();
                        r.e(121);
                        q.e(r);
                        atnVar.V((bfx) q.c());
                    } else {
                        atnVar.a0(jgx.n());
                    }
                } catch (Throwable th) {
                    l8x.h("BillingClient", "Unable to log.", th);
                }
                synchronized (((qz2) this.c).a) {
                    try {
                        if (((qz2) this.c).b == 3) {
                            return;
                        }
                        ((qz2) this.c).o(0);
                        ((rz2) this.b).onBillingServiceDisconnected();
                        return;
                    } finally {
                    }
                }
        }
    }
}
