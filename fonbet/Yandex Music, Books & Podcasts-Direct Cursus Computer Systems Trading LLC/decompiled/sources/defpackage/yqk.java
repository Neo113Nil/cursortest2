package defpackage;

import defpackage.hmm;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class yqk {
    public static final hmm.a b = new hmm.a("need_reset_tracks_revision");
    public static final hmm.a c = new hmm.a("last_success_ts");
    public static final hmm.a d = new hmm.a("last_partial_update_ts");
    public static final hmm.a e = new hmm.a("last_full_update_ts");
    public final wb7 a;

    public yqk(wb7 wb7Var) {
        this.a = wb7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        lqk lqkVar;
        int i;
        if (cg6Var instanceof lqk) {
            lqkVar = (lqk) cg6Var;
            int i2 = lqkVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lqkVar.l = i2 - Integer.MIN_VALUE;
                Object obj = lqkVar.j;
                nm6 nm6Var = nm6.a;
                i = lqkVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = this.a.getData();
                    lqkVar.l = 1;
                    obj = zsd.g0(data, lqkVar);
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
                return ((hmm) obj).a(e);
            }
        }
        lqkVar = new lqk(this, cg6Var);
        Object obj2 = lqkVar.j;
        nm6 nm6Var2 = nm6.a;
        i = lqkVar.l;
        if (i != 0) {
        }
        return ((hmm) obj2).a(e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        mqk mqkVar;
        int i;
        if (cg6Var instanceof mqk) {
            mqkVar = (mqk) cg6Var;
            int i2 = mqkVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mqkVar.l = i2 - Integer.MIN_VALUE;
                Object obj = mqkVar.j;
                nm6 nm6Var = nm6.a;
                i = mqkVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = this.a.getData();
                    mqkVar.l = 1;
                    obj = zsd.g0(data, mqkVar);
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
                return ((hmm) obj).a(d);
            }
        }
        mqkVar = new mqk(this, cg6Var);
        Object obj2 = mqkVar.j;
        nm6 nm6Var2 = nm6.a;
        i = mqkVar.l;
        if (i != 0) {
        }
        return ((hmm) obj2).a(d);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var) {
        nqk nqkVar;
        int i;
        if (cg6Var instanceof nqk) {
            nqkVar = (nqk) cg6Var;
            int i2 = nqkVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nqkVar.l = i2 - Integer.MIN_VALUE;
                Object obj = nqkVar.j;
                nm6 nm6Var = nm6.a;
                i = nqkVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = this.a.getData();
                    nqkVar.l = 1;
                    obj = zsd.g0(data, nqkVar);
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
                return ((hmm) obj).a(c);
            }
        }
        nqkVar = new nqk(this, cg6Var);
        Object obj2 = nqkVar.j;
        nm6 nm6Var2 = nm6.a;
        i = nqkVar.l;
        if (i != 0) {
        }
        return ((hmm) obj2).a(c);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(n43 n43Var, cg6 cg6Var) {
        oqk oqkVar;
        int i;
        if (cg6Var instanceof oqk) {
            oqkVar = (oqk) cg6Var;
            int i2 = oqkVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oqkVar.m = i2 - Integer.MIN_VALUE;
                Object obj = oqkVar.k;
                nm6 nm6Var = nm6.a;
                i = oqkVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = this.a.getData();
                    oqkVar.j = n43Var;
                    oqkVar.m = 1;
                    obj = zsd.g0(data, oqkVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n43Var = oqkVar.j;
                    qgg.h0(obj);
                }
                hmm.a aVar = new hmm.a("block_all_values_".concat(n43Var.getKey()));
                lpi lpiVar = (lpi) ((hmm) obj);
                lpiVar.getClass();
                return lpiVar.a.get(aVar);
            }
        }
        oqkVar = new oqk(this, cg6Var);
        Object obj2 = oqkVar.k;
        nm6 nm6Var2 = nm6.a;
        i = oqkVar.m;
        if (i != 0) {
        }
        hmm.a aVar2 = new hmm.a("block_all_values_".concat(n43Var.getKey()));
        lpi lpiVar2 = (lpi) ((hmm) obj2);
        lpiVar2.getClass();
        return lpiVar2.a.get(aVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(nvl nvlVar, cg6 cg6Var) {
        pqk pqkVar;
        int i;
        if (cg6Var instanceof pqk) {
            pqkVar = (pqk) cg6Var;
            int i2 = pqkVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pqkVar.m = i2 - Integer.MIN_VALUE;
                Object obj = pqkVar.k;
                nm6 nm6Var = nm6.a;
                i = pqkVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = this.a.getData();
                    pqkVar.j = nvlVar;
                    pqkVar.m = 1;
                    obj = zsd.g0(data, pqkVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nvlVar = pqkVar.j;
                    qgg.h0(obj);
                }
                hmm.a aVar = new hmm.a("playlist_all_values_".concat(nvlVar.d()));
                lpi lpiVar = (lpi) ((hmm) obj);
                lpiVar.getClass();
                return lpiVar.a.get(aVar);
            }
        }
        pqkVar = new pqk(this, cg6Var);
        Object obj2 = pqkVar.k;
        nm6 nm6Var2 = nm6.a;
        i = pqkVar.m;
        if (i != 0) {
        }
        hmm.a aVar2 = new hmm.a("playlist_all_values_".concat(nvlVar.d()));
        lpi lpiVar2 = (lpi) ((hmm) obj2);
        lpiVar2.getClass();
        return lpiVar2.a.get(aVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(n43 n43Var, cg6 cg6Var) {
        qqk qqkVar;
        int i;
        if (cg6Var instanceof qqk) {
            qqkVar = (qqk) cg6Var;
            int i2 = qqkVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qqkVar.m = i2 - Integer.MIN_VALUE;
                Object obj = qqkVar.k;
                nm6 nm6Var = nm6.a;
                i = qqkVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = this.a.getData();
                    qqkVar.j = n43Var;
                    qqkVar.m = 1;
                    obj = zsd.g0(data, qqkVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n43Var = qqkVar.j;
                    qgg.h0(obj);
                }
                hmm.a aVar = new hmm.a("block_revision_".concat(n43Var.getKey()));
                lpi lpiVar = (lpi) ((hmm) obj);
                lpiVar.getClass();
                Integer num = (Integer) lpiVar.a.get(aVar);
                return new Integer(num == null ? num.intValue() : -1);
            }
        }
        qqkVar = new qqk(this, cg6Var);
        Object obj2 = qqkVar.k;
        nm6 nm6Var2 = nm6.a;
        i = qqkVar.m;
        if (i != 0) {
        }
        hmm.a aVar2 = new hmm.a("block_revision_".concat(n43Var.getKey()));
        lpi lpiVar2 = (lpi) ((hmm) obj2);
        lpiVar2.getClass();
        Integer num2 = (Integer) lpiVar2.a.get(aVar2);
        return new Integer(num2 == null ? num2.intValue() : -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(cg6 cg6Var) {
        rqk rqkVar;
        int i;
        if (cg6Var instanceof rqk) {
            rqkVar = (rqk) cg6Var;
            int i2 = rqkVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rqkVar.l = i2 - Integer.MIN_VALUE;
                Object obj = rqkVar.j;
                nm6 nm6Var = nm6.a;
                i = rqkVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = this.a.getData();
                    rqkVar.l = 1;
                    obj = zsd.g0(data, rqkVar);
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
                Boolean bool = (Boolean) ((hmm) obj).a(b);
                return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
            }
        }
        rqkVar = new rqk(this, cg6Var);
        Object obj2 = rqkVar.j;
        nm6 nm6Var2 = nm6.a;
        i = rqkVar.l;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) ((hmm) obj2).a(b);
        return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : true);
    }

    public final Object h(n43 n43Var, boolean z, gok gokVar) {
        Object a = lmm.a(this.a, new vqk(n43Var, z, null), gokVar);
        return a == nm6.a ? a : Unit.a;
    }

    public final Object i(n43 n43Var, int i, nrk nrkVar) {
        Object a = lmm.a(this.a, new xqk(n43Var, i, null), nrkVar);
        return a == nm6.a ? a : Unit.a;
    }
}
