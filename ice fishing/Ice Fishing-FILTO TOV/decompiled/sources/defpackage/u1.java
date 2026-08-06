package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class u1 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ v1 OOA6hdeuvCS;

    public u1(v1 v1Var) {
        this.OOA6hdeuvCS = v1Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.OOA6hdeuvCS.encWxUiV2.removeCallbacks(this);
        v1.JFJ3QoxA(this.OOA6hdeuvCS);
        v1 v1Var = this.OOA6hdeuvCS;
        synchronized (v1Var.mOu10nynGul) {
            if (v1Var.uFEq9NpZ) {
                v1Var.uFEq9NpZ = false;
                ArrayList arrayList = v1Var.rQPn8YBR;
                v1Var.rQPn8YBR = v1Var.E7jCp8Ls;
                v1Var.E7jCp8Ls = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        v1.JFJ3QoxA(this.OOA6hdeuvCS);
        v1 v1Var = this.OOA6hdeuvCS;
        synchronized (v1Var.mOu10nynGul) {
            if (v1Var.rQPn8YBR.isEmpty()) {
                v1Var.AvO7iQsrTN.removeFrameCallback(this);
                v1Var.uFEq9NpZ = false;
            }
        }
    }
}
