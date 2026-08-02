package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class xx5 {
    public static final hmm.a c = new hmm.a("location_id");
    public static final hmm.a d = new hmm.a("location_name");
    public final cc7 a;
    public final x0q b;

    public xx5(cc7 cc7Var) {
        cc7Var.getClass();
        this.a = cc7Var;
        this.b = y0q.b(0, 1, oi3.b, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(xxq xxqVar, cg6 cg6Var) {
        sx5 sx5Var;
        int i;
        if (cg6Var instanceof sx5) {
            sx5Var = (sx5) cg6Var;
            int i2 = sx5Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sx5Var.l = i2 - Integer.MIN_VALUE;
                Object obj = sx5Var.j;
                nm6 nm6Var = nm6.a;
                i = sx5Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    wb7 c2 = ((dc7) this.a).c(xxqVar.a, "concert_location_storage");
                    tx5 tx5Var = new tx5(2, null);
                    sx5Var.l = 1;
                    if (lmm.a(c2, tx5Var, sx5Var) == nm6Var) {
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
        sx5Var = new sx5(this, cg6Var);
        Object obj2 = sx5Var.j;
        nm6 nm6Var2 = nm6.a;
        i = sx5Var.l;
        if (i != 0) {
        }
        Unit unit2 = Unit.a;
        this.b.a(unit2);
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(xxq xxqVar, cg6 cg6Var) {
        ux5 ux5Var;
        int i;
        String str;
        Long r0;
        if (cg6Var instanceof ux5) {
            ux5Var = (ux5) cg6Var;
            int i2 = ux5Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ux5Var.l = i2 - Integer.MIN_VALUE;
                Object obj = ux5Var.j;
                nm6 nm6Var = nm6.a;
                i = ux5Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = ((dc7) this.a).c(xxqVar.a, "concert_location_storage").getData();
                    ux5Var.l = 1;
                    obj = zsd.g0(data, ux5Var);
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
                hmm hmmVar = (hmm) obj;
                str = (String) hmmVar.a(c);
                if (str == null && (r0 = StringsKt.r0(10, str)) != null) {
                    long longValue = r0.longValue();
                    String str2 = (String) hmmVar.a(d);
                    if (str2 == null) {
                        return null;
                    }
                    return new ox5(new ov5(longValue, str2));
                }
            }
        }
        ux5Var = new ux5(this, cg6Var);
        Object obj2 = ux5Var.j;
        nm6 nm6Var2 = nm6.a;
        i = ux5Var.l;
        if (i != 0) {
        }
        hmm hmmVar2 = (hmm) obj2;
        str = (String) hmmVar2.a(c);
        return str == null ? null : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(xxq xxqVar, ox5 ox5Var, cg6 cg6Var) {
        vx5 vx5Var;
        int i;
        if (cg6Var instanceof vx5) {
            vx5Var = (vx5) cg6Var;
            int i2 = vx5Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vx5Var.l = i2 - Integer.MIN_VALUE;
                Object obj = vx5Var.j;
                nm6 nm6Var = nm6.a;
                i = vx5Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    wb7 c2 = ((dc7) this.a).c(xxqVar.a, "concert_location_storage");
                    wx5 wx5Var = new wx5(ox5Var, null);
                    vx5Var.l = 1;
                    if (lmm.a(c2, wx5Var, vx5Var) == nm6Var) {
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
        vx5Var = new vx5(this, cg6Var);
        Object obj2 = vx5Var.j;
        nm6 nm6Var2 = nm6.a;
        i = vx5Var.l;
        if (i != 0) {
        }
        Unit unit2 = Unit.a;
        this.b.a(unit2);
        return unit2;
    }
}
