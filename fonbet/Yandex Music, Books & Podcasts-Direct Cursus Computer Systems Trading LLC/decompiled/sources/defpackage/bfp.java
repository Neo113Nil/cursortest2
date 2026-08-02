package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class bfp {
    public static final apo l;
    public boolean a;
    public final ArrayList b = new ArrayList();
    public final yoi c;
    public final AtomicLong d;
    public fep e;
    public lh0 f;
    public vep g;
    public dep h;
    public fep i;
    public fep j;
    public final x6k k;

    static {
        epo epoVar = epo.x;
        dpo dpoVar = dpo.L;
        apo apoVar = bpo.a;
        l = new apo(0, epoVar, dpoVar);
    }

    public bfp(long j) {
        yoi yoiVar = yug.a;
        this.c = new yoi();
        this.d = new AtomicLong(j);
        yoi yoiVar2 = yug.a;
        yoiVar2.getClass();
        this.k = szf.g0(yoiVar2);
    }

    public final yoi a() {
        return (yoi) this.k.getValue();
    }

    public final boolean b(wof wofVar, long j, long j2, zdp zdpVar, boolean z) {
        vep vepVar = this.g;
        if (vepVar == null) {
            return true;
        }
        xep xepVar = vepVar.r;
        long a = xep.a(xepVar, wofVar, j);
        long a2 = xep.a(xepVar, wofVar, j2);
        xepVar.l(z);
        return xepVar.p(a, a2, false, zdpVar);
    }

    public final ArrayList c(wof wofVar) {
        boolean z = this.a;
        ArrayList arrayList = this.b;
        if (!z) {
            y75.s(arrayList, new ze0(5, new y5(29, wofVar)));
            this.a = true;
        }
        return arrayList;
    }

    public final void d(ugi ugiVar) {
        long j = ugiVar.a;
        yoi yoiVar = this.c;
        if (yoiVar.b(j)) {
            this.b.remove(ugiVar);
            yoiVar.g(j);
            fep fepVar = this.j;
            if (fepVar != null) {
                fepVar.invoke(Long.valueOf(j));
            }
        }
    }
}
