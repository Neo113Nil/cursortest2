package ru.yandex.taxi.layers.presentation.walkroute;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.layers.presentation.walkroute.BaseWalkRouteInteractor", f = "BaseWalkRouteInteractor.kt", l = {SubsamplingScaleImageView.ORIENTATION_180}, m = "focusOnRoute", v = 2)
/* loaded from: classes5.dex */
final class BaseWalkRouteInteractor$focusOnRoute$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWalkRouteInteractor$focusOnRoute$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.a(this.this$0, null, null, this);
    }
}
