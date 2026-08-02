package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.image;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.image.ImageWidgetMapper", f = "ImageWidgetMapper.kt", l = {21}, m = PolicyMappingsExtension.MAP, v = 2)
/* loaded from: classes5.dex */
final class ImageWidgetMapper$map$1 extends ContinuationImpl {
    float F$0;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageWidgetMapper$map$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
