package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto;", "", "Background_ColoredBackgroundDto", "Background_LinearGradientBackgroundDto", "Background_ImageBackgroundDto", "Unknown_BackgroundDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto$Background_ColoredBackgroundDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto$Background_ImageBackgroundDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto$Background_LinearGradientBackgroundDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto$Unknown_BackgroundDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class BackgroundDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto$Background_ColoredBackgroundDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColoredBackgroundDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColoredBackgroundDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColoredBackgroundDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto$Background_ColoredBackgroundDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Background_ColoredBackgroundDto extends BackgroundDto {
        public final String a;
        public final ColoredBackgroundDto b;

        public Background_ColoredBackgroundDto(@Json(name = "type") String str, ColoredBackgroundDto coloredBackgroundDto) {
            this.a = str;
            this.b = coloredBackgroundDto;
        }

        public final Background_ColoredBackgroundDto copy(@Json(name = "type") String type, ColoredBackgroundDto value) {
            return new Background_ColoredBackgroundDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Background_ColoredBackgroundDto)) {
                return false;
            }
            Background_ColoredBackgroundDto background_ColoredBackgroundDto = (Background_ColoredBackgroundDto) obj;
            return this.a.equals(background_ColoredBackgroundDto.a) && this.b.equals(background_ColoredBackgroundDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Background_ColoredBackgroundDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto$Background_ImageBackgroundDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ImageBackgroundDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ImageBackgroundDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ImageBackgroundDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto$Background_ImageBackgroundDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Background_ImageBackgroundDto extends BackgroundDto {
        public final String a;
        public final ImageBackgroundDto b;

        public Background_ImageBackgroundDto(@Json(name = "type") String str, ImageBackgroundDto imageBackgroundDto) {
            this.a = str;
            this.b = imageBackgroundDto;
        }

        public final Background_ImageBackgroundDto copy(@Json(name = "type") String type, ImageBackgroundDto value) {
            return new Background_ImageBackgroundDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Background_ImageBackgroundDto)) {
                return false;
            }
            Background_ImageBackgroundDto background_ImageBackgroundDto = (Background_ImageBackgroundDto) obj;
            return this.a.equals(background_ImageBackgroundDto.a) && this.b.equals(background_ImageBackgroundDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Background_ImageBackgroundDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto$Background_LinearGradientBackgroundDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/LinearGradientBackgroundDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/LinearGradientBackgroundDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/LinearGradientBackgroundDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto$Background_LinearGradientBackgroundDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Background_LinearGradientBackgroundDto extends BackgroundDto {
        public final String a;
        public final LinearGradientBackgroundDto b;

        public Background_LinearGradientBackgroundDto(@Json(name = "type") String str, LinearGradientBackgroundDto linearGradientBackgroundDto) {
            this.a = str;
            this.b = linearGradientBackgroundDto;
        }

        public final Background_LinearGradientBackgroundDto copy(@Json(name = "type") String type, LinearGradientBackgroundDto value) {
            return new Background_LinearGradientBackgroundDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Background_LinearGradientBackgroundDto)) {
                return false;
            }
            Background_LinearGradientBackgroundDto background_LinearGradientBackgroundDto = (Background_LinearGradientBackgroundDto) obj;
            return this.a.equals(background_LinearGradientBackgroundDto.a) && this.b.equals(background_LinearGradientBackgroundDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Background_LinearGradientBackgroundDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto$Unknown_BackgroundDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto$Unknown_BackgroundDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_BackgroundDto extends BackgroundDto {
        public final String a;

        public Unknown_BackgroundDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_BackgroundDto copy(@Json(name = "type") String type) {
            return new Unknown_BackgroundDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_BackgroundDto) && jl40.l(this.a, ((Unknown_BackgroundDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_BackgroundDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_BackgroundDto() {
            this(0);
        }

        public /* synthetic */ Unknown_BackgroundDto(int i) {
            this("unknown");
        }
    }
}
