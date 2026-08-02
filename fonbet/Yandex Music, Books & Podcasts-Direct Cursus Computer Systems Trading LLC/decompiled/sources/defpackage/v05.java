package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class v05 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ e15 c;

    public /* synthetic */ v05(rjc rjcVar, e15 e15Var, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = e15Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        u05 u05Var;
        u05 u05Var2;
        Object obj2;
        nm6 nm6Var;
        int i;
        rjc rjcVar;
        int i2;
        c15 c15Var;
        Object obj3;
        nm6 nm6Var2;
        int i3;
        rjc rjcVar2;
        int i4;
        switch (this.a) {
            case 0:
                if (continuation instanceof u05) {
                    u05Var = (u05) continuation;
                    int i5 = u05Var.k;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        u05Var.k = i5 - Integer.MIN_VALUE;
                        u05Var2 = u05Var;
                        obj2 = u05Var2.j;
                        nm6Var = nm6.a;
                        i = u05Var2.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            Boolean bool = Boolean.TRUE;
                            rjc rjcVar3 = this.b;
                            u05Var2.m = rjcVar3;
                            u05Var2.n = 0;
                            u05Var2.k = 1;
                            Object f = e15.f(this.c, null, bool, null, u05Var2, 41);
                            if (f != nm6Var) {
                                rjcVar = rjcVar3;
                                i2 = 0;
                                obj2 = f;
                            }
                        } else if (i == 1) {
                            i2 = u05Var2.n;
                            rjcVar = u05Var2.m;
                            qgg.h0(obj2);
                        } else if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj2);
                            break;
                        }
                        u05Var2.m = null;
                        u05Var2.n = i2;
                        u05Var2.k = 2;
                        if (rjcVar.emit(obj2, u05Var2) == nm6Var) {
                        }
                    }
                }
                u05Var = new u05(this, continuation);
                u05Var2 = u05Var;
                obj2 = u05Var2.j;
                nm6Var = nm6.a;
                i = u05Var2.k;
                if (i != 0) {
                }
                u05Var2.m = null;
                u05Var2.n = i2;
                u05Var2.k = 2;
                if (rjcVar.emit(obj2, u05Var2) == nm6Var) {
                }
                break;
            default:
                if (continuation instanceof c15) {
                    c15Var = (c15) continuation;
                    int i6 = c15Var.k;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c15Var.k = i6 - Integer.MIN_VALUE;
                        obj3 = c15Var.j;
                        nm6Var2 = nm6.a;
                        i3 = c15Var.k;
                        Continuation continuation2 = null;
                        if (i3 != 0) {
                            qgg.h0(obj3);
                            rjcVar2 = this.b;
                            c15Var.m = rjcVar2;
                            i4 = 0;
                            c15Var.n = 0;
                            c15Var.k = 1;
                            obj3 = x97.V(dm6.b, new vv4(this.c, continuation2, continuation2, 2), c15Var);
                            if (obj3 == nm6Var2) {
                            }
                        } else if (i3 == 1) {
                            i4 = c15Var.n;
                            rjcVar2 = c15Var.m;
                            qgg.h0(obj3);
                        } else if (i3 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                            break;
                        }
                        c15Var.m = null;
                        c15Var.n = i4;
                        c15Var.k = 2;
                        if (rjcVar2.emit(obj3, c15Var) == nm6Var2) {
                        }
                    }
                }
                c15Var = new c15(this, continuation);
                obj3 = c15Var.j;
                nm6Var2 = nm6.a;
                i3 = c15Var.k;
                Continuation continuation22 = null;
                if (i3 != 0) {
                }
                c15Var.m = null;
                c15Var.n = i4;
                c15Var.k = 2;
                if (rjcVar2.emit(obj3, c15Var) == nm6Var2) {
                }
                break;
        }
        return Unit.a;
    }
}
