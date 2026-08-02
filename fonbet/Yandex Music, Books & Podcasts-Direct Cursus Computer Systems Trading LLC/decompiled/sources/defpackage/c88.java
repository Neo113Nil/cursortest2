package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class c88 {
    public final h88 a;
    public final tf6 b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final fkn d;
    public final jyr e;

    public c88(h88 h88Var, tf6 tf6Var, raa raaVar, f7l f7lVar, jyr jyrVar, jyr jyrVar2) {
        this.a = h88Var;
        this.b = tf6Var;
        ub7 ub7Var = new ub7(3, new d64(frc.a.g, 24), this);
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.d = lg3.u0(new u21(10, ub7Var, new z78(new bca(((r78) ((byb) qdcVar.C(I)).b(r78.class)).e, 18), 0), new u78(3, null)), tf6Var, Boolean.FALSE);
        this.e = btf.b(new aw5(17, jyrVar, jyrVar2));
        bdt I2 = hag.I(byb.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        ox6.B(zsd.M0(new d64(((r78) ((byb) qdcVar2.C(I2)).b(r78.class)).e, 25), new l1((Continuation) null, raaVar, 19)), tf6Var, new s78(this, 0));
        ox6.B(ox6.S(f7lVar.c), tf6Var, new s78(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c88 c88Var, cg6 cg6Var) {
        t78 t78Var;
        int i;
        if (cg6Var instanceof t78) {
            t78Var = (t78) cg6Var;
            int i2 = t78Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t78Var.l = i2 - Integer.MIN_VALUE;
                Object obj = t78Var.j;
                nm6 nm6Var = nm6.a;
                i = t78Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = ((wb7) c88Var.e.getValue()).getData();
                    t78Var.l = 1;
                    obj = zsd.g0(data, t78Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Long l = (Long) ((hmm) obj).a(d88.a);
                return new Long(l == null ? l.longValue() : 0L);
            }
        }
        t78Var = new t78(c88Var, cg6Var);
        Object obj2 = t78Var.j;
        nm6 nm6Var2 = nm6.a;
        i = t78Var.l;
        if (i != 0) {
        }
        Long l2 = (Long) ((hmm) obj2).a(d88.a);
        return new Long(l2 == null ? l2.longValue() : 0L);
    }

    public static final void b(c88 c88Var, f88 f88Var) {
        if (c88Var.c.getAndSet(true)) {
            return;
        }
        long j = 1024;
        i88.b.e().c(new y70("INTERNAL_DISK_SPACE", uah.e(new Pair("all_mb", Long.valueOf((f88Var.a / j) / 1024)), new Pair("available_mb", Long.valueOf((f88Var.b / j) / 1024)))), "storage");
    }
}
