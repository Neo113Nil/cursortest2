package ru.yandex.logistics.sdk.cargo_form.core.impl.datastore;

import defpackage.ez40;
import defpackage.kme0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lez40;", Constants.KEY_DATA, "Lzy11;", "<anonymous>", "(Lez40;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.FormStateDataStore$clearAllExcept$2", f = "FormStateDataStore.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FormStateDataStore$clearAllExcept$2 extends SuspendLambda implements wls {
    final /* synthetic */ Set<String> $uuids;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormStateDataStore$clearAllExcept$2(Set set, Continuation continuation) {
        super(2, continuation);
        this.$uuids = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FormStateDataStore$clearAllExcept$2 formStateDataStore$clearAllExcept$2 = new FormStateDataStore$clearAllExcept$2(this.$uuids, continuation);
        formStateDataStore$clearAllExcept$2.L$0 = obj;
        return formStateDataStore$clearAllExcept$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FormStateDataStore$clearAllExcept$2 formStateDataStore$clearAllExcept$2 = (FormStateDataStore$clearAllExcept$2) create((ez40) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        formStateDataStore$clearAllExcept$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ez40 ez40Var = (ez40) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Set<kme0> N0 = kotlin.collections.a.N0(ez40Var.a().keySet());
        Set<String> set = this.$uuids;
        for (kme0 kme0Var : N0) {
            if (!set.contains(kme0Var.a)) {
                ez40Var.f(kme0Var);
            }
        }
        return zy11.a;
    }
}
