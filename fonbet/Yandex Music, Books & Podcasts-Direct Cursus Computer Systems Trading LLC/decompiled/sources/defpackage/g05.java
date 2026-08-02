package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class g05 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ e15 c;
    public final /* synthetic */ Integer d;

    public /* synthetic */ g05(rjc rjcVar, e15 e15Var, Integer num, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = e15Var;
        this.d = num;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        f05 f05Var;
        Object obj2;
        nm6 nm6Var;
        int i;
        int i2;
        rjc rjcVar;
        s05 s05Var;
        s05 s05Var2;
        Object obj3;
        nm6 nm6Var2;
        int i3;
        rjc rjcVar2;
        int i4;
        t05 t05Var;
        Object obj4;
        nm6 nm6Var3;
        int i5;
        int i6;
        rjc rjcVar3;
        switch (this.a) {
            case 0:
                if (continuation instanceof f05) {
                    f05Var = (f05) continuation;
                    int i7 = f05Var.k;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        f05Var.k = i7 - Integer.MIN_VALUE;
                        obj2 = f05Var.j;
                        nm6Var = nm6.a;
                        i = f05Var.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            rjc rjcVar4 = this.b;
                            f05Var.m = rjcVar4;
                            i2 = 0;
                            f05Var.n = 0;
                            f05Var.k = 1;
                            Object V = x97.V(dm6.b, new e05(this.c, this.d, (Continuation) null), f05Var);
                            if (V != nm6Var) {
                                rjcVar = rjcVar4;
                                obj2 = V;
                            }
                        } else if (i == 1) {
                            i2 = f05Var.n;
                            rjcVar = f05Var.m;
                            qgg.h0(obj2);
                        } else if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj2);
                            break;
                        }
                        f05Var.m = null;
                        f05Var.n = i2;
                        f05Var.k = 2;
                        if (rjcVar.emit(obj2, f05Var) == nm6Var) {
                        }
                    }
                }
                f05Var = new f05(this, continuation);
                obj2 = f05Var.j;
                nm6Var = nm6.a;
                i = f05Var.k;
                if (i != 0) {
                }
                f05Var.m = null;
                f05Var.n = i2;
                f05Var.k = 2;
                if (rjcVar.emit(obj2, f05Var) == nm6Var) {
                }
                break;
            case 1:
                if (continuation instanceof s05) {
                    s05Var = (s05) continuation;
                    int i8 = s05Var.k;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        s05Var.k = i8 - Integer.MIN_VALUE;
                        s05Var2 = s05Var;
                        obj3 = s05Var2.j;
                        nm6Var2 = nm6.a;
                        i3 = s05Var2.k;
                        if (i3 != 0) {
                            qgg.h0(obj3);
                            Boolean bool = Boolean.TRUE;
                            rjc rjcVar5 = this.b;
                            s05Var2.m = rjcVar5;
                            s05Var2.n = 0;
                            s05Var2.k = 1;
                            Object e = e15.e(this.c, null, bool, this.d, s05Var2, 17);
                            if (e != nm6Var2) {
                                rjcVar2 = rjcVar5;
                                obj3 = e;
                                i4 = 0;
                            }
                        } else if (i3 == 1) {
                            i4 = s05Var2.n;
                            rjcVar2 = s05Var2.m;
                            qgg.h0(obj3);
                        } else if (i3 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                            break;
                        }
                        s05Var2.m = null;
                        s05Var2.n = i4;
                        s05Var2.k = 2;
                        if (rjcVar2.emit(obj3, s05Var2) == nm6Var2) {
                        }
                    }
                }
                s05Var = new s05(this, continuation);
                s05Var2 = s05Var;
                obj3 = s05Var2.j;
                nm6Var2 = nm6.a;
                i3 = s05Var2.k;
                if (i3 != 0) {
                }
                s05Var2.m = null;
                s05Var2.n = i4;
                s05Var2.k = 2;
                if (rjcVar2.emit(obj3, s05Var2) == nm6Var2) {
                }
                break;
            default:
                if (continuation instanceof t05) {
                    t05Var = (t05) continuation;
                    int i9 = t05Var.k;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        t05Var.k = i9 - Integer.MIN_VALUE;
                        obj4 = t05Var.j;
                        nm6Var3 = nm6.a;
                        i5 = t05Var.k;
                        if (i5 != 0) {
                            qgg.h0(obj4);
                            Boolean bool2 = Boolean.TRUE;
                            rjc rjcVar6 = this.b;
                            t05Var.m = rjcVar6;
                            i6 = 0;
                            t05Var.n = 0;
                            t05Var.k = 1;
                            Object V2 = x97.V(dm6.b, new q05(this.c, this.d, bool2, bool2, null, null, null), t05Var);
                            if (V2 != nm6Var3) {
                                rjcVar3 = rjcVar6;
                                obj4 = V2;
                            }
                        } else if (i5 == 1) {
                            i6 = t05Var.n;
                            rjcVar3 = t05Var.m;
                            qgg.h0(obj4);
                        } else if (i5 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj4);
                            break;
                        }
                        t05Var.m = null;
                        t05Var.n = i6;
                        t05Var.k = 2;
                        if (rjcVar3.emit(obj4, t05Var) == nm6Var3) {
                        }
                    }
                }
                t05Var = new t05(this, continuation);
                obj4 = t05Var.j;
                nm6Var3 = nm6.a;
                i5 = t05Var.k;
                if (i5 != 0) {
                }
                t05Var.m = null;
                t05Var.n = i6;
                t05Var.k = 2;
                if (rjcVar3.emit(obj4, t05Var) == nm6Var3) {
                }
                break;
        }
        return Unit.a;
    }
}
