package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class er extends aur implements Function2 {
    public final /* synthetic */ int j = 0;
    public int k;
    public int l;
    public Object m;
    public r2f n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er(mm6 mm6Var, hr hrVar, Continuation continuation) {
        super(2, continuation);
        this.u = mm6Var;
        this.p = hrVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new er((mm6) this.u, (hr) this.p, continuation);
            default:
                er erVar = new er((xh1) this.u, continuation);
                erVar.m = obj;
                return erVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((er) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03bc  */
    /* JADX WARN: Type inference failed for: r10v11, types: [mu7] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v32 */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        r2f r2fVar;
        List list;
        lnu lnuVar;
        xbb xbbVar;
        Object a;
        ArrayList arrayList;
        hr hrVar;
        int i;
        lr lrVar;
        hr hrVar2;
        ou7 p;
        mu7 p2;
        Object s;
        mu7 mu7Var;
        ou7 ou7Var;
        int i2;
        vjg vjgVar;
        drf[] drfVarArr;
        ?? r1;
        Object H;
        vjg vjgVar2;
        mu7 mu7Var2;
        mu7 mu7Var3;
        int i3;
        mu7 mu7Var4;
        drf[] drfVarArr2;
        ?? r2;
        Object H2;
        drf[] drfVarArr3;
        mu7 mu7Var5;
        int i4;
        ?? r3;
        Object H3;
        int i5;
        ?? r12;
        mu7 mu7Var6;
        Object H4;
        int i6;
        ?? r13;
        int i7 = 2;
        int i8 = 0;
        Continuation continuation = null;
        int i9 = 1;
        switch (this.j) {
            case 0:
                hr hrVar3 = (hr) this.p;
                nm6 nm6Var = nm6.a;
                int i10 = this.l;
                if (i10 == 0) {
                    qgg.h0(obj);
                    rar y = x97.y((mm6) this.u, null, null, new hl(hrVar3, continuation, 1), 3);
                    n8g a2 = ((g10) hrVar3.g.getValue()).a();
                    this.n = y;
                    this.o = hrVar3;
                    this.q = a2;
                    this.k = 0;
                    this.l = 1;
                    b = hr.b(hrVar3, this);
                    if (b != nm6Var) {
                        r2fVar = y;
                        list = a2;
                    }
                    return nm6Var;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        lrVar = (lr) this.m;
                        hrVar2 = (hr) this.o;
                        qgg.h0(obj);
                        hrVar2.f.l(lrVar);
                        return Unit.a;
                    }
                    i = this.k;
                    list = (List) this.t;
                    lnuVar = (lnu) this.s;
                    ArrayList arrayList2 = (ArrayList) this.r;
                    xbbVar = (xbb) this.m;
                    hrVar = (hr) this.o;
                    r2fVar = this.n;
                    qgg.h0(obj);
                    a = obj;
                    arrayList = arrayList2;
                    List list2 = list;
                    lnu lnuVar2 = lnuVar;
                    xbb xbbVar2 = xbbVar;
                    br brVar = hrVar.b;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(byb.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    lr lrVar2 = new lr(xbbVar2, arrayList, lnuVar2, list2, (List) a, ((ulu) ((byb) qdcVar.C(I)).c(ern.a(ulu.class))).h());
                    this.n = null;
                    this.o = hrVar;
                    this.q = null;
                    this.m = lrVar2;
                    this.r = null;
                    this.s = null;
                    this.t = null;
                    this.k = i;
                    this.l = 3;
                    if (saf.C(r2fVar, this) != nm6Var) {
                        lrVar = lrVar2;
                        hrVar2 = hrVar;
                        hrVar2.f.l(lrVar);
                        return Unit.a;
                    }
                    return nm6Var;
                }
                i8 = this.k;
                n8g n8gVar = (n8g) this.q;
                hr hrVar4 = (hr) this.o;
                r2f r2fVar2 = this.n;
                qgg.h0(obj);
                list = n8gVar;
                hrVar3 = hrVar4;
                b = obj;
                r2fVar = r2fVar2;
                lnuVar = (lnu) b;
                br brVar2 = hrVar3.b;
                oq oqVar = hrVar3.a;
                ((wbb) brVar2.e.getValue()).getClass();
                oqVar.getClass();
                String w = vz1.w(oqVar.o);
                String str = oqVar.i;
                String str2 = str == null ? "" : str;
                xbbVar = new xbb(w, oqVar.b, str2, oqVar.i(), new rab(oqVar.b, str2, str, w, oqVar.i(), false, oqVar.B), wbb.a(w, lnuVar, elu.a), null, null, qo6.b);
                ArrayList J = xp3.J(oqVar.n, c5b.a);
                ArrayList arrayList3 = new ArrayList(v75.o(J, 10));
                Iterator it = J.iterator();
                while (it.hasNext()) {
                    zp2 zp2Var = (zp2) it.next();
                    zp2Var.getClass();
                    u51 O = ghh.O(zp2Var);
                    arrayList3.add(new r91(h4a.q(O), O));
                }
                this.n = r2fVar;
                this.o = hrVar3;
                this.q = null;
                this.m = xbbVar;
                this.r = arrayList3;
                this.s = lnuVar;
                this.t = list;
                this.k = i8;
                this.l = 2;
                a = hr.a(hrVar3, this);
                if (a != nm6Var) {
                    arrayList = arrayList3;
                    hrVar = hrVar3;
                    i = i8;
                    List list22 = list;
                    lnu lnuVar22 = lnuVar;
                    xbb xbbVar22 = xbbVar;
                    br brVar3 = hrVar.b;
                    l18 l18Var2 = l18.b;
                    bdt I2 = hag.I(byb.class);
                    qdc qdcVar2 = l18Var2.a;
                    qdcVar2.getClass();
                    lr lrVar22 = new lr(xbbVar22, arrayList, lnuVar22, list22, (List) a, ((ulu) ((byb) qdcVar2.C(I2)).c(ern.a(ulu.class))).h());
                    this.n = null;
                    this.o = hrVar;
                    this.q = null;
                    this.m = lrVar22;
                    this.r = null;
                    this.s = null;
                    this.t = null;
                    this.k = i;
                    this.l = 3;
                    if (saf.C(r2fVar, this) != nm6Var) {
                    }
                }
                return nm6Var;
            default:
                xh1 xh1Var = (xh1) this.u;
                mm6 mm6Var = (mm6) this.m;
                nm6 nm6Var2 = nm6.a;
                int i11 = this.l;
                if (i11 == 0) {
                    qgg.h0(obj);
                    ou7 p3 = x97.p(mm6Var, null, null, new yig(xh1Var, continuation, i8), 3);
                    ou7 p4 = x97.p(mm6Var, null, null, new yig(xh1Var, continuation, i7), 3);
                    p = x97.p(mm6Var, null, null, new yig(xh1Var, continuation, i9), 3);
                    ou7 p5 = x97.p(mm6Var, null, null, new ox1(xh1Var, continuation, 27), 3);
                    y35 y35Var = y35.WIZARD;
                    f75 f75Var = new f75(new nrf("collection_wave_id", "COLLECTION_WAVE"));
                    l18 l18Var3 = l18.b;
                    bdt I3 = hag.I(byb.class);
                    qdc qdcVar3 = l18Var3.a;
                    qdcVar3.getClass();
                    if (((ulu) ((byb) qdcVar3.C(I3)).c(ern.a(ulu.class))).h()) {
                        f75Var = null;
                    }
                    y35 y35Var2 = y35.CONNECTIVITY_INFO;
                    vjg vjgVar3 = new vjg(new nrf(y35Var2.a, y35Var2.b), null, null, null, null);
                    p2 = x97.p(mm6Var, null, null, new zig(xh1Var, y35.WIZARD, continuation, i8), 3);
                    drf[] drfVarArr4 = new drf[7];
                    drfVarArr4[0] = f75Var;
                    this.m = null;
                    this.n = p3;
                    this.o = p;
                    this.p = p5;
                    this.q = vjgVar3;
                    this.r = p2;
                    this.s = drfVarArr4;
                    this.t = drfVarArr4;
                    this.k = 1;
                    this.l = 1;
                    s = p4.s(this);
                    if (s != nm6Var2) {
                        mu7Var = p3;
                        ou7Var = p5;
                        i2 = 1;
                        vjgVar = vjgVar3;
                        drfVarArr = drfVarArr4;
                        r1 = drfVarArr4;
                    }
                    return nm6Var2;
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        i3 = this.k;
                        drf[] drfVarArr5 = (drf[]) ((Object[]) this.t);
                        drf[] drfVarArr6 = (drf[]) ((Object[]) this.s);
                        mu7 mu7Var7 = (mu7) this.r;
                        vjg vjgVar4 = (vjg) this.q;
                        mu7Var3 = (mu7) this.o;
                        mu7Var2 = (mu7) this.n;
                        qgg.h0(obj);
                        vjgVar2 = vjgVar4;
                        mu7Var4 = mu7Var7;
                        drfVarArr2 = drfVarArr6;
                        r2 = drfVarArr5;
                        H = obj;
                        r2[i3] = H;
                        this.m = null;
                        this.n = null;
                        this.o = mu7Var3;
                        this.p = null;
                        this.q = vjgVar2;
                        this.r = mu7Var4;
                        this.s = drfVarArr2;
                        this.t = drfVarArr2;
                        this.k = 3;
                        this.l = 3;
                        H2 = mu7Var2.H(this);
                        if (H2 != nm6Var2) {
                            drfVarArr3 = drfVarArr2;
                            mu7Var5 = mu7Var3;
                            i4 = 3;
                            r3 = drfVarArr2;
                            r3[i4] = H2;
                            this.m = null;
                            this.n = null;
                            this.o = mu7Var5;
                            this.p = null;
                            this.q = vjgVar2;
                            this.r = null;
                            this.s = drfVarArr3;
                            this.t = drfVarArr3;
                            this.k = 4;
                            this.l = 4;
                            H3 = mu7Var4.H(this);
                            if (H3 != nm6Var2) {
                            }
                        }
                        return nm6Var2;
                    }
                    if (i11 == 3) {
                        int i12 = this.k;
                        drf[] drfVarArr7 = (drf[]) ((Object[]) this.t);
                        drfVarArr3 = (drf[]) ((Object[]) this.s);
                        mu7 mu7Var8 = (mu7) this.r;
                        vjg vjgVar5 = (vjg) this.q;
                        mu7Var5 = (mu7) this.o;
                        qgg.h0(obj);
                        i4 = i12;
                        vjgVar2 = vjgVar5;
                        mu7Var4 = mu7Var8;
                        r3 = drfVarArr7;
                        H2 = obj;
                        r3[i4] = H2;
                        this.m = null;
                        this.n = null;
                        this.o = mu7Var5;
                        this.p = null;
                        this.q = vjgVar2;
                        this.r = null;
                        this.s = drfVarArr3;
                        this.t = drfVarArr3;
                        this.k = 4;
                        this.l = 4;
                        H3 = mu7Var4.H(this);
                        if (H3 != nm6Var2) {
                            i5 = 4;
                            r12 = drfVarArr3;
                            mu7Var6 = mu7Var5;
                            r12[i5] = H3;
                            this.m = null;
                            this.n = null;
                            this.o = null;
                            this.p = null;
                            this.q = vjgVar2;
                            this.r = null;
                            this.s = drfVarArr3;
                            this.t = drfVarArr3;
                            this.k = 5;
                            this.l = 5;
                            H4 = mu7Var6.H(this);
                            if (H4 != nm6Var2) {
                            }
                        }
                        return nm6Var2;
                    }
                    if (i11 != 4) {
                        if (i11 != 5) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i6 = this.k;
                        drf[] drfVarArr8 = (drf[]) ((Object[]) this.t);
                        drfVarArr3 = (drf[]) ((Object[]) this.s);
                        vjg vjgVar6 = (vjg) this.q;
                        qgg.h0(obj);
                        vjgVar2 = vjgVar6;
                        H4 = obj;
                        r13 = drfVarArr8;
                        r13[i6] = H4;
                        drfVarArr3[6] = vjgVar2;
                        return xz0.w(drfVarArr3);
                    }
                    i5 = this.k;
                    drf[] drfVarArr9 = (drf[]) ((Object[]) this.t);
                    drfVarArr3 = (drf[]) ((Object[]) this.s);
                    vjg vjgVar7 = (vjg) this.q;
                    mu7Var6 = (mu7) this.o;
                    qgg.h0(obj);
                    vjgVar2 = vjgVar7;
                    H3 = obj;
                    r12 = drfVarArr9;
                    r12[i5] = H3;
                    this.m = null;
                    this.n = null;
                    this.o = null;
                    this.p = null;
                    this.q = vjgVar2;
                    this.r = null;
                    this.s = drfVarArr3;
                    this.t = drfVarArr3;
                    this.k = 5;
                    this.l = 5;
                    H4 = mu7Var6.H(this);
                    if (H4 != nm6Var2) {
                        i6 = 5;
                        r13 = drfVarArr3;
                        r13[i6] = H4;
                        drfVarArr3[6] = vjgVar2;
                        return xz0.w(drfVarArr3);
                    }
                    return nm6Var2;
                }
                i2 = this.k;
                drf[] drfVarArr10 = (drf[]) ((Object[]) this.t);
                drf[] drfVarArr11 = (drf[]) ((Object[]) this.s);
                p2 = (mu7) this.r;
                vjgVar = (vjg) this.q;
                ou7Var = (ou7) this.p;
                ?? r10 = (mu7) this.o;
                mu7Var = (mu7) this.n;
                qgg.h0(obj);
                s = obj;
                p = r10;
                r1 = drfVarArr10;
                drfVarArr = drfVarArr11;
                r1[i2] = s;
                this.m = null;
                this.n = mu7Var;
                this.o = p;
                this.p = null;
                this.q = vjgVar;
                this.r = p2;
                this.s = drfVarArr;
                this.t = drfVarArr;
                this.k = 2;
                this.l = 2;
                H = ou7Var.H(this);
                if (H != nm6Var2) {
                    vjgVar2 = vjgVar;
                    mu7Var2 = mu7Var;
                    mu7Var3 = p;
                    i3 = 2;
                    mu7Var4 = p2;
                    drfVarArr2 = drfVarArr;
                    r2 = drfVarArr;
                    r2[i3] = H;
                    this.m = null;
                    this.n = null;
                    this.o = mu7Var3;
                    this.p = null;
                    this.q = vjgVar2;
                    this.r = mu7Var4;
                    this.s = drfVarArr2;
                    this.t = drfVarArr2;
                    this.k = 3;
                    this.l = 3;
                    H2 = mu7Var2.H(this);
                    if (H2 != nm6Var2) {
                    }
                }
                return nm6Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er(xh1 xh1Var, Continuation continuation) {
        super(2, continuation);
        this.u = xh1Var;
    }
}
