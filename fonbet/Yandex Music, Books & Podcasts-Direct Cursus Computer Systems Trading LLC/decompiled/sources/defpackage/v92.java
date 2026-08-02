package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class v92 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ aa2 c;

    public /* synthetic */ v92(rjc rjcVar, aa2 aa2Var, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = aa2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        u92 u92Var;
        int i;
        z92 z92Var;
        int i2;
        switch (this.a) {
            case 0:
                if (continuation instanceof u92) {
                    u92Var = (u92) continuation;
                    int i3 = u92Var.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        u92Var.k = i3 - Integer.MIN_VALUE;
                        Object obj2 = u92Var.j;
                        nm6 nm6Var = nm6.a;
                        i = u92Var.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            aa2 aa2Var = this.c;
                            g4q g4qVar = (g4q) aa2Var.e.b.c.getValue();
                            if (g4qVar != null ? ((Boolean) zdg.p(g4qVar, aa2Var.d)).booleanValue() : false) {
                                u92Var.k = 1;
                                if (this.b.emit(obj, u92Var) == nm6Var) {
                                }
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
                u92Var = new u92(this, continuation);
                Object obj22 = u92Var.j;
                nm6 nm6Var2 = nm6.a;
                i = u92Var.k;
                if (i != 0) {
                }
                break;
            default:
                if (continuation instanceof z92) {
                    z92Var = (z92) continuation;
                    int i4 = z92Var.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        z92Var.k = i4 - Integer.MIN_VALUE;
                        Object obj3 = z92Var.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = z92Var.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            aa2 aa2Var2 = this.c;
                            g4q g4qVar2 = (g4q) aa2Var2.e.b.c.getValue();
                            if (g4qVar2 != null ? ((Boolean) zdg.p(g4qVar2, aa2Var2.d)).booleanValue() : false) {
                                z92Var.k = 1;
                                if (this.b.emit(obj, z92Var) == nm6Var3) {
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
                z92Var = new z92(this, continuation);
                Object obj32 = z92Var.j;
                nm6 nm6Var32 = nm6.a;
                i2 = z92Var.k;
                if (i2 != 0) {
                }
                break;
        }
        return Unit.a;
    }
}
