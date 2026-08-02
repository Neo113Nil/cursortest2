package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002#$B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0003\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0003\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollQuestionDto;", "", "id", "", "choicesType", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollQuestionDto$ChoicesTypeDto;", "text", "answers", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollQuestionAnswerDto;", "answersAlignment", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollQuestionDto$AnswersAlignmentDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollQuestionDto$ChoicesTypeDto;Ljava/lang/String;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollQuestionDto$AnswersAlignmentDto;)V", "getId", "()Ljava/lang/String;", "getChoicesType", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollQuestionDto$ChoicesTypeDto;", "getText", "getAnswers", "()Ljava/util/List;", "getAnswersAlignment", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollQuestionDto$AnswersAlignmentDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ChoicesTypeDto", "AnswersAlignmentDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PollQuestionDto {
    private final List<PollQuestionAnswerDto> answers;
    private final AnswersAlignmentDto answersAlignment;
    private final ChoicesTypeDto choicesType;
    private final String id;
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollQuestionDto$AnswersAlignmentDto;", "", "<init>", "(Ljava/lang/String;I)V", "TRAIL", "BOTTOM", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnswersAlignmentDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AnswersAlignmentDto[] $VALUES;

        @Json(name = "trail")
        public static final AnswersAlignmentDto TRAIL = new AnswersAlignmentDto("TRAIL", 0);

        @Json(name = "bottom")
        public static final AnswersAlignmentDto BOTTOM = new AnswersAlignmentDto("BOTTOM", 1);

        private static final /* synthetic */ AnswersAlignmentDto[] $values() {
            return new AnswersAlignmentDto[]{TRAIL, BOTTOM};
        }

        static {
            AnswersAlignmentDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private AnswersAlignmentDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static AnswersAlignmentDto valueOf(String str) {
            return (AnswersAlignmentDto) Enum.valueOf(AnswersAlignmentDto.class, str);
        }

        public static AnswersAlignmentDto[] values() {
            return (AnswersAlignmentDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollQuestionDto$ChoicesTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "SINGLE", "MULTI", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ChoicesTypeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ChoicesTypeDto[] $VALUES;

        @Json(name = "single")
        public static final ChoicesTypeDto SINGLE = new ChoicesTypeDto("SINGLE", 0);

        @Json(name = "multi")
        public static final ChoicesTypeDto MULTI = new ChoicesTypeDto("MULTI", 1);

        private static final /* synthetic */ ChoicesTypeDto[] $values() {
            return new ChoicesTypeDto[]{SINGLE, MULTI};
        }

        static {
            ChoicesTypeDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ChoicesTypeDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ChoicesTypeDto valueOf(String str) {
            return (ChoicesTypeDto) Enum.valueOf(ChoicesTypeDto.class, str);
        }

        public static ChoicesTypeDto[] values() {
            return (ChoicesTypeDto[]) $VALUES.clone();
        }
    }

    public /* synthetic */ PollQuestionDto(String str, ChoicesTypeDto choicesTypeDto, String str2, List list, AnswersAlignmentDto answersAlignmentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, choicesTypeDto, str2, list, (i & 16) != 0 ? AnswersAlignmentDto.BOTTOM : answersAlignmentDto);
    }

    public static /* synthetic */ PollQuestionDto copy$default(PollQuestionDto pollQuestionDto, String str, ChoicesTypeDto choicesTypeDto, String str2, List list, AnswersAlignmentDto answersAlignmentDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pollQuestionDto.id;
        }
        if ((i & 2) != 0) {
            choicesTypeDto = pollQuestionDto.choicesType;
        }
        if ((i & 4) != 0) {
            str2 = pollQuestionDto.text;
        }
        if ((i & 8) != 0) {
            list = pollQuestionDto.answers;
        }
        if ((i & 16) != 0) {
            answersAlignmentDto = pollQuestionDto.answersAlignment;
        }
        AnswersAlignmentDto answersAlignmentDto2 = answersAlignmentDto;
        String str3 = str2;
        return pollQuestionDto.copy(str, choicesTypeDto, str3, list, answersAlignmentDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final ChoicesTypeDto getChoicesType() {
        return this.choicesType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<PollQuestionAnswerDto> component4() {
        return this.answers;
    }

    /* renamed from: component5, reason: from getter */
    public final AnswersAlignmentDto getAnswersAlignment() {
        return this.answersAlignment;
    }

    public final PollQuestionDto copy(@Json(name = "id") String id, @Json(name = "choices_type") ChoicesTypeDto choicesType, @Json(name = "text") String text, @Json(name = "answers") List<PollQuestionAnswerDto> answers, @Json(name = "answers_alignment") AnswersAlignmentDto answersAlignment) {
        return new PollQuestionDto(id, choicesType, text, answers, answersAlignment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollQuestionDto)) {
            return false;
        }
        PollQuestionDto pollQuestionDto = (PollQuestionDto) other;
        return jl40.l(this.id, pollQuestionDto.id) && this.choicesType == pollQuestionDto.choicesType && jl40.l(this.text, pollQuestionDto.text) && jl40.l(this.answers, pollQuestionDto.answers) && this.answersAlignment == pollQuestionDto.answersAlignment;
    }

    public final List<PollQuestionAnswerDto> getAnswers() {
        return this.answers;
    }

    public final AnswersAlignmentDto getAnswersAlignment() {
        return this.answersAlignment;
    }

    public final ChoicesTypeDto getChoicesType() {
        return this.choicesType;
    }

    public final String getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.answersAlignment.hashCode() + unr0.c(unr0.b((this.choicesType.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.text), 31, this.answers);
    }

    public String toString() {
        String str = this.id;
        ChoicesTypeDto choicesTypeDto = this.choicesType;
        String str2 = this.text;
        List<PollQuestionAnswerDto> list = this.answers;
        AnswersAlignmentDto answersAlignmentDto = this.answersAlignment;
        StringBuilder sb = new StringBuilder("PollQuestionDto(id=");
        sb.append(str);
        sb.append(", choicesType=");
        sb.append(choicesTypeDto);
        sb.append(", text=");
        tse0.x(str2, ", answers=", ", answersAlignment=", sb, list);
        sb.append(answersAlignmentDto);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public PollQuestionDto(@Json(name = "id") String str, @Json(name = "choices_type") ChoicesTypeDto choicesTypeDto, @Json(name = "text") String str2, @Json(name = "answers") List<PollQuestionAnswerDto> list, @Json(name = "answers_alignment") AnswersAlignmentDto answersAlignmentDto) {
        this.id = str;
        this.choicesType = choicesTypeDto;
        this.text = str2;
        this.answers = list;
        this.answersAlignment = answersAlignmentDto;
    }
}
