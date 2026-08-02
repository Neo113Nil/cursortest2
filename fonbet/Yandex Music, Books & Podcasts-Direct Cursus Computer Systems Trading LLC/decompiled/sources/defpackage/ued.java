package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class ued implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ ued(rjc rjcVar, Function1 function1, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ted tedVar;
        int i;
        gah gahVar;
        int i2;
        switch (this.a) {
            case 0:
                if (continuation instanceof ted) {
                    tedVar = (ted) continuation;
                    int i3 = tedVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        tedVar.k = i3 - Integer.MIN_VALUE;
                        Object obj2 = tedVar.j;
                        nm6 nm6Var = nm6.a;
                        i = tedVar.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            if (((Boolean) this.c.invoke(obj)).booleanValue()) {
                                tedVar.k = 1;
                                if (this.b.emit(obj, tedVar) == nm6Var) {
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
                tedVar = new ted(this, continuation);
                Object obj22 = tedVar.j;
                nm6 nm6Var2 = nm6.a;
                i = tedVar.k;
                if (i != 0) {
                }
                break;
            default:
                if (continuation instanceof gah) {
                    gahVar = (gah) continuation;
                    int i4 = gahVar.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        gahVar.k = i4 - Integer.MIN_VALUE;
                        Object obj3 = gahVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = gahVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            Object invoke = this.c.invoke(obj);
                            gahVar.k = 1;
                            if (this.b.emit(invoke, gahVar) == nm6Var3) {
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
                gahVar = new gah(this, continuation);
                Object obj32 = gahVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = gahVar.k;
                if (i2 != 0) {
                }
                break;
        }
        return Unit.a;
    }
}
