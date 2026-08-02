package ru.yandex.taxi.summary.personalaction.notification;

import android.graphics.Bitmap;
import defpackage.g16;
import defpackage.m3b0;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.personalaction.notification.PersonalActionNotificationController$render$2", f = "PersonalActionNotificationController.kt", l = {70}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PersonalActionNotificationController$render$2 extends SuspendLambda implements wls {
    final /* synthetic */ PersonalActionNotificationComponent $item;
    final /* synthetic */ m3b0 $viewModel;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalActionNotificationController$render$2(b bVar, m3b0 m3b0Var, PersonalActionNotificationComponent personalActionNotificationComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$viewModel = m3b0Var;
        this.$item = personalActionNotificationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PersonalActionNotificationController$render$2(this.this$0, this.$viewModel, this.$item, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PersonalActionNotificationController$render$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g16 b = this.this$0.d.b().b(((m7x0) this.this$0.e).a(this.$viewModel.c));
            this.label = 1;
            obj = ru.yandex.taxi.utils.a.b(b, this);
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
        this.$item.renderIcon((Bitmap) obj);
        return zy11.a;
    }
}
