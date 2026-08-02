package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b\u0012\b\b\u0003\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto;", "", "reference", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto$ReferenceDto;", "width", "", "height", "dimAmount", "", "dimColor", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto$ReferenceDto;IIDLjava/lang/String;)V", "getReference", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto$ReferenceDto;", "getWidth", "()I", "getHeight", "getDimAmount", "()D", "getDimColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "ReferenceDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NeuroPostcardImageDto {
    private final double dimAmount;
    private final String dimColor;
    private final int height;
    private final ReferenceDto reference;
    private final int width;

    public /* synthetic */ NeuroPostcardImageDto(ReferenceDto referenceDto, int i, int i2, double d, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(referenceDto, i, i2, (i3 & 8) != 0 ? 0.0d : d, (i3 & 16) != 0 ? "#000000" : str);
    }

    public static /* synthetic */ NeuroPostcardImageDto copy$default(NeuroPostcardImageDto neuroPostcardImageDto, ReferenceDto referenceDto, int i, int i2, double d, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            referenceDto = neuroPostcardImageDto.reference;
        }
        if ((i3 & 2) != 0) {
            i = neuroPostcardImageDto.width;
        }
        if ((i3 & 4) != 0) {
            i2 = neuroPostcardImageDto.height;
        }
        if ((i3 & 8) != 0) {
            d = neuroPostcardImageDto.dimAmount;
        }
        if ((i3 & 16) != 0) {
            str = neuroPostcardImageDto.dimColor;
        }
        String str2 = str;
        int i4 = i2;
        return neuroPostcardImageDto.copy(referenceDto, i, i4, d, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final ReferenceDto getReference() {
        return this.reference;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component4, reason: from getter */
    public final double getDimAmount() {
        return this.dimAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDimColor() {
        return this.dimColor;
    }

    public final NeuroPostcardImageDto copy(@Json(name = "reference") ReferenceDto reference, @Json(name = "width") int width, @Json(name = "height") int height, @Json(name = "dim_amount") double dimAmount, @Json(name = "dim_color") String dimColor) {
        return new NeuroPostcardImageDto(reference, width, height, dimAmount, dimColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NeuroPostcardImageDto)) {
            return false;
        }
        NeuroPostcardImageDto neuroPostcardImageDto = (NeuroPostcardImageDto) other;
        return jl40.l(this.reference, neuroPostcardImageDto.reference) && this.width == neuroPostcardImageDto.width && this.height == neuroPostcardImageDto.height && Double.compare(this.dimAmount, neuroPostcardImageDto.dimAmount) == 0 && jl40.l(this.dimColor, neuroPostcardImageDto.dimColor);
    }

    public final double getDimAmount() {
        return this.dimAmount;
    }

    public final String getDimColor() {
        return this.dimColor;
    }

    public final int getHeight() {
        return this.height;
    }

    public final ReferenceDto getReference() {
        return this.reference;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.dimColor.hashCode() + unr0.a(oyr.b(this.height, oyr.b(this.width, this.reference.hashCode() * 31, 31), 31), 31, this.dimAmount);
    }

    public String toString() {
        ReferenceDto referenceDto = this.reference;
        int i = this.width;
        int i2 = this.height;
        double d = this.dimAmount;
        String str = this.dimColor;
        StringBuilder sb = new StringBuilder("NeuroPostcardImageDto(reference=");
        sb.append(referenceDto);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", dimAmount=");
        sb.append(d);
        return unr0.r(sb, ", dimColor=", str, Extension.C_BRAKE);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto$ReferenceDto;", "", "Reference_UrlDto", "Reference_TagDto", "Unknown_ReferenceDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto$ReferenceDto$Reference_TagDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto$ReferenceDto$Reference_UrlDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto$ReferenceDto$Unknown_ReferenceDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ReferenceDto {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto$ReferenceDto$Reference_TagDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto$ReferenceDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardTagImageReferenceDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardTagImageReferenceDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardTagImageReferenceDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto$ReferenceDto$Reference_TagDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Reference_TagDto extends ReferenceDto {
            public final String a;
            public final NeuroPostcardTagImageReferenceDto b;

            public Reference_TagDto(@Json(name = "type") String str, NeuroPostcardTagImageReferenceDto neuroPostcardTagImageReferenceDto) {
                this.a = str;
                this.b = neuroPostcardTagImageReferenceDto;
            }

            public final Reference_TagDto copy(@Json(name = "type") String type, NeuroPostcardTagImageReferenceDto value) {
                return new Reference_TagDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Reference_TagDto)) {
                    return false;
                }
                Reference_TagDto reference_TagDto = (Reference_TagDto) obj;
                return this.a.equals(reference_TagDto.a) && this.b.equals(reference_TagDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Reference_TagDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto$ReferenceDto$Reference_UrlDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto$ReferenceDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardURLImageReferenceDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardURLImageReferenceDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardURLImageReferenceDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto$ReferenceDto$Reference_UrlDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Reference_UrlDto extends ReferenceDto {
            public final String a;
            public final NeuroPostcardURLImageReferenceDto b;

            public Reference_UrlDto(@Json(name = "type") String str, NeuroPostcardURLImageReferenceDto neuroPostcardURLImageReferenceDto) {
                this.a = str;
                this.b = neuroPostcardURLImageReferenceDto;
            }

            public final Reference_UrlDto copy(@Json(name = "type") String type, NeuroPostcardURLImageReferenceDto value) {
                return new Reference_UrlDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Reference_UrlDto)) {
                    return false;
                }
                Reference_UrlDto reference_UrlDto = (Reference_UrlDto) obj;
                return this.a.equals(reference_UrlDto.a) && this.b.equals(reference_UrlDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Reference_UrlDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto$ReferenceDto$Unknown_ReferenceDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto$ReferenceDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto$ReferenceDto$Unknown_ReferenceDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Unknown_ReferenceDto extends ReferenceDto {
            public final String a;

            public Unknown_ReferenceDto(@Json(name = "type") String str) {
                this.a = str;
            }

            public final Unknown_ReferenceDto copy(@Json(name = "type") String type) {
                return new Unknown_ReferenceDto(type);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Unknown_ReferenceDto) && jl40.l(this.a, ((Unknown_ReferenceDto) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oyr.p("Unknown_ReferenceDto(type=", this.a, Extension.C_BRAKE);
            }

            public Unknown_ReferenceDto() {
                this(0);
            }

            public /* synthetic */ Unknown_ReferenceDto(int i) {
                this("unknown");
            }
        }
    }

    public NeuroPostcardImageDto(@Json(name = "reference") ReferenceDto referenceDto, @Json(name = "width") int i, @Json(name = "height") int i2, @Json(name = "dim_amount") double d, @Json(name = "dim_color") String str) {
        this.reference = referenceDto;
        this.width = i;
        this.height = i2;
        this.dimAmount = d;
        this.dimColor = str;
    }
}
