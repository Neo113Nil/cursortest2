package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionFeedbackDto;", "", "title", "", "subtitles", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/FeedbackSubtitleDto;", IssuingDistributionPointExtension.REASONS, "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/FeedbackReasonDto;", "lastFeedback", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionFeedbackDto$LastFeedbackDto;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionFeedbackDto$LastFeedbackDto;)V", "getTitle", "()Ljava/lang/String;", "getSubtitles", "()Ljava/util/List;", "getReasons", "getLastFeedback", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionFeedbackDto$LastFeedbackDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "LastFeedbackDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ActionFeedbackDto {
    private final LastFeedbackDto lastFeedback;
    private final List<FeedbackReasonDto> reasons;
    private final List<FeedbackSubtitleDto> subtitles;
    private final String title;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionFeedbackDto$LastFeedbackDto;", "", "score", "", "comment", "", "reasonIds", "", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "getScore", "()I", "getComment", "()Ljava/lang/String;", "getReasonIds", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LastFeedbackDto {
        private final String comment;
        private final List<String> reasonIds;
        private final int score;

        public LastFeedbackDto(@Json(name = "score") int i, @Json(name = "comment") String str, @Json(name = "reason_ids") List<String> list) {
            this.score = i;
            this.comment = str;
            this.reasonIds = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LastFeedbackDto copy$default(LastFeedbackDto lastFeedbackDto, int i, String str, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = lastFeedbackDto.score;
            }
            if ((i2 & 2) != 0) {
                str = lastFeedbackDto.comment;
            }
            if ((i2 & 4) != 0) {
                list = lastFeedbackDto.reasonIds;
            }
            return lastFeedbackDto.copy(i, str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final int getScore() {
            return this.score;
        }

        /* renamed from: component2, reason: from getter */
        public final String getComment() {
            return this.comment;
        }

        public final List<String> component3() {
            return this.reasonIds;
        }

        public final LastFeedbackDto copy(@Json(name = "score") int score, @Json(name = "comment") String comment, @Json(name = "reason_ids") List<String> reasonIds) {
            return new LastFeedbackDto(score, comment, reasonIds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LastFeedbackDto)) {
                return false;
            }
            LastFeedbackDto lastFeedbackDto = (LastFeedbackDto) other;
            return this.score == lastFeedbackDto.score && jl40.l(this.comment, lastFeedbackDto.comment) && jl40.l(this.reasonIds, lastFeedbackDto.reasonIds);
        }

        public final String getComment() {
            return this.comment;
        }

        public final List<String> getReasonIds() {
            return this.reasonIds;
        }

        public final int getScore() {
            return this.score;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.score) * 31;
            String str = this.comment;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<String> list = this.reasonIds;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            int i = this.score;
            String str = this.comment;
            return ly3.s(unr0.v(i, "LastFeedbackDto(score=", ", comment=", str, ", reasonIds="), this.reasonIds, Extension.C_BRAKE);
        }
    }

    public ActionFeedbackDto(@Json(name = "title") String str, @Json(name = "subtitles") List<FeedbackSubtitleDto> list, @Json(name = "reasons") List<FeedbackReasonDto> list2, @Json(name = "last_feedback") LastFeedbackDto lastFeedbackDto) {
        this.title = str;
        this.subtitles = list;
        this.reasons = list2;
        this.lastFeedback = lastFeedbackDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionFeedbackDto copy$default(ActionFeedbackDto actionFeedbackDto, String str, List list, List list2, LastFeedbackDto lastFeedbackDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionFeedbackDto.title;
        }
        if ((i & 2) != 0) {
            list = actionFeedbackDto.subtitles;
        }
        if ((i & 4) != 0) {
            list2 = actionFeedbackDto.reasons;
        }
        if ((i & 8) != 0) {
            lastFeedbackDto = actionFeedbackDto.lastFeedback;
        }
        return actionFeedbackDto.copy(str, list, list2, lastFeedbackDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<FeedbackSubtitleDto> component2() {
        return this.subtitles;
    }

    public final List<FeedbackReasonDto> component3() {
        return this.reasons;
    }

    /* renamed from: component4, reason: from getter */
    public final LastFeedbackDto getLastFeedback() {
        return this.lastFeedback;
    }

    public final ActionFeedbackDto copy(@Json(name = "title") String title, @Json(name = "subtitles") List<FeedbackSubtitleDto> subtitles, @Json(name = "reasons") List<FeedbackReasonDto> reasons, @Json(name = "last_feedback") LastFeedbackDto lastFeedback) {
        return new ActionFeedbackDto(title, subtitles, reasons, lastFeedback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionFeedbackDto)) {
            return false;
        }
        ActionFeedbackDto actionFeedbackDto = (ActionFeedbackDto) other;
        return jl40.l(this.title, actionFeedbackDto.title) && jl40.l(this.subtitles, actionFeedbackDto.subtitles) && jl40.l(this.reasons, actionFeedbackDto.reasons) && jl40.l(this.lastFeedback, actionFeedbackDto.lastFeedback);
    }

    public final LastFeedbackDto getLastFeedback() {
        return this.lastFeedback;
    }

    public final List<FeedbackReasonDto> getReasons() {
        return this.reasons;
    }

    public final List<FeedbackSubtitleDto> getSubtitles() {
        return this.subtitles;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int c = unr0.c(this.title.hashCode() * 31, 31, this.subtitles);
        List<FeedbackReasonDto> list = this.reasons;
        int hashCode = (c + (list == null ? 0 : list.hashCode())) * 31;
        LastFeedbackDto lastFeedbackDto = this.lastFeedback;
        return hashCode + (lastFeedbackDto != null ? lastFeedbackDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        List<FeedbackSubtitleDto> list = this.subtitles;
        List<FeedbackReasonDto> list2 = this.reasons;
        LastFeedbackDto lastFeedbackDto = this.lastFeedback;
        StringBuilder r = xvz.r("ActionFeedbackDto(title=", str, ", subtitles=", list, ", reasons=");
        r.append(list2);
        r.append(", lastFeedback=");
        r.append(lastFeedbackDto);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
