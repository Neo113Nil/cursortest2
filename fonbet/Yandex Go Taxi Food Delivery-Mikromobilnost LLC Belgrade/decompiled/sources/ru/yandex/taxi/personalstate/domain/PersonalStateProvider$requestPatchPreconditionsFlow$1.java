package ru.yandex.taxi.personalstate.domain;

import com.yandex.go.zone.model.Zone;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/zone/model/Zone;", "isFirstPersonalStateDataHandledState", "", "zone"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.personalstate.domain.PersonalStateProvider$requestPatchPreconditionsFlow$1", f = "PersonalStateProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PersonalStateProvider$requestPatchPreconditionsFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        PersonalStateProvider$requestPatchPreconditionsFlow$1 personalStateProvider$requestPatchPreconditionsFlow$1 = new PersonalStateProvider$requestPatchPreconditionsFlow$1(3, (Continuation) obj3);
        personalStateProvider$requestPatchPreconditionsFlow$1.Z$0 = booleanValue;
        personalStateProvider$requestPatchPreconditionsFlow$1.L$0 = (Zone) obj2;
        return personalStateProvider$requestPatchPreconditionsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        Zone zone = (Zone) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (z) {
            return zone;
        }
        return null;
    }
}
