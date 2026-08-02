package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.chooseprofile;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/ChooseProfileScreenActionDto;", "", "ChooseProfileScreenAction_WebViewActionDto", "ChooseProfileScreenAction_SwitchProfileActionDto", "Unknown_ChooseProfileScreenActionDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/ChooseProfileScreenActionDto$ChooseProfileScreenAction_SwitchProfileActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/ChooseProfileScreenActionDto$ChooseProfileScreenAction_WebViewActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/ChooseProfileScreenActionDto$Unknown_ChooseProfileScreenActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ChooseProfileScreenActionDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/ChooseProfileScreenActionDto$ChooseProfileScreenAction_SwitchProfileActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/ChooseProfileScreenActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/SwitchProfileActionDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/SwitchProfileActionDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/SwitchProfileActionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/ChooseProfileScreenActionDto$ChooseProfileScreenAction_SwitchProfileActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChooseProfileScreenAction_SwitchProfileActionDto extends ChooseProfileScreenActionDto {
        public final String a;
        public final SwitchProfileActionDto b;

        public ChooseProfileScreenAction_SwitchProfileActionDto(@Json(name = "type") String str, SwitchProfileActionDto switchProfileActionDto) {
            this.a = str;
            this.b = switchProfileActionDto;
        }

        public final ChooseProfileScreenAction_SwitchProfileActionDto copy(@Json(name = "type") String type, SwitchProfileActionDto value) {
            return new ChooseProfileScreenAction_SwitchProfileActionDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ChooseProfileScreenAction_SwitchProfileActionDto) {
                ChooseProfileScreenAction_SwitchProfileActionDto chooseProfileScreenAction_SwitchProfileActionDto = (ChooseProfileScreenAction_SwitchProfileActionDto) obj;
                return this.a.equals(chooseProfileScreenAction_SwitchProfileActionDto.a) && this.b == chooseProfileScreenAction_SwitchProfileActionDto.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ChooseProfileScreenAction_SwitchProfileActionDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/ChooseProfileScreenActionDto$ChooseProfileScreenAction_WebViewActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/ChooseProfileScreenActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/OpenWebViewActionDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/OpenWebViewActionDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/OpenWebViewActionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/ChooseProfileScreenActionDto$ChooseProfileScreenAction_WebViewActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChooseProfileScreenAction_WebViewActionDto extends ChooseProfileScreenActionDto {
        public final String a;
        public final OpenWebViewActionDto b;

        public ChooseProfileScreenAction_WebViewActionDto(@Json(name = "type") String str, OpenWebViewActionDto openWebViewActionDto) {
            this.a = str;
            this.b = openWebViewActionDto;
        }

        public final ChooseProfileScreenAction_WebViewActionDto copy(@Json(name = "type") String type, OpenWebViewActionDto value) {
            return new ChooseProfileScreenAction_WebViewActionDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChooseProfileScreenAction_WebViewActionDto)) {
                return false;
            }
            ChooseProfileScreenAction_WebViewActionDto chooseProfileScreenAction_WebViewActionDto = (ChooseProfileScreenAction_WebViewActionDto) obj;
            return this.a.equals(chooseProfileScreenAction_WebViewActionDto.a) && this.b.equals(chooseProfileScreenAction_WebViewActionDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ChooseProfileScreenAction_WebViewActionDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/ChooseProfileScreenActionDto$Unknown_ChooseProfileScreenActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/ChooseProfileScreenActionDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/ChooseProfileScreenActionDto$Unknown_ChooseProfileScreenActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_ChooseProfileScreenActionDto extends ChooseProfileScreenActionDto {
        public final String a;

        public Unknown_ChooseProfileScreenActionDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_ChooseProfileScreenActionDto copy(@Json(name = "type") String type) {
            return new Unknown_ChooseProfileScreenActionDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_ChooseProfileScreenActionDto) && jl40.l(this.a, ((Unknown_ChooseProfileScreenActionDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_ChooseProfileScreenActionDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_ChooseProfileScreenActionDto() {
            this(0);
        }

        public /* synthetic */ Unknown_ChooseProfileScreenActionDto(int i) {
            this("unknown");
        }
    }
}
