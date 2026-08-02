package ru.yandex.yandexmaps.multiplatform.pin.war.internal.painter;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.internal.painter.PinPainter", f = "PinPainter.kt", l = {310, 311}, m = "createMissingPlacemarks", v = 1)
/* loaded from: classes7.dex */
final class PinPainter$createMissingPlacemarks$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinPainter$createMissingPlacemarks$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, this);
    }
}
