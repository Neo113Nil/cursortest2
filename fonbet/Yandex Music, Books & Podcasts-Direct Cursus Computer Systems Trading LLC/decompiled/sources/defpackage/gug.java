package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class gug extends eat {
    public final /* synthetic */ int a;
    public final frt b;

    public gug(frt frtVar, int i) {
        this.a = i;
        frtVar.getClass();
        switch (i) {
            case 1:
                this.b = frtVar;
                break;
            default:
                this.b = frtVar;
                break;
        }
    }

    @Override // defpackage.f6
    public final Object d(xmo xmoVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = zsd.d0(q6k.m(this.b.g(), new brg(2), q6k.g), 1).collect(new fgf(new fug(xmoVar, 0), 21), continuation);
                nm6 nm6Var = nm6.a;
                if (collect != nm6Var) {
                    collect = Unit.a;
                }
                if (collect != nm6Var) {
                    break;
                }
                break;
            default:
                Object collect2 = q6k.m(zsd.d0(this.b.g(), 1), new brg(3), q6k.g).collect(new fgf(new fug(xmoVar, 1), 22), continuation);
                nm6 nm6Var2 = nm6.a;
                if (collect2 != nm6Var2) {
                    collect2 = Unit.a;
                }
                if (collect2 != nm6Var2) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
