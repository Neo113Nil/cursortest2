package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class wvj implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ cwj b;

    public /* synthetic */ wvj(cwj cwjVar, int i) {
        this.a = i;
        this.b = cwjVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                iwj iwjVar = (iwj) obj;
                gvj gvjVar = this.b.m;
                if (iwjVar instanceof ewj) {
                    mkj mkjVar = ((ewj) iwjVar).a.a;
                    ((zhk) gvjVar.c.getValue()).b(mkjVar);
                    gvjVar.a(mkjVar);
                } else if (iwjVar instanceof dwj) {
                    mkj mkjVar2 = ((dwj) iwjVar).b;
                    ((zhk) gvjVar.c.getValue()).b(mkjVar2);
                    gvjVar.a(mkjVar2);
                }
                break;
            default:
                if (((x66) obj).a) {
                    cwj cwjVar = this.b;
                    rar rarVar = cwjVar.D;
                    Continuation continuation2 = null;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    cwjVar.D = x97.y(ot0.F(cwjVar), null, null, new bwj(cwjVar, false, continuation2, 1), 3);
                }
                break;
        }
        return Unit.a;
    }
}
