package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ga0 implements cpa {
    public final /* synthetic */ int a = 0;
    public final fa0 b;
    public final /* synthetic */ Object c;

    public ga0(ia0 ia0Var) {
        this.c = ia0Var;
        this.b = new fa0(0, ia0Var);
    }

    @Override // defpackage.cpa
    public final Object a(hqi hqiVar, Function2 function2, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object c = ((ia0) this.c).c(hqiVar, new ea0(this, function2, (Continuation) null), continuation);
                if (c != nm6.a) {
                    break;
                }
                break;
            default:
                Object a = ((ka0) this.c).a(hqiVar, new ea0(this, function2, null, (byte) 0), continuation);
                if (a != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }

    public ga0(ka0 ka0Var) {
        this.c = ka0Var;
        this.b = new fa0(1, ka0Var);
    }
}
