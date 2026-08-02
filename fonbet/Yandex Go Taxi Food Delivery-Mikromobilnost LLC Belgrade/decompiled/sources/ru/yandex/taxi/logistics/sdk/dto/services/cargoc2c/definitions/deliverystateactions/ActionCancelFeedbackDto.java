package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionCancelFeedbackDto;", "", "title", "", IssuingDistributionPointExtension.REASONS, "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/FeedbackCancelReasonDto;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getReasons", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ActionCancelFeedbackDto {
    private final List<FeedbackCancelReasonDto> reasons;
    private final String title;

    public ActionCancelFeedbackDto(@Json(name = "title") String str, @Json(name = "reasons") List<FeedbackCancelReasonDto> list) {
        this.title = str;
        this.reasons = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionCancelFeedbackDto copy$default(ActionCancelFeedbackDto actionCancelFeedbackDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionCancelFeedbackDto.title;
        }
        if ((i & 2) != 0) {
            list = actionCancelFeedbackDto.reasons;
        }
        return actionCancelFeedbackDto.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<FeedbackCancelReasonDto> component2() {
        return this.reasons;
    }

    public final ActionCancelFeedbackDto copy(@Json(name = "title") String title, @Json(name = "reasons") List<FeedbackCancelReasonDto> reasons) {
        return new ActionCancelFeedbackDto(title, reasons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionCancelFeedbackDto)) {
            return false;
        }
        ActionCancelFeedbackDto actionCancelFeedbackDto = (ActionCancelFeedbackDto) other;
        return jl40.l(this.title, actionCancelFeedbackDto.title) && jl40.l(this.reasons, actionCancelFeedbackDto.reasons);
    }

    public final List<FeedbackCancelReasonDto> getReasons() {
        return this.reasons;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.reasons.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return nnm.h("ActionCancelFeedbackDto(title=", this.title, ", reasons=", Extension.C_BRAKE, this.reasons);
    }
}
