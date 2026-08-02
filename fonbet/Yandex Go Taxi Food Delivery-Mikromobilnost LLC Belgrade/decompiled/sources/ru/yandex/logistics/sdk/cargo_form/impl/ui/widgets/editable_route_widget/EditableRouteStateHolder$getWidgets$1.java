package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.editable_route_widget;

import defpackage.con;
import defpackage.dms;
import defpackage.j6s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.wnn;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.logistics.sdk.cargo_form.core.api.repository.FormLoadingStateRepository$State;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "<unused var>", "Lwnn;", "coreWidget", "Lj6s;", ClidProvider.STATE, "Lru/yandex/logistics/sdk/cargo_form/core/api/repository/FormLoadingStateRepository$State;", "loadingState", "", "Ln351;", "<anonymous>", "(ZLwnn;Lj6s;Lru/yandex/logistics/sdk/cargo_form/core/api/repository/FormLoadingStateRepository$State;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.editable_route_widget.EditableRouteStateHolder$getWidgets$1", f = "EditableRouteStateHolder.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class EditableRouteStateHolder$getWidgets$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditableRouteStateHolder$getWidgets$1(b bVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Boolean) obj).booleanValue();
        EditableRouteStateHolder$getWidgets$1 editableRouteStateHolder$getWidgets$1 = new EditableRouteStateHolder$getWidgets$1(this.this$0, (Continuation) obj5);
        editableRouteStateHolder$getWidgets$1.L$0 = (wnn) obj2;
        editableRouteStateHolder$getWidgets$1.L$1 = (j6s) obj3;
        editableRouteStateHolder$getWidgets$1.L$2 = (FormLoadingStateRepository$State) obj4;
        return editableRouteStateHolder$getWidgets$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        wnn wnnVar = (wnn) this.L$0;
        j6s j6sVar = (j6s) this.L$1;
        FormLoadingStateRepository$State formLoadingStateRepository$State = (FormLoadingStateRepository$State) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (wnnVar == null || this.this$0.f.C(wnnVar)) {
                return EmptyList.a;
            }
            a aVar = this.this$0.d;
            boolean z = formLoadingStateRepository$State == FormLoadingStateRepository$State.LOADING;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            obj = aVar.a(wnnVar, j6sVar, z, this);
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
        return scc.h((con) obj);
    }
}
