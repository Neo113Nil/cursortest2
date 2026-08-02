package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class pat {
    public final pzb a;
    public final List b;
    public final szb c;
    public final zzb d;
    public final dfb e;
    public final qg8 f;
    public ja8 h;
    public ja8 k;
    public ja8 l;
    public ja8 m;
    public final LinkedHashSet n;
    public final nat g = new nat(this, 0);
    public hx9 i = hx9.ON_CONDITION;
    public final WeakHashMap j = new WeakHashMap();

    public pat(pzb pzbVar, List list, szb szbVar, zzb zzbVar, dfb dfbVar, qg8 qg8Var) {
        this.a = pzbVar;
        this.b = list;
        this.c = szbVar;
        this.d = zzbVar;
        this.e = dfbVar;
        this.f = qg8Var;
        this.h = szbVar.d(zzbVar, new nat(this, 1));
        ia8 ia8Var = ja8.b0;
        this.k = ia8Var;
        this.l = ia8Var;
        this.m = ia8Var;
        this.n = new LinkedHashSet();
    }

    public static final void a(gc8 gc8Var, pat patVar) {
        RuntimeException runtimeException;
        gc8 gc8Var2;
        zzb zzbVar = patVar.d;
        if (gc8Var.getInMiddleOfBind$div_release()) {
            patVar.m.close();
            oat oatVar = new oat(gc8Var, patVar);
            patVar.m = new qf7(4, gc8Var, oatVar);
            gc8Var.r(oatVar);
            return;
        }
        WeakHashMap weakHashMap = patVar.j;
        pzb pzbVar = patVar.a;
        String str = pzbVar.h;
        try {
            Boolean bool = (Boolean) pzbVar.a(zzbVar);
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = (Boolean) weakHashMap.get(gc8Var);
            if (bool2 == null) {
                bool2 = Boolean.FALSE;
            }
            boolean booleanValue2 = bool2.booleanValue();
            weakHashMap.put(gc8Var, bool);
            if (booleanValue) {
                if (patVar.i == hx9.ON_CONDITION && booleanValue2) {
                    return;
                }
                qg8 qg8Var = patVar.f;
                List<bd8> list = patVar.b;
                qg8Var.getClass();
                for (bd8 bd8Var : list) {
                    if (((Boolean) bd8Var.b.a(zzbVar)).booleanValue()) {
                        qg8Var.b.f(gc8Var, bd8Var);
                        gc8Var2 = gc8Var;
                        qg8Var.b(gc8Var2, zzbVar, bd8Var, "trigger", gc8Var.getActionHandler());
                    } else {
                        gc8Var2 = gc8Var;
                    }
                    gc8Var = gc8Var2;
                }
            }
        } catch (Exception e) {
            if (e instanceof ClassCastException) {
                runtimeException = new RuntimeException(hrg.q("Condition evaluated in non-boolean result! (expression: '", str, "')"), e);
            } else {
                if (!(e instanceof khb)) {
                    throw e;
                }
                runtimeException = new RuntimeException(hrg.q("Condition evaluation failed! (expression: '", str, "')"), e);
            }
            patVar.e.d(runtimeException);
        }
    }

    public final void b() {
        boolean isEmpty = this.n.isEmpty();
        ja8 ja8Var = this.h;
        if (isEmpty) {
            ja8Var.close();
            this.k.close();
            this.l.close();
            this.m.close();
            return;
        }
        ja8Var.close();
        nat natVar = this.g;
        pzb pzbVar = this.a;
        zzb zzbVar = this.d;
        this.k = pzbVar.c(zzbVar, natVar);
        this.l = zzbVar.d.j(pzbVar.f(zzbVar), new nat(this, 2));
        this.h = this.c.d(zzbVar, new nat(this, 3));
        c();
    }

    public final void c() {
        for (gc8 gc8Var : this.n) {
            d51 d51Var = d51.l;
            synchronized (d51Var) {
            }
            if (qht.a.a()) {
                a(gc8Var, this);
            } else {
                g23 d = gc8Var.getViewComponent$div_release().d();
                f23 a = d.a();
                try {
                    d51Var.p(new zg(d, a, this, gc8Var, 18));
                } catch (Throwable th) {
                    g23.b(a);
                    throw th;
                }
            }
        }
    }
}
