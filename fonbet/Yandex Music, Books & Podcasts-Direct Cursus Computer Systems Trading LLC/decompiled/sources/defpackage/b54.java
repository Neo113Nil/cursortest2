package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class b54 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ d54 b;
    public final /* synthetic */ mm6 c;

    public /* synthetic */ b54(d54 d54Var, mm6 mm6Var, int i) {
        this.a = i;
        this.b = d54Var;
        this.c = mm6Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.b(this.c);
                break;
            default:
                this.b.b(this.c);
                break;
        }
        return Unit.a;
    }
}
