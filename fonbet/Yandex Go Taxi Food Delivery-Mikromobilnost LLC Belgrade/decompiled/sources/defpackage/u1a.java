package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class u1a implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6f0 b;

    public /* synthetic */ u1a(y6f0 y6f0Var, int i) {
        this.a = i;
        this.b = y6f0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return ((x6f0) this.b).y.o(obj, continuation);
            default:
                return ((x6f0) this.b).y.o(new Object(), continuation);
        }
    }
}
