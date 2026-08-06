package defpackage;

import android.os.Trace;
import android.view.MotionEvent;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class jEYdxQDjs implements Runnable {
    public final /* synthetic */ c EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ jEYdxQDjs(c cVar, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.OOA6hdeuvCS;
        c cVar = this.EljAMC1QTz;
        switch (i) {
            case 0:
                v4 v4Var = cVar.XnEVoBF0td1l;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!v4Var.isEmpty()) {
                    try {
                        ((wu) v4Var.removeLast()).GWasM1elztuh();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            case 1:
                cVar.gqMuANyCes = false;
                MotionEvent motionEvent = cVar.cTIXpaxc;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    cVar.YZjbz8VdP5(motionEvent);
                    return;
                } else {
                    o4.jivtDDk9H("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                c.uFEq9NpZ(cVar.getRoot());
                return;
            default:
                c.uFEq9NpZ(cVar.getRoot());
                return;
        }
    }
}
