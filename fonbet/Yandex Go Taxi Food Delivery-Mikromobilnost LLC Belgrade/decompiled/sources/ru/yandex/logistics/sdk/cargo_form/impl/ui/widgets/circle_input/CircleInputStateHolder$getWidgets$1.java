package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.circle_input;

import defpackage.dms;
import defpackage.j6s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sub;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.logistics.sdk.cargo_form.core.api.repository.FormLoadingStateRepository$State;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "<unused var>", "Lsub;", "coreWidget", "Lru/yandex/logistics/sdk/cargo_form/core/api/repository/FormLoadingStateRepository$State;", "loadingState", "Lj6s;", "formState", "", "Lrub;", "<anonymous>", "(ZLsub;Lru/yandex/logistics/sdk/cargo_form/core/api/repository/FormLoadingStateRepository$State;Lj6s;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.circle_input.CircleInputStateHolder$getWidgets$1", f = "CircleInputStateHolder.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CircleInputStateHolder$getWidgets$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleInputStateHolder$getWidgets$1(c cVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Boolean) obj).booleanValue();
        CircleInputStateHolder$getWidgets$1 circleInputStateHolder$getWidgets$1 = new CircleInputStateHolder$getWidgets$1(this.this$0, (Continuation) obj5);
        circleInputStateHolder$getWidgets$1.L$0 = (sub) obj2;
        circleInputStateHolder$getWidgets$1.L$1 = (FormLoadingStateRepository$State) obj3;
        circleInputStateHolder$getWidgets$1.L$2 = (j6s) obj4;
        return circleInputStateHolder$getWidgets$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sub subVar = (sub) this.L$0;
        FormLoadingStateRepository$State formLoadingStateRepository$State = (FormLoadingStateRepository$State) this.L$1;
        j6s j6sVar = (j6s) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (subVar == null || this.this$0.f.C(subVar)) {
                return EmptyList.a;
            }
            b bVar = this.this$0.b;
            boolean z = formLoadingStateRepository$State == FormLoadingStateRepository$State.LOADING;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            obj = bVar.a(subVar, z, j6sVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return Collections.singletonList(obj);
    }
}
