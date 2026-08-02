package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PollUserAnswerChoiceDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/SubpollDto;", "", "questions", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollQuestionDto;", "rootQuestionId", "", "userChoices", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PollUserAnswerChoiceDto;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getQuestions", "()Ljava/util/List;", "getRootQuestionId", "()Ljava/lang/String;", "getUserChoices", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SubpollDto {
    private final List<PollQuestionDto> questions;
    private final String rootQuestionId;
    private final List<PollUserAnswerChoiceDto> userChoices;

    public SubpollDto(@Json(name = "questions") List<PollQuestionDto> list, @Json(name = "root_question_id") String str, @Json(name = "user_choices") List<PollUserAnswerChoiceDto> list2) {
        this.questions = list;
        this.rootQuestionId = str;
        this.userChoices = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubpollDto copy$default(SubpollDto subpollDto, List list, String str, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = subpollDto.questions;
        }
        if ((i & 2) != 0) {
            str = subpollDto.rootQuestionId;
        }
        if ((i & 4) != 0) {
            list2 = subpollDto.userChoices;
        }
        return subpollDto.copy(list, str, list2);
    }

    public final List<PollQuestionDto> component1() {
        return this.questions;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRootQuestionId() {
        return this.rootQuestionId;
    }

    public final List<PollUserAnswerChoiceDto> component3() {
        return this.userChoices;
    }

    public final SubpollDto copy(@Json(name = "questions") List<PollQuestionDto> questions, @Json(name = "root_question_id") String rootQuestionId, @Json(name = "user_choices") List<PollUserAnswerChoiceDto> userChoices) {
        return new SubpollDto(questions, rootQuestionId, userChoices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubpollDto)) {
            return false;
        }
        SubpollDto subpollDto = (SubpollDto) other;
        return jl40.l(this.questions, subpollDto.questions) && jl40.l(this.rootQuestionId, subpollDto.rootQuestionId) && jl40.l(this.userChoices, subpollDto.userChoices);
    }

    public final List<PollQuestionDto> getQuestions() {
        return this.questions;
    }

    public final String getRootQuestionId() {
        return this.rootQuestionId;
    }

    public final List<PollUserAnswerChoiceDto> getUserChoices() {
        return this.userChoices;
    }

    public int hashCode() {
        int b = unr0.b(this.questions.hashCode() * 31, 31, this.rootQuestionId);
        List<PollUserAnswerChoiceDto> list = this.userChoices;
        return b + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        List<PollQuestionDto> list = this.questions;
        String str = this.rootQuestionId;
        return ly3.s(xvz.s("SubpollDto(questions=", list, ", rootQuestionId=", str, ", userChoices="), this.userChoices, Extension.C_BRAKE);
    }
}
