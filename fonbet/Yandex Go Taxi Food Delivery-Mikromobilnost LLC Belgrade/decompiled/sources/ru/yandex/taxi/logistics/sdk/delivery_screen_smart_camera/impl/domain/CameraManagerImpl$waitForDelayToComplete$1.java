package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.CameraManagerImpl", f = "CameraManagerImpl.kt", l = {179}, m = "waitForDelayToComplete", v = 2)
/* loaded from: classes5.dex */
final class CameraManagerImpl$waitForDelayToComplete$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraManagerImpl$waitForDelayToComplete$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.a(this.this$0, this);
    }
}
