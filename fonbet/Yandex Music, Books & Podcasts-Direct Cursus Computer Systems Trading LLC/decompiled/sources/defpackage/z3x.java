package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class z3x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f4x b;
    public final /* synthetic */ int c;

    public /* synthetic */ z3x(f4x f4xVar, int i, int i2) {
        this.a = i2;
        this.b = f4xVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        Iterator it2;
        Iterator it3;
        switch (this.a) {
            case 0:
                f4x f4xVar = this.b;
                h4x h4xVar = f4xVar.i;
                h4xVar.x = -1;
                h4xVar.y = -1;
                h4xVar.t = null;
                h4xVar.u = null;
                h4xVar.v = 0.0d;
                h4xVar.j();
                h4xVar.w = false;
                h4xVar.z = null;
                h4x h4xVar2 = f4xVar.i;
                h4xVar2.F = 1;
                int i = this.c;
                synchronized (h4xVar2.E) {
                    try {
                        it = f4xVar.i.E.iterator();
                    } catch (RemoteException e) {
                        p84.m.a(e, "Unable to call %s on %s.", "onDisconnected", m1x.class.getSimpleName());
                    } finally {
                    }
                    while (it.hasNext()) {
                        m1x m1xVar = ((nox) it.next()).a.e;
                        if (m1xVar != null) {
                            h66 h66Var = new h66(i);
                            h1x h1xVar = (h1x) m1xVar;
                            Parcel M0 = h1xVar.M0();
                            y4x.c(M0, h66Var);
                            h1xVar.O0(M0, 3);
                        }
                    }
                }
                f4xVar.i.g();
                h4x h4xVar3 = f4xVar.i;
                h4xVar3.f(h4xVar3.k);
                return;
            case 1:
                f4x f4xVar2 = this.b;
                int i2 = this.c;
                h4x h4xVar4 = f4xVar2.i;
                if (i2 == 0) {
                    h4xVar4.F = 3;
                    h4xVar4.m = true;
                    h4xVar4.n = true;
                    synchronized (h4xVar4.E) {
                        try {
                            Iterator it4 = f4xVar2.i.E.iterator();
                            while (it4.hasNext()) {
                                ((nox) it4.next()).a();
                            }
                        } finally {
                        }
                    }
                    return;
                }
                h4xVar4.F = 1;
                synchronized (h4xVar4.E) {
                    try {
                        it2 = f4xVar2.i.E.iterator();
                    } catch (RemoteException e2) {
                        p84.m.a(e2, "Unable to call %s on %s.", "onConnectionFailed", m1x.class.getSimpleName());
                    } finally {
                    }
                    while (it2.hasNext()) {
                        m1x m1xVar2 = ((nox) it2.next()).a.e;
                        if (m1xVar2 != null) {
                            h66 h66Var2 = new h66(i2);
                            h1x h1xVar2 = (h1x) m1xVar2;
                            Parcel M02 = h1xVar2.M0();
                            y4x.c(M02, h66Var2);
                            h1xVar2.O0(M02, 3);
                        }
                    }
                }
                f4xVar2.i.g();
                return;
            case 2:
                this.b.i.D.b(this.c);
                return;
            default:
                f4x f4xVar3 = this.b;
                h4x h4xVar5 = f4xVar3.i;
                h4xVar5.F = 4;
                int i3 = this.c;
                synchronized (h4xVar5.E) {
                    try {
                        it3 = f4xVar3.i.E.iterator();
                    } catch (RemoteException e3) {
                        p84.m.a(e3, "Unable to call %s on %s.", "onConnectionSuspended", m1x.class.getSimpleName());
                    } finally {
                    }
                    while (it3.hasNext()) {
                        m1x m1xVar3 = ((nox) it3.next()).a.e;
                        if (m1xVar3 != null) {
                            h1x h1xVar3 = (h1x) m1xVar3;
                            Parcel M03 = h1xVar3.M0();
                            M03.writeInt(i3);
                            h1xVar3.O0(M03, 2);
                        }
                    }
                }
                return;
        }
    }
}
