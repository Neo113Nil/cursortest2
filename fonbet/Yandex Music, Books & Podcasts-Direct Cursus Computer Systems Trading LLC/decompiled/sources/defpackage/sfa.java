package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class sfa implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ ufa b;

    public /* synthetic */ sfa(ufa ufaVar, int i) {
        this.a = i;
        this.b = ufaVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.n.l((List) obj);
                break;
            default:
                this.b.l.l((xfa) obj);
                break;
        }
        return Unit.a;
    }
}
