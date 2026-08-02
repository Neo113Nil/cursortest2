package ru.yandex.taxi.layers.source.factory.componentfactory;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.layers.source.factory.componentfactory.ImageOverlayComponentFactory", f = "ImageOverlayComponentFactory.kt", l = {HProv.PP_SECURITY_LEVEL, 130, HProv.PP_FAST_CODE}, m = "requestImageBitmap", v = 2)
/* loaded from: classes5.dex */
final class ImageOverlayComponentFactory$requestImageBitmap$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ w this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageOverlayComponentFactory$requestImageBitmap$1(w wVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return w.e(this.this$0, null, this);
    }
}
