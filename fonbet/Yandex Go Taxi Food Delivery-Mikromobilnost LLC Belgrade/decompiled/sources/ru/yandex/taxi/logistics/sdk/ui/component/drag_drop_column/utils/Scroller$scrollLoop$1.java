package ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils;

import defpackage.mvg;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.Scroller", f = "Scroller.kt", l = {110, BuildConfig.API_LEVEL, HProv.PP_FAST_CODE}, m = "scrollLoop", v = 2)
/* loaded from: classes5.dex */
final class Scroller$scrollLoop$1 extends ContinuationImpl {
    float F$0;
    float F$1;
    float F$2;
    float F$3;
    float F$4;
    float F$5;
    float F$6;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Scroller$scrollLoop$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return g.a(this.this$0, this);
    }
}
