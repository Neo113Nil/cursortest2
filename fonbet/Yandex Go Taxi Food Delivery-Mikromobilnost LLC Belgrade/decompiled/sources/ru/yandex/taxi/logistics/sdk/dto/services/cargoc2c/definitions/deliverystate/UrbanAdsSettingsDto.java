package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.div.state.db.StateEntry;
import defpackage.jl40;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/UrbanAdsSettingsDto;", "", Constants.KEY_PAGE, "", "overrides", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/UrbanAdsSettingsDto$OverridesDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/UrbanAdsSettingsDto$OverridesDto;)V", "getPage", "()Ljava/lang/String;", "getOverrides", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/UrbanAdsSettingsDto$OverridesDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "OverridesDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UrbanAdsSettingsDto {
    private final OverridesDto overrides;
    private final String page;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/UrbanAdsSettingsDto$OverridesDto;", "", StateEntry.COLUMN_PATH, "", "experiments", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "getExperiments", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OverridesDto {
        private final String experiments;
        private final String path;

        public OverridesDto(@Json(name = "path") String str, @Json(name = "experiments") String str2) {
            this.path = str;
            this.experiments = str2;
        }

        public static /* synthetic */ OverridesDto copy$default(OverridesDto overridesDto, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = overridesDto.path;
            }
            if ((i & 2) != 0) {
                str2 = overridesDto.experiments;
            }
            return overridesDto.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* renamed from: component2, reason: from getter */
        public final String getExperiments() {
            return this.experiments;
        }

        public final OverridesDto copy(@Json(name = "path") String path, @Json(name = "experiments") String experiments) {
            return new OverridesDto(path, experiments);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OverridesDto)) {
                return false;
            }
            OverridesDto overridesDto = (OverridesDto) other;
            return jl40.l(this.path, overridesDto.path) && jl40.l(this.experiments, overridesDto.experiments);
        }

        public final String getExperiments() {
            return this.experiments;
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            int hashCode = this.path.hashCode() * 31;
            String str = this.experiments;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return unr0.p("OverridesDto(path=", this.path, ", experiments=", this.experiments, Extension.C_BRAKE);
        }
    }

    public UrbanAdsSettingsDto(@Json(name = "page") String str, @Json(name = "overrides") OverridesDto overridesDto) {
        this.page = str;
        this.overrides = overridesDto;
    }

    public static /* synthetic */ UrbanAdsSettingsDto copy$default(UrbanAdsSettingsDto urbanAdsSettingsDto, String str, OverridesDto overridesDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = urbanAdsSettingsDto.page;
        }
        if ((i & 2) != 0) {
            overridesDto = urbanAdsSettingsDto.overrides;
        }
        return urbanAdsSettingsDto.copy(str, overridesDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPage() {
        return this.page;
    }

    /* renamed from: component2, reason: from getter */
    public final OverridesDto getOverrides() {
        return this.overrides;
    }

    public final UrbanAdsSettingsDto copy(@Json(name = "page") String page, @Json(name = "overrides") OverridesDto overrides) {
        return new UrbanAdsSettingsDto(page, overrides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UrbanAdsSettingsDto)) {
            return false;
        }
        UrbanAdsSettingsDto urbanAdsSettingsDto = (UrbanAdsSettingsDto) other;
        return jl40.l(this.page, urbanAdsSettingsDto.page) && jl40.l(this.overrides, urbanAdsSettingsDto.overrides);
    }

    public final OverridesDto getOverrides() {
        return this.overrides;
    }

    public final String getPage() {
        return this.page;
    }

    public int hashCode() {
        int hashCode = this.page.hashCode() * 31;
        OverridesDto overridesDto = this.overrides;
        return hashCode + (overridesDto == null ? 0 : overridesDto.hashCode());
    }

    public String toString() {
        return "UrbanAdsSettingsDto(page=" + this.page + ", overrides=" + this.overrides + Extension.C_BRAKE;
    }
}
