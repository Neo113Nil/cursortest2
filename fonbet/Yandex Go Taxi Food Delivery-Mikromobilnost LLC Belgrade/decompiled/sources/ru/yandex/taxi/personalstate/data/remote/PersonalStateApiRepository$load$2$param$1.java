package ru.yandex.taxi.personalstate.data.remote;

import defpackage.c6b0;
import defpackage.fwq;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x6b0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lfwq;", "<anonymous>", "(Ltse;)Lfwq;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.personalstate.data.remote.PersonalStateApiRepository$load$2$param$1", f = "PersonalStateApiRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PersonalStateApiRepository$load$2$param$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $launchInfoId;
    final /* synthetic */ List<zzs> $route;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalStateApiRepository$load$2$param$1(b bVar, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$launchInfoId = str;
        this.$route = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PersonalStateApiRepository$load$2$param$1(this.this$0, this.$launchInfoId, this.$route, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PersonalStateApiRepository$load$2$param$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c6b0 c6b0Var = this.this$0.d.b;
        c6b0Var.getClass();
        c6b0Var.a.a("PersonalState.Remote.Loading.Processing", new HashMap(), 1, new HashMap());
        x6b0 x6b0Var = new x6b0();
        x6b0Var.a = this.$launchInfoId;
        x6b0Var.b = this.$route;
        return new fwq(x6b0Var);
    }
}
