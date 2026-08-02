package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class jwc implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ lwc b;

    public /* synthetic */ jwc(lwc lwcVar, int i) {
        this.a = i;
        this.b = lwcVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                int intValue = ((Number) obj).intValue();
                if (intValue != 0) {
                    lwc lwcVar = this.b;
                    x97.y(lwcVar.c, null, null, new dv0(lwcVar, intValue, null, 3), 3);
                    lwcVar.c();
                    break;
                } else {
                    break;
                }
            default:
                this.b.f.set(false);
                break;
        }
        return Unit.a;
    }
}
