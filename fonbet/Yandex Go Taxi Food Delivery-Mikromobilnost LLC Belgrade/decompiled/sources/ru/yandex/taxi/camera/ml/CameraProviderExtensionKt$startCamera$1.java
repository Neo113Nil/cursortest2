package ru.yandex.taxi.camera.ml;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.camera.ml.CameraProviderExtensionKt", f = "CameraProviderExtension.kt", l = {53}, m = "startCamera", v = 2)
/* loaded from: classes4.dex */
final class CameraProviderExtensionKt$startCamera$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.e(null, null, null, null, null, this);
    }
}
