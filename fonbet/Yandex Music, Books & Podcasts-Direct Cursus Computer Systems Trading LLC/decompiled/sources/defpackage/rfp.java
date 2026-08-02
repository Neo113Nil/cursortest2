package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class rfp {
    public final jfp a;
    public final toi b;

    public rfp(qfp qfpVar, upe upeVar) {
        this.a = qfpVar.d;
        this.b = new toi(qfp.h(4, qfpVar).size());
        List h = qfp.h(4, qfpVar);
        int size = h.size();
        for (int i = 0; i < size; i++) {
            qfp qfpVar2 = (qfp) h.get(i);
            if (upeVar.a(qfpVar2.g)) {
                this.b.a(qfpVar2.g);
            }
        }
    }
}
