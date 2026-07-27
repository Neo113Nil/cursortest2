package d0;

import android.util.SparseArray;
import java.util.Iterator;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0111a implements InterfaceC0112b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0113c f1781a;

    public C0111a(C0113c c0113c) {
        this.f1781a = c0113c;
    }

    @Override // d0.InterfaceC0112b
    public final void a() {
        C0113c c0113c = this.f1781a;
        Iterator it = c0113c.f1804v.iterator();
        while (it.hasNext()) {
            ((InterfaceC0112b) it.next()).a();
        }
        while (true) {
            io.flutter.plugin.platform.k kVar = c0113c.f1801s;
            SparseArray sparseArray = kVar.f2483o;
            if (sparseArray.size() <= 0) {
                break;
            }
            kVar.f2492y.v(sparseArray.keyAt(0));
        }
        while (true) {
            io.flutter.plugin.platform.j jVar = c0113c.f1802t;
            SparseArray sparseArray2 = jVar.f2466k;
            if (sparseArray2.size() <= 0) {
                c0113c.f1794k.f2739b = null;
                return;
            } else {
                jVar.r.v(sparseArray2.keyAt(0));
            }
        }
    }

    @Override // d0.InterfaceC0112b
    public final void b() {
    }
}
