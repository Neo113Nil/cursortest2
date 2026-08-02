package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class ykw {
    public static final String d = "YnisonShared:YnisonModeSelector";
    public final jsw a;
    public final jqw b;
    public final jyr c = btf.b(new dxv(21, this));

    public ykw(jsw jswVar, jqw jqwVar) {
        this.a = jswVar;
        this.b = jqwVar;
    }

    public static vkw a(iqw iqwVar, pqw pqwVar, boolean z) {
        int i = iqwVar == null ? -1 : wkw.a[iqwVar.ordinal()];
        if (i == -1) {
            if (z) {
                return new tkw(pqwVar);
            }
            return null;
        }
        if (i == 1) {
            return ukw.b;
        }
        if (i == 2) {
            return new tkw(pqwVar);
        }
        b6e.s();
        return null;
    }

    public final pjc b(sqw sqwVar) {
        if (sqwVar == null) {
            return new fs(15, ukw.b);
        }
        if (sqwVar instanceof rqw) {
            return new fs(15, new skw((rqw) sqwVar));
        }
        if (sqwVar instanceof pqw) {
            pqw pqwVar = (pqw) sqwVar;
            return pqwVar.c.d.g ? new fs(15, new rkw(pqwVar)) : zsd.b0(new qm((pjc) this.c.getValue(), new AtomicBoolean(true), this, sqwVar, 8));
        }
        b6e.s();
        return null;
    }

    public final vkw c(sqw sqwVar) {
        if (sqwVar == null) {
            return ukw.b;
        }
        if (sqwVar instanceof rqw) {
            return new skw((rqw) sqwVar);
        }
        if (!(sqwVar instanceof pqw)) {
            b6e.s();
            return null;
        }
        pqw pqwVar = (pqw) sqwVar;
        if (pqwVar.c.d.g) {
            return new rkw(pqwVar);
        }
        iqw iqwVar = (iqw) ((xdr) ((oqw) this.b).c()).getValue();
        if (this.a.e.getValue() != null) {
            iqwVar = iqw.a;
        }
        vkw a = a(iqwVar, pqwVar, true);
        return a == null ? new tkw(pqwVar) : a;
    }
}
