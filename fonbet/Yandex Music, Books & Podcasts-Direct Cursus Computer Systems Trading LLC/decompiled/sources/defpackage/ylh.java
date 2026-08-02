package defpackage;

import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final /* synthetic */ class ylh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ylh(sth sthVar, alp alpVar, int i, xth xthVar, rth rthVar) {
        this.a = 1;
        this.c = sthVar;
        this.d = alpVar;
        this.b = i;
        this.e = xthVar;
        this.f = rthVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                bmh bmhVar = (bmh) this.c;
                AtomicInteger atomicInteger = (AtomicInteger) this.d;
                List list = (List) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                if (atomicInteger.incrementAndGet() == list.size()) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        lcg lcgVar = (lcg) arrayList.get(i);
                        if (lcgVar != null) {
                            try {
                                bitmap = (Bitmap) leu.O(lcgVar);
                            } catch (CancellationException | ExecutionException e) {
                                vq1.I("MCImplLegacy", "Failed to get bitmap", e);
                            }
                            bmhVar.i.i(rwf.g((onh) list.get(i), bitmap), this.b + i);
                        }
                        bitmap = null;
                        bmhVar.i.i(rwf.g((onh) list.get(i), bitmap), this.b + i);
                    }
                    break;
                }
                break;
            case 1:
                sth sthVar = (sth) this.c;
                alp alpVar = (alp) this.d;
                xth xthVar = (xth) this.e;
                rth rthVar = (rth) this.f;
                if (!sthVar.h.k()) {
                    boolean isActive = ((dsh) sthVar.l.b).a.isActive();
                    int i2 = this.b;
                    if (!isActive) {
                        StringBuilder sb = new StringBuilder("Ignore incoming session command before initialization. command=");
                        sb.append(alpVar == null ? Integer.valueOf(i2) : alpVar.b);
                        sb.append(", pid=");
                        sb.append(xthVar.a.b);
                        vq1.n0("MediaSessionLegacyStub", sb.toString());
                        break;
                    } else {
                        wrh p0 = sthVar.p0(xthVar);
                        g06 g06Var = sthVar.g;
                        if (alpVar != null) {
                            if (!g06Var.L(p0, alpVar)) {
                            }
                        } else if (!g06Var.K(p0, i2)) {
                        }
                        try {
                            rthVar.a(p0);
                            break;
                        } catch (RemoteException e2) {
                            vq1.o0("MediaSessionLegacyStub", "Exception in " + p0, e2);
                            return;
                        }
                    }
                }
                break;
            default:
                kwh kwhVar = (kwh) this.c;
                Pair pair = (Pair) this.d;
                ((uj7) kwhVar.b.i).A(((Integer) pair.first).intValue(), (uvh) pair.second, (cfg) this.e, (boh) this.f, this.b);
                break;
        }
    }

    public /* synthetic */ ylh(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i;
    }
}
