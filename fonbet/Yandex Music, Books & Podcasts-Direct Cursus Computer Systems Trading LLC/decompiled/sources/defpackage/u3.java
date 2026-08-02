package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class u3 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ xqn c;

    public /* synthetic */ u3(rjc rjcVar, xqn xqnVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = xqnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0169  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        t3 t3Var;
        int i;
        t24 t24Var;
        int i2;
        y24 y24Var;
        int i3;
        kkc kkcVar;
        int i4;
        mkc mkcVar;
        int i5;
        flc flcVar;
        int i6;
        u3 u3Var;
        switch (this.a) {
            case 0:
                if (continuation instanceof t3) {
                    t3Var = (t3) continuation;
                    int i7 = t3Var.k;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        t3Var.k = i7 - Integer.MIN_VALUE;
                        Object obj2 = t3Var.j;
                        nm6 nm6Var = nm6.a;
                        i = t3Var.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            j1g j1gVar = (j1g) obj;
                            xqn xqnVar = this.c;
                            if (xqnVar.a == null) {
                                xqnVar.a = Boolean.valueOf(j1gVar == j1g.a);
                            }
                            t3Var.k = 1;
                            if (this.b.emit(j1gVar, t3Var) == nm6Var) {
                                return nm6Var;
                            }
                        } else {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj2);
                        }
                        return Unit.a;
                    }
                }
                t3Var = new t3(this, continuation);
                Object obj22 = t3Var.j;
                nm6 nm6Var2 = nm6.a;
                i = t3Var.k;
                if (i != 0) {
                }
                return Unit.a;
            case 1:
                if (continuation instanceof t24) {
                    t24Var = (t24) continuation;
                    int i8 = t24Var.k;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        t24Var.k = i8 - Integer.MIN_VALUE;
                        Object obj3 = t24Var.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = t24Var.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            if (!((pe6) this.c.a).a((p14) obj)) {
                                t24Var.k = 1;
                                if (this.b.emit(obj, t24Var) == nm6Var3) {
                                    return nm6Var3;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj3);
                        }
                        return Unit.a;
                    }
                }
                t24Var = new t24(this, continuation);
                Object obj32 = t24Var.j;
                nm6 nm6Var32 = nm6.a;
                i2 = t24Var.k;
                if (i2 != 0) {
                }
                return Unit.a;
            case 2:
                if (continuation instanceof y24) {
                    y24Var = (y24) continuation;
                    int i9 = y24Var.k;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        y24Var.k = i9 - Integer.MIN_VALUE;
                        Object obj4 = y24Var.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = y24Var.k;
                        if (i3 != 0) {
                            qgg.h0(obj4);
                            if (!((oe6) this.c.a).a((o14) obj)) {
                                y24Var.k = 1;
                                if (this.b.emit(obj, y24Var) == nm6Var4) {
                                    return nm6Var4;
                                }
                            }
                        } else {
                            if (i3 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj4);
                        }
                        return Unit.a;
                    }
                }
                y24Var = new y24(this, continuation);
                Object obj42 = y24Var.j;
                nm6 nm6Var42 = nm6.a;
                i3 = y24Var.k;
                if (i3 != 0) {
                }
                return Unit.a;
            case 3:
                if (continuation instanceof kkc) {
                    kkcVar = (kkc) continuation;
                    int i10 = kkcVar.m;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        kkcVar.m = i10 - Integer.MIN_VALUE;
                        Object obj5 = kkcVar.k;
                        nm6 nm6Var5 = nm6.a;
                        i4 = kkcVar.m;
                        xqn xqnVar2 = this.c;
                        if (i4 != 0) {
                            qgg.h0(obj5);
                            Pair pair = new Pair(xqnVar2.a, obj);
                            kkcVar.j = obj;
                            kkcVar.m = 1;
                            if (this.b.emit(pair, kkcVar) == nm6Var5) {
                                return nm6Var5;
                            }
                        } else {
                            if (i4 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = kkcVar.j;
                            qgg.h0(obj5);
                        }
                        xqnVar2.a = obj;
                        return Unit.a;
                    }
                }
                kkcVar = new kkc(this, continuation);
                Object obj52 = kkcVar.k;
                nm6 nm6Var52 = nm6.a;
                i4 = kkcVar.m;
                xqn xqnVar22 = this.c;
                if (i4 != 0) {
                }
                xqnVar22.a = obj;
                return Unit.a;
            case 4:
                if (continuation instanceof mkc) {
                    mkcVar = (mkc) continuation;
                    int i11 = mkcVar.m;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        mkcVar.m = i11 - Integer.MIN_VALUE;
                        Object obj6 = mkcVar.k;
                        nm6 nm6Var6 = nm6.a;
                        i5 = mkcVar.m;
                        xqn xqnVar3 = this.c;
                        if (i5 != 0) {
                            qgg.h0(obj6);
                            Pair pair2 = new Pair(xqnVar3.a, obj);
                            mkcVar.j = obj;
                            mkcVar.m = 1;
                            if (this.b.emit(pair2, mkcVar) == nm6Var6) {
                                return nm6Var6;
                            }
                        } else {
                            if (i5 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = mkcVar.j;
                            qgg.h0(obj6);
                        }
                        xqnVar3.a = obj;
                        return Unit.a;
                    }
                }
                mkcVar = new mkc(this, continuation);
                Object obj62 = mkcVar.k;
                nm6 nm6Var62 = nm6.a;
                i5 = mkcVar.m;
                xqn xqnVar32 = this.c;
                if (i5 != 0) {
                }
                xqnVar32.a = obj;
                return Unit.a;
            default:
                if (continuation instanceof flc) {
                    flcVar = (flc) continuation;
                    int i12 = flcVar.m;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        flcVar.m = i12 - Integer.MIN_VALUE;
                        Object obj7 = flcVar.k;
                        nm6 nm6Var7 = nm6.a;
                        i6 = flcVar.m;
                        if (i6 != 0) {
                            qgg.h0(obj7);
                            try {
                                rjc rjcVar = this.b;
                                flcVar.j = this;
                                flcVar.m = 1;
                                if (rjcVar.emit(obj, flcVar) == nm6Var7) {
                                    return nm6Var7;
                                }
                            } catch (Throwable th) {
                                th = th;
                                u3Var = this;
                                u3Var.c.a = th;
                                throw th;
                            }
                        } else {
                            if (i6 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            u3Var = flcVar.j;
                            try {
                                qgg.h0(obj7);
                            } catch (Throwable th2) {
                                th = th2;
                                u3Var.c.a = th;
                                throw th;
                            }
                        }
                        return Unit.a;
                    }
                }
                flcVar = new flc(this, continuation);
                Object obj72 = flcVar.k;
                nm6 nm6Var72 = nm6.a;
                i6 = flcVar.m;
                if (i6 != 0) {
                }
                return Unit.a;
        }
    }
}
