package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.smw0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0001\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0001HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/RoverActionDto;", "", "action", "", "title", "payload", "confirmationModal", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/StateModalDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/StateModalDto;)V", "getAction", "()Ljava/lang/String;", "getTitle", "getPayload", "()Ljava/lang/Object;", "getConfirmationModal", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/StateModalDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RoverActionDto {
    private final String action;
    private final StateModalDto confirmationModal;
    private final Object payload;
    private final String title;

    public RoverActionDto(@Json(name = "action") String str, @Json(name = "title") String str2, @Json(name = "payload") Object obj, @Json(name = "confirmation_modal") StateModalDto stateModalDto) {
        this.action = str;
        this.title = str2;
        this.payload = obj;
        this.confirmationModal = stateModalDto;
    }

    public static /* synthetic */ RoverActionDto copy$default(RoverActionDto roverActionDto, String str, String str2, Object obj, StateModalDto stateModalDto, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = roverActionDto.action;
        }
        if ((i & 2) != 0) {
            str2 = roverActionDto.title;
        }
        if ((i & 4) != 0) {
            obj = roverActionDto.payload;
        }
        if ((i & 8) != 0) {
            stateModalDto = roverActionDto.confirmationModal;
        }
        return roverActionDto.copy(str, str2, obj, stateModalDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getPayload() {
        return this.payload;
    }

    /* renamed from: component4, reason: from getter */
    public final StateModalDto getConfirmationModal() {
        return this.confirmationModal;
    }

    public final RoverActionDto copy(@Json(name = "action") String action, @Json(name = "title") String title, @Json(name = "payload") Object payload, @Json(name = "confirmation_modal") StateModalDto confirmationModal) {
        return new RoverActionDto(action, title, payload, confirmationModal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoverActionDto)) {
            return false;
        }
        RoverActionDto roverActionDto = (RoverActionDto) other;
        return jl40.l(this.action, roverActionDto.action) && jl40.l(this.title, roverActionDto.title) && jl40.l(this.payload, roverActionDto.payload) && jl40.l(this.confirmationModal, roverActionDto.confirmationModal);
    }

    public final String getAction() {
        return this.action;
    }

    public final StateModalDto getConfirmationModal() {
        return this.confirmationModal;
    }

    public final Object getPayload() {
        return this.payload;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int c = smw0.c(unr0.b(this.action.hashCode() * 31, 31, this.title), 31, this.payload);
        StateModalDto stateModalDto = this.confirmationModal;
        return c + (stateModalDto == null ? 0 : stateModalDto.hashCode());
    }

    public String toString() {
        String str = this.action;
        String str2 = this.title;
        Object obj = this.payload;
        StateModalDto stateModalDto = this.confirmationModal;
        StringBuilder v = b64.v("RoverActionDto(action=", str, ", title=", str2, ", payload=");
        v.append(obj);
        v.append(", confirmationModal=");
        v.append(stateModalDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
