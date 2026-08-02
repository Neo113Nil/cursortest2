package defpackage;

import com.yandex.go.yb.api.experiments.YbWalletEntryPointExperiment;
import com.yandex.go.yb.data.e;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class xmp0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ xmp0(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                eVar.t.emit((nw51) obj, continuation);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return zy11Var;
            case 1:
                eVar.u.emit((fh51) obj, continuation);
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return zy11Var;
            default:
                Object e = eVar.e((YbWalletEntryPointExperiment) obj, continuation);
                return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : zy11Var;
        }
    }
}
