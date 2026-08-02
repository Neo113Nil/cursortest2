package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.ColorDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.DeliveryActionPayloadDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/BubbleDto;", "", "leadIconTag", "", "title", "button", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineBubbleButtonDto;", C0553n3.g, "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ColorDto;", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DeliveryActionPayloadDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineBubbleButtonDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ColorDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DeliveryActionPayloadDto;)V", "getLeadIconTag", "()Ljava/lang/String;", "getTitle", "getButton", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineBubbleButtonDto;", "getBackground", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ColorDto;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DeliveryActionPayloadDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class BubbleDto {
    private final DeliveryActionPayloadDto action;
    private final ColorDto background;
    private final TimelineBubbleButtonDto button;
    private final String leadIconTag;
    private final String title;

    public BubbleDto(@Json(name = "lead_icon_tag") String str, @Json(name = "title") String str2, @Json(name = "button") TimelineBubbleButtonDto timelineBubbleButtonDto, @Json(name = "background") ColorDto colorDto, @Json(name = "action") DeliveryActionPayloadDto deliveryActionPayloadDto) {
        this.leadIconTag = str;
        this.title = str2;
        this.button = timelineBubbleButtonDto;
        this.background = colorDto;
        this.action = deliveryActionPayloadDto;
    }

    public static /* synthetic */ BubbleDto copy$default(BubbleDto bubbleDto, String str, String str2, TimelineBubbleButtonDto timelineBubbleButtonDto, ColorDto colorDto, DeliveryActionPayloadDto deliveryActionPayloadDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bubbleDto.leadIconTag;
        }
        if ((i & 2) != 0) {
            str2 = bubbleDto.title;
        }
        if ((i & 4) != 0) {
            timelineBubbleButtonDto = bubbleDto.button;
        }
        if ((i & 8) != 0) {
            colorDto = bubbleDto.background;
        }
        if ((i & 16) != 0) {
            deliveryActionPayloadDto = bubbleDto.action;
        }
        DeliveryActionPayloadDto deliveryActionPayloadDto2 = deliveryActionPayloadDto;
        TimelineBubbleButtonDto timelineBubbleButtonDto2 = timelineBubbleButtonDto;
        return bubbleDto.copy(str, str2, timelineBubbleButtonDto2, colorDto, deliveryActionPayloadDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLeadIconTag() {
        return this.leadIconTag;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final TimelineBubbleButtonDto getButton() {
        return this.button;
    }

    /* renamed from: component4, reason: from getter */
    public final ColorDto getBackground() {
        return this.background;
    }

    /* renamed from: component5, reason: from getter */
    public final DeliveryActionPayloadDto getAction() {
        return this.action;
    }

    public final BubbleDto copy(@Json(name = "lead_icon_tag") String leadIconTag, @Json(name = "title") String title, @Json(name = "button") TimelineBubbleButtonDto button, @Json(name = "background") ColorDto background, @Json(name = "action") DeliveryActionPayloadDto action) {
        return new BubbleDto(leadIconTag, title, button, background, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BubbleDto)) {
            return false;
        }
        BubbleDto bubbleDto = (BubbleDto) other;
        return jl40.l(this.leadIconTag, bubbleDto.leadIconTag) && jl40.l(this.title, bubbleDto.title) && jl40.l(this.button, bubbleDto.button) && jl40.l(this.background, bubbleDto.background) && jl40.l(this.action, bubbleDto.action);
    }

    public final DeliveryActionPayloadDto getAction() {
        return this.action;
    }

    public final ColorDto getBackground() {
        return this.background;
    }

    public final TimelineBubbleButtonDto getButton() {
        return this.button;
    }

    public final String getLeadIconTag() {
        return this.leadIconTag;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.leadIconTag;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
        TimelineBubbleButtonDto timelineBubbleButtonDto = this.button;
        int hashCode = (b + (timelineBubbleButtonDto == null ? 0 : timelineBubbleButtonDto.hashCode())) * 31;
        ColorDto colorDto = this.background;
        int hashCode2 = (hashCode + (colorDto == null ? 0 : colorDto.hashCode())) * 31;
        DeliveryActionPayloadDto deliveryActionPayloadDto = this.action;
        return hashCode2 + (deliveryActionPayloadDto != null ? deliveryActionPayloadDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.leadIconTag;
        String str2 = this.title;
        TimelineBubbleButtonDto timelineBubbleButtonDto = this.button;
        ColorDto colorDto = this.background;
        DeliveryActionPayloadDto deliveryActionPayloadDto = this.action;
        StringBuilder v = b64.v("BubbleDto(leadIconTag=", str, ", title=", str2, ", button=");
        v.append(timelineBubbleButtonDto);
        v.append(", background=");
        v.append(colorDto);
        v.append(", action=");
        v.append(deliveryActionPayloadDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
