package defpackage;

import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class l2q implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2q b;

    public /* synthetic */ l2q(o2q o2qVar, int i) {
        this.a = i;
        this.b = o2qVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                boolean a = ((xxq) obj).a();
                o2q o2qVar = this.b;
                j0q j0qVar = o2qVar.k;
                xdr xdrVar = o2qVar.f;
                if (!a) {
                    if (!((z66) ((arf) o2qVar.h.getValue()).getValue()).g()) {
                        k2q k2qVar = k2q.d;
                        xdrVar.getClass();
                        xdrVar.m(null, k2qVar);
                        break;
                    } else {
                        k2q k2qVar2 = k2q.c;
                        xdrVar.getClass();
                        xdrVar.m(null, k2qVar2);
                        Object emit = j0qVar.emit(t75.c("media_browser_root_id"), continuation);
                        if (emit != nm6.a) {
                            break;
                        }
                    }
                } else {
                    ((lc0) o2qVar.b.getValue()).a();
                    k2q k2qVar3 = k2q.a;
                    xdrVar.getClass();
                    xdrVar.m(null, k2qVar3);
                    Object emit2 = j0qVar.emit(t75.c("media_browser_root_id"), continuation);
                    if (emit2 != nm6.a) {
                        break;
                    }
                }
                break;
            case 1:
                Object emit3 = this.b.k.emit((Collection) obj, continuation);
                if (emit3 != nm6.a) {
                    break;
                }
                break;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                s72 a2 = this.b.a();
                Boolean bool = ((cb2) a2.o.getValue()).a;
                boolean z = false;
                if (bool != null && !bool.booleanValue()) {
                    z = true;
                }
                if (booleanValue && z) {
                    a2.n();
                }
                break;
            default:
                Object emit4 = this.b.k.emit(t75.c("media_browser_root_id"), continuation);
                if (emit4 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
