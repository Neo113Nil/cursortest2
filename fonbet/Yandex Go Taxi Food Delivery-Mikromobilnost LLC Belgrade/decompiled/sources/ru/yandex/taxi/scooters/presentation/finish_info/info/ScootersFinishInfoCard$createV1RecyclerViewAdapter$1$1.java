package ru.yandex.taxi.scooters.presentation.finish_info.info;

import defpackage.cvw;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class ScootersFinishInfoCard$createV1RecyclerViewAdapter$1$1 extends FunctionReferenceImpl implements sls {
    final /* synthetic */ ScootersFinishInfoCard this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoCard$createV1RecyclerViewAdapter$1$1(ScootersFinishInfoCard scootersFinishInfoCard) {
        super(0, 0, cvw.class, "prepareInfoItem", "createV1RecyclerViewAdapter$prepareInfoItem(Lru/yandex/taxi/scooters/presentation/finish_info/info/ScootersFinishInfoCard;)Lru/yandex/taxi/design/ListItemComponent;");
        this.this$0 = scootersFinishInfoCard;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ListItemComponent createV1RecyclerViewAdapter$prepareInfoItem;
        createV1RecyclerViewAdapter$prepareInfoItem = ScootersFinishInfoCard.createV1RecyclerViewAdapter$prepareInfoItem(this.this$0);
        return createV1RecyclerViewAdapter$prepareInfoItem;
    }
}
