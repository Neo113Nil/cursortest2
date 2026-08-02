package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class clc implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ pjc b;
    public final /* synthetic */ aur c;

    /* JADX WARN: Multi-variable type inference failed */
    public clc(pjc pjcVar, Function2 function2, int i) {
        this.a = i;
        switch (i) {
            case 4:
                this.b = pjcVar;
                this.c = (aur) function2;
                break;
            case 5:
            default:
                this.b = pjcVar;
                this.c = (aur) function2;
                break;
            case 6:
                this.b = pjcVar;
                this.c = (aur) function2;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015c  */
    /* JADX WARN: Type inference failed for: r12v15, types: [aur, ryc] */
    /* JADX WARN: Type inference failed for: r1v22, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v23, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v11, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r2v2, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v23, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r4v7, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x011f -> B:54:0x0122). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0131 -> B:57:0x012e). Please report as a decompilation issue!!! */
    @Override // defpackage.pjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(rjc rjcVar, Continuation continuation) {
        blc blcVar;
        nm6 nm6Var;
        int i;
        Throwable th;
        xmo xmoVar;
        clc clcVar;
        rjc rjcVar2;
        pjc pjcVar;
        dlc dlcVar;
        int i2;
        clc clcVar2;
        Throwable th2;
        hlc hlcVar;
        int i3;
        long j;
        clc clcVar3;
        clc clcVar4;
        rjc rjcVar3;
        Throwable th3;
        Serializable J;
        olc olcVar;
        int i4;
        qlc qlcVar;
        switch (this.a) {
            case 0:
                if (continuation instanceof blc) {
                    blcVar = (blc) continuation;
                    int i5 = blcVar.k;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        blcVar.k = i5 - Integer.MIN_VALUE;
                        Object obj = blcVar.j;
                        nm6Var = nm6.a;
                        i = blcVar.k;
                        if (i != 0) {
                            qgg.h0(obj);
                            xmo xmoVar2 = new xmo(rjcVar, blcVar.getContext());
                            try {
                                ?? r2 = this.c;
                                blcVar.m = this;
                                blcVar.n = rjcVar;
                                blcVar.o = xmoVar2;
                                blcVar.k = 1;
                                if (r2.invoke(xmoVar2, blcVar) == nm6Var) {
                                    return nm6Var;
                                }
                                clcVar = this;
                                rjcVar2 = rjcVar;
                                xmoVar = xmoVar2;
                            } catch (Throwable th4) {
                                th = th4;
                                xmoVar = xmoVar2;
                                xmoVar.releaseIntercepted();
                                throw th;
                            }
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    qgg.h0(obj);
                                    return Unit.a;
                                }
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            xmoVar = blcVar.o;
                            rjcVar2 = blcVar.n;
                            clcVar = blcVar.m;
                            try {
                                qgg.h0(obj);
                            } catch (Throwable th5) {
                                th = th5;
                                xmoVar.releaseIntercepted();
                                throw th;
                            }
                        }
                        xmoVar.releaseIntercepted();
                        pjcVar = clcVar.b;
                        blcVar.m = null;
                        blcVar.n = null;
                        blcVar.o = null;
                        blcVar.k = 2;
                        if (pjcVar.collect(rjcVar2, blcVar) == nm6Var) {
                            return nm6Var;
                        }
                        return Unit.a;
                    }
                }
                blcVar = new blc(this, continuation);
                Object obj2 = blcVar.j;
                nm6Var = nm6.a;
                i = blcVar.k;
                if (i != 0) {
                }
                xmoVar.releaseIntercepted();
                pjcVar = clcVar.b;
                blcVar.m = null;
                blcVar.n = null;
                blcVar.o = null;
                blcVar.k = 2;
                if (pjcVar.collect(rjcVar2, blcVar) == nm6Var) {
                }
                return Unit.a;
            case 1:
                if (continuation instanceof dlc) {
                    dlcVar = (dlc) continuation;
                    int i6 = dlcVar.k;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        dlcVar.k = i6 - Integer.MIN_VALUE;
                        Object obj3 = dlcVar.j;
                        Object obj4 = nm6.a;
                        i2 = dlcVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            dlcVar.m = this;
                            dlcVar.n = rjcVar;
                            dlcVar.k = 1;
                            obj3 = zsd.J(this.b, rjcVar, dlcVar);
                            if (obj3 == obj4) {
                                return obj4;
                            }
                            clcVar2 = this;
                        } else {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    qgg.h0(obj3);
                                    return Unit.a;
                                }
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            rjcVar = dlcVar.n;
                            clcVar2 = dlcVar.m;
                            qgg.h0(obj3);
                        }
                        th2 = (Throwable) obj3;
                        if (th2 != null) {
                            ?? r22 = clcVar2.c;
                            dlcVar.m = null;
                            dlcVar.n = null;
                            dlcVar.k = 2;
                            if (r22.invoke(rjcVar, th2, dlcVar) == obj4) {
                                return obj4;
                            }
                        }
                        return Unit.a;
                    }
                }
                dlcVar = new dlc(this, continuation);
                Object obj32 = dlcVar.j;
                Object obj42 = nm6.a;
                i2 = dlcVar.k;
                if (i2 != 0) {
                }
                th2 = (Throwable) obj32;
                if (th2 != null) {
                }
                return Unit.a;
            case 2:
                if (continuation instanceof hlc) {
                    hlcVar = (hlc) continuation;
                    int i7 = hlcVar.k;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        hlcVar.k = i7 - Integer.MIN_VALUE;
                        Object obj5 = hlcVar.j;
                        nm6 nm6Var2 = nm6.a;
                        i3 = hlcVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj5);
                            j = 0;
                            clcVar3 = this;
                            pjc pjcVar2 = clcVar3.b;
                            hlcVar.m = clcVar3;
                            hlcVar.n = rjcVar;
                            hlcVar.o = null;
                            hlcVar.p = j;
                            hlcVar.k = 1;
                            J = zsd.J(pjcVar2, rjcVar, hlcVar);
                            if (J != nm6Var2) {
                            }
                        } else if (i3 == 1) {
                            j = hlcVar.p;
                            rjcVar = hlcVar.n;
                            clc clcVar5 = hlcVar.m;
                            qgg.h0(obj5);
                            clcVar4 = clcVar5;
                            rjcVar3 = rjcVar;
                            th3 = (Throwable) obj5;
                            if (th3 == null) {
                            }
                        } else {
                            if (i3 != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j = hlcVar.p;
                            th3 = hlcVar.o;
                            rjcVar3 = hlcVar.n;
                            clcVar4 = hlcVar.m;
                            qgg.h0(obj5);
                            if (!((Boolean) obj5).booleanValue()) {
                                j++;
                                boolean z = true;
                                clcVar3 = clcVar4;
                                if (z) {
                                    return Unit.a;
                                }
                                rjcVar = rjcVar3;
                                pjc pjcVar22 = clcVar3.b;
                                hlcVar.m = clcVar3;
                                hlcVar.n = rjcVar;
                                hlcVar.o = null;
                                hlcVar.p = j;
                                hlcVar.k = 1;
                                J = zsd.J(pjcVar22, rjcVar, hlcVar);
                                if (J != nm6Var2) {
                                    return nm6Var2;
                                }
                                clcVar4 = clcVar3;
                                obj5 = J;
                                rjcVar3 = rjcVar;
                                th3 = (Throwable) obj5;
                                if (th3 == null) {
                                    ?? r12 = clcVar4.c;
                                    Long l = new Long(j);
                                    hlcVar.m = clcVar4;
                                    hlcVar.n = rjcVar3;
                                    hlcVar.o = th3;
                                    hlcVar.p = j;
                                    hlcVar.k = 2;
                                    obj5 = r12.invoke(rjcVar3, th3, l, hlcVar);
                                    if (obj5 == nm6Var2) {
                                        return nm6Var2;
                                    }
                                    if (!((Boolean) obj5).booleanValue()) {
                                        throw th3;
                                    }
                                } else {
                                    z = false;
                                    clcVar3 = clcVar4;
                                    if (z) {
                                    }
                                }
                            }
                        }
                    }
                }
                hlcVar = new hlc(this, continuation);
                Object obj52 = hlcVar.j;
                nm6 nm6Var22 = nm6.a;
                i3 = hlcVar.k;
                if (i3 != 0) {
                }
            case 3:
                Object collect = this.b.collect(new tl0(new tqn(), rjcVar, (Function2) this.c), continuation);
                return collect == nm6.a ? collect : Unit.a;
            case 4:
                if (continuation instanceof olc) {
                    olcVar = (olc) continuation;
                    int i8 = olcVar.k;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        olcVar.k = i8 - Integer.MIN_VALUE;
                        Object obj6 = olcVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i4 = olcVar.k;
                        if (i4 != 0) {
                            qgg.h0(obj6);
                            pjc pjcVar3 = this.b;
                            qlc qlcVar2 = new qlc((Function2) this.c, rjcVar);
                            try {
                                olcVar.m = qlcVar2;
                                olcVar.k = 1;
                                if (pjcVar3.collect(qlcVar2, olcVar) == nm6Var3) {
                                    return nm6Var3;
                                }
                            } catch (p2 e) {
                                e = e;
                                qlcVar = qlcVar2;
                                if (e.a == qlcVar) {
                                    throw e;
                                }
                                saf.K(olcVar.getContext());
                                return Unit.a;
                            }
                        } else {
                            if (i4 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qlcVar = olcVar.m;
                            try {
                                qgg.h0(obj6);
                            } catch (p2 e2) {
                                e = e2;
                                if (e.a == qlcVar) {
                                }
                            }
                        }
                        return Unit.a;
                    }
                }
                olcVar = new olc(this, continuation);
                Object obj62 = olcVar.j;
                nm6 nm6Var32 = nm6.a;
                i4 = olcVar.k;
                if (i4 != 0) {
                }
                return Unit.a;
            case 5:
                Object collect2 = this.b.collect(new qlc(rjcVar, (Function1) this.c), continuation);
                return collect2 == nm6.a ? collect2 : Unit.a;
            default:
                Object collect3 = this.b.collect(new qlc(rjcVar, (Function2) this.c), continuation);
                return collect3 == nm6.a ? collect3 : Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public clc(pjc pjcVar, ryc rycVar) {
        this.a = 2;
        this.b = pjcVar;
        this.c = (aur) rycVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public clc(pjc pjcVar, Function1 function1) {
        this.a = 5;
        this.b = pjcVar;
        this.c = (aur) function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public clc(pjc pjcVar, Function2 function2) {
        this.a = 0;
        this.c = (aur) function2;
        this.b = pjcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public clc(pjc pjcVar, pyc pycVar) {
        this.a = 1;
        this.b = pjcVar;
        this.c = (aur) pycVar;
    }
}
