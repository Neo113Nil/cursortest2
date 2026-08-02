package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/FeedbackReasonDto;", "", "reasonId", "", "title", "scores", "", "", "icon", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/IconDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/IconDto;)V", "getReasonId", "()Ljava/lang/String;", "getTitle", "getScores", "()Ljava/util/List;", "getIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/IconDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class FeedbackReasonDto {
    private final IconDto icon;
    private final String reasonId;
    private final List<Integer> scores;
    private final String title;

    public FeedbackReasonDto(@Json(name = "reason_id") String str, @Json(name = "title") String str2, @Json(name = "scores") List<Integer> list, @Json(name = "icon") IconDto iconDto) {
        this.reasonId = str;
        this.title = str2;
        this.scores = list;
        this.icon = iconDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedbackReasonDto copy$default(FeedbackReasonDto feedbackReasonDto, String str, String str2, List list, IconDto iconDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedbackReasonDto.reasonId;
        }
        if ((i & 2) != 0) {
            str2 = feedbackReasonDto.title;
        }
        if ((i & 4) != 0) {
            list = feedbackReasonDto.scores;
        }
        if ((i & 8) != 0) {
            iconDto = feedbackReasonDto.icon;
        }
        return feedbackReasonDto.copy(str, str2, list, iconDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReasonId() {
        return this.reasonId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<Integer> component3() {
        return this.scores;
    }

    /* renamed from: component4, reason: from getter */
    public final IconDto getIcon() {
        return this.icon;
    }

    public final FeedbackReasonDto copy(@Json(name = "reason_id") String reasonId, @Json(name = "title") String title, @Json(name = "scores") List<Integer> scores, @Json(name = "icon") IconDto icon) {
        return new FeedbackReasonDto(reasonId, title, scores, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackReasonDto)) {
            return false;
        }
        FeedbackReasonDto feedbackReasonDto = (FeedbackReasonDto) other;
        return jl40.l(this.reasonId, feedbackReasonDto.reasonId) && jl40.l(this.title, feedbackReasonDto.title) && jl40.l(this.scores, feedbackReasonDto.scores) && jl40.l(this.icon, feedbackReasonDto.icon);
    }

    public final IconDto getIcon() {
        return this.icon;
    }

    public final String getReasonId() {
        return this.reasonId;
    }

    public final List<Integer> getScores() {
        return this.scores;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int c = unr0.c(unr0.b(this.reasonId.hashCode() * 31, 31, this.title), 31, this.scores);
        IconDto iconDto = this.icon;
        return c + (iconDto == null ? 0 : iconDto.hashCode());
    }

    public String toString() {
        String str = this.reasonId;
        String str2 = this.title;
        List<Integer> list = this.scores;
        IconDto iconDto = this.icon;
        StringBuilder v = b64.v("FeedbackReasonDto(reasonId=", str, ", title=", str2, ", scores=");
        v.append(list);
        v.append(", icon=");
        v.append(iconDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
