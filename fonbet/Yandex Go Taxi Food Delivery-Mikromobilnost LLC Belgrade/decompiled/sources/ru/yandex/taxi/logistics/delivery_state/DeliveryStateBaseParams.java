package ru.yandex.taxi.logistics.delivery_state;

import com.adjust.sdk.Constants;
import com.yandex.delivery.mapper.model.Expansion;
import java.io.Serializable;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001BO\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u001a\u0002\b\u000f¢\u0006\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018Ê\u0001\u0002\b\u001a¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/delivery_state/DeliveryStateBaseParams;", "Ljava/io/Serializable;", "deliveryId", "", Constants.REFERRER_API_META, "", "", "expansion", "Lcom/yandex/delivery/mapper/model/Expansion;", "localUuid", "Ljava/util/UUID;", "isCompleted", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lcom/yandex/delivery/mapper/model/Expansion;Ljava/util/UUID;Z)V", "Lkotlin/jvm/JvmOverloads;", "getDeliveryId", "()Ljava/lang/String;", "getMeta", "()Ljava/util/Map;", "getExpansion", "()Lcom/yandex/delivery/mapper/model/Expansion;", "getLocalUuid", "()Ljava/util/UUID;", "()Z", "common", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryStateBaseParams implements Serializable {
    private final String deliveryId;
    private final Expansion expansion;
    private final boolean isCompleted;
    private final UUID localUuid;
    private final Map<String, Object> meta;

    public /* synthetic */ DeliveryStateBaseParams(String str, Map map, Expansion expansion, UUID uuid, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? Expansion.ANCHORED : expansion, (i & 8) != 0 ? null : uuid, (i & 16) != 0 ? false : z);
    }

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final Expansion getExpansion() {
        return this.expansion;
    }

    public final UUID getLocalUuid() {
        return this.localUuid;
    }

    public final Map<String, Object> getMeta() {
        return this.meta;
    }

    /* renamed from: isCompleted, reason: from getter */
    public final boolean getIsCompleted() {
        return this.isCompleted;
    }

    public DeliveryStateBaseParams(String str, Map<String, ? extends Object> map) {
        this(str, map, null, null, false, 28, null);
    }

    public DeliveryStateBaseParams(String str, Map<String, ? extends Object> map, Expansion expansion) {
        this(str, map, expansion, null, false, 24, null);
    }

    public DeliveryStateBaseParams(String str, Map<String, ? extends Object> map, Expansion expansion, UUID uuid) {
        this(str, map, expansion, uuid, false, 16, null);
    }

    public DeliveryStateBaseParams(String str, Map<String, ? extends Object> map, Expansion expansion, UUID uuid, boolean z) {
        this.deliveryId = str;
        this.meta = map;
        this.expansion = expansion;
        this.localUuid = uuid;
        this.isCompleted = z;
    }

    public DeliveryStateBaseParams(String str) {
        this(str, null, null, null, false, 30, null);
    }
}
