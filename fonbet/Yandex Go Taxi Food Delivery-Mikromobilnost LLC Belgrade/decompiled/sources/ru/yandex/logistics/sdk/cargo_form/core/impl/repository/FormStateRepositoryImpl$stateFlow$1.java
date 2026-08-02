package ru.yandex.logistics.sdk.cargo_form.core.impl.repository;

import defpackage.j6s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "", "Lru/yandex/logistics/sdk/cargo_form/core/impl/repository/FormDefaultState;", "defaultState", "Lj6s;", ClidProvider.STATE, "<anonymous>", "(Ljava/util/Map;Lj6s;)Lj6s;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.core.impl.repository.FormStateRepositoryImpl$stateFlow$1", f = "FormStateRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FormStateRepositoryImpl$stateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FormStateRepositoryImpl$stateFlow$1 formStateRepositoryImpl$stateFlow$1 = new FormStateRepositoryImpl$stateFlow$1(3, (Continuation) obj3);
        formStateRepositoryImpl$stateFlow$1.L$0 = (Map) obj;
        formStateRepositoryImpl$stateFlow$1.L$1 = (j6s) obj2;
        return formStateRepositoryImpl$stateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map = (Map) this.L$0;
        j6s j6sVar = (j6s) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new j6s(kotlin.collections.b.n(map, j6sVar.a), j6sVar.b, j6sVar.c, j6sVar.d, j6sVar.e, j6sVar.f, j6sVar.g, j6sVar.h, j6sVar.i);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
