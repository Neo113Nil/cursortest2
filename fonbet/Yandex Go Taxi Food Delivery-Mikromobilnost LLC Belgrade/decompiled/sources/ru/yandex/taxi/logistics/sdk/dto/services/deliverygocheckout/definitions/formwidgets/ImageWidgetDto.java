package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ContentAlignmentDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.PaddingsDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003Ja\u0010(\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0003\u0010\r\u001a\u00020\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0006HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001a¨\u0006."}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ImageWidgetDto;", "", "widgetId", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "height", "", "text", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "textAlign", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ContentAlignmentDto;", "paddings", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "image", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "imageAlign", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ContentAlignmentDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ContentAlignmentDto;)V", "getWidgetId", "()Ljava/lang/String;", "getBackgroundColor", "getHeight", "()I", "getText", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getTextAlign", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ContentAlignmentDto;", "getPaddings", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "getImage", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "getImageAlign", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ImageWidgetDto {
    private final String backgroundColor;
    private final int height;
    private final ImageDto image;
    private final ContentAlignmentDto imageAlign;
    private final PaddingsDto paddings;
    private final AttributedTextDto text;
    private final ContentAlignmentDto textAlign;
    private final String widgetId;

    public ImageWidgetDto(@Json(name = "widget_id") String str, @Json(name = "background_color") String str2, @Json(name = "height") int i, @Json(name = "text") AttributedTextDto attributedTextDto, @Json(name = "text_align") ContentAlignmentDto contentAlignmentDto, @Json(name = "paddings") PaddingsDto paddingsDto, @Json(name = "image") ImageDto imageDto, @Json(name = "image_align") ContentAlignmentDto contentAlignmentDto2) {
        this.widgetId = str;
        this.backgroundColor = str2;
        this.height = i;
        this.text = attributedTextDto;
        this.textAlign = contentAlignmentDto;
        this.paddings = paddingsDto;
        this.image = imageDto;
        this.imageAlign = contentAlignmentDto2;
    }

    public static /* synthetic */ ImageWidgetDto copy$default(ImageWidgetDto imageWidgetDto, String str, String str2, int i, AttributedTextDto attributedTextDto, ContentAlignmentDto contentAlignmentDto, PaddingsDto paddingsDto, ImageDto imageDto, ContentAlignmentDto contentAlignmentDto2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = imageWidgetDto.widgetId;
        }
        if ((i2 & 2) != 0) {
            str2 = imageWidgetDto.backgroundColor;
        }
        if ((i2 & 4) != 0) {
            i = imageWidgetDto.height;
        }
        if ((i2 & 8) != 0) {
            attributedTextDto = imageWidgetDto.text;
        }
        if ((i2 & 16) != 0) {
            contentAlignmentDto = imageWidgetDto.textAlign;
        }
        if ((i2 & 32) != 0) {
            paddingsDto = imageWidgetDto.paddings;
        }
        if ((i2 & 64) != 0) {
            imageDto = imageWidgetDto.image;
        }
        if ((i2 & 128) != 0) {
            contentAlignmentDto2 = imageWidgetDto.imageAlign;
        }
        ImageDto imageDto2 = imageDto;
        ContentAlignmentDto contentAlignmentDto3 = contentAlignmentDto2;
        ContentAlignmentDto contentAlignmentDto4 = contentAlignmentDto;
        PaddingsDto paddingsDto2 = paddingsDto;
        return imageWidgetDto.copy(str, str2, i, attributedTextDto, contentAlignmentDto4, paddingsDto2, imageDto2, contentAlignmentDto3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component4, reason: from getter */
    public final AttributedTextDto getText() {
        return this.text;
    }

    /* renamed from: component5, reason: from getter */
    public final ContentAlignmentDto getTextAlign() {
        return this.textAlign;
    }

    /* renamed from: component6, reason: from getter */
    public final PaddingsDto getPaddings() {
        return this.paddings;
    }

    /* renamed from: component7, reason: from getter */
    public final ImageDto getImage() {
        return this.image;
    }

    /* renamed from: component8, reason: from getter */
    public final ContentAlignmentDto getImageAlign() {
        return this.imageAlign;
    }

    public final ImageWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "background_color") String backgroundColor, @Json(name = "height") int height, @Json(name = "text") AttributedTextDto text, @Json(name = "text_align") ContentAlignmentDto textAlign, @Json(name = "paddings") PaddingsDto paddings, @Json(name = "image") ImageDto image, @Json(name = "image_align") ContentAlignmentDto imageAlign) {
        return new ImageWidgetDto(widgetId, backgroundColor, height, text, textAlign, paddings, image, imageAlign);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageWidgetDto)) {
            return false;
        }
        ImageWidgetDto imageWidgetDto = (ImageWidgetDto) other;
        return jl40.l(this.widgetId, imageWidgetDto.widgetId) && jl40.l(this.backgroundColor, imageWidgetDto.backgroundColor) && this.height == imageWidgetDto.height && jl40.l(this.text, imageWidgetDto.text) && this.textAlign == imageWidgetDto.textAlign && jl40.l(this.paddings, imageWidgetDto.paddings) && jl40.l(this.image, imageWidgetDto.image) && this.imageAlign == imageWidgetDto.imageAlign;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getHeight() {
        return this.height;
    }

    public final ImageDto getImage() {
        return this.image;
    }

    public final ContentAlignmentDto getImageAlign() {
        return this.imageAlign;
    }

    public final PaddingsDto getPaddings() {
        return this.paddings;
    }

    public final AttributedTextDto getText() {
        return this.text;
    }

    public final ContentAlignmentDto getTextAlign() {
        return this.textAlign;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = this.widgetId.hashCode() * 31;
        String str = this.backgroundColor;
        int e = ly3.e(this.text, oyr.b(this.height, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        ContentAlignmentDto contentAlignmentDto = this.textAlign;
        int hashCode2 = (e + (contentAlignmentDto == null ? 0 : contentAlignmentDto.hashCode())) * 31;
        PaddingsDto paddingsDto = this.paddings;
        int hashCode3 = (this.image.hashCode() + ((hashCode2 + (paddingsDto == null ? 0 : paddingsDto.hashCode())) * 31)) * 31;
        ContentAlignmentDto contentAlignmentDto2 = this.imageAlign;
        return hashCode3 + (contentAlignmentDto2 != null ? contentAlignmentDto2.hashCode() : 0);
    }

    public String toString() {
        String str = this.widgetId;
        String str2 = this.backgroundColor;
        int i = this.height;
        AttributedTextDto attributedTextDto = this.text;
        ContentAlignmentDto contentAlignmentDto = this.textAlign;
        PaddingsDto paddingsDto = this.paddings;
        ImageDto imageDto = this.image;
        ContentAlignmentDto contentAlignmentDto2 = this.imageAlign;
        StringBuilder v = b64.v("ImageWidgetDto(widgetId=", str, ", backgroundColor=", str2, ", height=");
        v.append(i);
        v.append(", text=");
        v.append(attributedTextDto);
        v.append(", textAlign=");
        v.append(contentAlignmentDto);
        v.append(", paddings=");
        v.append(paddingsDto);
        v.append(", image=");
        v.append(imageDto);
        v.append(", imageAlign=");
        v.append(contentAlignmentDto2);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
