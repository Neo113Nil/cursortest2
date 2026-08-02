package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto;", "", "NeuroPostcardStage_InitialStageDto", "NeuroPostcardStage_EditingStageDto", "NeuroPostcardStage_SendingStageDto", "NeuroPostcardStage_CompletedStageDto", "Unknown_NeuroPostcardStageDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto$NeuroPostcardStage_CompletedStageDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto$NeuroPostcardStage_EditingStageDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto$NeuroPostcardStage_InitialStageDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto$NeuroPostcardStage_SendingStageDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto$Unknown_NeuroPostcardStageDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class NeuroPostcardStageDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto$NeuroPostcardStage_CompletedStageDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardCompletedStageDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardCompletedStageDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardCompletedStageDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto$NeuroPostcardStage_CompletedStageDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeuroPostcardStage_CompletedStageDto extends NeuroPostcardStageDto {
        public final String a;
        public final NeuroPostcardCompletedStageDto b;

        public NeuroPostcardStage_CompletedStageDto(@Json(name = "type") String str, NeuroPostcardCompletedStageDto neuroPostcardCompletedStageDto) {
            this.a = str;
            this.b = neuroPostcardCompletedStageDto;
        }

        public final NeuroPostcardStage_CompletedStageDto copy(@Json(name = "type") String type, NeuroPostcardCompletedStageDto value) {
            return new NeuroPostcardStage_CompletedStageDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NeuroPostcardStage_CompletedStageDto)) {
                return false;
            }
            NeuroPostcardStage_CompletedStageDto neuroPostcardStage_CompletedStageDto = (NeuroPostcardStage_CompletedStageDto) obj;
            return this.a.equals(neuroPostcardStage_CompletedStageDto.a) && this.b.equals(neuroPostcardStage_CompletedStageDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "NeuroPostcardStage_CompletedStageDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto$NeuroPostcardStage_EditingStageDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardEditingStageDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardEditingStageDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardEditingStageDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto$NeuroPostcardStage_EditingStageDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeuroPostcardStage_EditingStageDto extends NeuroPostcardStageDto {
        public final String a;
        public final NeuroPostcardEditingStageDto b;

        public NeuroPostcardStage_EditingStageDto(@Json(name = "type") String str, NeuroPostcardEditingStageDto neuroPostcardEditingStageDto) {
            this.a = str;
            this.b = neuroPostcardEditingStageDto;
        }

        public final NeuroPostcardStage_EditingStageDto copy(@Json(name = "type") String type, NeuroPostcardEditingStageDto value) {
            return new NeuroPostcardStage_EditingStageDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NeuroPostcardStage_EditingStageDto)) {
                return false;
            }
            NeuroPostcardStage_EditingStageDto neuroPostcardStage_EditingStageDto = (NeuroPostcardStage_EditingStageDto) obj;
            return this.a.equals(neuroPostcardStage_EditingStageDto.a) && this.b.equals(neuroPostcardStage_EditingStageDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "NeuroPostcardStage_EditingStageDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto$NeuroPostcardStage_InitialStageDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardInitialStageDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardInitialStageDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardInitialStageDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto$NeuroPostcardStage_InitialStageDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeuroPostcardStage_InitialStageDto extends NeuroPostcardStageDto {
        public final String a;
        public final NeuroPostcardInitialStageDto b;

        public NeuroPostcardStage_InitialStageDto(@Json(name = "type") String str, NeuroPostcardInitialStageDto neuroPostcardInitialStageDto) {
            this.a = str;
            this.b = neuroPostcardInitialStageDto;
        }

        public final NeuroPostcardStage_InitialStageDto copy(@Json(name = "type") String type, NeuroPostcardInitialStageDto value) {
            return new NeuroPostcardStage_InitialStageDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof NeuroPostcardStage_InitialStageDto) {
                NeuroPostcardStage_InitialStageDto neuroPostcardStage_InitialStageDto = (NeuroPostcardStage_InitialStageDto) obj;
                return this.a.equals(neuroPostcardStage_InitialStageDto.a) && this.b == neuroPostcardStage_InitialStageDto.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "NeuroPostcardStage_InitialStageDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto$NeuroPostcardStage_SendingStageDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardSendingStageDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardSendingStageDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardSendingStageDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto$NeuroPostcardStage_SendingStageDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeuroPostcardStage_SendingStageDto extends NeuroPostcardStageDto {
        public final String a;
        public final NeuroPostcardSendingStageDto b;

        public NeuroPostcardStage_SendingStageDto(@Json(name = "type") String str, NeuroPostcardSendingStageDto neuroPostcardSendingStageDto) {
            this.a = str;
            this.b = neuroPostcardSendingStageDto;
        }

        public final NeuroPostcardStage_SendingStageDto copy(@Json(name = "type") String type, NeuroPostcardSendingStageDto value) {
            return new NeuroPostcardStage_SendingStageDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NeuroPostcardStage_SendingStageDto)) {
                return false;
            }
            NeuroPostcardStage_SendingStageDto neuroPostcardStage_SendingStageDto = (NeuroPostcardStage_SendingStageDto) obj;
            return this.a.equals(neuroPostcardStage_SendingStageDto.a) && this.b.equals(neuroPostcardStage_SendingStageDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "NeuroPostcardStage_SendingStageDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto$Unknown_NeuroPostcardStageDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardStageDto$Unknown_NeuroPostcardStageDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_NeuroPostcardStageDto extends NeuroPostcardStageDto {
        public final String a;

        public Unknown_NeuroPostcardStageDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_NeuroPostcardStageDto copy(@Json(name = "type") String type) {
            return new Unknown_NeuroPostcardStageDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_NeuroPostcardStageDto) && jl40.l(this.a, ((Unknown_NeuroPostcardStageDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_NeuroPostcardStageDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_NeuroPostcardStageDto() {
            this(0);
        }

        public /* synthetic */ Unknown_NeuroPostcardStageDto(int i) {
            this("unknown");
        }
    }
}
