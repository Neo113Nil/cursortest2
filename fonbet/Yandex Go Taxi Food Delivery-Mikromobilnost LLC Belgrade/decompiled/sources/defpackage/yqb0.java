package defpackage;

import com.yandex.plus.home.feature.webviews.internal.stories.c;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.logistics.sdk.cargo_form.core.impl.repository.h;

/* loaded from: classes5.dex */
public final class yqb0 implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ ha2 b;

    public /* synthetic */ yqb0(ha2 ha2Var, int i) {
        this.a = i;
        this.b = ha2Var;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ha2 ha2Var = this.b;
        switch (i) {
            case 0:
                Object collect = ha2Var.collect(new h(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            default:
                Object collect2 = ha2Var.collect(new c(vprVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
        }
    }
}
