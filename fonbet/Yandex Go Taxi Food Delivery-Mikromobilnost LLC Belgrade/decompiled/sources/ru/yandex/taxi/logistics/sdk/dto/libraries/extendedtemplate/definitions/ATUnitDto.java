package ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto;", "", "ATUnit_TextDto", "ATUnit_LinkDto", "ATUnit_ImageDto", "ATUnit_ContainerDto", "Unknown_ATUnitDto", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto$ATUnit_ContainerDto;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto$ATUnit_ImageDto;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto$ATUnit_LinkDto;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto$ATUnit_TextDto;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto$Unknown_ATUnitDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class ATUnitDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto$ATUnit_ContainerDto;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto;)Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto$ATUnit_ContainerDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ATUnit_ContainerDto extends ATUnitDto {
        public final String a;
        public final ATContainerDto b;

        public ATUnit_ContainerDto(@Json(name = "type") String str, ATContainerDto aTContainerDto) {
            this.a = str;
            this.b = aTContainerDto;
        }

        public final ATUnit_ContainerDto copy(@Json(name = "type") String type, ATContainerDto value) {
            return new ATUnit_ContainerDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ATUnit_ContainerDto)) {
                return false;
            }
            ATUnit_ContainerDto aTUnit_ContainerDto = (ATUnit_ContainerDto) obj;
            return this.a.equals(aTUnit_ContainerDto.a) && this.b.equals(aTUnit_ContainerDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ATUnit_ContainerDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto$ATUnit_ImageDto;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATImagePropertyDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATImagePropertyDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATImagePropertyDto;)Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto$ATUnit_ImageDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ATUnit_ImageDto extends ATUnitDto {
        public final String a;
        public final ATImagePropertyDto b;

        public ATUnit_ImageDto(@Json(name = "type") String str, ATImagePropertyDto aTImagePropertyDto) {
            this.a = str;
            this.b = aTImagePropertyDto;
        }

        public final ATUnit_ImageDto copy(@Json(name = "type") String type, ATImagePropertyDto value) {
            return new ATUnit_ImageDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ATUnit_ImageDto)) {
                return false;
            }
            ATUnit_ImageDto aTUnit_ImageDto = (ATUnit_ImageDto) obj;
            return this.a.equals(aTUnit_ImageDto.a) && this.b.equals(aTUnit_ImageDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ATUnit_ImageDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto$ATUnit_LinkDto;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATLinkPropertyDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATLinkPropertyDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATLinkPropertyDto;)Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto$ATUnit_LinkDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ATUnit_LinkDto extends ATUnitDto {
        public final String a;
        public final ATLinkPropertyDto b;

        public ATUnit_LinkDto(@Json(name = "type") String str, ATLinkPropertyDto aTLinkPropertyDto) {
            this.a = str;
            this.b = aTLinkPropertyDto;
        }

        public final ATUnit_LinkDto copy(@Json(name = "type") String type, ATLinkPropertyDto value) {
            return new ATUnit_LinkDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ATUnit_LinkDto)) {
                return false;
            }
            ATUnit_LinkDto aTUnit_LinkDto = (ATUnit_LinkDto) obj;
            return this.a.equals(aTUnit_LinkDto.a) && this.b.equals(aTUnit_LinkDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ATUnit_LinkDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto$ATUnit_TextDto;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto;)Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto$ATUnit_TextDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ATUnit_TextDto extends ATUnitDto {
        public final String a;
        public final ATTextPropertyDto b;

        public ATUnit_TextDto(@Json(name = "type") String str, ATTextPropertyDto aTTextPropertyDto) {
            this.a = str;
            this.b = aTTextPropertyDto;
        }

        public final ATUnit_TextDto copy(@Json(name = "type") String type, ATTextPropertyDto value) {
            return new ATUnit_TextDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ATUnit_TextDto)) {
                return false;
            }
            ATUnit_TextDto aTUnit_TextDto = (ATUnit_TextDto) obj;
            return this.a.equals(aTUnit_TextDto.a) && this.b.equals(aTUnit_TextDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ATUnit_TextDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto$Unknown_ATUnitDto;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto$Unknown_ATUnitDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_ATUnitDto extends ATUnitDto {
        public final String a;

        public Unknown_ATUnitDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_ATUnitDto copy(@Json(name = "type") String type) {
            return new Unknown_ATUnitDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_ATUnitDto) && jl40.l(this.a, ((Unknown_ATUnitDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_ATUnitDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_ATUnitDto() {
            this(0);
        }

        public /* synthetic */ Unknown_ATUnitDto(int i) {
            this("unknown");
        }
    }
}
