package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class tep implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ fk0 b;
    public final /* synthetic */ mm6 c;

    public /* synthetic */ tep(fk0 fk0Var, mm6 mm6Var, int i) {
        this.a = i;
        this.b = fk0Var;
        this.c = mm6Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                long j = ((enj) obj).a;
                fk0 fk0Var = this.b;
                if ((((enj) fk0Var.e()).a & 9223372034707292159L) != 9205357640488583168L && (j & 9223372034707292159L) != 9205357640488583168L && Float.intBitsToFloat((int) (((enj) fk0Var.e()).a & 4294967295L)) != Float.intBitsToFloat((int) (4294967295L & j))) {
                    x97.y(this.c, null, null, new gje(fk0Var, j, null, 2), 3);
                    break;
                } else {
                    Object f = fk0Var.f(new enj(j), continuation);
                    if (f != nm6.a) {
                        break;
                    }
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    Object c = fk0.c(this.b, new Float(0.95f), weo.S(150, 0, null, 6), null, continuation, 12);
                    if (c == nm6.a) {
                    }
                } else {
                    x97.y(this.c, null, null, new v41(3, this.b, null), 3);
                }
                break;
        }
        return Unit.a;
    }
}
