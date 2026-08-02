package ru.yandex.taxi.summary.promotions.repository;

import defpackage.tls;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class SummaryPromotionsRepository$computeTariffIconOverrides$1$tag$1 extends FunctionReferenceImpl implements tls {
    public SummaryPromotionsRepository$computeTariffIconOverrides$1$tag$1(LinkedHashMap linkedHashMap) {
        super(1, linkedHashMap, Map.class, "get", "get(Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return (SummaryPromotionsResponse.a) ((Map) this.receiver).get((String) obj);
    }
}
