package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.slider_button;

import defpackage.dms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zos0;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.logistics.sdk.cargo_form.core.api.repository.FormLoadingStateRepository$State;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "<unused var>", "Lzos0;", "coreWidget", "Lru/yandex/logistics/sdk/cargo_form/core/api/repository/FormLoadingStateRepository$State;", "loadingState", "isAnyImageUploading", "", "Ln351;", "<anonymous>", "(ZLzos0;Lru/yandex/logistics/sdk/cargo_form/core/api/repository/FormLoadingStateRepository$State;Z)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.slider_button.SliderButtonStateHolder$getWidgets$1", f = "SliderButtonStateHolder.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SliderButtonStateHolder$getWidgets$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderButtonStateHolder$getWidgets$1(b bVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Boolean) obj).booleanValue();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        SliderButtonStateHolder$getWidgets$1 sliderButtonStateHolder$getWidgets$1 = new SliderButtonStateHolder$getWidgets$1(this.this$0, (Continuation) obj5);
        sliderButtonStateHolder$getWidgets$1.L$0 = (zos0) obj2;
        sliderButtonStateHolder$getWidgets$1.L$1 = (FormLoadingStateRepository$State) obj3;
        sliderButtonStateHolder$getWidgets$1.Z$0 = booleanValue;
        return sliderButtonStateHolder$getWidgets$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zos0 zos0Var = (zos0) this.L$0;
        FormLoadingStateRepository$State formLoadingStateRepository$State = (FormLoadingStateRepository$State) this.L$1;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (zos0Var == null || this.this$0.d.C(zos0Var)) {
                return EmptyList.a;
            }
            a aVar = this.this$0.c;
            this.L$0 = null;
            this.L$1 = null;
            this.Z$0 = z;
            this.label = 1;
            obj = aVar.a(zos0Var, formLoadingStateRepository$State, z, this);
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
