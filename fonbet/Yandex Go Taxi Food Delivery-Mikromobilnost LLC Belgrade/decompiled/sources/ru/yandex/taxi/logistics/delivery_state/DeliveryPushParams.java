package ru.yandex.taxi.logistics.delivery_state;

import com.adjust.sdk.Constants;
import com.yandex.delivery.mapper.model.Expansion;
import defpackage.hli;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/delivery_state/DeliveryPushParams;", "Ljava/io/Serializable;", "", "deliveryId", "Lcom/yandex/delivery/mapper/model/Expansion;", "expansion", "", "", Constants.REFERRER_API_META, "<init>", "(Ljava/lang/String;Lcom/yandex/delivery/mapper/model/Expansion;Ljava/util/Map;)V", "Ljava/lang/String;", "getDeliveryId", "()Ljava/lang/String;", "Lcom/yandex/delivery/mapper/model/Expansion;", "getExpansion", "()Lcom/yandex/delivery/mapper/model/Expansion;", "Ljava/util/Map;", "getMeta", "()Ljava/util/Map;", "Companion", "hli", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryPushParams implements Serializable {
    public static final hli Companion = new hli();
    private final String deliveryId;
    private final Expansion expansion;
    private final Map<String, Object> meta;

    public /* synthetic */ DeliveryPushParams(String str, Expansion expansion, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? Expansion.EXPANDED : expansion, (i & 4) != 0 ? null : map);
    }

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final Expansion getExpansion() {
        return this.expansion;
    }

    public final Map<String, Object> getMeta() {
        return this.meta;
    }

    public DeliveryPushParams(String str, Expansion expansion, Map<String, ? extends Object> map) {
        this.deliveryId = str;
        this.expansion = expansion;
        this.meta = map;
    }
}
