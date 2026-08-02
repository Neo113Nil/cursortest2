package defpackage;

import com.yandex.go.scooters.passes.domain.h;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class xdo0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ xdo0(h hVar, int i) {
        this.a = i;
        this.b = hVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        h hVar = this.b;
        switch (i) {
            case 0:
                Object e = hVar.e((kr) obj, continuation);
                return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : zy11Var;
            default:
                Object c = h.c(hVar, ((Result) obj).getValue(), continuation);
                return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : zy11Var;
        }
    }
}
