package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class e2u implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ i2u c;

    public /* synthetic */ e2u(rjc rjcVar, i2u i2uVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = i2uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        d2u d2uVar;
        int i;
        g2u g2uVar;
        int i2;
        switch (this.a) {
            case 0:
                if (continuation instanceof d2u) {
                    d2uVar = (d2u) continuation;
                    int i3 = d2uVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        d2uVar.k = i3 - Integer.MIN_VALUE;
                        Object obj2 = d2uVar.j;
                        nm6 nm6Var = nm6.a;
                        i = d2uVar.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            ((Number) obj).intValue();
                            if (this.c.a() == null) {
                                d2uVar.k = 1;
                                if (this.b.emit(obj, d2uVar) == nm6Var) {
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
                d2uVar = new d2u(this, continuation);
                Object obj22 = d2uVar.j;
                nm6 nm6Var2 = nm6.a;
                i = d2uVar.k;
                if (i != 0) {
                }
                break;
            default:
                if (continuation instanceof g2u) {
                    g2uVar = (g2u) continuation;
                    int i4 = g2uVar.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        g2uVar.k = i4 - Integer.MIN_VALUE;
                        Object obj3 = g2uVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = g2uVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            Pair pair = new Pair((c2u) obj, this.c.b.p().getValue());
                            g2uVar.k = 1;
                            if (this.b.emit(pair, g2uVar) == nm6Var3) {
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
                g2uVar = new g2u(this, continuation);
                Object obj32 = g2uVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = g2uVar.k;
                if (i2 != 0) {
                }
                break;
        }
        return Unit.a;
    }
}
