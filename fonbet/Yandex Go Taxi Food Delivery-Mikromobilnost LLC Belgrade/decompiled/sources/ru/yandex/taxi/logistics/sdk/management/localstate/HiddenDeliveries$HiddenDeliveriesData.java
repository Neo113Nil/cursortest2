package ru.yandex.taxi.logistics.sdk.management.localstate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/logistics/sdk/management/localstate/HiddenDeliveries$HiddenDeliveriesData", "", "", "Lru/yandex/taxi/logistics/sdk/management/localstate/HiddenDeliveries$HiddenDelivery;", "markedDeliveries", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getMarkedDeliveries", "()Ljava/util/List;", "setMarkedDeliveries", "sdk-management-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HiddenDeliveries$HiddenDeliveriesData {
    public static final int $stable = 8;
    private List<HiddenDeliveries$HiddenDelivery> markedDeliveries;

    public /* synthetic */ HiddenDeliveries$HiddenDeliveriesData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EmptyList.a : list);
    }

    public final List<HiddenDeliveries$HiddenDelivery> getMarkedDeliveries() {
        return this.markedDeliveries;
    }

    public final void setMarkedDeliveries(List<HiddenDeliveries$HiddenDelivery> list) {
        this.markedDeliveries = list;
    }

    public HiddenDeliveries$HiddenDeliveriesData(@Json(name = "markedDeliveries") List<HiddenDeliveries$HiddenDelivery> list) {
        this.markedDeliveries = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HiddenDeliveries$HiddenDeliveriesData() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
