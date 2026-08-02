package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/QuestionChoiceDto;", "", "id", "", "text", "answers", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/AnswerChoiceDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getText", "getAnswers", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class QuestionChoiceDto {
    private final List<AnswerChoiceDto> answers;
    private final String id;
    private final String text;

    public QuestionChoiceDto(@Json(name = "id") String str, @Json(name = "text") String str2, @Json(name = "answers") List<AnswerChoiceDto> list) {
        this.id = str;
        this.text = str2;
        this.answers = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuestionChoiceDto copy$default(QuestionChoiceDto questionChoiceDto, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = questionChoiceDto.id;
        }
        if ((i & 2) != 0) {
            str2 = questionChoiceDto.text;
        }
        if ((i & 4) != 0) {
            list = questionChoiceDto.answers;
        }
        return questionChoiceDto.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<AnswerChoiceDto> component3() {
        return this.answers;
    }

    public final QuestionChoiceDto copy(@Json(name = "id") String id, @Json(name = "text") String text, @Json(name = "answers") List<AnswerChoiceDto> answers) {
        return new QuestionChoiceDto(id, text, answers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionChoiceDto)) {
            return false;
        }
        QuestionChoiceDto questionChoiceDto = (QuestionChoiceDto) other;
        return jl40.l(this.id, questionChoiceDto.id) && jl40.l(this.text, questionChoiceDto.text) && jl40.l(this.answers, questionChoiceDto.answers);
    }

    public final List<AnswerChoiceDto> getAnswers() {
        return this.answers;
    }

    public final String getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.answers.hashCode() + unr0.b(this.id.hashCode() * 31, 31, this.text);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.text;
        return ly3.s(b64.v("QuestionChoiceDto(id=", str, ", text=", str2, ", answers="), this.answers, Extension.C_BRAKE);
    }
}
