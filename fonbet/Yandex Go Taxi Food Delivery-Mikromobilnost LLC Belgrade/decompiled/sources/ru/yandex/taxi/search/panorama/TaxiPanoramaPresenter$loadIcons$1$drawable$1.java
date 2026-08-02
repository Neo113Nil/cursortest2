package ru.yandex.taxi.search.panorama;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.y8y0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/BitmapDrawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/BitmapDrawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.search.panorama.TaxiPanoramaPresenter$loadIcons$1$drawable$1", f = "TaxiPanoramaPresenter.kt", l = {199}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TaxiPanoramaPresenter$loadIcons$1$drawable$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $acceptPickupPointDescIconTag;
    int label;
    final /* synthetic */ y8y0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiPanoramaPresenter$loadIcons$1$drawable$1(y8y0 y8y0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = y8y0Var;
        this.$acceptPickupPointDescIconTag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiPanoramaPresenter$loadIcons$1$drawable$1(this.this$0, this.$acceptPickupPointDescIconTag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiPanoramaPresenter$loadIcons$1$drawable$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0.A;
        String str = this.$acceptPickupPointDescIconTag;
        this.label = 1;
        Object f = e.f(eVar, str, null, this, 6);
        return f == coroutineSingletons ? coroutineSingletons : f;
    }
}
