package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class a68 {
    public final zzp a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();

    public a68(zzp zzpVar) {
        this.a = zzpVar;
    }

    public final void a(oq oqVar) {
        oqVar.getClass();
        this.b.put(oqVar.a, Long.valueOf(this.a.b()));
    }

    public final boolean b(oq oqVar) {
        oqVar.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (((i4j) ((byb) qdcVar.C(I)).b(i4j.class)).h() ? lxe.o(oqVar.h()) != null : oqVar.g().contains(h94.c)) {
            long b = this.a.b();
            Object obj = this.b.get(oqVar.a);
            if (obj == null) {
                obj = 0L;
            }
            if (b - ((Number) obj).longValue() > 900000) {
                return true;
            }
        }
        return false;
    }
}
