package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_entry_point.slime;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_entry_point.slime.SlimeState", f = "SlimeState.kt", l = {65}, m = "drag-Wko1d7g", v = 2)
/* loaded from: classes5.dex */
final class SlimeState$drag$1 extends ContinuationImpl {
    float F$0;
    float F$1;
    long J$0;
    long J$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlimeState$drag$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(0L, 0L, this);
    }
}
