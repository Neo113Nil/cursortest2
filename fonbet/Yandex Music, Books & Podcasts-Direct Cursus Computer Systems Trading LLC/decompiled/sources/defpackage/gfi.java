package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class gfi extends aur implements Function2 {
    public tqn j;
    public tqn k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ uqn o;
    public final /* synthetic */ xqn p;
    public final /* synthetic */ xqn q;
    public final /* synthetic */ float r;
    public final /* synthetic */ d18 s;
    public final /* synthetic */ float t;
    public final /* synthetic */ iyo u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfi(uqn uqnVar, xqn xqnVar, xqn xqnVar2, float f, d18 d18Var, float f2, iyo iyoVar, Continuation continuation) {
        super(2, continuation);
        this.o = uqnVar;
        this.p = xqnVar;
        this.q = xqnVar2;
        this.r = f;
        this.s = d18Var;
        this.t = f2;
        this.u = iyoVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        gfi gfiVar = new gfi(this.o, this.p, this.q, this.r, this.s, this.t, this.u, continuation);
        gfiVar.n = obj;
        return gfiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gfi) create((hyo) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0183 -> B:7:0x0184). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        hyo hyoVar;
        tqn tqnVar;
        uqn uqnVar;
        xqn xqnVar;
        int i;
        int i2;
        hyo hyoVar2;
        tqn tqnVar2;
        xqn xqnVar2;
        int i3;
        char c;
        xqn xqnVar3;
        tqn tqnVar3;
        gfi gfiVar = this;
        nm6 nm6Var = nm6.a;
        int i4 = gfiVar.m;
        xqn xqnVar4 = gfiVar.q;
        uqn uqnVar2 = gfiVar.o;
        char c2 = 3;
        int i5 = 2;
        int i6 = 1;
        xqn xqnVar5 = gfiVar.p;
        if (i4 == 0) {
            qgg.h0(obj);
            hyoVar = (hyo) gfiVar.n;
            tqn tqnVar4 = new tqn();
            tqnVar4.a = true;
            tqnVar = tqnVar4;
            if (!tqnVar.a) {
            }
        } else if (i4 == 1) {
            tqn tqnVar5 = gfiVar.k;
            tqn tqnVar6 = gfiVar.j;
            hyoVar2 = (hyo) gfiVar.n;
            qgg.h0(obj);
            i2 = 2;
            i = 1;
            xqnVar3 = xqnVar5;
            c = 3;
            tqnVar3 = tqnVar6;
            tqnVar5.a = ((Boolean) obj).booleanValue();
            gfiVar = this;
            xqnVar5 = xqnVar3;
            hyoVar = hyoVar2;
            i6 = i;
            c2 = c;
            tqnVar = tqnVar3;
            i5 = i2;
            if (!tqnVar.a) {
            }
        } else if (i4 == 2) {
            i3 = gfiVar.l;
            tqnVar2 = gfiVar.j;
            hyoVar2 = (hyo) gfiVar.n;
            qgg.h0(obj);
            xqnVar = xqnVar4;
            uqnVar = uqnVar2;
            i2 = 2;
            i = 1;
            xqnVar2 = xqnVar5;
            if (tqnVar2.a) {
            }
        } else {
            if (i4 != 3) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tqn tqnVar7 = gfiVar.k;
            tqn tqnVar8 = gfiVar.j;
            hyoVar2 = (hyo) gfiVar.n;
            qgg.h0(obj);
            i2 = 2;
            i = 1;
            xqnVar3 = xqnVar5;
            c = 3;
            tqnVar3 = tqnVar8;
            tqnVar2 = tqnVar7;
            Object c3 = obj;
            tqnVar2.a = ((Boolean) c3).booleanValue();
            xqnVar5 = xqnVar3;
            hyoVar = hyoVar2;
            i6 = i;
            c2 = c;
            tqnVar = tqnVar3;
            i5 = i2;
            if (!tqnVar.a) {
                tqnVar.a = false;
                float floatValue = uqnVar2.a - ((Number) ((vm0) xqnVar5.a).b.getValue()).floatValue();
                boolean z = ((efi) xqnVar4.a).c;
                d18 d18Var = gfiVar.s;
                if (!z) {
                    float abs = Math.abs(floatValue);
                    float f = gfiVar.r;
                    if (abs >= f) {
                        float signum = Math.signum(floatValue) * f;
                        d18.a(d18Var, hyoVar, signum);
                        vm0 vm0Var = (vm0) xqnVar5.a;
                        vm0 Z = wdp.Z(vm0Var, ((Number) vm0Var.b.getValue()).floatValue() + signum, 0.0f, 30);
                        xqnVar5.a = Z;
                        int b = eeh.b(Math.abs(uqnVar2.a - ((Number) Z.b.getValue()).floatValue()) / gfiVar.t);
                        if (b > 100) {
                            b = 100;
                        }
                        vm0 vm0Var2 = (vm0) xqnVar5.a;
                        float f2 = uqnVar2.a;
                        int i7 = b;
                        d18 d18Var2 = gfiVar.s;
                        uqn uqnVar3 = uqnVar2;
                        xqn xqnVar6 = xqnVar4;
                        ii iiVar = new ii(d18Var2, xqnVar6, uqnVar3, gfiVar.u, tqnVar, 24);
                        tqnVar2 = tqnVar;
                        xqnVar = xqnVar6;
                        uqnVar = uqnVar3;
                        gfiVar.n = hyoVar;
                        gfiVar.j = tqnVar2;
                        gfiVar.k = null;
                        gfiVar.l = i7;
                        gfiVar.m = i5;
                        d18Var2.getClass();
                        uqn uqnVar4 = new uqn();
                        uqnVar4.a = ((Number) vm0Var2.b.getValue()).floatValue();
                        Float f3 = new Float(f2);
                        act S = weo.S(i7, 0, nya.d, i5);
                        hyo hyoVar3 = hyoVar;
                        ak0 ak0Var = new ak0(uqnVar4, d18Var2, hyoVar3, iiVar, 19);
                        i2 = i5;
                        i = 1;
                        xqnVar2 = xqnVar5;
                        Object r = v5g.r(vm0Var2, f3, S, true, ak0Var, gfiVar);
                        if (r != nm6.a) {
                            r = Unit.a;
                        }
                        if (r != nm6Var) {
                            i3 = i7;
                            hyoVar2 = hyoVar3;
                            if (tqnVar2.a) {
                                gfiVar.n = hyoVar2;
                                gfiVar.j = tqnVar2;
                                gfiVar.k = tqnVar2;
                                gfiVar.m = 3;
                                c = 3;
                                xqnVar3 = xqnVar2;
                                xqnVar4 = xqnVar;
                                uqnVar2 = uqnVar;
                                c3 = d18.c(gfiVar.s, xqnVar4, uqnVar2, gfiVar.u, xqnVar3, 50 - i3, gfiVar);
                                if (c3 != nm6Var) {
                                    tqnVar3 = tqnVar2;
                                    tqnVar2.a = ((Boolean) c3).booleanValue();
                                    xqnVar5 = xqnVar3;
                                    hyoVar = hyoVar2;
                                    i6 = i;
                                    c2 = c;
                                    tqnVar = tqnVar3;
                                    i5 = i2;
                                    if (!tqnVar.a) {
                                        return Unit.a;
                                    }
                                }
                            } else {
                                xqnVar5 = xqnVar2;
                                hyoVar = hyoVar2;
                                i5 = i2;
                                i6 = i;
                                c2 = 3;
                                xqnVar4 = xqnVar;
                                uqnVar2 = uqnVar;
                                tqnVar = tqnVar2;
                                if (!tqnVar.a) {
                                }
                            }
                        }
                        return nm6Var;
                    }
                }
                hyo hyoVar4 = hyoVar;
                i2 = i5;
                c = c2;
                tqn tqnVar9 = tqnVar;
                i = i6;
                xqnVar3 = xqnVar5;
                d18.a(d18Var, hyoVar4, floatValue);
                gfiVar.n = hyoVar4;
                gfiVar.j = tqnVar9;
                gfiVar.k = tqnVar9;
                gfiVar.m = i;
                Object c4 = d18.c(gfiVar.s, xqnVar4, uqnVar2, gfiVar.u, xqnVar3, 50L, gfiVar);
                if (c4 != nm6Var) {
                    tqnVar3 = tqnVar9;
                    hyoVar2 = hyoVar4;
                    tqnVar9.a = ((Boolean) c4).booleanValue();
                    gfiVar = this;
                    xqnVar5 = xqnVar3;
                    hyoVar = hyoVar2;
                    i6 = i;
                    c2 = c;
                    tqnVar = tqnVar3;
                    i5 = i2;
                    if (!tqnVar.a) {
                    }
                }
                return nm6Var;
            }
        }
    }
}
