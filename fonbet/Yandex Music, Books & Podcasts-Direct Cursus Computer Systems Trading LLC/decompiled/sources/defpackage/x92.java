package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class x92 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ aa2 b;

    public /* synthetic */ x92(aa2 aa2Var, int i) {
        this.a = i;
        this.b = aa2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Pair pair, Continuation continuation) {
        w92 w92Var;
        int i;
        y92 y92Var;
        nm6 nm6Var;
        int i2;
        ocn ocnVar;
        long longValue;
        switch (this.a) {
            case 0:
                if (continuation instanceof w92) {
                    w92Var = (w92) continuation;
                    int i3 = w92Var.l;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        w92Var.l = i3 - Integer.MIN_VALUE;
                        Object obj = w92Var.j;
                        nm6 nm6Var2 = nm6.a;
                        i = w92Var.l;
                        if (i != 0) {
                            qgg.h0(obj);
                            aa2 aa2Var = this.b;
                            jmg jmgVar = aa2Var.h;
                            String str = (String) pair.a;
                            qmg qmgVar = (qmg) jmgVar;
                            qmgVar.getClass();
                            str.getClass();
                            qmgVar.l = str;
                            ocn ocnVar2 = aa2Var.f;
                            w92Var.l = 1;
                            if (ocnVar2.f(w92Var) == nm6Var2) {
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj);
                            ((z7o) obj).getClass();
                        }
                        break;
                    }
                }
                w92Var = new w92(this, continuation);
                Object obj2 = w92Var.j;
                nm6 nm6Var22 = nm6.a;
                i = w92Var.l;
                if (i != 0) {
                }
                break;
            default:
                if (continuation instanceof y92) {
                    y92Var = (y92) continuation;
                    int i4 = y92Var.m;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        y92Var.m = i4 - Integer.MIN_VALUE;
                        Object obj3 = y92Var.k;
                        nm6Var = nm6.a;
                        i2 = y92Var.m;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            aa2 aa2Var2 = this.b;
                            ocnVar = aa2Var2.f;
                            uol uolVar = aa2Var2.e.c;
                            y92Var.j = ocnVar;
                            y92Var.m = 1;
                            obj3 = uolVar.f(y92Var);
                            if (obj3 == nm6Var) {
                            }
                        } else if (i2 == 1) {
                            ocnVar = y92Var.j;
                            qgg.h0(obj3);
                        } else if (i2 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                            ((z7o) obj3).getClass();
                            break;
                        }
                        longValue = ((Number) obj3).longValue();
                        y92Var.j = null;
                        y92Var.m = 2;
                        if (ocnVar.h(longValue, y92Var) == nm6Var) {
                        }
                    }
                }
                y92Var = new y92(this, continuation);
                Object obj32 = y92Var.k;
                nm6Var = nm6.a;
                i2 = y92Var.m;
                if (i2 != 0) {
                }
                longValue = ((Number) obj32).longValue();
                y92Var.j = null;
                y92Var.m = 2;
                if (ocnVar.h(longValue, y92Var) == nm6Var) {
                }
                break;
        }
        return Unit.a;
    }

    @Override // defpackage.rjc
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
        }
        return b((Pair) obj, continuation);
    }
}
