package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*B[\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0003\u0010\t\u001a\u00020\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\rHÆ\u0003J]\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\t\u001a\u00020\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BubbleToggleDto;", "", "id", "", "text", "textStyle", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "icon", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "size", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BubbleToggleDto$SizeDto;", "metricaLabel", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MetadataDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BubbleToggleDto$SizeDto;Ljava/lang/String;Ljava/lang/Object;)V", "getId", "()Ljava/lang/String;", "getText", "getTextStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "getIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "getSize", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BubbleToggleDto$SizeDto;", "getMetricaLabel", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "SizeDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BubbleToggleDto {
    private final ImageDto icon;
    private final String id;
    private final Object meta;
    private final String metricaLabel;
    private final SizeDto size;
    private final String text;
    private final TextParametersDto textStyle;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BubbleToggleDto$SizeDto;", "", "<init>", "(Ljava/lang/String;I)V", "XS", "S", "M", "L", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SizeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SizeDto[] $VALUES;

        @Json(name = "xs")
        public static final SizeDto XS = new SizeDto("XS", 0);

        @Json(name = "s")
        public static final SizeDto S = new SizeDto("S", 1);

        @Json(name = "m")
        public static final SizeDto M = new SizeDto("M", 2);

        @Json(name = "l")
        public static final SizeDto L = new SizeDto("L", 3);

        private static final /* synthetic */ SizeDto[] $values() {
            return new SizeDto[]{XS, S, M, L};
        }

        static {
            SizeDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private SizeDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static SizeDto valueOf(String str) {
            return (SizeDto) Enum.valueOf(SizeDto.class, str);
        }

        public static SizeDto[] values() {
            return (SizeDto[]) $VALUES.clone();
        }
    }

    public BubbleToggleDto(@Json(name = "id") String str, @Json(name = "text") String str2, @Json(name = "text_style") TextParametersDto textParametersDto, @Json(name = "icon") ImageDto imageDto, @Json(name = "size") SizeDto sizeDto, @Json(name = "metrica_label") String str3, @Json(name = "meta") Object obj) {
        this.id = str;
        this.text = str2;
        this.textStyle = textParametersDto;
        this.icon = imageDto;
        this.size = sizeDto;
        this.metricaLabel = str3;
        this.meta = obj;
    }

    public static /* synthetic */ BubbleToggleDto copy$default(BubbleToggleDto bubbleToggleDto, String str, String str2, TextParametersDto textParametersDto, ImageDto imageDto, SizeDto sizeDto, String str3, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = bubbleToggleDto.id;
        }
        if ((i & 2) != 0) {
            str2 = bubbleToggleDto.text;
        }
        if ((i & 4) != 0) {
            textParametersDto = bubbleToggleDto.textStyle;
        }
        if ((i & 8) != 0) {
            imageDto = bubbleToggleDto.icon;
        }
        if ((i & 16) != 0) {
            sizeDto = bubbleToggleDto.size;
        }
        if ((i & 32) != 0) {
            str3 = bubbleToggleDto.metricaLabel;
        }
        if ((i & 64) != 0) {
            obj = bubbleToggleDto.meta;
        }
        String str4 = str3;
        Object obj3 = obj;
        SizeDto sizeDto2 = sizeDto;
        TextParametersDto textParametersDto2 = textParametersDto;
        return bubbleToggleDto.copy(str, str2, textParametersDto2, imageDto, sizeDto2, str4, obj3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final TextParametersDto getTextStyle() {
        return this.textStyle;
    }

    /* renamed from: component4, reason: from getter */
    public final ImageDto getIcon() {
        return this.icon;
    }

    /* renamed from: component5, reason: from getter */
    public final SizeDto getSize() {
        return this.size;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component7, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final BubbleToggleDto copy(@Json(name = "id") String id, @Json(name = "text") String text, @Json(name = "text_style") TextParametersDto textStyle, @Json(name = "icon") ImageDto icon, @Json(name = "size") SizeDto size, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new BubbleToggleDto(id, text, textStyle, icon, size, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BubbleToggleDto)) {
            return false;
        }
        BubbleToggleDto bubbleToggleDto = (BubbleToggleDto) other;
        return jl40.l(this.id, bubbleToggleDto.id) && jl40.l(this.text, bubbleToggleDto.text) && jl40.l(this.textStyle, bubbleToggleDto.textStyle) && jl40.l(this.icon, bubbleToggleDto.icon) && this.size == bubbleToggleDto.size && jl40.l(this.metricaLabel, bubbleToggleDto.metricaLabel) && jl40.l(this.meta, bubbleToggleDto.meta);
    }

    public final ImageDto getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final SizeDto getSize() {
        return this.size;
    }

    public final String getText() {
        return this.text;
    }

    public final TextParametersDto getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        int b = unr0.b(this.id.hashCode() * 31, 31, this.text);
        TextParametersDto textParametersDto = this.textStyle;
        int hashCode = (b + (textParametersDto == null ? 0 : textParametersDto.hashCode())) * 31;
        ImageDto imageDto = this.icon;
        int hashCode2 = (this.size.hashCode() + ((hashCode + (imageDto == null ? 0 : imageDto.hashCode())) * 31)) * 31;
        String str = this.metricaLabel;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode3 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.text;
        TextParametersDto textParametersDto = this.textStyle;
        ImageDto imageDto = this.icon;
        SizeDto sizeDto = this.size;
        String str3 = this.metricaLabel;
        Object obj = this.meta;
        StringBuilder v = b64.v("BubbleToggleDto(id=", str, ", text=", str2, ", textStyle=");
        v.append(textParametersDto);
        v.append(", icon=");
        v.append(imageDto);
        v.append(", size=");
        v.append(sizeDto);
        v.append(", metricaLabel=");
        v.append(str3);
        v.append(", meta=");
        return x4e.h(v, obj, Extension.C_BRAKE);
    }

    public /* synthetic */ BubbleToggleDto(String str, String str2, TextParametersDto textParametersDto, ImageDto imageDto, SizeDto sizeDto, String str3, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, textParametersDto, imageDto, (i & 16) != 0 ? SizeDto.XS : sizeDto, str3, obj);
    }
}
