package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class vfr extends xmm {
    public final s63 d;
    public final aw8 e;
    public final q43 f;
    public final yer g;
    public final xdr h;
    public final xdr i;

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c5, code lost:
    
        if (r6.a(r3.a) != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fe, code lost:
    
        if (r6.a(r3.a) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0136, code lost:
    
        if (r6.a(r3.a) != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x016e, code lost:
    
        if (r6.a(r3.a) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vfr(s63 s63Var, aw8 aw8Var, q43 q43Var, ifr ifrVar) {
        boolean z;
        this.d = s63Var;
        this.e = aw8Var;
        this.f = q43Var;
        yer yerVar = (yer) s63Var.a;
        this.g = yerVar;
        hfr hfrVar = yerVar.e;
        jfr jfrVar = (jfr) ifrVar;
        if (!hfrVar.equals(zer.a)) {
            z = false;
            if (hfrVar instanceof afr) {
                Set set = ((afr) hfrVar).a;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        if (jfrVar.b((String) it.next())) {
                        }
                    }
                }
                this.h = ydr.a(Boolean.valueOf(!z));
                this.i = ydr.a(rfr.a);
            }
            if (hfrVar instanceof dfr) {
                Set set2 = ((dfr) hfrVar).a;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    Iterator it2 = set2.iterator();
                    while (it2.hasNext()) {
                        if (!jfrVar.b((String) it2.next())) {
                        }
                    }
                }
                this.h = ydr.a(Boolean.valueOf(!z));
                this.i = ydr.a(rfr.a);
            }
            if (hfrVar instanceof gfr) {
                z = !jfrVar.a(((gfr) hfrVar).a);
            } else if (hfrVar instanceof cfr) {
                cfr cfrVar = (cfr) hfrVar;
                Set set3 = cfrVar.b;
                if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                    Iterator it3 = set3.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        } else if (jfrVar.b((String) it3.next())) {
                        }
                    }
                }
            } else if (hfrVar instanceof bfr) {
                bfr bfrVar = (bfr) hfrVar;
                Set set4 = bfrVar.b;
                if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                    Iterator it4 = set4.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        } else if (jfrVar.b((String) it4.next())) {
                        }
                    }
                }
            } else if (hfrVar instanceof ffr) {
                ffr ffrVar = (ffr) hfrVar;
                Set set5 = ffrVar.b;
                if (!(set5 instanceof Collection) || !set5.isEmpty()) {
                    Iterator it5 = set5.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        } else if (!jfrVar.b((String) it5.next())) {
                        }
                    }
                }
            } else {
                if (!(hfrVar instanceof efr)) {
                    b6e.s();
                    throw null;
                }
                efr efrVar = (efr) hfrVar;
                Set set6 = efrVar.b;
                if (!(set6 instanceof Collection) || !set6.isEmpty()) {
                    Iterator it6 = set6.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        } else if (!jfrVar.b((String) it6.next())) {
                        }
                    }
                }
            }
            this.h = ydr.a(Boolean.valueOf(!z));
            this.i = ydr.a(rfr.a);
        }
        z = true;
        this.h = ydr.a(Boolean.valueOf(!z));
        this.i = ydr.a(rfr.a);
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.g;
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.i.getValue() instanceof sfr;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        ufr ufrVar;
        int i;
        xyo xyoVar;
        if (cg6Var instanceof ufr) {
            ufrVar = (ufr) cg6Var;
            int i2 = ufrVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ufrVar.l = i2 - Integer.MIN_VALUE;
                Object obj = ufrVar.j;
                nm6 nm6Var = nm6.a;
                i = ufrVar.l;
                xdr xdrVar = this.i;
                yer yerVar = this.g;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        xdrVar.getClass();
                        xdrVar.m(null, rfr.a);
                    }
                    String str = yerVar.c;
                    ufrVar.l = 1;
                    obj = this.e.a.c(str, aw8.b, ufrVar);
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
                xyoVar = (xyo) obj;
                if (xyoVar instanceof wyo) {
                    if (!(xyoVar instanceof vyo)) {
                        b6e.s();
                        return null;
                    }
                    xdrVar.getClass();
                    xdrVar.m(null, qfr.a);
                    ssg.a(7, "StaticDivBlockViewModel", hrg.q("can't load screenID=", yerVar.c, " from BDU"), null);
                    return new c73(yerVar);
                }
                q43 q43Var = this.f;
                if (q43Var != null) {
                    q43Var.b(q43Var.a, 1, null, null);
                }
                sfr sfrVar = new sfr((rv8) ((wyo) xyoVar).a);
                xdrVar.getClass();
                xdrVar.m(null, sfrVar);
                return new d73(yerVar);
            }
        }
        ufrVar = new ufr(this, cg6Var);
        Object obj2 = ufrVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ufrVar.l;
        xdr xdrVar2 = this.i;
        yer yerVar2 = this.g;
        if (i != 0) {
        }
        xyoVar = (xyo) obj2;
        if (xyoVar instanceof wyo) {
        }
    }
}
