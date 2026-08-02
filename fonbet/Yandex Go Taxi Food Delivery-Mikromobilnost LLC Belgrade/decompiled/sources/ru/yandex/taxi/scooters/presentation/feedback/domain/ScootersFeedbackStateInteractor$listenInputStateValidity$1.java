package ru.yandex.taxi.scooters.presentation.feedback.domain;

import defpackage.evu0;
import defpackage.jwo0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ppm0;
import defpackage.uln0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackAttachments;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljwo0;", "specifiedFeedbackSettings", "Luln0;", "inputState", "", "<anonymous>", "(Ljwo0;Luln0;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.feedback.domain.ScootersFeedbackStateInteractor$listenInputStateValidity$1", f = "ScootersFeedbackStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersFeedbackStateInteractor$listenInputStateValidity$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFeedbackStateInteractor$listenInputStateValidity$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersFeedbackStateInteractor$listenInputStateValidity$1 scootersFeedbackStateInteractor$listenInputStateValidity$1 = new ScootersFeedbackStateInteractor$listenInputStateValidity$1(this.this$0, (Continuation) obj3);
        scootersFeedbackStateInteractor$listenInputStateValidity$1.L$0 = (jwo0) obj;
        scootersFeedbackStateInteractor$listenInputStateValidity$1.L$1 = (uln0) obj2;
        return scootersFeedbackStateInteractor$listenInputStateValidity$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        jwo0 jwo0Var = (jwo0) this.L$0;
        uln0 uln0Var = (uln0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.getClass();
        FeedbackAttachments.Requirement requirement = jwo0Var.b.a;
        requirement.getClass();
        FeedbackAttachments.Requirement requirement2 = FeedbackAttachments.Requirement.REQUIRED;
        boolean z = false;
        boolean z2 = requirement == requirement2;
        FeedbackAttachments.Requirement requirement3 = jwo0Var.b.b;
        requirement3.getClass();
        boolean z3 = requirement3 == requirement2;
        List list = uln0Var.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((ppm0) obj2).a()) {
                arrayList.add(obj2);
            }
        }
        if (!uln0Var.b && ((!z2 || !evu0.J(uln0Var.d)) && (!z3 || !arrayList.isEmpty()))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
