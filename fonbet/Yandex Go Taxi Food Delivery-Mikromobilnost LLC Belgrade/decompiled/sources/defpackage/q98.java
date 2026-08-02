package defpackage;

import com.ybsdk.feature.card.internal.interactors.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.logistics.sdk.cargo_form.core.api.b;
import ru.yandex.logistics.sdk.cargo_form.core.impl.c;
import ru.yandex.logistics.sdk.cargo_form.core.impl.d;
import ru.yandex.logistics.sdk.cargo_form.core.impl.e;
import ru.yandex.logistics.sdk.cargo_form.core.impl.f;
import ru.yandex.logistics.sdk.cargo_form.core.impl.g;

/* loaded from: classes15.dex */
public final class q98 implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ mth b;

    public /* synthetic */ q98(mth mthVar, int i) {
        this.a = i;
        this.b = mthVar;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        mth mthVar = this.b;
        switch (i) {
            case 0:
                Object collect = mthVar.collect(new a(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object collect2 = mthVar.collect(new b(vprVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            case 2:
                Object collect3 = mthVar.collect(new c(vprVar), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
            case 3:
                Object collect4 = mthVar.collect(new d(vprVar), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : zy11Var;
            case 4:
                Object collect5 = mthVar.collect(new e(vprVar), continuation);
                return collect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect5 : zy11Var;
            case 5:
                Object collect6 = mthVar.collect(new f(vprVar), continuation);
                return collect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect6 : zy11Var;
            case 6:
                Object collect7 = mthVar.collect(new g(vprVar), continuation);
                return collect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect7 : zy11Var;
            case 7:
                Object collect8 = mthVar.collect(new com.yandex.messaging.internal.d(vprVar), continuation);
                return collect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect8 : zy11Var;
            case 8:
                Object collect9 = mthVar.collect(new com.yandex.messaging.domain.chatlist.a(vprVar), continuation);
                return collect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect9 : zy11Var;
            case 9:
                Object collect10 = mthVar.collect(new com.yandex.messaging.domain.threads.a(vprVar), continuation);
                return collect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect10 : zy11Var;
            case 10:
                Object collect11 = mthVar.collect(new ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.b(vprVar), continuation);
                return collect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect11 : zy11Var;
            default:
                Object collect12 = mthVar.collect(new com.yandex.messaging.activity.a(vprVar), continuation);
                return collect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect12 : zy11Var;
        }
    }
}
