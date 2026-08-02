package ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.UploadSmartCameraPhotoInteractor", f = "UploadSmartCameraPhotoInteractor.kt", l = {HProv.PP_REBOOT}, m = "launchAsyncTask", v = 2)
/* loaded from: classes5.dex */
final class UploadSmartCameraPhotoInteractor$launchAsyncTask$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadSmartCameraPhotoInteractor$launchAsyncTask$1(m mVar, Continuation continuation) {
        super(continuation);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return m.a(this.this$0, null, null, null, null, null, this);
    }
}
