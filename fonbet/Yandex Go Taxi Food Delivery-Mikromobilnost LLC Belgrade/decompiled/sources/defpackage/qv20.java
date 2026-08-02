package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.ui.overlay.b;
import com.yandex.mapkit.geometry.Polyline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes14.dex */
public final class qv20 implements rv20 {
    public final /* synthetic */ b a;

    public qv20(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.rv20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K0(tv20 tv20Var) {
        w4e0 w4e0Var;
        List list = tv20Var.a;
        b bVar = this.a;
        ArrayList arrayList = bVar.e;
        xm00 xm00Var = bVar.d;
        w4e0 w4e0Var2 = null;
        Polyline polyline = null;
        if (xm00Var != null) {
            int size = list.size() - arrayList.size();
            int i = 0;
            if (size > 0) {
                int abs = Math.abs(size);
                for (int i2 = 0; i2 < abs; i2++) {
                    arrayList.add(xm00Var.r(cwa1.d(zzs.f)));
                }
            } else if (size < 0) {
                int abs2 = Math.abs(size);
                for (int i3 = 0; i3 < abs2; i3++) {
                    f4c0 f4c0Var = (f4c0) ycc.A(arrayList);
                    if (f4c0Var != null) {
                        f4c0Var.d();
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i4 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                f4c0 f4c0Var2 = (f4c0) next;
                uq00 uq00Var = (uq00) a.S(i, list);
                if (uq00Var != null) {
                    f4c0Var2.o(cwa1.d(uq00Var.a));
                    bl00 bl00Var = uq00Var.b;
                    f4c0Var2.z(bl00Var.a, bl00Var.b);
                }
                i = i4;
            }
        }
        q6l0 q6l0Var = tv20Var.b;
        if (q6l0Var == null) {
            w4e0 w4e0Var3 = bVar.f;
            if (w4e0Var3 != null) {
                w4e0Var3.d();
            }
            bVar.f = null;
            return;
        }
        Polyline polyline2 = (Polyline) q6l0Var.j.getValue();
        if (polyline2 == null) {
            return;
        }
        w4e0 w4e0Var4 = bVar.f;
        if (w4e0Var4 == null) {
            xm00 xm00Var2 = bVar.d;
            if (xm00Var2 != null) {
                Polyline polyline3 = ru.yandex.taxi.map.utils.a.b;
                if (polyline3 == null) {
                    polyline3 = k.g();
                    if (polyline3 != null) {
                        ru.yandex.taxi.map.utils.a.b = polyline3;
                    }
                    if (polyline != null) {
                        return;
                    } else {
                        w4e0Var2 = xm00Var2.s(polyline);
                    }
                }
                polyline = polyline3;
                if (polyline != null) {
                }
            }
            bVar.f = w4e0Var2;
            if (w4e0Var2 == null) {
                return;
            } else {
                w4e0Var = w4e0Var2;
            }
        } else {
            w4e0Var = w4e0Var4;
        }
        w4e0Var.o(polyline2);
        w4e0Var.k(bVar.g);
        bVar.b.b(w4e0Var, q6l0Var.b, q6l0Var.c, q6l0Var.d, q6l0Var.f, q6l0Var.h);
    }
}
