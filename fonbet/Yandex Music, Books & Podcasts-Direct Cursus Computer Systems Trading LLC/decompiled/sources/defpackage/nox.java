package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class nox {
    public final /* synthetic */ p84 a;

    public nox(p84 p84Var) {
        this.a = p84Var;
    }

    public final void a() {
        p84 p84Var = this.a;
        m1x m1xVar = p84Var.e;
        if (m1xVar == null) {
            return;
        }
        try {
            xun xunVar = p84Var.j;
            if (xunVar != null) {
                xunVar.u();
            }
            h1x h1xVar = (h1x) m1xVar;
            Parcel M0 = h1xVar.M0();
            int i = y4x.a;
            M0.writeInt(0);
            h1xVar.O0(M0, 1);
        } catch (RemoteException e) {
            p84.m.a(e, "Unable to call %s on %s.", "onConnected", m1x.class.getSimpleName());
        }
        knn knnVar = p84Var.l;
        if (knnVar != null) {
            tao.w((tao) knnVar.b, new l5x(new w2r(3)));
        }
    }
}
