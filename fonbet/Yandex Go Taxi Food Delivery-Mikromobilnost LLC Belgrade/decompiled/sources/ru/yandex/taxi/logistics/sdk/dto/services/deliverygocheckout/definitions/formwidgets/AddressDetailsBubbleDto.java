package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressDetailsBubbleDto;", "", "text", "", "anchor", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressDetailsBubbleDto$AnchorDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressDetailsBubbleDto$AnchorDto;)V", "getText", "()Ljava/lang/String;", "getAnchor", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressDetailsBubbleDto$AnchorDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "AnchorDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AddressDetailsBubbleDto {
    private final AnchorDto anchor;
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressDetailsBubbleDto$AnchorDto;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_RIGHT", "TOP_LEFT", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnchorDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AnchorDto[] $VALUES;

        @Json(name = "top_right")
        public static final AnchorDto TOP_RIGHT = new AnchorDto("TOP_RIGHT", 0);

        @Json(name = "top_left")
        public static final AnchorDto TOP_LEFT = new AnchorDto("TOP_LEFT", 1);

        private static final /* synthetic */ AnchorDto[] $values() {
            return new AnchorDto[]{TOP_RIGHT, TOP_LEFT};
        }

        static {
            AnchorDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private AnchorDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static AnchorDto valueOf(String str) {
            return (AnchorDto) Enum.valueOf(AnchorDto.class, str);
        }

        public static AnchorDto[] values() {
            return (AnchorDto[]) $VALUES.clone();
        }
    }

    public /* synthetic */ AddressDetailsBubbleDto(String str, AnchorDto anchorDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? AnchorDto.TOP_RIGHT : anchorDto);
    }

    public static /* synthetic */ AddressDetailsBubbleDto copy$default(AddressDetailsBubbleDto addressDetailsBubbleDto, String str, AnchorDto anchorDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressDetailsBubbleDto.text;
        }
        if ((i & 2) != 0) {
            anchorDto = addressDetailsBubbleDto.anchor;
        }
        return addressDetailsBubbleDto.copy(str, anchorDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final AnchorDto getAnchor() {
        return this.anchor;
    }

    public final AddressDetailsBubbleDto copy(@Json(name = "text") String text, @Json(name = "anchor") AnchorDto anchor) {
        return new AddressDetailsBubbleDto(text, anchor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressDetailsBubbleDto)) {
            return false;
        }
        AddressDetailsBubbleDto addressDetailsBubbleDto = (AddressDetailsBubbleDto) other;
        return jl40.l(this.text, addressDetailsBubbleDto.text) && this.anchor == addressDetailsBubbleDto.anchor;
    }

    public final AnchorDto getAnchor() {
        return this.anchor;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.anchor.hashCode() + (this.text.hashCode() * 31);
    }

    public String toString() {
        return "AddressDetailsBubbleDto(text=" + this.text + ", anchor=" + this.anchor + Extension.C_BRAKE;
    }

    public AddressDetailsBubbleDto(@Json(name = "text") String str, @Json(name = "anchor") AnchorDto anchorDto) {
        this.text = str;
        this.anchor = anchorDto;
    }
}
