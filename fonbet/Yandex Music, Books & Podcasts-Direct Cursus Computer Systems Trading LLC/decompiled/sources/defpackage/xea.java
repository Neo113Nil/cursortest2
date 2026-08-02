package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class xea implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ yea b;

    public /* synthetic */ xea(yea yeaVar, int i) {
        this.a = i;
        this.b = yeaVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.o.l((List) obj);
                break;
            default:
                this.b.m.l((wea) obj);
                break;
        }
        return Unit.a;
    }
}
