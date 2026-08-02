package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.zabh;

/* loaded from: classes11.dex */
public final class ux81 implements fy81 {
    public final e a;

    public ux81(e eVar) {
        this.a = eVar;
    }

    @Override // defpackage.fy81
    public final void h() {
    }

    @Override // defpackage.fy81
    public final void i() {
    }

    @Override // defpackage.fy81
    public final void j(int i) {
        e eVar = this.a;
        eVar.h();
        eVar.G.g(i);
    }

    @Override // defpackage.fy81
    public final boolean l() {
        e eVar = this.a;
        eVar.F.getClass();
        eVar.h();
        return true;
    }

    @Override // defpackage.fy81
    public final a p(a aVar) {
        e eVar = this.a;
        try {
            hz81 hz81Var = eVar.F.P;
            hz81Var.a.add(aVar);
            aVar.z.set(hz81Var.b);
            pm2 pm2Var = aVar.H;
            om2 om2Var = (om2) eVar.F.H.get(pm2Var);
            cvw.m(om2Var, "Appropriate Api was not requested.");
            if (!om2Var.isConnected() && eVar.z.containsKey(pm2Var)) {
                aVar.n(new Status(17));
                return aVar;
            }
            try {
                aVar.m(om2Var);
            } catch (DeadObjectException e) {
                aVar.n(new Status(8, e.getLocalizedMessage(), (PendingIntent) null));
                throw e;
            } catch (RemoteException e2) {
                aVar.n(new Status(8, e2.getLocalizedMessage(), (PendingIntent) null));
            }
            return aVar;
        } catch (DeadObjectException unused) {
            tx81 tx81Var = new tx81(this, this);
            zabh zabhVar = eVar.x;
            zabhVar.sendMessage(zabhVar.obtainMessage(1, tx81Var));
            return aVar;
        }
    }

    @Override // defpackage.fy81
    public final void r(Bundle bundle) {
    }

    @Override // defpackage.fy81
    public final void s(ConnectionResult connectionResult, zm2 zm2Var, boolean z) {
    }
}
