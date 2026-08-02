package ru.yandex.taxi.logistics.ndd_route_selector.view;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.ndd_route_selector.view.NddRouteSelectorPresenter$createMapTouchedFlow$$inlined$filter$1$2", f = "NddRouteSelectorPresenter.kt", l = {217}, m = "emit", v = 2)
/* loaded from: classes5.dex */
public final class NddRouteSelectorPresenter$createMapTouchedFlow$$inlined$filter$1$2$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NddRouteSelectorPresenter$createMapTouchedFlow$$inlined$filter$1$2$1(b bVar, Continuation continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
