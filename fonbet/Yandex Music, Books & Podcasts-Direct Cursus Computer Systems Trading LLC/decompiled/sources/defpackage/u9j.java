package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class u9j implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ v9j b;

    public /* synthetic */ u9j(v9j v9jVar, int i) {
        this.a = i;
        this.b = v9jVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.r.l((q9j) obj);
                break;
            default:
                this.b.r.l((q9j) obj);
                break;
        }
        return Unit.a;
    }
}
