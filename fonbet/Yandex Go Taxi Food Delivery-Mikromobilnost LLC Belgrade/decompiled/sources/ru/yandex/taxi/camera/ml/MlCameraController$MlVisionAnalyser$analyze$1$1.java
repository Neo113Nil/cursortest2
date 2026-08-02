package ru.yandex.taxi.camera.ml;

import android.media.Image;
import defpackage.jdv;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uk20;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.camera.ml.MlCameraController$MlVisionAnalyser$analyze$1$1", f = "MlCameraController.kt", l = {91}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MlCameraController$MlVisionAnalyser$analyze$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ uk20 $detector;
    final /* synthetic */ jdv $image;
    final /* synthetic */ Image $resultImage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlCameraController$MlVisionAnalyser$analyze$1$1(uk20 uk20Var, Image image, jdv jdvVar, Continuation continuation) {
        super(2, continuation);
        this.$detector = uk20Var;
        this.$resultImage = image;
        this.$image = jdvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MlCameraController$MlVisionAnalyser$analyze$1$1(this.$detector, this.$resultImage, this.$image, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MlCameraController$MlVisionAnalyser$analyze$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.vendor_api.google.bank_card.a aVar = (ru.yandex.taxi.vendor_api.google.bank_card.a) this.$detector;
            Image image = this.$resultImage;
            int e = this.$image.G0().e();
            this.label = 1;
            if (aVar.b(image, e, this) == coroutineSingletons) {
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
