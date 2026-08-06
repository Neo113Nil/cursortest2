package defpackage;

/* loaded from: classes.dex */
public final class k3 implements android.view.Choreographer.FrameCallback, java.lang.Runnable {
    public final /* synthetic */ defpackage.l3 adDC3e2L;

    public k3(defpackage.l3 l3Var) {
        this.adDC3e2L = l3Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.adDC3e2L.EXtogiMhuM.removeCallbacks(this);
        defpackage.l3.p4kuH6PDtgom(this.adDC3e2L);
        defpackage.l3 l3Var = this.adDC3e2L;
        synchronized (l3Var.riuEU0zW4) {
            if (l3Var.SyNS6RMn) {
                l3Var.SyNS6RMn = false;
                java.util.ArrayList arrayList = l3Var.ez2rX8ReCYw;
                l3Var.ez2rX8ReCYw = l3Var.JlrlGoKF;
                l3Var.JlrlGoKF = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((android.view.Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.l3.p4kuH6PDtgom(this.adDC3e2L);
        defpackage.l3 l3Var = this.adDC3e2L;
        synchronized (l3Var.riuEU0zW4) {
            if (l3Var.ez2rX8ReCYw.isEmpty()) {
                l3Var.AARZUJiTa.removeFrameCallback(this);
                l3Var.SyNS6RMn = false;
            }
        }
    }
}
