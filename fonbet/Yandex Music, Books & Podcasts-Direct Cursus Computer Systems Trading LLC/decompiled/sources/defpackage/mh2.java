package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class mh2 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ int c;

    public /* synthetic */ mh2(rjc rjcVar, int i, int i2) {
        this.a = i2;
        this.c = i;
        this.b = rjcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0139  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        lh2 lh2Var;
        int i;
        uh2 uh2Var;
        int i2;
        g7a g7aVar;
        int i3;
        m1k m1kVar;
        int i4;
        kwv kwvVar;
        int i5;
        switch (this.a) {
            case 0:
                if (continuation instanceof lh2) {
                    lh2Var = (lh2) continuation;
                    int i6 = lh2Var.k;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        lh2Var.k = i6 - Integer.MIN_VALUE;
                        Object obj2 = lh2Var.j;
                        nm6 nm6Var = nm6.a;
                        i = lh2Var.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            t7q t7qVar = (t7q) obj;
                            boolean z = t7qVar instanceof q7q;
                            rjc rjcVar = this.b;
                            if (!z) {
                                if (!Intrinsics.d(t7qVar, r7q.a) && !(t7qVar instanceof s7q)) {
                                    b6e.s();
                                    break;
                                } else {
                                    Boolean bool = Boolean.FALSE;
                                    lh2Var.k = 2;
                                    if (rjcVar.emit(bool, lh2Var) == nm6Var) {
                                    }
                                }
                            } else if (c9g.D(((q7q) t7qVar).a) == this.c) {
                                Boolean bool2 = Boolean.TRUE;
                                lh2Var.k = 1;
                                if (rjcVar.emit(bool2, lh2Var) == nm6Var) {
                                }
                            }
                        } else if (i != 1 && i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj2);
                            break;
                        }
                    }
                }
                lh2Var = new lh2(this, continuation);
                Object obj22 = lh2Var.j;
                nm6 nm6Var2 = nm6.a;
                i = lh2Var.k;
                if (i != 0) {
                }
                break;
            case 1:
                if (continuation instanceof uh2) {
                    uh2Var = (uh2) continuation;
                    int i7 = uh2Var.k;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        uh2Var.k = i7 - Integer.MIN_VALUE;
                        Object obj3 = uh2Var.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = uh2Var.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            t7q t7qVar2 = (t7q) obj;
                            boolean z2 = t7qVar2 instanceof q7q;
                            rjc rjcVar2 = this.b;
                            if (!z2) {
                                if (!Intrinsics.d(t7qVar2, r7q.a) && !(t7qVar2 instanceof s7q)) {
                                    b6e.s();
                                    break;
                                } else {
                                    Boolean bool3 = Boolean.FALSE;
                                    uh2Var.k = 2;
                                    if (rjcVar2.emit(bool3, uh2Var) == nm6Var3) {
                                    }
                                }
                            } else if (f8g.F(((q7q) t7qVar2).a) == this.c) {
                                Boolean bool4 = Boolean.TRUE;
                                uh2Var.k = 1;
                                if (rjcVar2.emit(bool4, uh2Var) == nm6Var3) {
                                }
                            }
                        } else if (i2 != 1 && i2 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                            break;
                        }
                    }
                }
                uh2Var = new uh2(this, continuation);
                Object obj32 = uh2Var.j;
                nm6 nm6Var32 = nm6.a;
                i2 = uh2Var.k;
                if (i2 != 0) {
                }
                break;
            case 2:
                if (continuation instanceof g7a) {
                    g7aVar = (g7a) continuation;
                    int i8 = g7aVar.k;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        g7aVar.k = i8 - Integer.MIN_VALUE;
                        Object obj4 = g7aVar.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = g7aVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj4);
                            j1g j1gVar = (j1g) obj;
                            int i9 = (j1gVar == j1g.a ? 1 : 0) + this.c;
                            m1g m1gVar = new m1g(j1gVar, i9 >= 0 ? i9 : 0);
                            g7aVar.k = 1;
                            if (this.b.emit(m1gVar, g7aVar) == nm6Var4) {
                            }
                        } else if (i3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj4);
                        }
                        break;
                    }
                }
                g7aVar = new g7a(this, continuation);
                Object obj42 = g7aVar.j;
                nm6 nm6Var42 = nm6.a;
                i3 = g7aVar.k;
                if (i3 != 0) {
                }
                break;
            case 3:
                if (continuation instanceof m1k) {
                    m1kVar = (m1k) continuation;
                    int i10 = m1kVar.k;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        m1kVar.k = i10 - Integer.MIN_VALUE;
                        Object obj5 = m1kVar.j;
                        nm6 nm6Var5 = nm6.a;
                        i4 = m1kVar.k;
                        if (i4 != 0) {
                            qgg.h0(obj5);
                            q3d q3dVar = new q3d(this.c, (hiu) obj);
                            m1kVar.k = 1;
                            if (this.b.emit(q3dVar, m1kVar) == nm6Var5) {
                            }
                        } else if (i4 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj5);
                        }
                        break;
                    }
                }
                m1kVar = new m1k(this, continuation);
                Object obj52 = m1kVar.j;
                nm6 nm6Var52 = nm6.a;
                i4 = m1kVar.k;
                if (i4 != 0) {
                }
                break;
            default:
                if (continuation instanceof kwv) {
                    kwvVar = (kwv) continuation;
                    int i11 = kwvVar.k;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        kwvVar.k = i11 - Integer.MIN_VALUE;
                        Object obj6 = kwvVar.j;
                        nm6 nm6Var6 = nm6.a;
                        i5 = kwvVar.k;
                        if (i5 != 0) {
                            qgg.h0(obj6);
                            owv owvVar = (owv) obj;
                            boolean z3 = owvVar instanceof nwv;
                            Object obj7 = fwv.a;
                            if (!z3) {
                                if (!(owvVar instanceof mwv)) {
                                    b6e.s();
                                    break;
                                } else {
                                    hwv hwvVar = (hwv) CollectionsKt.S(((mwv) owvVar).a, this.c);
                                    if (hwvVar != null) {
                                        obj7 = new ewv(hwvVar);
                                    }
                                }
                            }
                            kwvVar.k = 1;
                            if (this.b.emit(obj7, kwvVar) == nm6Var6) {
                            }
                        } else if (i5 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj6);
                            break;
                        }
                    }
                }
                kwvVar = new kwv(this, continuation);
                Object obj62 = kwvVar.j;
                nm6 nm6Var62 = nm6.a;
                i5 = kwvVar.k;
                if (i5 != 0) {
                }
                break;
        }
        return Unit.a;
    }
}
