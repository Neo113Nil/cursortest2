package d0;

import android.util.SparseArray;
import java.util.Iterator;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0111a implements InterfaceC0112b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0113c f1773a;

    public C0111a(C0113c c0113c) {
        this.f1773a = c0113c;
    }

    @Override // d0.InterfaceC0112b
    public final void a() {
        C0113c c0113c = this.f1773a;
        Iterator it = c0113c.f1796v.iterator();
        while (it.hasNext()) {
            ((InterfaceC0112b) it.next()).a();
        }
        while (true) {
            io.flutter.plugin.platform.k kVar = c0113c.f1793s;
            SparseArray sparseArray = kVar.f2475p;
            if (sparseArray.size() <= 0) {
                break;
            }
            kVar.f2484z.v(sparseArray.keyAt(0));
        }
        while (true) {
            io.flutter.plugin.platform.j jVar = c0113c.f1794t;
            SparseArray sparseArray2 = jVar.f2458l;
            if (sparseArray2.size() <= 0) {
                c0113c.f1786k.f2731b = null;
                return;
            } else {
                jVar.f2464s.v(sparseArray2.keyAt(0));
            }
        }
    }

    @Override // d0.InterfaceC0112b
    public final void b() {
    }
}
