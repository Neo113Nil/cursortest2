package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class fdd implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ odd b;

    public /* synthetic */ fdd(odd oddVar, int i) {
        this.a = i;
        this.b = oddVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                odd.c(this.b, (ced) obj, true, false, false, 16);
                break;
            case 1:
                bjd bjdVar = (bjd) obj;
                if (!(bjdVar instanceof ajd)) {
                    if (!(bjdVar instanceof zid)) {
                        if (!(bjdVar instanceof yid)) {
                            b6e.s();
                            break;
                        } else {
                            Object f = odd.f(this.b, null, false, continuation, 20);
                            if (f != nm6.a) {
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 2:
                List list = (List) obj;
                odd oddVar = this.b;
                ced cedVar = oddVar.l;
                if (cedVar != null) {
                    if (!list.contains(cedVar.b.getDeviceId())) {
                        odd.c(oddVar, cedVar, true, true, false, 16);
                    }
                    break;
                } else {
                    break;
                }
            default:
                this.b.n.l((List) obj);
                break;
        }
        return Unit.a;
    }
}
