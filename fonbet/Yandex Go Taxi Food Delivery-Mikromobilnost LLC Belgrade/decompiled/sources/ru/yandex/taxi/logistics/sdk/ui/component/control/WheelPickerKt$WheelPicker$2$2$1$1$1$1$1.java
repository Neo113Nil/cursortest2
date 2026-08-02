package ru.yandex.taxi.logistics.sdk.ui.component.control;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tig0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.ui.component.control.WheelPickerKt$WheelPicker$2$2$1$1$1$1$1", f = "WheelPicker.kt", l = {HProv.PP_INFO}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class WheelPickerKt$WheelPicker$2$2$1$1$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $index;
    final /* synthetic */ androidx.compose.foundation.lazy.b $lazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WheelPickerKt$WheelPicker$2$2$1$1$1$1$1(int i, androidx.compose.foundation.lazy.b bVar, Continuation continuation) {
        super(2, continuation);
        this.$lazyListState = bVar;
        this.$index = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WheelPickerKt$WheelPicker$2$2$1$1$1$1$1(this.$index, this.$lazyListState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WheelPickerKt$WheelPicker$2$2$1$1$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            androidx.compose.foundation.lazy.b bVar = this.$lazyListState;
            int i2 = this.$index;
            this.label = 1;
            tig0 tig0Var = androidx.compose.foundation.lazy.b.y;
            if (bVar.f(i2, 0, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
