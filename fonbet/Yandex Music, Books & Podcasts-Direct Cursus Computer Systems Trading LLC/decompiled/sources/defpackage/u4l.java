package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class u4l implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ z4l b;

    public /* synthetic */ u4l(z4l z4lVar, int i) {
        this.a = i;
        this.b = z4lVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        mqs a;
        switch (this.a) {
            case 0:
                this.b.b(s4l.e);
                break;
            case 1:
                this.b.g = (String) obj;
                this.b.b(s4l.a);
                break;
            default:
                u8l u8lVar = (u8l) obj;
                if (!(u8lVar instanceof j8l) && !(u8lVar instanceof s8l)) {
                    if (!(u8lVar instanceof r8l) && !(u8lVar instanceof n8l) && !(u8lVar instanceof k8l) && !(u8lVar instanceof t8l) && !(u8lVar instanceof l8l) && !(u8lVar instanceof m8l) && !(u8lVar instanceof o8l) && !(u8lVar instanceof p8l) && !(u8lVar instanceof q8l)) {
                        b6e.s();
                        break;
                    }
                } else {
                    z4l z4lVar = this.b;
                    mwk b = u8lVar.a().b();
                    if (((Boolean) dag.p(b, y9w.f)).booleanValue() && (a = b.a()) != null && a.l) {
                        z4lVar.b(s4l.b);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
