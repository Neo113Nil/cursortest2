package defpackage;

import android.util.SparseArray;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.platform.d;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class trr implements urr {
    public final /* synthetic */ FlutterEngine a;

    public trr(FlutterEngine flutterEngine) {
        this.a = flutterEngine;
    }

    @Override // defpackage.urr
    public final void a() {
    }

    @Override // defpackage.urr
    public final void b() {
        FlutterEngine flutterEngine = this.a;
        Iterator it = flutterEngine.v.iterator();
        while (it.hasNext()) {
            ((urr) it.next()).b();
        }
        d dVar = flutterEngine.t;
        SparseArray sparseArray = dVar.E;
        while (sparseArray.size() > 0) {
            dVar.P.c(sparseArray.keyAt(0));
        }
        dxc0 dxc0Var = flutterEngine.u;
        SparseArray sparseArray2 = dxc0Var.B;
        while (sparseArray2.size() > 0) {
            dxc0Var.I.C(sparseArray2.keyAt(0));
        }
        flutterEngine.l.b = null;
    }
}
