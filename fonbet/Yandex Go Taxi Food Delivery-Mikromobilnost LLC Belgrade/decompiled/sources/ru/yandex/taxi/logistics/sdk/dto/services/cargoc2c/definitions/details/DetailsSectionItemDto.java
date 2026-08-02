package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemDto;", "", "DetailsSectionItem_SubtitleDto", "DetailsSectionItem_AccordionDto", "DetailsSectionItem_SmallTitleDto", "DetailsSectionItem_TextDto", "Unknown_DetailsSectionItemDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemDto$DetailsSectionItem_AccordionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemDto$DetailsSectionItem_SmallTitleDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemDto$DetailsSectionItem_SubtitleDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemDto$DetailsSectionItem_TextDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemDto$Unknown_DetailsSectionItemDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class DetailsSectionItemDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemDto$DetailsSectionItem_AccordionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemDto$DetailsSectionItem_AccordionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DetailsSectionItem_AccordionDto extends DetailsSectionItemDto {
        public final String a;
        public final DetailsSectionItemAccordionDto b;

        public DetailsSectionItem_AccordionDto(@Json(name = "type") String str, DetailsSectionItemAccordionDto detailsSectionItemAccordionDto) {
            this.a = str;
            this.b = detailsSectionItemAccordionDto;
        }

        public final DetailsSectionItem_AccordionDto copy(@Json(name = "type") String type, DetailsSectionItemAccordionDto value) {
            return new DetailsSectionItem_AccordionDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DetailsSectionItem_AccordionDto)) {
                return false;
            }
            DetailsSectionItem_AccordionDto detailsSectionItem_AccordionDto = (DetailsSectionItem_AccordionDto) obj;
            return this.a.equals(detailsSectionItem_AccordionDto.a) && this.b.equals(detailsSectionItem_AccordionDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DetailsSectionItem_AccordionDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemDto$DetailsSectionItem_SmallTitleDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemSmallTitleDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemSmallTitleDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemSmallTitleDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemDto$DetailsSectionItem_SmallTitleDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DetailsSectionItem_SmallTitleDto extends DetailsSectionItemDto {
        public final String a;
        public final DetailsSectionItemSmallTitleDto b;

        public DetailsSectionItem_SmallTitleDto(@Json(name = "type") String str, DetailsSectionItemSmallTitleDto detailsSectionItemSmallTitleDto) {
            this.a = str;
            this.b = detailsSectionItemSmallTitleDto;
        }

        public final DetailsSectionItem_SmallTitleDto copy(@Json(name = "type") String type, DetailsSectionItemSmallTitleDto value) {
            return new DetailsSectionItem_SmallTitleDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DetailsSectionItem_SmallTitleDto)) {
                return false;
            }
            DetailsSectionItem_SmallTitleDto detailsSectionItem_SmallTitleDto = (DetailsSectionItem_SmallTitleDto) obj;
            return this.a.equals(detailsSectionItem_SmallTitleDto.a) && this.b.equals(detailsSectionItem_SmallTitleDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DetailsSectionItem_SmallTitleDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemDto$DetailsSectionItem_SubtitleDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemSubtitleDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemSubtitleDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemSubtitleDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemDto$DetailsSectionItem_SubtitleDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DetailsSectionItem_SubtitleDto extends DetailsSectionItemDto {
        public final String a;
        public final DetailsSectionItemSubtitleDto b;

        public DetailsSectionItem_SubtitleDto(@Json(name = "type") String str, DetailsSectionItemSubtitleDto detailsSectionItemSubtitleDto) {
            this.a = str;
            this.b = detailsSectionItemSubtitleDto;
        }

        public final DetailsSectionItem_SubtitleDto copy(@Json(name = "type") String type, DetailsSectionItemSubtitleDto value) {
            return new DetailsSectionItem_SubtitleDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DetailsSectionItem_SubtitleDto)) {
                return false;
            }
            DetailsSectionItem_SubtitleDto detailsSectionItem_SubtitleDto = (DetailsSectionItem_SubtitleDto) obj;
            return this.a.equals(detailsSectionItem_SubtitleDto.a) && this.b.equals(detailsSectionItem_SubtitleDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DetailsSectionItem_SubtitleDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemDto$DetailsSectionItem_TextDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemTextDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemTextDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemTextDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemDto$DetailsSectionItem_TextDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DetailsSectionItem_TextDto extends DetailsSectionItemDto {
        public final String a;
        public final DetailsSectionItemTextDto b;

        public DetailsSectionItem_TextDto(@Json(name = "type") String str, DetailsSectionItemTextDto detailsSectionItemTextDto) {
            this.a = str;
            this.b = detailsSectionItemTextDto;
        }

        public final DetailsSectionItem_TextDto copy(@Json(name = "type") String type, DetailsSectionItemTextDto value) {
            return new DetailsSectionItem_TextDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DetailsSectionItem_TextDto)) {
                return false;
            }
            DetailsSectionItem_TextDto detailsSectionItem_TextDto = (DetailsSectionItem_TextDto) obj;
            return this.a.equals(detailsSectionItem_TextDto.a) && this.b.equals(detailsSectionItem_TextDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DetailsSectionItem_TextDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemDto$Unknown_DetailsSectionItemDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemDto$Unknown_DetailsSectionItemDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_DetailsSectionItemDto extends DetailsSectionItemDto {
        public final String a;

        public Unknown_DetailsSectionItemDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_DetailsSectionItemDto copy(@Json(name = "type") String type) {
            return new Unknown_DetailsSectionItemDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_DetailsSectionItemDto) && jl40.l(this.a, ((Unknown_DetailsSectionItemDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_DetailsSectionItemDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_DetailsSectionItemDto() {
            this(0);
        }

        public /* synthetic */ Unknown_DetailsSectionItemDto(int i) {
            this("unknown");
        }
    }
}
