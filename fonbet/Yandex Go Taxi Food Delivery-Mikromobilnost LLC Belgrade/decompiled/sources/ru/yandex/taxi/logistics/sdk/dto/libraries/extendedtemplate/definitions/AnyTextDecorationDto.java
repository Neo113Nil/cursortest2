package ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AnyTextDecorationDto;", "", "AnyTextDecoration_LineThroughDto", "AnyTextDecoration_UnderlineDto", "Unknown_AnyTextDecorationDto", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AnyTextDecorationDto$AnyTextDecoration_LineThroughDto;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AnyTextDecorationDto$AnyTextDecoration_UnderlineDto;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AnyTextDecorationDto$Unknown_AnyTextDecorationDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class AnyTextDecorationDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AnyTextDecorationDto$AnyTextDecoration_LineThroughDto;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AnyTextDecorationDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/TextDecorationLineThroughDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/TextDecorationLineThroughDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/TextDecorationLineThroughDto;)Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AnyTextDecorationDto$AnyTextDecoration_LineThroughDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AnyTextDecoration_LineThroughDto extends AnyTextDecorationDto {
        public final String a;
        public final TextDecorationLineThroughDto b;

        public AnyTextDecoration_LineThroughDto(@Json(name = "type") String str, TextDecorationLineThroughDto textDecorationLineThroughDto) {
            this.a = str;
            this.b = textDecorationLineThroughDto;
        }

        public final AnyTextDecoration_LineThroughDto copy(@Json(name = "type") String type, TextDecorationLineThroughDto value) {
            return new AnyTextDecoration_LineThroughDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnyTextDecoration_LineThroughDto)) {
                return false;
            }
            AnyTextDecoration_LineThroughDto anyTextDecoration_LineThroughDto = (AnyTextDecoration_LineThroughDto) obj;
            return this.a.equals(anyTextDecoration_LineThroughDto.a) && this.b.equals(anyTextDecoration_LineThroughDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AnyTextDecoration_LineThroughDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AnyTextDecorationDto$AnyTextDecoration_UnderlineDto;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AnyTextDecorationDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/TextDecorationUnderlineDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/TextDecorationUnderlineDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/TextDecorationUnderlineDto;)Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AnyTextDecorationDto$AnyTextDecoration_UnderlineDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AnyTextDecoration_UnderlineDto extends AnyTextDecorationDto {
        public final String a;
        public final TextDecorationUnderlineDto b;

        public AnyTextDecoration_UnderlineDto(@Json(name = "type") String str, TextDecorationUnderlineDto textDecorationUnderlineDto) {
            this.a = str;
            this.b = textDecorationUnderlineDto;
        }

        public final AnyTextDecoration_UnderlineDto copy(@Json(name = "type") String type, TextDecorationUnderlineDto value) {
            return new AnyTextDecoration_UnderlineDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnyTextDecoration_UnderlineDto)) {
                return false;
            }
            AnyTextDecoration_UnderlineDto anyTextDecoration_UnderlineDto = (AnyTextDecoration_UnderlineDto) obj;
            return this.a.equals(anyTextDecoration_UnderlineDto.a) && this.b.equals(anyTextDecoration_UnderlineDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AnyTextDecoration_UnderlineDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AnyTextDecorationDto$Unknown_AnyTextDecorationDto;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AnyTextDecorationDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AnyTextDecorationDto$Unknown_AnyTextDecorationDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_AnyTextDecorationDto extends AnyTextDecorationDto {
        public final String a;

        public Unknown_AnyTextDecorationDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_AnyTextDecorationDto copy(@Json(name = "type") String type) {
            return new Unknown_AnyTextDecorationDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_AnyTextDecorationDto) && jl40.l(this.a, ((Unknown_AnyTextDecorationDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_AnyTextDecorationDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_AnyTextDecorationDto() {
            this(0);
        }

        public /* synthetic */ Unknown_AnyTextDecorationDto(int i) {
            this("unknown");
        }
    }
}
