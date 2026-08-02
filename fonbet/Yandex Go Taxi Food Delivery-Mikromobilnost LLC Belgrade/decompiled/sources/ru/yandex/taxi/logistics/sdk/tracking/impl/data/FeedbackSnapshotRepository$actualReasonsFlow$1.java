package ru.yandex.taxi.logistics.sdk.tracking.impl.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "", "availableReasons", "selectedReasons"}, k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.data.FeedbackSnapshotRepository$actualReasonsFlow$1", f = "FeedbackSnapshotRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FeedbackSnapshotRepository$actualReasonsFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FeedbackSnapshotRepository$actualReasonsFlow$1 feedbackSnapshotRepository$actualReasonsFlow$1 = new FeedbackSnapshotRepository$actualReasonsFlow$1(3, (Continuation) obj3);
        feedbackSnapshotRepository$actualReasonsFlow$1.L$0 = (Set) obj;
        feedbackSnapshotRepository$actualReasonsFlow$1.L$1 = (Set) obj2;
        return feedbackSnapshotRepository$actualReasonsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Set set = (Set) this.L$0;
        Set set2 = (Set) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return (set == null || set2 == null) ? EmptySet.a : kotlin.collections.a.U(set, set2);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
