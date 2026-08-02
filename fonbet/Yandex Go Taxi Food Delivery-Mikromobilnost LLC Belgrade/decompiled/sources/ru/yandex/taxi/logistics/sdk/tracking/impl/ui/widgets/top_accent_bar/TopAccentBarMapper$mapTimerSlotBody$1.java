package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.top_accent_bar;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.top_accent_bar.TopAccentBarMapper", f = "TopAccentBarMapper.kt", l = {HProv.ALG_SID_SHA3_256, HProv.ALG_SID_SHA3_384}, m = "mapTimerSlotBody", v = 2)
/* loaded from: classes5.dex */
final class TopAccentBarMapper$mapTimerSlotBody$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopAccentBarMapper$mapTimerSlotBody$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, null, 0L, this);
    }
}
