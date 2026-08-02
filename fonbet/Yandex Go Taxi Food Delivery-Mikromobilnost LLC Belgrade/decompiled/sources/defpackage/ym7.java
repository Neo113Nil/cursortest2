package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class ym7 implements bn7 {
    public final /* synthetic */ an7 a;

    public ym7(an7 an7Var) {
        this.a = an7Var;
    }

    @Override // defpackage.bn7
    public final euy a(TotalCaptureResult totalCaptureResult) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            arrayList.add(((bn7) it.next()).a(totalCaptureResult));
        }
        lry b = ni91.b(arrayList);
        vm7 vm7Var = new vm7(2);
        return ni91.n(b, new gym(vm7Var), geb1.b());
    }

    @Override // defpackage.bn7
    public final boolean b() {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            if (((bn7) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bn7
    public final void c() {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((bn7) it.next()).c();
        }
    }
}
