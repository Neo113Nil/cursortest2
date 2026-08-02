package ru.yandex.taxi.ui.orders.card.base;

import android.graphics.Bitmap;
import android.widget.ImageView;
import defpackage.f2z;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.ui.orders.card.base.TrackingCardViewHolder$1$1", f = "TrackingCardViewHolder.kt", l = {60}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TrackingCardViewHolder$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $color;
    final /* synthetic */ ImageView $imageView;
    final /* synthetic */ f2z $localColorizedCarIconFactory;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingCardViewHolder$1$1(f2z f2zVar, int i, ImageView imageView, Continuation continuation) {
        super(2, continuation);
        this.$localColorizedCarIconFactory = f2zVar;
        this.$color = i;
        this.$imageView = imageView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrackingCardViewHolder$1$1(this.$localColorizedCarIconFactory, this.$color, this.$imageView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackingCardViewHolder$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            f2z f2zVar = this.$localColorizedCarIconFactory;
            int i2 = this.$color;
            this.label = 1;
            obj = ((com.yandex.go.order.ui.presentation.car.a) f2zVar).b(i2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        this.$imageView.setImageBitmap((Bitmap) obj);
        return zy11.a;
    }
}
