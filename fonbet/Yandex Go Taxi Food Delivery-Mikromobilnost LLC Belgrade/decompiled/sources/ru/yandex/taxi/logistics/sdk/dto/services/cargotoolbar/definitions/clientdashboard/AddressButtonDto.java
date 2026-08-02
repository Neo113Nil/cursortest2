package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t\u0012\u0010\b\u0001\u0010\n\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\u0011\u0010\u001e\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\u0010\b\u0003\u0010\n\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006&"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/AddressButtonDto;", "", "text", "", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "trailButton", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TrailAddressButtonDto;", "showWhenSectionCollapsed", "", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/MetadataDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TrailAddressButtonDto;ZLjava/lang/Object;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "getTrailButton", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TrailAddressButtonDto;", "getShowWhenSectionCollapsed", "()Z", "getMeta", "()Ljava/lang/Object;", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AddressButtonDto {
    private final ActionDto action;
    private final Object meta;
    private final String metricaLabel;
    private final boolean showWhenSectionCollapsed;
    private final String text;
    private final TrailAddressButtonDto trailButton;

    public AddressButtonDto(@Json(name = "text") String str, @Json(name = "action") ActionDto actionDto, @Json(name = "trail_button") TrailAddressButtonDto trailAddressButtonDto, @Json(name = "show_when_section_collapsed") boolean z, @Json(name = "meta") Object obj, @Json(name = "metrica_label") String str2) {
        this.text = str;
        this.action = actionDto;
        this.trailButton = trailAddressButtonDto;
        this.showWhenSectionCollapsed = z;
        this.meta = obj;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ AddressButtonDto copy$default(AddressButtonDto addressButtonDto, String str, ActionDto actionDto, TrailAddressButtonDto trailAddressButtonDto, boolean z, Object obj, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = addressButtonDto.text;
        }
        if ((i & 2) != 0) {
            actionDto = addressButtonDto.action;
        }
        if ((i & 4) != 0) {
            trailAddressButtonDto = addressButtonDto.trailButton;
        }
        if ((i & 8) != 0) {
            z = addressButtonDto.showWhenSectionCollapsed;
        }
        if ((i & 16) != 0) {
            obj = addressButtonDto.meta;
        }
        if ((i & 32) != 0) {
            str2 = addressButtonDto.metricaLabel;
        }
        Object obj3 = obj;
        String str3 = str2;
        return addressButtonDto.copy(str, actionDto, trailAddressButtonDto, z, obj3, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final ActionDto getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final TrailAddressButtonDto getTrailButton() {
        return this.trailButton;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowWhenSectionCollapsed() {
        return this.showWhenSectionCollapsed;
    }

    /* renamed from: component5, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final AddressButtonDto copy(@Json(name = "text") String text, @Json(name = "action") ActionDto action, @Json(name = "trail_button") TrailAddressButtonDto trailButton, @Json(name = "show_when_section_collapsed") boolean showWhenSectionCollapsed, @Json(name = "meta") Object meta, @Json(name = "metrica_label") String metricaLabel) {
        return new AddressButtonDto(text, action, trailButton, showWhenSectionCollapsed, meta, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressButtonDto)) {
            return false;
        }
        AddressButtonDto addressButtonDto = (AddressButtonDto) other;
        return jl40.l(this.text, addressButtonDto.text) && jl40.l(this.action, addressButtonDto.action) && jl40.l(this.trailButton, addressButtonDto.trailButton) && this.showWhenSectionCollapsed == addressButtonDto.showWhenSectionCollapsed && jl40.l(this.meta, addressButtonDto.meta) && jl40.l(this.metricaLabel, addressButtonDto.metricaLabel);
    }

    public final ActionDto getAction() {
        return this.action;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final boolean getShowWhenSectionCollapsed() {
        return this.showWhenSectionCollapsed;
    }

    public final String getText() {
        return this.text;
    }

    public final TrailAddressButtonDto getTrailButton() {
        return this.trailButton;
    }

    public int hashCode() {
        int hashCode = (this.action.hashCode() + (this.text.hashCode() * 31)) * 31;
        TrailAddressButtonDto trailAddressButtonDto = this.trailButton;
        int e = unr0.e((hashCode + (trailAddressButtonDto == null ? 0 : trailAddressButtonDto.hashCode())) * 31, 31, this.showWhenSectionCollapsed);
        Object obj = this.meta;
        int hashCode2 = (e + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.metricaLabel;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "AddressButtonDto(text=" + this.text + ", action=" + this.action + ", trailButton=" + this.trailButton + ", showWhenSectionCollapsed=" + this.showWhenSectionCollapsed + ", meta=" + this.meta + ", metricaLabel=" + this.metricaLabel + Extension.C_BRAKE;
    }

    public /* synthetic */ AddressButtonDto(String str, ActionDto actionDto, TrailAddressButtonDto trailAddressButtonDto, boolean z, Object obj, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, actionDto, trailAddressButtonDto, (i & 8) != 0 ? false : z, obj, str2);
    }
}
