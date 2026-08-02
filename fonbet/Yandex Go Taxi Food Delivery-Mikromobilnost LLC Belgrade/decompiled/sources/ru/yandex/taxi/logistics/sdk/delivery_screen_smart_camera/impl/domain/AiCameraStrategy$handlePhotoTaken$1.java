package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.AiCameraStrategy", f = "AiCameraStrategy.kt", l = {HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "handlePhotoTaken", v = 2)
/* loaded from: classes5.dex */
final class AiCameraStrategy$handlePhotoTaken$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiCameraStrategy$handlePhotoTaken$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.f(this.this$0, null, null, null, this);
    }
}
