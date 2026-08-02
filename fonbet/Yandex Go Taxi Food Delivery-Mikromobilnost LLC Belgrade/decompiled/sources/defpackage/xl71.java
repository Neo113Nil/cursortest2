package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import kotlin.collections.builders.MapBuilder;
import yads.hm2;
import yads.s93;
import yads.yw2;

/* loaded from: classes7.dex */
public final class xl71 implements yx71 {
    public final w040 a;
    public final z871 b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;

    public xl71(w040 w040Var, z871 z871Var) {
        this.a = w040Var;
        this.b = z871Var;
    }

    @Override // defpackage.yx71
    public final void a(yw2 yw2Var, a581 a581Var) {
        int i = this.d + 1;
        this.d = i;
        if (i == 20) {
            this.e = true;
            hm2 hm2Var = this.b.c;
            w040 w040Var = this.a;
            w040Var.c(hm2Var, w040Var.b(a581Var));
        }
    }

    @Override // defpackage.yx71
    public final void b(yw2 yw2Var, f881 f881Var) {
        if (this.c) {
            return;
        }
        this.c = true;
        MapBuilder e = e(f881Var);
        hm2 hm2Var = this.b.b;
        w040 w040Var = this.a;
        hn71 a = w040Var.a();
        ((Map) a.b).putAll(e);
        w040Var.c(hm2Var, a);
    }

    @Override // defpackage.yx71
    public final void c(d881 d881Var) {
        this.a.a = d881Var;
    }

    @Override // defpackage.yx71
    public final void d(yw2 yw2Var, ArrayList arrayList, f881 f881Var) {
        if (this.f) {
            return;
        }
        this.f = true;
        MapBuilder e = e(f881Var);
        hm2 hm2Var = this.b.a;
        w040 w040Var = this.a;
        hn71 a = w040Var.a();
        ((Map) a.b).putAll(e);
        w040Var.c(hm2Var, a);
    }

    public final MapBuilder e(f881 f881Var) {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("failure_tracked", Boolean.valueOf(this.e));
        if (!f881Var.a.isEmpty()) {
            List list = f881Var.a;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((s93) it.next()).b);
            }
            mapBuilder.put("warnings", arrayList);
        }
        return mapBuilder.j();
    }

    @Override // defpackage.yx71
    public final void invalidate() {
        this.c = false;
        this.d = 0;
        this.e = false;
        this.f = false;
    }

    @Override // defpackage.yx71
    public final void a(List list) {
        a881 a881Var = (a881) a.R(list);
        if (a881Var == null) {
            return;
        }
        hm2 hm2Var = this.b.d;
        a581 a581Var = a881Var.b;
        w040 w040Var = this.a;
        w040Var.c(hm2Var, w040Var.b(a581Var));
    }
}
