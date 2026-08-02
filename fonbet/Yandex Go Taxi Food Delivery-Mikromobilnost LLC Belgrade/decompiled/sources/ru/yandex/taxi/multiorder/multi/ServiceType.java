package ru.yandex.taxi.multiorder.multi;

import defpackage.hxq0;
import defpackage.k4o;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/multiorder/multi/ServiceType;", "Lhxq0;", "", "", "alias", "Ljava/lang/String;", CoreConstants.PushMessage.SERVICE_TYPE, "()Ljava/lang/String;", "TAXI", "DRIVE", "LINKED", "LOGISTICS", "SCOOTERS", "CHARGERS", "NAVIGATION", "MULTIMODAL", "multiorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ServiceType implements hxq0 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ServiceType[] $VALUES;
    public static final ServiceType CHARGERS;
    public static final ServiceType DRIVE;
    public static final ServiceType LINKED;
    public static final ServiceType LOGISTICS;
    public static final ServiceType MULTIMODAL;
    public static final ServiceType NAVIGATION;
    public static final ServiceType SCOOTERS;
    public static final ServiceType TAXI;
    private final String alias;

    static {
        ServiceType serviceType = new ServiceType("TAXI", 0, TariffOrderFlow.ORDER_FLOW_TAXI_KEY);
        TAXI = serviceType;
        ServiceType serviceType2 = new ServiceType("DRIVE", 1, TariffOrderFlow.ORDER_FLOW_DRIVE_KEY);
        DRIVE = serviceType2;
        ServiceType serviceType3 = new ServiceType("LINKED", 2, "linked");
        LINKED = serviceType3;
        ServiceType serviceType4 = new ServiceType("LOGISTICS", 3, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY);
        LOGISTICS = serviceType4;
        ServiceType serviceType5 = new ServiceType("SCOOTERS", 4, "scooters");
        SCOOTERS = serviceType5;
        ServiceType serviceType6 = new ServiceType("CHARGERS", 5, "chargers");
        CHARGERS = serviceType6;
        ServiceType serviceType7 = new ServiceType("NAVIGATION", 6, "navigator");
        NAVIGATION = serviceType7;
        ServiceType serviceType8 = new ServiceType("MULTIMODAL", 7, "mobility-multimodal");
        MULTIMODAL = serviceType8;
        ServiceType[] serviceTypeArr = {serviceType, serviceType2, serviceType3, serviceType4, serviceType5, serviceType6, serviceType7, serviceType8};
        $VALUES = serviceTypeArr;
        $ENTRIES = a.a(serviceTypeArr);
    }

    public ServiceType(String str, int i, String str2) {
        this.alias = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static ServiceType valueOf(String str) {
        return (ServiceType) Enum.valueOf(ServiceType.class, str);
    }

    public static ServiceType[] values() {
        return (ServiceType[]) $VALUES.clone();
    }

    @Override // defpackage.hxq0
    /* renamed from: i, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }
}
