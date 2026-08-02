package ru.yandex.taxi.logistics.photocomment;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.photocomment.DeliveryPhotocommentRouter", f = "DeliveryPhotocommentRouter.kt", l = {HProv.PP_VERSION_TIMESTAMP, HProv.PP_CONTAINER_EXTENSION, HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "showPermissionDeniedForeverDialog", v = 2)
/* loaded from: classes5.dex */
final class DeliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryPhotocommentRouter$showPermissionDeniedForeverDialog$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(0, 0, 0, this);
    }
}
