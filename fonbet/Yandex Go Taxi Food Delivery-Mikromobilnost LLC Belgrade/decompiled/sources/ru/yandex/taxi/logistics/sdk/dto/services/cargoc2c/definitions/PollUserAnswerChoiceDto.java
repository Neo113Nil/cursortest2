package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PollUserAnswerChoiceDto;", "", "questionId", "", "answersIds", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getQuestionId", "()Ljava/lang/String;", "getAnswersIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PollUserAnswerChoiceDto {
    private final List<String> answersIds;
    private final String questionId;

    public PollUserAnswerChoiceDto(@Json(name = "question_id") String str, @Json(name = "answers_ids") List<String> list) {
        this.questionId = str;
        this.answersIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PollUserAnswerChoiceDto copy$default(PollUserAnswerChoiceDto pollUserAnswerChoiceDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pollUserAnswerChoiceDto.questionId;
        }
        if ((i & 2) != 0) {
            list = pollUserAnswerChoiceDto.answersIds;
        }
        return pollUserAnswerChoiceDto.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuestionId() {
        return this.questionId;
    }

    public final List<String> component2() {
        return this.answersIds;
    }

    public final PollUserAnswerChoiceDto copy(@Json(name = "question_id") String questionId, @Json(name = "answers_ids") List<String> answersIds) {
        return new PollUserAnswerChoiceDto(questionId, answersIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollUserAnswerChoiceDto)) {
            return false;
        }
        PollUserAnswerChoiceDto pollUserAnswerChoiceDto = (PollUserAnswerChoiceDto) other;
        return jl40.l(this.questionId, pollUserAnswerChoiceDto.questionId) && jl40.l(this.answersIds, pollUserAnswerChoiceDto.answersIds);
    }

    public final List<String> getAnswersIds() {
        return this.answersIds;
    }

    public final String getQuestionId() {
        return this.questionId;
    }

    public int hashCode() {
        return this.answersIds.hashCode() + (this.questionId.hashCode() * 31);
    }

    public String toString() {
        return nnm.h("PollUserAnswerChoiceDto(questionId=", this.questionId, ", answersIds=", Extension.C_BRAKE, this.answersIds);
    }
}
