package defpackage;

import defpackage.hmm;

/* loaded from: classes3.dex */
public final class yza {
    public static final hmm.a c = new hmm.a("already_has_tv");
    public static final hmm.a d = new hmm.a("should_not_show_dialog");
    public static final hmm.a e = new hmm.a("touch_time");
    public static final hmm.a f = new hmm.a("chromecast_touch_time");
    public final cc7 a;
    public final frt b;

    public yza(cc7 cc7Var, frt frtVar) {
        this.a = cc7Var;
        this.b = frtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        qza qzaVar;
        int i;
        hmm hmmVar;
        if (cg6Var instanceof qza) {
            qzaVar = (qza) cg6Var;
            int i2 = qzaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qzaVar.l = i2 - Integer.MIN_VALUE;
                Object obj = qzaVar.j;
                nm6 nm6Var = nm6.a;
                i = qzaVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = b().getData();
                    qzaVar.l = 1;
                    obj = zsd.i0(data, qzaVar);
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
                if (hmmVar == null) {
                    return (Long) hmmVar.a(f);
                }
                return null;
            }
        }
        qzaVar = new qza(this, cg6Var);
        Object obj2 = qzaVar.j;
        nm6 nm6Var2 = nm6.a;
        i = qzaVar.l;
        if (i != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar == null) {
        }
    }

    public final wb7 b() {
        return ((dc7) this.a).c(this.b.c().a, "easy_login_shower");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var) {
        rza rzaVar;
        int i;
        Boolean bool;
        if (cg6Var instanceof rza) {
            rzaVar = (rza) cg6Var;
            int i2 = rzaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rzaVar.l = i2 - Integer.MIN_VALUE;
                Object obj = rzaVar.j;
                nm6 nm6Var = nm6.a;
                i = rzaVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = b().getData();
                    rzaVar.l = 1;
                    obj = zsd.i0(data, rzaVar);
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
                return Boolean.valueOf((hmmVar != null || (bool = (Boolean) hmmVar.a(c)) == null) ? false : bool.booleanValue());
            }
        }
        rzaVar = new rza(this, cg6Var);
        Object obj2 = rzaVar.j;
        nm6 nm6Var2 = nm6.a;
        i = rzaVar.l;
        if (i != 0) {
        }
        hmm hmmVar2 = (hmm) obj2;
        return Boolean.valueOf((hmmVar2 != null || (bool = (Boolean) hmmVar2.a(c)) == null) ? false : bool.booleanValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(cg6 cg6Var) {
        wza wzaVar;
        int i;
        Boolean bool;
        if (cg6Var instanceof wza) {
            wzaVar = (wza) cg6Var;
            int i2 = wzaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wzaVar.l = i2 - Integer.MIN_VALUE;
                Object obj = wzaVar.j;
                nm6 nm6Var = nm6.a;
                i = wzaVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = b().getData();
                    wzaVar.l = 1;
                    obj = zsd.i0(data, wzaVar);
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
                return Boolean.valueOf((hmmVar != null || (bool = (Boolean) hmmVar.a(d)) == null) ? false : bool.booleanValue());
            }
        }
        wzaVar = new wza(this, cg6Var);
        Object obj2 = wzaVar.j;
        nm6 nm6Var2 = nm6.a;
        i = wzaVar.l;
        if (i != 0) {
        }
        hmm hmmVar2 = (hmm) obj2;
        return Boolean.valueOf((hmmVar2 != null || (bool = (Boolean) hmmVar2.a(d)) == null) ? false : bool.booleanValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cg6 cg6Var) {
        xza xzaVar;
        int i;
        hmm hmmVar;
        if (cg6Var instanceof xza) {
            xzaVar = (xza) cg6Var;
            int i2 = xzaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xzaVar.l = i2 - Integer.MIN_VALUE;
                Object obj = xzaVar.j;
                nm6 nm6Var = nm6.a;
                i = xzaVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = b().getData();
                    xzaVar.l = 1;
                    obj = zsd.i0(data, xzaVar);
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
                if (hmmVar == null) {
                    return (Long) hmmVar.a(e);
                }
                return null;
            }
        }
        xzaVar = new xza(this, cg6Var);
        Object obj2 = xzaVar.j;
        nm6 nm6Var2 = nm6.a;
        i = xzaVar.l;
        if (i != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar == null) {
        }
    }
}
