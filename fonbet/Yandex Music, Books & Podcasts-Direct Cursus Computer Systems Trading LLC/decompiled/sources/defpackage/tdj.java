package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class tdj implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ udj b;

    public /* synthetic */ tdj(udj udjVar, int i) {
        this.a = i;
        this.b = udjVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.r.l((qdj) obj);
                break;
            default:
                this.b.r.l((qdj) obj);
                break;
        }
        return Unit.a;
    }
}
