package ru.yandex.taxi.eats_orders.domain.entities.order.status;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/eats_orders/domain/entities/order/status/EatsOrderStatus;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "", "isActive", "Z", "b", "()Z", "PENDING", "CREATED", "COOKING", "DELIVERING", "DELIVERED", "CANCEL", "eats_orders"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EatsOrderStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EatsOrderStatus[] $VALUES;
    public static final EatsOrderStatus CANCEL;
    public static final EatsOrderStatus COOKING;
    public static final EatsOrderStatus CREATED;
    public static final EatsOrderStatus DELIVERED;
    public static final EatsOrderStatus DELIVERING;
    public static final EatsOrderStatus PENDING;
    private final String id;
    private final boolean isActive;

    static {
        EatsOrderStatus eatsOrderStatus = new EatsOrderStatus("PENDING", 0, "pending", true);
        PENDING = eatsOrderStatus;
        EatsOrderStatus eatsOrderStatus2 = new EatsOrderStatus("CREATED", 1, "created", true);
        CREATED = eatsOrderStatus2;
        EatsOrderStatus eatsOrderStatus3 = new EatsOrderStatus("COOKING", 2, "cooking", true);
        COOKING = eatsOrderStatus3;
        EatsOrderStatus eatsOrderStatus4 = new EatsOrderStatus("DELIVERING", 3, "delivering", true);
        DELIVERING = eatsOrderStatus4;
        EatsOrderStatus eatsOrderStatus5 = new EatsOrderStatus("DELIVERED", 4, "delivered", false);
        DELIVERED = eatsOrderStatus5;
        EatsOrderStatus eatsOrderStatus6 = new EatsOrderStatus("CANCEL", 5, "cancel", false);
        CANCEL = eatsOrderStatus6;
        EatsOrderStatus[] eatsOrderStatusArr = {eatsOrderStatus, eatsOrderStatus2, eatsOrderStatus3, eatsOrderStatus4, eatsOrderStatus5, eatsOrderStatus6};
        $VALUES = eatsOrderStatusArr;
        $ENTRIES = a.a(eatsOrderStatusArr);
    }

    public EatsOrderStatus(String str, int i, String str2, boolean z) {
        this.id = str2;
        this.isActive = z;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static EatsOrderStatus valueOf(String str) {
        return (EatsOrderStatus) Enum.valueOf(EatsOrderStatus.class, str);
    }

    public static EatsOrderStatus[] values() {
        return (EatsOrderStatus[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public final String getId() {
        return this.id;
    }
}
