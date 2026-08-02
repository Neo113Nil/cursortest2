package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class zti0 {
    public Set a;
    public ytd b;
    public final wz40 c;
    public iz40 d;
    public wz40 e;
    public final wz40 f;
    public final wz40 g;
    public iz40 h;
    public hz40 i;
    public ArrayList j;
    public iz40 k;

    public zti0() {
        wz40 wz40Var = new wz40(new gts[16]);
        this.c = wz40Var;
        this.d = dmm0.a();
        this.e = wz40Var;
        this.f = new wz40(new Object[16]);
        this.g = new wz40(new sls[16]);
    }

    public static final boolean f(gts gtsVar, wz40 wz40Var) {
        Object[] objArr = wz40Var.a;
        int i = wz40Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            dui0 dui0Var = ((gts) objArr[i2]).a;
            if (dui0Var instanceof hs90) {
                wz40 a = ((hs90) dui0Var).a();
                if (a.j(gtsVar) || f(gtsVar, a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.a = null;
        this.b = null;
        wz40 wz40Var = this.c;
        wz40Var.g();
        this.d.b();
        this.e = wz40Var;
        this.f.g();
        this.g.g();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final void b() {
        Set set = this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                dui0 dui0Var = (dui0) it.next();
                it.remove();
                dui0Var.d();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void c() {
        Set set = this.a;
        if (set == null) {
            return;
        }
        this.k = null;
        wz40 wz40Var = this.f;
        int i = 2;
        if (wz40Var.c != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                iz40 iz40Var = this.h;
                int i2 = wz40Var.c;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = wz40Var.a[i2];
                    try {
                        if (obj instanceof gts) {
                            dui0 dui0Var = ((gts) obj).a;
                            set.remove(dui0Var);
                            dui0Var.e();
                        }
                        if (obj instanceof qgd) {
                            if (iz40Var == null || !iz40Var.c(obj)) {
                                ((qgd) obj).onDeactivate();
                            } else {
                                ((qgd) obj).onRelease();
                            }
                        }
                    } catch (Throwable th) {
                        ytd ytdVar = this.b;
                        if (ytdVar != null) {
                            kpb1.d(th, new jhd(i, ytdVar, obj));
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
        wz40 wz40Var2 = this.c;
        if (wz40Var2.c != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.a;
                if (set2 != null) {
                    Object[] objArr = wz40Var2.a;
                    int i3 = wz40Var2.c;
                    for (int i4 = 0; i4 < i3; i4++) {
                        gts gtsVar = (gts) objArr[i4];
                        dui0 dui0Var2 = gtsVar.a;
                        set2.remove(dui0Var2);
                        try {
                            dui0Var2.b();
                        } catch (Throwable th2) {
                            ytd ytdVar2 = this.b;
                            if (ytdVar2 != null) {
                                kpb1.d(th2, new jhd(i, ytdVar2, gtsVar));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void d() {
        wz40 wz40Var = this.g;
        if (wz40Var.c != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = wz40Var.a;
                int i = wz40Var.c;
                for (int i2 = 0; i2 < i; i2++) {
                    ((sls) objArr[i2]).invoke();
                }
                wz40Var.g();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e(gts gtsVar) {
        if (!this.d.c(gtsVar)) {
            iz40 iz40Var = this.k;
            if (iz40Var == null || !iz40Var.c(gtsVar)) {
                this.f.b(gtsVar);
                return;
            }
            return;
        }
        this.d.l(gtsVar);
        if (!this.e.j(gtsVar)) {
            wz40 wz40Var = this.c;
            if (!wz40Var.j(gtsVar)) {
                f(gtsVar, wz40Var);
            }
        }
        Set set = this.a;
        if (set == null) {
            return;
        }
        set.add(gtsVar.a);
    }

    public final void g(Set set, ytd ytdVar) {
        a();
        this.a = set;
        this.b = ytdVar;
    }
}
