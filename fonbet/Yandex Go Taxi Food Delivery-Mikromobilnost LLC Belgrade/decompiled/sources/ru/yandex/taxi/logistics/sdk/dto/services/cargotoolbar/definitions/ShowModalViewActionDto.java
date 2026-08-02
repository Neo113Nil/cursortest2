package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ShowModalViewActionDto;", "", "modalView", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ShowModalViewActionDto$ModalViewDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ShowModalViewActionDto$ModalViewDto;)V", "getModalView", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ShowModalViewActionDto$ModalViewDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ModalViewDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ShowModalViewActionDto {
    private final ModalViewDto modalView;

    public ShowModalViewActionDto(@Json(name = "modal_view") ModalViewDto modalViewDto) {
        this.modalView = modalViewDto;
    }

    public static /* synthetic */ ShowModalViewActionDto copy$default(ShowModalViewActionDto showModalViewActionDto, ModalViewDto modalViewDto, int i, Object obj) {
        if ((i & 1) != 0) {
            modalViewDto = showModalViewActionDto.modalView;
        }
        return showModalViewActionDto.copy(modalViewDto);
    }

    /* renamed from: component1, reason: from getter */
    public final ModalViewDto getModalView() {
        return this.modalView;
    }

    public final ShowModalViewActionDto copy(@Json(name = "modal_view") ModalViewDto modalView) {
        return new ShowModalViewActionDto(modalView);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ShowModalViewActionDto) && jl40.l(this.modalView, ((ShowModalViewActionDto) other).modalView);
    }

    public final ModalViewDto getModalView() {
        return this.modalView;
    }

    public int hashCode() {
        return this.modalView.hashCode();
    }

    public String toString() {
        return "ShowModalViewActionDto(modalView=" + this.modalView + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ShowModalViewActionDto$ModalViewDto;", "", "ModalView_InfoDto", "Unknown_ModalViewDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ShowModalViewActionDto$ModalViewDto$ModalView_InfoDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ShowModalViewActionDto$ModalViewDto$Unknown_ModalViewDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ModalViewDto {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ShowModalViewActionDto$ModalViewDto$ModalView_InfoDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ShowModalViewActionDto$ModalViewDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/InfoModalViewDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/InfoModalViewDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/InfoModalViewDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ShowModalViewActionDto$ModalViewDto$ModalView_InfoDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ModalView_InfoDto extends ModalViewDto {
            public final String a;
            public final InfoModalViewDto b;

            public ModalView_InfoDto(@Json(name = "type") String str, InfoModalViewDto infoModalViewDto) {
                this.a = str;
                this.b = infoModalViewDto;
            }

            public final ModalView_InfoDto copy(@Json(name = "type") String type, InfoModalViewDto value) {
                return new ModalView_InfoDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ModalView_InfoDto)) {
                    return false;
                }
                ModalView_InfoDto modalView_InfoDto = (ModalView_InfoDto) obj;
                return this.a.equals(modalView_InfoDto.a) && this.b.equals(modalView_InfoDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "ModalView_InfoDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ShowModalViewActionDto$ModalViewDto$Unknown_ModalViewDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ShowModalViewActionDto$ModalViewDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ShowModalViewActionDto$ModalViewDto$Unknown_ModalViewDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Unknown_ModalViewDto extends ModalViewDto {
            public final String a;

            public Unknown_ModalViewDto(@Json(name = "type") String str) {
                this.a = str;
            }

            public final Unknown_ModalViewDto copy(@Json(name = "type") String type) {
                return new Unknown_ModalViewDto(type);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Unknown_ModalViewDto) && jl40.l(this.a, ((Unknown_ModalViewDto) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oyr.p("Unknown_ModalViewDto(type=", this.a, Extension.C_BRAKE);
            }

            public Unknown_ModalViewDto() {
                this(0);
            }

            public /* synthetic */ Unknown_ModalViewDto(int i) {
                this("unknown");
            }
        }
    }
}
