package ru.yandex.taxi.order.view;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import defpackage.g16;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pav;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.xw;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.buttons.LoadingIconCircleButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.view.TopCircleButtonsView$loadIcon$job$1", f = "TopCircleButtonsView.kt", l = {256}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class TopCircleButtonsView$loadIcon$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ xw $actionModel;
    final /* synthetic */ LoadingIconCircleButton $circleButton;
    final /* synthetic */ sls $onShown;
    int label;
    final /* synthetic */ TopCircleButtonsView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopCircleButtonsView$loadIcon$job$1(xw xwVar, sls slsVar, Continuation continuation, TopCircleButtonsView topCircleButtonsView, LoadingIconCircleButton loadingIconCircleButton) {
        super(2, continuation);
        this.this$0 = topCircleButtonsView;
        this.$actionModel = xwVar;
        this.$onShown = slsVar;
        this.$circleButton = loadingIconCircleButton;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TopCircleButtonsView$loadIcon$job$1(this.$actionModel, this.$onShown, continuation, this.this$0, this.$circleButton);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TopCircleButtonsView$loadIcon$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pav pavVar;
        Object d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pavVar = this.this$0.imageLoader;
            if (pavVar == null) {
                pavVar = null;
            }
            g16 b = pavVar.b().b(this.$actionModel.d);
            this.label = 1;
            d = ru.yandex.taxi.utils.a.d(b, this);
            if (d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            d = ((Result) obj).getValue();
        }
        if (d instanceof Result.Failure) {
            this.this$0.setupFallbackIcon(this.$circleButton, this.$actionModel, this.$onShown);
            jst.e.h(null, "Error while loading icon into orders list item", Result.a(d));
        } else {
            this.$onShown.invoke();
            LoadingIconCircleButton loadingIconCircleButton = this.$circleButton;
            Resources resources = this.this$0.getResources();
            kotlin.b.b(d);
            loadingIconCircleButton.setIcon(new BitmapDrawable(resources, (Bitmap) d));
        }
        return zy11.a;
    }
}
