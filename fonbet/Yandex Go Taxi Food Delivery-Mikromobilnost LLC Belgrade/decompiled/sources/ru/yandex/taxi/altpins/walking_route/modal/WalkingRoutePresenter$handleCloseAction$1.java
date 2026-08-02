package ru.yandex.taxi.altpins.walking_route.modal;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.altpins.walking_route.modal.WalkingRoutePresenter", f = "WalkingRoutePresenter.kt", l = {71}, m = "handleCloseAction", v = 2)
/* loaded from: classes5.dex */
final class WalkingRoutePresenter$handleCloseAction$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkingRoutePresenter$handleCloseAction$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.Kg(this.this$0, this);
    }
}
