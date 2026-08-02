package ru.yandex.taxi.order;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.order.GeoSharingInteractorImpl", f = "GeoSharingInteractor.kt", l = {106}, m = "enableGeoSharingLocation", v = 2)
/* loaded from: classes6.dex */
final class GeoSharingInteractorImpl$enableGeoSharingLocation$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoSharingInteractorImpl$enableGeoSharingLocation$1(Continuation continuation, d dVar) {
        super(continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d.b(this.this$0, false, this);
    }
}
