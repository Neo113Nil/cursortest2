package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.logistics.sdk.promotions.impl.data.a;
import ru.yandex.taxi.logistics.sdk.promotions.impl.data.b;
import ru.yandex.taxi.logistics.sdk.promotions.impl.data.c;
import ru.yandex.taxi.logistics.sdk.promotions.impl.data.d;
import ru.yandex.taxi.logistics.sdk.promotions.impl.data.e;

/* loaded from: classes5.dex */
public final class u9s0 implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ tpr b;
    public final /* synthetic */ e c;
    public final /* synthetic */ String w;

    public /* synthetic */ u9s0(tpr tprVar, e eVar, String str, int i) {
        this.a = i;
        this.b = tprVar;
        this.c = eVar;
        this.w = str;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        String str = this.w;
        e eVar = this.c;
        tpr tprVar = this.b;
        switch (i) {
            case 0:
                Object collect = tprVar.collect(new a(vprVar, eVar, str), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object collect2 = tprVar.collect(new b(vprVar, eVar, str), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            case 2:
                Object collect3 = tprVar.collect(new c(vprVar, eVar, str), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
            default:
                Object collect4 = tprVar.collect(new d(vprVar, eVar, str), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : zy11Var;
        }
    }
}
