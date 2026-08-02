package ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zii0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", RemoteBioParameters.Y, "Lzii0;", "bounds", "", "<anonymous>", "(FLzii0;)Z"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.ScrollVisibilityRepositoryImpl$visibleFlow$2", f = "ScrollVisibilityRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ScrollVisibilityRepositoryImpl$visibleFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScrollVisibilityRepositoryImpl$visibleFlow$2 scrollVisibilityRepositoryImpl$visibleFlow$2 = new ScrollVisibilityRepositoryImpl$visibleFlow$2(3, (Continuation) obj3);
        scrollVisibilityRepositoryImpl$visibleFlow$2.L$0 = (Float) obj;
        scrollVisibilityRepositoryImpl$visibleFlow$2.L$1 = (zii0) obj2;
        return scrollVisibilityRepositoryImpl$visibleFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Float f = (Float) this.L$0;
        zii0 zii0Var = (zii0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(f != null && f.floatValue() >= zii0Var.b && f.floatValue() <= zii0Var.d);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
