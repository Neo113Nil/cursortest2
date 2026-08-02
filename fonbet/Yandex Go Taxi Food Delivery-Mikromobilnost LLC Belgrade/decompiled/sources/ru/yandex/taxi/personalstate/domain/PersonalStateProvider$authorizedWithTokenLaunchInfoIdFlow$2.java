package ru.yandex.taxi.personalstate.domain;

import defpackage.dvx;
import defpackage.fl3;
import defpackage.hl3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldvx;", "launchInfo", "Lhl3;", "authStatus", "", "<anonymous>", "(Ldvx;Lhl3;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.personalstate.domain.PersonalStateProvider$authorizedWithTokenLaunchInfoIdFlow$2", f = "PersonalStateProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PersonalStateProvider$authorizedWithTokenLaunchInfoIdFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PersonalStateProvider$authorizedWithTokenLaunchInfoIdFlow$2 personalStateProvider$authorizedWithTokenLaunchInfoIdFlow$2 = new PersonalStateProvider$authorizedWithTokenLaunchInfoIdFlow$2(3, (Continuation) obj3);
        personalStateProvider$authorizedWithTokenLaunchInfoIdFlow$2.L$0 = (dvx) obj;
        personalStateProvider$authorizedWithTokenLaunchInfoIdFlow$2.L$1 = (hl3) obj2;
        return personalStateProvider$authorizedWithTokenLaunchInfoIdFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dvx dvxVar = (dvx) this.L$0;
        hl3 hl3Var = (hl3) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if ((hl3Var instanceof fl3) && dvxVar.a()) {
            return dvxVar.a;
        }
        return null;
    }
}
