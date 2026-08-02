package ru.yandex.taxi.summary.solid.promotion_modal_windows.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.summary.solid.promotion_modal_windows.domain.SummaryPromotionModalWindowsOnOrderModelMapper", f = "SummaryPromotionModalWindowsOnOrderModelMapper.kt", l = {HProv.PROV_GOST_2001_DH, 72}, m = "mapSlot", v = 2)
/* loaded from: classes6.dex */
final class SummaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(this.this$0, null, this);
    }
}
