package defpackage;

import defpackage.hmm;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class cup implements ytp {
    public static final hmm.a c = new hmm.a("wave_shake_enabled");
    public final cc7 a;
    public final x0q b = y0q.b(0, 1, oi3.b, 1);

    public cup(cc7 cc7Var) {
        this.a = cc7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        ztp ztpVar;
        int i;
        boolean z;
        hmm hmmVar;
        Boolean bool;
        if (cg6Var instanceof ztp) {
            ztpVar = (ztp) cg6Var;
            int i2 = ztpVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ztpVar.l = i2 - Integer.MIN_VALUE;
                Object obj = ztpVar.j;
                nm6 nm6Var = nm6.a;
                i = ztpVar.l;
                z = true;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = ((dc7) this.a).c(str, "shake_settings").getData();
                    ztpVar.l = 1;
                    obj = zsd.i0(data, ztpVar);
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
                hmmVar = (hmm) obj;
                if (hmmVar != null && (bool = (Boolean) hmmVar.a(c)) != null) {
                    z = bool.booleanValue();
                }
                return Boolean.valueOf(z);
            }
        }
        ztpVar = new ztp(this, cg6Var);
        Object obj2 = ztpVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ztpVar.l;
        z = true;
        if (i != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
            z = bool.booleanValue();
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, boolean z, cg6 cg6Var) {
        aup aupVar;
        int i;
        if (cg6Var instanceof aup) {
            aupVar = (aup) cg6Var;
            int i2 = aupVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aupVar.l = i2 - Integer.MIN_VALUE;
                Object obj = aupVar.j;
                nm6 nm6Var = nm6.a;
                i = aupVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    wb7 c2 = ((dc7) this.a).c(str, "shake_settings");
                    bup bupVar = new bup(z, null);
                    aupVar.l = 1;
                    if (lmm.a(c2, bupVar, aupVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Unit unit = Unit.a;
                this.b.a(unit);
                return unit;
            }
        }
        aupVar = new aup(this, cg6Var);
        Object obj2 = aupVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aupVar.l;
        if (i != 0) {
        }
        Unit unit2 = Unit.a;
        this.b.a(unit2);
        return unit2;
    }
}
