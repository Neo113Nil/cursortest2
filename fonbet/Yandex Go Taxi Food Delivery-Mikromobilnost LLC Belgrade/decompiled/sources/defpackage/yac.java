package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class yac implements vpr, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ vpr b;

    public /* synthetic */ yac(vpr vprVar, int i) {
        this.a = i;
        this.b = vprVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        vpr vprVar = this.b;
        switch (i) {
            case 0:
                Object emit = vprVar.emit(obj, continuation);
                return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11Var;
            default:
                Object emit2 = vprVar.emit((fh51) obj, continuation);
                return emit2 == CoroutineSingletons.COROUTINE_SUSPENDED ? emit2 : zy11Var;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
        }
        return new FunctionReferenceImpl(2, this.b, vpr.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
