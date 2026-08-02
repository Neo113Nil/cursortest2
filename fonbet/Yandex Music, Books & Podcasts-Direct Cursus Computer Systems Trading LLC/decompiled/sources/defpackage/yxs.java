package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class yxs implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ y8p c;

    public /* synthetic */ yxs(rjc rjcVar, y8p y8pVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = y8pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        xxs xxsVar;
        int i;
        nuu nuuVar;
        ays aysVar;
        int i2;
        nuu nuuVar2;
        switch (this.a) {
            case 0:
                if (continuation instanceof xxs) {
                    xxsVar = (xxs) continuation;
                    int i3 = xxsVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        xxsVar.k = i3 - Integer.MIN_VALUE;
                        Object obj2 = xxsVar.j;
                        nm6 nm6Var = nm6.a;
                        i = xxsVar.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            d6l x = p6g.x((e6l) obj);
                            Float f = null;
                            n7q n7qVar = x != null ? x.a : null;
                            if (n7qVar != null && (nuuVar = (nuu) wdg.A(n7qVar, (gao) this.c.c)) != null) {
                                f = nuuVar.b;
                            }
                            xxsVar.k = 1;
                            if (this.b.emit(f, xxsVar) == nm6Var) {
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
                xxsVar = new xxs(this, continuation);
                Object obj22 = xxsVar.j;
                nm6 nm6Var2 = nm6.a;
                i = xxsVar.k;
                if (i != 0) {
                }
                break;
            default:
                if (continuation instanceof ays) {
                    aysVar = (ays) continuation;
                    int i4 = aysVar.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        aysVar.k = i4 - Integer.MIN_VALUE;
                        Object obj3 = aysVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = aysVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            d6l x2 = p6g.x((e6l) obj);
                            n7q n7qVar2 = x2 != null ? x2.a : null;
                            if (n7qVar2 == null || (nuuVar2 = (nuu) wdg.A(n7qVar2, (gao) this.c.c)) == null) {
                                nuuVar2 = nuu.c;
                            }
                            aysVar.k = 1;
                            if (this.b.emit(nuuVar2, aysVar) == nm6Var3) {
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
                aysVar = new ays(this, continuation);
                Object obj32 = aysVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = aysVar.k;
                if (i2 != 0) {
                }
                break;
        }
        return Unit.a;
    }
}
