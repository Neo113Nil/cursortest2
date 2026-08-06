package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class v1 extends ih {
    public final Choreographer AvO7iQsrTN;
    public final y1 WIEu4Ya2g8;
    public boolean XnEVoBF0td1l;
    public final Handler encWxUiV2;
    public boolean uFEq9NpZ;
    public static final m71 YmKjaVtbfp5Z = new m71(q.iwATDS1i01k);
    public static final t1 Mjvvu5DE = new t1(0);
    public final Object mOu10nynGul = new Object();
    public final v4 JFJ3QoxA = new v4();
    public ArrayList rQPn8YBR = new ArrayList();
    public ArrayList E7jCp8Ls = new ArrayList();
    public final u1 iwATDS1i01k = new u1(this);

    public v1(Choreographer choreographer, Handler handler) {
        this.AvO7iQsrTN = choreographer;
        this.encWxUiV2 = handler;
        this.WIEu4Ya2g8 = new y1(choreographer, this);
    }

    public static final void JFJ3QoxA(v1 v1Var) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (v1Var.mOu10nynGul) {
                v4 v4Var = v1Var.JFJ3QoxA;
                runnable = (Runnable) (v4Var.isEmpty() ? null : v4Var.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (v1Var.mOu10nynGul) {
                    v4 v4Var2 = v1Var.JFJ3QoxA;
                    runnable = (Runnable) (v4Var2.isEmpty() ? null : v4Var2.removeFirst());
                }
            }
            synchronized (v1Var.mOu10nynGul) {
                if (v1Var.JFJ3QoxA.isEmpty()) {
                    z = false;
                    v1Var.XnEVoBF0td1l = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.ih
    public final void OOA6hdeuvCS(gh ghVar, Runnable runnable) {
        synchronized (this.mOu10nynGul) {
            this.JFJ3QoxA.addLast(runnable);
            if (!this.XnEVoBF0td1l) {
                this.XnEVoBF0td1l = true;
                this.encWxUiV2.post(this.iwATDS1i01k);
                if (!this.uFEq9NpZ) {
                    this.uFEq9NpZ = true;
                    this.AvO7iQsrTN.postFrameCallback(this.iwATDS1i01k);
                }
            }
        }
    }
}
