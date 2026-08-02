package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.b64;
import defpackage.jl40;
import defpackage.tse0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0001\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\bHÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/DeliveryTriggerCommunicationsDto;", "", BackendConfig.Restrictions.ENABLED, "", "abandonedCart", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/DeliveryTriggerCommunicationsDto$AbandonedCartDto;", "l10n", "", "", "<init>", "(Ljava/lang/Boolean;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/DeliveryTriggerCommunicationsDto$AbandonedCartDto;Ljava/util/Map;)V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAbandonedCart", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/DeliveryTriggerCommunicationsDto$AbandonedCartDto;", "getL10n", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/DeliveryTriggerCommunicationsDto$AbandonedCartDto;Ljava/util/Map;)Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/DeliveryTriggerCommunicationsDto;", "equals", "other", "hashCode", "", "toString", "AbandonedCartDto", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeliveryTriggerCommunicationsDto {
    private final AbandonedCartDto abandonedCart;
    private final Boolean enabled;
    private final Map<String, String> l10n;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/DeliveryTriggerCommunicationsDto$AbandonedCartDto;", "", "localNotifications", "", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto;", "<init>", "(Ljava/util/List;)V", "getLocalNotifications", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AbandonedCartDto {
        private final List<LocalNotificationDto> localNotifications;

        public AbandonedCartDto(@Json(name = "local_notifications") List<LocalNotificationDto> list) {
            this.localNotifications = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbandonedCartDto copy$default(AbandonedCartDto abandonedCartDto, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = abandonedCartDto.localNotifications;
            }
            return abandonedCartDto.copy(list);
        }

        public final List<LocalNotificationDto> component1() {
            return this.localNotifications;
        }

        public final AbandonedCartDto copy(@Json(name = "local_notifications") List<LocalNotificationDto> localNotifications) {
            return new AbandonedCartDto(localNotifications);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AbandonedCartDto) && jl40.l(this.localNotifications, ((AbandonedCartDto) other).localNotifications);
        }

        public final List<LocalNotificationDto> getLocalNotifications() {
            return this.localNotifications;
        }

        public int hashCode() {
            List<LocalNotificationDto> list = this.localNotifications;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return tse0.k("AbandonedCartDto(localNotifications=", Extension.C_BRAKE, this.localNotifications);
        }
    }

    public DeliveryTriggerCommunicationsDto(@Json(name = "enabled") Boolean bool, @Json(name = "abandoned_cart") AbandonedCartDto abandonedCartDto, @Json(name = "l10n") Map<String, String> map) {
        this.enabled = bool;
        this.abandonedCart = abandonedCartDto;
        this.l10n = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryTriggerCommunicationsDto copy$default(DeliveryTriggerCommunicationsDto deliveryTriggerCommunicationsDto, Boolean bool, AbandonedCartDto abandonedCartDto, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = deliveryTriggerCommunicationsDto.enabled;
        }
        if ((i & 2) != 0) {
            abandonedCartDto = deliveryTriggerCommunicationsDto.abandonedCart;
        }
        if ((i & 4) != 0) {
            map = deliveryTriggerCommunicationsDto.l10n;
        }
        return deliveryTriggerCommunicationsDto.copy(bool, abandonedCartDto, map);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final AbandonedCartDto getAbandonedCart() {
        return this.abandonedCart;
    }

    public final Map<String, String> component3() {
        return this.l10n;
    }

    public final DeliveryTriggerCommunicationsDto copy(@Json(name = "enabled") Boolean enabled, @Json(name = "abandoned_cart") AbandonedCartDto abandonedCart, @Json(name = "l10n") Map<String, String> l10n) {
        return new DeliveryTriggerCommunicationsDto(enabled, abandonedCart, l10n);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryTriggerCommunicationsDto)) {
            return false;
        }
        DeliveryTriggerCommunicationsDto deliveryTriggerCommunicationsDto = (DeliveryTriggerCommunicationsDto) other;
        return jl40.l(this.enabled, deliveryTriggerCommunicationsDto.enabled) && jl40.l(this.abandonedCart, deliveryTriggerCommunicationsDto.abandonedCart) && jl40.l(this.l10n, deliveryTriggerCommunicationsDto.l10n);
    }

    public final AbandonedCartDto getAbandonedCart() {
        return this.abandonedCart;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Map<String, String> getL10n() {
        return this.l10n;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        AbandonedCartDto abandonedCartDto = this.abandonedCart;
        int hashCode2 = (hashCode + (abandonedCartDto == null ? 0 : abandonedCartDto.hashCode())) * 31;
        Map<String, String> map = this.l10n;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.enabled;
        AbandonedCartDto abandonedCartDto = this.abandonedCart;
        Map<String, String> map = this.l10n;
        StringBuilder sb = new StringBuilder("DeliveryTriggerCommunicationsDto(enabled=");
        sb.append(bool);
        sb.append(", abandonedCart=");
        sb.append(abandonedCartDto);
        sb.append(", l10n=");
        return b64.r(sb, map, Extension.C_BRAKE);
    }
}
