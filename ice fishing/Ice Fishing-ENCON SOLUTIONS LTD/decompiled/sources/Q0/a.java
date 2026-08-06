package Q0;

import android.util.SparseArray;
import io.flutter.embedding.engine.FlutterEngine;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlutterEngine f1517a;

    public a(FlutterEngine flutterEngine) {
        this.f1517a = flutterEngine;
    }

    @Override // Q0.b
    public final void a() {
        FlutterEngine flutterEngine = this.f1517a;
        Iterator it = flutterEngine.f7726v.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        while (true) {
            io.flutter.plugin.platform.k kVar = flutterEngine.f7724s;
            SparseArray sparseArray = kVar.f7867k;
            if (sparseArray.size() <= 0) {
                break;
            }
            kVar.f7876u.k(sparseArray.keyAt(0));
        }
        while (true) {
            io.flutter.plugin.platform.j jVar = flutterEngine.t;
            SparseArray sparseArray2 = jVar.f7849g;
            if (sparseArray2.size() <= 0) {
                flutterEngine.f7716k.f1997b = null;
                return;
            } else {
                jVar.f7856n.k(sparseArray2.keyAt(0));
            }
        }
    }

    @Override // Q0.b
    public final void b() {
    }
}
