package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.tariffs.model.b;

/* loaded from: classes5.dex */
public final class zof {
    public final gsi a;
    public final wiq0 b;
    public final g580 c;
    public final k3i d;

    public zof(gsi gsiVar, wiq0 wiq0Var, g580 g580Var, k3i k3iVar) {
        this.a = gsiVar;
        this.b = wiq0Var;
        this.c = g580Var;
        this.d = k3iVar;
    }

    public final boolean a() {
        pex0 pex0Var;
        pex0 pex0Var2;
        nuq0 nuq0Var;
        nuq0 nuq0Var2;
        k kVar = (k) this.b;
        fnx0 n = kVar.n();
        if (n != null && (pex0Var = n.c) != null) {
            this.d.getClass();
            if (k3i.a(pex0Var)) {
                return !r3.b();
            }
            if (b.i(pex0Var)) {
                ati atiVar = pex0Var.Z;
                if ((atiVar == null || (nuq0Var2 = atiVar.d) == null || !nuq0Var2.a) && !b.h(pex0Var) && (pex0Var2 = pex0Var.M0) != null) {
                    ArrayList b = b.b(pex0Var2);
                    if (!b.isEmpty()) {
                        Iterator it = b.iterator();
                        while (it.hasNext()) {
                            ati atiVar2 = ((nu1) it.next()).a.Z;
                            if ((atiVar2 == null || (nuq0Var = atiVar2.d) == null) ? false : nuq0Var.a) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                String str = this.a.b().e.a;
                ArrayList arrayList = ((x8) this.c).d;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (jl40.l(((b580) it2.next()).a, str)) {
                            break;
                        }
                    }
                }
                pex0 m = kVar.m();
                Object obj = null;
                List f = m != null ? m.f() : null;
                if (f != null) {
                    Iterator it3 = f.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next = it3.next();
                        if (jl40.l(((lmw0) next).getName(), str)) {
                            obj = next;
                            break;
                        }
                    }
                    obj = (lmw0) obj;
                }
                if (obj != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
