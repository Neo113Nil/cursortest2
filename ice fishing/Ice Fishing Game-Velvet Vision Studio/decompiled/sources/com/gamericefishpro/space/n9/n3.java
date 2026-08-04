package com.gamericefishpro.space.n9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n3 implements ServiceConnection, com.gamericefishpro.space.v8.b, com.gamericefishpro.space.v8.c {
    public volatile boolean d;
    public volatile q0 e;
    public final /* synthetic */ o3 i;

    public n3(o3 o3Var) {
        this.i = o3Var;
    }

    @Override // com.gamericefishpro.space.v8.b
    public final void h() {
        p1 p1Var = ((r1) this.i.d).z;
        r1.l(p1Var);
        p1Var.w();
        synchronized (this) {
            try {
                com.gamericefishpro.space.v8.c0.g(this.e);
                h0 h0Var = (h0) this.e.u();
                p1 p1Var2 = ((r1) this.i.d).z;
                r1.l(p1Var2);
                p1Var2.A(new l3(this, h0Var, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.e = null;
                this.d = false;
            }
        }
    }

    @Override // com.gamericefishpro.space.v8.c
    public final void onConnectionFailed(com.gamericefishpro.space.s8.b bVar) {
        o3 o3Var = this.i;
        p1 p1Var = ((r1) o3Var.d).z;
        r1.l(p1Var);
        p1Var.w();
        v0 v0Var = ((r1) o3Var.d).y;
        if (v0Var == null || !v0Var.e) {
            v0Var = null;
        }
        if (v0Var != null) {
            v0Var.G.b(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.d = false;
            this.e = null;
        }
        p1 p1Var2 = ((r1) this.i.d).z;
        r1.l(p1Var2);
        p1Var2.A(new com.gamericefishpro.space.va.a(20, this, bVar, false));
    }

    @Override // com.gamericefishpro.space.v8.b
    public final void onConnectionSuspended(int i) {
        r1 r1Var = (r1) this.i.d;
        p1 p1Var = r1Var.z;
        r1.l(p1Var);
        p1Var.w();
        v0 v0Var = r1Var.y;
        r1.l(v0Var);
        v0Var.F.a("Service connection suspended");
        p1 p1Var2 = r1Var.z;
        r1.l(p1Var2);
        p1Var2.A(new com.gamericefishpro.space.h4.b(8, this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        p1 p1Var = ((r1) this.i.d).z;
        r1.l(p1Var);
        p1Var.w();
        synchronized (this) {
            if (iBinder == null) {
                this.d = false;
                v0 v0Var = ((r1) this.i.d).y;
                r1.l(v0Var);
                v0Var.y.a("Service connected with null binder");
                return;
            }
            h0 f0Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    f0Var = iInterfaceQueryLocalInterface instanceof h0 ? (h0) iInterfaceQueryLocalInterface : new f0(iBinder);
                    v0 v0Var2 = ((r1) this.i.d).y;
                    r1.l(v0Var2);
                    v0Var2.G.a("Bound to IMeasurementService interface");
                } else {
                    v0 v0Var3 = ((r1) this.i.d).y;
                    r1.l(v0Var3);
                    v0Var3.y.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                v0 v0Var4 = ((r1) this.i.d).y;
                r1.l(v0Var4);
                v0Var4.y.a("Service connect failed to get IMeasurementService");
            }
            if (f0Var == null) {
                this.d = false;
                try {
                    com.gamericefishpro.space.y8.a aVarB = com.gamericefishpro.space.y8.a.b();
                    o3 o3Var = this.i;
                    aVarB.c(((r1) o3Var.d).d, o3Var.i);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                p1 p1Var2 = ((r1) this.i.d).z;
                r1.l(p1Var2);
                p1Var2.A(new l3(this, f0Var, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        r1 r1Var = (r1) this.i.d;
        p1 p1Var = r1Var.z;
        r1.l(p1Var);
        p1Var.w();
        v0 v0Var = r1Var.y;
        r1.l(v0Var);
        v0Var.F.a("Service disconnected");
        p1 p1Var2 = r1Var.z;
        r1.l(p1Var2);
        p1Var2.A(new com.gamericefishpro.space.va.a(19, this, componentName, false));
    }
}
