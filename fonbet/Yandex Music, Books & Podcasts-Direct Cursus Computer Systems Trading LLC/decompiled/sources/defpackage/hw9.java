package defpackage;

import android.content.Context;
import com.yandex.div.core.view2.animations.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;

/* loaded from: classes3.dex */
public final class hw9 {
    public final Context a;
    public final z0a b;

    public hw9(Context context, z0a z0aVar) {
        this.a = context;
        this.b = z0aVar;
    }

    public static b8t d(sq8 sq8Var, xzb xzbVar) {
        if (sq8Var instanceof rq8) {
            n8t n8tVar = new n8t();
            Iterator it = ((rq8) sq8Var).b.a.iterator();
            while (it.hasNext()) {
                n8tVar.W(d((sq8) it.next(), xzbVar));
            }
            return n8tVar;
        }
        if (!(sq8Var instanceof qq8)) {
            b6e.s();
            return null;
        }
        qb4 qb4Var = new qb4();
        fq8 fq8Var = ((qq8) sq8Var).b;
        qb4Var.c = ((Number) fq8Var.a.a(xzbVar)).longValue();
        qb4Var.b = ((Number) fq8Var.c.a(xzbVar)).longValue();
        qb4Var.d = vq1.Q((um8) fq8Var.b.a(xzbVar));
        return qb4Var;
    }

    public final void a(n8t n8tVar, f8t f8tVar) {
        b8t d;
        int a = this.b.a(f8tVar.a);
        for (gw9 gw9Var : f8tVar.b) {
            xzb xzbVar = f8tVar.c;
            if (gw9Var instanceof ew9) {
                ew9 ew9Var = (ew9) gw9Var;
                d = c(ew9Var.a, ew9Var.b, xzbVar);
            } else {
                if (!(gw9Var instanceof fw9)) {
                    b6e.s();
                    return;
                }
                d = d(((fw9) gw9Var).a, xzbVar);
            }
            d.d(a);
            n8tVar.W(d);
        }
    }

    public final n8t b(Sequence sequence, gx9 gx9Var) {
        n8t n8tVar = new n8t();
        n8tVar.Z(0);
        if (sequence != null) {
            Iterator it = sequence.iterator();
            while (it.hasNext()) {
                a(n8tVar, (f8t) it.next());
            }
        }
        if (gx9Var != null) {
            Iterator it2 = gx9Var.iterator();
            while (true) {
                x6 x6Var = (x6) it2;
                if (!x6Var.hasNext()) {
                    break;
                }
                a(n8tVar, (f8t) x6Var.next());
            }
        }
        return n8tVar;
    }

    public final b8t c(un8 un8Var, int i, xzb xzbVar) {
        if (un8Var instanceof sn8) {
            n8t n8tVar = new n8t();
            List list = ((sn8) un8Var).b.a;
            ArrayList arrayList = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c((un8) it.next(), i, xzbVar));
            }
            Iterator it2 = CollectionsKt.o0(arrayList, new dl4(22)).iterator();
            while (it2.hasNext()) {
                n8tVar.W((b8t) it2.next());
            }
            return n8tVar;
        }
        if (un8Var instanceof qn8) {
            zx8 zx8Var = ((qn8) un8Var).b;
            x3c x3cVar = new x3c((float) ((Number) zx8Var.a.a(xzbVar)).doubleValue());
            x3cVar.a0(i);
            x3cVar.c = ((Number) zx8Var.b.a(xzbVar)).longValue();
            x3cVar.b = ((Number) zx8Var.d.a(xzbVar)).longValue();
            x3cVar.d = vq1.Q((um8) zx8Var.c.a(xzbVar));
            return x3cVar;
        }
        if (un8Var instanceof rn8) {
            xh9 xh9Var = ((rn8) un8Var).b;
            pso psoVar = new pso((float) ((Number) xh9Var.e.a(xzbVar)).doubleValue(), (float) ((Number) xh9Var.c.a(xzbVar)).doubleValue(), (float) ((Number) xh9Var.d.a(xzbVar)).doubleValue());
            psoVar.a0(i);
            psoVar.c = ((Number) xh9Var.a.a(xzbVar)).longValue();
            psoVar.b = ((Number) xh9Var.f.a(xzbVar)).longValue();
            psoVar.d = vq1.Q((um8) xh9Var.b.a(xzbVar));
            return psoVar;
        }
        if (!(un8Var instanceof tn8)) {
            b6e.s();
            return null;
        }
        qk9 qk9Var = ((tn8) un8Var).b;
        ow8 ow8Var = qk9Var.a;
        int f0 = ow8Var != null ? bg3.f0(ow8Var, this.a.getResources().getDisplayMetrics(), xzbVar) : -1;
        int ordinal = ((pk9) qk9Var.c.a(xzbVar)).ordinal();
        int i2 = 3;
        if (ordinal != 0) {
            if (ordinal == 1) {
                i2 = 48;
            } else if (ordinal == 2) {
                i2 = 5;
            } else {
                if (ordinal != 3) {
                    b6e.s();
                    return null;
                }
                i2 = 80;
            }
        }
        a aVar = new a(f0, i2);
        aVar.a0(i);
        aVar.c = ((Number) qk9Var.b.a(xzbVar)).longValue();
        aVar.b = ((Number) qk9Var.e.a(xzbVar)).longValue();
        aVar.d = vq1.Q((um8) qk9Var.d.a(xzbVar));
        return aVar;
    }
}
