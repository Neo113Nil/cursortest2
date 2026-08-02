package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo.ScootersCompletionTakePhotoPresenter", f = "ScootersCompletionTakePhotoPresenter.kt", l = {HProv.PP_CONTAINER_EXTENSION_DEL}, m = "tryStartParkingValidationTimer", v = 2)
/* loaded from: classes6.dex */
final class ScootersCompletionTakePhotoPresenter$tryStartParkingValidationTimer$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCompletionTakePhotoPresenter$tryStartParkingValidationTimer$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d.Lg(this.this$0, this);
    }
}
