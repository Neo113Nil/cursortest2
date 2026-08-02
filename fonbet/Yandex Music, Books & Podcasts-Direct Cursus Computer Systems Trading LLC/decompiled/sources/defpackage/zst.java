package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class zst implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ tst c;

    public /* synthetic */ zst(rjc rjcVar, tst tstVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = tstVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        yst ystVar;
        int i;
        att attVar;
        int i2;
        switch (this.a) {
            case 0:
                if (continuation instanceof yst) {
                    ystVar = (yst) continuation;
                    int i3 = ystVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ystVar.k = i3 - Integer.MIN_VALUE;
                        Object obj2 = ystVar.j;
                        nm6 nm6Var = nm6.a;
                        i = ystVar.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            if (this.c.a.equals((String) ((Pair) obj).a)) {
                                ystVar.k = 1;
                                if (this.b.emit(obj, ystVar) == nm6Var) {
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
                ystVar = new yst(this, continuation);
                Object obj22 = ystVar.j;
                nm6 nm6Var2 = nm6.a;
                i = ystVar.k;
                if (i != 0) {
                }
                break;
            default:
                if (continuation instanceof att) {
                    attVar = (att) continuation;
                    int i4 = attVar.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        attVar.k = i4 - Integer.MIN_VALUE;
                        Object obj3 = attVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = attVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            String str = (String) ((Pair) obj).b;
                            tst tstVar = this.c;
                            Object b = tstVar.b(str);
                            if (b == null) {
                                b = tstVar.b;
                            }
                            attVar.k = 1;
                            if (this.b.emit(b, attVar) == nm6Var3) {
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
                attVar = new att(this, continuation);
                Object obj32 = attVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = attVar.k;
                if (i2 != 0) {
                }
                break;
        }
        return Unit.a;
    }
}
