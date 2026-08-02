package defpackage;

/* loaded from: classes3.dex */
public final class tta extends xmm implements ayd {
    public final /* synthetic */ byd d;
    public final q43 e;
    public final fta f;
    public final xdr g;
    public boolean h;
    public final jyr i;

    public tta(s63 s63Var, q43 q43Var, jyr jyrVar, jyr jyrVar2) {
        drf drfVar = s63Var.a;
        wfm wfmVar = (wfm) drfVar;
        wfmVar.getClass();
        this.d = new byd(wfmVar, jyrVar);
        this.e = q43Var;
        this.f = (fta) drfVar;
        this.g = ydr.a(gua.a);
        this.i = jyrVar2;
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.f;
    }

    @Override // defpackage.ayd
    public final void b(boolean z) {
        this.d.b(z);
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01d3, code lost:
    
        if (r2 == r4) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01e6, code lost:
    
        if (r2 == r4) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01f8, code lost:
    
        if (r2 == r4) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a2, code lost:
    
        if (r22.d.a(false, r3) == r4) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c2, code lost:
    
        if (r2 == r4) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b0  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        pta ptaVar;
        int i;
        xta b;
        String str;
        dua duaVar;
        dua duaVar2;
        boolean z2;
        d85 d85Var;
        e73 e73Var;
        boolean z3 = z;
        if (cg6Var instanceof pta) {
            ptaVar = (pta) cg6Var;
            int i2 = ptaVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ptaVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ptaVar.k;
                Object obj2 = nm6.a;
                i = ptaVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    jyr jyrVar = this.i;
                    kta ktaVar = (kta) jyrVar.getValue();
                    String str2 = ktaVar.a;
                    jyr jyrVar2 = k3j.e;
                    if (ixf.x()) {
                        dh5 dh5Var = (dh5) ((gta) ktaVar.e.getValue()).a.get(str2);
                        if (dh5Var != null) {
                            b = kta.b(dh5Var);
                            if (b == null) {
                            }
                            return obj2;
                        }
                        b = null;
                        if (b == null) {
                        }
                        return obj2;
                    }
                    xh5 a = pi5.a((pi5) ktaVar.c.getValue(), str2);
                    if (!(a instanceof dh5)) {
                        if (!(a instanceof vh5) && !(a instanceof ph5) && !(a instanceof lh5) && !(a instanceof mh5) && !(a instanceof kh5) && a != null) {
                            b6e.s();
                            return null;
                        }
                        b = null;
                        if (b == null) {
                        }
                        return obj2;
                    }
                    b = kta.b((dh5) a);
                    if (b == null) {
                        this.h = true;
                        q43.c(this.e, 1);
                        String str3 = b.a;
                        String str4 = b.b;
                        String str5 = b.c;
                        String str6 = b.d;
                        wta wtaVar = b.e;
                        if (wtaVar != null) {
                            Integer num = wtaVar.a;
                            if (num != null) {
                                str = str5;
                                d85Var = new d85(c3x.f(num.intValue()));
                            } else {
                                str = str5;
                                d85Var = null;
                            }
                            Integer num2 = wtaVar.b;
                            d85 d85Var2 = num2 != null ? new d85(c3x.f(num2.intValue())) : null;
                            Integer num3 = wtaVar.c;
                            duaVar = new dua(d85Var, d85Var2, num3 != null ? new d85(c3x.f(num3.intValue())) : null, wtaVar.d);
                        } else {
                            str = str5;
                            duaVar = null;
                        }
                        wta wtaVar2 = b.f;
                        if (wtaVar2 != null) {
                            Integer num4 = wtaVar2.a;
                            d85 d85Var3 = num4 != null ? new d85(c3x.f(num4.intValue())) : null;
                            Integer num5 = wtaVar2.b;
                            d85 d85Var4 = num5 != null ? new d85(c3x.f(num5.intValue())) : null;
                            Integer num6 = wtaVar2.c;
                            duaVar2 = new dua(d85Var3, d85Var4, num6 != null ? new d85(c3x.f(num6.intValue())) : null, wtaVar2.d);
                        } else {
                            duaVar2 = null;
                        }
                        uta utaVar = b.g;
                        bua buaVar = utaVar != null ? new bua(utaVar.a, utaVar.b) : null;
                        vta vtaVar = b.h;
                        hua huaVar = new hua(new eua(str3, str4, str, str6, duaVar, duaVar2, buaVar, vtaVar != null ? new cua(vtaVar.a) : null));
                        xdr xdrVar = this.g;
                        xdrVar.getClass();
                        xdrVar.m(null, huaVar);
                        ptaVar.j = z3;
                        ptaVar.m = 1;
                        z2 = false;
                    } else {
                        b(true);
                        kta ktaVar2 = (kta) jyrVar.getValue();
                        ptaVar.j = z3;
                        ptaVar.m = 2;
                        obj = ktaVar2.a(ptaVar);
                    }
                    return obj2;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    z2 = false;
                    b(z2);
                    return new d73(this.f);
                }
                if (i == 2) {
                    z3 = ptaVar.j;
                    qgg.h0(obj);
                    aua auaVar = (aua) obj;
                    if (auaVar instanceof xta) {
                        ptaVar.j = z3;
                        ptaVar.m = 3;
                        obj = r(ptaVar);
                    } else if (auaVar instanceof yta) {
                        ptaVar.j = z3;
                        ptaVar.m = 4;
                        obj = p(ptaVar);
                    } else {
                        if (!(auaVar instanceof zta)) {
                            b6e.s();
                            return null;
                        }
                        ptaVar.j = z3;
                        ptaVar.m = 5;
                        obj = q(ptaVar);
                    }
                    return obj2;
                }
                if (i == 3) {
                    qgg.h0(obj);
                    e73Var = (e73) obj;
                } else if (i == 4) {
                    qgg.h0(obj);
                    e73Var = (e73) obj;
                } else {
                    if (i != 5) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    e73Var = (e73) obj;
                }
                this.h = true;
                return e73Var;
            }
        }
        ptaVar = new pta(this, cg6Var);
        Object obj3 = ptaVar.k;
        Object obj22 = nm6.a;
        i = ptaVar.m;
        if (i != 0) {
        }
        this.h = true;
        return e73Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(cg6 cg6Var) {
        qta qtaVar;
        int i;
        if (cg6Var instanceof qta) {
            qtaVar = (qta) cg6Var;
            int i2 = qtaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qtaVar.l = i2 - Integer.MIN_VALUE;
                Object obj = qtaVar.j;
                nm6 nm6Var = nm6.a;
                i = qtaVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    qtaVar.l = 1;
                    if (this.d.a(true, qtaVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                q43.c(this.e, 0);
                xdr xdrVar = this.g;
                xdrVar.getClass();
                xdrVar.m(null, fua.a);
                return new b73(this.f);
            }
        }
        qtaVar = new qta(this, cg6Var);
        Object obj2 = qtaVar.j;
        nm6 nm6Var2 = nm6.a;
        i = qtaVar.l;
        if (i != 0) {
        }
        q43.c(this.e, 0);
        xdr xdrVar2 = this.g;
        xdrVar2.getClass();
        xdrVar2.m(null, fua.a);
        return new b73(this.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(cg6 cg6Var) {
        rta rtaVar;
        int i;
        if (cg6Var instanceof rta) {
            rtaVar = (rta) cg6Var;
            int i2 = rtaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rtaVar.l = i2 - Integer.MIN_VALUE;
                Object obj = rtaVar.j;
                nm6 nm6Var = nm6.a;
                i = rtaVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    rtaVar.l = 1;
                    if (this.d.a(true, rtaVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xdr xdrVar = this.g;
                xdrVar.getClass();
                xdrVar.m(null, fua.a);
                return new c73(this.f);
            }
        }
        rtaVar = new rta(this, cg6Var);
        Object obj2 = rtaVar.j;
        nm6 nm6Var2 = nm6.a;
        i = rtaVar.l;
        if (i != 0) {
        }
        xdr xdrVar2 = this.g;
        xdrVar2.getClass();
        xdrVar2.m(null, fua.a);
        return new c73(this.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(cg6 cg6Var) {
        sta staVar;
        int i;
        if (cg6Var instanceof sta) {
            staVar = (sta) cg6Var;
            int i2 = staVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                staVar.l = i2 - Integer.MIN_VALUE;
                Object obj = staVar.j;
                nm6 nm6Var = nm6.a;
                i = staVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    staVar.l = 1;
                    if (this.d.a(false, staVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return new d73(this.f);
            }
        }
        staVar = new sta(this, cg6Var);
        Object obj2 = staVar.j;
        nm6 nm6Var2 = nm6.a;
        i = staVar.l;
        if (i != 0) {
        }
        return new d73(this.f);
    }
}
