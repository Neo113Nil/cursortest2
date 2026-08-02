package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/LimitedCountShowPolicyDto;", "", "cacheKey", "", "maxShowCount", "", "policyLifetime", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/LimitedCountShowPolicyDto$PolicyLifetimeDto;", "<init>", "(Ljava/lang/String;ILru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/LimitedCountShowPolicyDto$PolicyLifetimeDto;)V", "getCacheKey", "()Ljava/lang/String;", "getMaxShowCount", "()I", "getPolicyLifetime", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/LimitedCountShowPolicyDto$PolicyLifetimeDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "PolicyLifetimeDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LimitedCountShowPolicyDto {
    private final String cacheKey;
    private final int maxShowCount;
    private final PolicyLifetimeDto policyLifetime;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/LimitedCountShowPolicyDto$PolicyLifetimeDto;", "", "<init>", "(Ljava/lang/String;I)V", "PERSISTENT", "SESSION", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PolicyLifetimeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PolicyLifetimeDto[] $VALUES;

        @Json(name = "persistent")
        public static final PolicyLifetimeDto PERSISTENT = new PolicyLifetimeDto("PERSISTENT", 0);

        @Json(name = "session")
        public static final PolicyLifetimeDto SESSION = new PolicyLifetimeDto("SESSION", 1);

        private static final /* synthetic */ PolicyLifetimeDto[] $values() {
            return new PolicyLifetimeDto[]{PERSISTENT, SESSION};
        }

        static {
            PolicyLifetimeDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private PolicyLifetimeDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static PolicyLifetimeDto valueOf(String str) {
            return (PolicyLifetimeDto) Enum.valueOf(PolicyLifetimeDto.class, str);
        }

        public static PolicyLifetimeDto[] values() {
            return (PolicyLifetimeDto[]) $VALUES.clone();
        }
    }

    public LimitedCountShowPolicyDto(@Json(name = "cache_key") String str, @Json(name = "max_show_count") int i, @Json(name = "policy_lifetime") PolicyLifetimeDto policyLifetimeDto) {
        this.cacheKey = str;
        this.maxShowCount = i;
        this.policyLifetime = policyLifetimeDto;
    }

    public static /* synthetic */ LimitedCountShowPolicyDto copy$default(LimitedCountShowPolicyDto limitedCountShowPolicyDto, String str, int i, PolicyLifetimeDto policyLifetimeDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = limitedCountShowPolicyDto.cacheKey;
        }
        if ((i2 & 2) != 0) {
            i = limitedCountShowPolicyDto.maxShowCount;
        }
        if ((i2 & 4) != 0) {
            policyLifetimeDto = limitedCountShowPolicyDto.policyLifetime;
        }
        return limitedCountShowPolicyDto.copy(str, i, policyLifetimeDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCacheKey() {
        return this.cacheKey;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxShowCount() {
        return this.maxShowCount;
    }

    /* renamed from: component3, reason: from getter */
    public final PolicyLifetimeDto getPolicyLifetime() {
        return this.policyLifetime;
    }

    public final LimitedCountShowPolicyDto copy(@Json(name = "cache_key") String cacheKey, @Json(name = "max_show_count") int maxShowCount, @Json(name = "policy_lifetime") PolicyLifetimeDto policyLifetime) {
        return new LimitedCountShowPolicyDto(cacheKey, maxShowCount, policyLifetime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitedCountShowPolicyDto)) {
            return false;
        }
        LimitedCountShowPolicyDto limitedCountShowPolicyDto = (LimitedCountShowPolicyDto) other;
        return jl40.l(this.cacheKey, limitedCountShowPolicyDto.cacheKey) && this.maxShowCount == limitedCountShowPolicyDto.maxShowCount && this.policyLifetime == limitedCountShowPolicyDto.policyLifetime;
    }

    public final String getCacheKey() {
        return this.cacheKey;
    }

    public final int getMaxShowCount() {
        return this.maxShowCount;
    }

    public final PolicyLifetimeDto getPolicyLifetime() {
        return this.policyLifetime;
    }

    public int hashCode() {
        return this.policyLifetime.hashCode() + oyr.b(this.maxShowCount, this.cacheKey.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.cacheKey;
        int i = this.maxShowCount;
        PolicyLifetimeDto policyLifetimeDto = this.policyLifetime;
        StringBuilder u = b64.u(i, "LimitedCountShowPolicyDto(cacheKey=", str, ", maxShowCount=", ", policyLifetime=");
        u.append(policyLifetimeDto);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public /* synthetic */ LimitedCountShowPolicyDto(String str, int i, PolicyLifetimeDto policyLifetimeDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? PolicyLifetimeDto.PERSISTENT : policyLifetimeDto);
    }
}
