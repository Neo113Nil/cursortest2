package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class imd implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ kmd b;

    public /* synthetic */ imd(kmd kmdVar, int i) {
        this.a = i;
        this.b = kmdVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.d.l((mjs) obj);
                break;
            default:
                this.b.d.l((mjs) obj);
                break;
        }
        return Unit.a;
    }
}
