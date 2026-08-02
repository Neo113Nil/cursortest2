package ru.yandex.taxi.panorama.ridecard;

import defpackage.c4v;
import defpackage.g8e;
import defpackage.i8y0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pfv;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Ltse;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.panorama.ridecard.RideCardTaxiPanoramaInteractorImpl$getPinBitmap$pinIcon$1", f = "RideCardTaxiPanoramaInteractorImpl.kt", l = {249}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RideCardTaxiPanoramaInteractorImpl$getPinBitmap$pinIcon$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $pinImageTag;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardTaxiPanoramaInteractorImpl$getPinBitmap$pinIcon$1(d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$pinImageTag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardTaxiPanoramaInteractorImpl$getPinBitmap$pinIcon$1(this.this$0, this.$pinImageTag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardTaxiPanoramaInteractorImpl$getPinBitmap$pinIcon$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.utils.d dVar = this.this$0.c;
            c4v c4vVar = new c4v(this.$pinImageTag, (String) null, 2);
            this.label = 1;
            a = dVar.a(c4vVar, pfv.a, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        Throwable a2 = Result.a(a);
        if (a2 == null) {
            if (a instanceof Result.Failure) {
                return null;
            }
            return a;
        }
        String o = g8e.o("error when load icon: ", this.$pinImageTag);
        this.this$0.d.getClass();
        i8y0.a(a2, o);
        return null;
    }
}
