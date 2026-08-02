package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class qlc implements rjc {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ aur c;

    /* JADX WARN: Multi-variable type inference failed */
    public qlc(rjc rjcVar, Function1 function1) {
        this.b = rjcVar;
        this.c = (aur) function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0102  */
    /* JADX WARN: Type inference failed for: r2v15, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r9v10, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r9v2, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        plc plcVar;
        int i;
        boolean z;
        Object obj2;
        Object obj3;
        qlc qlcVar;
        b5h b5hVar;
        Object obj4;
        nm6 nm6Var;
        int i2;
        rjc rjcVar;
        int i3;
        a4k a4kVar;
        Object obj5;
        nm6 nm6Var2;
        int i4;
        rjc rjcVar2;
        switch (this.a) {
            case 0:
                if (continuation instanceof plc) {
                    plcVar = (plc) continuation;
                    int i5 = plcVar.l;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        plcVar.l = i5 - Integer.MIN_VALUE;
                        Object obj6 = plcVar.k;
                        nm6 nm6Var3 = nm6.a;
                        i = plcVar.l;
                        z = true;
                        if (i != 0) {
                            qgg.h0(obj6);
                            plcVar.j = this;
                            plcVar.n = obj;
                            plcVar.l = 1;
                            Object invoke = this.c.invoke(obj, plcVar);
                            if (invoke == nm6Var3) {
                                return nm6Var3;
                            }
                            obj2 = invoke;
                            obj3 = obj;
                            qlcVar = this;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                qlcVar = plcVar.j;
                                qgg.h0(obj6);
                                if (z) {
                                    return Unit.a;
                                }
                                throw new p2(qlcVar);
                            }
                            Object obj7 = plcVar.n;
                            qlc qlcVar2 = plcVar.j;
                            qgg.h0(obj6);
                            obj3 = obj7;
                            qlcVar = qlcVar2;
                            obj2 = obj6;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            z = false;
                        } else {
                            rjc rjcVar3 = qlcVar.b;
                            plcVar.j = qlcVar;
                            plcVar.n = null;
                            plcVar.l = 2;
                            if (rjcVar3.emit(obj3, plcVar) == nm6Var3) {
                                return nm6Var3;
                            }
                        }
                        if (z) {
                        }
                    }
                }
                plcVar = new plc(this, continuation);
                Object obj62 = plcVar.k;
                nm6 nm6Var32 = nm6.a;
                i = plcVar.l;
                z = true;
                if (i != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z) {
                }
            case 1:
                if (continuation instanceof b5h) {
                    b5hVar = (b5h) continuation;
                    int i6 = b5hVar.k;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        b5hVar.k = i6 - Integer.MIN_VALUE;
                        obj4 = b5hVar.j;
                        nm6Var = nm6.a;
                        i2 = b5hVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj4);
                            rjcVar = this.b;
                            b5hVar.m = rjcVar;
                            i3 = 0;
                            b5hVar.n = 0;
                            b5hVar.k = 1;
                            obj4 = this.c.invoke(b5hVar);
                            if (obj4 == nm6Var) {
                                return nm6Var;
                            }
                        } else {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    qgg.h0(obj4);
                                    return Unit.a;
                                }
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i3 = b5hVar.n;
                            rjcVar = b5hVar.m;
                            qgg.h0(obj4);
                        }
                        b5hVar.m = null;
                        b5hVar.n = i3;
                        b5hVar.k = 2;
                        if (rjcVar.emit(obj4, b5hVar) == nm6Var) {
                            return nm6Var;
                        }
                        return Unit.a;
                    }
                }
                b5hVar = new b5h(this, continuation);
                obj4 = b5hVar.j;
                nm6Var = nm6.a;
                i2 = b5hVar.k;
                if (i2 != 0) {
                }
                b5hVar.m = null;
                b5hVar.n = i3;
                b5hVar.k = 2;
                if (rjcVar.emit(obj4, b5hVar) == nm6Var) {
                }
                return Unit.a;
            default:
                if (continuation instanceof a4k) {
                    a4kVar = (a4k) continuation;
                    int i7 = a4kVar.k;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        a4kVar.k = i7 - Integer.MIN_VALUE;
                        obj5 = a4kVar.j;
                        nm6Var2 = nm6.a;
                        i4 = a4kVar.k;
                        if (i4 != 0) {
                            qgg.h0(obj5);
                            rjc rjcVar4 = this.b;
                            a4kVar.l = rjcVar4;
                            a4kVar.k = 1;
                            Object c = ((g1k) obj).c(this.c, a4kVar);
                            if (c == nm6Var2) {
                                return nm6Var2;
                            }
                            obj5 = c;
                            rjcVar2 = rjcVar4;
                        } else {
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    qgg.h0(obj5);
                                    return Unit.a;
                                }
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            rjcVar2 = a4kVar.l;
                            qgg.h0(obj5);
                        }
                        a4kVar.l = null;
                        a4kVar.k = 2;
                        if (rjcVar2.emit(obj5, a4kVar) == nm6Var2) {
                            return nm6Var2;
                        }
                        return Unit.a;
                    }
                }
                a4kVar = new a4k(this, continuation);
                obj5 = a4kVar.j;
                nm6Var2 = nm6.a;
                i4 = a4kVar.k;
                if (i4 != 0) {
                }
                a4kVar.l = null;
                a4kVar.k = 2;
                if (rjcVar2.emit(obj5, a4kVar) == nm6Var2) {
                }
                return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qlc(rjc rjcVar, Function2 function2) {
        this.b = rjcVar;
        this.c = (aur) function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qlc(Function2 function2, rjc rjcVar) {
        this.c = (aur) function2;
        this.b = rjcVar;
    }
}
