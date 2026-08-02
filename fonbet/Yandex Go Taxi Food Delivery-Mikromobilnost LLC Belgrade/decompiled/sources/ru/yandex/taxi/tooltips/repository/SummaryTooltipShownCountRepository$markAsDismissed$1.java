package ru.yandex.taxi.tooltips.repository;

import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class SummaryTooltipShownCountRepository$markAsDismissed$1 extends FunctionReferenceImpl implements wls {
    public static final SummaryTooltipShownCountRepository$markAsDismissed$1 b = new SummaryTooltipShownCountRepository$markAsDismissed$1(2, 0, Integer.TYPE, "plus", "plus(I)I");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(((Number) obj2).intValue() + ((Number) obj).intValue());
    }
}
