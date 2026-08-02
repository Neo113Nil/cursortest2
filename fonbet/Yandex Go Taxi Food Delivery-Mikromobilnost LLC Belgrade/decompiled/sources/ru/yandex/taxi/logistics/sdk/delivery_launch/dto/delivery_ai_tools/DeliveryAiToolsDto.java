package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B1\u0012\u0016\b\u0001\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0010\u001a\u00020\u00002\u0016\b\u0003\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0004HÖ\u0081\u0004R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/DeliveryAiToolsDto;", "", "l10n", "", "", "matches", "", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/DeliveryAiToolsDto$MatchesDto;", "<init>", "(Ljava/util/Map;Ljava/util/List;)V", "getL10n", "()Ljava/util/Map;", "getMatches", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "MatchesDto", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeliveryAiToolsDto {
    private final Map<String, String> l10n;
    private final List<MatchesDto> matches;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/DeliveryAiToolsDto$MatchesDto;", "", "modes", "", "", ConfigConstants.CONFIG, "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/AiWidgetsConfigDto;", "<init>", "(Ljava/util/List;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/AiWidgetsConfigDto;)V", "getModes", "()Ljava/util/List;", "getConfig", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/AiWidgetsConfigDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MatchesDto {
        private final AiWidgetsConfigDto config;
        private final List<String> modes;

        public MatchesDto(@Json(name = "modes") List<String> list, @Json(name = "config") AiWidgetsConfigDto aiWidgetsConfigDto) {
            this.modes = list;
            this.config = aiWidgetsConfigDto;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MatchesDto copy$default(MatchesDto matchesDto, List list, AiWidgetsConfigDto aiWidgetsConfigDto, int i, Object obj) {
            if ((i & 1) != 0) {
                list = matchesDto.modes;
            }
            if ((i & 2) != 0) {
                aiWidgetsConfigDto = matchesDto.config;
            }
            return matchesDto.copy(list, aiWidgetsConfigDto);
        }

        public final List<String> component1() {
            return this.modes;
        }

        /* renamed from: component2, reason: from getter */
        public final AiWidgetsConfigDto getConfig() {
            return this.config;
        }

        public final MatchesDto copy(@Json(name = "modes") List<String> modes, @Json(name = "config") AiWidgetsConfigDto config) {
            return new MatchesDto(modes, config);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MatchesDto)) {
                return false;
            }
            MatchesDto matchesDto = (MatchesDto) other;
            return jl40.l(this.modes, matchesDto.modes) && jl40.l(this.config, matchesDto.config);
        }

        public final AiWidgetsConfigDto getConfig() {
            return this.config;
        }

        public final List<String> getModes() {
            return this.modes;
        }

        public int hashCode() {
            return this.config.hashCode() + (this.modes.hashCode() * 31);
        }

        public String toString() {
            return "MatchesDto(modes=" + this.modes + ", config=" + this.config + Extension.C_BRAKE;
        }
    }

    public DeliveryAiToolsDto(@Json(name = "l10n") Map<String, String> map, @Json(name = "matches") List<MatchesDto> list) {
        this.l10n = map;
        this.matches = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryAiToolsDto copy$default(DeliveryAiToolsDto deliveryAiToolsDto, Map map, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            map = deliveryAiToolsDto.l10n;
        }
        if ((i & 2) != 0) {
            list = deliveryAiToolsDto.matches;
        }
        return deliveryAiToolsDto.copy(map, list);
    }

    public final Map<String, String> component1() {
        return this.l10n;
    }

    public final List<MatchesDto> component2() {
        return this.matches;
    }

    public final DeliveryAiToolsDto copy(@Json(name = "l10n") Map<String, String> l10n, @Json(name = "matches") List<MatchesDto> matches) {
        return new DeliveryAiToolsDto(l10n, matches);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryAiToolsDto)) {
            return false;
        }
        DeliveryAiToolsDto deliveryAiToolsDto = (DeliveryAiToolsDto) other;
        return jl40.l(this.l10n, deliveryAiToolsDto.l10n) && jl40.l(this.matches, deliveryAiToolsDto.matches);
    }

    public final Map<String, String> getL10n() {
        return this.l10n;
    }

    public final List<MatchesDto> getMatches() {
        return this.matches;
    }

    public int hashCode() {
        Map<String, String> map = this.l10n;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        List<MatchesDto> list = this.matches;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "DeliveryAiToolsDto(l10n=" + this.l10n + ", matches=" + this.matches + Extension.C_BRAKE;
    }
}
