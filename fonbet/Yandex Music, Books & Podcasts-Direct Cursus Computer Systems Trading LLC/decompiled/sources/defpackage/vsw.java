package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class vsw implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ ysw b;

    public /* synthetic */ vsw(ysw yswVar, int i) {
        this.a = i;
        this.b = yswVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x01e8, code lost:
    
        if (defpackage.ysw.a(r3, r2, r7) != r8) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x016b, code lost:
    
        if (((defpackage.oqw) r6).a(r4, r7) == r8) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e5, code lost:
    
        if (r10 != r8) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(vkw vkwVar, Continuation continuation) {
        usw uswVar;
        int i;
        gfw c;
        gfw gfwVar;
        fmw fmwVar;
        Object G0;
        gfw gfwVar2;
        vkw vkwVar2;
        int i2;
        vkw vkwVar3 = vkwVar;
        ysw yswVar = this.b;
        qfw qfwVar = yswVar.a;
        amw amwVar = yswVar.f;
        jqw jqwVar = yswVar.g;
        if (continuation instanceof usw) {
            uswVar = (usw) continuation;
            int i3 = uswVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uswVar.p = i3 - Integer.MIN_VALUE;
                Object obj = uswVar.n;
                nm6 nm6Var = nm6.a;
                i = uswVar.p;
                Continuation continuation2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    c = yswVar.c();
                    if (c == vkwVar3.a && (vkwVar3 instanceof tkw)) {
                        g4q g4qVar = amwVar.b().a;
                        if ((g4qVar != null ? (vdr) zdg.p(g4qVar, new qcm()) : null) == null) {
                            iqw[] iqwVarArr = {iqw.a, iqw.b};
                            uswVar.j = vkwVar3;
                            uswVar.k = c;
                            uswVar.p = 1;
                            if (((oqw) jqwVar).a(iqwVarArr, uswVar) != nm6Var) {
                                gfwVar = c;
                            }
                            return nm6Var;
                        }
                    }
                    gfwVar2 = vkwVar3.a;
                    if (c != gfwVar2) {
                    }
                } else if (i == 1) {
                    gfw gfwVar3 = uswVar.k;
                    vkw vkwVar4 = uswVar.j;
                    qgg.h0(obj);
                    gfwVar = gfwVar3;
                    vkwVar3 = vkwVar4;
                } else {
                    if (i == 2) {
                        fmw fmwVar2 = uswVar.l;
                        gfwVar = uswVar.k;
                        vkw vkwVar5 = uswVar.j;
                        qgg.h0(obj);
                        G0 = obj;
                        fmwVar = fmwVar2;
                        vkwVar3 = vkwVar5;
                        ((hmw) fmwVar).f((vdr) G0, new cmw());
                        c = gfwVar;
                        gfwVar2 = vkwVar3.a;
                        if (c != gfwVar2) {
                            return Unit.a;
                        }
                        ssg.a(3, ysw.k, "transition: " + c + " -> " + gfwVar2, null);
                        sqw sqwVar = (sqw) qfwVar.F.getValue();
                        int i4 = (((eew) yswVar.h).a() || (sqwVar != null && sqwVar.a().a.size() > 1 && sqwVar.a().d.g)) ? 1 : 0;
                        if (!vkwVar3.equals(ukw.b)) {
                            if (vkwVar3 instanceof rkw) {
                                if (i4 != 0) {
                                    iqw[] iqwVarArr2 = {iqw.a};
                                    uswVar.j = vkwVar3;
                                    uswVar.k = null;
                                    uswVar.l = null;
                                    uswVar.m = i4;
                                    uswVar.p = 3;
                                }
                            } else {
                                if (!(vkwVar3 instanceof skw)) {
                                    if (!(vkwVar3 instanceof tkw)) {
                                        b6e.s();
                                        return null;
                                    }
                                    iqw[] iqwVarArr3 = {iqw.a, iqw.b};
                                    uswVar.j = vkwVar3;
                                    uswVar.k = null;
                                    uswVar.l = null;
                                    uswVar.m = i4;
                                    uswVar.p = 4;
                                    if (((oqw) jqwVar).a(iqwVarArr3, uswVar) != nm6Var) {
                                        vkwVar2 = vkwVar3;
                                        i2 = i4;
                                        pqw pqwVar = ((tkw) vkwVar2).b;
                                        uswVar.j = null;
                                        uswVar.k = null;
                                        uswVar.l = null;
                                        uswVar.m = i2;
                                        uswVar.p = 5;
                                    }
                                    return nm6Var;
                                }
                                if (i4 != 0) {
                                    g4q g4qVar2 = amwVar.b().a;
                                    if (g4qVar2 == null) {
                                        return Unit.a;
                                    }
                                    vdr vdrVar = (vdr) zdg.p(g4qVar2, new qcm());
                                    if (vdrVar == null) {
                                        return Unit.a;
                                    }
                                    yswVar.e((pqw) vdrVar.getValue(), new ssw(new emw(true)));
                                }
                            }
                        }
                        return Unit.a;
                    }
                    if (i == 3) {
                        vkwVar3 = uswVar.j;
                        qgg.h0(obj);
                        yswVar.e(((rkw) vkwVar3).b, new ssw(null));
                        return Unit.a;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    i2 = uswVar.m;
                    vkwVar2 = uswVar.j;
                    qgg.h0(obj);
                    pqw pqwVar2 = ((tkw) vkwVar2).b;
                    uswVar.j = null;
                    uswVar.k = null;
                    uswVar.l = null;
                    uswVar.m = i2;
                    uswVar.p = 5;
                }
                fmwVar = yswVar.e;
                clc clcVar = new clc(new vpw(qfwVar.F, 10), new rhw(vkwVar3, continuation2, 5));
                uswVar.j = vkwVar3;
                uswVar.k = gfwVar;
                uswVar.l = fmwVar;
                uswVar.p = 2;
                G0 = zsd.G0(clcVar, cmd.a, uswVar);
            }
        }
        uswVar = new usw(this, continuation);
        Object obj2 = uswVar.n;
        nm6 nm6Var2 = nm6.a;
        i = uswVar.p;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        fmwVar = yswVar.e;
        clc clcVar2 = new clc(new vpw(qfwVar.F, 10), new rhw(vkwVar3, continuation22, 5));
        uswVar.j = vkwVar3;
        uswVar.k = gfwVar;
        uswVar.l = fmwVar;
        uswVar.p = 2;
        G0 = zsd.G0(clcVar2, cmd.a, uswVar);
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return b((vkw) obj, continuation);
            default:
                qfw qfwVar = this.b.a;
                int ordinal = ((iqw) obj).ordinal();
                if (ordinal == 0) {
                    qfw.j(qfwVar, null, null, 6);
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    sqw sqwVar = (sqw) qfwVar.F.getValue();
                    how a = sqwVar != null ? sqwVar.a() : null;
                    qfw.j(qfwVar, a != null ? a.d.a : null, null, 6);
                }
                return Unit.a;
        }
    }
}
