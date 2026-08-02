package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k90 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ xqn b;
    public final /* synthetic */ mm6 c;
    public final /* synthetic */ Function2 d;

    public /* synthetic */ k90(xqn xqnVar, mm6 mm6Var, Function2 function2, int i) {
        this.a = i;
        this.b = xqnVar;
        this.c = mm6Var;
        this.d = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010a  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        i90 i90Var;
        int i;
        k90 k90Var;
        j90 j90Var;
        int i2;
        k90 k90Var2;
        wa0 wa0Var;
        int i3;
        switch (this.a) {
            case 0:
                if (continuation instanceof i90) {
                    i90Var = (i90) continuation;
                    int i4 = i90Var.n;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        i90Var.n = i4 - Integer.MIN_VALUE;
                        Object obj2 = i90Var.l;
                        nm6 nm6Var = nm6.a;
                        i = i90Var.n;
                        if (i != 0) {
                            qgg.h0(obj2);
                            r2f r2fVar = (r2f) this.b.a;
                            if (r2fVar != null) {
                                r2fVar.g(new y80());
                                i90Var.j = this;
                                i90Var.k = obj;
                                i90Var.n = 1;
                                if (r2fVar.j0(i90Var) == nm6Var) {
                                }
                            }
                            k90Var = this;
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            obj = i90Var.k;
                            k90Var = i90Var.j;
                            qgg.h0(obj2);
                        }
                        Object obj3 = obj;
                        xqn xqnVar = k90Var.b;
                        mm6 mm6Var = k90Var.c;
                        xqnVar.a = x97.y(mm6Var, null, pm6.d, new h90(k90Var.d, obj3, mm6Var, null, 0), 1);
                        break;
                    }
                }
                i90Var = new i90(this, continuation);
                Object obj22 = i90Var.l;
                nm6 nm6Var2 = nm6.a;
                i = i90Var.n;
                if (i != 0) {
                }
                Object obj32 = obj;
                xqn xqnVar2 = k90Var.b;
                mm6 mm6Var2 = k90Var.c;
                xqnVar2.a = x97.y(mm6Var2, null, pm6.d, new h90(k90Var.d, obj32, mm6Var2, null, 0), 1);
                break;
            case 1:
                if (continuation instanceof j90) {
                    j90Var = (j90) continuation;
                    int i5 = j90Var.n;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        j90Var.n = i5 - Integer.MIN_VALUE;
                        Object obj4 = j90Var.l;
                        nm6 nm6Var3 = nm6.a;
                        i2 = j90Var.n;
                        if (i2 != 0) {
                            qgg.h0(obj4);
                            r2f r2fVar2 = (r2f) this.b.a;
                            if (r2fVar2 != null) {
                                r2fVar2.g(new a90());
                                j90Var.j = this;
                                j90Var.k = obj;
                                j90Var.n = 1;
                                if (r2fVar2.j0(j90Var) == nm6Var3) {
                                }
                            }
                            k90Var2 = this;
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            obj = j90Var.k;
                            k90Var2 = j90Var.j;
                            qgg.h0(obj4);
                        }
                        Object obj5 = obj;
                        xqn xqnVar3 = k90Var2.b;
                        mm6 mm6Var3 = k90Var2.c;
                        xqnVar3.a = x97.y(mm6Var3, null, pm6.d, new h90(k90Var2.d, obj5, mm6Var3, null, 1), 1);
                        break;
                    }
                }
                j90Var = new j90(this, continuation);
                Object obj42 = j90Var.l;
                nm6 nm6Var32 = nm6.a;
                i2 = j90Var.n;
                if (i2 != 0) {
                }
                Object obj52 = obj;
                xqn xqnVar32 = k90Var2.b;
                mm6 mm6Var32 = k90Var2.c;
                xqnVar32.a = x97.y(mm6Var32, null, pm6.d, new h90(k90Var2.d, obj52, mm6Var32, null, 1), 1);
                break;
            default:
                if (continuation instanceof wa0) {
                    wa0Var = (wa0) continuation;
                    int i6 = wa0Var.m;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        wa0Var.m = i6 - Integer.MIN_VALUE;
                        Object obj6 = wa0Var.k;
                        nm6 nm6Var4 = nm6.a;
                        i3 = wa0Var.m;
                        xqn xqnVar4 = this.b;
                        if (i3 != 0) {
                            qgg.h0(obj6);
                            r2f r2fVar3 = (r2f) xqnVar4.a;
                            if (r2fVar3 != null) {
                                r2fVar3.g(new z80());
                                wa0Var.j = obj;
                                wa0Var.m = 1;
                                if (r2fVar3.j0(wa0Var) == nm6Var4) {
                                }
                            }
                        } else if (i3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            obj = wa0Var.j;
                            qgg.h0(obj6);
                        }
                        Object obj7 = obj;
                        pm6 pm6Var = pm6.d;
                        mm6 mm6Var4 = this.c;
                        xqnVar4.a = x97.y(mm6Var4, null, pm6Var, new h90(this.d, obj7, mm6Var4, null, 2), 1);
                        break;
                    }
                }
                wa0Var = new wa0(this, continuation);
                Object obj62 = wa0Var.k;
                nm6 nm6Var42 = nm6.a;
                i3 = wa0Var.m;
                xqn xqnVar42 = this.b;
                if (i3 != 0) {
                }
                Object obj72 = obj;
                pm6 pm6Var2 = pm6.d;
                mm6 mm6Var42 = this.c;
                xqnVar42.a = x97.y(mm6Var42, null, pm6Var2, new h90(this.d, obj72, mm6Var42, null, 2), 1);
                break;
        }
        return Unit.a;
    }
}
