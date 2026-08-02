package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class v8c {
    public static final qzc i = new qzc(16, (byte) 0);
    public final bnd a;
    public double b;
    public int c;
    public boolean d;
    public ci0 e;
    public final cib f = new cib(0);
    public final LinkedHashMap g = new LinkedHashMap();
    public final bz2 h;

    public v8c(bnd bndVar, rp7 rp7Var) {
        this.a = bndVar;
        qzc qzcVar = (qzc) rp7Var.a;
        this.h = new bz2(12, new x8a((mm6) qzcVar.b, (long) 100.0d, new ceb(0, this, v8c.class, "process", "process()V", 0, 23)));
    }

    public final void a(Function1 function1) {
        function1.getClass();
        qzc qzcVar = i;
        if (qzc.c) {
            cib cibVar = this.f;
            cibVar.getClass();
            ((LinkedHashSet) cibVar.b).add(function1);
        } else {
            synchronized (((cuk) qzcVar.b)) {
                cib cibVar2 = this.f;
                cibVar2.getClass();
                ((LinkedHashSet) cibVar2.b).add(function1);
            }
        }
    }

    public final void b(lum lumVar) {
        qzc qzcVar = i;
        if (qzc.c) {
            u8c u8cVar = new u8c(this, lumVar, 0);
            u8c u8cVar2 = new u8c(this, lumVar, 1);
            this.g.put(lumVar, new t8c(u8cVar, u8cVar2));
            aub aubVar = new aub(this);
            if (((aub) lumVar.c) == null) {
                lumVar.c = aubVar;
            }
            lumVar.v(u8cVar);
            lumVar.s(u8cVar2);
            return;
        }
        synchronized (((cuk) qzcVar.b)) {
            u8c u8cVar3 = new u8c(this, lumVar, 0);
            u8c u8cVar4 = new u8c(this, lumVar, 1);
            this.g.put(lumVar, new t8c(u8cVar3, u8cVar4));
            aub aubVar2 = new aub(this);
            if (((aub) lumVar.c) == null) {
                lumVar.c = aubVar2;
            }
            lumVar.v(u8cVar3);
            lumVar.s(u8cVar4);
        }
    }
}
