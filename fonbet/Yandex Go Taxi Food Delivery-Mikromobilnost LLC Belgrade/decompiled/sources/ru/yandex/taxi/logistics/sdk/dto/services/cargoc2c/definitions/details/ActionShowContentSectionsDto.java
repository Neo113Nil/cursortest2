package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ*\u0010\u0010\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ActionShowContentSectionsDto;", "", "contentSections", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentSectionDto;", "maximizeScreenBrightness", "", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "getContentSections", "()Ljava/util/List;", "getMaximizeScreenBrightness", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ActionShowContentSectionsDto;", "equals", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ActionShowContentSectionsDto {
    private final List<ContentSectionDto> contentSections;
    private final Boolean maximizeScreenBrightness;

    public ActionShowContentSectionsDto(@Json(name = "content_sections") List<ContentSectionDto> list, @Json(name = "maximize_screen_brightness") Boolean bool) {
        this.contentSections = list;
        this.maximizeScreenBrightness = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionShowContentSectionsDto copy$default(ActionShowContentSectionsDto actionShowContentSectionsDto, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = actionShowContentSectionsDto.contentSections;
        }
        if ((i & 2) != 0) {
            bool = actionShowContentSectionsDto.maximizeScreenBrightness;
        }
        return actionShowContentSectionsDto.copy(list, bool);
    }

    public final List<ContentSectionDto> component1() {
        return this.contentSections;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getMaximizeScreenBrightness() {
        return this.maximizeScreenBrightness;
    }

    public final ActionShowContentSectionsDto copy(@Json(name = "content_sections") List<ContentSectionDto> contentSections, @Json(name = "maximize_screen_brightness") Boolean maximizeScreenBrightness) {
        return new ActionShowContentSectionsDto(contentSections, maximizeScreenBrightness);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionShowContentSectionsDto)) {
            return false;
        }
        ActionShowContentSectionsDto actionShowContentSectionsDto = (ActionShowContentSectionsDto) other;
        return jl40.l(this.contentSections, actionShowContentSectionsDto.contentSections) && jl40.l(this.maximizeScreenBrightness, actionShowContentSectionsDto.maximizeScreenBrightness);
    }

    public final List<ContentSectionDto> getContentSections() {
        return this.contentSections;
    }

    public final Boolean getMaximizeScreenBrightness() {
        return this.maximizeScreenBrightness;
    }

    public int hashCode() {
        int hashCode = this.contentSections.hashCode() * 31;
        Boolean bool = this.maximizeScreenBrightness;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "ActionShowContentSectionsDto(contentSections=" + this.contentSections + ", maximizeScreenBrightness=" + this.maximizeScreenBrightness + Extension.C_BRAKE;
    }
}
