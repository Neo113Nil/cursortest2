package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class iv6 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ iv6(rjc rjcVar, Object obj, boolean z, int i) {
        this.a = i;
        this.b = rjcVar;
        this.d = obj;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        hv6 hv6Var;
        int i;
        jgl jglVar;
        int i2;
        jll jllVar;
        int i3;
        switch (this.a) {
            case 0:
                if (continuation instanceof hv6) {
                    hv6Var = (hv6) continuation;
                    int i4 = hv6Var.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        hv6Var.k = i4 - Integer.MIN_VALUE;
                        Object obj2 = hv6Var.j;
                        nm6 nm6Var = nm6.a;
                        i = hv6Var.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            Pair pair = new Pair((u2q) this.d, Boolean.valueOf(this.c));
                            hv6Var.k = 1;
                            if (this.b.emit(pair, hv6Var) == nm6Var) {
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj2);
                        }
                        break;
                    }
                }
                hv6Var = new hv6(this, continuation);
                Object obj22 = hv6Var.j;
                nm6 nm6Var2 = nm6.a;
                i = hv6Var.k;
                if (i != 0) {
                }
                break;
            case 1:
                if (continuation instanceof jgl) {
                    jglVar = (jgl) continuation;
                    int i5 = jglVar.k;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        jglVar.k = i5 - Integer.MIN_VALUE;
                        Object obj3 = jglVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = jglVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            if (((xdr) ((dn9) this.d).e).getValue() == null || this.c) {
                                jglVar.k = 1;
                                if (this.b.emit(obj, jglVar) == nm6Var3) {
                                }
                            }
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                        }
                        break;
                    }
                }
                jglVar = new jgl(this, continuation);
                Object obj32 = jglVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = jglVar.k;
                if (i2 != 0) {
                }
                break;
            default:
                if (continuation instanceof jll) {
                    jllVar = (jll) continuation;
                    int i6 = jllVar.k;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        jllVar.k = i6 - Integer.MIN_VALUE;
                        Object obj4 = jllVar.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = jllVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj4);
                            if (((tqn) this.d).a || this.c) {
                                jllVar.k = 1;
                                if (this.b.emit(obj, jllVar) == nm6Var4) {
                                }
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
                jllVar = new jll(this, continuation);
                Object obj42 = jllVar.j;
                nm6 nm6Var42 = nm6.a;
                i3 = jllVar.k;
                if (i3 != 0) {
                }
                break;
        }
        return Unit.a;
    }
}
