package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class yjd {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public boolean f;
    public final mm6 e = hld.r(new yiq(), dm6.b());
    public final xdr g = ydr.a(zid.a);
    public final xdr h = ydr.a(hjd.a);
    public final xdr i = ydr.a(ojd.a);

    public yjd(jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4) {
        this.a = jyrVar;
        this.b = jyrVar2;
        this.c = jyrVar3;
        this.d = jyrVar4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(yjd yjdVar, x66 x66Var, yxc yxcVar, boolean z, Continuation continuation) {
        qjd qjdVar;
        int i;
        String str;
        yjdVar.getClass();
        if (continuation instanceof qjd) {
            qjdVar = (qjd) continuation;
            int i2 = qjdVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qjdVar.o = i2 - Integer.MIN_VALUE;
                Object obj = qjdVar.m;
                Object obj2 = nm6.a;
                i = qjdVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    if (yxcVar != null) {
                        fos fosVar = (fos) yjdVar.d.getValue();
                        qjdVar.j = x66Var;
                        qjdVar.k = yxcVar;
                        qjdVar.l = z;
                        qjdVar.o = 1;
                        obj = yjdVar.e(yxcVar, fosVar, qjdVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return new yid("User with subscription required for glagol connection");
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = qjdVar.l;
                yxcVar = qjdVar.k;
                x66Var = qjdVar.j;
                qgg.h0(obj);
                str = (String) obj;
                if (str != null) {
                    return !yjdVar.d(x66Var) ? new yid("WiFi transport required for glagol connection") : z ? new yid("Device registration required for glagol connection") : new ajd(new dkd(yxcVar.a.a, str));
                }
                return new yid("User with subscription required for glagol connection");
            }
        }
        qjdVar = new qjd(yjdVar, continuation);
        Object obj3 = qjdVar.m;
        Object obj22 = nm6.a;
        i = qjdVar.o;
        if (i != 0) {
        }
        str = (String) obj3;
        if (str != null) {
        }
        return new yid("User with subscription required for glagol connection");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(yjd yjdVar, drc drcVar, x66 x66Var, yxc yxcVar, boolean z, Continuation continuation) {
        rjd rjdVar;
        int i;
        String str;
        yjdVar.getClass();
        if (continuation instanceof rjd) {
            rjdVar = (rjd) continuation;
            int i2 = rjdVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rjdVar.p = i2 - Integer.MIN_VALUE;
                Object obj = rjdVar.n;
                Object obj2 = nm6.a;
                i = rjdVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    if (yxcVar != null) {
                        fos fosVar = (fos) yjdVar.d.getValue();
                        rjdVar.j = drcVar;
                        rjdVar.k = x66Var;
                        rjdVar.l = yxcVar;
                        rjdVar.m = z;
                        rjdVar.p = 1;
                        obj = yjdVar.e(yxcVar, fosVar, rjdVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return new djd("User with subscription required for glagol scanner");
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = rjdVar.m;
                yxcVar = rjdVar.l;
                x66Var = rjdVar.k;
                drcVar = rjdVar.j;
                qgg.h0(obj);
                str = (String) obj;
                if (str != null) {
                    if (!yjdVar.d(x66Var)) {
                        return new ejd();
                    }
                    if (z) {
                        return new djd("Device registration required for glagol scanner");
                    }
                    dkd dkdVar = new dkd(yxcVar.a.a, str);
                    return drcVar.a ? new gjd(dkdVar) : new cjd(dkdVar);
                }
                return new djd("User with subscription required for glagol scanner");
            }
        }
        rjdVar = new rjd(yjdVar, continuation);
        Object obj3 = rjdVar.n;
        Object obj22 = nm6.a;
        i = rjdVar.p;
        if (i != 0) {
        }
        str = (String) obj3;
        if (str != null) {
        }
        return new djd("User with subscription required for glagol scanner");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(yjd yjdVar, drc drcVar, x66 x66Var, yxc yxcVar, boolean z, Continuation continuation) {
        sjd sjdVar;
        int i;
        String str;
        yjdVar.getClass();
        if (continuation instanceof sjd) {
            sjdVar = (sjd) continuation;
            int i2 = sjdVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sjdVar.p = i2 - Integer.MIN_VALUE;
                Object obj = sjdVar.n;
                Object obj2 = nm6.a;
                i = sjdVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    if (yxcVar != null) {
                        fos fosVar = (fos) yjdVar.d.getValue();
                        sjdVar.j = drcVar;
                        sjdVar.k = x66Var;
                        sjdVar.l = yxcVar;
                        sjdVar.m = z;
                        sjdVar.p = 1;
                        obj = yjdVar.e(yxcVar, fosVar, sjdVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return new ljd("User with subscription required for smart home");
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = sjdVar.m;
                yxcVar = sjdVar.l;
                x66Var = sjdVar.k;
                drcVar = sjdVar.j;
                qgg.h0(obj);
                str = (String) obj;
                if (str != null) {
                    if (x66Var.a) {
                        int ordinal = ((zzi) ((z66) yjdVar.b.getValue()).d().getValue()).b.ordinal();
                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                            if (z) {
                                return new ljd("Device registration required for smart home");
                            }
                            dkd dkdVar = new dkd(yxcVar.a.a, str);
                            return drcVar.a ? new njd(dkdVar) : new jjd(dkdVar);
                        }
                        if (ordinal != 3) {
                            b6e.s();
                            return null;
                        }
                    }
                    return new kjd();
                }
                return new ljd("User with subscription required for smart home");
            }
        }
        sjdVar = new sjd(yjdVar, continuation);
        Object obj3 = sjdVar.n;
        Object obj22 = nm6.a;
        i = sjdVar.p;
        if (i != 0) {
        }
        str = (String) obj3;
        if (str != null) {
        }
        return new ljd("User with subscription required for smart home");
    }

    public final boolean d(x66 x66Var) {
        if (!x66Var.a) {
            return false;
        }
        int ordinal = ((zzi) ((z66) this.b.getValue()).d().getValue()).b.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            return false;
        }
        b6e.s();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(yxc yxcVar, fos fosVar, cg6 cg6Var) {
        xjd xjdVar;
        int i;
        mns mnsVar;
        String str;
        if (cg6Var instanceof xjd) {
            xjdVar = (xjd) cg6Var;
            int i2 = xjdVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xjdVar.m = i2 - Integer.MIN_VALUE;
                Object obj = xjdVar.k;
                Object obj2 = nm6.a;
                i = xjdVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    xjdVar.j = yxcVar;
                    xjdVar.m = 1;
                    obj = fosVar.a(xjdVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yxcVar = xjdVar.j;
                    qgg.h0(obj);
                }
                mnsVar = (mns) obj;
                if (mnsVar == null && (str = mnsVar.a) != null && yxcVar.a.d && yxcVar.h) {
                    return str;
                }
                return null;
            }
        }
        xjdVar = new xjd(this, cg6Var);
        Object obj3 = xjdVar.k;
        Object obj22 = nm6.a;
        i = xjdVar.m;
        if (i != 0) {
        }
        mnsVar = (mns) obj3;
        return mnsVar == null ? null : null;
    }
}
