package ru.yandex.taxi.summary.topnotification.tariff_unavailable.presentation;

import android.graphics.Bitmap;
import defpackage.ipx0;
import defpackage.m7x0;
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
@mvg(c = "ru.yandex.taxi.summary.topnotification.tariff_unavailable.presentation.TariffUnavailableNotificationsPresenter$loadImage$job$1", f = "TariffUnavailableNotificationsPresenter.kt", l = {44}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TariffUnavailableNotificationsPresenter$loadImage$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageTag;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffUnavailableNotificationsPresenter$loadImage$job$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$imageTag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffUnavailableNotificationsPresenter$loadImage$job$1(this.this$0, this.$imageTag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffUnavailableNotificationsPresenter$loadImage$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            String str = this.$imageTag;
            this.label = 1;
            obj = ru.yandex.taxi.utils.a.b(aVar.x.b().b(((m7x0) aVar.y).a(str)), this);
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
        ((ipx0) this.this$0.Dg()).lf((Bitmap) obj);
        return zy11.a;
    }
}
