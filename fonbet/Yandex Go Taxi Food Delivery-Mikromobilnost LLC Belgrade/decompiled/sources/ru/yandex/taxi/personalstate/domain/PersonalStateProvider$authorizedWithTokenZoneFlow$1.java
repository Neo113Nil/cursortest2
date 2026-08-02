package ru.yandex.taxi.personalstate.domain;

import defpackage.be61;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbe61;", "zoneWithLaunchInfoId", "", "authorizedLaunchInfoId", "Lcom/yandex/go/zone/model/Zone;", "<anonymous>", "(Lbe61;Ljava/lang/String;)Lcom/yandex/go/zone/model/Zone;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.personalstate.domain.PersonalStateProvider$authorizedWithTokenZoneFlow$1", f = "PersonalStateProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PersonalStateProvider$authorizedWithTokenZoneFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PersonalStateProvider$authorizedWithTokenZoneFlow$1 personalStateProvider$authorizedWithTokenZoneFlow$1 = new PersonalStateProvider$authorizedWithTokenZoneFlow$1(3, (Continuation) obj3);
        personalStateProvider$authorizedWithTokenZoneFlow$1.L$0 = (be61) obj;
        personalStateProvider$authorizedWithTokenZoneFlow$1.L$1 = (String) obj2;
        return personalStateProvider$authorizedWithTokenZoneFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        be61 be61Var = (be61) this.L$0;
        String str = (String) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (jl40.l(be61Var.b, str)) {
            return be61Var.a;
        }
        return null;
    }
}
