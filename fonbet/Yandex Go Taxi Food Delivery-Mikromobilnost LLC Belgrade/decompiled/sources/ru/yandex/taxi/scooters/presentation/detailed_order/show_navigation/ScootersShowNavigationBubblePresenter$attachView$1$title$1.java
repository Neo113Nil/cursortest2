package ru.yandex.taxi.scooters.presentation.detailed_order.show_navigation;

import defpackage.fwo0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.show_navigation.ScootersShowNavigationBubblePresenter$attachView$1$title$1", f = "ScootersShowNavigationBubblePresenter.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersShowNavigationBubblePresenter$attachView$1$title$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ fwo0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersShowNavigationBubblePresenter$attachView$1$title$1(fwo0 fwo0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fwo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersShowNavigationBubblePresenter$attachView$1$title$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersShowNavigationBubblePresenter$attachView$1$title$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        fwo0 fwo0Var = this.this$0;
        c cVar = fwo0Var.B;
        FormattedText formattedText = fwo0Var.E.a;
        this.label = 1;
        Object e = c.e(cVar, formattedText, null, false, this, 30);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
