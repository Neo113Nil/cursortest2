package defpackage;

import com.yandex.media.ynison.service.a;
import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.c0;
import com.yandex.media.ynison.service.e0;

/* loaded from: classes4.dex */
public final class qiw {
    public final dgw a;
    public final gsw b;
    public final qfw c;
    public final akw d;
    public final tqw e;
    public final dxl f = new dxl();

    public qiw(dgw dgwVar, gsw gswVar, qfw qfwVar, akw akwVar, rgw rgwVar, tqw tqwVar) {
        this.a = dgwVar;
        this.b = gswVar;
        this.c = qfwVar;
        this.d = akwVar;
        this.e = tqwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        niw niwVar;
        int i;
        qiw qiwVar;
        xdr xdrVar = this.c.F;
        if (cg6Var instanceof niw) {
            niwVar = (niw) cg6Var;
            int i2 = niwVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                niwVar.m = i2 - Integer.MIN_VALUE;
                Object obj = niwVar.k;
                nm6 nm6Var = nm6.a;
                i = niwVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    sqw sqwVar = (sqw) xdrVar.getValue();
                    pqw t = sqwVar != null ? s7g.t(sqwVar) : null;
                    if (t != null) {
                        return t;
                    }
                    sqw sqwVar2 = (sqw) xdrVar.getValue();
                    if (sqwVar2 instanceof pqw) {
                        return sqwVar2;
                    }
                    if (sqwVar2 instanceof rqw) {
                        e0 e0Var = ((rqw) sqwVar2).a;
                        niwVar.m = 1;
                        Object c = c(e0Var, niwVar);
                        if (c != nm6Var) {
                            return c;
                        }
                    } else {
                        niwVar.j = this;
                        niwVar.m = 2;
                        obj = gsw.c(this.b, niwVar);
                        if (obj != nm6Var) {
                            qiwVar = this;
                        }
                    }
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                if (i != 2) {
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    return obj;
                }
                qiwVar = niwVar.j;
                qgg.h0(obj);
                a0 a0Var = (a0) obj;
                c0 k = a0Var.k();
                k.getClass();
                qiwVar.getClass();
                b5n r = e0.r();
                pnl pnlVar = (pnl) a0Var.m30toBuilder();
                pnlVar.j(k);
                r.i((a0) pnlVar.b());
                dgw dgwVar = qiwVar.a;
                dlr h = dlr.h(dgwVar.b());
                r.d();
                e0.g((e0) r.b, h);
                a a = dgwVar.a();
                r.d();
                e0.f((e0) r.b, a);
                e0 e0Var2 = (e0) r.b();
                niwVar.j = null;
                niwVar.m = 3;
                Object c2 = c(e0Var2, niwVar);
                return c2 != nm6Var ? nm6Var : c2;
            }
        }
        niwVar = new niw(this, cg6Var);
        Object obj2 = niwVar.k;
        nm6 nm6Var2 = nm6.a;
        i = niwVar.m;
        if (i != 0) {
        }
        a0 a0Var2 = (a0) obj2;
        c0 k2 = a0Var2.k();
        k2.getClass();
        qiwVar.getClass();
        b5n r2 = e0.r();
        pnl pnlVar2 = (pnl) a0Var2.m30toBuilder();
        pnlVar2.j(k2);
        r2.i((a0) pnlVar2.b());
        dgw dgwVar2 = qiwVar.a;
        dlr h2 = dlr.h(dgwVar2.b());
        r2.d();
        e0.g((e0) r2.b, h2);
        a a2 = dgwVar2.a();
        r2.d();
        e0.f((e0) r2.b, a2);
        e0 e0Var22 = (e0) r2.b();
        niwVar.j = null;
        niwVar.m = 3;
        Object c22 = c(e0Var22, niwVar);
        if (c22 != nm6Var2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(e0 e0Var, cg6 cg6Var) {
        oiw oiwVar;
        int i;
        jjw jjwVar;
        if (cg6Var instanceof oiw) {
            oiwVar = (oiw) cg6Var;
            int i2 = oiwVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oiwVar.l = i2 - Integer.MIN_VALUE;
                Object obj = oiwVar.j;
                nm6 nm6Var = nm6.a;
                i = oiwVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    akw akwVar = this.d;
                    akwVar.f.compareAndSet(false, true);
                    orw orwVar = new orw(e0Var, nrw.a);
                    oiwVar.l = 1;
                    obj = akwVar.j(orwVar, oiwVar);
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
                jjwVar = (jjw) obj;
                if (!(jjwVar instanceof ijw)) {
                    return ((ijw) jjwVar).a;
                }
                if (jjwVar instanceof fjw) {
                    return null;
                }
                if (!(jjwVar instanceof hjw)) {
                    b6e.s();
                    return null;
                }
                gjw gjwVar = gjw.a;
                ssg.a(5, "YnisonLocalRestoreImpl", "YnisonMetaLoader NotSupported reason: ".concat("NO_DEVICES"), null);
                return null;
            }
        }
        oiwVar = new oiw(this, cg6Var);
        Object obj2 = oiwVar.j;
        nm6 nm6Var2 = nm6.a;
        i = oiwVar.l;
        if (i != 0) {
        }
        jjwVar = (jjw) obj2;
        if (!(jjwVar instanceof ijw)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(e0 e0Var, cg6 cg6Var) {
        piw piwVar;
        int i;
        sqw sqwVar;
        if (cg6Var instanceof piw) {
            piwVar = (piw) cg6Var;
            int i2 = piwVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                piwVar.m = i2 - Integer.MIN_VALUE;
                Object obj = piwVar.k;
                Object obj2 = nm6.a;
                i = piwVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    piwVar.j = e0Var;
                    piwVar.m = 1;
                    obj = b(e0Var, piwVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e0Var = piwVar.j;
                    qgg.h0(obj);
                }
                sqwVar = (sqw) obj;
                if (sqwVar == null) {
                    return sqwVar;
                }
                dgw dgwVar = this.a;
                String b = dgwVar.b();
                a a = dgwVar.a();
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                gow G = neg.G(a, b, b, ((otw) ((byb) qdcVar.C(I)).b(otw.class)).h());
                if (G == null) {
                    return null;
                }
                return new rqw(e0Var, new how(t75.c(G), c5b.a, G, G));
            }
        }
        piwVar = new piw(this, cg6Var);
        Object obj3 = piwVar.k;
        Object obj22 = nm6.a;
        i = piwVar.m;
        if (i != 0) {
        }
        sqwVar = (sqw) obj3;
        if (sqwVar == null) {
        }
    }

    public final Boolean d(sqw sqwVar) {
        boolean z;
        if (sqwVar instanceof pqw) {
            dxl dxlVar = this.f;
            z = this.e.a((pqw) sqwVar, dxlVar);
        } else {
            if (!(sqwVar instanceof rqw)) {
                b6e.s();
                return null;
            }
            ssg.a(5, "YnisonLocalRestoreImpl", "try to start YnisonRemoteState.Raw", null);
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
