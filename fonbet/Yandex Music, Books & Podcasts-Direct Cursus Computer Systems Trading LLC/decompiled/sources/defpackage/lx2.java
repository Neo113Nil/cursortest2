package defpackage;

import defpackage.hmm;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class lx2 {
    public final cc7 a;
    public final hmm.a b = new hmm.a("dialog_first_launch_timestamp");
    public final hmm.a c = new hmm.a("dialog_last_launch_timestamp");
    public final hmm.a d = new hmm.a("dialog_total_shows_count");
    public final hmm.a e = new hmm.a("dialog_shown_for_all_new_errors");
    public final hmm.a f = new hmm.a("new_errors_counts");
    public final hmm.a g = new hmm.a("last_errors_timestamp");
    public final jyr h = btf.b(new ri1(28, this));

    public lx2(cc7 cc7Var, zzp zzpVar) {
        this.a = cc7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (defpackage.lmm.a(f(), new defpackage.dx2(r6, null), r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (i(r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (m(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        tw2 tw2Var;
        int i;
        if (cg6Var instanceof tw2) {
            tw2Var = (tw2) cg6Var;
            int i2 = tw2Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tw2Var.l = i2 - Integer.MIN_VALUE;
                Object obj = tw2Var.j;
                Object obj2 = nm6.a;
                i = tw2Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    tw2Var.l = 1;
                } else if (i == 1) {
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    tw2Var.l = 3;
                }
                tw2Var.l = 2;
            }
        }
        tw2Var = new tw2(this, cg6Var);
        Object obj3 = tw2Var.j;
        Object obj22 = nm6.a;
        i = tw2Var.l;
        if (i != 0) {
        }
        tw2Var.l = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r6 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (h(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        uw2 uw2Var;
        Object obj;
        int i;
        Object a;
        if (cg6Var instanceof uw2) {
            uw2Var = (uw2) cg6Var;
            int i2 = uw2Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uw2Var.l = i2 - Integer.MIN_VALUE;
                Object obj2 = uw2Var.j;
                obj = nm6.a;
                i = uw2Var.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    uw2Var.l = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                uw2Var.l = 2;
                a = lmm.a(f(), new hx2(this, null), uw2Var);
                if (a != obj) {
                    a = Unit.a;
                }
            }
        }
        uw2Var = new uw2(this, cg6Var);
        Object obj22 = uw2Var.j;
        obj = nm6.a;
        i = uw2Var.l;
        if (i != 0) {
        }
        uw2Var.l = 2;
        a = lmm.a(f(), new hx2(this, null), uw2Var);
        if (a != obj) {
        }
    }

    public final Object c(cg6 cg6Var) {
        Object a = lmm.a(f(), new ex2(this, 0L, null), cg6Var);
        nm6 nm6Var = nm6.a;
        if (a != nm6Var) {
            a = Unit.a;
        }
        return a == nm6Var ? a : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(cg6 cg6Var) {
        vw2 vw2Var;
        int i;
        if (cg6Var instanceof vw2) {
            vw2Var = (vw2) cg6Var;
            int i2 = vw2Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vw2Var.l = i2 - Integer.MIN_VALUE;
                Object obj = vw2Var.j;
                nm6 nm6Var = nm6.a;
                i = vw2Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = f().getData();
                    vw2Var.l = 1;
                    obj = zsd.g0(data, vw2Var);
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
                Long l = (Long) ((hmm) obj).a(this.c);
                return new Long(l == null ? l.longValue() : 0L);
            }
        }
        vw2Var = new vw2(this, cg6Var);
        Object obj2 = vw2Var.j;
        nm6 nm6Var2 = nm6.a;
        i = vw2Var.l;
        if (i != 0) {
        }
        Long l2 = (Long) ((hmm) obj2).a(this.c);
        return new Long(l2 == null ? l2.longValue() : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cg6 cg6Var) {
        ww2 ww2Var;
        int i;
        if (cg6Var instanceof ww2) {
            ww2Var = (ww2) cg6Var;
            int i2 = ww2Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ww2Var.l = i2 - Integer.MIN_VALUE;
                Object obj = ww2Var.j;
                nm6 nm6Var = nm6.a;
                i = ww2Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = f().getData();
                    ww2Var.l = 1;
                    obj = zsd.g0(data, ww2Var);
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
                Long l = (Long) ((hmm) obj).a(this.f);
                return new Long(l == null ? l.longValue() : 0L);
            }
        }
        ww2Var = new ww2(this, cg6Var);
        Object obj2 = ww2Var.j;
        nm6 nm6Var2 = nm6.a;
        i = ww2Var.l;
        if (i != 0) {
        }
        Long l2 = (Long) ((hmm) obj2).a(this.f);
        return new Long(l2 == null ? l2.longValue() : 0L);
    }

    public final wb7 f() {
        return (wb7) this.h.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(cg6 cg6Var) {
        xw2 xw2Var;
        int i;
        if (cg6Var instanceof xw2) {
            xw2Var = (xw2) cg6Var;
            int i2 = xw2Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xw2Var.l = i2 - Integer.MIN_VALUE;
                Object obj = xw2Var.j;
                nm6 nm6Var = nm6.a;
                i = xw2Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = f().getData();
                    xw2Var.l = 1;
                    obj = zsd.g0(data, xw2Var);
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
                Long l = (Long) ((hmm) obj).a(this.d);
                return new Long(l == null ? l.longValue() : 0L);
            }
        }
        xw2Var = new xw2(this, cg6Var);
        Object obj2 = xw2Var.j;
        nm6 nm6Var2 = nm6.a;
        i = xw2Var.l;
        if (i != 0) {
        }
        Long l2 = (Long) ((hmm) obj2).a(this.d);
        return new Long(l2 == null ? l2.longValue() : 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r9 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(cg6 cg6Var) {
        yw2 yw2Var;
        Object obj;
        int i;
        Object a;
        if (cg6Var instanceof yw2) {
            yw2Var = (yw2) cg6Var;
            int i2 = yw2Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yw2Var.l = i2 - Integer.MIN_VALUE;
                Object obj2 = yw2Var.j;
                obj = nm6.a;
                i = yw2Var.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    yw2Var.l = 1;
                    obj2 = e(yw2Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                long longValue = ((Number) obj2).longValue() + 1;
                yw2Var.l = 2;
                a = lmm.a(f(), new ex2(this, longValue, null), yw2Var);
                if (a != obj) {
                    a = Unit.a;
                }
            }
        }
        yw2Var = new yw2(this, cg6Var);
        Object obj22 = yw2Var.j;
        obj = nm6.a;
        i = yw2Var.l;
        if (i != 0) {
        }
        long longValue2 = ((Number) obj22).longValue() + 1;
        yw2Var.l = 2;
        a = lmm.a(f(), new ex2(this, longValue2, null), yw2Var);
        if (a != obj) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (defpackage.lmm.a(r9, r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(cg6 cg6Var) {
        zw2 zw2Var;
        int i;
        if (cg6Var instanceof zw2) {
            zw2Var = (zw2) cg6Var;
            int i2 = zw2Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zw2Var.l = i2 - Integer.MIN_VALUE;
                Object obj = zw2Var.j;
                Object obj2 = nm6.a;
                i = zw2Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    zw2Var.l = 1;
                    obj = g(zw2Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                long longValue = ((Number) obj).longValue() + 1;
                wb7 f = f();
                ax2 ax2Var = new ax2(this, longValue, null);
                zw2Var.l = 2;
            }
        }
        zw2Var = new zw2(this, cg6Var);
        Object obj3 = zw2Var.j;
        Object obj22 = nm6.a;
        i = zw2Var.l;
        if (i != 0) {
        }
        long longValue2 = ((Number) obj3).longValue() + 1;
        wb7 f2 = f();
        ax2 ax2Var2 = new ax2(this, longValue2, null);
        zw2Var.l = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(cg6 cg6Var) {
        bx2 bx2Var;
        int i;
        if (cg6Var instanceof bx2) {
            bx2Var = (bx2) cg6Var;
            int i2 = bx2Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bx2Var.l = i2 - Integer.MIN_VALUE;
                Object obj = bx2Var.j;
                nm6 nm6Var = nm6.a;
                i = bx2Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = f().getData();
                    bx2Var.l = 1;
                    obj = zsd.g0(data, bx2Var);
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
                Boolean bool = (Boolean) ((hmm) obj).a(this.e);
                return Boolean.valueOf(bool == null ? bool.booleanValue() : false);
            }
        }
        bx2Var = new bx2(this, cg6Var);
        Object obj2 = bx2Var.j;
        nm6 nm6Var2 = nm6.a;
        i = bx2Var.l;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) ((hmm) obj2).a(this.e);
        return Boolean.valueOf(bool2 == null ? bool2.booleanValue() : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(cg6 cg6Var) {
        cx2 cx2Var;
        int i;
        if (cg6Var instanceof cx2) {
            cx2Var = (cx2) cg6Var;
            int i2 = cx2Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cx2Var.l = i2 - Integer.MIN_VALUE;
                Object obj = cx2Var.j;
                Object obj2 = nm6.a;
                i = cx2Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    cx2Var.l = 1;
                    obj = e(cx2Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Boolean.valueOf(((Number) obj).longValue() > 0);
            }
        }
        cx2Var = new cx2(this, cg6Var);
        Object obj3 = cx2Var.j;
        Object obj22 = nm6.a;
        i = cx2Var.l;
        if (i != 0) {
        }
        return Boolean.valueOf(((Number) obj3).longValue() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(cg6 cg6Var) {
        gx2 gx2Var;
        int i;
        long j;
        if (cg6Var instanceof gx2) {
            gx2Var = (gx2) cg6Var;
            int i2 = gx2Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gx2Var.m = i2 - Integer.MIN_VALUE;
                Object obj = gx2Var.k;
                Object obj2 = nm6.a;
                i = gx2Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    gx2Var.j = currentTimeMillis;
                    gx2Var.m = 1;
                    obj = d(gx2Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                    j = currentTimeMillis;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = gx2Var.j;
                    qgg.h0(obj);
                }
                return new Long(j - ((Number) obj).longValue());
            }
        }
        gx2Var = new gx2(this, cg6Var);
        Object obj3 = gx2Var.k;
        Object obj22 = nm6.a;
        i = gx2Var.m;
        if (i != 0) {
        }
        return new Long(j - ((Number) obj3).longValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        if (defpackage.lmm.a(r8, r2, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (defpackage.lmm.a(r8, r2, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(cg6 cg6Var) {
        ix2 ix2Var;
        int i;
        lpi lpiVar;
        hmm.a aVar;
        if (cg6Var instanceof ix2) {
            ix2Var = (ix2) cg6Var;
            int i2 = ix2Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ix2Var.l = i2 - Integer.MIN_VALUE;
                Object obj = ix2Var.j;
                nm6 nm6Var = nm6.a;
                i = ix2Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = f().getData();
                    ix2Var.l = 1;
                    obj = zsd.g0(data, ix2Var);
                } else if (i == 1) {
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    wb7 f = f();
                    kx2 kx2Var = new kx2(this, null);
                    ix2Var.l = 3;
                }
                lpiVar = (lpi) ((hmm) obj);
                lpiVar.getClass();
                aVar = this.b;
                aVar.getClass();
                if (!lpiVar.a.containsKey(aVar)) {
                    wb7 f2 = f();
                    jx2 jx2Var = new jx2(this, null);
                    ix2Var.l = 2;
                }
                wb7 f3 = f();
                kx2 kx2Var2 = new kx2(this, null);
                ix2Var.l = 3;
            }
        }
        ix2Var = new ix2(this, cg6Var);
        Object obj2 = ix2Var.j;
        nm6 nm6Var2 = nm6.a;
        i = ix2Var.l;
        if (i != 0) {
        }
        lpiVar = (lpi) ((hmm) obj2);
        lpiVar.getClass();
        aVar = this.b;
        aVar.getClass();
        if (!lpiVar.a.containsKey(aVar)) {
        }
        wb7 f32 = f();
        kx2 kx2Var22 = new kx2(this, null);
        ix2Var.l = 3;
    }
}
