package ru.yandex.taxi.scooters.presentation.finish_info.info;

import defpackage.cvw;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.order.view.CostDetailsView;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class ScootersFinishInfoCard$createV2RecyclerViewAdapter$1$1 extends FunctionReferenceImpl implements sls {
    final /* synthetic */ ScootersFinishInfoCard this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoCard$createV2RecyclerViewAdapter$1$1(ScootersFinishInfoCard scootersFinishInfoCard) {
        super(0, 0, cvw.class, "prepareCostDetailsView", "createV2RecyclerViewAdapter$prepareCostDetailsView(Lru/yandex/taxi/scooters/presentation/finish_info/info/ScootersFinishInfoCard;)Lru/yandex/taxi/order/view/CostDetailsView;");
        this.this$0 = scootersFinishInfoCard;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        CostDetailsView createV2RecyclerViewAdapter$prepareCostDetailsView;
        createV2RecyclerViewAdapter$prepareCostDetailsView = ScootersFinishInfoCard.createV2RecyclerViewAdapter$prepareCostDetailsView(this.this$0);
        return createV2RecyclerViewAdapter$prepareCostDetailsView;
    }
}
