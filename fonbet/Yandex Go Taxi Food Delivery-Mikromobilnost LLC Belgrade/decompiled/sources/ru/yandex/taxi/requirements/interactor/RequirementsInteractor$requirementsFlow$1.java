package ru.yandex.taxi.requirements.interactor;

import androidx.media3.exoplayer.offline.DownloadService;
import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmi31;", "<unused var>", "", "Lb580;", DownloadService.KEY_REQUIREMENTS, "", "<anonymous>", "(Lmi31;Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.requirements.interactor.RequirementsInteractor$requirementsFlow$1", f = "RequirementsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RequirementsInteractor$requirementsFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        RequirementsInteractor$requirementsFlow$1 requirementsInteractor$requirementsFlow$1 = new RequirementsInteractor$requirementsFlow$1(4, (Continuation) obj4);
        requirementsInteractor$requirementsFlow$1.L$0 = (List) obj2;
        return requirementsInteractor$requirementsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return list;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
