package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.ScootersCompletionPhotoCameraUiFactory$create$1", f = "ScootersCompletionPhotoCameraUiFactory.kt", l = {48}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersCompletionPhotoCameraUiFactory$create$1 extends SuspendLambda implements wls {
    final /* synthetic */ zuo0 $sessionState;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCompletionPhotoCameraUiFactory$create$1(a aVar, zuo0 zuo0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$sessionState = zuo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersCompletionPhotoCameraUiFactory$create$1(this.this$0, this.$sessionState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCompletionPhotoCameraUiFactory$create$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            d dVar = this.this$0.g;
            zuo0 zuo0Var = this.$sessionState;
            this.label = 1;
            if (dVar.a(zuo0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
