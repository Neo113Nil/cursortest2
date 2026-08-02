package ru.yandex.yandexmaps.multiplatform.pin.war.internal.callback;

import defpackage.ayb0;
import defpackage.j2c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pwb0;
import defpackage.qwb0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.w2t;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.yandexmaps.multiplatform.pin.war.callback.PinInvalidationReason;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltse;", "Lqwb0;", "<anonymous>", "(Ltse;)Lqwb0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.internal.callback.PinInvalidationCallbackManagerKt$mapWithCoverage$2", f = "PinInvalidationCallbackManager.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class PinInvalidationCallbackManagerKt$mapWithCoverage$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<ayb0> $covered;
    final /* synthetic */ PinInvalidationReason $reason;
    final /* synthetic */ j2c0 $visibleRegion;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinInvalidationCallbackManagerKt$mapWithCoverage$2(List list, PinInvalidationReason pinInvalidationReason, j2c0 j2c0Var, Continuation continuation) {
        super(2, continuation);
        this.$covered = list;
        this.$reason = pinInvalidationReason;
        this.$visibleRegion = j2c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinInvalidationCallbackManagerKt$mapWithCoverage$2(this.$covered, this.$reason, this.$visibleRegion, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinInvalidationCallbackManagerKt$mapWithCoverage$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        List<ayb0> list = this.$covered;
        j2c0 j2c0Var = this.$visibleRegion;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (ayb0 ayb0Var : list) {
            arrayList.add(new pwb0(ayb0Var.a, ayb0Var.b, ayb0Var.c, w2t.a(j2c0Var, ayb0Var.a.c)));
        }
        return new qwb0(this.$reason, arrayList);
    }
}
