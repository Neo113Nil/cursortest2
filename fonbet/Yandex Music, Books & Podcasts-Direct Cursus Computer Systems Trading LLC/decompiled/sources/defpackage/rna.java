package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.a;

/* loaded from: classes.dex */
public final class rna extends h7o implements Function2 {
    public final /* synthetic */ int k;
    public int l;
    public /* synthetic */ Object m;
    public Object n;
    public Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rna(bfi bfiVar, x0 x0Var, has hasVar, Continuation continuation) {
        super(2, continuation);
        this.k = 3;
        this.n = bfiVar;
        this.o = x0Var;
        this.p = hasVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.k) {
            case 0:
                rna rnaVar = new rna((Function2) this.o, (Function0) this.p, continuation);
                rnaVar.m = obj;
                return rnaVar;
            case 1:
                rna rnaVar2 = new rna((h3f) this.p, continuation, 1);
                rnaVar2.m = obj;
                return rnaVar2;
            case 2:
                rna rnaVar3 = new rna((o3k) this.p, continuation, 2);
                rnaVar3.m = obj;
                return rnaVar3;
            case 3:
                rna rnaVar4 = new rna((bfi) this.n, (x0) this.o, (has) this.p, continuation);
                rnaVar4.m = obj;
                return rnaVar4;
            default:
                rna rnaVar5 = new rna((pmr) this.p, continuation, 4);
                rnaVar5.m = obj;
                return rnaVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.k) {
        }
        return ((rna) create((hur) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x01d3, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x00d0, code lost:
    
        if (r11 == r0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x005f, code lost:
    
        if (r4 == r0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x031a, code lost:
    
        if (defpackage.hdg.J(r1, r4, r6, r2, r20) == r0) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x032f, code lost:
    
        if (defpackage.hdg.K(r1, (defpackage.has) r7, r2, r20) == r0) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x02dc, code lost:
    
        if (r2 == r0) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x039a, code lost:
    
        if (r1 == r0) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0377, code lost:
    
        if (r2 == r0) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0263, code lost:
    
        if (r1 != r0) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:244:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x00d0 -> B:30:0x00d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:194:0x039a -> B:187:0x039e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:213:0x0441 -> B:209:0x0455). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0263 -> B:9:0x0267). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        hur hurVar;
        Object c;
        Object e;
        hur hurVar2;
        uqn uqnVar;
        lfm lfmVar;
        Object m;
        h8j d;
        ygp ygpVar;
        a aVar;
        hur hurVar3;
        Object b;
        lfm lfmVar2;
        hur hurVar4;
        lfm lfmVar3;
        hur hurVar5;
        Object I;
        hur hurVar6;
        Object b2;
        lfm lfmVar4;
        boolean z;
        hur hurVar7;
        gfm gfmVar;
        Object a;
        pmr pmrVar;
        hur hurVar8;
        Object obj2;
        hur hurVar9;
        lfm lfmVar5;
        Object a2;
        Object obj3;
        int i = this.k;
        Object obj4 = this.p;
        switch (i) {
            case 0:
                Function2 function2 = (Function2) this.o;
                nm6 nm6Var = nm6.a;
                int i2 = this.l;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                qgg.h0(obj);
                                m = obj;
                                if (((Boolean) m).booleanValue()) {
                                    ((Function0) obj4).invoke();
                                }
                                break;
                            } else {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            uqnVar = (uqn) this.n;
                            hur hurVar10 = (hur) this.m;
                            qgg.h0(obj);
                            hurVar2 = hurVar10;
                            e = obj;
                            lfmVar = (lfm) e;
                            if (lfmVar != null) {
                                function2.invoke(lfmVar, new Float(uqnVar.a));
                                long j = lfmVar.a;
                                nna nnaVar = new nna(function2, 1);
                                this.m = null;
                                this.n = null;
                                this.l = 3;
                                m = wna.m(hurVar2, j, nnaVar, this);
                                if (m == nm6Var) {
                                }
                                if (((Boolean) m).booleanValue()) {
                                }
                            }
                        }
                    } else {
                        hurVar = (hur) this.m;
                        qgg.h0(obj);
                        c = obj;
                    }
                } else {
                    qgg.h0(obj);
                    hurVar = (hur) this.m;
                    this.m = hurVar;
                    this.l = 1;
                    c = g6s.c(hurVar, false, this, 2);
                    if (c == nm6Var) {
                    }
                }
                lfm lfmVar6 = (lfm) c;
                uqn uqnVar2 = new uqn();
                long j2 = lfmVar6.a;
                int i3 = lfmVar6.i;
                pna pnaVar = new pna(uqnVar2, 1);
                this.m = hurVar;
                this.n = uqnVar2;
                this.l = 2;
                e = wna.e(hurVar, j2, i3, pnaVar, this);
                if (e != nm6Var) {
                    hurVar2 = hurVar;
                    uqnVar = uqnVar2;
                    lfmVar = (lfm) e;
                    if (lfmVar != null) {
                    }
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i4 = this.l;
                if (i4 == 0) {
                    qgg.h0(obj);
                    ygp ygpVar2 = (ygp) this.m;
                    Object obj5 = h3f.a.get((h3f) obj4);
                    if (obj5 instanceof ij4) {
                        h3f h3fVar = ((ij4) obj5).e;
                        this.l = 1;
                        ygpVar2.a(h3fVar, this);
                    } else if ((obj5 instanceof iie) && (d = ((iie) obj5).d()) != null) {
                        Object obj6 = a.a.get(d);
                        obj6.getClass();
                        a aVar2 = (a) obj6;
                        ygpVar = ygpVar2;
                        aVar = aVar2;
                        if (!aVar.equals(d)) {
                        }
                    }
                } else if (i4 == 1) {
                    qgg.h0(obj);
                } else if (i4 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    aVar = (ij4) this.o;
                    d = (h8j) this.n;
                    ygpVar = (ygp) this.m;
                    qgg.h0(obj);
                    aVar = aVar.h();
                    if (!aVar.equals(d)) {
                        if (aVar instanceof ij4) {
                            ij4 ij4Var = (ij4) aVar;
                            h3f h3fVar2 = ij4Var.e;
                            this.m = ygpVar;
                            this.n = d;
                            this.o = ij4Var;
                            this.l = 2;
                            ygpVar.a(h3fVar2, this);
                            nm6 nm6Var3 = nm6.a;
                            break;
                        }
                        aVar = aVar.h();
                        if (!aVar.equals(d)) {
                        }
                    }
                }
                break;
            case 2:
                o3k o3kVar = (o3k) obj4;
                nm6 nm6Var4 = nm6.a;
                int i5 = this.l;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            lfm lfmVar7 = (lfm) this.o;
                            lfmVar2 = (lfm) this.n;
                            hurVar4 = (hur) this.m;
                            qgg.h0(obj);
                            lfmVar3 = lfmVar7;
                            Object a3 = obj;
                            ffm ffmVar = (ffm) a3;
                            List list = ffmVar.a;
                            int size = list.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size) {
                                    lfmVar3 = (lfm) ffmVar.a.get(0);
                                } else if (swf.A((lfm) list.get(i6))) {
                                    i6++;
                                }
                            }
                            if (lfmVar3 != null) {
                                gfm gfmVar2 = gfm.a;
                                this.m = hurVar4;
                                this.n = lfmVar2;
                                this.o = lfmVar3;
                                this.l = 2;
                                a3 = hurVar4.a(gfmVar2, this);
                                break;
                            } else {
                                o3kVar.c.setValue(new enj(enj.g(lfmVar3.c, lfmVar2.c)));
                                break;
                            }
                        } else {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        hurVar3 = (hur) this.m;
                        qgg.h0(obj);
                        b = obj;
                    }
                } else {
                    qgg.h0(obj);
                    hurVar3 = (hur) this.m;
                    gfm gfmVar3 = gfm.a;
                    this.m = hurVar3;
                    this.l = 1;
                    b = g6s.b(hurVar3, false, gfmVar3, this);
                    break;
                }
                lfmVar2 = (lfm) b;
                o3kVar.c.setValue(new enj(0L));
                hurVar4 = hurVar3;
                lfmVar3 = null;
                if (lfmVar3 != null) {
                }
            case 3:
                nm6 nm6Var5 = nm6.a;
                int i7 = this.l;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2 && i7 != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj);
                            break;
                        }
                    } else {
                        hurVar5 = (hur) this.m;
                        qgg.h0(obj);
                        I = obj;
                    }
                } else {
                    qgg.h0(obj);
                    hurVar5 = (hur) this.m;
                    this.m = hurVar5;
                    this.l = 1;
                    I = hdg.I(hurVar5, this);
                    break;
                }
                ffm ffmVar2 = (ffm) I;
                if (hdg.b0(ffmVar2) && (ffmVar2.c & 33) != 0) {
                    List list2 = ffmVar2.a;
                    int size2 = list2.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (!((lfm) list2.get(i8)).b()) {
                        }
                    }
                    bfi bfiVar = (bfi) this.n;
                    x0 x0Var = (x0) this.o;
                    this.m = null;
                    this.l = 2;
                    break;
                }
                if (!hdg.b0(ffmVar2)) {
                    this.m = null;
                    this.l = 3;
                    break;
                }
                break;
            default:
                pmr pmrVar2 = (pmr) obj4;
                nm6 nm6Var6 = nm6.a;
                int i9 = this.l;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 == 3) {
                                lfmVar5 = (lfm) this.n;
                                hurVar9 = (hur) this.m;
                                qgg.h0(obj);
                                a2 = obj;
                                List list3 = ((ffm) a2).a;
                                int size3 = list3.size();
                                int i10 = 0;
                                while (true) {
                                    if (i10 < size3) {
                                        obj3 = list3.get(i10);
                                        lfm lfmVar8 = (lfm) obj3;
                                        if (lfmVar8.b() || !ywf.u(lfmVar8.a, lfmVar5.a) || !lfmVar8.d) {
                                            i10++;
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                lfm lfmVar9 = (lfm) obj3;
                                if (lfmVar9 == null) {
                                    break;
                                } else {
                                    lfmVar9.a();
                                    gfm gfmVar4 = gfm.a;
                                    this.m = hurVar9;
                                    this.n = lfmVar5;
                                    this.o = null;
                                    this.l = 3;
                                    a2 = hurVar9.a(gfmVar4, this);
                                    break;
                                }
                            } else {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            gfmVar = (gfm) this.o;
                            lfmVar4 = (lfm) this.n;
                            hurVar7 = (hur) this.m;
                            qgg.h0(obj);
                            a = obj;
                            ffm ffmVar3 = (ffm) a;
                            List list4 = ffmVar3.a;
                            int size4 = list4.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size4) {
                                    obj2 = list4.get(i11);
                                    lfm lfmVar10 = (lfm) obj2;
                                    if (lfmVar10.b()) {
                                        pmrVar = pmrVar2;
                                        hurVar8 = hurVar7;
                                    } else {
                                        hurVar8 = hurVar7;
                                        pmrVar = pmrVar2;
                                        if (ywf.u(lfmVar10.a, lfmVar4.a) && lfmVar10.d) {
                                        }
                                    }
                                    i11++;
                                    hurVar7 = hurVar8;
                                    pmrVar2 = pmrVar;
                                } else {
                                    pmrVar = pmrVar2;
                                    hurVar8 = hurVar7;
                                    obj2 = null;
                                }
                            }
                            lfm lfmVar11 = (lfm) obj2;
                            if (lfmVar11 != null && lfmVar11.b - lfmVar4.b < hurVar8.c().b() && ffmVar3.a() != 2) {
                                if (enj.d(enj.g(lfmVar11.c, lfmVar4.c)) <= hurVar8.c().c()) {
                                    hurVar7 = hurVar8;
                                    pmrVar2 = pmrVar;
                                    this.m = hurVar7;
                                    this.n = lfmVar4;
                                    this.o = gfmVar;
                                    this.l = 2;
                                    a = hurVar7.a(gfmVar, this);
                                    break;
                                }
                            } else {
                                lfmVar11 = null;
                            }
                            if (lfmVar11 == null) {
                                break;
                            } else {
                                pmr pmrVar3 = pmrVar;
                                if (!pmrVar3.r) {
                                    lhb lhbVar = lhb.E;
                                    xci xciVar = pmrVar3.a;
                                    eqi eqiVar = null;
                                    while (true) {
                                        if (xciVar == null) {
                                            if (!pmrVar3.a.n) {
                                                sme.b("visitChildren called on an unattached node");
                                            }
                                            eqi eqiVar2 = new eqi(new xci[16]);
                                            xci xciVar2 = pmrVar3.a;
                                            xci xciVar3 = xciVar2.f;
                                            if (xciVar3 == null) {
                                                bcx.o(eqiVar2, xciVar2);
                                            } else {
                                                eqiVar2.d(xciVar3);
                                            }
                                            while (true) {
                                                int i12 = eqiVar2.c;
                                                if (i12 != 0) {
                                                    xci xciVar4 = (xci) eqiVar2.m(i12 - 1);
                                                    if ((xciVar4.d & 1024) == 0) {
                                                        bcx.o(eqiVar2, xciVar4);
                                                    } else {
                                                        while (true) {
                                                            if (xciVar4 == null) {
                                                                break;
                                                            }
                                                            if ((xciVar4.c & 1024) != 0) {
                                                                eqi eqiVar3 = null;
                                                                while (xciVar4 != null) {
                                                                    if (xciVar4 instanceof dpc) {
                                                                        dpc dpcVar = (dpc) xciVar4;
                                                                        if (dpcVar.T0().a) {
                                                                            dpcVar.W0(7);
                                                                        } else {
                                                                            c9g.y(dpcVar, 7, lhbVar);
                                                                        }
                                                                    } else {
                                                                        if ((xciVar4.c & 1024) != 0 && (xciVar4 instanceof cw7)) {
                                                                            int i13 = 0;
                                                                            for (xci xciVar5 = ((cw7) xciVar4).p; xciVar5 != null; xciVar5 = xciVar5.f) {
                                                                                if ((xciVar5.c & 1024) != 0) {
                                                                                    i13++;
                                                                                    if (i13 == 1) {
                                                                                        xciVar4 = xciVar5;
                                                                                    } else {
                                                                                        if (eqiVar3 == null) {
                                                                                            eqiVar3 = new eqi(new xci[16]);
                                                                                        }
                                                                                        if (xciVar4 != null) {
                                                                                            eqiVar3.d(xciVar4);
                                                                                            xciVar4 = null;
                                                                                        }
                                                                                        eqiVar3.d(xciVar5);
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (i13 == 1) {
                                                                            }
                                                                        }
                                                                        xciVar4 = bcx.p(eqiVar3);
                                                                    }
                                                                }
                                                            } else {
                                                                xciVar4 = xciVar4.f;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (xciVar instanceof dpc) {
                                            dpc dpcVar2 = (dpc) xciVar;
                                            if (dpcVar2.T0().a) {
                                                dpcVar2.W0(7);
                                            } else {
                                                c9g.y(dpcVar2, 7, lhbVar);
                                            }
                                        } else {
                                            if ((xciVar.c & 1024) != 0 && (xciVar instanceof cw7)) {
                                                int i14 = 0;
                                                for (xci xciVar6 = ((cw7) xciVar).p; xciVar6 != null; xciVar6 = xciVar6.f) {
                                                    if ((xciVar6.c & 1024) != 0) {
                                                        i14++;
                                                        if (i14 == 1) {
                                                            xciVar = xciVar6;
                                                        } else {
                                                            if (eqiVar == null) {
                                                                eqiVar = new eqi(new xci[16]);
                                                            }
                                                            if (xciVar != null) {
                                                                eqiVar.d(xciVar);
                                                                xciVar = null;
                                                            }
                                                            eqiVar.d(xciVar6);
                                                        }
                                                    }
                                                }
                                                if (i14 == 1) {
                                                }
                                            }
                                            xciVar = bcx.p(eqiVar);
                                        }
                                    }
                                }
                                pmrVar3.q.invoke();
                                lfmVar11.a();
                                hurVar9 = hurVar8;
                                lfmVar5 = lfmVar4;
                                gfm gfmVar42 = gfm.a;
                                this.m = hurVar9;
                                this.n = lfmVar5;
                                this.o = null;
                                this.l = 3;
                                a2 = hurVar9.a(gfmVar42, this);
                            }
                        }
                    } else {
                        hurVar6 = (hur) this.m;
                        qgg.h0(obj);
                        b2 = obj;
                    }
                } else {
                    qgg.h0(obj);
                    hurVar6 = (hur) this.m;
                    gfm gfmVar5 = gfm.a;
                    this.m = hurVar6;
                    this.l = 1;
                    b2 = g6s.b(hurVar6, true, gfmVar5, this);
                    break;
                }
                lfmVar4 = (lfm) b2;
                int i15 = lfmVar4.i;
                long j3 = lfmVar4.c;
                if (i15 != 3 && i15 != 4) {
                    break;
                } else {
                    int i16 = (int) (j3 >> 32);
                    if (Float.intBitsToFloat(i16) >= 0.0f && Float.intBitsToFloat(i16) < ((int) (hurVar6.f.y >> 32))) {
                        int i17 = (int) (j3 & 4294967295L);
                        if (Float.intBitsToFloat(i17) >= 0.0f && Float.intBitsToFloat(i17) < ((int) (4294967295L & hurVar6.f.y))) {
                            z = true;
                            gfm gfmVar6 = (!pmrVar2.r || z) ? gfm.a : gfm.b;
                            hurVar7 = hurVar6;
                            gfmVar = gfmVar6;
                            this.m = hurVar7;
                            this.n = lfmVar4;
                            this.o = gfmVar;
                            this.l = 2;
                            a = hurVar7.a(gfmVar, this);
                        }
                    }
                    z = false;
                    gfm gfmVar62 = (!pmrVar2.r || z) ? gfm.a : gfm.b;
                    hurVar7 = hurVar6;
                    gfmVar = gfmVar62;
                    this.m = hurVar7;
                    this.n = lfmVar4;
                    this.o = gfmVar;
                    this.l = 2;
                    a = hurVar7.a(gfmVar, this);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rna(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.k = i;
        this.p = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rna(Function2 function2, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.k = 0;
        this.o = function2;
        this.p = function0;
    }
}
