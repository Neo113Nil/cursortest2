package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class dyo {
    public final mxo a;
    public final mm6 b;
    public final j5n c;
    public rar d;
    public final zi3 e;

    public dyo(fvf fvfVar, mm6 mm6Var, j5n j5nVar) {
        fvfVar.getClass();
        this.a = fvfVar;
        this.b = mm6Var;
        this.c = j5nVar;
        this.e = men.g(-1, 6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0119, code lost:
    
        if (defpackage.neg.g(r2, r10, r4, r1) == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005a, code lost:
    
        r2 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:31:0x00ce, B:34:0x00e4], limit reached: 52 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r11v1, types: [aur, kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(dyo dyoVar, cg6 cg6Var) {
        ayo ayoVar;
        dyo dyoVar2;
        nm6 nm6Var;
        int i;
        zxo zxoVar;
        dyo dyoVar3;
        yxo yxoVar;
        Function0 function0;
        float f;
        int ordinal;
        boolean c;
        zxo zxoVar2;
        ?? r11;
        dyoVar.getClass();
        if (cg6Var instanceof ayo) {
            ayoVar = (ayo) cg6Var;
            int i2 = ayoVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ayoVar.q = i2 - Integer.MIN_VALUE;
                dyoVar2 = dyoVar;
                Object obj = ayoVar.o;
                nm6Var = nm6.a;
                i = ayoVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    zxoVar = null;
                } else {
                    if (i == 1) {
                        f = ayoVar.n;
                        function0 = (Function0) ayoVar.m;
                        yxoVar = ayoVar.l;
                        zxo zxoVar3 = ayoVar.k;
                        dyoVar3 = ayoVar.j;
                        qgg.h0(obj);
                        zxoVar = zxoVar3;
                        mxo mxoVar = dyoVar3.a;
                        ordinal = yxoVar.ordinal();
                        if (ordinal == 0) {
                            c = mxoVar.c();
                        } else {
                            if (ordinal != 1) {
                                b6e.s();
                                return null;
                            }
                            c = mxoVar.d();
                        }
                        if (c) {
                            float floatValue = ((Number) function0.invoke()).floatValue();
                            if (floatValue <= 0.0f) {
                                ayoVar.j = dyoVar3;
                                ayoVar.k = zxoVar;
                                ayoVar.l = null;
                                ayoVar.m = null;
                                ayoVar.q = 2;
                                if (y2x.o(100L, ayoVar) != nm6Var) {
                                    dyoVar2 = dyoVar3;
                                }
                                return nm6Var;
                            }
                            float f2 = floatValue / f;
                            long f3 = yhn.f((long) f2, 1L, 100L);
                            float f4 = (f3 / f2) * floatValue;
                            int ordinal2 = yxoVar.ordinal();
                            if (ordinal2 == 0) {
                                f4 = -f4;
                            } else if (ordinal2 != 1) {
                                b6e.s();
                                return null;
                            }
                            mxo mxoVar2 = dyoVar3.a;
                            act S = weo.S((int) f3, 0, nya.d, 2);
                            ayoVar.j = dyoVar3;
                            ayoVar.k = zxoVar;
                            ayoVar.l = null;
                            ayoVar.m = null;
                            ayoVar.q = 3;
                        }
                        return Unit.a;
                    }
                    if (i != 2 && i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zxo zxoVar4 = ayoVar.k;
                    dyo dyoVar4 = ayoVar.j;
                    qgg.h0(obj);
                    zxoVar = zxoVar4;
                    dyoVar2 = dyoVar4;
                }
                zxoVar2 = (zxo) gd4.b(dyoVar2.e.k());
                if (zxoVar2 != null) {
                    zxoVar = zxoVar2;
                }
                if (zxoVar != null && !zxoVar.equals(zxo.e)) {
                    yxoVar = zxoVar.a;
                    float f5 = zxoVar.b;
                    uif uifVar = zxoVar.c;
                    r11 = zxoVar.d;
                    float floatValue2 = (((Number) dyoVar2.c.invoke()).floatValue() * f5) / 1000.0f;
                    ayoVar.j = dyoVar2;
                    ayoVar.k = zxoVar;
                    ayoVar.l = yxoVar;
                    ayoVar.m = uifVar;
                    ayoVar.n = floatValue2;
                    ayoVar.q = 1;
                    if (r11.invoke(ayoVar) != nm6Var) {
                        dyoVar3 = dyoVar2;
                        f = floatValue2;
                        function0 = uifVar;
                        mxo mxoVar3 = dyoVar3.a;
                        ordinal = yxoVar.ordinal();
                        if (ordinal == 0) {
                        }
                        if (c) {
                        }
                    }
                    return nm6Var;
                }
                return Unit.a;
            }
        }
        dyoVar2 = dyoVar;
        ayoVar = new ayo(dyoVar2, cg6Var);
        Object obj2 = ayoVar.o;
        nm6Var = nm6.a;
        i = ayoVar.q;
        if (i != 0) {
        }
        zxoVar2 = (zxo) gd4.b(dyoVar2.e.k());
        if (zxoVar2 != null) {
        }
        if (zxoVar != null) {
            yxoVar = zxoVar.a;
            float f52 = zxoVar.b;
            uif uifVar2 = zxoVar.c;
            r11 = zxoVar.d;
            float floatValue22 = (((Number) dyoVar2.c.invoke()).floatValue() * f52) / 1000.0f;
            ayoVar.j = dyoVar2;
            ayoVar.k = zxoVar;
            ayoVar.l = yxoVar;
            ayoVar.m = uifVar2;
            ayoVar.n = floatValue22;
            ayoVar.q = 1;
            if (r11.invoke(ayoVar) != nm6Var) {
            }
            return nm6Var;
        }
        return Unit.a;
    }

    public final boolean b(yxo yxoVar, float f, Function0 function0, Function1 function1) {
        boolean c;
        int ordinal = yxoVar.ordinal();
        mxo mxoVar = this.a;
        if (ordinal == 0) {
            c = mxoVar.c();
        } else {
            if (ordinal != 1) {
                b6e.s();
                return false;
            }
            c = mxoVar.d();
        }
        if (!c) {
            return false;
        }
        if (this.d == null) {
            this.d = x97.y(this.b, null, null, new byo(this, null, 0), 3);
        }
        this.e.c(new zxo(yxoVar, f, function0, function1));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var) {
        cyo cyoVar;
        int i;
        dyo dyoVar;
        rar rarVar;
        dyo dyoVar2;
        if (cg6Var instanceof cyo) {
            cyoVar = (cyo) cg6Var;
            int i2 = cyoVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cyoVar.m = i2 - Integer.MIN_VALUE;
                Object obj = cyoVar.k;
                nm6 nm6Var = nm6.a;
                i = cyoVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    zxo zxoVar = zxo.e;
                    cyoVar.j = this;
                    cyoVar.m = 1;
                    if (this.e.m(zxoVar, cyoVar) != nm6Var) {
                        dyoVar = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dyoVar2 = cyoVar.j;
                    qgg.h0(obj);
                    dyoVar = dyoVar2;
                    dyoVar.d = null;
                    return Unit.a;
                }
                dyoVar = cyoVar.j;
                qgg.h0(obj);
                rarVar = dyoVar.d;
                if (rarVar != null) {
                    cyoVar.j = dyoVar;
                    cyoVar.m = 2;
                    if (saf.C(rarVar, cyoVar) != nm6Var) {
                        dyoVar2 = dyoVar;
                        dyoVar = dyoVar2;
                    }
                    return nm6Var;
                }
                dyoVar.d = null;
                return Unit.a;
            }
        }
        cyoVar = new cyo(this, cg6Var);
        Object obj2 = cyoVar.k;
        nm6 nm6Var2 = nm6.a;
        i = cyoVar.m;
        if (i != 0) {
        }
        rarVar = dyoVar.d;
        if (rarVar != null) {
        }
        dyoVar.d = null;
        return Unit.a;
    }
}
