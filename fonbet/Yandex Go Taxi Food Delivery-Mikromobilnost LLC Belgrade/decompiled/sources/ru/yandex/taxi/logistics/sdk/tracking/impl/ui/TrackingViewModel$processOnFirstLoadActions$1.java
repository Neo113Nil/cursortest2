package ru.yandex.taxi.logistics.sdk.tracking.impl.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.TrackingViewModel", f = "TrackingViewModel.kt", l = {269, 275, 277}, m = "processOnFirstLoadActions", v = 2)
/* loaded from: classes5.dex */
final class TrackingViewModel$processOnFirstLoadActions$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingViewModel$processOnFirstLoadActions$1(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return k.W(this.this$0, null, this);
    }
}
