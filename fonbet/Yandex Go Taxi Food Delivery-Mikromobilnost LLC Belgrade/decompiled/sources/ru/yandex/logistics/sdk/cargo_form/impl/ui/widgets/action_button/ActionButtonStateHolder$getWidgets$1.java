package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.action_button;

import defpackage.dms;
import defpackage.et;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.logistics.sdk.cargo_form.core.api.repository.FormLoadingStateRepository$State;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "<unused var>", "Let;", "coreWidget", "Lru/yandex/logistics/sdk/cargo_form/core/api/repository/FormLoadingStateRepository$State;", "loadingState", "isAnyImageUploading", "", "Ln351;", "<anonymous>", "(ZLet;Lru/yandex/logistics/sdk/cargo_form/core/api/repository/FormLoadingStateRepository$State;Z)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.action_button.ActionButtonStateHolder$getWidgets$1", f = "ActionButtonStateHolder.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ActionButtonStateHolder$getWidgets$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionButtonStateHolder$getWidgets$1(b bVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Boolean) obj).booleanValue();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        ActionButtonStateHolder$getWidgets$1 actionButtonStateHolder$getWidgets$1 = new ActionButtonStateHolder$getWidgets$1(this.this$0, (Continuation) obj5);
        actionButtonStateHolder$getWidgets$1.L$0 = (et) obj2;
        actionButtonStateHolder$getWidgets$1.L$1 = (FormLoadingStateRepository$State) obj3;
        actionButtonStateHolder$getWidgets$1.Z$0 = booleanValue;
        return actionButtonStateHolder$getWidgets$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        et etVar = (et) this.L$0;
        FormLoadingStateRepository$State formLoadingStateRepository$State = (FormLoadingStateRepository$State) this.L$1;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (etVar == null || this.this$0.f.C(etVar)) {
                return EmptyList.a;
            }
            a aVar = this.this$0.c;
            this.L$0 = null;
            this.L$1 = null;
            this.Z$0 = z;
            this.label = 1;
            obj = aVar.a(etVar, formLoadingStateRepository$State, z, ActionButtonMapper$Container.FORM, this);
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
