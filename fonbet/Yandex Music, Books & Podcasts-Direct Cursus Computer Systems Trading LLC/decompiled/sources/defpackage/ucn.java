package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class ucn implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ x3n c;

    public /* synthetic */ ucn(rjc rjcVar, x3n x3nVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = x3nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        scn scnVar;
        int i;
        ycn ycnVar;
        int i2;
        switch (this.a) {
            case 0:
                if (continuation instanceof scn) {
                    scnVar = (scn) continuation;
                    int i3 = scnVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        scnVar.k = i3 - Integer.MIN_VALUE;
                        Object obj2 = scnVar.j;
                        nm6 nm6Var = nm6.a;
                        i = scnVar.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            Pair G0 = this.c.G0((String) obj);
                            scnVar.k = 1;
                            if (this.b.emit(G0, scnVar) == nm6Var) {
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
                scnVar = new scn(this, continuation);
                Object obj22 = scnVar.j;
                nm6 nm6Var2 = nm6.a;
                i = scnVar.k;
                if (i != 0) {
                }
                break;
            default:
                if (continuation instanceof ycn) {
                    ycnVar = (ycn) continuation;
                    int i4 = ycnVar.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        ycnVar.k = i4 - Integer.MIN_VALUE;
                        Object obj3 = ycnVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = ycnVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            Pair G02 = this.c.G0((String) obj);
                            ycnVar.k = 1;
                            if (this.b.emit(G02, ycnVar) == nm6Var3) {
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
                ycnVar = new ycn(this, continuation);
                Object obj32 = ycnVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = ycnVar.k;
                if (i2 != 0) {
                }
                break;
        }
        return Unit.a;
    }
}
