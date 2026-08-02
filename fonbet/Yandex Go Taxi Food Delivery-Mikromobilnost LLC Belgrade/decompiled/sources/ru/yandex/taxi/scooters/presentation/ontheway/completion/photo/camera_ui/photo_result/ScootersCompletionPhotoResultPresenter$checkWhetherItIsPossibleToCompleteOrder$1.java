package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result.ScootersCompletionPhotoResultPresenter", f = "ScootersCompletionPhotoResultPresenter.kt", l = {HProv.PP_SIGNATUREOID}, m = "checkWhetherItIsPossibleToCompleteOrder", v = 2)
/* loaded from: classes6.dex */
final class ScootersCompletionPhotoResultPresenter$checkWhetherItIsPossibleToCompleteOrder$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCompletionPhotoResultPresenter$checkWhetherItIsPossibleToCompleteOrder$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.Kg(this.this$0, null, this);
    }
}
